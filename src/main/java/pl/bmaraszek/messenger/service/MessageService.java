package pl.bmaraszek.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import pl.bmaraszek.messenger.database.Database;
import pl.bmaraszek.messenger.model.Message;
import pl.bmaraszek.messenger.model.Message.Author;
import pl.bmaraszek.messenger.model.Message.MessageText;

public class MessageService {

    private Map<Long, Message> messages = Database.getMessages();
    
    public MessageService(){
        messages.put(1L, new Message(1, new MessageText("text 1"), new Date(), new Author("Bartek")));
        messages.put(2L, new Message(2, new MessageText("text 1"), new Date(), new Author("Bob")));
        messages.put(3L, new Message(3, new MessageText("text 1"), new Date(), new Author("Alice")));
    }

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
