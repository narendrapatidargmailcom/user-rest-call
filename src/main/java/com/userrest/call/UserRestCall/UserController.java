package com.userrest.call.UserRestCall;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userrest.call.UserRestCall.model.User;
import com.userrest.call.UserRestCall.model.UserResponse;

@RestController
public class UserController {
    @Autowired
    private UserClient userClient;

    @GetMapping("/users")
    public List<UserResponse> getUsers() {
        List<User> user= userClient.getUser();
        
        List<UserResponse> userResponses = user.stream().map(originalUser -> {
            UserResponse userres = new UserResponse();
            userres.setId(originalUser.getId());
            userres.setName(originalUser.getName());
            userres.setLat(originalUser.getAddress().getGeo().getLat());
            userres.setLng(originalUser.getAddress().getGeo().getLng());
            return userres; 
        }).collect(Collectors.toList());
		return  userResponses;
      
    }
}