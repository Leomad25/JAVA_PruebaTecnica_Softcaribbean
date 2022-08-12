package com.todo1.hulk_store_backend.service;

import com.todo1.hulk_store_backend.repository.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UsuarioService {
    public Iterable<Usuario> findAll();
    public Page<Usuario> findAll(Pageable pageable);
    public Optional<Usuario> finedById(Long id);
    public Usuario save(Usuario usuario);
    public Usuario updatePass(Long id, String current, String newPassord);
    public void deleteById(Long id);
}
