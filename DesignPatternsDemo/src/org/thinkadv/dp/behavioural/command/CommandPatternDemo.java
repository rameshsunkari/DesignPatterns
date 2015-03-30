package org.thinkadv.dp.behavioural.command;

public class CommandPatternDemo {

	public static void main(String[] args) {
		executeStockModel();
		executeFileCommandModel();
	}

	private static void executeStockModel() {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
	
	private static void executeFileCommandModel() {
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
        
        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
         
        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);
         
        //perform action on invoker object
        file.execute();
         
        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();
         
        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
	}

}
