package vn.edu.likelion.asm2.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vn.edu.likelion.asm2.configuration.SessionConfig;
import vn.edu.likelion.asm2.customAnotation.CheckLogin;
import vn.edu.likelion.asm2.entity.UserEntity;
import vn.edu.likelion.asm2.model.ResponseModel;
import vn.edu.likelion.asm2.service.UserService;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin // Truy cap o moi noi
@CheckLogin
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SessionConfig sessionConfig;

    @PostMapping
    public UserEntity createUser(@RequestParam String username,
                                 @RequestParam String password) {

        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setPassword(password);
        return userService.create(userEntity);
    }

    @GetMapping
    public Iterator<UserEntity> getAllUsers() {
        return userService.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id) {
        UserEntity u = new UserEntity();
        u.setId(id);
        userService.delete(u);
        return ResponseEntity.status(HttpStatus.OK).body("delete successfully");
    }


    //    public ResponseEntity<?> createUser() {
//
//        UserEntity userEntity = new UserEntity();
//        userEntity.setUsername("songtoan");
//        userEntity.setPassword("123456");
//
//        return ResponseEntity.
//                status(HttpStatus.CREATED).
//                body(new ResponseModel(userService.create(userEntity)));
//    }

}
