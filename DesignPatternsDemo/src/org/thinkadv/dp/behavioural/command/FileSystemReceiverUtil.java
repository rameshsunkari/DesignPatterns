package org.thinkadv.dp.behavioural.command;

public class FileSystemReceiverUtil {

	public static FileSystemReceiver getUnderlyingFileSystem() {
		String osName = System.getProperty("os.name");
		System.out.println("Underlying OS is:" + osName);
		if (osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		} else if (osName.contains("Linux")) {
			return new UnixFileSystemReceiver();
		} else if (osName.contains("Mac")) {
			return new MacFileSystemReceiver();
		} else {
			return null;
		}

	}
}