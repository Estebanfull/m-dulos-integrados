package controller;

import model.Asistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import repository.AsistenciaRepository;

@RestController
@RequestMapping("/api/asistencias")
public class AsistenciaController {

    private final AsistenciaRepository asistenciaRepository;

    @Autowired
    public AsistenciaController(AsistenciaRepository asistenciaRepository) {
        this.asistenciaRepository = asistenciaRepository;
    }

    @GetMapping
    public ResponseEntity<List<Asistencia>> getAllAsistencias() {
        List<Asistencia> asistencias = asistenciaRepository.findAll();
        return new ResponseEntity<>(asistencias, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asistencia> getAsistenciaById(@PathVariable("id") Long id) {
        return asistenciaRepository.findById(id)
                .map(asistencia -> new ResponseEntity<>(asistencia, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/modificar")
    public ResponseEntity<String> modificarAsistencia(@RequestBody ModificacionAsistenciaRequest request) {
        Long id = request.getId();
        String tipoModificacion = request.getTipoModificacion();
        String mensaje = request.getMensaje();
        // Lógica para modificar la asistencia según el tipo de modificación
        return new ResponseEntity<>("Asistencia modificada exitosamente", HttpStatus.OK);
    }

    @PostMapping("/solicitar")
    public ResponseEntity<String> solicitarAsistencia(@RequestBody SolicitudAsistenciaRequest request) {
        String tipoAsistencia = request.getTipoAsistencia();
        String mensaje = request.getMensaje();
        // Lógica para solicitar la asistencia
        return new ResponseEntity<>("Asistencia solicitada exitosamente", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarAsistencia(@PathVariable("id") Long id) {
        // Lógica para eliminar la asistencia
        return new ResponseEntity<>("Asistencia eliminada exitosamente", HttpStatus.OK);
    }

    // Clase interna para representar la solicitud de modificación de asistencia
    public static class ModificacionAsistenciaRequest {
        private Long id;
        private String tipoModificacion;
        private String mensaje;

        // Getters y setters omitidos por brevedad

        private Long getId() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getTipoModificacion() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getMensaje() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    // Clase interna para representar la solicitud de asistencia
    public static class SolicitudAsistenciaRequest {
        private String tipoAsistencia;
        private String mensaje;

        // Getters y setters omitidos por brevedad

        private String getTipoAsistencia() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getMensaje() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
