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
    public partial class Shotguns : PhoneApplicationPage
    {
        public Shotguns()
        {
            InitializeComponent();
        }

        bool XM1014Clicked = false;
        bool mag7Clicked = false;
        bool novaClicked = false;
        bool sawedOffClicked = false;

        private void novaButton_Click(object sender, RoutedEventArgs e)
        {
            Do_novaButton_Click(sender, e, (App.Current as App).c, App.nova);
        }

        private void Do_novaButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment nova)
        {
            if (novaClicked == false)
            {
                c.contents.Add(nova);
                c.totalCost += nova.cost;
                c.noOfItems++;
                novaClicked = true;
                novaButton.Content = "Nova&#xA;SOLD";
            }
            else if (novaClicked == false)
            {
                c.contents.Remove(nova);
                c.totalCost -= nova.cost;
                c.noOfItems--;
                novaClicked = false;
                novaButton.Content = "Nova&#xA;$1200";
            }
        }

        private void mag7Button_Click(object sender, RoutedEventArgs e)
        {
            Do_mag7Button_Click(sender, e, (App.Current as App).c, App.mag7);
        }

        private void Do_mag7Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment mag7)
        {
            if (mag7Clicked == false)
            {
                c.contents.Add(mag7);
                c.totalCost += mag7.cost;
                c.noOfItems++;
                mag7Clicked = true;
                mag7Button.Content = "Mag-7&#xA;SOLD";
            }
            else if (mag7Clicked == false)
            {
                c.contents.Remove(mag7);
                c.totalCost -= mag7.cost;
                c.noOfItems--;
                mag7Clicked = false;
                mag7Button.Content = "Mag-7&#xA;$1800";
            }
        }

        private void sawedOffButton_Click(object sender, RoutedEventArgs e)
        {
            Do_sawedOffButton_Click(sender, e, (App.Current as App).c, App.sawedOff);
        }

        private void Do_sawedOffButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment sawedOff)
        {
            if (sawedOffClicked == false)
            {
                c.contents.Add(sawedOff);
                c.totalCost += sawedOff.cost;
                c.noOfItems++;
                sawedOffClicked = true;
                sawedOffButton.Content = "Sawed-Off&#xA;SOLD";
            }
            else if (sawedOffClicked == false)
            {
                c.contents.Remove(sawedOff);
                c.totalCost -= sawedOff.cost;
                c.noOfItems--;
                sawedOffClicked = false;
                sawedOffButton.Content = "Sawed-Off&#xA;$1200";
            }
        }

        private void XM1014Button_Click(object sender, RoutedEventArgs e)
        {
            Do_XM1014Button_Click(sender, e, (App.Current as App).c, App.XM1014);
        }

        private void Do_XM1014Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment XM1014)
        {
            if (XM1014Clicked == false)
            {
                c.contents.Add(XM1014);
                c.totalCost += XM1014.cost;
                c.noOfItems++;
                XM1014Clicked = true;
                XM1014Button.Content = "XM1014&#xA;SOLD";
            }
            else if (XM1014Clicked == false)
            {
                c.contents.Remove(XM1014);
                c.totalCost -= XM1014.cost;
                c.noOfItems--;
                novaClicked = false;
                XM1014Button.Content = "XM1014&#xA;$3000";
            }
        }

    }
}