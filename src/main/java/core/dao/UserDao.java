package core.dao;

import core.model.User;
import java.util.List;

public interface UserDao {
    void add(User user);
    
    List<User> listUsers();
}
