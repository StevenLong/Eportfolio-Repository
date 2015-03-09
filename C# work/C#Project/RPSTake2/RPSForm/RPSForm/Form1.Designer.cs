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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
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
            this.playerTxtBox = new System.Windows.Forms.TextBox();
            this.compTxtBox = new System.Windows.Forms.TextBox();
            this.playerScoreLabel = new System.Windows.Forms.Label();
            this.compScoreLabel = new System.Windows.Forms.Label();
            this.resultTxtBox = new System.Windows.Forms.TextBox();
            this.playButton = new System.Windows.Forms.Button();
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
            resources.ApplyResources(this.panel1, "panel1");
            this.panel1.Name = "panel1";
            // 
            // buttonScissors
            // 
            resources.ApplyResources(this.buttonScissors, "buttonScissors");
            this.buttonScissors.Name = "buttonScissors";
            this.buttonScissors.UseVisualStyleBackColor = true;
            this.buttonScissors.Click += new System.EventHandler(this.buttonScissors_Click);
            // 
            // buttonPaper
            // 
            resources.ApplyResources(this.buttonPaper, "buttonPaper");
            this.buttonPaper.Name = "buttonPaper";
            this.buttonPaper.UseVisualStyleBackColor = true;
            this.buttonPaper.Click += new System.EventHandler(this.buttonPaper_Click);
            // 
            // buttonRock
            // 
            resources.ApplyResources(this.buttonRock, "buttonRock");
            this.buttonRock.Name = "buttonRock";
            this.buttonRock.UseVisualStyleBackColor = true;
            this.buttonRock.Click += new System.EventHandler(this.buttonRock_Click);
            // 
            // chooseLabel
            // 
            resources.ApplyResources(this.chooseLabel, "chooseLabel");
            this.chooseLabel.Name = "chooseLabel";
            // 
            // picturePlayer
            // 
            resources.ApplyResources(this.picturePlayer, "picturePlayer");
            this.picturePlayer.Name = "picturePlayer";
            this.picturePlayer.TabStop = false;
            // 
            // picComputer
            // 
            resources.ApplyResources(this.picComputer, "picComputer");
            this.picComputer.Name = "picComputer";
            this.picComputer.TabStop = false;
            // 
            // VSLabel
            // 
            resources.ApplyResources(this.VSLabel, "VSLabel");
            this.VSLabel.Name = "VSLabel";
            // 
            // playerLabel
            // 
            resources.ApplyResources(this.playerLabel, "playerLabel");
            this.playerLabel.Name = "playerLabel";
            // 
            // computerLabel
            // 
            resources.ApplyResources(this.computerLabel, "computerLabel");
            this.computerLabel.Name = "computerLabel";
            // 
            // buttonQuit
            // 
            resources.ApplyResources(this.buttonQuit, "buttonQuit");
            this.buttonQuit.Name = "buttonQuit";
            this.buttonQuit.UseVisualStyleBackColor = true;
            this.buttonQuit.Click += new System.EventHandler(this.buttonQuit_Click);
            // 
            // scoreLabel
            // 
            resources.ApplyResources(this.scoreLabel, "scoreLabel");
            this.scoreLabel.Name = "scoreLabel";
            // 
            // playerTxtBox
            // 
            this.playerTxtBox.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.playerTxtBox.Cursor = System.Windows.Forms.Cursors.No;
            resources.ApplyResources(this.playerTxtBox, "playerTxtBox");
            this.playerTxtBox.Name = "playerTxtBox";
            this.playerTxtBox.ReadOnly = true;
            // 
            // compTxtBox
            // 
            this.compTxtBox.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.compTxtBox.Cursor = System.Windows.Forms.Cursors.No;
            resources.ApplyResources(this.compTxtBox, "compTxtBox");
            this.compTxtBox.Name = "compTxtBox";
            this.compTxtBox.ReadOnly = true;
            // 
            // playerScoreLabel
            // 
            resources.ApplyResources(this.playerScoreLabel, "playerScoreLabel");
            this.playerScoreLabel.Name = "playerScoreLabel";
            // 
            // compScoreLabel
            // 
            resources.ApplyResources(this.compScoreLabel, "compScoreLabel");
            this.compScoreLabel.Name = "compScoreLabel";
            // 
            // resultTxtBox
            // 
            this.resultTxtBox.BackColor = System.Drawing.SystemColors.ControlLight;
            resources.ApplyResources(this.resultTxtBox, "resultTxtBox");
            this.resultTxtBox.Name = "resultTxtBox";
            // 
            // playButton
            // 
            resources.ApplyResources(this.playButton, "playButton");
            this.playButton.Name = "playButton";
            this.playButton.UseVisualStyleBackColor = true;
            this.playButton.Click += new System.EventHandler(this.playButton_Click);
            // 
            // Form1
            // 
            resources.ApplyResources(this, "$this");
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlLight;
            this.Controls.Add(this.playButton);
            this.Controls.Add(this.resultTxtBox);
            this.Controls.Add(this.compScoreLabel);
            this.Controls.Add(this.playerScoreLabel);
            this.Controls.Add(this.compTxtBox);
            this.Controls.Add(this.playerTxtBox);
            this.Controls.Add(this.scoreLabel);
            this.Controls.Add(this.buttonQuit);
            this.Controls.Add(this.computerLabel);
            this.Controls.Add(this.playerLabel);
            this.Controls.Add(this.VSLabel);
            this.Controls.Add(this.picComputer);
            this.Controls.Add(this.picturePlayer);
            this.Controls.Add(this.panel1);
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "Form1";
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
        private System.Windows.Forms.TextBox playerTxtBox;
        private System.Windows.Forms.TextBox compTxtBox;
        private System.Windows.Forms.Label playerScoreLabel;
        private System.Windows.Forms.Label compScoreLabel;
        private System.Windows.Forms.TextBox resultTxtBox;
        private System.Windows.Forms.Button playButton;
    }
}

