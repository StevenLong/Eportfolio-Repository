namespace WarCardGame
{
    partial class warForm
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(warForm));
            this.playerCardLabel = new System.Windows.Forms.Label();
            this.computerCardLabel = new System.Windows.Forms.Label();
            this.dealButton = new System.Windows.Forms.Button();
            this.playButton = new System.Windows.Forms.Button();
            this.quitButton = new System.Windows.Forms.Button();
            this.outputTextBox = new System.Windows.Forms.TextBox();
            this.compPictureBox = new System.Windows.Forms.PictureBox();
            this.deckPictureBox = new System.Windows.Forms.PictureBox();
            this.playerPictureBox = new System.Windows.Forms.PictureBox();
            this.compScoreBox = new System.Windows.Forms.TextBox();
            this.playerScoreBox = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.compPictureBox)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.deckPictureBox)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.playerPictureBox)).BeginInit();
            this.SuspendLayout();
            // 
            // playerCardLabel
            // 
            this.playerCardLabel.AutoSize = true;
            this.playerCardLabel.Font = new System.Drawing.Font("Segoe Script", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.playerCardLabel.Location = new System.Drawing.Point(57, 25);
            this.playerCardLabel.Name = "playerCardLabel";
            this.playerCardLabel.Size = new System.Drawing.Size(198, 44);
            this.playerCardLabel.TabIndex = 3;
            this.playerCardLabel.Text = "Player Card";
            // 
            // computerCardLabel
            // 
            this.computerCardLabel.AutoSize = true;
            this.computerCardLabel.Font = new System.Drawing.Font("Segoe Script", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.computerCardLabel.Location = new System.Drawing.Point(647, 25);
            this.computerCardLabel.Name = "computerCardLabel";
            this.computerCardLabel.Size = new System.Drawing.Size(244, 44);
            this.computerCardLabel.TabIndex = 4;
            this.computerCardLabel.Text = "Computer Card";
            // 
            // dealButton
            // 
            this.dealButton.Font = new System.Drawing.Font("Segoe UI", 21.75F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.dealButton.Location = new System.Drawing.Point(316, 368);
            this.dealButton.Name = "dealButton";
            this.dealButton.Size = new System.Drawing.Size(146, 50);
            this.dealButton.TabIndex = 5;
            this.dealButton.Text = "Deal";
            this.dealButton.UseVisualStyleBackColor = true;
            this.dealButton.Click += new System.EventHandler(this.FillDeck);
            // 
            // playButton
            // 
            this.playButton.Font = new System.Drawing.Font("Segoe UI", 21.75F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.playButton.ForeColor = System.Drawing.SystemColors.ControlText;
            this.playButton.Location = new System.Drawing.Point(468, 368);
            this.playButton.Name = "playButton";
            this.playButton.Size = new System.Drawing.Size(146, 50);
            this.playButton.TabIndex = 6;
            this.playButton.Text = "Play";
            this.playButton.UseVisualStyleBackColor = true;
            this.playButton.Click += new System.EventHandler(this.playButton_Click);
            // 
            // quitButton
            // 
            this.quitButton.Font = new System.Drawing.Font("Segoe UI", 21.75F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.quitButton.ForeColor = System.Drawing.SystemColors.ControlText;
            this.quitButton.Location = new System.Drawing.Point(745, 480);
            this.quitButton.Name = "quitButton";
            this.quitButton.Size = new System.Drawing.Size(146, 50);
            this.quitButton.TabIndex = 7;
            this.quitButton.Text = "Quit";
            this.quitButton.UseVisualStyleBackColor = true;
            this.quitButton.Click += new System.EventHandler(this.quitButton_Click);
            // 
            // outputTextBox
            // 
            this.outputTextBox.Location = new System.Drawing.Point(65, 442);
            this.outputTextBox.Multiline = true;
            this.outputTextBox.Name = "outputTextBox";
            this.outputTextBox.ReadOnly = true;
            this.outputTextBox.ScrollBars = System.Windows.Forms.ScrollBars.Horizontal;
            this.outputTextBox.Size = new System.Drawing.Size(549, 88);
            this.outputTextBox.TabIndex = 8;
            // 
            // compPictureBox
            // 
            this.compPictureBox.Location = new System.Drawing.Point(687, 89);
            this.compPictureBox.Name = "compPictureBox";
            this.compPictureBox.Size = new System.Drawing.Size(176, 273);
            this.compPictureBox.TabIndex = 2;
            this.compPictureBox.TabStop = false;
            // 
            // deckPictureBox
            // 
            this.deckPictureBox.BackgroundImage = global::WarCardGame.Properties.Resources.Bicycle_Rider_Backs_smaller;
            this.deckPictureBox.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.deckPictureBox.InitialImage = ((System.Drawing.Image)(resources.GetObject("deckPictureBox.InitialImage")));
            this.deckPictureBox.Location = new System.Drawing.Point(378, 89);
            this.deckPictureBox.Name = "deckPictureBox";
            this.deckPictureBox.Size = new System.Drawing.Size(176, 273);
            this.deckPictureBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.deckPictureBox.TabIndex = 1;
            this.deckPictureBox.TabStop = false;
            // 
            // playerPictureBox
            // 
            this.playerPictureBox.Location = new System.Drawing.Point(65, 89);
            this.playerPictureBox.Name = "playerPictureBox";
            this.playerPictureBox.Size = new System.Drawing.Size(176, 273);
            this.playerPictureBox.TabIndex = 0;
            this.playerPictureBox.TabStop = false;
            // 
            // compScoreBox
            // 
            this.compScoreBox.Font = new System.Drawing.Font("Impact", 21.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.compScoreBox.Location = new System.Drawing.Point(729, 375);
            this.compScoreBox.Name = "compScoreBox";
            this.compScoreBox.ReadOnly = true;
            this.compScoreBox.Size = new System.Drawing.Size(100, 43);
            this.compScoreBox.TabIndex = 9;
            this.compScoreBox.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // playerScoreBox
            // 
            this.playerScoreBox.Font = new System.Drawing.Font("Impact", 21.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.playerScoreBox.Location = new System.Drawing.Point(102, 375);
            this.playerScoreBox.Name = "playerScoreBox";
            this.playerScoreBox.ReadOnly = true;
            this.playerScoreBox.Size = new System.Drawing.Size(100, 43);
            this.playerScoreBox.TabIndex = 10;
            this.playerScoreBox.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // warForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Green;
            this.ClientSize = new System.Drawing.Size(933, 542);
            this.Controls.Add(this.playerScoreBox);
            this.Controls.Add(this.compScoreBox);
            this.Controls.Add(this.outputTextBox);
            this.Controls.Add(this.quitButton);
            this.Controls.Add(this.playButton);
            this.Controls.Add(this.dealButton);
            this.Controls.Add(this.computerCardLabel);
            this.Controls.Add(this.playerCardLabel);
            this.Controls.Add(this.compPictureBox);
            this.Controls.Add(this.deckPictureBox);
            this.Controls.Add(this.playerPictureBox);
            this.Name = "warForm";
            this.Text = "WAR";
            ((System.ComponentModel.ISupportInitialize)(this.compPictureBox)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.deckPictureBox)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.playerPictureBox)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox playerPictureBox;
        private System.Windows.Forms.PictureBox deckPictureBox;
        private System.Windows.Forms.PictureBox compPictureBox;
        private System.Windows.Forms.Label playerCardLabel;
        private System.Windows.Forms.Label computerCardLabel;
        private System.Windows.Forms.Button dealButton;
        private System.Windows.Forms.Button playButton;
        private System.Windows.Forms.Button quitButton;
        private System.Windows.Forms.TextBox outputTextBox;
        private System.Windows.Forms.TextBox compScoreBox;
        private System.Windows.Forms.TextBox playerScoreBox;
    }
}

