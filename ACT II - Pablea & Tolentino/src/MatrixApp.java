/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Carl Angelo Pablea & Arcee Tolentino
 */
public class MatrixApp {
    public static void main(String[] args){
        Matrix a = new Matrix();
        a.setCell(0, 0 , 1);
        a.setCell(0, 1, 2);
        a.setCell(0, 2, 3);
        a.setCell(0, 3, 4);
        a.setCell(1, 0, 5);
        a.setCell(1, 1, 6);
        a.setCell(1, 2, 7);
        a.setCell(1, 3, 8);
        a.setCell(2, 0, 9);
        a.setCell(2, 1, 10);
        a.setCell(2, 2, 11);
        a.setCell(2, 3, 12);
        a.setCell(3, 0, 13);
        a.setCell(3, 1, 14);
        a.setCell(3, 2, 15);
        a.setCell(3, 3, 16);
        a.displayMatrix();
        System.out.println();
        
        Matrix b = new Matrix();
        b.setCell(0, 0 , 16);
        b.setCell(0, 1, 15);
        b.setCell(0, 2, 14);
        b.setCell(0, 3, 13);
        b.setCell(1, 0, 12);
        b.setCell(1, 1, 11);
        b.setCell(1, 2, 10);
        b.setCell(1, 3, 9);
        b.setCell(2, 0, 8);
        b.setCell(2, 1, 7);
        b.setCell(2, 2, 6);
        b.setCell(2, 3, 5);
        b.setCell(3, 0, 4);
        b.setCell(3, 1, 3);
        b.setCell(3, 2, 2);
        b.setCell(3, 3, 1);
        b.displayMatrix();
        System.out.println();
        
        Matrix sum = new Matrix();
        sum.addMatrices(a, b);
        sum.displayMatrix();
    }

}
