package repls;

public class repl181 {
    //class Account{
        private String acc_no;
        private String name;
        private String email;
        private String amount;

        public repl181(String account, String eName, String eMail,String eAmount){
            setAcc_no(account);
            setName(eName);
            setEmail(eMail);
            setAmount(eAmount);
        }


    public String getAcc_no(){
            return acc_no;
        }
        public String getName(){
            return name;
        }
        public String getEmail(){
            return email;
        }
        public String getAmount(){
            return amount;
        }
        public void setName(String eName){name = "Sumair";
        }
        public void setEmail(String eMail){
            email="sumair@syntax.com";
        }
        public void setAmount(String eAmount){
            amount= "50000.0";
        }
        public void setAcc_no(String account){
            acc_no="7560504000";
        }
    void printInfo(){
        System.out.println(acc_no+" " +name+" "+email+" "+amount);
    }
}

class Main5{
    public static void main(String args[]){
                repl181 account=new repl181("7560504000","Sumair","sumair@syntax.com","50000.0");
                account.printInfo();

            }
        }