package com.code043.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code043.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {}
