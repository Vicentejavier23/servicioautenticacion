package com.edutech.servicioautenticacion.Controller;

import com.edutech.servicioautenticacion.Model.Usuario;
import com.edutech.servicioautenticacion.Service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioService servicio;

    public UsuarioController(UsuarioService servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Usuario> obtenerTodos() {
        return servicio.listar();
    }

    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return servicio.guardar(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        servicio.eliminar(id);
    }
}
