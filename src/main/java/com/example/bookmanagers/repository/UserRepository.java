package com.example.bookmanagers.repository;

import com.example.bookmanagers.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> { //sping data jpa 라이브러리 상송
}
