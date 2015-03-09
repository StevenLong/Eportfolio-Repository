using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace RPSForm
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        public string playerChoice { get; set; }
        public string computerChoice { get; set; }
        public int playerScore = 0;
        public int computerScore = 0;
        System.Drawing.Bitmap paper = RPSForm.Properties.Resources.picPaper;
        System.Drawing.Bitmap rock = RPSForm.Properties.Resources.picRock;
        System.Drawing.Bitmap scissors = RPSForm.Properties.Resources.picScissors;

        private void buttonQuit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void buttonRock_Click(object sender, EventArgs e)
        {
            playerChoice = "Rock";
            picturePlayer.Image = new Bitmap(rock);
            picComputer.Image = null;
        }

        private void buttonPaper_Click(object sender, EventArgs e)
        {
            playerChoice = "Paper";
            picturePlayer.Image = new Bitmap(paper);
            picComputer.Image = null;
        }

        private void buttonScissors_Click(object sender, EventArgs e)
        {
            playerChoice = "Scissors";
            picturePlayer.Image = new Bitmap(scissors);
            picComputer.Image = null;
        }

        private void playButton_Click(object sender, EventArgs e)
        {
            if (playerChoice == null)
            {
                resultTxtBox.Text = "Choose!";
            }
            else
            {
                computerChoiceStart();
            }
        }

        public void computerChoiceStart()
        {
            Random RandomNumber = new Random();
            int x = RandomNumber.Next(0, 3);
            if (x == 0)
            {
                picComputer.Image = new Bitmap(rock);
                computerChoice = "Rock";
            }
            if (x == 1)
            {
                picComputer.Image = new Bitmap(paper);
                computerChoice = "Paper";
            }
            if (x == 2)
            {
                picComputer.Image = new Bitmap(scissors);
                computerChoice = "Scissors";
            }
           results();
        }

        public void results()
        {
            if (computerChoice == "Rock" && playerChoice == "Rock" || computerChoice == "Scissors" && playerChoice == "Scissors" ||
                computerChoice == "Paper" && playerChoice == "Paper")
            {
                resultTxtBox.Text = "Draw!";
                playerChoice = null;
            }
            if (computerChoice == "Paper" && playerChoice == "Rock" || computerChoice == "Scissors" && playerChoice == "Paper" ||
                computerChoice == "Rock" && playerChoice == "Scissors")
            {
                resultTxtBox.Text = "You Lose!";
                playerChoice = null;
                computerScore++;
                compTxtBox.Text = Convert.ToString(computerScore);
            }
            if (playerChoice == "Paper" && computerChoice == "Rock" || playerChoice == "Scissors" && computerChoice == "Paper" ||
                playerChoice == "Rock" && computerChoice == "Scissors")
            {
                resultTxtBox.Text = "You Win!";
                playerChoice = null;
                playerScore++;
                playerTxtBox.Text = Convert.ToString(playerScore);
            }
            if (playerScore >= 10)
            {
                MessageBox.Show("Congratulations!\nYou are the Winner!");
                playerChoice = null;
                computerChoice = null;
                playerScore = 0;
                computerScore = 0;
                playerTxtBox.Text = Convert.ToString(playerScore);
                compTxtBox.Text = Convert.ToString(computerScore);
            }
            if (computerScore >= 10)
            {
                MessageBox.Show("Congratulations!\nYou are the Loser!");
                playerChoice = null;
                computerChoice = null;
                playerScore = 0;
                computerScore = 0;
                playerTxtBox.Text = Convert.ToString(playerScore);
                compTxtBox.Text = Convert.ToString(computerScore);
            }
        }

      
    }
}