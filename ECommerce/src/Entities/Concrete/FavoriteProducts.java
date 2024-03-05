/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities.Concrete;

/**
 *
 * @author onest
 */

public class FavoriteProducts {

    public Product product;
    public FavoriteProducts(Product product)
    {
        this.product = product;
    }

    public Product getFavoriteProducts(){return this.product;}
    public void setFavoriteProducts(Product products){this.product = products;}

}
