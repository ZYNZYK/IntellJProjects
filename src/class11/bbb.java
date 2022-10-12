package class11;

public class bbb {
    public class Dog {

        String name;
        double weight;
        String breed;

        public Dog(String dogName, double dogWeight, String breed) {
            this.name = dogName;
            this.weight = dogWeight;

        }

        void printInfo() {
            System.out.println("Name " + name + " weight " + weight + " breed " + breed);
        }

        class dog extends Main.Animal {
            public dog(String dogName, double dogWeight, String dogBreed) {
                super(dogName, dogWeight, dogBreed);
            }


            public void main(String[] args) {
                Dog dog = new Dog("Tarzan", 50, " Mutt");
                Dog dog1 = new Dog("Lucy", 10, "Mutt");
                dog.printInfo();
            }
        }

    }
}

