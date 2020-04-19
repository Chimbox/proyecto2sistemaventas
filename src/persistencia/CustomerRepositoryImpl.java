/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entities.Customer;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Invitado
 */
public class CustomerRepositoryImpl extends RepositoryBase<Customer> implements CustomerRepository{

    public CustomerRepositoryImpl(EntityManager entityManager, Class<Customer> cls) {
        super(entityManager, cls);
    }

    
    @Override
    public List<Customer> findByName(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
