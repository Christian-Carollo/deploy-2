package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping(value = "/basic")
public class BasicController {

    Random random = new Random();

    @GetMapping("/sum")
    public int getSum(){
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = a + b;

        return c;
    }
}
