/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author trantuan
 */
public class Wallet {
    private double amount;

    public Wallet(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public boolean payMoney(int total) {
        if (total <= amount) {
            amount -= total;
            return true; // Trả tiền thành công
        }
        return false; // Số dư không đủ
    }

    public int calcTotal(int[] bills) {
        int total = 0;
        for (int bill : bills) {
            total += bill;
        }
        return total;
    }
}
