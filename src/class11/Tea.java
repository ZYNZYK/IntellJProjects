package class11;

public class Tea {
    String name;
    int spoon;
    String a;

    Tea(String teaName, int teaSpoon) {
        this.name = teaName;
        this.spoon = teaSpoon;
    }

    public Tea() {

    }

    void addSugar() {
    }

    public static class lemonTea extends Tea {

        private static Object ChaiTea;

        lemonTea(String teaName, int teaSpoon, String a) {
            super(teaName, teaSpoon);
           this.spoon = teaSpoon;

          //  System.out.println( name+" we need"+ 2+" spoons of sugar");
        }

        public lemonTea(String s) {
            super();

        }

        static class ChaiTea extends Tea {
            ChaiTea(String teaName, int teaSpoon){
                super(teaName,teaSpoon);
                this.spoon = teaSpoon;
            }
        }
            public static void main(String[] args) {
               // Tea tea=new Tea(lemonTea, 2);
              new lemonTea("Lemon Tea"+" we need"+ 2+" spoons of sugar");
                System.out.println("For Lemon Tea we need 2 spoons of sugar\n");
                new ChaiTea("ChaiTea",1);
                System.out.println("For Chai Tea we need 1 spoon of sugar\n");

            }
        }
    }