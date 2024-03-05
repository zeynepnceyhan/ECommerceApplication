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

public class Product  {

    public String ProductName;
    public String ProductColor;
    public int  ProductCategory;
    public int ProductStock;
    public int ProductWeight;
    public String ProductDescription;

    public Product( String ProductName , String ProductColor, int ProductCategory , int ProductStock , int ProductWeight, String ProductDescription){
        this.ProductName = ProductName;
        this.ProductColor = ProductColor;
        this.ProductCategory = ProductCategory;
        this.ProductStock = ProductStock;
        this.ProductWeight = ProductWeight;
        this.ProductDescription = ProductDescription;
    }


    public String getProductName(){return this.ProductName;}
    public void setProductName(String ProductName){this.ProductName = ProductName;}

    public String getProductColor(){return this.ProductColor;}
    public void setProductColor(String ProductColor){this.ProductColor = ProductColor;}

    public int getProductCategory(){return this.ProductCategory;}
    public void setProductCategory(int ProductCategory){this.ProductCategory = ProductCategory;}

    public int getProductStock(){return this.ProductStock;}
    public void setProductStock(int ProductStock){this.ProductStock = ProductStock;}

    public int getProductWeight(){return this.ProductWeight;}
    public void setProductWeight(int ProductWeight){this.ProductWeight = ProductWeight;}

    public String getProductDescription(){return this.ProductDescription;}
    public void setProductDescription(String ProductDescription){this.ProductDescription = ProductDescription;}



}