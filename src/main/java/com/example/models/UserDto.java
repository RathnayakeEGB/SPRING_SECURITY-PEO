package com.example.models;

import com.example.entities.User;
import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class  UserDto {

    private String username;
    private String password;
    private String email;
    private String phone;
    private String name;
    private String businessTitle;

    public User getUserFromDto(){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);
        user.setName(name);
        user.setBusinessTitle(businessTitle);
        return user;
    }
}
