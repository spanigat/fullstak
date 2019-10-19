package org.capg.app;

public class ComplexNumber 
{
	
double real,img;

	public ComplexNumber(double real, double img) {
	super();
	this.real = real;
	this.img = img;
}
 public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2)
 {
	 ComplexNumber temp=new ComplexNumber(0, 0);
	 temp.real=c1.real+c2.real;
	 temp.img=c1.img+c2.img;
	 return temp;
 }
 public static ComplexNumber diff(ComplexNumber c1,ComplexNumber c2)
 {
	 ComplexNumber temp1=new ComplexNumber(0, 0);
	 temp1.real=c1.real-c2.real;
	 temp1.img=c1.img-c2.img;
	 return temp1;
 }
 public static ComplexNumber product(ComplexNumber c1,ComplexNumber c2)
 {
	 ComplexNumber temp2=new ComplexNumber(0, 0);
	 temp2.real=c1.real*c2.real+c1.img*c2.img;
	 temp2.img=c1.img*c2.real+c2.img*c1.real;
	 return temp2;
 }
 public static void swap(ComplexNumber c1,ComplexNumber c2)
 {
	 ComplexNumber temp3=new ComplexNumber(0, 0);
	 temp3.real=c1.real;
	 c1.real=c2.real;
	 c2.real=temp3.real;
	 temp3.img=c1.img;
	 c1.img=c2.img;
	 c2.img=temp3.img;
	 System.out.println("swapped numbers are :"+" "+c1.real+"+"+c1.img+"i"+" & "+c2.real+"+"+c2.img);
 }
	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(99, 9);
		ComplexNumber c2 = new ComplexNumber(55, 8);
	    ComplexNumber temp = sum(c1, c2);
	    System.out.println("Sum is: "+ temp.real+" + "+ temp.img +"i");
	    ComplexNumber temp1 = diff(c1, c2);
	    System.out.println("difference is: "+ temp1.real+" + "+ temp1.img +"i");
	    ComplexNumber temp2 = diff(c1, c2);
	    System.out.println("product is: "+ temp2.real+" + "+ temp2.img +"i");
	    swap(c1,c2);

	}

}
