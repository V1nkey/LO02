/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td_tp_1;

/**
 *
 * @author v1nkey
 */
public class Complexe {
	private float re;
	private float im;
	
	public Complexe()
	{
		re = 0;
		im = 0;
	}
	
	public Complexe(float a, float b)
	{
		re = a;
		im = b;
	}
	
	public Complexe(Complexe z)
	{
		re = z.re;
		im = z.im;
	}
	
	public Complexe conj()
	{
		Complexe z = new Complexe(re, -im);
		return z;
	}
	
	public float module() { return (float)Math.sqrt(re*re + im*im); }
	
	public void product(Complexe z)
	{
		float tmpRe = (re*z.re - im*z.im); 
		float tmpIm = (re*z.im + im*z.re);
		re = tmpRe;
		im = tmpIm;
	}
	
	public void addition(Complexe z)
	{
		re += z.re;
		im += z.im;
	}
	
	public String toString()
	{
		if (im > 0)
			return re + " + i" + im;
		else if (im < 0)
		{
			float tmpIm = -im;
			return re + " - i" + tmpIm;
		}
		else 
			return Float.toString(re);
	}
	
	public boolean equals(Object o)
	{
		if (o.getClass() != Complexe.class)
			return false;
		
		Complexe z = (Complexe)o;
		return ((re == z.re) && (im == z.im));
	}
	
	public float getRe() { return re; }
	public float getIm() { return im; }
}
