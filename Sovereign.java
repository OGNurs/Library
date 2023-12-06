package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Sovereign extends Book implements ReceivePass {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void receive() throws ParseException {
        System.out.println("Вы взяли книгу " + super.getName() + " автора " + super.getAuthor() + " 30 мая 2023 года");
    }

    @Override
    public void pass() {
        System.out.println("Вы должны сдать книгу " + super.getName() + " автора " + super.getAuthor() + " через 14 дней(13 июня 2023 года)");
    }

    public Sovereign(String name, String author, String genre) {
        super(name, author, genre);
    }

    public Sovereign() {
    }

}
