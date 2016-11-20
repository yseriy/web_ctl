package ru.nic.wh.web_ctl.domain;

public class SubTask {

	private long id;
	private String address;
	private String command;
	private String args;

	public SubTask() {
	}

	public SubTask(long id, String address, String command, String args) {
		this.id = id;
		this.address = address;
		this.command = command;
		this.args = args;
	}

	public long getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getCommand() {
		return command;
	}

	public String getArgs() {
		return args;
	}

	@Override
	public String toString() {
		return "SubTask [id=" + id + ", address=" + address + ", command=" + command + ", args=" + args + "]";
	}
}
