package pl.bmaraszek.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Message {

    private long id;
    private String message;
    private Date created;
    private String author;
    
    /**
     * For JAXB only:
     */
    public Message(){
        this.id = 0;
        message = "Invalid";
        created = null;
        author = "Invalid";
    }
    
    public Message(long id, String message, Date created, String author){
        this.id = id;
        this.message = message;
        this.created = created;
        this.author = author;
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class MessageText{
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
    
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Author{
        private String name;
        
        public Author(String author){
            this.name = author;
        }
        
        public String getAuthor(){
            return name;
        }
        
        public String toString(){
            return name;
        }
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getCreated() {
        return created;
    }

    public String getAuthor() {
        return author;
    }

    public String toString(){
        return "Message{ id : " + id + ", message : " + message + ", created : " + created + ", author : " + author + " }"; 
    }
    
}
