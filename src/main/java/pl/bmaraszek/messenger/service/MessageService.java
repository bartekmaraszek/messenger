package pl.bmaraszek.messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import pl.bmaraszek.messenger.model.Message;

public class MessageService {

    public List<Message> getAllMessages(){
        ArrayList<Message> result = new ArrayList<Message>();
        Calendar c = Calendar.getInstance();
        
        c.set(2015, Calendar.MAY, 5);
        result.add(new Message(1, new Message.MessageText("text 1"), c.getTime(), new Message.Author("Bartek")));
        
        c.set(Calendar.DAY_OF_MONTH, 6);
        result.add(new Message(2, new Message.MessageText("text 2"), c.getTime(), new Message.Author("Bob")));
        
        c.set(Calendar.DAY_OF_MONTH, 7);
        result.add(new Message(3, new Message.MessageText("text 3"), c.getTime(), new Message.Author("Alice")));
        
        return result;
    }
}
