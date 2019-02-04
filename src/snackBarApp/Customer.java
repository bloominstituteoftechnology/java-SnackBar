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

            public double buy(double price)
                {
                    if(price > cashOnHand){
                        System.out.println("Insufficient fund");
                        return cashOnHand;
                    } else {
                        cashOnHand -= price;
                        System.out.println("You spent" + price + "\n" +
                                            "and have:" + cashOnHand + "left");
                        return price;
                    }
                }
        }