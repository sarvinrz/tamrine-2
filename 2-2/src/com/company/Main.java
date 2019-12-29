package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("creating account ");
        System.out.println("please enter balance : ");
        int balance1 = input.nextInt();




        System.out.println("1-borrowdeposit\n2-longterm deposit\n3-shortterm deposit");
        int creatacc = input.nextInt();
        switch (creatacc){
            case 1:Account account=new Borrowdeposit(balance1);break;
            case 2:Account account1=new Longtermdeposit(balance1);break;
            case 3:Account account2=new Shorttermdeposit(balance1);break;

            default:System.out.println("number doesnt exist");
        }


        while (true){
            System.out.println("1-getmoney \n2-setmoney \n3-profit");
            int menu=input.nextInt();
            switch (menu){
                case 1:
                    System.out.println("enter cash you want : ");
                    int cash=input.nextInt();
                    try {
                        account.getmoney(cash);
                    }catch (getmoneyExp getmoneyExp){
                        getmoneyExp.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("how much money you want to settle :");
                    int cash1=input.nextInt();
                    try {
                        account.setmoney(cash1);
                    }catch (setmoneyExp setmoneyExp){
                        setmoneyExp.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.println("your profit is : "+account.profit);

            }
        }


    }
}
