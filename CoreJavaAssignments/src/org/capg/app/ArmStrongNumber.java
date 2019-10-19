package org.capg.app;

public class ArmStrongNumber {
public static void main(String[] args) {
int num=153;
int result=0,rem,temp=num;
while(num>0){
	rem=num%10;
	result=result+(rem*rem*rem);
	num=num/10;
}
if(result == temp){
	System.out.println("Given no is armstrong");
}
else{
	System.out.println("not armstring");
}
}
}
