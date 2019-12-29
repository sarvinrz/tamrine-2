package com.company;

public class Longtermdeposit extends Account {

    public Longtermdeposit(int mojodi){
        super(mojodi);
    }
    @Override
    void getmoney(int x)throws getmoneyExp{
        System.out.println("start process...");
        if(x>super.mojodi )
        {
            throw new getmoneyExp("not enough money ! ");
        }
        else if (x<=0){
            throw new getmoneyExp("invalid amount of money !");
        }
        else if (x>3000000){
            throw new getmoneyExp("you cant get this much money!");
        }
        else{
            super.mojodi -=x;
            System.out.println("transferd successfully ");
            System.out.println("your balance is : "+super.mojodi);
        }
        System.out.println("end process");
    }

    @Override
    void setmoney(int x) throws setmoneyExp{
        System.out.println("start process...");
        if(x<=0){
            throw new setmoneyExp("invalid amount of money !");
        }
        else if (x>30000000){
            throw new setmoneyExp("you cant settle this much money !");
        }
        else {
            super.mojodi +=x;
            System.out.println("transsfered successfully ");
            System.out.println("ypur balanve is "+super.mojodi);
        }
        System.out.println("end process ");
    }
    @Override
    void profit(){
        double x =super.mojodi;
        x=(x*0.15);
        System.out.println("your profit is :"+x);;
    }
}
