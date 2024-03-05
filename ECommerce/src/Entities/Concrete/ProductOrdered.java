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

public class ProductOrdered {

    public Product OrderProduct;
    public CreditCards OrderCard;


    public ProductOrdered(Product OrderProduct , CreditCards OrderCard ){
        this.OrderProduct = OrderProduct;
        this.OrderCard = OrderCard;

    }



    public Product getOrderProduct(){return this.OrderProduct;}
    public void setOrderProduct(Product OrderProduct){this.OrderProduct = OrderProduct;}

    public CreditCards getOrderCard(){return this.OrderCard;}
    public void setOrderCard(CreditCards OrderCard){this.OrderCard = OrderCard;}



}
