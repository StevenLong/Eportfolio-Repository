namespace rockpaperscissors
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
            this.picplayer = new System.Windows.Forms.PictureBox();
            this.piccomputer = new System.Windows.Forms.PictureBox();
            this.label1 = new System.Windows.Forms.Label();
            this.btn_rock = new System.Windows.Forms.Button();
            this.btn_paper = new System.Windows.Forms.Button();
            this.btn_scissors = new System.Windows.Forms.Button();
            this.btn_close = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.lstscore = new System.Windows.Forms.ListView();
            this.clmnplayerhand = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.clmncomputer = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.clmnwinner = ((System.Windows.Forms.ColumnHeader)(new System.Windows.Forms.ColumnHeader()));
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.chkboxgridlines = new System.Windows.Forms.CheckBox();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.txt_player = new System.Windows.Forms.TextBox();
            this.txt_computer = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.picplayer)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.piccomputer)).BeginInit();
            this.SuspendLayout();
            // 
            // picplayer
            // 
            this.picplayer.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.picplayer.Location = new System.Drawing.Point(12, 98);
            this.picplayer.Name = "picplayer";
            this.picplayer.Size = new System.Drawing.Size(100, 197);
            this.picplayer.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.picplayer.TabIndex = 0;
            this.picplayer.TabStop = false;
            // 
            // piccomputer
            // 
            this.piccomputer.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.piccomputer.Location = new System.Drawing.Point(169, 98);
            this.piccomputer.Name = "piccomputer";
            this.piccomputer.Size = new System.Drawing.Size(100, 197);
            this.piccomputer.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.piccomputer.TabIndex = 1;
            this.piccomputer.TabStop = false;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(118, 180);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(45, 25);
            this.label1.TabIndex = 2;
            this.label1.Text = "VS.";
            // 
            // btn_rock
            // 
            this.btn_rock.Location = new System.Drawing.Point(12, 301);
            this.btn_rock.Name = "btn_rock";
            this.btn_rock.Size = new System.Drawing.Size(99, 23);
            this.btn_rock.TabIndex = 3;
            this.btn_rock.Text = "Rock";
            this.btn_rock.UseVisualStyleBackColor = true;
            this.btn_rock.Click += new System.EventHandler(this.btn_rock_Click);
            // 
            // btn_paper
            // 
            this.btn_paper.Location = new System.Drawing.Point(13, 330);
            this.btn_paper.Name = "btn_paper";
            this.btn_paper.Size = new System.Drawing.Size(99, 23);
            this.btn_paper.TabIndex = 4;
            this.btn_paper.Text = "Paper";
            this.btn_paper.UseVisualStyleBackColor = true;
            this.btn_paper.Click += new System.EventHandler(this.btn_paper_Click);
            // 
            // btn_scissors
            // 
            this.btn_scissors.Location = new System.Drawing.Point(13, 359);
            this.btn_scissors.Name = "btn_scissors";
            this.btn_scissors.Size = new System.Drawing.Size(99, 23);
            this.btn_scissors.TabIndex = 5;
            this.btn_scissors.Text = "Scissors";
            this.btn_scissors.UseVisualStyleBackColor = true;
            this.btn_scissors.Click += new System.EventHandler(this.btn_scissors_Click);
            // 
            // btn_close
            // 
            this.btn_close.Location = new System.Drawing.Point(462, 389);
            this.btn_close.Name = "btn_close";
            this.btn_close.Size = new System.Drawing.Size(75, 23);
            this.btn_close.TabIndex = 6;
            this.btn_close.Text = "Close";
            this.btn_close.UseVisualStyleBackColor = true;
            this.btn_close.Click += new System.EventHandler(this.btn_close_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(359, 72);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(56, 20);
            this.label2.TabIndex = 7;
            this.label2.Text = "Score";
            // 
            // lstscore
            // 
            this.lstscore.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.clmnplayerhand,
            this.clmncomputer,
            this.clmnwinner});
            this.lstscore.FullRowSelect = true;
            this.lstscore.Location = new System.Drawing.Point(308, 98);
            this.lstscore.Name = "lstscore";
            this.lstscore.Size = new System.Drawing.Size(229, 172);
            this.lstscore.TabIndex = 8;
            this.lstscore.UseCompatibleStateImageBehavior = false;
            this.lstscore.View = System.Windows.Forms.View.Details;
            this.lstscore.SelectedIndexChanged += new System.EventHandler(this.lstscore_SelectedIndexChanged);
            // 
            // clmnplayerhand
            // 
            this.clmnplayerhand.Text = "Player";
            this.clmnplayerhand.Width = 75;
            // 
            // clmncomputer
            // 
            this.clmncomputer.Text = "Computer";
            this.clmncomputer.Width = 75;
            // 
            // clmnwinner
            // 
            this.clmnwinner.Text = "Winner";
            this.clmnwinner.Width = 75;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(42, 69);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(36, 13);
            this.label3.TabIndex = 9;
            this.label3.Text = "Player";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(194, 69);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(52, 13);
            this.label4.TabIndex = 10;
            this.label4.Text = "Computer";
            // 
            // chkboxgridlines
            // 
            this.chkboxgridlines.AutoSize = true;
            this.chkboxgridlines.Location = new System.Drawing.Point(438, 75);
            this.chkboxgridlines.Name = "chkboxgridlines";
            this.chkboxgridlines.Size = new System.Drawing.Size(102, 17);
            this.chkboxgridlines.TabIndex = 11;
            this.chkboxgridlines.Text = "Enable Gridlines";
            this.chkboxgridlines.UseVisualStyleBackColor = true;
            this.chkboxgridlines.CheckedChanged += new System.EventHandler(this.chkboxgridlines_CheckedChanged);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(308, 281);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(36, 13);
            this.label5.TabIndex = 12;
            this.label5.Text = "Player";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(379, 281);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(52, 13);
            this.label6.TabIndex = 13;
            this.label6.Text = "Computer";
            // 
            // txt_player
            // 
            this.txt_player.Location = new System.Drawing.Point(311, 301);
            this.txt_player.Name = "txt_player";
            this.txt_player.Size = new System.Drawing.Size(33, 20);
            this.txt_player.TabIndex = 14;
            this.txt_player.Text = "0";
            // 
            // txt_computer
            // 
            this.txt_computer.Location = new System.Drawing.Point(382, 297);
            this.txt_computer.Name = "txt_computer";
            this.txt_computer.Size = new System.Drawing.Size(33, 20);
            this.txt_computer.TabIndex = 15;
            this.txt_computer.Text = "0";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(552, 424);
            this.Controls.Add(this.txt_computer);
            this.Controls.Add(this.txt_player);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.chkboxgridlines);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.lstscore);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.btn_close);
            this.Controls.Add(this.btn_scissors);
            this.Controls.Add(this.btn_paper);
            this.Controls.Add(this.btn_rock);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.piccomputer);
            this.Controls.Add(this.picplayer);
            this.Name = "Form1";
            this.Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)(this.picplayer)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.piccomputer)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btn_close;
        public System.Windows.Forms.Button btn_rock;
        public System.Windows.Forms.Button btn_paper;
        public System.Windows.Forms.Button btn_scissors;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ListView lstscore;
        public System.Windows.Forms.ColumnHeader clmnplayerhand;
        public System.Windows.Forms.ColumnHeader clmncomputer;
        public System.Windows.Forms.ColumnHeader clmnwinner;
        public System.Windows.Forms.PictureBox picplayer;
        public System.Windows.Forms.PictureBox piccomputer;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.CheckBox chkboxgridlines;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        public System.Windows.Forms.TextBox txt_player;
        public System.Windows.Forms.TextBox txt_computer;
    }
}

