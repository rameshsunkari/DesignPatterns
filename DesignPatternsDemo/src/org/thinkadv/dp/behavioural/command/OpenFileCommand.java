package org.thinkadv.dp.behavioural.command;

public class OpenFileCommand implements Order {

	private FileSystemReceiver fileSystem;

	public OpenFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}

	@Override
	public void execute() {
		// open command is forwarding request to openFile method
		this.fileSystem.openFile();
	}

}
