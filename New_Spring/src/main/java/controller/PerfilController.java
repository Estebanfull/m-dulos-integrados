/*
 * Copyright 2024 Esteban_Rey.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import repository.UsuarioRepository;
import model.Usuario;


@RestController
public class PerfilController {

    @Autowired
    private UsuarioRepository usuarioRepository; 

    @PutMapping("/modificar-perfil")
    public ResponseEntity<String> modificarPerfil(@RequestParam Long idUsuario, @RequestBody Usuario usuarioModificado) {
        // Buscar el usuario en la base de datos por su ID
        Usuario usuarioExistente = usuarioRepository.findById(idUsuario).orElse(null);

        // Verificar si el usuario existe
        if (usuarioExistente == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
        }

        // Actualizar los datos del usuario con los datos modificados
        usuarioExistente.setNombre(usuarioModificado.getNombre());
        usuarioExistente.setTelefono(usuarioModificado.getTelefono());
        usuarioExistente.setCorreo(usuarioModificado.getCorreo());
        usuarioExistente.setDireccion(usuarioModificado.getDireccion());
        usuarioExistente.setTipoAsistencia(usuarioModificado.getTipoAsistencia());
        usuarioExistente.setClave(usuarioModificado.getClave());

        // Guardar el usuario actualizado en la base de datos
        usuarioRepository.save(usuarioExistente);

        // Devolver una respuesta exitosa
        return ResponseEntity.ok("Perfil actualizado correctamente");
    }
}
