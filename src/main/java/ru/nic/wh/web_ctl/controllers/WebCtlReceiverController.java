package ru.nic.wh.web_ctl.controllers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import ru.nic.wh.web_ctl.domain.Task;

@Component
public class WebCtlReceiverController {

	@RabbitListener(queues = "testQueue")
	public void receive(@Payload Task task) {
		System.out.println(" [x] Received '" + task + "'");
		// System.out.println(" [x] Received '" + task.getSubTaskByStep(1) +
		// "'");
	}
}
