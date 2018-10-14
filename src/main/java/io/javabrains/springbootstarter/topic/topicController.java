package io.javabrains.springbootstarter.topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class topicController extends Topic{

    // Gets converted to JSON automatically
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("beckham", "5134", "sure"),
                new Topic("ok", "sda", "sada")
        );
    }
}
