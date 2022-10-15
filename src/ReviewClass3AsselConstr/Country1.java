package ReviewClass3AsselConstr;

public class Country1 {

    public static class USA extends Country {

        USA(String name) {
            super(name);
        }
    }

        public static void main(String[] args) {

            USA usa=new USA("Washington");
            usa.name="USA"; //public
            usa.capital="DC"; //protected
        }
    }
