/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td_tp_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author v1nkey
 */
public class Polynome {
    private float a;
    private float b;
    private float c;

    public Polynome() { a=0; b=0; c=0; }

    public Polynome(float x, float y, float z) { a=x; b=y; c=z; }

    public String toString()
    {
        String str = "";
        if (a!=0)
                str += a + "x^2 + ";

        if (b!=0)
                str += b + "x +";

        if (c!=0)
                str += c;

        return str;
    }

    public List<Complexe> getRoots()
    {
        List<Complexe> roots = new ArrayList();

        float delta = b*b - 4*a*c;

        if (delta == 0)
        {
            float x = -b / (2*a);
            roots.add(new Complexe(x, 0));
        }
        else if (delta > 0)
        {
            float x1 = (-b + (float)Math.sqrt(delta)) / (2*a);
            float x2 = (-b - (float)Math.sqrt(delta)) / (2*a);

            roots.add(new Complexe(x1, 0));
            roots.add(new Complexe(x2, 0));
        }
        else
        {
            float re = -b / (2*a);
            float im1 = (float)Math.sqrt(-delta) / (2*a);
            float im2 = -(float)Math.sqrt(-delta) / (2*a);

            roots.add(new Complexe(re, im1));
            roots.add(new Complexe(re, im2));
        }

        return roots;
    }

    public float getA() { return a; }
    public float getB() { return b; }
    public float getC() { return c; }
}
