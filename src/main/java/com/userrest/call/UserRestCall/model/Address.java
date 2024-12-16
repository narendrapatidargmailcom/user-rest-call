package com.userrest.call.UserRestCall.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Address {
	 private String street;
     private String suite;
     private String city;
     private String zipcode;
     private Geo geo;
}
