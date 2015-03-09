using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;

namespace CS_GO_Shopping_List
{
    public partial class Rifles : PhoneApplicationPage
    {
        public Rifles()
        {
            InitializeComponent();
        }

        bool awpClicked = false;
        bool ak47Clicked = false;
        bool m4a4Clicked = false;
        bool ssg08Clicked = false;
        bool augClicked = false;
        bool g3Clicked = false;
        bool sg553Clicked = false;
        bool scar20Clicked = false;
        bool famasClicked = false;
        bool galilARClicked = false;


        private void awpButton_Click(object sender, RoutedEventArgs e)
        {
            Do_awpButton_Click(sender, e, (App.Current as App).c, App.awp);
        }

        private void Do_awpButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment awp)
        {
            if (awpClicked == false)
            {
                c.contents.Add(awp);
                c.totalCost += awp.cost;
                c.noOfItems++;
                awpClicked = true;
                awpButton.Content = "AWP&#xA;SOLD";
            }
            else if (awpClicked == false)
            {
                c.contents.Remove(awp);
                c.totalCost -= awp.cost;
                c.noOfItems--;
                awpClicked = false;
                awpButton.Content = "AWP&#xA;$4750";
            }
        }

        private void ak47Button_Click(object sender, RoutedEventArgs e)
        {
            Do_ak47Button_Click(sender, e, (App.Current as App).c, App.ak47);
        }

