package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow1=new Cow(200,1,"Buka","Bob");
        Cow cow2=new Cow(220,3,"Buka","Ted");
        Cow cow3=new Cow(230,5,"Kunajyn","Gerda");
        Cow cow4=new Cow(240,7,"Kunajyn","Nessi");
        Cow cow5=new Cow(250,9,"Buka","Tom");
        Cow cow6=new Cow(260,11,"Kunajyn","Jerse");

        Cow[] cows=new Cow[]{cow1,cow2,cow3,cow4,cow5};
        Cow[]cows1=new Cow[]{cow6};

        Sheep sheep1=new Sheep(13,2,"erkek","sheep1");
        Sheep sheep2=new Sheep(15,3,"urgachy","sheep2");
        Sheep sheep3=new Sheep(17,5,"urgachy","sheep3");
        Sheep sheep4=new Sheep(19,9,"urgachy","sheep4");

        Sheep[]sheeps=new Sheep[]{sheep1,sheep2,sheep3,};
        Sheep[]sheeps1=new Sheep[]{sheep4};

        Hors hors1=new Hors(280,2,"Baital","Kok jal", "Kok");
        Hors hors2=new Hors(320,4,"Aigyr","Boika","Toru");
        Hors hors3=new Hors(360,6,"Aigyr","Alai","Toru");

        Hors[] horsA=new Hors[]{hors1,hors2};
        Hors[] horsB=new Hors[]{hors3};
        System.out.println("-----------------------------------------------------");
        System.out.println("            ===>FARM 1<===");
        Farm farm=new Farm("Toktogul",cows,horsA,sheeps,"Aibek");
        System.out.println(farm);

        Farm farm1=new Farm("Alai",cows1,horsB,sheeps1,"Azamat");
        System.out.println("------------------------------------------------------");

        System.out.println("             ===>FARM 2<===");
        System.out.println(farm1);







    }
}
