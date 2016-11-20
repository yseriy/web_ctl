package ru.nic.wh.web_ctl.domain;

public class Task {

	private final long id;
	private final long lastStepInTask;
	private long stepInTask;

	public Task(long id, long lastStepInTask, long stepInTask) {
		this.id = id;
		this.lastStepInTask = lastStepInTask;
		this.stepInTask = stepInTask;
	}

	public long getStepInTask() {
		return stepInTask;
	}

	public void setStepInTask(long stepInTask) {
		this.stepInTask = stepInTask;
	}

	public long getId() {
		return id;
	}

	public long getLastStepInTask() {
		return lastStepInTask;
	}
}
