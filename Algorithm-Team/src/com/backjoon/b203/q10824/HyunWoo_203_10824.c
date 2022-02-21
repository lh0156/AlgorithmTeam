#include <stdio.h>
#include <stdlib.h>

int main(){
	
	long long num1,num2;
	int a,b,c,d;
	char result[2001];
	
	scanf("%d %d %d %d",&a,&b,&c,&d);
	
	sprintf(result,"%d%d",a,b);
	num1 = atoll(result);	
	
	sprintf(result,"%d%d",c,d);
	num2 = atoll(result);
	
	printf("%lld\n",num1+num2);
	
	
	return 0;
}
