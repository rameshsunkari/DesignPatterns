package org.thinkadv.dp.behavioural.command;

public class CloseFileCommand implements Order {

	private FileSystemReceiver fileSystem;
    
    public CloseFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }

}
