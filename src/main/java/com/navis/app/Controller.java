package com.navis.app;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

import com.navis.entities.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

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
    public ResponseEntity<ObjectWrapper[]> postData(@RequestBody ObjectWrapper[] inData) {
//        Arrays.stream(inData)
//                .map(ow -> ow.getObjects())
//                .flatMap(Collection::stream)
//                .forEach(System.out::println);
        return new ResponseEntity<ObjectWrapper[]>(inData, HttpStatus.OK);
    }
}
