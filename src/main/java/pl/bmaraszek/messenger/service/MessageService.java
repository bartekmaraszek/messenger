package pl.bmaraszek.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import pl.bmaraszek.messenger.database.Database;
import pl.bmaraszek.messenger.model.Message;

public class MessageService {

    private Map<Long, Message> messages = Database.getMessages();

    public List<Message> getAllMessages() {
        return new ArrayList<Message>(messages.values());
    }

    public Message getMessage(long id) {
        return messages.get(id);
    }

    public Message addMessage(Message message) {
        Message toAdd = new Message(message.getId() + 1, message.getMessage(), message.getCreated(), message.getAuthor());
        messages.put(toAdd.getId(), message);
        return toAdd;
    }

    public Message updateMessage(Message message) {
        if (message.getId() <= 0) {
            return null;
        }
        messages.put(message.getId(), message);
        return message;
    }
    
    public Message removeMessage(long id){
        return messages.remove(id);
    }
}