        private void Do_ak47Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment ak47)
        {
            if (ak47Clicked == false)
            {
                c.contents.Add(ak47);
                c.totalCost += ak47.cost;
                c.noOfItems++;
                ak47Clicked = true;
                ak47Button.Content = "AK-47&#xA;SOLD";
            }
            else if (ak47Clicked == false)
            {
                c.contents.Remove(ak47);
                c.totalCost -= ak47.cost;
                c.noOfItems--;
                ak47Clicked = false;
                ak47Button.Content = "AK-47&#xA;$2700";
            }
        }

        private void m4a4Button_Click(object sender, RoutedEventArgs e)
        {
            Do_m4a4Button_Click(sender, e, (App.Current as App).c, App.m4a4);
        }

        private void Do_m4a4Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment m4a4)
        {
            if (m4a4Clicked == false)
            {
                c.contents.Add(m4a4);
                c.totalCost += m4a4.cost;
                c.noOfItems++;
                m4a4Clicked = true;
                m4a4Button.Content = "M4A4&#xA;SOLD";
            }
            else if (m4a4Clicked == false)
            {
                c.contents.Remove(m4a4);
                c.totalCost -= m4a4.cost;
                c.noOfItems--;
                m4a4Clicked = false;
                m4a4Button.Content = "M4A4&#xA;$3100";
            }
        }

        private void ssg08Button_Click(object sender, RoutedEventArgs e)
        {
            Do_ssg08Button_Click(sender, e, (App.Current as App).c, App.ssg08);
        }

        private void Do_ssg08Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment ssg08)
        {
            if (ssg08Clicked == false)
            {
                c.contents.Add(ssg08);
                c.totalCost += ssg08.cost;
                c.noOfItems++;
                ssg08Clicked = true;
                ssg08Button.Content = "SSG 08&#xA;SOLD";
            }
            else if (ssg08Clicked == false)
            {
                c.contents.Remove(ssg08);
                c.totalCost -= ssg08.cost;
                c.noOfItems--;
                ssg08Clicked = false;
                ssg08Button.Content = "SSG 08&#xA;$1700";
            }
        }

        private void augButton_Click(object sender, RoutedEventArgs e)
        {
            Do_augButton_Click(sender, e, (App.Current as App).c, App.aug); 
        }

        private void Do_augButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment aug)
        {
            if (augClicked == false)
            {
                c.contents.Add(aug);
                c.totalCost += aug.cost;
                c.noOfItems++;
                augClicked = true;
                augButton.Content = "AUG&#xA;SOLD";
            }
            else if (augClicked == false)
            {
                c.contents.Remove(aug);
                c.totalCost -= aug.cost;
                c.noOfItems--;
                augClicked = false;
                augButton.Content = "AUG&#xA;$3300";
            }
        }

        private void g3Button_Click(object sender, RoutedEventArgs e)
        {
            Do_g3Button_Click(sender, e, (App.Current as App).c, App.g3);
        }

        private void Do_g3Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment g3)
        {
            if (g3Clicked == false)
            {
                c.contents.Add(g3);
                c.totalCost += g3.cost;
                c.noOfItems++;
                g3Clicked = true;
                g3Button.Content = "G3SG1&#xA;SOLD";
            }
            else if (g3Clicked == false)
            {
                c.contents.Remove(g3);
                c.totalCost -= g3.cost;
                c.noOfItems--;
                g3Clicked = false;
                g3Button.Content = "G3SG1&#xA;$5000";
            }
        }

        private void sg553Button_Click(object sender, RoutedEventArgs e)
        {
            Do_sg553Button_Click(sender, e, (App.Current as App).c, App.sg553);
        }

        private void Do_sg553Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment sg553)
        {
            if (sg553Clicked == false)
            {
                c.contents.Add(sg553);
                c.totalCost += sg553.cost;
                c.noOfItems++;
                sg553Clicked = true;
                sg553Button.Content = "SG553&#xA;SOLD";
            }
            else if (sg553Clicked == false)
            {
                c.contents.Remove(sg553);
                c.totalCost -= sg553.cost;
                c.noOfItems--;
                sg553Clicked = false;
                sg553Button.Content = "SG553&#xA;$3000";
            }
        }

        private void scar20Button_Click(object sender, RoutedEventArgs e)
        {
            Do_scar20Button_Click(sender, e, (App.Current as App).c, App.scar20);
        }

        private void Do_scar20Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment scar20)
        {
            if (scar20Clicked == false)
            {
                c.contents.Add(scar20);
                c.totalCost += scar20.cost;
                c.noOfItems++;
                scar20Clicked = true;
                scar20Button.Content = "SCAR-20&#xA;SOLD";
            }
            else if (scar20Clicked == false)
            {
                c.contents.Remove(scar20);
                c.totalCost -= scar20.cost;
                c.noOfItems--;
                scar20Clicked = false;
                scar20Button.Content = "SCAR-20&#xA;$5000";
            }
        }

        private void famasButton_Click(object sender, RoutedEventArgs e)
        {
            Do_famasButton_Click(sender, e, (App.Current as App).c, App.famas);
        }

        private void Do_famasButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment famas)
        {
            if (famasClicked == false)
            {
                c.contents.Add(famas);
                c.totalCost += famas.cost;
                c.noOfItems++;
                famasClicked = true;
                famasButton.Content = "FAMAS&#xA;SOLD";
            }
            else if (famasClicked == false)
            {
                c.contents.Remove(famas);
                c.totalCost -= famas.cost;
                c.noOfItems--;
                famasClicked = false;
                famasButton.Content = "FAMAS&#xA;$2250";
            }
        }

        private void galilARButton_Click(object sender, RoutedEventArgs e)
        {
            Do_galilARButton_Click(sender, e, (App.Current as App).c, App.galilAR);
        }

        private void Do_galilARButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment galilAR)
        {
            if (galilARClicked == false)
            {
                c.contents.Add(galilAR);
                c.totalCost += galilAR.cost;
                c.noOfItems++;
                galilARClicked = true;
                galilARButton.Content = "Galil AR&#xA;SOLD";
            }
            else if (galilARClicked == false)
            {
                c.contents.Remove(galilAR);
                c.totalCost -= galilAR.cost;
                c.noOfItems--;
                galilARClicked = false;
                galilARButton.Content = "galil AR&#xA;$2000";
            }
        }

    }
}