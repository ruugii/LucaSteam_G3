package com.LucaSteam;

import services.GameService;
import utilities.DocumentRead;

public class Main {
    public static void main(String[] args) {
        GameService.InicialData(DocumentRead.InicialData("src/resources/files/data.csv"));
    }
}