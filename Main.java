package com.company;

import java.util.*;


public class Main {
        public static void checkGameboardO(char[][] gameboard){
            for(int i = 0; i < 3; i++){
                if(gameboard[0][i] == 'O'){
                    if(gameboard[0][i] == gameboard[1][i] && gameboard[1][i] == gameboard[2][i]){
                        System.out.println(gameboard[0][2] + "|" + gameboard[1][2] + "|" + gameboard[2][2]);
                        System.out.println("-+-+-");
                        System.out.println(gameboard[0][1] + "|" + gameboard[1][1] + "|" + gameboard[2][1]);
                        System.out.println("-+-+-");
                        System.out.println(gameboard[0][0] + "|" + gameboard[1][0] + "|" + gameboard[2][0]);
                        System.out.println("p1 wins!!!");
                        System.exit(0);
                    }
                }
                if (gameboard[i][0] == 'O') {
                    if (gameboard[i][0] == gameboard[i][1] && gameboard[i][1] == gameboard[i][2]) {
                        System.out.println(gameboard[0][2] + "|" + gameboard[1][2] + "|" + gameboard[2][2]);
                        System.out.println("-+-+-");
                        System.out.println(gameboard[0][1] + "|" + gameboard[1][1] + "|" + gameboard[2][1]);
                        System.out.println("-+-+-");
                        System.out.println(gameboard[0][0] + "|" + gameboard[1][0] + "|" + gameboard[2][0]);
                        System.out.println("p1 wins!!!");
                        System.exit(0);
                    }
                }
                if(gameboard[i][i] == 'O'){
                    if(gameboard[0][0] == gameboard[1][1] && gameboard[1][1] == gameboard[2][2]){
                        System.out.println(gameboard[0][2] + "|" + gameboard[1][2] + "|" + gameboard[2][2]);
                        System.out.println("-+-+-");
                        System.out.println(gameboard[0][1] + "|" + gameboard[1][1] + "|" + gameboard[2][1]);
                        System.out.println("-+-+-");
                        System.out.println(gameboard[0][0] + "|" + gameboard[1][0] + "|" + gameboard[2][0]);
                        System.out.println("p1 wins!!!");
                        System.exit(0);
                    }
                }
                if(gameboard[2][0] == 'O'){
                    if(gameboard[0][2] == gameboard[1][1] && gameboard[1][1] == gameboard[2][0]){
                        System.out.println(gameboard[0][2] + "|" + gameboard[1][2] + "|" + gameboard[2][2]);
                        System.out.println("-+-+-");
                        System.out.println(gameboard[0][1] + "|" + gameboard[1][1] + "|" + gameboard[2][1]);
                        System.out.println("-+-+-");
                        System.out.println(gameboard[0][0] + "|" + gameboard[1][0] + "|" + gameboard[2][0]);
                        System.out.println("p1 wins!!!");
                        System.exit(0);
                    }
                }
            }
        }


        public static void checkGameboardX(char[][] gameboard){
            for(int i = 0; i < 3; i++){
                if(gameboard[0][i] == 'X'){
                    if(gameboard[0][i] == gameboard[1][i] && gameboard[1][i] == gameboard[2][i]){
                        System.out.println(gameboard[0][2] + "|" + gameboard[1][2] + "|" + gameboard[2][2]);
                        System.out.println("-+-+-");
                        System.out.println(gameboard[0][1] + "|" + gameboard[1][1] + "|" + gameboard[2][1]);
                        System.out.println("-+-+-");
                        System.out.println(gameboard[0][0] + "|" + gameboard[1][0] + "|" + gameboard[2][0]);
                        System.out.println("p2 wins!!!");
                        System.exit(0);
                    }
                    if(gameboard[i][0] == 'X'){
                        if(gameboard[i][0] == gameboard[i][1] && gameboard[i][1] == gameboard[i][2]){
                            System.out.println(gameboard[0][2] + "|" + gameboard[1][2] + "|" + gameboard[2][2]);
                            System.out.println("-+-+-");
                            System.out.println(gameboard[0][1] + "|" + gameboard[1][1] + "|" + gameboard[2][1]);
                            System.out.println("-+-+-");
                            System.out.println(gameboard[0][0] + "|" + gameboard[1][0] + "|" + gameboard[2][0]);
                            System.out.println("p2 wins!!!");
                            System.exit(0);
                        }
                    }
                    if(gameboard[i][i] == 'X'){
                        if(gameboard[0][0] == gameboard[1][1] && gameboard[1][1] == gameboard[2][2]){
                            System.out.println(gameboard[0][2] + "|" + gameboard[1][2] + "|" + gameboard[2][2]);
                            System.out.println("-+-+-");
                            System.out.println(gameboard[0][1] + "|" + gameboard[1][1] + "|" + gameboard[2][1]);
                            System.out.println("-+-+-");
                            System.out.println(gameboard[0][0] + "|" + gameboard[1][0] + "|" + gameboard[2][0]);
                            System.out.println("p2 wins!!!");
                            System.exit(0);
                        }
                    }
                    if(gameboard[2][0] == 'X'){
                        if(gameboard[0][2] == gameboard[1][1] && gameboard[1][1] == gameboard[2][0]){
                            System.out.println(gameboard[0][2] + "|" + gameboard[1][2] + "|" + gameboard[2][2]);
                            System.out.println("-+-+-");
                            System.out.println(gameboard[0][1] + "|" + gameboard[1][1] + "|" + gameboard[2][1]);
                            System.out.println("-+-+-");
                            System.out.println(gameboard[0][0] + "|" + gameboard[1][0] + "|" + gameboard[2][0]);
                            System.out.println("p2 wins!!!");
                            System.exit(0);
                        }
                    }
                }
            }
        }

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int[] pOneTurn = {0,0};
            int[] pTwoTurn = {0,0};
            String[] p;
            String pOne;
            int count = 0;
            char[][] gameboard = {
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
            };
            System.out.println("Insert coordinates separated by space bar(e.g. \"2 1\" for bottom-middle square)");

