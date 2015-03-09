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
    public partial class Grenades : PhoneApplicationPage
    {
        public Grenades()
        {
            InitializeComponent();
        }

        bool HEGrenadeClicked = false;
        bool smokeClicked = false;
        bool flashClicked = false;
        bool decoyClicked = false;
        bool incendiaryClicked = false;

        private void HEGrenadeButton_Click(object sender, RoutedEventArgs e)
        {
            Do_HEGrenadeButton_Click(sender, e, (App.Current as App).c, App.HEGrenade);
        }

        private void Do_HEGrenadeButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment HEGrenade)
        {
            if (HEGrenadeClicked == false)
            {
                c.contents.Add(HEGrenade);
                c.totalCost += HEGrenade.cost;
                c.noOfItems++;
                HEGrenadeClicked = true;
                HEGrenadeButton.Content = "HE Grenade&#xA;SOLD";
            }
            else if (HEGrenadeClicked == false)
            {
                c.contents.Remove(HEGrenade);
                c.totalCost -= HEGrenade.cost;
                c.noOfItems--;
                HEGrenadeClicked = false;
                HEGrenadeButton.Content = "HEGrenade&#xA;$300";
            }
        }

        private void smokeGrenadeButton_Click(object sender, RoutedEventArgs e)
        {
            Do_smokeButton_Click(sender, e, (App.Current as App).c, App.smokeGrenade);
        }

        private void Do_smokeButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment smokeGrenade)
        {
            if (smokeClicked == false)
            {
                c.contents.Add(smokeGrenade);
                c.totalCost += smokeGrenade.cost;
                c.noOfItems++;
                smokeClicked = true;
                smokeGrenadeButton.Content = "Smoke Grenade&#xA;SOLD";
            }
            else if (smokeClicked == false)
            {
                c.contents.Remove(smokeGrenade);
                c.totalCost -= smokeGrenade.cost;
                c.noOfItems--;
                smokeClicked = false;
                smokeGrenadeButton.Content = "Smoke Grenade&#xA;$300";
            }
        }

        private void flashbangButton_Click(object sender, RoutedEventArgs e)
        {
            Do_flashButton_Click(sender, e, (App.Current as App).c, App.flashbang);
        }

        private void Do_flashButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment flashbang)
        {
            if (flashClicked == false)
            {
                c.contents.Add(flashbang);
                c.totalCost += flashbang.cost;
                c.noOfItems++;
                flashClicked = true;
                flashbangButton.Content = "Flashing Grenade&#xA;SOLD";
            }
            else if (flashClicked == false)
            {
                c.contents.Remove(flashbang);
                c.totalCost -= flashbang.cost;
                c.noOfItems--;
                flashClicked = false;
                flashbangButton.Content = "Flashbang Grenade&#xA;$200";
            }
        }

        private void decoyButton_Click(object sender, RoutedEventArgs e)
        {
            Do_decoyButton_Click(sender, e, (App.Current as App).c, App.decoyGrenade);
        }

        private void Do_decoyButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment decoyGrenade)
        {
            if (decoyClicked == false)
            {
                c.contents.Add(decoyGrenade);
                c.totalCost += decoyGrenade.cost;
                c.noOfItems++;
                decoyClicked = true;
                decoyButton.Content = "Decoy Grenade&#xA;SOLD";
            }
            else if (decoyClicked == false)
            {
                c.contents.Remove(decoyGrenade);
                c.totalCost -= decoyGrenade.cost;
                c.noOfItems--;
                decoyClicked = false;
                decoyButton.Content = "Decoy Grenade&#xA;$50";
            }
        }

        private void incendiaryButton_Click(object sender, RoutedEventArgs e)
        {
            Do_incendiaryButton_Click(sender, e, (App.Current as App).c, App.incendiary);
        }

        private void Do_incendiaryButton_Click(object sender, RoutedEventArgs e, Cart c, Equipment incendiary)
        {
            if (incendiaryClicked == false)
            {
                c.contents.Add(incendiary);
                c.totalCost += incendiary.cost;
                c.noOfItems++;
                incendiaryClicked = true;
                incendiaryButton.Content = "Incendiary Grenade&#xA;SOLD";
            }
            else if (HEGrenadeClicked == false)
            {
                c.contents.Remove(incendiary);
                c.totalCost -= incendiary.cost;
                c.noOfItems--;
                incendiaryClicked = false;
                incendiaryButton.Content = "Incendiary Grenade&#xA;$600";
            }
        }
    }
}