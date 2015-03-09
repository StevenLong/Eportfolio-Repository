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
    public partial class Page1 : PhoneApplicationPage
    {
        public Page1()
        {
            InitializeComponent();
        }

        private void pistolsButton_Click(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("Pistols.xaml", UriKind.RelativeOrAbsolute));
        }

        private void shotgunsButton_Click(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("Shotguns.xaml", UriKind.RelativeOrAbsolute));
        }

        private void submachineGunsButton_Click(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("SubmachineGuns.xaml", UriKind.RelativeOrAbsolute));
        }

        private void riflesButton_Click(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("Rifles.xaml", UriKind.RelativeOrAbsolute));
        }

        private void machineGunsButton_Click(object sender, RoutedEventArgs e)
        {
            NavigationService.Navigate(new Uri("MachineGuns.xaml", UriKind.RelativeOrAbsolute));
        }
    }
}