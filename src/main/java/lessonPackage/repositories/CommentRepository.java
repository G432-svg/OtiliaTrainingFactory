package lessonPackage.repositories;
import lessonPackage.data.Comment;
import lessonPackage.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findByUser(User user);
}
