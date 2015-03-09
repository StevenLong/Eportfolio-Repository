namespace RPSFormsApplication
{
    partial class RPSForm
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
            this.buttonQuit = new System.Windows.Forms.Button();
            this.panel1 = new System.Windows.Forms.Panel();
            this.buttonScissors = new System.Windows.Forms.Button();
            this.buttonPaper = new System.Windows.Forms.Button();
            this.buttonRock = new System.Windows.Forms.Button();
            this.chooseLabel = new System.Windows.Forms.Label();
            this.picturePlayer = new System.Windows.Forms.PictureBox();
            this.pictureComputer = new System.Windows.Forms.PictureBox();
            this.VSLabel = new System.Windows.Forms.Label();
            this.buttonPlay = new System.Windows.Forms.Button();
            this.playerLabel = new System.Windows.Forms.Label();
            this.computerLabel = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picturePlayer)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureComputer)).BeginInit();
            this.SuspendLayout();
            // 
            // buttonQuit
            // 
            this.buttonQuit.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonQuit.Location = new System.Drawing.Point(632, 460);
            this.buttonQuit.Name = "buttonQuit";
            this.buttonQuit.Size = new System.Drawing.Size(149, 71);
            this.buttonQuit.TabIndex = 0;
            this.buttonQuit.Text = "Quit";
            this.buttonQuit.UseVisualStyleBackColor = true;
            this.buttonQuit.Click += new System.EventHandler(this.buttonQuit_Click);
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.buttonScissors);
            this.panel1.Controls.Add(this.buttonPaper);
            this.panel1.Controls.Add(this.buttonRock);
            this.panel1.Controls.Add(this.chooseLabel);
            this.panel1.Location = new System.Drawing.Point(12, 129);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(162, 243);
            this.panel1.TabIndex = 1;
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
            this.picturePlayer.Location = new System.Drawing.Point(211, 100);
            this.picturePlayer.Name = "picturePlayer";
            this.picturePlayer.Size = new System.Drawing.Size(209, 272);
            this.picturePlayer.TabIndex = 2;
            this.picturePlayer.TabStop = false;
            // 
            // pictureComputer
            // 
            this.pictureComputer.Location = new System.Drawing.Point(572, 100);
            this.pictureComputer.Name = "pictureComputer";
            this.pictureComputer.Size = new System.Drawing.Size(209, 272);
            this.pictureComputer.TabIndex = 3;
            this.pictureComputer.TabStop = false;
            // 
            // VSLabel
            // 
            this.VSLabel.AutoSize = true;
            this.VSLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.VSLabel.Location = new System.Drawing.Point(449, 221);
            this.VSLabel.Name = "VSLabel";
            this.VSLabel.Size = new System.Drawing.Size(104, 55);
            this.VSLabel.TabIndex = 4;
            this.VSLabel.Text = "VS.";
            // 
            // buttonPlay
            // 
            this.buttonPlay.Font = new System.Drawing.Font("Microsoft Sans Serif", 21.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonPlay.Location = new System.Drawing.Point(632, 383);
            this.buttonPlay.Name = "buttonPlay";
            this.buttonPlay.Size = new System.Drawing.Size(149, 71);
            this.buttonPlay.TabIndex = 5;
            this.buttonPlay.Text = "Play";
            this.buttonPlay.UseVisualStyleBackColor = true;
            // 
            // playerLabel
            // 
            this.playerLabel.AutoSize = true;
            this.playerLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 21.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.playerLabel.Location = new System.Drawing.Point(264, 64);
            this.playerLabel.Name = "playerLabel";
            this.playerLabel.Size = new System.Drawing.Size(104, 33);
            this.playerLabel.TabIndex = 6;
            this.playerLabel.Text = "Player";
            // 
            // computerLabel
            // 
            this.computerLabel.AutoSize = true;
            this.computerLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 21.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.computerLabel.ImageAlign = System.Drawing.ContentAlignment.BottomCenter;
            this.computerLabel.Location = new System.Drawing.Point(606, 64);
            this.computerLabel.Name = "computerLabel";
            this.computerLabel.Size = new System.Drawing.Size(151, 33);
            this.computerLabel.TabIndex = 7;
            this.computerLabel.Text = "Computer";
            // 
            // RPSForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlLightLight;
            this.ClientSize = new System.Drawing.Size(873, 559);
            this.Controls.Add(this.computerLabel);
            this.Controls.Add(this.playerLabel);
            this.Controls.Add(this.buttonPlay);
            this.Controls.Add(this.VSLabel);
            this.Controls.Add(this.pictureComputer);
            this.Controls.Add(this.picturePlayer);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.buttonQuit);
            this.Name = "RPSForm";
            this.Text = "Rock, Paper, Scissors!";
            this.Load += new System.EventHandler(this.RPSForm_Load);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picturePlayer)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureComputer)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button buttonQuit;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button buttonRock;
        private System.Windows.Forms.Label chooseLabel;
        private System.Windows.Forms.Button buttonScissors;
        private System.Windows.Forms.Button buttonPaper;
        private System.Windows.Forms.PictureBox picturePlayer;
        private System.Windows.Forms.PictureBox pictureComputer;
        private System.Windows.Forms.Label VSLabel;
        private System.Windows.Forms.Button buttonPlay;
        private System.Windows.Forms.Label playerLabel;
        private System.Windows.Forms.Label computerLabel;
    }
}

