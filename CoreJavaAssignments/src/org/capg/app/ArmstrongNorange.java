package org.capg.app;

public class ArmstrongNorange {
public static void main(String[] args) {
	int num,rem,result=0,limit=999;
	for (int i = 0; i < limit; i++) {
		num=i;
	    while(num>0){
	    	rem=num%10;
	    	result=result+(rem*rem*rem);
	    	num=num/10;
	    }
	    if(result ==i){
	    	System.out.println(i);
	    }
	    result=0;
	}

}
}
