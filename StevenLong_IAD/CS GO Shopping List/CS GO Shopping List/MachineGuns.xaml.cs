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
    public partial class MachineGuns : PhoneApplicationPage
    {
        public MachineGuns()
        {
            InitializeComponent();
        }

        bool negevClicked = false;
        bool m249Clicked = false;

        private void negevButton_Click(object sender, RoutedEventArgs e)
        {
            Do_negevButton_Click(sender, e, (App.Current as App).c, App.negev);
        }

        private void Do_negevButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment negev)
        {
            if (negevClicked == false)
            {
                c.contents.Add(negev);
                c.totalCost += negev.cost;
                c.noOfItems++;
                negevClicked = true;
                negevButton.Content = "Negev&#xA;SOLD";
            }
            else if (negevClicked == false)
            {
                c.contents.Remove(negev);
                c.totalCost -= negev.cost;
                c.noOfItems--;
                negevClicked = false;
                negevButton.Content = "negev&#xA;$5700";
            }
        }

        private void m249Button_Click(object sender, RoutedEventArgs e)
        {
            Do_m249Button_Click(sender, e, (App.Current as App).c, App.m249);
        }

        private void Do_m249Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment m249)
        {
            if (m249Clicked == false)
            {
                c.contents.Add(m249);
                c.totalCost += m249.cost;
                c.noOfItems++;
                m249Clicked = true;
                m249Button.Content = "M249&#xA;SOLD";
            }
            else if (m249Clicked == false)
            {
                c.contents.Remove(m249);
                c.totalCost -= m249.cost;
                c.noOfItems--;
                m249Clicked = false;
                m249Button.Content = "M249&#xA;$5200";
            }
        }
    }
}