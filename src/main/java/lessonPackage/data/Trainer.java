package lessonPackage.data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class Trainer{
    @Id
    @GeneratedValue
    private Integer id;
    @NotEmpty
    @NotBlank(message = "Name can't be left blank!")
    private String name;
    private String imageLocation;
    @OneToOne(mappedBy = "trainer")
    private Contact contact;
    @OneToMany
    private List<Lesson> lessons;


    public Trainer() {
    }


    public Trainer(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public Trainer(String name, String imageLocation, Contact contact, List<Lesson> lessons) {
        this.name = name;
        this.imageLocation = imageLocation;
        this.contact = contact;
        this.lessons = lessons;
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

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}
