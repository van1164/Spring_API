package springrestapi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springrestapi.demo.entity.User;


@Repository
public class UserRepository extends JpaRepository<User, Long> {


}
