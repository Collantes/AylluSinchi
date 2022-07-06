/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.ayllusinchi.service;

import java.util.List;
import upeu.ayllusinchi.entity.Persona;

/**
 *
 * @author 51950
 */
public interface PersonaService {

    public List<Persona> findAll();

    public Persona findById(Long id);

    public Persona save(Persona persona);

    public void delete(Persona persona);

    public void deleteById(Long id);
}
