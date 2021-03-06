package messageKafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * Class messageProducer
 */
public class messageProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Value(value = "${delivery.topic.name}")
	private String topicName;

	public messageProducer() {
	}

	public void sendMessage(String uu, String message) {
		kafkaTemplate.send(topicName, message);
	}
}
