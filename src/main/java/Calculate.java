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

    public void calculate(int howPeople) {
        productName = scanWords.next();
        while (!productName.equalsIgnoreCase(stopWord)) {
            totalList = totalList + "\n" + productName;
            System.out.println("Введите стоимость продукта");
            if (scanPrice.hasNextFloat() == false) {
                System.out.println("Перезапустите программу и введите количество людей с помощью цифр");
                break;
            } else {
                price = scanPrice.nextFloat();
            }
                totalPrice = totalPrice + price;
                System.out.println("Вы успешно добавили товар " + productName + " стоимостью: " + price + ". Вы хотите добавить что-то ещё?");
                productName = scanWords.next();
                finalPrice = totalPrice / howPeople;
                if ((int) finalPrice % 100 >= 11 && (int) finalPrice % 100 <= 14) {
                    rubli = (int) finalPrice % 100;
                    switch (rubli) {
                        case 11:
                            rublWord = "рублей";
                            break;
                        case 12:
                            rublWord = "рублей";
                            break;
                        case 13:
                            rublWord = "рублей";
                            break;
                        case 14:
                            rublWord = "рублей";
                            break;
                    }
                } else {
                    rubli = (int) finalPrice % 10;
                    switch (rubli) {
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
                }
        }
        System.out.println("Добавленные товары: " + totalList + "\n Итоговая цена в рублях: " + totalPrice);
        System.out.println("Каждый человек должен заплатить: "+String.format("%.2f",finalPrice)+" "+rublWord); }

}