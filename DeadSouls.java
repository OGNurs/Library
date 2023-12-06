package com.company;

import java.text.ParseException;

public class DeadSouls extends Book implements ReceivePass {
    @Override
    public void receive() throws ParseException {
        System.out.println("¬ы вз€ли книгу " + super.getName() + " автора " + super.getAuthor() + " 01 декабр€ 2023 года");
    }

    @Override
    public void pass() {
        System.out.println("¬ы должны сдать книгу " + super.getName() + " автора " + super.getAuthor() + " через 14 дней(15 декабр€ 2023 года)");
    }

    public DeadSouls(String name, String author) {
        super(name, author);
    }

    public DeadSouls() {
    }
}
