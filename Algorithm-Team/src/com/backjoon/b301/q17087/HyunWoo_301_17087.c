#include<stdio.h>
#include<stdlib.h>

int GCD(int a, int b){
  return b ? GCD(b, a % b) : a;
}


int main(void){
	
//	각 거리차 배열 이후 최대 공약수? 

	int num1,num2,i;
	
	scanf("%d %d" , &num1,&num2);
	
	int arr[num1]; 
	
	for(i=0;i<num1;i++) {
		int n=0;
		scanf("%d",&n);
		if(n>num2){
			arr[i] = n-num2;
		}else{
			arr[i] = num2-n;
		}
	}
	
	int result=0;
	
	for(i=0;i<num1;i++){
		
		result = GCD(result,arr[i]);
		
	}
	
	printf("%d",result);
	
} 







