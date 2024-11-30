package com.example.Authorization.service.repository;

import com.example.Authorization.service.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    private static final Map<String, String> users = new HashMap<>();
    private static final Map<String, List<Authorities>> authorities = new HashMap<>();

    static {

        users.put("user1", "password1");
        authorities.put("user1", List.of(Authorities.READ, Authorities.WRITE));

        users.put("user2", "password2");
        authorities.put("user2", List.of(Authorities.READ));
    }


    public List<Authorities> getUserAuthorities(String user, String password) {
        if (users.containsKey(user) && users.get(user).equals(password)) {
            return authorities.get(user);
        }
        return new ArrayList<>();
    }

}