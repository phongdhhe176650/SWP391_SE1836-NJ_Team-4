/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author trantuan
 */
public class J1SP0060 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= Shopping =======");      

        

        System.out.print("Enter the number of bills: ");
        int numberOfBills = scanner.nextInt();

        int[] bills = new int[numberOfBills];
        for (int i = 0; i < numberOfBills; i++) {
            System.out.print("Enter bill #" + (i + 1) + ": ");
            bills[i] = scanner.nextInt();
        }
        System.out.print("Enter the amount in your wallet: ");
        double walletAmount = scanner.nextDouble();

        Wallet userWallet = new Wallet(walletAmount);
        int totalBills = userWallet.calcTotal(bills);

        if (userWallet.payMoney(totalBills)) {
            System.out.println("ok");
        } else {
            System.out.println("fall");
        }

        scanner.close();
    }
}