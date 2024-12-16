package com.userrest.call.UserRestCall;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.userrest.call.UserRestCall.model.User;


@FeignClient(name = "userClient", url = "https://jsonplaceholder.typicode.com")
public interface UserClient {
   
	 @GetMapping("/users")
	  public List<User> getUser();
}
