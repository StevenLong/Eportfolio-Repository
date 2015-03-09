using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace RPSFormsApplication
{
    public partial class RPSForm : Form
    {
        public RPSForm()
        {
            InitializeComponent();
        }


        public string playerchoice { get; set; }
        public string computerchoice { get; set; }
        System.Drawing.Bitmap picPaper = RPSForm.Properties.Resources.picPaper;
        System.Drawing.Bitmap picRock = RPSFormApplication.Properties.Resources.picRock;
        System.Drawing.Bitmap picScissors = RPSFormApplication.Properties.Resources.picScissors;

        private void buttonQuit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btn_rock_Click(object sender, EventArgs e)
        {
            playerchoice = "Rock";
            picturePlayer.Image = new Bitmap(picRock);
            computerchoicestart();

        }

        private void btn_paper_Click(object sender, EventArgs e)
        {
            playerchoice = "Paper";
            picturePlayer.Image = new Bitmap(picPaper);
            computerchoicestart();
        }

        private void btn_scissors_Click(object sender, EventArgs e)
        {
            playerchoice = "Scissors";
            picturePlayer.Image = new Bitmap(picScissors);
            computerchoicestart();
        }


        public void computerchoicestart()
        {
            Random RandomNumber = new Random();
            int x = RandomNumber.Next(0, 3);
            if (x == 0)
            {
                pictureComputer.Image = new Bitmap(picRock);
                computerchoice = "Rock";
            }
            if (x == 1)
            {
                pictureComputer.Image = new Bitmap(picPaper);
                computerchoice = "Paper";
            }
            if (x == 2)
            {
                pictureComputer.Image = new Bitmap(picScissors);
                computerchoice = "Scissors";
            }
            //results();
        }

        private void RPSForm_Load(object sender, EventArgs e)
        {

        }


    }
}
