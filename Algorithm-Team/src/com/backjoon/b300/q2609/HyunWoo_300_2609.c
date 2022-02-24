#include <stdio.h>
#include <stdlib.h>

int *preNum;
int *num;

void swip(int *preNum , int *num );

int main(){
	
	int num1;
	int num2;
	int i;
	
	scanf("%d %d",&num1,&num2);
	
	swip(&num1,&num2);
	
	for(i=num2;i>=1;i--){
		
		if(num1%i==0 && num2%i==0){
			printf("%d\n",i);
			printf("%d\n",num1*num2/i);
			break;
		}
		
	}
	
	return 0;
}

void swip(int *preNum , int *num ){
	
	int temp;
	
	if(*preNum > *num) {
		
	}else{
		temp = *num;
		*num = *preNum;
		*preNum = temp;
	}
	
}
