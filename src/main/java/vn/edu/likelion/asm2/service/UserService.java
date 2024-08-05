package vn.edu.likelion.asm2.service;

import vn.edu.likelion.asm2.entity.UserEntity;

public interface UserService extends BaseCRUD<UserEntity> {
    
    UserEntity findByUsername(String username);

}
