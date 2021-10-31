package DrinksVendingMachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой напиток вы хотите? (Пожалуйста, напишите полное имя напитка, как в списке)");
        System.out.println("[1] COCA_COLA; [2] PEPSI; [3] FANTA; [4] SPRITE;" +
                " [5] MIRINDA; [6] LIPTON");
        Choosing drink = Choosing.valueOf(scanner.next());
        System.out.println("Сколько литров?");
        int count = scanner.nextInt();
        Drinks d1 = new Drinks(drink,count);
        System.out.printf("Напиток '%s' был выбран. Количество литров: %s. ",
                d1.choosing,d1.liters);
        switch (d1.choosing){
            case COCA_COLA:
                System.out.println("С вас " + d1.getLiters()*30 + " рублей");
                break;
            case PEPSI:
                System.out.println("С вас " + d1.getLiters()*35 + " рублей");
                break;
            case FANTA:
                System.out.println("С вас " + d1.getLiters()*40 + " рублей");
                break;
            case SPRITE:
                System.out.println("С вас " + d1.getLiters()*45 + " рублей");
                break;
            case MIRINDA:
                System.out.println("С вас " + d1.getLiters()*50 + " рублей");
                break;
            case LIPTON:
                System.out.println("С вас " + d1.getLiters()*55 + " рублей");
                break;
        }
    }
}
