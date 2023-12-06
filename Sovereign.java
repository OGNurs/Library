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
        System.out.println("�� ����� ����� " + super.getName() + " ������ " + super.getAuthor() + " 30 ��� 2023 ����");
    }

    @Override
    public void pass() {
        System.out.println("�� ������ ����� ����� " + super.getName() + " ������ " + super.getAuthor() + " ����� 14 ����(13 ���� 2023 ����)");
    }

    public Sovereign(String name, String author, String genre) {
        super(name, author, genre);
    }

    public Sovereign() {
    }

}
