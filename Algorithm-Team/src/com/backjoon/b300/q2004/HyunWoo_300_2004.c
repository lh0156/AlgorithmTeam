#include<stdio.h>
#include<stdlib.h>

int num1,num2,oper,count;

int main(void){
	
	scanf("%d %d",&num1,&num2);
 	
 	oper = num1;
 	
 	
	while (oper >= 5) {
		count += oper / 5;
		oper /= 5;
	}
	
	oper = num2;
	
	while (oper >= 5) {
		count -= oper / 5;
		oper /= 5;
	}
	
	oper = num1 - num2;
	
	while (oper >= 5) {
		count -= oper / 5;
		oper /= 5;
	}
	
	printf("%d",count);
	
	return 0;
}
