package core.service.impl;

import core.dto.UserResponseDto;
import core.model.User;
import core.service.UserMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public UserResponseDto mapToDto(User user) {
        return new UserResponseDto(user.getName(), user.getEmail(), user.getAge());
    }
    
    @Override
    public User mapFromDto(UserResponseDto userRespDto) {
        return new User(userRespDto.getName(), userRespDto.getEmail(), userRespDto.getAge());
    }
}