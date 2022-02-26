#include<stdio.h>
#include<stdlib.h>

int main(void){
	
	int count;
	int check;
	int result=0;
	int num;
	int i;
	int j;
	
	scanf("%d",&count);
	
	for(i=0;i<count;i++){
		
		check=0;
		scanf("%d",&num);
		for(j=2;j<num;j++){
			if(num%j==0){
				check++;
			}
		}
		if(check==0 && num>1){
			result++;
		}
	}
	
	printf("%d",result);
	
	return 0;
}
