package vn.edu.likelion.asm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.likelion.asm2.entity.UserEntity;
import vn.edu.likelion.asm2.service.AppService;
import vn.edu.likelion.asm2.service.UserService;

@Service
public class AppServiceImpl implements AppService {
    @Autowired
    private UserService userService;
    
    @Override
    public UserEntity login(String username, String password) {
        UserEntity userEntity = userService.findByUsername(username);
        if (userEntity == null) {
            return null;
        }
        if (!userEntity.getPassword().equals(password)) {
            return null;
        }
        return userEntity;
    }
}
