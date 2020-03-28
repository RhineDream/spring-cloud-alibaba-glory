package top.glory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.glory.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {
}
