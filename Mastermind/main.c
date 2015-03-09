#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <ctype.h>

int main()
{
    srand((unsigned)time (NULL));

    int menu;
    int difficulty;
    int difficultyBonus;
    int turnCount;
    int turnNo;
    int turnBonus;
    int score = 0;
    int turnsTaken = 0;
    int sized = 7;
    int black = 0;
    int white = 0;
    char coloursEasy[] = "ROYGBIV";
    char coloursHard[] = "ROYGBIV_";
    char guess[4];
    int secret[4] = {9, 9, 9, 9};

    //file handling
    FILE *hs;
    char hsDifficulty;
    int hsScore;
    int hsTurnNo;
    int hsTurnCount;
    int hsFileEmpty = 0;

    printf("Welcome to Mastermind\n======================\nIn this game your objective is to guess a code selected by the computer\nwith in a number of turns selected by you.\n======================\n");
    int exitWhile = 0;
    while(exitWhile == 0){
        printf("To check high scores enter 1, to start the game enter 2 , or 3 for instructions: ");
        scanf("%d", &menu);

        if(menu == 1){      //get High Score
            hs = fopen("highScore.txt", "r+");
            fscanf(hs, "%c %d %d %d", &hsDifficulty, &hsScore, &hsTurnNo, &hsTurnCount);
            fclose(hs);
            fflush(hs);
            if(hsDifficulty == 'E'){
                printf("Difficulty: Easy");
            }
            else if(hsDifficulty == 'M'){
                printf("Difficulty: Medium");
            }
            else if(hsDifficulty == 'H'){
                printf("Difficulty: Hard");
            }
            else if(hsDifficulty == '\0'){
                printf("No high score yet.\n");
                hsFileEmpty = 1;
            }
            else{
                printf("File error, sorry!\n");
            }

            if(hsFileEmpty == 0){
                printf("    Score: %d    Turn: %d/%d\n", hsScore, hsTurnNo, hsTurnCount);
            }
        }
        else if(menu == 2){
            exitWhile = 1;
        }
        else if(menu == 3){
            printf("Mastermind is a code-breaking game.\nThe computer will choose a pattern of four colours which you must then guess with in the given number of turns.\nYou will be given feedback on your guesses after each round.\nWhite counters indicate a correct colour in the wrong place, while a black counter indicates a correct colour in the correct place.\nTo make a guess, enter the first letters of the four colours you wish to guess and then press enter.\n");
        }
        else{
            printf("Invalid input, please enter 1 or 2.\n");
            fflush(stdin);
        }
    }
    printf("\n================================\n");

    exitWhile = 0;
    while(exitWhile == 0)
    {
        printf("\nEnter your prefered difficulty,");
        printf("\n1 for Easy, 2 Medium or 3 for Hard: ");
        scanf(" %d", &difficulty);

        if(difficulty==1){
            exitWhile = 1;    //Red, Orange, Yellow, Green, Blue, Indigo, Violet.
            sized = 7;
            exitWhile = 1;
            difficultyBonus = 100;
            printf("In this mode you must guess a secret code of 4 colours with no blanks or repeats\nThe colours are Red, Orange, Yellow, Green, Blue, Indigo and Violet.\nThey can be typed as R, O, Y, G, B, I and V.");
        }
        else if(difficulty==2){
            //Red, Orange, Yellow, Green, Blue, Indigo, Violet.
            sized = 7;
            exitWhile = 1;
            difficultyBonus = 200;
            printf("In this mode you must guess a secret code of 4 colours with repeats, but no blanks\nThe colours are Red, Orange, Yellow, Green, Blue, Indigo and Violet.\nThey can be typed as R, O, Y, G, B, I and V.");
            printf("\n======================\n");
        }
        else if(difficulty==3){
            //Red, Orange, Yellow, Green, Blue, Indigo, Violet.
            sized = 8;
            exitWhile = 1;
            difficultyBonus = 400;
            printf("In this mode you must guess a secret code of 4 colours with repeats and blanks\nThe colours are Red, Orange, Yellow, Green, Blue, Indigo and Violet.\nThey can be typed as R, O, Y, G, B, I and V. For blanks please use _.");
            printf("\n======================\n");
        }
        else{
            printf("Incorrect input, try again.");
            exitWhile = 0;
            fflush(stdin);
        }
    }

    exitWhile = 0;
    while(exitWhile == 0){

        printf("\nEnter the number of turns(up to 15) you would like to have: ");
        scanf("%d", &turnCount);
        if(turnCount > 15 || turnCount < 1){
            printf("\nThis is an invalid number of turns.\nPlease try again.");
            exitWhile = 0;
            fflush(stdin);
        }
        else{
            printf("\n\nThis game will last for %d turns.\nGood luck!", turnCount);
            exitWhile = 1;
        }
    }

    turnBonus = 150 - (turnCount * 10);
    printf("\n======================\n");
    fflush(stdin);

    //Code selection
    if(difficulty == 1){
        int i;
        int topNo;
        int swapNo;
        int maxNo = sized;
        int orderedArray[sized];
        for(i = 0; i < maxNo; i++){
            orderedArray[i] = i+1;
        }
        printf("\n\n");
        for(i = maxNo - 1; i > 0; i--){
            int pos = rand()%(i+1);
            topNo = orderedArray[i];
            swapNo = orderedArray[pos];
            orderedArray[i] = swapNo;
            orderedArray[pos] = topNo;
        }
        for(i = 0; i<4; i++){
            secret[i] = orderedArray[i];
        }

    }
    else if(difficulty == 2){
        int i;
        for(i = 0; i < 4; i++){
            secret[i] = rand()%(sized);
        }
    }
    else if(difficulty == 3){
        int i;
        for(i = 0; i < 4; i++){
            secret[i] = rand()%(sized)+1;
        }
    }

    //turn control
    int k;
    for(k = turnCount; k > 0; k--){

        turnsTaken++;

        int pass = 0;
        int fail = 0;
        int repeat = 0;
        do{

            printf("\nType the 4 letters you wish to guess and press enter: ");
            scanf("%c%c%c%c", &guess[0], &guess[1], &guess[2], &guess[3]);
            fflush(stdin);

            int i;
            char upper;
            for(i = 0; i < 4; i++){
                upper = guess[i];
                guess[i] = toupper(upper);
            }

            printf("\n\nYour guess is: ");
            printf("%c%c%c%c\n", guess[0], guess[1], guess[2], guess[3]);

            pass = 0;
            fail = 0;
            for(i = 0; i < 4; i++){
                int j;
                for(j = 0; j < sized; j++){
                    if(difficulty == 1 || difficulty == 2){
                        if(guess[i] == coloursEasy[j]){
                            pass = 1;
                        }
                    }
                    else if(difficulty == 3){
                        if(guess[i] == coloursHard[j]){
                            pass = 1;
                        }
                    }
                }



                if(pass == 0){
                    fail = 1;
                }

                pass = 0;
            }

            int j;
            if(difficulty == 1){
                for(i = 0; i<4; i++){
                    for(j = 0; j < 4; j++){
                        if(i != j && guess[i] == guess[j]){
                            fail = 1;
                        }
                    }
                }

            }

            if(fail == 1){
                printf("\nInvalid input.\nValid characters are ");
                if(difficulty == 1){
                    printf("R, O, Y, G, B, I, and V, with no repeats.\n");
                }
                else if(difficulty == 2){
                    printf("R, O, Y, G, B, I, and V, with repeats.\n");
                }
                else if(difficulty == 3){
                    printf("R, O, Y, G, B, I, V, and _,  with repeats.\n");
                }

                printf("\nPlease try again.\n");
            }

        }while(fail == 1);

        //comparison
        //easy array
        if(difficulty == 1 || difficulty == 2){
            int i;
            black = white = 0;
            for(i = 0; i < 4; i++){
                if(guess[i] == coloursEasy[secret[i]-1]){
                    black++;
                }
                else if(guess[i] == coloursEasy[secret[0]-1] || guess[i] == coloursEasy[secret[1]-1] || guess[i] == coloursEasy[secret[2]-1] || guess[i] == coloursEasy[secret[3]-1]){
                    white++;
                }
            }
            printf("White %d \nBlack %d\n", white, black);

            //Win check
            if(black == 4){
                //score calculation
                turnNo = turnCount - turnsTaken;
                score = (turnNo*20) + turnBonus + difficultyBonus;
                printf("Congratulations!\nYou Win!\n\nYour score is %d!", score);
                //High score check
                hs = fopen("highScore.txt", "r+");
                fscanf(hs, "%c %d %d %d", &hsDifficulty, &hsScore, &hsTurnNo, &hsTurnCount);
                if(score > hsScore){
                    printf("\n===============================================\nCongratulations, you have set a new high score!\n===============================================\n");
                    //Saving high score
                    char nhsDif;
                    if(difficulty == 1){
                        nhsDif = 'E';
                    }
                    else if(difficulty == 2){
                        nhsDif = 'M';
                    }
                    else if(difficulty == 3){
                        nhsDif = 'H';
                    }

                    fprintf(hs, "%c %d %d %d", nhsDif, score, turnNo, turnCount);
                    fclose(hs);
                    printf("Your high score has been saved, well done!\n");
                }

                char finish;
                printf("\nThe game is over.\nPress enter to exit.");
                scanf("%c", &finish);
                exit(0);
            }

        }
        else if(difficulty == 3){       //comp Hard Array
            int i;
            black = white = 0;

            for(i = 0; i < 4; i++){
                if(guess[i] == coloursHard[secret[i]-1]){
                    black++;
                }
                else if(guess[i] == coloursHard[secret[0]-1] || guess[i] == coloursHard[secret[1]-1] || guess[i] == coloursHard[secret[2]-1] || guess[i] == coloursHard[secret[3]-1]){
                    white++;
                }
            }
            printf("\nWhite %d \nBlack %d\n", white, black);

            //Win Check
            if(black == 4){
                //Score calculation
                turnNo = turnCount - turnsTaken;
                score = (turnNo*20) + turnBonus + difficultyBonus;
                printf("\nCongratulations!\nYou Win!\n\nYour score is %d!\n", score);
                //high score check
                hs = fopen("highScore.txt", "r+");
                fscanf(hs, "%c %d %d %d", &hsDifficulty, &hsScore, &hsTurnNo, &hsTurnCount);
                fclose(hs);
                fflush(hs);
                if(score > hsScore){
                    printf("\n===============================================\nCongratulations, you have set a new high score!\n===============================================\n");
                    //Saving high score
                    char nhsDif;
                    if(difficulty == 1){
                        nhsDif = 'E';
                    }
                    else if(difficulty == 2){
                        nhsDif = 'M';
                    }
                    else if(difficulty == 3){
                        nhsDif = 'H';
                    }

                    hs = fopen("highScore.txt", "w");
                    fprintf(hs, "%c %d %d %d", nhsDif, score, turnNo, turnCount);
                    fclose(hs);
                    fflush(hs);
                    printf("Your high score has been saved, well done!");
                }

                char finish;
                printf("The game is over.\nPress enter to exit.");
                scanf("%c", &finish);
                exit(0);
            }
        }
    }

    printf("You have run out of chances. The code was ");
    int i;
    for(i = 0; i < 4; i++){
        if(difficulty == 1 || difficulty == 2){
            printf("%c", coloursEasy[secret[i] - 1]);
        }
        else if(difficulty == 3){
            printf("%c", coloursHard[secret[i] - 1]);
        }
    }
    printf("\nBetter luck next time.");
    return 0;
}
