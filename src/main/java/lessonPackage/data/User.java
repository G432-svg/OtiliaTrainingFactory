package lessonPackage.data;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String passWord;
    @OneToOne(cascade = CascadeType.PERSIST)
    private ShoppingCart shoppingCart;
    @OneToOne(mappedBy = "user")
    private Contact contact;
    @OneToOne
    private Lesson lesson;



    public User() {
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public User(String userName, String passWord, ShoppingCart shoppingCart, Contact contact, Lesson lesson) {
        this.userName = userName;
        this.passWord = passWord;
        this.shoppingCart = shoppingCart;
        this.contact = contact;
        this.lesson = lesson;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
