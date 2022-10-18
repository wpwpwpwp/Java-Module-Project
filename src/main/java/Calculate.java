import java.util.Scanner;

public class Calculate {
    float price;
    int rubli;
    String rublWord;
    String productName = "";
    float totalPrice;
    String totalList = "";
    String stopWord = "Завершить";
    Scanner scanWords = new Scanner(System.in);
    float finalPrice;

    public void calculate(int howPeople) {
        System.out.println("Какой товар Вы хотите добавить?");
        productName = scanWords.next();
        System.out.println("Введите стоимость продукта");
        while (!productName.equalsIgnoreCase(stopWord)) {
            Scanner scanPrice = new Scanner(System.in);
            if (scanPrice.hasNextFloat() == false) {
                System.out.println("Вы ввели неверную стоимость товара. Введите стоимость в виде цифр");
            } else {
                totalList = totalList + "\n" + productName;
                price = scanPrice.nextFloat();
                totalPrice = totalPrice + price;
                System.out.println("Вы успешно добавили товар " + productName + " стоимостью: " + price + ". Вы хотите добавить что-то ещё?");
                finalPrice = totalPrice / howPeople;
                if ((int) finalPrice % 100 >= 11 && (int) finalPrice % 100 <= 14) {
                    rubli = (int) finalPrice % 100;
                    switch (rubli) {
                        case 11:
                        case 13:
                        case 12:
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
                        case 4:
                        case 3:
                            rublWord = "рубля";
                            break;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 0:
                            rublWord = "рублей";
                            break;
                    }
                }
                productName = scanWords.next();
                System.out.println("Введите стоимость продукта");
            }
        }
        System.out.println("Добавленные товары: " + totalList + "\nИтоговая цена в рублях: " + totalPrice);
        System.out.println("Каждый человек должен заплатить: "+String.format("%.2f",finalPrice)+" "+rublWord); }
}