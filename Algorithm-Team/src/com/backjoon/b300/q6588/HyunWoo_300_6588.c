#include<stdio.h>
#include<stdlib.h>



int isPrimeNum(int num){
	int i;
	
	for(i=2;i<num;i++) {
		if(num%i==0){
			return 0;
		}
	}
	return 1;		
}

int main(void) {
	
//	0이면 종료
//	홀수 루프를 돌림
//	내부 루프 역시 홀수로 돌림 +소수 
//	입력값과 동일시 브레이크 하며 변수에 값 입력 
//	값이 입력된 상태로 내부 루프를 빠져나오면 외부 루프도 브레이크

	int num,i,j,k,result,count;
	count=0;
	result=0;
	num=1;
	while(1){
		
		scanf("%d",&num);
		if(num>0){
			for(i=3;i<num;i+=2){
				if(isPrimeNum(i)){
					for(j=3;j<num;j+=2){
						
						if(isPrimeNum(j)){
							if(i+j==num){
								result=1;
								printf("%d = %d + %d\n",num,i,j);
								break;
							}	
						}
						
					}
					if(result==1){
						break;
					}else if(i==num-1){
						printf("Goldbach's conjecture is wrong.");
					}else{
						continue;
					}
				}else{
					continue;
				}
			}	
		}else{
			break;
		}
		
		result=0;
	} 
	 
	return 0;
}
