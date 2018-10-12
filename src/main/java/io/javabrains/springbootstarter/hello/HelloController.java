package io.javabrains.springbootstarter.hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public int hello(){
        int j = 0;
        for (int i = 0; i < 10; i++) {
            j += i;
        }
        return j;
    }
}
