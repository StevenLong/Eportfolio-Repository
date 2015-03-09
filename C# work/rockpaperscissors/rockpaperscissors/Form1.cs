using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Media;

namespace rockpaperscissors
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
        System.Drawing.Bitmap paper = rockpaperscissors.Properties.Resources.paper;
        System.Drawing.Bitmap rock = rockpaperscissors.Properties.Resources.rock;
        System.Drawing.Bitmap scissors = rockpaperscissors.Properties.Resources.scissors;
        List<string> ListResults = new List<string>();

        private void btn_close_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btn_rock_Click(object sender, EventArgs e)
        {
            playerchoice = "Rock";
            picplayer.Image = new Bitmap(rock);
            computerchoicestart();

        }

        private void btn_paper_Click(object sender, EventArgs e)
        {
            playerchoice = "Paper";
            picplayer.Image = new Bitmap(paper);
            computerchoicestart();
        }

        private void btn_scissors_Click(object sender, EventArgs e)
        {
            playerchoice = "Scissors";
            picplayer.Image = new Bitmap(scissors);
            computerchoicestart();
        }

        private void chkboxgridlines_CheckedChanged(object sender, EventArgs e)
        {
            lstscore.GridLines = chkboxgridlines.Checked;
        }
        public void computerchoicestart()
        {
            Random RandomNumber = new Random();
            int x = RandomNumber.Next(0, 3);
            if (x == 0)
            {
                piccomputer.Image = new Bitmap(rock);
                computerchoice = "Rock";
            }
            if (x == 1)
            {
                piccomputer.Image = new Bitmap(paper);
                computerchoice = "Paper";
            }
            if (x == 2)
            {
                piccomputer.Image = new Bitmap(scissors);
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
                picplayer.Image = null;
                piccomputer.Image = null;
            }
            if (computerchoice == "Paper" && playerchoice == "Rock" || computerchoice == "Scissors" && playerchoice == "Paper" ||
                computerchoice == "Rock" && playerchoice == "Scissors")
            {
                MessageBox.Show("Computer Wins");
                winnerresults = "Computer";
                picplayer.Image = null;
                piccomputer.Image = null;
                computerscore++;
                computerScore = Convert.ToString(computerscore);
                txt_computer.Text = computerScore;
            }
            if (playerchoice == "Paper" && computerchoice == "Rock" || playerchoice == "Scissors" && computerchoice == "Paper" ||
                playerchoice == "Rock" && computerchoice == "Scissors")
            {
                MessageBox.Show("You Win");
                winnerresults = "Player";
                picplayer.Image = null;
                piccomputer.Image = null;
                playerscore++;
                playerScore = Convert.ToString(playerscore);
                txt_player.Text = playerScore;
            }
            int i = 3;
            ListViewItem LVI = new ListViewItem();
            LVI.Text = playerchoice;
            LVI.SubItems.Add(computerchoice);
            LVI.SubItems.Add(winnerresults);
            lstscore.Items.Add(LVI);
            if (LVI.Index > i)
            {
                if (playerscore > computerscore)
                {
                    SoundPlayer cheer = new SoundPlayer(rockpaperscissors.Resources.Resource1.crowdapplause);
                    cheer.Play();
                    MessageBox.Show("Player Wins: )\nPlayer Score: " + playerscore + "\nComputer Score: " + computerscore);
                }
                if (playerscore < computerscore)
                {

                    SoundPlayer boo = new SoundPlayer(rockpaperscissors.Resources.Resource1.boo3);
                    boo.Play();
                    MessageBox.Show("Computer Wins, YOU LOSER!! \nPlayer Score: " + playerscore + "\nComputer Score: " + computerscore);
                }
                if (playerscore == computerscore)
                {
                    MessageBox.Show("Tie Game : P do it again");
                }
                lstscore.Items.Clear();
                playerscore = 0;
                txt_player.Text = "0";
                computerscore = 0;
                txt_computer.Text = "0";
            }
        }

        private void lstscore_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
