#include<stdio.h>

int main(void){
	
	int i,j,num1,num2,start,count;
	
	scanf("%d %d",&num1 , &num2);
	
	start = num1==1 ? 2 : num1;
	
	for(i=start;i<=num2;i++){
		
		count=0;
		
		for(j=2;j<i;j++) if(i%j==0) count++;
		
		if(count==0) printf("%d\n",i);	
		
	}
	
	return 0;
}
