namespace RPSForm
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.panel1 = new System.Windows.Forms.Panel();
            this.buttonScissors = new System.Windows.Forms.Button();
            this.buttonPaper = new System.Windows.Forms.Button();
            this.buttonRock = new System.Windows.Forms.Button();
            this.chooseLabel = new System.Windows.Forms.Label();
            this.picturePlayer = new System.Windows.Forms.PictureBox();
            this.picComputer = new System.Windows.Forms.PictureBox();
            this.VSLabel = new System.Windows.Forms.Label();
            this.playerLabel = new System.Windows.Forms.Label();
            this.computerLabel = new System.Windows.Forms.Label();
            this.buttonQuit = new System.Windows.Forms.Button();
            this.scoreLabel = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.compScoreTxt = new System.Windows.Forms.TextBox();
            this.playerScoreLabel = new System.Windows.Forms.Label();
            this.compScoreLabel = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picturePlayer)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.picComputer)).BeginInit();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.buttonScissors);
            this.panel1.Controls.Add(this.buttonPaper);
            this.panel1.Controls.Add(this.buttonRock);
            this.panel1.Controls.Add(this.chooseLabel);
            this.panel1.Location = new System.Drawing.Point(12, 12);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(162, 243);
            this.panel1.TabIndex = 2;
            // 
            // buttonScissors
            // 
            this.buttonScissors.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonScissors.Location = new System.Drawing.Point(35, 164);
            this.buttonScissors.Name = "buttonScissors";
            this.buttonScissors.Size = new System.Drawing.Size(87, 55);
            this.buttonScissors.TabIndex = 3;
            this.buttonScissors.Text = "Scissors";
            this.buttonScissors.UseVisualStyleBackColor = true;
            // 
            // buttonPaper
            // 
            this.buttonPaper.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonPaper.Location = new System.Drawing.Point(35, 103);
            this.buttonPaper.Name = "buttonPaper";
            this.buttonPaper.Size = new System.Drawing.Size(87, 55);
            this.buttonPaper.TabIndex = 2;
            this.buttonPaper.Text = "Paper";
            this.buttonPaper.UseVisualStyleBackColor = true;
            // 
            // buttonRock
            // 
            this.buttonRock.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonRock.Location = new System.Drawing.Point(35, 43);
            this.buttonRock.Name = "buttonRock";
            this.buttonRock.Size = new System.Drawing.Size(87, 55);
            this.buttonRock.TabIndex = 1;
            this.buttonRock.Text = "Rock";
            this.buttonRock.UseVisualStyleBackColor = true;
            // 
            // chooseLabel
            // 
            this.chooseLabel.AutoSize = true;
            this.chooseLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.chooseLabel.Location = new System.Drawing.Point(30, 15);
            this.chooseLabel.Name = "chooseLabel";
            this.chooseLabel.Size = new System.Drawing.Size(92, 25);
            this.chooseLabel.TabIndex = 0;
            this.chooseLabel.Text = "Choose";
            // 
            // picturePlayer
            // 
            this.picturePlayer.InitialImage = null;
            this.picturePlayer.Location = new System.Drawing.Point(215, 115);
            this.picturePlayer.Name = "picturePlayer";
            this.picturePlayer.Size = new System.Drawing.Size(209, 272);
            this.picturePlayer.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.picturePlayer.TabIndex = 3;
            this.picturePlayer.TabStop = false;
            // 
            // picComputer
            // 
            this.picComputer.InitialImage = null;
            this.picComputer.Location = new System.Drawing.Point(649, 115);
            this.picComputer.Name = "picComputer";
            this.picComputer.Size = new System.Drawing.Size(209, 272);
            this.picComputer.TabIndex = 4;
            this.picComputer.TabStop = false;
            // 
            // VSLabel
            // 
            this.VSLabel.AutoSize = true;
            this.VSLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 48F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.VSLabel.Location = new System.Drawing.Point(480, 182);
            this.VSLabel.Name = "VSLabel";
            this.VSLabel.Size = new System.Drawing.Size(137, 73);
            this.VSLabel.TabIndex = 5;
            this.VSLabel.Text = "VS.";
            // 
            // playerLabel
            // 
            this.playerLabel.AutoSize = true;
            this.playerLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 21.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.playerLabel.Location = new System.Drawing.Point(272, 77);
            this.playerLabel.Name = "playerLabel";
            this.playerLabel.Size = new System.Drawing.Size(104, 33);
            this.playerLabel.TabIndex = 8;
            this.playerLabel.Text = "Player";
            this.playerLabel.Click += new System.EventHandler(this.playerLabel_Click);
            // 
            // computerLabel
            // 
            this.computerLabel.AutoSize = true;
            this.computerLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 21.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.computerLabel.ImageAlign = System.Drawing.ContentAlignment.BottomCenter;
            this.computerLabel.Location = new System.Drawing.Point(678, 77);
            this.computerLabel.Name = "computerLabel";
            this.computerLabel.Size = new System.Drawing.Size(151, 33);
            this.computerLabel.TabIndex = 9;
            this.computerLabel.Text = "Computer";
            // 
            // buttonQuit
            // 
            this.buttonQuit.Font = new System.Drawing.Font("Microsoft Sans Serif", 21.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonQuit.Location = new System.Drawing.Point(823, 429);
            this.buttonQuit.Name = "buttonQuit";
            this.buttonQuit.Size = new System.Drawing.Size(149, 71);
            this.buttonQuit.TabIndex = 10;
            this.buttonQuit.Text = "Quit";
            this.buttonQuit.UseVisualStyleBackColor = true;
            this.buttonQuit.Click += new System.EventHandler(this.buttonQuit_Click);
            // 
            // scoreLabel
            // 
            this.scoreLabel.AutoSize = true;
            this.scoreLabel.Font = new System.Drawing.Font("Palatino Linotype", 27.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.scoreLabel.Location = new System.Drawing.Point(300, 429);
            this.scoreLabel.Name = "scoreLabel";
            this.scoreLabel.Size = new System.Drawing.Size(124, 50);
            this.scoreLabel.TabIndex = 11;
            this.scoreLabel.Text = "Score:";
            // 
            // textBox1
            // 
            this.textBox1.Font = new System.Drawing.Font("Microsoft Sans Serif", 26.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.textBox1.Location = new System.Drawing.Point(452, 432);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(60, 47);
            this.textBox1.TabIndex = 12;
            // 
            // compScoreTxt
            // 
            this.compScoreTxt.Font = new System.Drawing.Font("Microsoft Sans Serif", 26.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.compScoreTxt.Location = new System.Drawing.Point(557, 433);
            this.compScoreTxt.Name = "compScoreTxt";
            this.compScoreTxt.Size = new System.Drawing.Size(60, 47);
            this.compScoreTxt.TabIndex = 13;
            // 
            // playerScoreLabel
            // 
            this.playerScoreLabel.AutoSize = true;
            this.playerScoreLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.playerScoreLabel.Location = new System.Drawing.Point(448, 405);
            this.playerScoreLabel.Name = "playerScoreLabel";
            this.playerScoreLabel.Size = new System.Drawing.Size(68, 24);
            this.playerScoreLabel.TabIndex = 14;
            this.playerScoreLabel.Text = "Player";
            // 
            // compScoreLabel
            // 
            this.compScoreLabel.AutoSize = true;
            this.compScoreLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.compScoreLabel.Location = new System.Drawing.Point(553, 405);
            this.compScoreLabel.Name = "compScoreLabel";
            this.compScoreLabel.Size = new System.Drawing.Size(65, 24);
            this.compScoreLabel.TabIndex = 15;
            this.compScoreLabel.Text = "Comp";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(984, 512);
            this.Controls.Add(this.compScoreLabel);
            this.Controls.Add(this.playerScoreLabel);
            this.Controls.Add(this.compScoreTxt);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.scoreLabel);
            this.Controls.Add(this.buttonQuit);
            this.Controls.Add(this.computerLabel);
            this.Controls.Add(this.playerLabel);
            this.Controls.Add(this.VSLabel);
            this.Controls.Add(this.picComputer);
            this.Controls.Add(this.picturePlayer);
            this.Controls.Add(this.panel1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picturePlayer)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.picComputer)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button buttonScissors;
        private System.Windows.Forms.Button buttonPaper;
        private System.Windows.Forms.Button buttonRock;
        private System.Windows.Forms.Label chooseLabel;
        private System.Windows.Forms.PictureBox picturePlayer;
        private System.Windows.Forms.PictureBox picComputer;
        private System.Windows.Forms.Label VSLabel;
        private System.Windows.Forms.Label playerLabel;
        private System.Windows.Forms.Label computerLabel;
        private System.Windows.Forms.Button buttonQuit;
        private System.Windows.Forms.Label scoreLabel;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.TextBox compScoreTxt;
        private System.Windows.Forms.Label playerScoreLabel;
        private System.Windows.Forms.Label compScoreLabel;
    }
}

