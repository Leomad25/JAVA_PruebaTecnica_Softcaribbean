package com.todo1.hulk_store_backend.persistence.crud;

import com.todo1.hulk_store_backend.persistence.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonCrud extends CrudRepository<Person, Long> {
    Person findByIdentification(String identification);
    Person findByIdUser(long idUser);
}
