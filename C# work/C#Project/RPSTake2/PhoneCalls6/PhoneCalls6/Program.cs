using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PhoneCalls6
{
    class Program
    {
        static void Main(string[] args)
        {
            {
                int[] callLenght = { 2, 5 };
                double[] rate = { 0.03, 0.12 };
                double priceOfCall;
                Console.WriteLine("{0,10}{1, 10}{2,10}", "minutes", "Rate", "Price");

                for (int x = 0; x < callLenght.Length; ++x)
                    for (int y = 0; y < rate.Length; ++y)
                    {
                        priceOfCall = CalcPhoneCallPrice(callLenght[x], rate[y]);
                        Console.WriteLine("{0, 10}{1, 10}{2, 10}", callLenght[x], rate[y], priceOfCall.ToString("c"));
                    }
            }
        }
        public static double CalcPhoneCallPrice(int minutes, double rate)
        {
            const double BASE_FEE = 0.25;
            double callFee;
            callFee = BASE_FEE + minutes * rate;
            return callFee;
        }

    }
}