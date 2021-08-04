package com.example.bookmanagers.repository;

import com.example.bookmanagers.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){// create , read, update, delete

        userRepository.save(new User());

        System.out.println(">>>>" + userRepository.findAll());

    }

}