package pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SerwisNapraw {

    public static void main(String[] args) {

        List<String> kolejka = new ArrayList<>();

        Stack<String> historia = new Stack<>();

        kolejka.add("Laptop Dell");
        kolejka.add("Telefon iPhone");
        kolejka.add("Monitor LG");
        kolejka.add("Konsola PS5");

        System.out.println(kolejka);

        String naprawione = kolejka.remove(0);
        historia.push(naprawione);
        System.out.println("Naprawiono: " + naprawione);

        naprawione = kolejka.remove(0);
        historia.push(naprawione);
        System.out.println("Naprawiono: " + naprawione);

        System.out.println("Pozostałe do naprawy:");
        System.out.println(kolejka);

        System.out.println("Ostatnia naprawa:");
        System.out.println(historia.peek());
    }
}
