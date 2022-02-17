package lessonPackage.data;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    private Lesson lesson;
    private String words;
    private Date dayOfComment;
    @ManyToOne
    private User user;


    public Comment() {
    }

    public Comment(Integer id, Lesson lesson, String words, Date dayOfComment, User user) {
        this.id = id;
        this.lesson = lesson;
        this.words = words;
        this.dayOfComment = dayOfComment;
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

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public Date getDayOfComment() {
        return dayOfComment;
    }

    public void setDayOfComment(Date dayOfComment) {
        this.dayOfComment = dayOfComment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
