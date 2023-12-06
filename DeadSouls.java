package com.company;

import java.text.ParseException;

public class DeadSouls extends Book implements ReceivePass {
    @Override
    public void receive() throws ParseException {
        System.out.println("�� ����� ����� " + super.getName() + " ������ " + super.getAuthor() + " 01 ������� 2023 ����");
    }

    @Override
    public void pass() {
        System.out.println("�� ������ ����� ����� " + super.getName() + " ������ " + super.getAuthor() + " ����� 14 ����(15 ������� 2023 ����)");
    }

    public DeadSouls(String name, String author) {
        super(name, author);
    }

    public DeadSouls() {
    }
}
