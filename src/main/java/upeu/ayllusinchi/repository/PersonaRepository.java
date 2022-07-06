/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import upeu.ayllusinchi.entity.Persona;

/**
 *
 * @author 51950
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {
    // Query Method JPA
    // List<Persona> findByTipoDocumento(Long tidoId);
}
