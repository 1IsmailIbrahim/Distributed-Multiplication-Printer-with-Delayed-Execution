/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributed.pkg1;

/**
 *
 * @author Ismail
 */
public class A implements Runnable {

    int count;

    A(int i) {
        count = i;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(count * i + "  ");
        }
        System.out.print(" ");
        System.out.print("  " + Thread.currentThread().getName());
        System.out.println("");

    }
}
