namespace WarGUI
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
            this.pbHisCard = new System.Windows.Forms.PictureBox();
            this.pbMyCard = new System.Windows.Forms.PictureBox();
            this.pbDeck = new System.Windows.Forms.PictureBox();
            this.btnDrawCard = new System.Windows.Forms.Button();
            this.tbMyScore = new System.Windows.Forms.TextBox();
            this.tbHisScore = new System.Windows.Forms.TextBox();
            this.lblResult = new System.Windows.Forms.Label();
            this.btnReplay = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.pbHisCard)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbMyCard)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbDeck)).BeginInit();
            this.SuspendLayout();
            // 
            // pbHisCard
            // 
            this.pbHisCard.Location = new System.Drawing.Point(798, 41);
            this.pbHisCard.Margin = new System.Windows.Forms.Padding(2);
            this.pbHisCard.Name = "pbHisCard";
            this.pbHisCard.Size = new System.Drawing.Size(205, 288);
            this.pbHisCard.TabIndex = 0;
            this.pbHisCard.TabStop = false;
            // 
            // pbMyCard
            // 
            this.pbMyCard.Location = new System.Drawing.Point(60, 41);
            this.pbMyCard.Margin = new System.Windows.Forms.Padding(2);
            this.pbMyCard.Name = "pbMyCard";
            this.pbMyCard.Size = new System.Drawing.Size(175, 288);
            this.pbMyCard.TabIndex = 1;
            this.pbMyCard.TabStop = false;
            // 
            // pbDeck
            // 
            this.pbDeck.Image = ((System.Drawing.Image)(resources.GetObject("pbDeck.Image")));
            this.pbDeck.Location = new System.Drawing.Point(414, 41);
            this.pbDeck.Margin = new System.Windows.Forms.Padding(2);
            this.pbDeck.Name = "pbDeck";
            this.pbDeck.Size = new System.Drawing.Size(206, 288);
            this.pbDeck.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbDeck.TabIndex = 2;
            this.pbDeck.TabStop = false;
            // 
            // btnDrawCard
            // 
            this.btnDrawCard.Location = new System.Drawing.Point(300, 120);
            this.btnDrawCard.Margin = new System.Windows.Forms.Padding(2);
            this.btnDrawCard.Name = "btnDrawCard";
            this.btnDrawCard.Size = new System.Drawing.Size(90, 34);
            this.btnDrawCard.TabIndex = 3;
            this.btnDrawCard.Text = "Draw Card";
            this.btnDrawCard.UseVisualStyleBackColor = true;
            this.btnDrawCard.Click += new System.EventHandler(this.btnDrawCard_Click);
            // 
            // tbMyScore
            // 
            this.tbMyScore.Font = new System.Drawing.Font("Microsoft Sans Serif", 16.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tbMyScore.Location = new System.Drawing.Point(159, 333);
            this.tbMyScore.Margin = new System.Windows.Forms.Padding(2);
            this.tbMyScore.Name = "tbMyScore";
            this.tbMyScore.Size = new System.Drawing.Size(76, 32);
            this.tbMyScore.TabIndex = 4;
            // 
            // tbHisScore
            // 
            this.tbHisScore.Font = new System.Drawing.Font("Microsoft Sans Serif", 16.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tbHisScore.Location = new System.Drawing.Point(865, 333);
            this.tbHisScore.Margin = new System.Windows.Forms.Padding(2);
            this.tbHisScore.Name = "tbHisScore";
            this.tbHisScore.Size = new System.Drawing.Size(76, 32);
            this.tbHisScore.TabIndex = 5;
            this.tbHisScore.TabStop = false;
            // 
            // lblResult
            // 
            this.lblResult.AutoSize = true;
            this.lblResult.Font = new System.Drawing.Font("Microsoft Sans Serif", 16.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblResult.Location = new System.Drawing.Point(154, 278);
            this.lblResult.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.lblResult.Name = "lblResult";
            this.lblResult.Size = new System.Drawing.Size(0, 26);
            this.lblResult.TabIndex = 6;
            // 
            // btnReplay
            // 
            this.btnReplay.Location = new System.Drawing.Point(652, 106);
            this.btnReplay.Margin = new System.Windows.Forms.Padding(2);
            this.btnReplay.Name = "btnReplay";
            this.btnReplay.Size = new System.Drawing.Size(90, 34);
            this.btnReplay.TabIndex = 7;
            this.btnReplay.Text = "Play Again";
            this.btnReplay.UseVisualStyleBackColor = true;
            this.btnReplay.Visible = false;
            this.btnReplay.Click += new System.EventHandler(this.btnReplay_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(32, 24);
            this.label1.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(45, 13);
            this.label1.TabIndex = 8;
            this.label1.Text = "Player 1";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(332, 25);
            this.label2.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(45, 13);
            this.label2.TabIndex = 9;
            this.label2.Text = "Player 2";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1074, 363);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnReplay);
            this.Controls.Add(this.lblResult);
            this.Controls.Add(this.tbHisScore);
            this.Controls.Add(this.tbMyScore);
            this.Controls.Add(this.btnDrawCard);
            this.Controls.Add(this.pbDeck);
            this.Controls.Add(this.pbMyCard);
            this.Controls.Add(this.pbHisCard);
            this.Margin = new System.Windows.Forms.Padding(2);
            this.Name = "Form1";
            this.Text = "   War";
            ((System.ComponentModel.ISupportInitialize)(this.pbHisCard)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbMyCard)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbDeck)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox pbHisCard;
        private System.Windows.Forms.PictureBox pbMyCard;
        private System.Windows.Forms.PictureBox pbDeck;
        private System.Windows.Forms.Button btnDrawCard;
        private System.Windows.Forms.TextBox tbMyScore;
        private System.Windows.Forms.TextBox tbHisScore;
        private System.Windows.Forms.Label lblResult;
        private System.Windows.Forms.Button btnReplay;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
    }
}

