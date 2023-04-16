package com.shubh.kafka.constants;

import org.springframework.stereotype.Component;

@Component
public class KafkaConstants {
    public static final String KAFKA_TOPIC = "testtopic1";
    public static final String GROUP_ID = "djordje";
    public static final String KAFKA_BROKER = "192.168.200.209:9093";
	
//	public static final String KAFKA_TOPIC = "mc-srv-watchdog";
//    public static final String GROUP_ID = "test";
//    public static final String KAFKA_BROKER = "192.168.126.124:9092,192.168.126.125:9092,192.168.126.126:9092";
}
