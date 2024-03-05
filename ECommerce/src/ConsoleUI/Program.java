/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleUI;

/**
 *
 * @author onest
 */
import Entities.Concrete.*;
import Business.Concrete.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


public class Program {
    public static void main(String[] args) {
UserManager userManager = new UserManager();
        CreditCardManager creditCardManager = new CreditCardManager();

        User user1 = new User("zeynepnaz" , "Zeynep Naz" , "Ceyhan" ,
                LocalDate.of(2001 , Month.APRIL,12),
                "369963" , "zeynepnazcyhn@gmail.com", "İzmir/Göztepe",
                new ArrayList<ProductOrdered>() , new ArrayList<FavoriteProducts>() , new ArrayList<CreditCards>());

        userManager.Login(user1,"zeynepnaz","369963");

        creditCardManager.AddCard("12346789",user1,"123",
                LocalDate.of(2024,Month.DECEMBER,12));
        creditCardManager.AddCard("987654321",user1,"321",
                LocalDate.of(2025,Month.APRIL,13));

        Product product1 = new Product("Eyeliner" ,"black",2,
                1000 , 50 , "Sephora Black Waterproof Eyeliner" );
        Product product2 = new Product("Dyson(for hair)" ,"grey",3,
                2000 , 450 , "Hair Styling Machine" );


        userManager.Shopping(user1,product1,user1.CreditCards.get(0));
        userManager.Shopping(user1,product2,user1.CreditCards.get(1));
        userManager.LookAtOrders(user1);
        System.out.println("******************************************************************************");

        creditCardManager.LookAtCard(user1);

        System.out.println("******************************************************************************");

        userManager.AddFavorite(user1,product1);
        userManager.AddFavorite(user1,product2);
        userManager.DeleteFavorite(user1,product2);
        userManager.LookAtFavorite(user1);

        System.out.println("******************************************************************************");

    }
}
