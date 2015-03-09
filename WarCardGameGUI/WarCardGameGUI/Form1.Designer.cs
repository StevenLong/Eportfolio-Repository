namespace WarCardGameGUI
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
            this.playerCardImg = new System.Windows.Forms.PictureBox();
            this.deck = new System.Windows.Forms.PictureBox();
            this.compCardImg = new System.Windows.Forms.PictureBox();
            this.drawButton = new System.Windows.Forms.Button();
            this.playButton = new System.Windows.Forms.Button();
            this.quitButton = new System.Windows.Forms.Button();
            this.outputTextBox = new System.Windows.Forms.TextBox();
            this.playerScoreTBox = new System.Windows.Forms.TextBox();
            this.compScoreTBox = new System.Windows.Forms.TextBox();
            this.playerLabel = new System.Windows.Forms.Label();
            this.compLabel = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.playerCardImg)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.deck)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.compCardImg)).BeginInit();
            this.SuspendLayout();
            // 
            // playerCardImg
            // 
            this.playerCardImg.Location = new System.Drawing.Point(49, 44);
            this.playerCardImg.Name = "playerCardImg";
            this.playerCardImg.Size = new System.Drawing.Size(182, 290);
            this.playerCardImg.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.playerCardImg.TabIndex = 0;
            this.playerCardImg.TabStop = false;
            // 
            // deck
            // 
            this.deck.Location = new System.Drawing.Point(397, 44);
            this.deck.Name = "deck";
            this.deck.Size = new System.Drawing.Size(182, 290);
            this.deck.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.deck.TabIndex = 1;
            this.deck.TabStop = false;
            // 
            // compCardImg
            // 
            this.compCardImg.Location = new System.Drawing.Point(740, 44);
            this.compCardImg.Name = "compCardImg";
            this.compCardImg.Size = new System.Drawing.Size(182, 290);
            this.compCardImg.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.compCardImg.TabIndex = 2;
            this.compCardImg.TabStop = false;
            // 
            // drawButton
            // 
            this.drawButton.Font = new System.Drawing.Font("Georgia", 20.25F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.drawButton.Location = new System.Drawing.Point(397, 349);
            this.drawButton.Name = "drawButton";
            this.drawButton.Size = new System.Drawing.Size(182, 52);
            this.drawButton.TabIndex = 3;
            this.drawButton.Text = "Draw";
            this.drawButton.UseVisualStyleBackColor = true;
            this.drawButton.Click += new System.EventHandler(this.drawButton_Click);
            // 
            // playButton
            // 
            this.playButton.Font = new System.Drawing.Font("Georgia", 20.25F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.playButton.Location = new System.Drawing.Point(397, 407);
            this.playButton.Name = "playButton";
            this.playButton.Size = new System.Drawing.Size(182, 52);
            this.playButton.TabIndex = 4;
            this.playButton.Text = "Play";
            this.playButton.UseVisualStyleBackColor = true;
            this.playButton.Click += new System.EventHandler(this.playButton_Click);
            // 
            // quitButton
            // 
            this.quitButton.Font = new System.Drawing.Font("Georgia", 20.25F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.quitButton.Location = new System.Drawing.Point(740, 459);
            this.quitButton.Name = "quitButton";
            this.quitButton.Size = new System.Drawing.Size(182, 52);
            this.quitButton.TabIndex = 5;
            this.quitButton.Text = "Quit";
            this.quitButton.UseVisualStyleBackColor = true;
            this.quitButton.Click += new System.EventHandler(this.quitButton_Click);
            // 
            // outputTextBox
            // 
            this.outputTextBox.Font = new System.Drawing.Font("Segoe Print", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.outputTextBox.Location = new System.Drawing.Point(49, 349);
            this.outputTextBox.Multiline = true;
            this.outputTextBox.Name = "outputTextBox";
            this.outputTextBox.ReadOnly = true;
            this.outputTextBox.Size = new System.Drawing.Size(342, 162);
            this.outputTextBox.TabIndex = 6;
            // 
            // playerScoreTBox
            // 
            this.playerScoreTBox.Font = new System.Drawing.Font("Impact", 54F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.playerScoreTBox.Location = new System.Drawing.Point(257, 239);
            this.playerScoreTBox.Multiline = true;
            this.playerScoreTBox.Name = "playerScoreTBox";
            this.playerScoreTBox.ReadOnly = true;
            this.playerScoreTBox.Size = new System.Drawing.Size(113, 95);
            this.playerScoreTBox.TabIndex = 7;
            this.playerScoreTBox.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // compScoreTBox
            // 
            this.compScoreTBox.Font = new System.Drawing.Font("Impact", 54F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.compScoreTBox.Location = new System.Drawing.Point(604, 239);
            this.compScoreTBox.Name = "compScoreTBox";
            this.compScoreTBox.ReadOnly = true;
            this.compScoreTBox.Size = new System.Drawing.Size(113, 95);
            this.compScoreTBox.TabIndex = 8;
            this.compScoreTBox.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // playerLabel
            // 
            this.playerLabel.AutoSize = true;
            this.playerLabel.Font = new System.Drawing.Font("Segoe Print", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.playerLabel.Location = new System.Drawing.Point(95, -2);
            this.playerLabel.Name = "playerLabel";
            this.playerLabel.Size = new System.Drawing.Size(95, 43);
            this.playerLabel.TabIndex = 9;
            this.playerLabel.Text = "Player";
            this.playerLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // compLabel
            // 
            this.compLabel.AutoSize = true;
            this.compLabel.Font = new System.Drawing.Font("Segoe Print", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.compLabel.Location = new System.Drawing.Point(762, -2);
            this.compLabel.Name = "compLabel";
            this.compLabel.Size = new System.Drawing.Size(139, 43);
            this.compLabel.TabIndex = 10;
            this.compLabel.Text = "Computer";
            this.compLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // warForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Green;
            this.ClientSize = new System.Drawing.Size(977, 534);
            this.ControlBox = false;
            this.Controls.Add(this.compLabel);
            this.Controls.Add(this.playerLabel);
            this.Controls.Add(this.compScoreTBox);
            this.Controls.Add(this.playerScoreTBox);
            this.Controls.Add(this.outputTextBox);
            this.Controls.Add(this.quitButton);
            this.Controls.Add(this.playButton);
            this.Controls.Add(this.drawButton);
            this.Controls.Add(this.compCardImg);
            this.Controls.Add(this.deck);
            this.Controls.Add(this.playerCardImg);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "warForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "War";
            ((System.ComponentModel.ISupportInitialize)(this.playerCardImg)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.deck)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.compCardImg)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox playerCardImg;
        private System.Windows.Forms.PictureBox deck;
        private System.Windows.Forms.PictureBox compCardImg;
        private System.Windows.Forms.Button drawButton;
        private System.Windows.Forms.Button playButton;
        private System.Windows.Forms.Button quitButton;
        private System.Windows.Forms.TextBox outputTextBox;
        private System.Windows.Forms.TextBox playerScoreTBox;
        private System.Windows.Forms.TextBox compScoreTBox;
        private System.Windows.Forms.Label playerLabel;
        private System.Windows.Forms.Label compLabel;
    }
}

