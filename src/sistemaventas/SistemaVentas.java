/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas;

import entities.Category;
import entities.Customer;
import entities.Product;
import entities.Provider;
import entities.Sale;
import entities.SaleItem;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Invitado
 */
public class SistemaVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       EntityManagerFactory managerFactory
                = Persistence.createEntityManagerFactory("SistemaVentasPU");
        EntityManager entityManager = 
                managerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();

        
        Provider provider=new Provider();
        provider.setAddress("MX15");
        provider.setName("Cocacola");
        provider.setPhone("123");
        provider.setWebsite("cocacola.com.mx");
        
        entityManager.persist(provider);
        
        Category category=new Category();
        category.setName("Drinks");
        category.setDescription("For liquids");
        
        entityManager.persist(category);
        
        Product product = new Product();
        product.setProvider(provider);
        product.setCategory(category);
        product.setName("Coca 600ml");
        product.setPrice(15.5f);
        product.setStock(10);
        
        entityManager.persist(product);
        
        Customer customer = new Customer();
        customer.setAddress("Gve");
        customer.setName("Alfonso");
        customer.setPhone("312");
        customer.setRfc("FEL123");
        
        entityManager.persist(customer);
        
        Sale sale=new Sale();
        sale.setCustomer(customer);
        sale.setDate(new Date());
        sale.setDiscount(0f);
        sale.setTotal(31);
        
        entityManager.persist(sale);
        
        SaleItem saleItem=new SaleItem();
        
        saleItem.setPrice(15.5f);
        saleItem.setProduct(product);
        saleItem.setQuantity(2);
        saleItem.setSale(sale);
        saleItem.setTotal(31f);
        
        entityManager.persist(saleItem);
        
        entityManager.getTransaction().commit();
        
    }
    
}
