package com.navis.app;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import com.navis.entities.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private SimpleDateFormat _dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);

//    @Autowired
//    public  void setRepo(PersonRepo inRepo) {
//        repo = inRepo;
//    }
//
//    PersonRepo repo;


    @RequestMapping("/name")
    public ResponseEntity<String> getName(@RequestParam(value="name", defaultValue="World") String name) {
        return new ResponseEntity<String>(String.format(template, name), HttpStatus.OK);
    }

    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public ResponseEntity<TimingData> postData(@RequestBody ObjectWrapper[] inData, @RequestHeader("Date") Date inDate) {
        _dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        long currentTime = System.currentTimeMillis();

        // get posted TimingData object
        Optional<TimingData> timeMap = Arrays.stream(inData)
                .filter(t -> t.getType()==TimingData.class)
                .map(t -> t.getObjects().get(0))
                .map(TimingData.class::cast)
                .findFirst();
        TimingData time = timeMap.orElse(TimingData.getNewInstance());

        // post inflight time is calculated from post header Data and current time
        time.put("post inflight time", currentTime - inDate.getTime());

        // create a response header with Date
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Date", _dateFormat.format(new Date()));
        return new ResponseEntity<TimingData>(time, responseHeaders, HttpStatus.OK);
    }

    @RequestMapping(value = "/payload", method = RequestMethod.POST)
    public ResponseEntity<Payload> postPayload(@RequestBody Payload inData, @RequestHeader("Date") Date inDate) {
        return new ResponseEntity<Payload>(inData, HttpStatus.OK);
    }
}
