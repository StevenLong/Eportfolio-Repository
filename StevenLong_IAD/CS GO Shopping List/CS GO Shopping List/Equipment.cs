using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CS_GO_Shopping_List
{
    public class Equipment
    {

        public String name { get; set; }
        public String type { get; set; }
        public int cost { get; set; }

        public Equipment(String name, String type, int cost)
        {
            this.name = name;
            this.type = type;
            this.cost = cost;
        }
        
      /*  public static Equipment desertEagle = new Equipment("Desert Eagle", "Pistol", 700);

        public static Equipment dualBerettas = new Equipment("Dual Berettas","Pistol", 500);

        public static Equipment glock18 = new Equipment("Glock-18", "Pistol", 200);

        public static Equipment fiveSeven = new Equipment("Five-seveN", "Pistol", 500);

        public static Equipment tec9 = new Equipment("Tec-9", "Pistol", 500);

        public static Equipment P2000 = new Equipment("P2000", "Pistol", 200);

        public static Equipment XM1014 = new Equipment("Dual Berettas", "Pistol", 500);

        public static Equipment mag7 = new Equipment("MAG-7", "Pistol", 1800);

      //  public static Equipment dualBerettas = new Equipment("Dual Berettas", "Pistol", 500);

        public static Equipment nova = new Equipment("Nova", "Pistol", 1200);

        public static Equipment sawedOff = new Equipment("Sawed-Off", "Pistol", 1200);

       // public static Equipment dualBerettas = new Equipment("Dual Berettas", "Pistol", 500);*/

    }
}
