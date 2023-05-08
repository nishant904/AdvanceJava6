package com.api.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.assignment.entity.*;

public interface BookRepo extends JpaRepository<Book, Integer> {

}