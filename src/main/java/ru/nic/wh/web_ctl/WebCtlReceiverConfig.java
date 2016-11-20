package ru.nic.wh.web_ctl;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRabbit
public class WebCtlReceiverConfig {

	@Bean
	public Queue testQueue() {
		return new Queue("testQueue");
	}

	@Bean
	public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory() {
		SimpleRabbitListenerContainerFactory containerFactory = new SimpleRabbitListenerContainerFactory();
		containerFactory.setConnectionFactory(rabbitConnectionFactory());
		containerFactory.setMessageConverter(new Jackson2JsonMessageConverter());
		containerFactory.setConcurrentConsumers(3);
		containerFactory.setMaxConcurrentConsumers(10);
		return containerFactory;
	}

	@Bean
	public ConnectionFactory rabbitConnectionFactory() {
		CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost");
		connectionFactory.setUsername("guest");
		connectionFactory.setPassword("guest");
		return connectionFactory;
	}
}
