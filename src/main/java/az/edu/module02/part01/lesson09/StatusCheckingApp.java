package az.edu.module02.part01.lesson09;

import java.util.Scanner;

public class StatusCheckingApp {

    public static void main(String[] args) {
        final String status = new Scanner(System.in).nextLine();

        OrderStatusEnum statusEnum = OrderStatus.findStatusV2(status);
        System.out.println(statusEnum);
//        sendEmail(statusEnum);
    }

    /*private static void sendEmail(OrderStatusEnum status) {
        if (ACCEPTED.equalsIgnoreCase(status)) {
            System.out.println("Your order accepted!");
        } else if (SHIPPED.equalsIgnoreCase(status)) {
            System.out.println("Your order has shipped!");
        } else if (DELIVERED.equalsIgnoreCase(status)) {
            System.out.println("Your order has delivered!");
        } else {
            System.out.println("System error!");
        }
    }*/
}
