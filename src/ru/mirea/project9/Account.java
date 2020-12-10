package ru.mirea.project9;

public class Account {
    private String INN;
    private String name;

    public Account(String INN, String name) {
        this.INN = INN;
        this.name = name;
    }

    public String get_INN() {
        return INN;
    }

    public String getName() {
        return name;
    }

    public void test_INN(String inn) throws VeRiFication {
        if (inn.length() != 10)
            throw new VeRiFication(this);
    }

    public static void main(String[] args) {
        Account client = new Account("4523567987672912", "Arash.s.");
        try {
            client.test_INN(client.get_INN());
            System.out.println("INN client " + client.getName() + " valid.");
        } catch (VeRiFication e) {
            System.out.println(e.getMessage());
            ;
        }

        Account client1 = new Account("278991236123", "Reshad.A.G.");
        try {
            client1.test_INN(client1.get_INN());
            System.out.println("INN client " + client1.getName() + " valid.");
        } catch (VeRiFication e) {
            System.out.println(e.getMessage());
            ;
        }

        Account client2 = new Account("8912630123", "Farhad.A.");
        try {
            client2.test_INN(client2.get_INN());
            System.out.println("INN client " + client2.getName() + " valid.");
        } catch (VeRiFication e) {
            System.out.println(e.getMessage());
        }
    }
}