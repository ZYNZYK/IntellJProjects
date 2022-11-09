package repls;

public class repl182<bdayFormat> {
    private String firstname;
    private String lastname;
    private String birthmonth;
    private String birthday;
    private String birthyear;
    private String ssn;

    public repl182(String firstName, String lastName, String birthMonth, String birthDay, String birthYear, String SSN) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.birthmonth = birthMonth;
        this.birthday = birthDay;
        this.birthyear = birthYear;
        this.ssn = SSN;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBirthmonth() {
        return birthmonth;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public String getSsn() {
        return ssn;
    }

   public String formatBirthday(String bdayFormat) {
        String format = (birthmonth + "/" + birthday + "/" + birthyear);
        return format;
    }

    void printInfo() {
        System.out.println(birthmonth + "/" + birthday + "/" + birthyear);
    }
}

class repl5{
    public static void main(String args[]) {
        repl182 employee = new repl182("John","Doe", "10","25","1900","123-45-6789") ;
      System.out.println(employee.getFirstname());
      System.out.println(employee.getLastname());
      //employee.getBirthday();
      employee.printInfo();
      System.out.println(employee.getSsn());
        }
    }