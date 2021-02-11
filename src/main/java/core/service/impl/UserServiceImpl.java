package core.service.impl;

import core.dao.UserDao;
import core.model.User;
import core.service.UserService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public void add(User user) {
        userDao.add(user);
    }
    
    @Override
    public User get(Long id) {
        return userDao.get(id).orElseThrow();
    }
    
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
