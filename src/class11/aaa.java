package class11;


class Main {
    public String country;
    public String continent;


    public static class Animal {
        String name;
        double weight;
        static String breed="Mutt";


        public Animal (String dogName,double dogWeight,String dogBreed){
            this.name=dogName;
            this.weight=dogWeight;
            String breed="Mutt";

        }
        public void printInfo(){
            System.out.println("Name "+ name+" breed "+breed+" weight "+weight);
        }


    }
}