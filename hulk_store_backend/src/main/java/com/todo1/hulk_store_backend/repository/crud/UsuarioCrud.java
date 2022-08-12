package com.todo1.hulk_store_backend.repository.crud;

import com.todo1.hulk_store_backend.repository.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioCrud extends JpaRepository<Usuario, Long> {
    Usuario findByCedula(String nombre);

}