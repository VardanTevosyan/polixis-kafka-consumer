package com.polixis.producer;

import com.polixis.models.UserRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Vardan Tevosyan
 */
@Service
public class KafkaProducerService implements KafkaProducer<UserRequest> {


    private final KafkaTemplate<String, UserRequest> kafkaTemplate;
    private final String topic;

    public KafkaProducerService(final KafkaTemplate<String, UserRequest> kafkaTemplate,
                                @Value("${polixis.kafka.topic}") String topic) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    @Override
    public void sendMessage(UserRequest message) {
        kafkaTemplate.send(this.topic, message);
    }
}
