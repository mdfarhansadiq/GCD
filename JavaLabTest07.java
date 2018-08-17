/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabtest07;

/**
 *
 * @author User
 */
public class JavaLabTest07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GCD result = new GCD();
	int a = result.gCd(15,25);
        System.out.println(a);
    }
    
}

class GCD
{      int x,y,gcd;
	public int gCd(int x,int y)
	{      
		if(y==0)
	        return x;
	        return gCd(y,x%y);	
	}
}