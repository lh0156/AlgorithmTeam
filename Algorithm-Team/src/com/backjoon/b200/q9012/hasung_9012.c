#include<stdio.h>
#include<stdlib.h>

int main(){
    int num = 0;
    scanf("%d",&num);
    char **str; 
    int bool = 1;
    int left = 0;
    str = (char **)malloc(sizeof(char *) * num);

    int i = 0;
    int j = 0;
    for(;i < num; i++){
        str[i] = (char *)malloc(sizeof(char) * 51);
        scanf("%s",str[i]);
    }
    for(i = 0; i < num; i++){

        bool = 1;
        j = 0;
        left = 0;
        while(str[i][j] != '\0'){
            if(str[i][j] == '('){
                left++;

            }
            if(str[i][j] == ')'){

                if(left < 1){
                    bool =  0;
                    break;
                }
                left--;
            }
            j++;
        }
        if(bool == 1 && left == 0){
             printf("YES\n");
        }else{
            printf("NO\n");
        }
    }
    

    return 0;
}
