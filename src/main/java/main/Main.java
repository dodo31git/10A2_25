/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package main;

import assets.actors.Enemy;
import assets.actors.Tower;
import gamelogic.Ticks;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import gamelogic.Ticks;
import java.util.Random;
public class Main {
    static int Tickcount = 0;
    static int Tickloop = 1;
    static int wave = 1; 
    public static Tiles[][] lilM;
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");

        Tower p = new Tower(0, 0, null, "Peter");
        System.out.println(p.getName());
        p.setName("fghjklö");
        System.out.println(p.getName());

    public static int wave = 1; 
    public static double Healthbase = 4000.000;
    static  Tiles[][] lilM = new Tiles[35][25];
    
    public static void main(String[] args) {
//Vorbereitung Map Erstlleung
        // TODO code application logic here     
        Ticks m = new Ticks();
        JFrame f = new JFrame();
        f.setLayout(null);
        f.setSize(1920, 1080);
        lilC c = new lilC();
        f.add(c);
        f.setVisible(true);
        f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        int a = 40;

       
        for (int i = 0; i < 35; i++) {

            for (int j = 0; j < 25; j++) {
                lilM[i][j] = new Tiles(i * a, j * a, 1, true);
            }

        }
//Weg 
        lilM[0][13] = new Tiles(0 * a, 13 * a - 30, 3, false);
        lilM[1][13] = new Tiles(1 * a, 13 * a - 30, 4, false);
        lilM[2][13] = new Tiles(2 * a, 13 * a - 30, 5, false);
        lilM[3][13] = new Tiles(3 * a, 13 * a - 30, 6, false);
        lilM[4][13] = new Tiles(4 * a, 13 * a - 30, 7, false);
        lilM[4][14] = new Tiles(4 * a, 14 * a - 30, 8, false);
        lilM[4][15] = new Tiles(4 * a, 15 * a - 30, 9, false);
        lilM[4][16] = new Tiles(4 * a, 16 * a - 30, 10, false);
        lilM[4][17] = new Tiles(4 * a, 17 * a - 30, 11, false);
        lilM[5][17] = new Tiles(5 * a, 17 * a - 30, 12, false);
        lilM[6][17] = new Tiles(6 * a, 17 * a - 30, 13, false);
        lilM[7][17] = new Tiles(7 * a, 17 * a - 30, 14, false);
        lilM[8][17] = new Tiles(8 * a, 17 * a - 30, 15, false);
        lilM[8][16] = new Tiles(8 * a, 16 * a - 30, 16, false);
        lilM[8][15] = new Tiles(8 * a, 15 * a - 30, 17, false);
        lilM[8][14] = new Tiles(8 * a, 14 * a - 30, 18, false);
        lilM[8][13] = new Tiles(8 * a, 13 * a - 30, 19, false);
        lilM[8][12] = new Tiles(8 * a, 12 * a - 30, 20, false);
        lilM[8][11] = new Tiles(8 * a, 11 * a - 30, 21, false);
        lilM[8][10] = new Tiles(8 * a, 10 * a - 30, 22, false);
        lilM[8][9] = new Tiles(8 * a, 9 * a - 30, 23, false);
        lilM[8][8] = new Tiles(8 * a, 8 * a - 30, 24, false);
        lilM[8][7] = new Tiles(8 * a, 7 * a - 30, 25, false);
        lilM[8][6] = new Tiles(8 * a, 6 * a - 30, 26, false);
        lilM[9][6] = new Tiles(9 * a, 6 * a - 30, 27, false);
        lilM[10][6] = new Tiles(10 * a, 6 * a - 30, 28, false);
        lilM[11][6] = new Tiles(11 * a, 6 * a - 30, 29, false);
        lilM[12][6] = new Tiles(12 * a, 6 * a - 30, 30, false);
        lilM[12][7] = new Tiles(12 * a, 7 * a - 30, 31, false);
        lilM[12][8] = new Tiles(12 * a, 8 * a - 30, 32, false);
        lilM[12][9] = new Tiles(12 * a, 9 * a - 30, 33, false);
        lilM[12][10] = new Tiles(12 * a, 10 * a - 30, 34, false);
        lilM[12][11] = new Tiles(12 * a, 11 * a - 30, 35, false);
        lilM[12][12] = new Tiles(12 * a, 12 * a - 30, 36, false);
        lilM[12][13] = new Tiles(12 * a, 13 * a - 30, 37, false);
        lilM[12][14] = new Tiles(12 * a, 14 * a - 30, 38, false);
        lilM[12][15] = new Tiles(12 * a, 15 * a - 30, 39, false);
        lilM[12][16] = new Tiles(12 * a, 16 * a - 30, 40, false);
        lilM[12][17] = new Tiles(12 * a, 17 * a - 30, 41, false);
        lilM[12][18] = new Tiles(12 * a, 18 * a - 30, 42, false);
        lilM[12][19] = new Tiles(12 * a, 19 * a - 30, 43, false);
        lilM[12][20] = new Tiles(12 * a, 20 * a - 30, 44, false);
        lilM[12][21] = new Tiles(12 * a, 21 * a - 30, 45, false);
        lilM[13][21] = new Tiles(13 * a, 21 * a - 30, 46, false);
        lilM[14][21] = new Tiles(14 * a, 21 * a - 30, 47, false);
        lilM[15][21] = new Tiles(15 * a, 21 * a - 30, 48, false);
        lilM[16][21] = new Tiles(16 * a, 21 * a - 30, 49, false);
        lilM[17][21] = new Tiles(17 * a, 21 * a - 30, 50, false);
        lilM[18][21] = new Tiles(18 * a, 21 * a - 30, 51, false);
        lilM[19][21] = new Tiles(19 * a, 21 * a - 30, 52, false);
        lilM[20][21] = new Tiles(20 * a, 21 * a - 30, 53, false);
        lilM[21][21] = new Tiles(21 * a, 21 * a - 30, 54, false);
        lilM[22][21] = new Tiles(22 * a, 21 * a - 30, 55, false);
        lilM[23][21] = new Tiles(23 * a, 21 * a - 30, 56, false);
        lilM[23][20] = new Tiles(23 * a, 20 * a - 30, 57, false);
        lilM[23][19] = new Tiles(23 * a, 19 * a - 30, 58, false);
        lilM[23][18] = new Tiles(23 * a, 18 * a - 30, 59, false);
        lilM[23][17] = new Tiles(23 * a, 17 * a - 30, 60, false);
        lilM[23][16] = new Tiles(23 * a, 16 * a - 30, 61, false);
        lilM[23][15] = new Tiles(23 * a, 15 * a - 30, 62, false);
        lilM[23][14] = new Tiles(23 * a, 14 * a - 30, 63, false);
        lilM[23][13] = new Tiles(23 * a, 13 * a - 30, 64, false);
        lilM[23][12] = new Tiles(23 * a, 12 * a - 30, 65, false);
        lilM[23][11] = new Tiles(23 * a, 11 * a - 30, 66, false);
        lilM[23][10] = new Tiles(23 * a, 10 * a - 30, 67, false);
        lilM[23][9] = new Tiles(23 * a, 9 * a - 30, 68, false);
        lilM[23][8] = new Tiles(23 * a, 8 * a - 30, 69, false);
        lilM[23][7] = new Tiles(23 * a, 7 * a - 30, 70, false);
        lilM[23][6] = new Tiles(23 * a, 6 * a - 30, 71, false);
        lilM[24][6] = new Tiles(24 * a, 6 * a - 30, 72, false);
        lilM[25][6] = new Tiles(25 * a, 6 * a - 30, 73, false);
        lilM[26][6] = new Tiles(26 * a, 6 * a - 30, 74, false);
        lilM[27][6] = new Tiles(27 * a, 6 * a - 30, 75, false);
        lilM[27][7] = new Tiles(27 * a, 7 * a - 30, 76, false);
        lilM[27][8] = new Tiles(27 * a, 8 * a - 30, 77, false);
        lilM[27][9] = new Tiles(27 * a, 9 * a - 30, 78, false);
        lilM[27][10] = new Tiles(27 * a, 10 * a - 30, 79, false);
        lilM[27][11] = new Tiles(27 * a, 11 * a - 30, 80, false);
        lilM[27][12] = new Tiles(27 * a, 12 * a - 30, 81, false);
        lilM[27][13] = new Tiles(27 * a, 13 * a - 30, 82, false);
        lilM[28][13] = new Tiles(28 * a, 13 * a - 30, 83, false);
        lilM[29][13] = new Tiles(29 * a, 13 * a - 30, 84, false);
        lilM[30][13] = new Tiles(30 * a, 13 * a - 30, 85, false);
        lilM[31][13] = new Tiles(31 * a, 13 * a - 30, 86, false);
        lilM[32][13] = new Tiles(32 * a, 13 * a - 30, 87, false);
        lilM[33][13] = new Tiles(33 * a, 13 * a - 30, 88, false);
        lilM[34][13] = new Tiles(34 * a, 13 * a - 30, 89, false);

        //Deko
        lilM[3][6] = new Tiles(3 * a, 6 * a, 2, false);
        lilM[2][2] = new Tiles(2 * a, 2 * a, 2, false);
        lilM[2][3] = new Tiles(2 * a, 3 * a, 2, false);
        lilM[3][5] = new Tiles(3 * a, 5 * a, 2, false);
        lilM[3][2] = new Tiles(3 * a, 2 * a, 2, false);
        lilM[3][3] = new Tiles(3 * a, 3 * a, 2, false);
        lilM[4][3] = new Tiles(4 * a, 3 * a, 2, false);
        lilM[3][4] = new Tiles(3 * a, 4 * a, 2, false);
        lilM[4][4] = new Tiles(4 * a, 4 * a, 2, false);
        lilM[1][1] = new Tiles(1 * a, 1 * a, 2, false);
        lilM[2][1] = new Tiles(2 * a, 1 * a, 2, false);
        lilM[1][2] = new Tiles(1 * a, 2 * a, 2, false);
        lilM[2][2] = new Tiles(2 * a, 2 * a, 2, false);
        lilM[0][0] = new Tiles(0 * a, 0 * a, 2, false);
        lilM[1][0] = new Tiles(1 * a, 0 * a, 2, false);
        lilM[0][1] = new Tiles(0 * a, 1 * a, 2, false);
        lilM[1][1] = new Tiles(1 * a, 1 * a, 2, false);
        lilM[8][0] = new Tiles(8 * a, 0 * a, 2, false);
        lilM[9][0] = new Tiles(9 * a, 0 * a, 2, false);
        lilM[8][1] = new Tiles(8 * a, 1 * a, 2, false);
        lilM[9][1] = new Tiles(9 * a, 1 * a, 2, false);
        lilM[7][0] = new Tiles(7 * a, 0 * a, 2, false);
        lilM[8][0] = new Tiles(8 * a, 0 * a, 2, false);
        lilM[7][1] = new Tiles(7 * a, 1 * a, 2, false);
        lilM[8][1] = new Tiles(8 * a, 1 * a, 2, false);
        lilM[6][0] = new Tiles(6 * a, 0 * a, 2, false);
        lilM[7][0] = new Tiles(7 * a, 0 * a, 2, false);
        lilM[6][1] = new Tiles(6 * a, 1 * a, 2, false);
        lilM[7][1] = new Tiles(7 * a, 1 * a, 2, false);
        lilM[8][1] = new Tiles(8 * a, 1 * a, 2, false);
        lilM[9][1] = new Tiles(9 * a, 1 * a, 2, false);
        lilM[8][2] = new Tiles(8 * a, 2 * a, 2, false);
        lilM[9][2] = new Tiles(9 * a, 2 * a, 2, false);
        lilM[7][1] = new Tiles(7 * a, 1 * a, 2, false);
        lilM[8][1] = new Tiles(8 * a, 1 * a, 2, false);
        lilM[7][2] = new Tiles(7 * a, 2 * a, 2, false);
        lilM[8][2] = new Tiles(8 * a, 2 * a, 2, false);
        lilM[6][1] = new Tiles(6 * a, 1 * a, 2, false);
        lilM[7][1] = new Tiles(7 * a, 1 * a, 2, false);
        lilM[6][2] = new Tiles(6 * a, 2 * a, 2, false);
        lilM[7][2] = new Tiles(7 * a, 2 * a, 2, false);
        lilM[8][2] = new Tiles(8 * a, 2 * a, 2, false);
        lilM[9][2] = new Tiles(9 * a, 2 * a, 2, false);
        lilM[8][3] = new Tiles(8 * a, 3 * a, 2, false);
        lilM[9][3] = new Tiles(9 * a, 3 * a, 2, false);
        lilM[7][2] = new Tiles(7 * a, 2 * a, 2, false);
        lilM[8][2] = new Tiles(8 * a, 2 * a, 2, false);
        lilM[7][3] = new Tiles(7 * a, 3 * a, 2, false);
        lilM[8][3] = new Tiles(8 * a, 3 * a, 2, false);
        lilM[8][3] = new Tiles(8 * a, 3 * a, 2, false);
        lilM[9][3] = new Tiles(9 * a, 3 * a, 2, false);
        lilM[8][4] = new Tiles(8 * a, 4 * a, 2, false);
        lilM[9][4] = new Tiles(9 * a, 4 * a, 2, false);
        lilM[7][3] = new Tiles(7 * a, 3 * a, 2, false);
        lilM[8][3] = new Tiles(8 * a, 3 * a, 2, false);
        lilM[7][4] = new Tiles(7 * a, 4 * a, 2, false);
        lilM[8][4] = new Tiles(8 * a, 4 * a, 2, false);
        lilM[9][0] = new Tiles(9 * a, 0 * a, 2, false);
        lilM[10][0] = new Tiles(10 * a, 0 * a, 2, false);
        lilM[9][1] = new Tiles(9 * a, 1 * a, 2, false);
        lilM[10][1] = new Tiles(10 * a, 1 * a, 2, false);
        lilM[10][0] = new Tiles(10 * a, 0 * a, 2, false);
        lilM[11][0] = new Tiles(11 * a, 0 * a, 2, false);
        lilM[10][1] = new Tiles(10 * a, 1 * a, 2, false);
        lilM[11][1] = new Tiles(11 * a, 1 * a, 2, false);
        lilM[11][0] = new Tiles(11 * a, 0 * a, 2, false);
        lilM[12][0] = new Tiles(12 * a, 0 * a, 2, false);
        lilM[11][1] = new Tiles(11 * a, 1 * a, 2, false);
        lilM[12][1] = new Tiles(12 * a, 1 * a, 2, false);
        lilM[12][0] = new Tiles(12 * a, 0 * a, 2, false);
        lilM[13][0] = new Tiles(13 * a, 0 * a, 2, false);
        lilM[12][1] = new Tiles(12 * a, 1 * a, 2, false);
        lilM[13][1] = new Tiles(13 * a, 1 * a, 2, false);
        lilM[13][0] = new Tiles(13 * a, 0 * a, 2, false);
        lilM[14][0] = new Tiles(14 * a, 0 * a, 2, false);
        lilM[13][1] = new Tiles(13 * a, 1 * a, 2, false);
        lilM[14][1] = new Tiles(14 * a, 1 * a, 2, false);
        lilM[9][1] = new Tiles(9 * a, 1 * a, 2, false);
        lilM[10][1] = new Tiles(10 * a, 1 * a, 2, false);
        lilM[9][2] = new Tiles(9 * a, 2 * a, 2, false);
        lilM[10][2] = new Tiles(10 * a, 2 * a, 2, false);
        lilM[9][2] = new Tiles(9 * a, 2 * a, 2, false);
        lilM[10][2] = new Tiles(10 * a, 2 * a, 2, false);
        lilM[9][3] = new Tiles(9 * a, 3 * a, 2, false);
        lilM[10][3] = new Tiles(10 * a, 3 * a, 2, false);
        lilM[10][1] = new Tiles(10 * a, 1 * a, 2, false);
        lilM[11][1] = new Tiles(11 * a, 1 * a, 2, false);
        lilM[10][2] = new Tiles(10 * a, 2 * a, 2, false);
        lilM[11][2] = new Tiles(11 * a, 2 * a, 2, false);
        lilM[11][1] = new Tiles(11 * a, 1 * a, 2, false);
        lilM[12][1] = new Tiles(12 * a, 1 * a, 2, false);
        lilM[11][2] = new Tiles(11 * a, 2 * a, 2, false);
        lilM[12][2] = new Tiles(12 * a, 2 * a, 2, false);
        lilM[9][3] = new Tiles(9 * a, 3 * a, 2, false);
        lilM[10][3] = new Tiles(10 * a, 3 * a, 2, false);
        lilM[9][4] = new Tiles(9 * a, 4 * a, 2, false);
        lilM[10][4] = new Tiles(10 * a, 4 * a, 2, false);
        lilM[13][1] = new Tiles(13 * a, 1 * a, 2, false);
        lilM[14][1] = new Tiles(14 * a, 1 * a, 2, false);
        lilM[13][2] = new Tiles(13 * a, 2 * a, 2, false);
        lilM[14][2] = new Tiles(14 * a, 2 * a, 2, false);
        lilM[12][1] = new Tiles(12 * a, 1 * a, 2, false);
        lilM[13][1] = new Tiles(13 * a, 1 * a, 2, false);
        lilM[12][2] = new Tiles(12 * a, 2 * a, 2, false);
        lilM[13][2] = new Tiles(13 * a, 2 * a, 2, false);
        lilM[12][2] = new Tiles(12 * a, 2 * a, 2, false);
        lilM[13][2] = new Tiles(13 * a, 2 * a, 2, false);
        lilM[12][3] = new Tiles(12 * a, 3 * a, 2, false);
        lilM[13][3] = new Tiles(13 * a, 3 * a, 2, false);
        lilM[10][2] = new Tiles(10 * a, 2 * a, 2, false);
        lilM[11][2] = new Tiles(11 * a, 2 * a, 2, false);
        lilM[10][3] = new Tiles(10 * a, 3 * a, 2, false);
        lilM[11][3] = new Tiles(11 * a, 3 * a, 2, false);
        lilM[14][0] = new Tiles(14 * a, 0 * a, 2, false);
        lilM[15][0] = new Tiles(15 * a, 0 * a, 2, false);
        lilM[14][1] = new Tiles(14 * a, 1 * a, 2, false);
        lilM[15][1] = new Tiles(15 * a, 1 * a, 2, false);
        lilM[15][0] = new Tiles(15 * a, 0 * a, 2, false);
        lilM[16][0] = new Tiles(16 * a, 0 * a, 2, false);
        lilM[15][1] = new Tiles(15 * a, 1 * a, 2, false);
        lilM[16][1] = new Tiles(16 * a, 1 * a, 2, false);
        lilM[14][2] = new Tiles(14 * a, 2 * a, 2, false);
        lilM[15][2] = new Tiles(15 * a, 2 * a, 2, false);
        lilM[14][3] = new Tiles(14 * a, 3 * a, 2, false);
        lilM[15][3] = new Tiles(15 * a, 3 * a, 2, false);
        lilM[18][0] = new Tiles(18 * a, 0 * a, 2, false);
        lilM[19][0] = new Tiles(19 * a, 0 * a, 2, false);
        lilM[18][1] = new Tiles(18 * a, 1 * a, 2, false);
        lilM[19][1] = new Tiles(19 * a, 1 * a, 2, false);
        lilM[26][0] = new Tiles(26 * a, 0 * a, 2, false);
        lilM[27][0] = new Tiles(27 * a, 0 * a, 2, false);
        lilM[26][1] = new Tiles(26 * a, 1 * a, 2, false);
        lilM[27][1] = new Tiles(27 * a, 1 * a, 2, false);
        lilM[27][1] = new Tiles(27 * a, 1 * a, 2, false);
        lilM[28][1] = new Tiles(28 * a, 1 * a, 2, false);
        lilM[27][2] = new Tiles(27 * a, 2 * a, 2, false);
        lilM[28][2] = new Tiles(28 * a, 2 * a, 2, false);
        lilM[28][0] = new Tiles(28 * a, 0 * a, 2, false);
        lilM[29][0] = new Tiles(29 * a, 0 * a, 2, false);
        lilM[28][1] = new Tiles(28 * a, 1 * a, 2, false);
        lilM[29][1] = new Tiles(29 * a, 1 * a, 2, false);
        lilM[29][2] = new Tiles(29 * a, 2 * a, 2, false);
        lilM[30][2] = new Tiles(30 * a, 2 * a, 2, false);
        lilM[29][3] = new Tiles(29 * a, 3 * a, 2, false);
        lilM[30][3] = new Tiles(30 * a, 3 * a, 2, false);
        lilM[30][1] = new Tiles(30 * a, 1 * a, 2, false);
        lilM[31][1] = new Tiles(31 * a, 1 * a, 2, false);
        lilM[30][2] = new Tiles(30 * a, 2 * a, 2, false);
        lilM[31][2] = new Tiles(31 * a, 2 * a, 2, false);
        lilM[20][2] = new Tiles(20 * a, 2 * a, 2, false);
        lilM[21][2] = new Tiles(21 * a, 2 * a, 2, false);
        lilM[20][3] = new Tiles(20 * a, 3 * a, 2, false);
        lilM[21][3] = new Tiles(21 * a, 3 * a, 2, false);
        lilM[25][2] = new Tiles(25 * a, 2 * a, 2, false);
        lilM[26][2] = new Tiles(26 * a, 2 * a, 2, false);
        lilM[25][3] = new Tiles(25 * a, 3 * a, 2, false);
        lilM[26][3] = new Tiles(26 * a, 3 * a, 2, false);
        lilM[28][3] = new Tiles(28 * a, 3 * a, 2, false);
        lilM[29][3] = new Tiles(29 * a, 3 * a, 2, false);
        lilM[28][4] = new Tiles(28 * a, 4 * a, 2, false);
        lilM[29][4] = new Tiles(29 * a, 4 * a, 2, false);
        lilM[14][5] = new Tiles(14 * a, 5 * a, 2, false);
        lilM[15][5] = new Tiles(15 * a, 5 * a, 2, false);
        lilM[14][6] = new Tiles(14 * a, 6 * a, 2, false);
        lilM[15][6] = new Tiles(15 * a, 6 * a, 2, false);
        lilM[15][5] = new Tiles(15 * a, 5 * a, 2, false);
        lilM[16][5] = new Tiles(16 * a, 5 * a, 2, false);
        lilM[15][6] = new Tiles(15 * a, 6 * a, 2, false);
        lilM[16][6] = new Tiles(16 * a, 6 * a, 2, false);
        lilM[16][5] = new Tiles(16 * a, 5 * a, 2, false);
        lilM[17][5] = new Tiles(17 * a, 5 * a, 2, false);
        lilM[16][6] = new Tiles(16 * a, 6 * a, 2, false);
        lilM[17][6] = new Tiles(17 * a, 6 * a, 2, false);
        lilM[14][6] = new Tiles(14 * a, 6 * a, 2, false);
        lilM[15][6] = new Tiles(15 * a, 6 * a, 2, false);
        lilM[14][7] = new Tiles(14 * a, 7 * a, 2, false);
        lilM[15][7] = new Tiles(15 * a, 7 * a, 2, false);
        lilM[15][6] = new Tiles(15 * a, 6 * a, 2, false);
        lilM[16][6] = new Tiles(16 * a, 6 * a, 2, false);
        lilM[15][7] = new Tiles(15 * a, 7 * a, 2, false);
        lilM[16][7] = new Tiles(16 * a, 7 * a, 2, false);
        lilM[16][6] = new Tiles(16 * a, 6 * a, 2, false);
        lilM[17][6] = new Tiles(17 * a, 6 * a, 2, false);
        lilM[16][7] = new Tiles(16 * a, 7 * a, 2, false);
        lilM[17][7] = new Tiles(17 * a, 7 * a, 2, false);
        lilM[15][7] = new Tiles(15 * a, 7 * a, 2, false);
        lilM[16][7] = new Tiles(16 * a, 7 * a, 2, false);
        lilM[15][8] = new Tiles(15 * a, 8 * a, 2, false);
        lilM[16][8] = new Tiles(16 * a, 8 * a, 2, false);
        lilM[16][7] = new Tiles(16 * a, 7 * a, 2, false);
        lilM[17][7] = new Tiles(17 * a, 7 * a, 2, false);
        lilM[16][8] = new Tiles(16 * a, 8 * a, 2, false);
        lilM[17][8] = new Tiles(17 * a, 8 * a, 2, false);
        lilM[16][8] = new Tiles(16 * a, 8 * a, 2, false);
        lilM[17][8] = new Tiles(17 * a, 8 * a, 2, false);
        lilM[16][9] = new Tiles(16 * a, 9 * a, 2, false);
        lilM[17][9] = new Tiles(17 * a, 9 * a, 2, false);
        lilM[0][16] = new Tiles(0 * a, 16 * a, 2, false);
        lilM[1][16] = new Tiles(1 * a, 16 * a, 2, false);
        lilM[0][17] = new Tiles(0 * a, 17 * a, 2, false);
        lilM[1][17] = new Tiles(1 * a, 17 * a, 2, false);
        lilM[1][16] = new Tiles(1 * a, 16 * a, 2, false);
        lilM[2][16] = new Tiles(2 * a, 16 * a, 2, false);
        lilM[1][17] = new Tiles(1 * a, 17 * a, 2, false);
        lilM[2][17] = new Tiles(2 * a, 17 * a, 2, false);
        lilM[6][20] = new Tiles(6 * a, 20 * a, 2, false);
        lilM[7][20] = new Tiles(7 * a, 20 * a, 2, false);
        lilM[6][21] = new Tiles(6 * a, 21 * a, 2, false);
        lilM[7][21] = new Tiles(7 * a, 21 * a, 2, false);
        lilM[9][22] = new Tiles(9 * a, 22 * a, 2, false);
        lilM[10][22] = new Tiles(10 * a, 22 * a, 2, false);
        lilM[9][23] = new Tiles(9 * a, 23 * a, 2, false);
        lilM[10][23] = new Tiles(10 * a, 23 * a, 2, false);
        lilM[24][22] = new Tiles(24 * a, 22 * a, 2, false);
        lilM[25][22] = new Tiles(25 * a, 22 * a, 2, false);
        lilM[24][23] = new Tiles(24 * a, 23 * a, 2, false);
        lilM[25][23] = new Tiles(25 * a, 23 * a, 2, false);

    

//Runde 1 starten    
 waves(wave);  
    }
    public static void waves(int wave){
        System.out.println("wave:"+wave);
        //Je nach wave unterschiedliche Gegner für die jeweilige Runde spawnen
            switch(wave){
                case 1:
        for (int i = 0; i < 5; i++) {
        Enemy.Standard.add(new Enemy(0.2,0,50,5,0,490,null,"Standard"));     
        }                    
                break;
                case 2:
                    for (int i = 0; i < 4; i++) {
        Enemy.Standard.add(new Enemy(0.2,0,50,5,0,490,null,"Standard"));                          
                    }
                    for (int i = 0; i < 2; i++) {
        Enemy.Tank.add(new Enemy(0.8,0,80,5,0,490,null,"Tank"));                          
                    }
                break;
                case 3:
                    System.out.println("yayyyyy");
                break;
                case 4:
                break;
                case 5:
                break;
                case 6:
                break;
                case 7:
                break;
                case 8:
                break;
                case 9:
                break;
                case 10:
                break;                
            }          
                }            
            
        


   
        
    
//Nächstes Tile bestimmen    
    public static Tiles getNextTile (int old) {
        for (int i = 0; i < lilM.length; i++) {
            for (int j = 0; j < lilM[i].length; j++) {
                if (lilM[i][j].getID() == old+1) {                   
                    return lilM[i][j]; 
                }
            }
        }
        return null;
    }
}
