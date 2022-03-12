#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

int main_2745(void){
	
	char inputString[2001] = "";
	int result = 0;
	int i,inputNumber = 0;
	
	scanf("%s",inputString);
	scanf("%d",&inputNumber);
	
	for(i=0;i<strlen(inputString);i++){
		
		int num = (int)inputString[i];
		
		if(num < (int)'A' || num > (int)'Z') {
			num -= (int)'0';
		} else {
			num -= (int)'A' - 10;				
		}
		
		result += pow(inputNumber, strlen(inputString) - i - 1) * num;
		
	}
		
	printf("%d",result);
	
	return 0 ;
}
