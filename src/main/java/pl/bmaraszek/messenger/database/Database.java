package pl.bmaraszek.messenger.database;

import java.util.HashMap;
import java.util.Map;

import pl.bmaraszek.messenger.model.Message;
import pl.bmaraszek.messenger.model.Profile;

public class Database {

    private static Map<Long, Message> messages = new HashMap<Long, Message>();
    private static Map<Long, Profile> profiles = new HashMap<Long, Profile>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<Long, Profile> getProfiles() {
        return profiles;
    }
}
