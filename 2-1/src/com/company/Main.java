package com.company;

public class Main {

    public static void main(String[] args) {

         Child child=new Child();
         Grandparents grandparents=new Grandparents();
         Parents parents=new Parents();

         grandparents.firstname();
         grandparents.lastname();
         grandparents.age();
         parents.firstname();
         parents.lastname();
         parents.age();
         child.firstname();
         child.lastname();
         child.age();
    }
}
