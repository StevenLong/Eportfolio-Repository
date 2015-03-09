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
    public partial class Equip : PhoneApplicationPage
    {
        public Equip()
        {
            InitializeComponent();
        }

        bool armorClicked = false;
        bool vestClicked = false;
        bool defuseClicked = false;

        private void armorButton_Click(object sender, RoutedEventArgs e)
        {
            Do_armorButton_Click(sender, e, (App.Current as App).c, App.armor);
        }

        private void Do_armorButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment armor)
        {
            if (armorClicked == false)
            {
                c.contents.Add(armor);
                c.totalCost += armor.cost;
                c.noOfItems++;
                armorClicked = true;
                armorButton.Content = "Kevlar Vest + Helmet&#xA;SOLD";
            }
            else if (armorClicked == false)
            {
                c.contents.Remove(armor);
                c.totalCost -= armor.cost;
                c.noOfItems--;
                armorClicked = false;
                armorButton.Content = "Kevlar Vest + Helmet&#xA;$1000";
            }
        }

        private void vestButton_Click(object sender, RoutedEventArgs e)
        {
            Do_vestButton_Click(sender, e, (App.Current as App).c, App.vest);
        }

        private void Do_vestButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment vest)
        {
            if (vestClicked == false)
            {
                c.contents.Add(vest);
                c.totalCost += vest.cost;
                c.noOfItems++;
                vestClicked = true;
                vestButton.Content = "Kevlar Vest&#xA;SOLD";
            }
            else if (vestClicked == false)
            {
                c.contents.Remove(vest);
                c.totalCost -= vest.cost;
                c.noOfItems--;
                vestClicked = false;
                vestButton.Content = "Kevlar Vest&#xA;$650";
            }
        }

        private void defuseButton_Click(object sender, RoutedEventArgs e)
        {
            Do_defuseButton_Click(sender, e, (App.Current as App).c, App.defusalKit);
        }

        private void Do_defuseButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment defusalKit)
        {
            if (defuseClicked == false)
            {
                c.contents.Add(defusalKit);
                c.totalCost += defusalKit.cost;
                c.noOfItems++;
                defuseClicked = true;
                defuseButton.Content = "Defuse Kit&#xA;SOLD";
            }
            else if (defuseClicked == false)
            {
                c.contents.Remove(defusalKit);
                c.totalCost -= defusalKit.cost;
                c.noOfItems--;
                defuseClicked = false;
                defuseButton.Content = "Defuse Kit&#xA;$400";
            }
        }
    }
}