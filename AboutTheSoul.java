package com.company;

import java.text.ParseException;

public class AboutTheSoul extends Book implements ReceivePass {
    @Override
    public void receive() throws ParseException {
        System.out.println("�� ����� ����� " + super.getName() + " ������ " + super.getAuthor() + " 12 ������� 2023 ����");
    }

    @Override
    public void pass() {
        System.out.println("�� ������ ����� ����� " + super.getName() + " ������ " + super.getAuthor() + " ����� 14 ����(26 ������� 2023 ����)");
    }

    public AboutTheSoul(String name, String author) {
        super(name, author);
    }

    public AboutTheSoul() {
    }
}
