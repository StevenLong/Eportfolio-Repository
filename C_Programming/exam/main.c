#include <stdio.h>
#include <ctype.h>

#define M -999999999
int main()
{
    printf("Hello world!\n");
    int i;
    int num[5];
    for(i = 0; i <5; i++){
        num[i]= M;
        printf("%d", i+1);
        scanf("%d", &num[i]);
        printf("%d", num[i]);
    }
    printf("Enter");
    char string1[20], str3[] = "hi";
    gets(string1);

    int iVal = 0;
    char str2 = "S";
    int strcmp(string1, str2);
    printf("%d", strcmp);
    //printf("%s", str2);
    do{iVal = 1;}while(iVal == 3);
    //string1 = getc(scanf);
    printf("%s", string1);
    return 0;
}
