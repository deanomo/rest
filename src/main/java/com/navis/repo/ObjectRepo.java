package com.navis.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by bursode on 11/1/2017.
 */
@Repository
public class ObjectRepo {

    private static final String KEY = "navis";

    // inject the actual template
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    // inject the template as ListOperations
    // can also inject as Value, Set, ZSet, and HashOperations
    @Resource(name="redisTemplate")
    private HashOperations<String, String, Object> hashOps;

    public void savePerson(final Object inObject) {
        hashOps.put(KEY, inObject.toString(), inObject);
    }

    public Object findObject(final String inId) {
        return (Object) hashOps.get(KEY, inId);
    }
}
