package org.thinkadv.dp.behavioural.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		//create subject
        MyTopic topic = new MyTopic();
         
        //create observers
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");
         
        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);
         
        //attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);
         
        //check if any update is available
        obj1.update();
         
        //now send message to subject
        topic.postMessage("New Message");
        
        topic.unregister(obj3);
        //check if any update is available
        obj3.update();
        
        //now send message to subject
        topic.postMessage("New Message after unregistering objserver 3");
        
        MyTopic topic2 = new MyTopic();
        
        topic2.register(obj3);
        obj3.setSubject(topic2);
        //check if any update is available
        obj3.update();
        
        //now send message to subject
        topic2.postMessage("New Message after regitering objserver 3 to topic 2");
        

	}

}
