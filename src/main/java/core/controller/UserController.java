package core.controller;

import core.dto.UserResponseDto;
import core.model.User;
import core.service.UserMapper;
import core.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    private final UserService userService;
    private final UserMapper userMapperService;
    
    public UserController(UserService userService, UserMapper userMapperService) {
        this.userService = userService;
        this.userMapperService = userMapperService;
    }
    
    @GetMapping("/{userId}")
    public UserResponseDto getUser(@PathVariable Long userId) {
        return userMapperService.mapToDto(userService.get(userId).orElseThrow());
    }
    
    @GetMapping
    public List<UserResponseDto> getAll() {
        return userService.listUsers().stream()
                .map(userMapperService::mapToDto)
                .collect(Collectors.toList());
    }
    
    @GetMapping("/inject")
    public String inject() {
        userService.add(new User("User1", "User1@email.com", 101));
        userService.add(new User("User2", "User2@email.com", 102));
        userService.add(new User("User3", "User3@email.com", 103));
        userService.add(new User("User4", "User4@email.com", 104));
        return "Users were injected";
    }
}
