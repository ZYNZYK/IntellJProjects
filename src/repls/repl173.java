package repls;

public class repl173 {
    public static class Tea {
        String name;
        int spoon;

        Tea(String teaName, int teaSpoon) {
            this.name = teaName;
            this.spoon = teaSpoon;
        }


        void addSugar() {
        }

        class lemonTea extends Tea {

            lemonTea(String teaName, int teaSpoon, String a) {
                super(teaName, teaSpoon);
                this.spoon = teaSpoon;

            }

        }

        static class ChaiTea extends Tea {
            ChaiTea(String teaName, int teaSpoon) {
                super(teaName, teaSpoon);
                this.spoon = teaSpoon;
            }
        }

        public static void main(String[] args) {
            // Tea tea=new Tea(lemonTea, 2);
            //new lemonTea("Lemon Tea"+" we need"+ 2+" spoons of sugar");
            System.out.println("For Lemon Tea we need 2 spoons of sugar");
            new ChaiTea("ChaiTea", 1);
            System.out.println("For Chai Tea we need 1 spoon of sugar");

        }
    }
}