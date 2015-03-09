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
    public partial class CartPage : PhoneApplicationPage
    {

        public CartPage()
        {
            InitializeComponent();
        }

        String contents { get { return this.getContents(); } }

        public String getContents(){
            String contents = (App.Current as App).c.ListContent();
            return contents;
        }

        int totalCost { get { return this.getTotalCost(); } }

        public int getTotalCost()
        {
            int totalCost = (App.Current as App).c.totalCost;
            return totalCost;
        }

        int totalItems { get { return this.getTotalItems(); } }

        public int getTotalItems()
        {
            int totalItems = (App.Current as App).c.noOfItems;
            return totalItems;
        }

    }
}