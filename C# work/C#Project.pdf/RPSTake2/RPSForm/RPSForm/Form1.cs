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

        public string playerchoice { get; set; }
        public string computerchoice { get; set; }
        public string winnerresults { get; set; }
        public string collectdata { get; set; }
        public int playerscore = 0;
        public string playerScore;
        public int computerscore = 0;
        public string computerScore;
        System.Drawing.Bitmap paper = RPSForm.Properties.Resources.picPaper;
        System.Drawing.Bitmap rock = RPSForm.Properties.Resources.picRock;
        System.Drawing.Bitmap scissors = RPSForm.Properties.Resources.picScissors;
        List<string> ListResults = new List<string>();

        private void playerLabel_Click(object sender, EventArgs e)
        {

        }

        private void buttonQuit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btn_rock_Click(object sender, EventArgs e)
        {
            playerchoice = "Rock";
            picturePlayer.Image = new Bitmap(rock);
            computerchoicestart();

        }

        private void btn_paper_Click(object sender, EventArgs e)
        {
            playerchoice = "Paper";
            picturePlayer.Image = new Bitmap(paper);
            computerchoicestart();
        }

        private void btn_scissors_Click(object sender, EventArgs e)
        {
            playerchoice = "Scissors";
            picturePlayer.Image = new Bitmap(scissors);
            computerchoicestart();
        }

        public void computerchoicestart()
        {
            Random RandomNumber = new Random();
            int x = RandomNumber.Next(0, 3);
            if (x == 0)
            {
                picComputer.Image = new Bitmap(rock);
                computerchoice = "Rock";
            }
            if (x == 1)
            {
                picComputer.Image = new Bitmap(paper);
                computerchoice = "Paper";
            }
            if (x == 2)
            {
                picComputer.Image = new Bitmap(scissors);
                computerchoice = "Scissors";
            }
           results();
        }
        public void results()
        {
            if (computerchoice == "Rock" && playerchoice == "Rock" || computerchoice == "Scissors" && playerchoice == "Scissors" ||
                computerchoice == "Paper" && playerchoice == "Paper")
            {
                MessageBox.Show("Tie game, this wont count, do again : P");
                winnerresults = "Tie";
                picturePlayer.Image = null;
                picComputer.Image = null;
            }
            if (computerchoice == "Paper" && playerchoice == "Rock" || computerchoice == "Scissors" && playerchoice == "Paper" ||
                computerchoice == "Rock" && playerchoice == "Scissors")
            {
                MessageBox.Show("Computer Wins");
                winnerresults = "Computer";
                picturePlayer.Image = null;
                picComputer.Image = null;
                computerscore++;
                computerScore = Convert.ToString(computerscore);
                compScoreTxt.Text = computerScore;
            }
            if (playerchoice == "Paper" && computerchoice == "Rock" || playerchoice == "Scissors" && computerchoice == "Paper" ||
                playerchoice == "Rock" && computerchoice == "Scissors")
            {
                MessageBox.Show("You Win");
                winnerresults = "Player";
                picturePlayer.Image = null;
                picComputer.Image = null;
                playerscore++;
                playerScore = Convert.ToString(playerscore);
                compScoreTxt.Text = playerScore;
            }
        }

      

    }
}
