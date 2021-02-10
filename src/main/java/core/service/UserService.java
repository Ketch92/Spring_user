package core.service;

import core.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    void add(User user);
    
    Optional<User> get(Long id);
    
    List<User> listUsers();
}
