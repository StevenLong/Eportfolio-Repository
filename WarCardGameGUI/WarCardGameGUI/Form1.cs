using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Resources;

namespace WarCardGameGUI
{
    public partial class warForm : Form
    {

        private bool[] dealt = new bool[52];

        private Random random = new Random();

        private int playerCard, compCard;
        private int playerNum, compNum;
        private int playerPoints, compPoints;
        private PictureBox[] deckArray;

        public warForm()
        {
            InitializeComponent();
            drawButton.Visible = false;
            playButton.Visible = true;

            playerCard = compCard = -1;
            playerNum = compNum = 0;
            playerPoints = compPoints = 0;
            playerCardImg.SizeMode = PictureBoxSizeMode.StretchImage;
            compCardImg.SizeMode = PictureBoxSizeMode.StretchImage;

            deckArray = new PictureBox[52];

            ResourceManager rm = WarCardGameGUI.Properties.Resources.ResourceManager;
            for (int i = 0; i < 52; i++)
            {
                deckArray[i] = new PictureBox();
                deckArray[i].Image = (Image)rm.GetObject("C" + i.ToString());
            }
        }

        private void drawButton_Click(object sender, EventArgs e)
        {
            selectCard();
        }

        public void selectCard()
        {
            do
            {
                playerCard = random.Next(52);
            }
            while (dealt[playerCard]);

            playerCardImg.Image = new Bitmap(deckArray[playerCard].Image);
            dealt[playerCard] = true;
            playerNum = (playerCard % 13) + 2;

            do
            {
                compCard = random.Next(52);
            }
            while (dealt[compCard]);

            compCardImg.Image = new Bitmap(deckArray[compCard].Image);
            dealt[compCard] = true;
            compNum = (compCard % 13) + 2;

            if (playerNum > compNum)
            {
                playerPoints += 2;
                playerScoreTBox.Text = Convert.ToString(playerPoints);
            }
            else if (playerNum < compNum)
            {
                compPoints += 2;
                compScoreTBox.Text = Convert.ToString(compPoints);
            }
            else
            {
                playerPoints++;
                compPoints++;
                playerScoreTBox.Text = Convert.ToString(playerPoints);
                compScoreTBox.Text = Convert.ToString(compPoints);
            }

            if ((playerPoints + compPoints) >= 52)
            {

                deck.Image = null;
                
                if (playerPoints > compPoints)
                {
                    outputTextBox.AppendText("FINAL SCORE" + Environment.NewLine);
                    outputTextBox.AppendText("Player Points: " + Convert.ToString(playerPoints) + Environment.NewLine);
                    outputTextBox.AppendText("Computer Points: " + Convert.ToString(compPoints) + Environment.NewLine);
                    outputTextBox.AppendText("Player Wins!");
                }
                else if (playerPoints < compPoints)
                {
                    outputTextBox.AppendText("FINAL SCORE" + Environment.NewLine);
                    outputTextBox.AppendText("Player Points: " + Convert.ToString(playerPoints) + Environment.NewLine);
                    outputTextBox.AppendText("Computer Points: " + Convert.ToString(compPoints) + Environment.NewLine);
                    outputTextBox.AppendText("Computer Wins!");
                }
                else
                {
                    outputTextBox.AppendText("FINAL SCORE" + Environment.NewLine);
                    outputTextBox.AppendText("Player Points: " + Convert.ToString(playerPoints) + Environment.NewLine);
                    outputTextBox.AppendText("Computer Points: " + Convert.ToString(compPoints) + Environment.NewLine);
                    outputTextBox.AppendText("TIE GAME!");
                }
               
                playButton.Visible = true;
                drawButton.Visible = false;
            }
            
            playerScoreTBox.Text = Convert.ToString(playerPoints);
            compScoreTBox.Text = Convert.ToString(compPoints);

        }

        public void fillDeck()
        {
            playerCard = compCard = -1;
            playerNum = compNum = 0;
            playerPoints = compPoints = 0;
            for (int i = 0; i < 52; ++i)
                dealt[i] = false;
            outputTextBox.Text = null;
            playerScoreTBox.Text = null;
            compScoreTBox.Text = null;
            deck.Image = WarCardGameGUI.Properties.Resources.cardBack;
            playerCardImg.Image = compCardImg.Image = null;
            drawButton.Visible = true;
            playButton.Visible = false;
        }

        private void playButton_Click(object sender, EventArgs e)
        {
            fillDeck();
        }

        private void quitButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
