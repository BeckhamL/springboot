package io.javabrains.springbootstarter.topic;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopicService {

    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("beckham", "5134", "sure"),
            new Topic("ok", "sda", "sada")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
