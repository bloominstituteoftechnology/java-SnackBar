package snackBarApp;


public class Customer
        {
            public static int maxId = 0;
            public int id;
            public String name;
            public double cashOnHand;

            public Customer(String name, double cash)
            {
                maxId++;
                id = maxId;
                this.cashOnHand = cash;
                this.name = name;
            }

            public double addCash(double addValue)
            {
                cashOnHand += addValue;
                return cashOnHand;
            }
            public String getName()
            {
                System.out.println("name: " + name);
                return name;
            }
            public double getCashOnHand()
            {
                return cashOnHand;
            }

            public double buy(double price)
                {
                    if(price > getCashOnHand()){
                        System.out.println("Insufficient fund");
                        return cashOnHand;
                    } else {
                        this.cashOnHand -= price;
                        System.out.println("You spent" + price + "\n" +
                                            "and have:" + cashOnHand + "left" + "\n" +
                                            "");
                        return cashOnHand;
                    }
                }
                @Override
                public String toString()
                {
                    String rtnStr = "id: " + id + "\n" +
                                    "name: " + name + "\n" +
                                    "cash on hand: " + cashOnHand;
                    return rtnStr;
                }
        }