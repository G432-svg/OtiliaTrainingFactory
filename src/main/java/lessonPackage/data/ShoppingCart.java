package lessonPackage.data;

import javax.persistence.*;
import java.util.List;

@Entity
public class ShoppingCart{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToMany
    private List<Lesson> lessons;

    public ShoppingCart() {
    }

    public ShoppingCart(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}