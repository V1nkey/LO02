/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import collections.Carte;
import collections.Enums;
import collections.Game;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author v1nkey
 */
public class TD_TP_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// ************************       EXO 1
//        Scanner scan = new Scanner(System.in);
//        
//        System.out.println("a, b, c ?");
//        
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        
//        Polynome p = new Polynome(a, b, c);
//        System.out.println(p.toString() + "\n");
//        
//        double delta = b*b - 4*a*c;
//        double x1 = 0, x2 = 0;
//        
//        if (delta < 0)
//            System.out.println("Pas de solution\n");
//        
//        else if (delta == 0)
//        {
//            x1 = -b / (2*a);
//            System.out.println("Solution : x = " + x1);
//        }
//        else
//        {
//            x1 = (-b + Math.sqrt(delta)) / (2*a);
//            x2 = (-b - Math.sqrt(delta)) / (2*a);
//            
//            System.out.println("x1 = " + x1);
//            System.out.println("x2 = " + x2);
//        }  

// ************************       EXO 2
//        int matArray1[][] = { {1,2,3},{4,5,6} };
//        int matArray2[][] = { {1,2},{3,4},{5,6} };
//        
//        Matrix M = new Matrix(2, 3, matArray1);
//        Matrix M2 = new Matrix(3, 2, matArray2);
//        
//        System.out.println(M.toString());
//        System.out.println(M2.toString());
//        
//        Matrix res = M.multiplication(M2).toString();
//        
//        if (res == null)
//          System.out.println("Multiplication impossible);
//        else
//          System.out.println("res.toString());

// ************************       EXO 3
//        int nb = 15;
//        int base = 2;
//        
//        String conversionTab = "0123456789ABCDEF";
//        
//        String newNb = "";
//        
//        int q = nb;
//        int r = 0;
//        
//        do
//        {
//            r = q % base;
//            q /= base;
//            
//            newNb = conversionTab.substring(r, r+1) + newNb;
//        } while (q != 0);
//        
//        System.out.println(nb + " = " + newNb + " en base " + base);

// ************************       Collections
//
//        Set<Integer> hs = new HashSet();
//        List<Integer> al = new ArrayList();
//        
//        for (int i = 0; i < 10; i++)
//        {
//            int value = (int)(Math.random() * 101);
//            hs.add(new Integer(value));
//        }
//        
//        for (int i = 0; i < 10; i++)
//        {
//            int value = (int)(Math.random() * 101);
//            al.add(new Integer(value));
//        }
//        
//        System.out.println("HashSet");
//        for (Integer i : hs)
//            System.out.print(i + "\t");
//        System.out.println();
//        
//        System.out.println("ArrayList");
//        for (Integer i : al)
//            System.out.print(i + "\t");
        
        Game bataille = new Game();
        bataille.initGame();
        bataille.play();
        
        
    }
}
