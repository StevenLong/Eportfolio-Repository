#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    srand((unsigned)time(NULL));

    int noOfGuesses;
    int guess;
    int ans;
    int i;

    printf("Enter no of guesses: ");
    scanf("%d", &noOfGuesses);

    ans = rand()%25;

    for(i =0; i< noOfGuesses; i++){
        printf("Enter guess %d: ", i+1);

        if(guess = ans){
            printf("you win");
            return 0;
        }
        else
    }



    return 0;
}
