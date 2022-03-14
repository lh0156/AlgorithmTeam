#include<stdio.h>

int main(void){
	
	int i,num;
	
	scanf("%d",&num);
	 
	for(i = 2; i <= num; i++) {
		while(num % i == 0) {
			printf("%d\n",i);
			num /= i;
		}
	}
	
	return 0 ;
}
