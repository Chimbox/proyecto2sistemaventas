/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entities.Category;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Invitado
 */
public class CategoryRepositoryImpl extends RepositoryBase<Category> implements CategoryRepository{

    public CategoryRepositoryImpl(EntityManager entityManager, Class<Category> cls) {
        super(entityManager, cls);
    }
    
    @Override
    public List<Category> findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
