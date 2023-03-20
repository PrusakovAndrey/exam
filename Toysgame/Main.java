package Toysgame;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        
        Toy Beast = new Toy(1,"Beast", 3, 6);
        Toy Lion = new Toy(2,"Lion", 18, 5);
        Toy Barby = new Toy(3,"Barby", 3, 4);
        Toy Car = new Toy(4,"Car", 4, 3);
        Toy Robbot = new Toy(5,"Robot", 3, 1);
        Toy Phone = new Toy(6,"Phone", 7, 2);
        Toy MammyLongLegs = new Toy(7,"MammyLongLegs", 8, 7);
    
        //cоздаю банк игрушек и наполняю его
        Game chance_game = new Game();
        chance_game.add_toy(Beast);
        chance_game.add_toy(Lion);
        chance_game.add_toy(Barby);
        chance_game.add_toy(Car);
        chance_game.add_toy(Robbot);
        chance_game.add_toy(Phone);
        chance_game.add_toy(MammyLongLegs);

        chance_game.Give_a_Chance();
        

    }
}


    
