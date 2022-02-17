package lessonPackage.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Lesson {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String trainerId;
    @OneToMany(mappedBy = "lesson")
    private List<Comment> comments;
    private String imageLocation;
    private double price;


    public Lesson() {
    }

    public Lesson(Integer id, String name, String trainerId, List<Comment> comments, String imageLocation, double price) {
        this.id = id;
        this.name = name;
        this.trainerId = trainerId;
        this.comments = comments;
        this.imageLocation = imageLocation;
        this.price = price;
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

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
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
}
