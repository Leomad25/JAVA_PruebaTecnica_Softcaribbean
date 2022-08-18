package com.todo1.hulk_store_backend.persistence.crud;

import com.todo1.hulk_store_backend.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrud extends CrudRepository<User, Long> {
}
