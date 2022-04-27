package lessonPackage.data;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String phoneNumber;
    @Email(message = "Not a valid email!")
    private String eMail;
    @OneToOne
    private Trainer trainer;
    @OneToOne
    private User user;

    public Contact() {
    }

    public Contact(String phoneNumber, String eMail, Trainer trainer, User user) {
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.trainer = trainer;
        this.user = user;
    }

    public Contact(String phoneNumber, String eMail) {
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
