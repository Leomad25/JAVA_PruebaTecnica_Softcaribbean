package com.todo1.hulk_store_backend.domain.repository;

import com.todo1.hulk_store_backend.domain.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    List<Person> getAll();
    Optional<Person> getById(long id);
    Optional<Person> getByIdentification(long identification);
    Optional<Person> getByIdUser(long idUser);
    Person save(Person person);
    void delete(long id);
}
