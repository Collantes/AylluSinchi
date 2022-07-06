/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.ayllusinchi.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import upeu.ayllusinchi.entity.Taller;

/**
 *
 * @author 51950
 */
@Repository
public interface TallerRepository extends CrudRepository<Taller, Long> {
}
