package vn.edu.likelion.asm2.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "tbl_users")
@Data
@Entity
@NoArgsConstructor // Tao constructer rong
@AllArgsConstructor // Tao constructer full argm
public class UserEntity extends BaseEntity {

    // Dong goi Entity thanh byte Gui entity cho web se nhanh hon
    private static final long serialVersionUID = 1L;

    @Column(unique = true, nullable = false)
    @NonNull
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private int type;

}
