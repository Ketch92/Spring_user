package core;

import core.config.AppConfig;
import core.model.User;
import core.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        
        User user1 = new User("some", "some", 20);
        User user2 = new User("some1", "some1", 21);
        
        userService.add(user1);
        userService.add(user2);
        
        userService.listUsers().forEach(System.out::println);
    }
}
