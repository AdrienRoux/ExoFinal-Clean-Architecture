package com.esgi;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            printWrongFormat();
        } else {
            switch (args[0]) {
                case "add" -> add();
                case "list" -> list();
                case "update" -> update();
                case "remove" -> remove();
                default -> printWrongFormat();
            }
        }
    }

    public static void printWrongFormat() {
        System.err.println("Usage: java com.esgi.Main <list/add/update/remove> [options]");
    }


    public static void add() {}

    public static void list() {}

    public static void update() {}

    public static void remove() {}
}
