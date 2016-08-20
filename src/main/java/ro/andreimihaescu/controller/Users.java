package ro.andreimihaescu.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.andreimihaescu.dto.UserRequest;
import ro.andreimihaescu.service.UserService;

@RestController
@RequestMapping("/users")
public class Users {

    @Autowired
    private UserService userService;

    private final static Logger LOGGER = Logger.getLogger(Users.class);

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Boolean createUser(@RequestBody UserRequest userRequest) {
        LOGGER.info(String.format("Attempted to create user %s on microservice", userRequest.getUsername()));
        return userService.createUser(userRequest.getUsername(), userRequest.getPassword());
    }
}
