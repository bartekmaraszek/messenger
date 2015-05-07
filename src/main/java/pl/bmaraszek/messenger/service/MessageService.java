package pl.bmaraszek.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pl.bmaraszek.messenger.model.Message;

public class MessageService {

    public List<Message> getMessages(){
        ArrayList<Message> result = new ArrayList<Message>();
        result.add(new Message(1, new Message.MessageText("text 1"), new Date(), new Message.Author("Bartek")));
        result.add(new Message(2, new Message.MessageText("text 2"), new Date(), new Message.Author("Bob")));
        result.add(new Message(3, new Message.MessageText("text 3"), new Date(), new Message.Author("Alice")));
        return result;
    }
}
