package org.thinkadv.dp.behavioural.command;

public class WriteFileCommand implements Order {

	private FileSystemReceiver fileSystem;
    
    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

}
