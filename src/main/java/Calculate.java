import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

import javax.swing.JToolTip;

public class Calculate {
        float price;
        int rubli;
        String rublWord;
        String productName;
        float totalPrice;
        String totalList = "";
        String stopWord = "Завершить";
        Scanner scanWords = new Scanner(System.in);
        Scanner scanPrice = new Scanner(System.in);
        float finalPrice;
        public void calculate(int howPeople){
            productName = scanWords.next();
             while(!productName.equalsIgnoreCase(stopWord)){
                 totalList=totalList+"\n"+productName;
             System.out.println("Введите стоимость продукта");
             price = scanPrice.nextFloat();
             totalPrice=totalPrice+price;
             System.out.println("Вы успешно добавили товар "+productName+" стоимостью: "+price+". Вы хотите добавить что-то ещё?");
                 productName = scanWords.next();
        }
        System.out.println("Добавленные товары: "+totalList+". Итоговая цена в рублях: "+totalPrice);
             finalPrice = totalPrice / howPeople;
             rubli =(int) finalPrice%10;
             switch (rubli){
                 case 1:
                     rublWord = "рубль";
                     break;
                 case 2:
                     rublWord = "рубля";
                     break;
                 case 3:
                     rublWord = "рубля";
                     break;
                 case 4:
                     rublWord = "рубля";
                     break;
                 case 5:
                     rublWord = "рублей";
                     break;
                 case 6:
                     rublWord = "рублей";
                     break;
                 case 7:
                     rublWord = "рублей";
                     break;
                 case 8:
                     rublWord = "рублей";
                     break;
                 case 9:
                     rublWord = "рублей";
                     break;
                 case 0:
                     rublWord = "рублей";
                     break;
             }
             System.out.println("Каждый человек должен заплатить: " + String.format("%.2f", totalPrice)  + "" + rublWord);
        }
}