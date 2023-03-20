package Toysgame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private List<Toy> listToys = new ArrayList<>();
    private int toy_count;

    public List<Toy> getToys() {
        return listToys;
    }

    public int getToy_count() {
        System.out.println("Количество игрушек в розыгрыше = ");
        return toy_count;
    }

    // добавить игрушку в розыгрыш
    public List<Toy> add_toy(Toy name) {
        listToys.add(name);
        toy_count++;
        return listToys;
    }

    // удалить игрушку из спискка по id
    private List<Toy> del_toy(int i) {
        listToys.get(i).setQuantity(listToys.get(i).getQuantity()-1);
        return listToys;
    }

    // запись выигрышных игрушек в файл ".txt"
    private void saveInFile(int i) {
        try (FileWriter writer = new FileWriter("wone_toys.txt", true)) {
            String text = listToys.get(i).getName();
            writer.write(text + "\n");  
            writer.close();
        } catch (Exception ex) {
            System.out.println("Ошибка записи файла");
        }
    }

    // чтение файла с выигранными игрушками
    public void readFile() {
        try {
            FileReader fr = new FileReader("wone_toys.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (Exception ex) {
            System.out.println("Ошибка чтения файла");
        }
    }

    // непосредственно розыгрыш
    public void Give_a_Chance() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nКрути барабан, посмотри какая игрушка тебе выпадет (Выбери скорость вращения барабана от 1 до 3)");
        int any = Integer.parseInt(scan.next());
    
        // создаю список доступных игрушек
        List<Integer> ava = new ArrayList<>();
        for (int i=0; i<listToys.size(); i++){
            if(listToys.get(i).getQuantity()>0){
                ava.add(listToys.get(i).getId());
            }
        }

            if (any >= 1 && any <= 3) {
                Random rnd = new Random();
                int num = rnd.nextInt(10);
                if(ava.contains(num) != true){
                    System.out.println("ты проиграл ((");
                }
                else{
                    System.out.println("ПОЗДРАВЛЯЮ!!! Вы выиграли игрушку: " + listToys.get(num-1).getName());
                    saveInFile(num-1);
                    del_toy(num-1);
                }
            }

            else System.out.println("введенно некорректное значение");

        }
        
}
