package com.api.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.assignment.entity.Author;

public interface AuthorRepo extends JpaRepository<Author, String> {

}
