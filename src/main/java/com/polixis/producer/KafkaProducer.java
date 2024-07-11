package com.polixis.producer;

/**
 * Vardan Tevosyan
 */
public interface KafkaProducer<Data> {
    void sendMessage(Data message);
}
