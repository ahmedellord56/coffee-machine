//package machine;
import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args)
    {
       int a=400 , b=540 ,c=120 , d=9 , e=550;
        Scanner input = new Scanner(System.in);
        String u;

        while (true)
        {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            u = input.nextLine();



            if (u.equals("remaining"))
            {
                System.out.println("The coffee machine has:\n" +
                        a + " of water\n" +
                        b + " of milk\n" +
                        c + " of coffee beans\n" +
                        d + " of disposable cups\n" +
                        e + " of money");

            }
            else if(u.equals("exit"))
            {
                break;
            }
            else if (u.equals("buy"))
            {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String number = input.nextLine();

                if(number.equals("back"))
                {
                    continue;
                }
                int k = Integer.parseInt(number);

                if (k==1) {
                    if(a<250){  System.out.println("Sorry, not enough water!"); continue;}
                    else
                        a -= 250;
                    if (c < 16) {
                        a+=250;
                        System.out.println("Sorry, not enough coffee beans!"); continue;
                    }
                    else
                        c -= 16;
                    e += 4;
                    System.out.println("I have enough resources, making you a coffee!");
                    d--;
                }
                else if(k==2){

                    if(a<350){   System.out.println("Sorry, not enough water!"); continue;}
                    else
                        a -= 350;

                    if (b < 75) {
                        a+=350;
                        System.out.println("Sorry, not enough coffee milk!"); continue;
                    }
                    else
                        b -=75;


                    if (c < 20) {
                        a+=350;
                        b+=75;
                        System.out.println("Sorry, not enough coffee beans!"); continue;
                    }
                    else
                        c -= 20;

                    e += 7;
                    System.out.println("I have enough resources, making you a coffee!");
                    d--;
                }
                else if(k==3)
                {
                    if(a<200){  d++; System.out.println("Sorry, not enough water!"); continue;}
                    else
                        a -= 200;

                    if (b < 100) {
                        a+=200;
                        System.out.println("Sorry, not enough coffee milk!"); continue;
                    }
                    else
                        b -=100;


                    if (c < 12) {
                        a+=200; b+=100;
                        System.out.println("Sorry, not enough coffee beans!"); continue;
                    }
                    else
                        c -= 12;

                    e += 6;
                    System.out.println("I have enough resources, making you a coffee!");
                    d--;
                }


            }
            else if (u.equals("fill"))
            {
                int n = 0;
                System.out.println("Write how many ml of water do you want to add: ");
                n = input.nextInt();
                a += n;
                System.out.println("Write how many ml of milk do you want to add: ");
                n = input.nextInt();
                b += n;
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                n = input.nextInt();
                c += n;
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                n = input.nextInt();
                d += n;

            }
            else if (u.equals("take"))
            {
                System.out.println("I gave you $"+e);
                e=0;
            }
        }
    }
}






