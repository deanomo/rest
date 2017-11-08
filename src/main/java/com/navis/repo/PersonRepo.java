package com.navis.repo;

import com.navis.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by bursode on 11/1/2017.
 */
@Repository
public class PersonRepo {

    private static final String KEY = "navis";

    // inject the actual template
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    // inject the template as ListOperations
    // can also inject as Value, Set, ZSet, and HashOperations
    @Resource(name="redisTemplate")
    private HashOperations<String, String, Person> hashOps;

    public void savePerson(final Person inPerson) {
        hashOps.put(KEY, inPerson.getId(), inPerson);
    }

    public Person findPerson(final String inId) {
        return (Person) hashOps.get(KEY, inId);
    }
}
