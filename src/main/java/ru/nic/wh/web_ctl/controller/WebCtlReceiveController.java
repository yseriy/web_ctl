package ru.nic.wh.web_ctl.controller;

import javax.validation.Valid;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import ru.nic.wh.web_ctl.domain.Task;

@Component
public class WebCtlReceiveController {

	@RabbitListener(queues = "testQueue")
	public void processTask(@Valid @Payload Task task) {
		System.out.println(" [x] Received '" + task + "'");
	}
}
