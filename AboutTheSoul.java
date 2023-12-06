package com.company;

import java.text.ParseException;

public class AboutTheSoul extends Book implements ReceivePass {
    @Override
    public void receive() throws ParseException {
        System.out.println("¬ы вз€ли книгу " + super.getName() + " автора " + super.getAuthor() + " 12 декабр€ 2023 года");
    }

    @Override
    public void pass() {
        System.out.println("¬ы должны сдать книгу " + super.getName() + " автора " + super.getAuthor() + " через 14 дней(26 декабр€ 2023 года)");
    }

    public AboutTheSoul(String name, String author) {
        super(name, author);
    }

    public AboutTheSoul() {
    }
}
