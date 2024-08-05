package vn.edu.likelion.asm2.customAnotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.likelion.asm2.configuration.SessionConfig;
import vn.edu.likelion.asm2.model.ErrorHandler;

@Aspect
@Component
public class CheckLoginAspect {

    @Autowired
    private SessionConfig sessionConfig;
    @Before("@within(CheckLogin) || @annotation(CheckLogin)")
    public void checkLogin(JoinPoint joinPoint) {
        CheckLogin checkLogin = null;

        // Kiểm tra nếu annotation được đặt trên phương thức
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        if (methodSignature.getMethod().isAnnotationPresent(CheckLogin.class)) {
            checkLogin = methodSignature.getMethod().getAnnotation(CheckLogin.class);
        }

        // Nếu không tìm thấy annotation trên phương thức, kiểm tra trên lớp
        if (checkLogin == null) {
            Class<?> targetClass = joinPoint.getTarget().getClass();
            if (targetClass.isAnnotationPresent(CheckLogin.class)) {
                checkLogin = targetClass.getAnnotation(CheckLogin.class);
            }
        }

        // Logic kiểm tra đăng nhập
        if (sessionConfig.getUserEntity() == null) {
            System.out.println("Ban chua dang nhap");
            throw new ErrorHandler("User is not logged in");
        }

        // Bạn cũng có thể sử dụng key trong annotation nếu cần thiết
        String key = checkLogin.key();
        // Thực hiện thêm các kiểm tra dựa trên key nếu cần
    }
}
