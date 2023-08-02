package com.LucaSteam;

import utilities.DocumentRead;

public class Main {
    public static void main(String[] args) {
        DocumentRead.SaveData("src/resources/files/data.csv", DocumentRead.InicialData("src/resources/files/data.csv"));
    }
}