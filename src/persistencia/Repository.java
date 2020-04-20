/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entities.EntityBase;
import java.util.List;

public interface Repository<T extends EntityBase> {
    T find(int id);
    List<T> findAll();
    T save(T entity);
    void delete(T entity);
    void commit();
}
