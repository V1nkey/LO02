/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td_tp_1;

import java.util.Random;

/**
 *
 * @author v1nkey
 */
public class Matrix {
    private int m;
    private int n;
    
    private int[][] matrix;
    
    Matrix (int n)
    {
        this.n = n;
        this.m = n;
        
        this.matrix = new int[n][n];
        
        Random rand = new Random();
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = rand.nextInt(10 + 1);
    }
    
    Matrix (int m, int n)
    {
        this.n = n;
        this.m = m;
        
        this.matrix = new int[m][n];
        
        Random rand = new Random();
        
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = rand.nextInt(10 + 1);
    }
    
    Matrix (int m, int n, int[][] matrix)
    {
        this.n = n;
        this.m = m;
        
        this.matrix = matrix;
    }
    
    public Matrix multiplication(Matrix mat)
    {
        if (this.n != mat.getM())
            return null;
        
        int[][] newMatArray = new int[this.m][mat.getN()];
        
        for (int i = 0; i < this.m; i++)
            for (int j = 0; j < mat.getN(); j++)
                for (int k = 0; k < this.n; k++)
                    newMatArray[i][j] += this.matrix[i][k] * mat.getMatrix()[k][j];
        
        Matrix result = new Matrix (this.m, mat.getN(), newMatArray);
        
        return result;
    }

    public int getM() { return m; }
    public int getN() { return n; }
    public int[][] getMatrix() { return matrix; }
    
    @Override
    public String toString()
    {
        String str = "";
        
        for (int i = 0; i < this.m; i++)
        {
            for (int j = 0; j < this.n; j++)
                str += this.matrix[i][j] + "\t";
            str += "\n";
        }
        
        return str;
    }
    
}
