using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WarCardGame
{
    public partial class warForm : Form
    {
        
        static string[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        static string[] suits = {"clubs", "diamonds", "hearts", "spades"};
        int[] shuffledDeck = new int[52];
        static Random random = new Random();
        static int counter = 0;
        public int eraseOutput = 0;
        public int playerScore = 0;
        public int compScore = 0;
        public int selectNum;
        String playerCard, computerCard, playerSuit, computerSuit;

        public warForm()
        {
            InitializeComponent();

            dealButton.Visible = true;
            playButton.Visible = false;
        }

        public void FillDeck(object sender, EventArgs e)
        {
            bool foundCard = false;
            int card;
            
            dealButton.Visible = false;
            playButton.Visible = true;

            for (int i = 0; i < shuffledDeck.Length; i++)
            {
                foundCard = false;

                while (foundCard == false)
                {
                    card = random.Next(1, 53);

                    if(Array.IndexOf(shuffledDeck, card) == -1)
                    {
                        shuffledDeck[i] = card;
                        foundCard = true;
                    }
                }
            }
        }


        public int SelectCard()
        {

            if (counter < 26)
            {
                int card = shuffledDeck[counter];
                return card;
            }
            else
            {
                return result(); 
            }

            counter++;
        }

        public void playButton_Click(object sender, EventArgs e)
        {

            int eraseOutput;
            int selectNum, playerNum, compNum, playerTotal, compTotal;
            String playerCard, compCard, playerSuit, compSuit;
            //int playerScore = 0;
            //int compScore = 0; 

            playerTotal = compTotal = eraseOutput =  0;

            if (eraseOutput % 5 == 0)
            {
                outputTextBox.Clear();
            }

            selectNum = SelectCard() - 1;
            compNum = (selectNum - 1) / 4;
            compCard = cards[compNum];

            if(compNum%4 == 1)
            {
                compSuit = suits[0];
            }
            else if(compNum%4 == 2)
            {
                compSuit = suits[1];
            }
            else if (compNum % 4 == 3)
            {
                compSuit = suits[2];
            }
            else
            {
                compSuit = suits[3];
            }

            selectNum = SelectCard() - 1;
            playerNum = (selectNum - 1) / 4;
            playerCard = cards[playerNum];

            if(playerNum%4 == 1)
            {
                playerSuit = suits[0];
            }
            else if(playerNum == 2)
            {
                playerSuit = suits[1];
            }
            else if(playerNum%4 == 2)
            {
                playerSuit = suits[2];
            }
            else
            {
                playerSuit = suits[3];
            }

            switch (compNum)
            { 
                case 1:
                    compCard = cards[compNum];
                    break;
                case 2:
                    compCard = cards[compNum];
                    break;
                case 3:
                    compCard = cards[compNum];
                    break;
                case 4:
                    computerCard = cards[compNum];
                    break;
            }

            if (playerNum > compNum)
            {
                playerTotal += 2;
                playerScoreBox.Text = Convert.ToString(playerTotal);
            }
            else if (playerNum < compNum)
            {
                compTotal += 2;
                compScoreBox.Text = Convert.ToString(compScore);
            }
            else
            {
                playerTotal++;
                compTotal++;
                playerScoreBox.Text = Convert.ToString(playerTotal);
                compScoreBox.Text = Convert.ToString(compScore);
            }

            outputTextBox.AppendText("Deal no." + (counter + 1) + " Player has " + cards[playerNum] + " of " + playerSuit + " Computer has " + cards[compNum] + " of " + compSuit + "\n Player score is " + playerTotal + " Computer score is " + compTotal + ".\n");

            result();
                
            eraseOutput++;
        }

        public int result()
        {
            if (counter < 0)
                return 0;
            else
            {
                outputTextBox.AppendText("GAME OVER\n");
                outputTextBox.AppendText("Final player score" + playerScore + "\nFinal computer score" + compScore + ".\n");

                if (playerScore > compScore)
                {
                    outputTextBox.AppendText("YOU WIN!");
                }
                else if (playerScore < compScore)
                {
                    outputTextBox.AppendText("COMPUTER WINS!");
                }

            }

            return -1;
        }

        private void quitButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
