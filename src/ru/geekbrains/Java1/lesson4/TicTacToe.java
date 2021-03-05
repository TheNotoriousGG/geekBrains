package ru.geekbrains.Java1.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final int SIZE = 5;
    public static final int WIN_CNT = 4;
    public static char[][] map;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    static Scanner scan = new Scanner(System.in);
    static Random rnd = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            System.out.println("Человек сделал ход:");
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("И победил!");
                break;
            }
            if (checkMapFull()) {
                System.out.println("Ничья");
                break;
            }
            if (!checkWinOp()) {
                computerTurn();
            }
            System.out.println("Компьютер сделал ход:");
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("И победил!");
                break;
            }
            if (checkMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончена");
    }

    private static void computerTurn() {
        int xCord;
        int yCord;
        do {
            xCord = rnd.nextInt(SIZE);
            yCord = rnd.nextInt(SIZE);
        } while (!dotValid(xCord, yCord, 'c'));
        map[xCord][yCord] = DOT_O;
    }

    private static boolean checkWinOp() {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (map[r][c] == DOT_EMPTY) {
                    map[r][c] = DOT_X;
                    if (checkWin(DOT_X)) {
                        map[r][c] = DOT_O;
                        return true;
                    } else {
                        map[r][c] = DOT_EMPTY;
                    }
                }
            }
        }
        return false;
    }

    private static boolean checkWin(char symb) {
        if (checkDiagonalV2(symb)) return true;
        if (checkLinesV2(symb)) return true;

        return false;
    }

    private static boolean checkLinesV2(char symb) {
        int rows = 0;
        int cols = 0;
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                rows = (map[r][c] == symb) ? rows += 1 : 0;
                cols = (map[c][r] == symb) ? cols += 1 : 0;

                if (cols == WIN_CNT || rows == WIN_CNT) return true;
            }
        }
        return false;
    }

    private static boolean checkMapFull() {
        boolean mapStat;
        for (int row = 0; row < SIZE; row++) {
            for (int cell = 0; cell < SIZE; cell++) {
                if (map[row][cell] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkDiagonalV2(char s) {
        int winLineL = 0;
        int winLineR = 0;
        boolean toRight = true;
        boolean toLeft = true;
        for (int i = 0; i < SIZE; i++) {
            winLineL = (map[i][i] == s) ? winLineL += 1 : 0;
            winLineR = (map[SIZE - 1 - i][i] == s) ? winLineR += 1 : 0;
            if (winLineL == WIN_CNT || winLineR == WIN_CNT) {
                return true;
            }
        }
        return false;
    }


    private static void humanTurn() {
        int xCord;
        int yCord;
        do {
            System.out.print("Введите координаты строки число от 1 до " + SIZE + ": ");
            xCord = scan.nextInt() - 1;
            System.out.println();
            System.out.print("Введите координаты столбца число от 1 до " + SIZE + ": ");
            yCord = scan.nextInt() - 1;
            System.out.println();
        } while (!dotValid(xCord, yCord, 'h'));
        map[xCord][yCord] = DOT_X;

    }

    private static boolean dotValid(int xCord, int yCord, char who) {
        boolean valStatus = true;
        if (xCord < 0 || xCord > SIZE || yCord < 0 || yCord > SIZE) {

            if (who == 'h') {
                System.out.println("Вы ввели не корректные координаты");
            }
            return false;
        }
        if (map[xCord][yCord] != DOT_EMPTY) {
            if (who == 'h') {
                System.out.println("Ячейка уже занята)");
            }
            return false;
        }

        return true;
    }

    private static void printMap() {
        for (int fstLineVal = 0; fstLineVal <= SIZE; fstLineVal++) {
            System.out.print(fstLineVal + "  ");
        }
        System.out.println();

        for (int row = 0; row < SIZE; row++) {
            System.out.print(row + 1 + "  ");
            for (int cell = 0; cell < SIZE; cell++) {
                System.out.print(map[row][cell] + "  ");
            }
            System.out.println();
        }
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];

        for (int row = 0; row < SIZE; row++) {
            for (int cell = 0; cell < SIZE; cell++) {
                map[row][cell] = DOT_EMPTY;
            }

        }
    }
}
