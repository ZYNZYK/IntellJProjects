package class11;

    class AnotherClass{
        private String privateMethod(){
            return "private";
        }
        String defaultMethod(){
            String s="default";
            return s;
        }
        protected String protectedMethod(){
            return "protected";
        }
        public String publicMethod(){
            return "public";
        }
    }
    class Task138AccessModifiers {
        public static void main(String[] args) {
            System.out.println(new AnotherClass().defaultMethod());
            System.out.println(new AnotherClass().protectedMethod());
            System.out.println(new AnotherClass().publicMethod());
            //System.out.println(new AnotherClass().privateMethod());
        }}
