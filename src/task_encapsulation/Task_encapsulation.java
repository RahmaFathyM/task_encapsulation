/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_encapsulation;

import java .util.Scanner;
public class Task_encapsulation {

    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        System.out.println("Enter your data :");
        String data=sc.next();
        DataOfUser user =new DataOfUser();
        user.setData(data);
        System.out.println("your data is :" + user.getData());
    }
    
}
