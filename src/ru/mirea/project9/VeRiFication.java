package ru.mirea.project9;

public class VeRiFication extends Exception {
    public VeRiFication(Account client)
    {
        super("client "+client.getName()+" invalid INN");
    }

    public VeRiFication(String massage)
    {
        super(massage);
    }

    public String toString(Account client)
    {
        return ("client "+client.getName()+" invalid INN");
    }
}