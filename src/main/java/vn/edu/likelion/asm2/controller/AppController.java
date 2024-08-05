package vn.edu.likelion.asm2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.likelion.asm2.configuration.SessionConfig;
import vn.edu.likelion.asm2.entity.UserEntity;
import vn.edu.likelion.asm2.service.AppService;

@RestController
@RequestMapping("/api/app/")
public class AppController {

    @Autowired
    private AppService appService;

    @Autowired
    private SessionConfig sessionConfig;

    @RequestMapping("/login")
    public UserEntity login(@RequestParam String username,
                            @RequestParam String password) {
        UserEntity user = appService.login(username, password);
        if (user == null) {
            return null;
        }
        sessionConfig.setUserEntity(user);
        return user;
    }

    @RequestMapping("/logout")
    public void logout() {
        sessionConfig.setUserEntity(null);
    }

}
