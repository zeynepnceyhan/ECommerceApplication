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

import Entities.Concrete.*;
import java.util.ArrayList;

import Business.Abstract.IUserService;
import java.util.ArrayList;

public class UserManager implements IUserService {

    ProductManager pm = new ProductManager();

    @Override
    public boolean Login(User user, String UserName, String Password) {
        if (UserName.equals(user.UserName) && Password.equals(user.Password)) {
            user.isOnline = true;
            System.out.println("Login successful!");
        } else {
            user.isOnline = false;
            System.out.println("Login failed! Username or Password is wrong!");
        }
        return user.isOnline;
    }

    @Override
    public void Shopping(User user, Product product, CreditCards creditCard) {
        ArrayList<ProductOrdered> poArray = user.getProductOrdered();
        ProductOrdered po = new ProductOrdered(product,creditCard);
        if(user.isOnline){
            if(pm.CheckStock(product)){
                poArray.add(po);
                product.ProductStock--;
                System.out.println("Shopping successful!");

            }
            else{
                System.out.println("there is no stock of this product");
            }

        }
        else{
            System.out.println("You should login for shopping!");
        }

    }

    @Override
    public void AddFavorite(User user, Product product) {
        ArrayList<FavoriteProducts> fpArray = user.getFavoriteProducts();
        FavoriteProducts fp = new FavoriteProducts(product);
        if(user.isOnline){
            if(pm.CheckStock(product)){
                fpArray.add(fp);
                System.out.println("Adding to favorites is successful!");
            }
            else{
                System.out.println("There is no stock of this product");
            }

        }
        else{
            System.out.println("You should login for favorite operation.");
        }
    }

    @Override
    public void DeleteFavorite(User user, Product product) {
        ArrayList<FavoriteProducts> fpArray = user.getFavoriteProducts();
        if(user.isOnline){
            fpArray.remove(product);
            System.out.println("Deleting to favorites is successful!");
        }
        else{
            System.out.println("You should login for favorite operation.");
        }
    }

    @Override
    public void LookAtFavorite(User user) {
        ArrayList<FavoriteProducts> fpArray = user.getFavoriteProducts();
        FavoriteProducts favoriteProducts;
        for(int i=0;i<fpArray.size();i++){
            favoriteProducts = fpArray.get(i);
            System.out.println("Product Name :" + favoriteProducts.product.ProductName
                    + "\n" + "Product Color : " + favoriteProducts.product.ProductColor
                    + "\n" + "Product Description: " + favoriteProducts.product.ProductDescription
                    + "\n" + "Product Weight : " + favoriteProducts.product.ProductWeight
                    + "\n" + "Category Id :" + favoriteProducts.product.ProductCategory
                    + "\n"  + "Product Stock : " + favoriteProducts.product.ProductStock);
            System.out.println("-----------------------------------------------------------------");
        }
        System.out.println("Totaly : " + fpArray.size() + " favorite products can find.");


    }



    @Override
    public void LookAtOrders(User user) {
        ArrayList<ProductOrdered> poArray = user.getProductOrdered();
        ProductOrdered productOrdered;
        for(int i=0;i<poArray.size();i++){
            productOrdered = poArray.get(i);
            System.out.println("Product Name:" + productOrdered.OrderProduct.ProductName
                    + "\n" + "Product Color : " + productOrdered.OrderProduct.ProductColor
                    + "\n" + "Product Description: " + productOrdered.OrderProduct.ProductDescription
                    + "\n" + "Product Weight : " + productOrdered.OrderProduct.ProductWeight
                    + "\n" + "Category Id :" + productOrdered.OrderProduct.ProductCategory
                    + "\n"  + "Product Stock : " + productOrdered.OrderProduct.ProductStock);
            System.out.println("-----------------------------------------------------------------");
        }

        System.out.println("Totaly : " + poArray.size() + " orders can find.");

        }


}