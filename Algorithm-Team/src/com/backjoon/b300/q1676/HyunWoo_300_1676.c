#include<stdio.h>
#include<stdlib.h>

int main(void){
	
	int num,count=0;	
	
	scanf("%d",&num);
 
	while (num >= 5) {
		count += num / 5;
		num /= 5;
	}
	
	printf("%d",count);
	
	return 0;
}
