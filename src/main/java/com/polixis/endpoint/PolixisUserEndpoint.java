package com.polixis.endpoint;

import com.polixis.models.UserRequest;
import com.polixis.producer.KafkaProducer;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Vardan Tevosyan
 */
@RestController
@RequestMapping("/messages")
@AllArgsConstructor
public class PolixisUserEndpoint {

    private final KafkaProducer<UserRequest> producer;

    @PostMapping
    public ResponseEntity<Void> addMessage(@RequestBody UserRequest source) {
        producer.sendMessage(source);
        return ResponseEntity.accepted().build();
    }
}
