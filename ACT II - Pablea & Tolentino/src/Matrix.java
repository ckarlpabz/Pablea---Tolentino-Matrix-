/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Carl Angelo Pablea & Arcee Tolentino
 */
public class Matrix {
    private int SIZE = 4;
    private int[][] square = new int[SIZE][SIZE];
    
    public Matrix() {}
    
    public void addMatrices(Matrix a, Matrix b){
        for(int x = 0; x < SIZE; x++){
            for(int y = 0; y < SIZE; y++){
                this.square[x][y] = a.getCell(x, y) + b.getCell(x, y);
            }
        }
    }
    
    public void setCell(int x, int y, int cellValue){
        this.square[x][y] = cellValue;
    }
    
    public int getCell(int x, int y){
        return this.square[x][y];
    }
    
    public void displayMatrix(){
        for(int a = 0; a < SIZE; a++){
            for(int b = 0; b < SIZE; b++){
               showCell(a,b);
            }
            System.out.println();
        }
    }
    
    public void showCell(int x, int y){
        System.out.print(this.square[x][y] + " ");
    }
}
