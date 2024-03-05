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
import Entities.Concrete.CreditCards;
import Entities.Concrete.User;

import java.time.LocalDate;

public interface ICreditCardService {
    void AddCard(String creditCardNumber, User user , String securityNumber, LocalDate expirationDate);
    void DeleteCard(User user,CreditCards card);
    void LookAtCard(User user);
}
