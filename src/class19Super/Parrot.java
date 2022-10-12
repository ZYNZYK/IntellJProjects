package class19Super;
    class Parrot extends Bird{

        Parrot(String name,String color,int age,double weight){
            super(name, color, age, weight);
       /* this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;*/
        }
    }
    class Crow extends Bird{
        boolean isClever;

        Crow(String name,String color,int age,double weight, boolean isClever){
      /* this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;*/
            super(name, color, age, weight);
            this.isClever=isClever;
        }
    }
    class Sparrow extends Bird{
        Sparrow(String name,String color,int age,double weight){
       /* this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;*/
            super(name, color, age, weight);
        }
    }
