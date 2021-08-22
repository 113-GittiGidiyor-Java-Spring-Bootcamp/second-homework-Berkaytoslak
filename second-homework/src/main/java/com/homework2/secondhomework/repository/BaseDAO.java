package com.homework2.secondhomework.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseDAO<T> {
    List<T> findAll();
    T findById(int id);
    T save(T object);
    void deleteById(int id);
    T update(T object);
    void delete(T object);
}
