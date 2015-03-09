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
    public partial class Pistols : PhoneApplicationPage
    {
        public Pistols()
        {
            InitializeComponent();
            
        }

        bool DEClicked = false;
        bool DBClicked = false;
        bool G18Clicked = false;
        bool FSClicked = false;
        bool tecClicked = false;
        bool P250Clicked = false;
        bool P2000Clicked = false;

        private void desertEagleButton_Click(object sender, RoutedEventArgs e)
        {
            Do_DEButton_Click(sender, e, (App.Current as App).c, App.desertEagle);
        }

        private void Do_DEButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment desertEagle)
        {
            if (DEClicked == false)
            {
                c.contents.Add(desertEagle);
                c.totalCost += desertEagle.cost;
                c.noOfItems++;
                DEClicked = true;
                desertEagleButton.Content = "Desert Eagle&#xD;&#xA;SOLD";
            }
            else if (DEClicked == true)
            {
                c.contents.Remove(desertEagle);
                c.totalCost -= desertEagle.cost;
                c.noOfItems--;
                DEClicked = false;
                desertEagleButton.Content = "Desert Eagle&#xD;&#xA;$700";
            }
        }

        private void dualBerettasButton_Click(object sender, RoutedEventArgs e)
        {
            Do_DBButton_Click(sender, e, (App.Current as App).c, App.dualBerettas);
        }

        private void Do_DBButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment dualBerettas)
        {

            if (DBClicked == false)
            {
                c.contents.Add(dualBerettas);
                c.totalCost += dualBerettas.cost;
                c.noOfItems++;
                DBClicked = true;
                dualBerettasButton.Content = "Dual Berettas&#xA;SOLD";
            }
            else if (DBClicked == true)
            {
                c.contents.Remove(dualBerettas);
                c.totalCost -= dualBerettas.cost;
                c.noOfItems--;
                DEClicked = false;
                dualBerettasButton.Content = "Dual Berettas&#xA;$500";
            }
        } 

        private void glock18Button_Click(object sender, RoutedEventArgs e)
        {
            Do_G18Button_Click(sender, e, (App.Current as App).c, App.glock18);
        }

        private void Do_G18Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment glock18)
        {
            if (G18Clicked == false)
            {
                c.contents.Add(glock18);
                c.totalCost += glock18.cost;
                c.noOfItems++;
                G18Clicked = true;
                glock18Button.Content = "Glock-18&#xA;SOLD";
            }
            else if (G18Clicked == true)
            {
                c.contents.Remove(glock18);
                c.totalCost -= glock18.cost;
                c.noOfItems--;
                G18Clicked = false;
                glock18Button.Content = "Glock-18&#xA;$200";

            }
        }

        private void fiveSeveNButton_Click(object sender, RoutedEventArgs e)
        {
            Do_FSButton_Click(sender, e, (App.Current as App).c, App.fiveSeven);
        }

        private void Do_FSButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment fiveSeven)
        {
            if (FSClicked == false)
            {
                c.contents.Add(fiveSeven);
                c.totalCost += fiveSeven.cost;
                c.noOfItems++;
                FSClicked = true;
                fiveSeveNButton.Content = "Five-SeveN&#xA;SOLD";
            }
            else if (FSClicked == false)
            {
                c.contents.Remove(fiveSeven);
                c.totalCost -= fiveSeven.cost;
                c.noOfItems--;
                FSClicked = false;
                fiveSeveNButton.Content = "Five-SeveN&#xA;$500";
            }
        }

        private void tec9Button_Click(object sender, RoutedEventArgs e)
        {
            Do_T9Button_Click(sender, e, (App.Current as App).c, App.tec9);
        }

        private void Do_T9Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment tec9)
        {
            if (tecClicked == false)
            {
                c.contents.Add(tec9);
                c.totalCost += tec9.cost;
                c.noOfItems++;
                tecClicked = true;
                tec9Button.Content = "Tec-9&#xD;&#xA;SOLD";
            }
            else if (tecClicked == false)
            {
                c.contents.Remove(tec9);
                c.totalCost -= tec9.cost;
                c.noOfItems--;
                tecClicked = false;
                tec9Button.Content = "Tec-9&#xD;&#xA;$500";
            }
        }

        private void P250Button_Click(object sender, RoutedEventArgs e)
        {
            Do_P250Button_Click(sender, e, (App.Current as App).c, App.P250);
        }

        private void Do_P250Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment P250)
        {
            if (P250Clicked == false)
            {
                c.contents.Add(P250);
                c.totalCost += P250.cost;
                c.noOfItems++;
                P250Clicked = true;
                P250Button.Content = "P250&#xD;&#xA;SOLD";
            }
            else if (P250Clicked == false)
            {
                c.contents.Remove(P250);
                c.totalCost -= P250.cost;
                c.noOfItems--;
                P250Clicked = false;
                P250Button.Content = "P250&#xD;&#xA;$300";
            }
        }

        private void p2000Button_Click(object sender, RoutedEventArgs e)
        {
            Do_P2000Button_Click(sender, e, (App.Current as App).c, App.P2000);
        }

        private void Do_P2000Button_Click(object sender, RoutedEventArgs e, Cart c, Equipment P2000)
        {
            if (P2000Clicked == false)
            {
                c.contents.Add(P2000);
                c.totalCost += P2000.cost;
                c.noOfItems++;
                P2000Clicked = true;
                p2000Button.Content = "P2000&#xD;&#xA;SOLD";
            }
            else if (P2000Clicked == false)
            {
                c.contents.Remove(P2000);
                c.totalCost -= P2000.cost;
                c.noOfItems--;
                P2000Clicked = false;
                p2000Button.Content = "P2000&#xD;&#xA;$200";
            }
        }

    }
}