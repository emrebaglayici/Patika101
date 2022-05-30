package MineSweeper;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner scanner=new Scanner(System.in);
    int row, col;
    String[][] map, gameMap;
    Random random;
    int mineCount;
    int[][] mineIndex;
    boolean isOver=false;

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.map = new String[row][col];
        this.gameMap = new String[row][col];
        random = new Random();
        mineCount = ((row * col) / 4);
    }

    void printArr() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(mineIndex));
    }

    void createMap() {
        while (mineCount > 0) {
            int randomRow = random.nextInt(row);
            int randomCol = random.nextInt(col);
            if(!Objects.equals(map[randomRow][randomCol], "*")){
                map[randomRow][randomCol]="*";
                mineCount--;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(!Objects.equals(map[i][j], "*")){
                    map[i][j]="-";
                }
            }
        }

    }
    void printAdminMap(String[][] map){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
    void printClientMap(){
        System.out.println("-----------------");
        for(String[] i:this.gameMap){
            for (String j:i){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    boolean checkRange(int selectedRow,int selectedCol){
        return ((selectedRow<row && selectedCol<col) || (selectedRow>=0 && selectedCol>=0));
    }

    public void run() {
        createMap();
        printAdminMap(map);
        while (!isOver){
            printClientMap();
            System.out.print("Satır = ");
            int selectedRow=scanner.nextInt();
            System.out.print("Sütun = ");
            int selectedCol=scanner.nextInt();
            if(!checkRange(selectedRow,selectedCol)){
                System.out.println("Yanlış seçim yaptınız");
                continue;
            }
            if(checkMine(selectedRow,selectedCol)){
                System.out.println("Game Over ! !");
                break;
            }
            gameMap[selectedRow][selectedCol]=String.valueOf(check(selectedRow,selectedCol));
            map[selectedRow][selectedCol]=String.valueOf(check(selectedRow,selectedCol));
            System.out.println(check(selectedRow,selectedRow));
            if(checkWin()){
                System.out.println("Win");
                break;
            }

        }
    }

    boolean checkWin() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(map[i][j].equals("-")){
                    return false;
                }
            }
        }
        return true;
    }

    boolean checkMine(int selectedRow, int selectedCol) {
        return map[selectedRow][selectedCol].equals("*");
    }
    int check(int selectedRow,int selectedCol){
        int counter=0;
        if(selectedCol-1>=0){
            if(selectedRow-1>=0){
                if(map[selectedRow-1][selectedCol-1].equals("*")){
                    counter++;
                }
            }
            if(selectedRow<col){
                if(map[selectedRow][selectedCol-1].equals("*")){
                    counter++;
                }
            }if(selectedRow+1<col){
                if(map[selectedRow+1][selectedCol-1].equals("*")){
                    counter++;
                }
            }
        }
        if(selectedCol<row){
            if(selectedRow-1>=0){
                if(map[selectedRow-1][selectedCol].equals("*")){
                    counter++;
                }
            }if(selectedRow+1<col){
                if(map[selectedRow+1][1].equals("*")){
                    counter++;
                }
            }
        }
        if(selectedCol+1<row){
            if(selectedRow-1>=0){
                if(map[selectedRow-1][selectedCol+1].equals("*")){
                    counter++;
                }
            }
            if(selectedRow<col){
                if(map[selectedRow][selectedCol+1].equals("*")){
                    counter++;
                }
            }if(selectedRow+1<col){
                if(map[selectedRow+1][selectedCol+1].equals("*")){
                    counter++;
                }
            }
        }
        return counter;
    }
}
