/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entities.Provider;
import java.util.List;
import persistencia.ConnectionFactory;

/**
 *
 * @author Invitado
 */
public interface ProviderRepository extends Repository<Provider> {
    List<Provider> findByName(String name);
}