            while(true) {
                System.out.println(gameboard[0][2] + "|" + gameboard[1][2] + "|" + gameboard[2][2]);
                System.out.println("-+-+-");
                System.out.println(gameboard[0][1] + "|" + gameboard[1][1] + "|" + gameboard[2][1]);
                System.out.println("-+-+-");
                System.out.println(gameboard[0][0] + "|" + gameboard[1][0] + "|" + gameboard[2][0]);
                System.out.print("p1 turn:");
                pOne = scanner.nextLine();
                System.out.println();
                p = pOne.split(" ");

                for (int i = 0; i < 2; i++) {
                    pOneTurn[i] = Integer.parseInt(p[i]);
                }
                System.out.println(Arrays.toString(pOneTurn));
                while(true) {
                    if (gameboard[pOneTurn[0] - 1][pOneTurn[1] - 1] != 'X' && gameboard[pOneTurn[0] - 1][pOneTurn[1] - 1] !='O'){
                        gameboard[(pOneTurn[0] - 1)][(pOneTurn[1] - 1)] = 'O';
                        count++;
                        break;
                    }else if(gameboard[pOneTurn[0] - 1][pOneTurn[1] - 1] == 'X' | gameboard[pOneTurn[0] - 1][pOneTurn[1] - 1] == 'O'){
                        System.out.print("please select a location that is not taken:");
                        pOne = scanner.nextLine();
                        p = pOne.split(" ");
                        for (int i = 0; i < 2; i++) {
                            pOneTurn[i] = Integer.parseInt(p[i]);
                        }
                    }
                }
                checkGameboardO(gameboard);
                if (count == 5) {
                    System.out.println("tie!");
                    System.exit(0);
                }










                //player two's turn

                System.out.println(gameboard[0][2] + "|" + gameboard[1][2] + "|" + gameboard[2][2]);
                System.out.println("-+-+-");
                System.out.println(gameboard[0][1] + "|" + gameboard[1][1] + "|" + gameboard[2][1]);
                System.out.println("-+-+-");
                System.out.println(gameboard[0][0] + "|" + gameboard[1][0] + "|" + gameboard[2][0]);
                System.out.print("p2 turn:");
                String pTwo = scanner.nextLine();
                System.out.println();
                String[] l = pTwo.split(" ");

                for (int i = 0; i < 2; i++) {
                    pTwoTurn[i] = Integer.parseInt(l[i]);
                }
                System.out.println(Arrays.toString(pOneTurn));

                while(true) {
                    if (gameboard[pTwoTurn[0] - 1][pTwoTurn[1] - 1] != 'X' && gameboard[pTwoTurn[0] - 1][pTwoTurn[1] - 1] !='O'){
                        gameboard[(pTwoTurn[0] - 1)][(pTwoTurn[1] - 1)] = 'X';
                        break;
                    }else if(gameboard[pTwoTurn[0] - 1][pTwoTurn[1] - 1] == 'X' | gameboard[pTwoTurn[0] - 1][pTwoTurn[1] - 1] == 'O'){
                        System.out.print("please select a location that is not taken:");
                        pTwo = scanner.nextLine();
                        p = pTwo.split(" ");
                        for (int i = 0; i < 2; i++) {
                            pTwoTurn[i] = Integer.parseInt(p[i]);
                        }
                    }
                }

                checkGameboardX(gameboard);

            }
        }
    }






