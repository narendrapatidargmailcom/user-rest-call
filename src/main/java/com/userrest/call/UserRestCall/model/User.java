package com.userrest.call.UserRestCall.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
	 private Long id;
	    private String name;
	    private String username;
	    private String email;
	    private Address address;
	    private String phone;
	    private String website;
	    private Company company;
}
