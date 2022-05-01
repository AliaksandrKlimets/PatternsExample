package com.company.adapter2;

public class AdapterMain2 {

    public static void main(String[] args) {
        RussianName name = new RussianName("Саша");
        EnglishName englishName = new EnglishName("Alex");
        Welcomer welcomer = new Welcomer();

        welcomer.welcome(name);
        NameAdapter adapter = new NameAdapter(englishName);
        welcomer.welcome(adapter);

    }
}
