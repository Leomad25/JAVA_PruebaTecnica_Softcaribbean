package com.todo1.hulk_store_backend.service.implementation;

import com.todo1.hulk_store_backend.repository.crud.UsuarioCrud;
import com.todo1.hulk_store_backend.repository.entity.Usuario;
import com.todo1.hulk_store_backend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserServiceImplement implements UsuarioService {

    @Autowired
    private UsuarioCrud usuarioCrud;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Usuario> findAll() {
        return usuarioCrud.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Usuario> findAll(Pageable pageable) {
        return usuarioCrud.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Usuario> finedById(Long id) {
        return usuarioCrud.findById(id);
    }

    @Override
    @Transactional
    public Usuario save(Usuario usuario) {
        if ((usuario.getIdUsuario() != null) || !(usuarioCrud.findById(usuario.getIdUsuario()).isPresent()))
            usuario.setContrasena(encoder.encode(usuario.getContrasena()));
        return usuarioCrud.save(usuario);
    }

    @Override
    @Transactional
    public Usuario updatePass(Long id, String current, String newPassord) {
        Optional<Usuario> optional = usuarioCrud.findById(id);
        if (!optional.isPresent()) return null;
        if (!encoder.matches(current, optional.get().getContrasena())) return null;
        return usuarioCrud.save(optional.get());
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        usuarioCrud.deleteById(id);
    }
}
