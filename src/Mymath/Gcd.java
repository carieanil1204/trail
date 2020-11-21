/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mymath;

/**
 *
 * @author User
 */
public class Gcd {
    
    private int num1;
    private int num2;
    
    
    
    public Gcd(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    
    public void setnum1(int passed_num1){
        this.num1= passed_num1;
            }
       
    public void setnum2(int passed_num2){
        this.num2= passed_num2;
    }
    public int getGDC(){
        return this.findgcd(num1,num2);
    }
    
     private int findgcd(int a, int b){
       if(b==0){
        return a;
       }
       return findgcd(b,a%b);
   }
        
   public static void main(String[] args){
       
       Gcd gcd = new Gcd(1,2);
      //int a=112, b=543;
       System.out.println("GDC of " + gcd.getGDC());
   }
   
       
}
