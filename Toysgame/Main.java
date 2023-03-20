package Toysgame;


public class Main{
    public static void main(String[] args){
        
        Toy Beast = new Toy(01,"Beast", 4, 6);
        Toy Lion = new Toy(02,"Lion", 10, 5);
        Toy Barby = new Toy(03,"Barby", 5, 4);
        Toy Car = new Toy(04,"Car", 6, 3);
        Toy Robbot = new Toy(05,"Robot", 3, 1);
        Toy Phone = new Toy(06,"Phone", 0, 2);
        Toy MammyLongLegs = new Toy(07,"MammyLongLegs", 8, 7);
    
        //cоздаю банк игрушек и наполняю его
        Game chance_game = new Game();
        chance_game.add_toy(Beast);
        chance_game.add_toy(Lion);
        chance_game.add_toy(Barby);
        chance_game.add_toy(Car);
        chance_game.add_toy(Robbot);
        chance_game.add_toy(Phone);
        chance_game.add_toy(MammyLongLegs);

        
        // // Запускаем розыгрыш с управлением выпадения выигрыша, затем читаем файл
        // toy_lottery.lottteryToy();
        // toy_lottery.readFile();
        // toy_lottery.lottteryToy();
        // toy_lottery.readFile();
        // // Проверяем оставшиеся игрушки в списке
        // toy_lottery.getToys();
        // // просматриваем число игрушек в списке
        // System.out.println(chance_game.getToys());
        // chance_game.getToys();

       
        // System.out.println(chance_game.available());


        // boolean contains = chance_game.available().contains(2);
        // System.out.println(contains);
        chance_game.Give_a_Chance();
        
    }
}


    
