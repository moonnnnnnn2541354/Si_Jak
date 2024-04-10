package org.example.sijak.domain.user.entity;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;
import org.example.sijak.global.meta.UserRole;
import org.example.sijak.global.meta.UserType;

@Entity
@RequiredArgsConstructor
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String email;
    private String userName;
    private String password;
    private String companyName;
    private String companyImg;
    private String tel;
    private UserType userType;
    private UserRole userRole;


}
