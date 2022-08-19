package com.todo1.hulk_store_backend.domain.repository;

import java.util.List;
import java.util.Optional;

import com.todo1.hulk_store_backend.domain.entity.User;

public interface UserRepository {
    List<User> getAll();
    Optional<User> getById(long id);
    User sava(User user);
    void delete(long id);
}
