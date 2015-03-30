package org.thinkadv.dp.behavioural.command;

public class FileInvoker {
	public Order command;

	public FileInvoker(Order c) {
		this.command = c;
	}

	public void execute() {
		this.command.execute();
	}
}
