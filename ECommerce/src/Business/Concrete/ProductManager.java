/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Concrete;

/**
 *
 * @author onest
 */
import Business.Abstract.IProductService;
import Entities.Concrete.Product;
public class ProductManager implements IProductService {


    @Override
    public boolean CheckStock(Product product) {
        if(product.ProductStock>0){
            return true;
        }
        else{
            return false;
        }
    }
}