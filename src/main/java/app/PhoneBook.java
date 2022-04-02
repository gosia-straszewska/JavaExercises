package app;

import list.StringLinkedList;

import java.util.Scanner;

public class PhoneBook {
    static StringLinkedList phoneBook = new StringLinkedList();
//    static StringArrayList phoneBook = new StringArrayList(1000);

    static Scanner SCANNER = new Scanner(System.in);

    static public int menu() {
        System.out.println("1. Wyświetl wszystkie");
        System.out.println("2. Wyszukaj");
        System.out.println("3. Dodaj numer telefonu");
        System.out.println("4. Usuń");
        System.out.println("0. Koniec");

        if (SCANNER.hasNextInt()) {
            int select = SCANNER.nextInt(); //pobranie od usera danych
            SCANNER.nextLine(); // czyszczenie bufora czyli klikniętego ENTER po wpisanu danych
            return select;
        } else {
            SCANNER.nextLine();
            return -1;
        }
    }

    public static void displayPhoneBook(){
        for (int i = 0; i < phoneBook.size(); i++){
            System.out.println(phoneBook.get(i));
        }
    }

    public static void init(){
        phoneBook.add("600-886-660");
        phoneBook.add("567-890-345");
        phoneBook.add("345-654-235");
    }

    public static void addPhoneNumber(){
        System.out.println("Wpisz nowy numer");
        String item = SCANNER.nextLine();
        phoneBook.add(item);
    }

    public static void findPhoneNumber(){
        System.out.println("Podaj numer");
        String item = SCANNER.nextLine();
        boolean found = false;
        int count = 0;
        for(int i = 0; i < phoneBook.size(); i++){
           if(phoneBook.get(i).equals(item)){
               System.out.println("Istnieje");
               count++;
               found = true;
           }
        }
        if (!found){
            System.out.println("Nie ma takiego numeru");
        } else {
            System.out.println("Numer wyszukano " + count + " raz/y");
        }
    }
//    static == dostęp dla wszystkich obiektów do danej metody.

    public static void removePhoneNumber(){
        System.out.println("Podaj numer pozycji do usunięcia");
        if(SCANNER.hasNextInt()){
            int number = SCANNER.nextInt();
            SCANNER.nextLine();
            phoneBook.remove(number);
        } else {
            SCANNER.nextLine();
            System.out.println("Nie podałeś poprawnej liczby");
        }
    }

    public static void main(String[] args) {
        init();
        while (true) {
            switch (menu()) {
                case 1: {
                    System.out.println("Lista");
                    displayPhoneBook();
                    break;
                }
                case 2: {
                    System.out.println("Szukanie");
                    findPhoneNumber();
                    break;
                }
                case 3: {
                    System.out.println("Dodanie");
                    addPhoneNumber();
                    break;
                }
                case 4: {
                    System.out.println("Usuwanie");
                    break;
                }
                case 0: {
                    System.out.println("Koniec");
                    System.exit(0); // == jak return -> wyjście z programu
                    return;
                }
                default: {
                    System.out.println("Brak takiej opcji");

                }
            }
        }


    }
}

