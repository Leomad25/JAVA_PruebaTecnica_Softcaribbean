package com.todo1.hulk_store_backend.persistence.implement;

import com.todo1.hulk_store_backend.persistence.crud.UserCrud;
import com.todo1.hulk_store_backend.persistence.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserImplement {
    private UserCrud userCrud;

    public List<User> getAll() {
        return (List<User>) userCrud.findAll();
    }
    public Optional<User> getById(long idUser) {
        return userCrud.findById(idUser);
    }
    public User getByNickName(String nickName) {
        return userCrud.findByNickName(nickName);
    }
    public User save(User user) {
        return userCrud.save(user);
    }
    public void delete(long idUser) {
        userCrud.deleteById(idUser);
    }
}
