package com.company;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        Sovereign sovereign = new Sovereign("Sovereign", "Makiavelly", "Psychology");
        sovereign.receive();
        sovereign.pass();
        AboutTheSoul aboutTheSoul = new AboutTheSoul();
        aboutTheSoul.setAuthor("Aristotle");
        aboutTheSoul.setName("About The Soul");
        aboutTheSoul.receive();
        aboutTheSoul.pass();
    }
}
