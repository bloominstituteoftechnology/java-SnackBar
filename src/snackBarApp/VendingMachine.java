package snackBarApp;

public class VendingMachine()
        {
            private static int maxId = 0;
            public int id;
            public String name;

            public VendingMachine(String name)
            {
                maxId++;
                id = maxId;
                this.name = name;
            }

            public getName()
            {
                System.out.println("name: " + name);
             return name;
            }
        }