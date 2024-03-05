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
import Entities.Concrete.*;


public interface IUserService  {
    boolean Login(User user,String UserName , String Password) ;
    void Shopping(User user, Product product , CreditCards creditCards);
    void LookAtOrders(User user);
    void AddFavorite(User user,Product product);
    void DeleteFavorite(User user,Product product);
    void LookAtFavorite(User user);

}
