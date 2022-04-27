package lessonPackage.data;

import javax.persistence.*;
import java.util.List;

@Entity
public class Lesson {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "lesson")
    private List<Comment> comments;
    private String imageLocation;
    private double price;
    @OneToOne(mappedBy = "lesson")
    private User user;
    @ManyToOne
    private Trainer trainer;
    @OneToOne(mappedBy = "lesson")
    private ShoppingCart shoppingCart;

    public Lesson() {

    }

    public Lesson(String name, String imageLocation, double price) {
        this.name = name;
        this.imageLocation = imageLocation;
        this.price = price;
    }

    public Lesson(String name, List<Comment> comments, String imageLocation, double price, User user, Trainer trainer, ShoppingCart shoppingCart) {
        this.name = name;
        this.comments = comments;
        this.imageLocation = imageLocation;
        this.price = price;
        this.user = user;
        this.trainer = trainer;
        this.shoppingCart = shoppingCart;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }


    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
