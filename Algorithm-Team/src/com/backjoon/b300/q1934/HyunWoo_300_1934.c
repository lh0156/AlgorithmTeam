#include <stdio.h>
#include <stdlib.h>

int *preNum;
int *num;

void swip(int *preNum , int *num );

int main(){
	
	int count;
	int num1;
	int num2;
	int i;
	int j;
	scanf("%d",&count);
	int resultArr[count];
	
	for(j=0;j<count;j++){
		
		scanf("%d %d",&num1,&num2);
		
		swip2(&num1,&num2);
		
		for(i=num2;i>=1;i--){
			
			if(num1%i==0 && num2%i==0){
//				printf("%d\n",i);
				resultArr[j]=num1*num2/i;
//				printf("%d\n",num1*num2/i);
				break;
			}
			
		}
	}
	
	for(i=0;i<count;i++){
		printf("%d\n",resultArr[i]);
	}
	
	return 0;
}

void swip2(int *preNum , int *num ){
	
	int temp;
	
	if(*preNum > *num) {
		
	}else{
		temp = *num;
		*num = *preNum;
		*preNum = temp;
	}
	
}
