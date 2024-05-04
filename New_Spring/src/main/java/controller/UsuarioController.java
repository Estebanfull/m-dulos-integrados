/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import model.Usuario;
import service.UsuarioService;
/**
 *
 * @author Esteban_Rey
 */


/*
 * Controlador para manejar las operaciones CRUD de la entidad Usuario.
 */

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    // Inyección de dependencias del servicio UsuarioService
    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Endpoint para obtener todos los usuarios
    @GetMapping
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        List<Usuario> usuarios = usuarioService.findAllUsuarios();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    // Endpoint para obtener un usuario por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("id") Long id) {
        return usuarioService.findUsuarioById(id)
                .map(usuario -> new ResponseEntity<>(usuario, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

  // Endpoint para crear un nuevo usuario
@PostMapping
public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
    try {
        Usuario nuevoUsuario = usuarioService.saveUsuario(usuario);
        System.out.println("Usuario creado correctamente: " + nuevoUsuario);
        return new ResponseEntity<>(nuevoUsuario, HttpStatus.CREATED);
    } catch (Exception e) {
        System.err.println("Error al crear el usuario: " + e.getMessage());
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}


    // Endpoint para actualizar un usuario existente
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable("id") Long id, @RequestBody Usuario usuario) {
        // Verifica si el usuario existe antes de actualizarlo
        if (!usuarioService.findUsuarioById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        usuario.setIdUsuario(id); // Asegura que el ID coincida con el path
        Usuario usuarioActualizado = usuarioService.saveUsuario(usuario);
        return new ResponseEntity<>(usuarioActualizado, HttpStatus.OK);
    }

    // Endpoint para eliminar un usuario por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable("id") Long id) {
        usuarioService.deleteUsuarioById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
