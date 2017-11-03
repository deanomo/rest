package repo;

import entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * Created by bursode on 11/1/2017.
 */
@Repository
public class CarRepo {

    private static final String KEY = "navis";

    private RedisTemplate<String, Object> redisTemplate;
    private HashOperations hashOperations;

    @Autowired
    public CarRepo(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    private void init() {
        hashOperations = redisTemplate.opsForHash();
    }


    void saveCar(final Car inCar) {
        hashOperations.put(KEY, inCar.getVin(), inCar);
    }

    public Car findCar(final String carId) {
        return (Car) hashOperations.get(KEY, carId);
    }
}
