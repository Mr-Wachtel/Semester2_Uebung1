package at.ac.fhcampuswien;


public class Password {
    private String password;


    public Password() {
    }

    public Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    boolean checkPassword() {
        if (PWLaenge() && checkUpperLower() && checkHasNumber() && checkHasSpecialChar()) {
            return true;
        } else {
            return false;
        }
    }

    boolean PWLaenge() {
        if (this.getPassword().length() > 8 && this.getPassword().length() < 25) {
            return true;
        } else return false;
    }


    boolean checkUpperLower() {
        boolean lowerCase = this.getPassword().matches(".*[A-Z].*");
        boolean upperCase = this.getPassword().matches(".*[a-b].*");
        if (lowerCase && upperCase) {
            return true;
        } else return false;
    }

    boolean checkHasNumber() {
        return this.getPassword().matches(".*[1-9].*");
    }


    boolean checkHasSpecialChar() {
        boolean containsSpecChar = this.getPassword().matches(".*[!@#$%()?/].*");
        boolean containsNoSpecChar = this.getPassword().matches("[a-zA-Z0-9!@#$%()?/]*");

        if (containsSpecChar && containsNoSpecChar) {
            return true;
        } else return false;
    }


//With help from Sandra Bachinger
// and https://stackoverflow.com/questions/4047808/what-is-the-best-way-to-tell-if-a-character-is-a-letter-or-number-in-java-withou


    boolean checkContNumbers(){
        if(this.checkHasNumber()==false){
            return false;
        }
        else
            for (int i = 0; i < this.getPassword().length()-2; i++){
                if (Character.isDigit(this.getPassword().charAt(i))&& Character.isDigit(this.getPassword().charAt(i+1)) && Character.isDigit(this.getPassword().charAt(i+2)))
                {
                    if (((this.getPassword().charAt(i))+(this.getPassword().charAt(i+1))+(this.getPassword().charAt(i+2)))/3 == (this.getPassword().charAt(i+1)))
                    {   return false;
                    }
                }
            }
        return true;
    }
    boolean checkSameNumber(){
        if (checkHasNumber()== false) {
            return false;
        }
        else
            for (int i = 0; i < this.getPassword().length()-3; i++){
                if (Character.isDigit(this.getPassword().charAt(i))&& Character.isDigit(this.getPassword().charAt(i+1)) && Character.isDigit(this.getPassword().charAt(i+2))&& Character.isDigit(this.getPassword().charAt(i+3)))
                {

                    if (((this.getPassword().charAt(i))+(this.getPassword().charAt(i+1))+(this.getPassword().charAt(i+2))+(this.getPassword().charAt(i+3)))/4 == (this.getPassword().charAt(i))) {
                        return false;
                    }

                }}
        return true;
    }




    public static void main(String [] args){



    }
}