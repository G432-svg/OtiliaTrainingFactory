package lessonPackage.repositories;

import lessonPackage.data.Lesson;
import lessonPackage.data.ShoppingCart;
import lessonPackage.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Integer> {
    ShoppingCart findByUser(User user);
}
