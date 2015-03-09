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
    public partial class SubmachineGuns : PhoneApplicationPage
    {
        public SubmachineGuns()
        {
            InitializeComponent();
        }

        bool ppBizonClicked = false;
        bool p90Clicked = false;
        bool mp7Clicked = false;
        bool ump45Clicked = false;
        bool mac10Clicked = false;
        bool mp9Clicked = false;

        private void ppBizonButton_Click(object sender, RoutedEventArgs e)
        {
            Do_ppBizon_Click(sender, e, (App.Current as App).c, App.ppBizon);
        }

        private void Do_ppBizon_Click(object sender, RoutedEventArgs e, Cart c, Equipment ppBizon)
        {
            if (ppBizonClicked == false)
            {
                c.contents.Add(ppBizon);
                c.totalCost += ppBizon.cost;
                c.noOfItems++;
                ppBizonClicked = true;
                ppBizonButton.Content = "PP-Bizon&#xA;SOLD";
            }
            else if (ppBizonClicked == false)
            {
                c.contents.Remove(ppBizon);
                c.totalCost -= ppBizon.cost;
                c.noOfItems--;
                ppBizonClicked = false;
                ppBizonButton.Content = "PP-Bizon&#xA;$1400";
            }
        }

        private void p90Button_Click(object sender, RoutedEventArgs e)
        {
            Do_p90Button_Click(sender, e, (App.Current as App).c, App.p90);
        }

        private void Do_p90Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment p90)
        {
            if (p90Clicked == false)
            {
                c.contents.Add(p90);
                c.totalCost += p90.cost;
                c.noOfItems++;
                p90Clicked = true;
                p90Button.Content = "P90&#xA;SOLD";
            }
            else if (p90Clicked == false)
            {
                c.contents.Remove(p90);
                c.totalCost -= p90.cost;
                c.noOfItems--;
                p90Clicked = false;
                p90Button.Content = "P90&#xA;$2350";
            }
        }

        private void mp7Button_Click(object sender, RoutedEventArgs e)
        {
            Do_mp7Button_Click(sender, e, (App.Current as App).c, App.mp7);
        }

        private void Do_mp7Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment mp7)
        {
            if (mp7Clicked == false)
            {
                c.contents.Add(mp7);
                c.totalCost += mp7.cost;
                c.noOfItems++;
                mp7Clicked = true;
                mp7Button.Content = "MP7&#xA;SOLD";
            }
            else if (mp7Clicked == false)
            {
                c.contents.Remove(mp7);
                c.totalCost -= mp7.cost;
                c.noOfItems--;
                mp7Clicked = false;
                mp7Button.Content = "MP7&#xA;$1700";
            }
        }

        private void ump45Button_Click(object sender, RoutedEventArgs e)
        {
            Do_ump45Button_Click(sender, e, (App.Current as App).c, App.ump45);
        }

        private void Do_ump45Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment ump45)
        {
            if (ump45Clicked == false)
            {
                c.contents.Add(ump45);
                c.totalCost += ump45.cost;
                c.noOfItems++;
                ump45Clicked = true;
                ump45Button.Content = "UMP-45&#xA;SOLD";
            }
            else if (ump45Clicked == false)
            {
                c.contents.Remove(ump45);
                c.totalCost -= ump45.cost;
                c.noOfItems--;
                p90Clicked = false;
                p90Button.Content = "UMP-45&#xA;$1200";
            }
        }

        private void mac10Button_Click(object sender, RoutedEventArgs e)
        {
            Do_mac10Button_Click(sender, e, (App.Current as App).c, App.mac10);
        }

        private void Do_mac10Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment mac10)
        {
            if (mac10Clicked == false)
            {
                c.contents.Add(mac10);
                c.totalCost += mac10.cost;
                c.noOfItems++;
                mac10Clicked = true;
                mac10Button.Content = "MAC-10&#xA;SOLD";
            }
            else if (mac10Clicked == false)
            {
                c.contents.Remove(mac10);
                c.totalCost -= mac10.cost;
                c.noOfItems--;
                mac10Clicked = false;
                mac10Button.Content = "MAC-10&#xA;$1050";
            }
        }

        private void mp9Button_Click(object sender, RoutedEventArgs e)
        {
            Do_mp9Button_Click(sender, e, (App.Current as App).c, App.mp9);
        }

        private void Do_mp9Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment mp9)
        {
            if (mp9Clicked == false)
            {
                c.contents.Add(mp9);
                c.totalCost += mp9.cost;
                c.noOfItems++;
                mp9Clicked = true;
                mp9Button.Content = "MP9&#xA;SOLD";
            }
            else if (mp9Clicked == false)
            {
                c.contents.Remove(mp9);
                c.totalCost -= mp9.cost;
                c.noOfItems--;
                mp9Clicked = false;
                mp9Button.Content = "MP9&#xA;$1250";
            }
        }

    }
}