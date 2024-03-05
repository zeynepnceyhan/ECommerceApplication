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

public class CreditCards {
    public String CreditCardNumber;
    public User CardOwner;
    public String SecurityNumber;
    public LocalDate ExpirationDate;


    public CreditCards(String CreditCardNumber , User CardOwner , String SecurityNumber , LocalDate ExpirationDate){

        this.CreditCardNumber = CreditCardNumber;
        this.CardOwner = CardOwner;
        this.SecurityNumber = SecurityNumber;
        this.ExpirationDate = ExpirationDate;
    }

    public String getCreditCardNumber(){return this.CreditCardNumber;}
    public void setCreditCardNumber(String CreditCardNumber){this.CreditCardNumber = CreditCardNumber;}

    public String getSecurityNumber(){return this.SecurityNumber;}
    public void setSecurityNumber(String SecurityNumber){this.SecurityNumber = SecurityNumber;}

    public LocalDate getExpirationDate(){return this.ExpirationDate;}
    public void setExpirationDate(LocalDate ExpirationDate){this.ExpirationDate = ExpirationDate;}

    public User getOwner(){return this.CardOwner;}
    public void setOwner(User CardOwner){this.CardOwner = CardOwner;}



}



