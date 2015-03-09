using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Resources;

/**
*  face = A 2 3 4 5 6 7 8 9 10 J  Q  K
* index = 0 1 2 3 4 5 6 7 8  9 10 11 12
* 
* 0 - Spades = 0 - 12
* 1 - Clubs = 13 - 25
* 2 - Diamonds = 26 - 38
* 3 - Hearts = 39 - 51
* 
* (card % 13) + 2 = face
* card % 4 = suit
* */
namespace WarGUI
{
    public partial class Form1 : Form
    {
        //track if card is dealt or not
        private bool[] dealt = new bool[52];

        private Random rand = new Random();

        private int mycard , hiscard;
        private int myval , hisval;
        private int mypoints, hispoints;
        private PictureBox[] pbDeckArray;

        public Form1()
        {
            InitializeComponent();
            mycard = hiscard = -1;
            myval = hisval = 0;
            mypoints = hispoints = 0;
            pbMyCard.SizeMode = PictureBoxSizeMode.StretchImage;
            pbHisCard.SizeMode = PictureBoxSizeMode.StretchImage;

            //array to hold all deck images
            pbDeckArray = new PictureBox[52];

            //get resouce manager instance and get the resource
            //deck images arenamed _1 - _52
            ResourceManager rm = WarGUI.Properties.Resources.ResourceManager;
            for (int i = 0; i < 52; ++i)
            {
                pbDeckArray[i] = new PictureBox();            
                pbDeckArray[i].Image = (Image)rm.GetObject("_"+(i+1).ToString());
            }
        }

        //draw both player cards
        private void btnDrawCard_Click(object sender, EventArgs e)
        {
            //get unique cards
            do
            {
                mycard = rand.Next(52);
            }
            while (dealt[mycard]);

            pbMyCard.Image = new Bitmap(pbDeckArray[mycard].Image);//"war_cards\\" + (mycard+1) + ".png");
            dealt[mycard] = true;
            myval = (mycard % 13) + 2;

            do
            {
                hiscard = rand.Next(52);
            }
            while (dealt[hiscard]);

            pbHisCard.Image = new Bitmap(pbDeckArray[hiscard].Image);//"war_cards\\" + (hiscard+1) + ".png");
            dealt[hiscard] = true;
            hisval = (hiscard % 13) + 2;

            //divy out points
            if (myval > hisval)
                mypoints += 2;
            else if (myval < hisval)
                hispoints += 2;
            else
            {
                mypoints++;
                hispoints++;
            }
            
            //test for win
            if((mypoints + hispoints) >= 52)
            {
                pbDeck.Image = null;
                if(mypoints > hispoints)
                    lblResult.Text = "Player 1 Wins!";
                else if(hispoints > mypoints)
                    lblResult.Text = "Player 2 Wins!";
                else
                    lblResult.Text = "TIE GAME!";
                btnReplay.Visible = true;
                btnDrawCard.Visible = false;
            }
            //display points
            tbMyScore.Text = Convert.ToString(mypoints);
            tbHisScore.Text = Convert.ToString(hispoints);
        }

        private void btnReplay_Click(object sender, EventArgs e)
        {
            mycard = hiscard = -1;
            myval = hisval = 0;
            mypoints = hispoints = 0;
            for (int i = 0; i < 52; ++i)
                dealt[i] = false;
            lblResult.Text = null;
            tbMyScore.Text = null;
            tbHisScore.Text = null;
            pbDeck.Image = WarGUI.Properties.Resources.back;
            pbMyCard.Image = pbHisCard.Image = null;
            btnDrawCard.Visible = true;
            btnReplay.Visible = false;
        }

    }
}
