package core.service;


import core.model.User;
import java.util.List;

public interface UserService {
    void add(User user);
    
    List<User> listUsers();
}
