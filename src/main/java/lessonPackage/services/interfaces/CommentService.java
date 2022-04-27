package lessonPackage.services.interfaces;

import lessonPackage.data.Comment;
import lessonPackage.data.Contact;

import java.util.List;

public interface CommentService {

    List<Comment> getAllComments();
    void addComment(Comment comment);
    Comment getOneComment(int id);
}
