package ru.nic.wh.web_ctl.domain;

import java.util.List;

public class Task {

	private long id;
	private int stepInTask;
	private int lastStepInTask;
	private List<SubTask> subTasks;

	public Task() {
	}

	public int getStepInTask() {
		return stepInTask;
	}

	public void setStepInTask(int stepInTask) {
		this.stepInTask = stepInTask;
	}

	public long getId() {
		return id;
	}

	public int getLastStepInTask() {
		return lastStepInTask;
	}

	public List<SubTask> getSubTasks() {
		return subTasks;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", stepInTask=" + stepInTask + ", lastStepInTask=" + lastStepInTask + ", subTasks="
				+ subTasks + "]";
	}
}
