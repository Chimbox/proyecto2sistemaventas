/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entities.Sale;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Invitado
 */
public class SaleRepositoryImpl extends RepositoryBase<Sale> implements SaleRepository{

    public SaleRepositoryImpl(EntityManager entityManager, Class<Sale> cls) {
        super(entityManager, cls);
    }

    @Override
    public List<Sale> findByDate(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
