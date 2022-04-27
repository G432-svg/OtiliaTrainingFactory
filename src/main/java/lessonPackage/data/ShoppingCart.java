package lessonPackage.data;

import javax.persistence.*;
import java.util.List;

@Entity
public class ShoppingCart{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    private Lesson lesson;
    @OneToOne
    private User user;

    public ShoppingCart() {
    }

    public ShoppingCart(Lesson lesson, User user) {
        this.lesson = lesson;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
}