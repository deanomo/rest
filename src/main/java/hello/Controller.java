package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import entities.Car;
import entities.Greeting;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.PostConstruct;


@RestController
public class Controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();




    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping(value = "/car")
    public ResponseEntity<Car> get() {
        Car car = new Car();
        car.setColor("Blue");
        car.setMiles(100);
        car.setVin("1234");
        return new ResponseEntity<Car>(car, HttpStatus.OK);
    }


    @RequestMapping(value = "/car", method = RequestMethod.POST)
    public ResponseEntity<Car> update(@RequestBody Car car) {
        if (car != null) {
            car.setMiles(car.getMiles() + 100);
        }
        // TODO: call persistence layer to update
        return new ResponseEntity<Car>(car, HttpStatus.OK);
    }


    @RequestMapping(value = "/cars", method = RequestMethod.POST)
    public ResponseEntity<List<Car>> update(@RequestBody List<Car> cars) {
        if (cars != null) {
            cars.stream().forEach(c -> c.setMiles(c.getMiles() + 100));
        }
        // TODO: call persistence layer to update
        return new ResponseEntity<List<Car>>(cars, HttpStatus.OK);
    }
}
