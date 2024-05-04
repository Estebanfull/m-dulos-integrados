package com.Spring_Ike.New_Spring;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author Esteban_Rey
 */
@SpringBootApplication
public class NewSpringApplication {

    private final DataSource dataSource;

    public NewSpringApplication(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(NewSpringApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doWhenApplicationReady() {
        try {
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            int result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
            if (result == 1) {
                System.out.println("Conexión exitosa a la base de datos.");
            } else {
                System.err.println("Error: No se pudo verificar la conexión a la base de datos.");
            }
        } catch (DataAccessException e) {
            System.err.println("Error al verificar la conexión a la base de datos: " + e.getMessage());
        }
    }
}




