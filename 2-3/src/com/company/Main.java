package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("student name : ");
        String name=scanner.nextLine();
        System.out.println("student Id : ");
        String id=scanner.nextLine();
        System.out.println("student password : ");
        String pass=scanner.nextLine();

        try {
            nameExp( name );
        } catch (com.company.nameExp nameExp) {
            nameExp.printStackTrace();
        }

        try {
            idExp( id );
        } catch (IdExp idExp) {
            idExp.printStackTrace();
        }

        try {
            passwordExp( pass );
        } catch (PasswordExp passwordExp) {
            passwordExp.printStackTrace();
        }
    }

    public static void nameExp (String str) throws nameExp{
         String string="sarvin";
        if (string.equalsIgnoreCase(str ) && string!=null){
            throw new nameExp( "your name is correct " );
        }else{
            System.out.println("your name is false ");
        }
    }

    public static void idExp (String str) throws IdExp{
        String string="971113019";
        if (string.equalsIgnoreCase(str ) && string!=null){
            throw new IdExp( "your id is correct " );
        }else{
            System.out.println("your id is false ");
        }
    }

    public static void passwordExp (String str) throws PasswordExp{
        String string="0899876545";
        if (string.equalsIgnoreCase(str ) && string!=null){
            throw new PasswordExp( "your password is correct " );
        }else{
            System.out.println("your password is false ");
        }
    }
}
