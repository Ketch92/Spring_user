package core.service;

import core.dao.UserDao;
import core.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private final UserDao userDao;
    
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public void add(User user) {
        userDao.add(user);
    }
    
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
