package snackBarApp;


public class Customer()
        {
            public static int maxId = 0;
            public int id;
            public String name;
            public double cashOnHand;
            public Customer(String name, double cash)
            {
                maxId++;
                id = maxId;
                this.cash = cash;
            }

            public addCash(double addValue)
            {
                cashOnHand += addValue;
            }
            public String getName()
            {
                System.out.println("name: " + name);
                return name;
            }

            public buy(int price)
                {
                    if(price > cashOnHand){
                        System.out.println("Insufficient fund");
                    } else {
                        cashOnHand -= price;
                        System.out.println("You spent" + price + "\n" +
                                            "and have:" + cashOnHand + "left");
                    }
                }


        }