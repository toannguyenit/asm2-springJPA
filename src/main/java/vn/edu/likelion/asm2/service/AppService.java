package vn.edu.likelion.asm2.service;

import vn.edu.likelion.asm2.entity.UserEntity;

public interface AppService {
    UserEntity login(String username, String password);
}
