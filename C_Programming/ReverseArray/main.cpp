#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
    int sized;

    printf("Enter the amount of numbers to be reversed: ");
    scanf("%d", &sized);

    int num[sized];
    int entered;
    int dec = sized;

    for(int i = 0; i < sized; i++){

        printf("Enter No. %d: ", i+1);
        scanf("%d", &entered);
        num[dec] = entered;
        dec--;
    }

    for(int j = 0; j < sized; j++){
        printf("%d ", num[j+1]);
    }

    return 0;
}
