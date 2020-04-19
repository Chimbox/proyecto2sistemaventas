/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entities.Category;
import entities.Product;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Invitado
 */
public class ProductRepositoryImpl extends RepositoryBase<Product> implements ProductRepository{

    public ProductRepositoryImpl(EntityManager entityManager, Class<Product> cls) {
        super(entityManager, cls);
    }
    
    @Override
    public List<Product> findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> findByCategory(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
