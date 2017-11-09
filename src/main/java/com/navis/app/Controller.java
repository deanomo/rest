package com.navis.app;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.navis.entities.Person;
import com.navis.entities.Name;
import com.navis.entities.Ufv;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import com.navis.repo.PersonRepo;


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
    public ResponseEntity<Name> getName(@RequestParam(value="given", defaultValue="World") String given) {
        List<String> names = new ArrayList<String>();
        names.add(given);
        Name name = new Name();
        name.setGiven(names);
        return new ResponseEntity<Name>(name, HttpStatus.OK);
    }

    @RequestMapping(value = "/person")
    public ResponseEntity<Person> get(@RequestParam(value="id", defaultValue = "0") String id) {
        Person person = new Person();
        person.setId(id);
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }


    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public ResponseEntity<Person> postPerson(@RequestBody Person person) {
        if (person != null) {
            person.getName().setPrefix("Mr.");
        }
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }


    @RequestMapping(value = "/people", method = RequestMethod.POST)
    public ResponseEntity<List<Person>> postPeople(@RequestBody List<Person> people) {
        if (people != null) {
            people.stream().forEach(p ->p.getName().setPrefix("Honorable"));
        }
        return new ResponseEntity<List<Person>>(people, HttpStatus.OK);
    }

    @RequestMapping(value = "/ufv", method = RequestMethod.POST)
    public ResponseEntity<Ufv> postPerson(@RequestBody Ufv inUfv) {
        if (inUfv != null) {

        }
        return new ResponseEntity<Ufv>(inUfv, HttpStatus.OK);
    }
}
