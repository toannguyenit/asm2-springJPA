package vn.edu.likelion.asm2.configuration;

import org.springframework.stereotype.Component;
import vn.edu.likelion.asm2.entity.UserEntity;

@Component
public class SessionConfig {
    
    private UserEntity userEntity = null;

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
