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
import Business.Abstract.ICreditCardService;
import Entities.Concrete.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class CreditCardManager implements ICreditCardService {

    @Override
    public void AddCard(String creditCardNumber, User user , String securityNumber, LocalDate expirationDate) {
        ArrayList<CreditCards> cCArray = user.getCreditCards();
        CreditCards cC = new CreditCards(creditCardNumber,user,securityNumber,expirationDate);
        if(user.isOnline){
            cCArray.add(cC);
            System.out.println("Add card successful!");
        }
        else{
            System.out.println("You should login for card operation.");
        }

    }

    @Override
    public void DeleteCard(User user,CreditCards card) {
        ArrayList<CreditCards> cCArray = user.getCreditCards();
        if(user.isOnline){
            cCArray.remove(card);
            System.out.println("Delete card successful!");
        }
        else{
            System.out.println("You should login for card operation.");
        }
    }

    @Override
    public void LookAtCard(User user) {
        ArrayList<CreditCards> ccArray = user.getCreditCards();
        CreditCards creditCards;
        for(int i=0;i<ccArray.size();i++){
            creditCards = ccArray.get(i);
            System.out.println("Card Owner : " + creditCards.CardOwner.Name + " "+  creditCards.CardOwner.Surname
                    + "\n" + "Card Number : " + creditCards.CreditCardNumber
                    + "\n" + "Security Number: " + creditCards.SecurityNumber
                    + "\n" + "Expiration Date : " + creditCards.ExpirationDate);
            System.out.println("-----------------------------------------------------------------");
        }
        System.out.println("Totaly : " + ccArray.size() + " card can find.");
    }
}