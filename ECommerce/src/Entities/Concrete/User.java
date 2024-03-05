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
import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    public String UserName;
    public String Name;
    public String Surname;
    public LocalDate DateOfBirth;
    public String Password;
    public String Email;
    public String HomeOrWorkAddress;
    public boolean isOnline;
    public boolean isShopping;
    public ArrayList<ProductOrdered> ProductOrdered;
    public ArrayList<FavoriteProducts> FavoriteProducts;
    public ArrayList<CreditCards> CreditCards;


    public User(String Username, String Name, String Surname, LocalDate DateOfBirth, String Password, String Email , String HomeOrWorkAddress, ArrayList<ProductOrdered> productOrdered , ArrayList<FavoriteProducts> favoriteProducts ,ArrayList<CreditCards> creditCards){
        this.UserName = Username;
        this.Name = Name;
        this.Surname = Surname;
        this.Password = Password;
        this.DateOfBirth = DateOfBirth;
        this.Email = Email;
        this.HomeOrWorkAddress = HomeOrWorkAddress;
        this.ProductOrdered = productOrdered;
        this.FavoriteProducts = favoriteProducts;
        this.CreditCards = creditCards;
    }

    public String getUserName(){return this.UserName;}
    public void setUserName(String UserName){this.UserName = UserName;}

    public String getName(){return this.Name;}
    public void setName(String Name){this.Name = Name;}

    public String getSurname(){return this.Surname;}
    public void setSurname(String Surname){this.Surname = Surname;}

    public String getPassword(){return this.Password;}
    public void setPassword(String Password){this.Password = Password;}

    public String getEmail(){return this.Email;}
    public void setEmail(String Email){this.Email = Email;}

    public String getHomeOrWorkAddress(){return this.HomeOrWorkAddress;}
    public void setHomeOrWorkAddress(String HomeOrWorkAddress){this.HomeOrWorkAddress = HomeOrWorkAddress;}

    public LocalDate getDateOfBirth(){return this.DateOfBirth;}
    public void setDateOfBirth(LocalDate DateOfBirth){this.DateOfBirth = DateOfBirth;}

    public boolean getIsOnline(){return this.isOnline;}
    public void setIsOnline(boolean isOnline){this.isOnline = isOnline;}

    public boolean getIsShopping(){return this.isShopping;}
    public void setIsShopping(boolean isShopping){this.isShopping = isShopping;}

    public ArrayList<ProductOrdered> getProductOrdered(){ return this.ProductOrdered;}
    public void setProductOrdered(ArrayList<ProductOrdered> productOrdered){this.ProductOrdered = productOrdered;}

    public ArrayList<FavoriteProducts> getFavoriteProducts(){ return this.FavoriteProducts;}
    public void setFavoriteProducts(ArrayList<FavoriteProducts> favoriteProducts){this.FavoriteProducts = favoriteProducts;}

    public ArrayList<CreditCards> getCreditCards(){ return this.CreditCards;}
    public void setCreditCards(ArrayList<CreditCards> creditCards){this.CreditCards = creditCards;}





}
