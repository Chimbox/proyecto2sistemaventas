/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entities.Provider;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Invitado
 */
public class ProviderRepositoryImpl extends RepositoryBase<Provider> implements ProviderRepository{

    public ProviderRepositoryImpl(EntityManager entityManager, Class<Provider> cls) {
        super(entityManager, cls);
    }
    
    @Override
    public List<Provider> findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
