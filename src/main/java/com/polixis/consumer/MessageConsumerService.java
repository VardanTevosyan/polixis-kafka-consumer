package com.polixis.consumer;

import com.polixis.entity.User;
import com.polixis.models.UserRequest;
import com.polixis.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Vardan Tevosyan
 */
@Service
@Transactional
@AllArgsConstructor
public class MessageConsumerService {

    private final UserRepository userRepository;

    @KafkaListener(topics = "#{'${polixis.kafka.topic}'}", groupId = "#{'${polixis.consumer.group}'}")
    public void acceptMessage(UserRequest data) {
        this.storeUser(data);
    }

    private void storeUser(UserRequest source) {
        User user = new User();
        user.setFirstName(source.getFirstName());
        user.setLastName(source.getLastName());
        user.setEmail(source.getEmail());
        this.userRepository.save(user);
    }

}
