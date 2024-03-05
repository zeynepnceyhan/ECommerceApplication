/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Abstract;

/**
 *
 * @author onest
 */
import Entities.Concrete.Product;

public interface IProductService {

    boolean CheckStock(Product product);
}
