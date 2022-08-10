package com.modeln.myopenapiplanet.api;

import com.jsonapi.dto.User;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public class UserApiImpl {//implements UserApi{

    //@Override
    public ResponseEntity<User> createUser(@ApiParam(value = "Create a user", required = true) @Valid @RequestBody User user){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
