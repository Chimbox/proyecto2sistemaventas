/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entities.Category;
import entities.Customer;
import entities.Product;
import entities.Provider;
import entities.SaleItem;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Invitado
 */
public class Models {
    public static DefaultTableModel categoryTableModel(List<Category> lstCategories) {
        Object tabla[][];
        String[] nombresCols = {"ID", "Name", "Description"};
        if(lstCategories!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstCategories.size()][nombresCols.length];
            
            for (int i = 0; i < lstCategories.size(); i++) {
                Category category=lstCategories.get(i);
                tabla[i][0]=category.getId();
                tabla[i][1]=category.getName();
                tabla[i][2]=category.getDescription();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    
    public static DefaultTableModel customerTableModel(List<Customer> lstCustomers) {
        Object tabla[][];
        String[] nombresCols = {"ID", "RFC", "Name", "Address", "Phone"};
        if(lstCustomers!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstCustomers.size()][nombresCols.length];
            
            for (int i = 0; i < lstCustomers.size(); i++) {
                Customer customer=lstCustomers.get(i);
                tabla[i][0]=customer.getId();
                tabla[i][1]=customer.getRfc();
                tabla[i][2]=customer.getName();
                tabla[i][3]=customer.getAddress();
                tabla[i][4]=customer.getPhone();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    
    public static DefaultTableModel providerTableModel(List<Provider> lstProviders) {
        Object tabla[][];
        String[] nombresCols = {"ID", "Name", "Address", "Phone", "Website"};
        if(lstProviders!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstProviders.size()][nombresCols.length];
            
            for (int i = 0; i < lstProviders.size(); i++) {
                Provider provider=lstProviders.get(i);
                tabla[i][0]=provider.getId();
                tabla[i][1]=provider.getName();
                tabla[i][2]=provider.getAddress();
                tabla[i][3]=provider.getPhone();
                tabla[i][4]=provider.getWebsite();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    
    public static DefaultTableModel productTableModel(List<Product> lstProducts) {
        Object tabla[][];
        String[] nombresCols = {"ID", "Name", "Price", "Stock", "Provider", "Category"};
        if(lstProducts!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstProducts.size()][nombresCols.length];
            
            for (int i = 0; i < lstProducts.size(); i++) {
                Product product=lstProducts.get(i);
                tabla[i][0]=product.getId();
                tabla[i][1]=product.getName();
                tabla[i][2]=product.getPrice();
                tabla[i][3]=product.getStock();
                tabla[i][4]=product.getProvider().getName();
                tabla[i][5]=product.getCategory().getName();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    
    public static DefaultTableModel saleItemTableModel(List<SaleItem> lstSaleItems) {
        Object tabla[][];
        String[] nombresCols = {"ID", "Product", "Price", "Quantity", "Total"};
        if(lstSaleItems!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstSaleItems.size()][nombresCols.length];
            
            for (int i = 0; i < lstSaleItems.size(); i++) {
                SaleItem saleItem=lstSaleItems.get(i);
                tabla[i][0]=saleItem.getId();
                tabla[i][1]=saleItem.getProduct().getName();
                tabla[i][2]=saleItem.getPrice();
                tabla[i][3]=saleItem.getQuantity();
                tabla[i][4]=saleItem.getTotal();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    
    public static DefaultComboBoxModel providersComboBoxModel(List<Provider> lstProviders) {
        DefaultComboBoxModel<Provider> cbxmProviders = new DefaultComboBoxModel<>();
        
        if(lstProviders!=null){
            for (Provider destino : lstProviders) {
                cbxmProviders.addElement(destino);
            }
            return cbxmProviders;
        }
        return null;
    }
    
    public static DefaultComboBoxModel categoriesComboBoxModel(List<Category> lstCategories) {
        DefaultComboBoxModel<Category> cbxmCategories = new DefaultComboBoxModel<>();
        
        if(lstCategories!=null){
            for (Category category : lstCategories) {
                cbxmCategories.addElement(category);
            }
            return cbxmCategories;
        }
        return null;
    }
    
    public static DefaultComboBoxModel customersComboBoxModel(List<Customer> lstCategories) {
        DefaultComboBoxModel<Customer> cbxmCustomers = new DefaultComboBoxModel<>();
        
        if(lstCategories!=null){
            for (Customer customer : lstCategories) {
                cbxmCustomers.addElement(customer);
            }
            return cbxmCustomers;
        }
        return null;
    }
    
    
    
    /*public static DefaultTableModel socioTableModel(List<Socio> lstCategories) {
        Object tabla[][];
        String[] nombresCols = {"ID", "DNI", "Nombre", "Direccion"};
        if(lstCategories!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstCategories.size()][nombresCols.length];
            
            for (int i = 0; i < lstCategories.size(); i++) {
                Socio socio=lstCategories.get(i);
                tabla[i][0]=socio.getId();
                tabla[i][1]=socio.getDni();
                tabla[i][2]=socio.getNombre();
                tabla[i][3]=socio.getDireccion();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    public static DefaultTableModel barcoTableModel(List<Barco> lstBarcos) {
        Object tabla[][];
        String[] nombresCols = {"Num. Matrícula", "Nombre", "Num. Amarre", "Cuota", "Socio"};
        if(lstBarcos!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstBarcos.size()][nombresCols.length];
            
            for (int i = 0; i < lstBarcos.size(); i++) {
                Barco barco=lstBarcos.get(i);
                tabla[i][0]=barco.getNumMatricula();
                tabla[i][1]=barco.getNombre();
                tabla[i][2]=barco.getNumAmarre();
                tabla[i][3]="$"+barco.getCuota();
                tabla[i][4]=barco.getSocio().getNombre();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    
    public static DefaultTableModel destinoTableModel(List<Destino> lstDestinos) {
        Object tabla[][];
        String[] nombresCols = {"ID", "Nombre"};
        if(lstDestinos!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstDestinos.size()][nombresCols.length];
            
            for (int i = 0; i < lstDestinos.size(); i++) {
                Destino destino=lstDestinos.get(i);
                tabla[i][0]=destino.getId();
                tabla[i][1]=destino.getNombre();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    
    public static DefaultTableModel salidaTableModel(List<Salida> lstSalidas) {
        Object tabla[][];
        String[] nombresCols = {"ID", "Fecha", "Hora", "Barco", "Destino"};
        if(lstSalidas!=null){
            DefaultTableModel modelo = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
            };
            tabla=new Object[lstSalidas.size()][nombresCols.length];
            
            for (int i = 0; i < lstSalidas.size(); i++) {
                Salida salida=lstSalidas.get(i);
                tabla[i][0]=salida.getId();
                tabla[i][1]=salida.getFechaHora();
                tabla[i][2]=salida.getFechaHora().getCadenaHora();
                tabla[i][3]=salida.getBarco();
                tabla[i][4]=salida.getDestino();
            }
            modelo.setDataVector(tabla, nombresCols);
            return modelo;
        }
        return null;
    }
    
    public static DefaultComboBoxModel sociosComboBoxModel(List<Socio> lstCategories) {
        DefaultComboBoxModel<Socio> comboSocio = new DefaultComboBoxModel<>();
        
        if(lstCategories!=null){
            for (Socio socio : lstCategories) {
                comboSocio.addElement(socio);
            }
            return comboSocio;
        }
        return null;
    }
    
    public static DefaultComboBoxModel destinosComboBoxModel(List<Destino> lstDestinos) {
        DefaultComboBoxModel<Destino> comboDestino = new DefaultComboBoxModel<>();
        
        if(lstDestinos!=null){
            for (Destino destino : lstDestinos) {
                comboDestino.addElement(destino);
            }
            return comboDestino;
        }
        return null;
    }
    
    
    public static DefaultComboBoxModel barcosComboBoxModel(List<Barco> lstBarcos) {
        DefaultComboBoxModel<Barco> comboBarco = new DefaultComboBoxModel<>();
        
        if(lstBarcos!=null){
            for (Barco barco : lstBarcos) {
                comboBarco.addElement(barco);
            }
            return comboBarco;
        }
        return null;
    }*/
}
