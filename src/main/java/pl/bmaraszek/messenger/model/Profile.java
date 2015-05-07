package pl.bmaraszek.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Profile {

    private long id;
    private ProfileName profileName;
    private FirstName firstName;
    private LastName lastName;
    private Date created;

    public Profile() {

    }

    public Profile(ProfileName profileName, FirstName firstName, LastName lastName, Date created) {
        this.profileName = profileName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.created = created;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ProfileName {
        private String value;

        public ProfileName(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String toString() {
            return "ProfileName{ value : " + value + " }";
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class FirstName {
        private String value;

        public FirstName(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String toString() {
            return "FirstName{ value : " + value + " }";
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class LastName {
        private String value;

        public LastName(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String toString() {
            return "LastName{ value : " + value + " }";
        }
    }

    public long getId() {
        return id;
    }

    public ProfileName getProfileName() {
        return profileName;
    }

    public FirstName getFirstName() {
        return firstName;
    }

    public LastName getLastName() {
        return lastName;
    }

    public Date getCreated() {
        return created;
    }

    public String toString() {
        return "Profile{ id : " + id + ", profileName : " + profileName + ", firstName : " + firstName
                + ", lastName :" + lastName + ", created : " + created + " }";
    }
}
