#include<stdio.h>
#include<stdlib.h>

int num,i,result=1;

int main(void){
	
	scanf("%d",&num);
	
	if(num){
		
		for(i=1;i<=num;i++){
			result*=i;
		}
		printf("%d",result);
		
	}else{
		printf("1");
	}
	
	return 0;
}
