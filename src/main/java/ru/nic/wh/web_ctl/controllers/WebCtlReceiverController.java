package ru.nic.wh.web_ctl.controllers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import ru.nic.wh.web_ctl.domain.SubTask;

@Component
public class WebCtlReceiverController {

	@RabbitListener(queues = "testQueue")
	public void receive(SubTask task) {
		System.out.println(" [x] Received '" + task + "'");
	}

}
