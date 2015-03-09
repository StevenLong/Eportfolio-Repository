using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CS_GO_Shopping_List
{
    public class Cart
    {

        public List<Equipment> contents;
        public int totalCost { get; set; }
        public int noOfItems { get; set; }

        public Cart() {
            totalCost = 0;
            noOfItems = 0;
            contents = new List<Equipment>();
        }

        public String contains;

        public String ListContent(){
            foreach(Equipment item in contents){
                item.name += contains;
            }
            return contains;
        }
    }
}
