package guru.springframework.controllers;

import guru.springframework.converters.UserMapper;
import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

/**
 * Created by jt on 2018-12-16.
 */
public class UserController {

    User saveUser(UserCommand command) {

        // fake impl
        return UserMapper.INSTANCE.userCommandToUser(command);
    }

}
