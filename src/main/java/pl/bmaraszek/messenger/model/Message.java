package pl.bmaraszek.messenger.model;

import java.util.Date;

public class Message {

    private long id;
    private MessageText message;
    private Date created;
    private Author author;
    
    public class MessageText{
        private String text;
        
        public MessageText(String text){
            this.text = text;
        }
        
        public String getText(){
            return text;
        }
        
        public String toString(){
            return text;
        }
    }
    
    public class Author{
        private String author;
        
        public Author(String author){
            this.author = author;
        }
        
        public String getAuthor(){
            return author;
        }
        
        public String toString(){
            return author;
        }
    }

    public long getId() {
        return id;
    }

    public MessageText getMessage() {
        return message;
    }

    public Date getCreated() {
        return created;
    }

    public Author getAuthor() {
        return author;
    }
    
    public String toString(){
        return "Message{ id : " + id + ", message : " + message + ", created : " + created + ", author : " + author + " }"; 
    }
    
}
