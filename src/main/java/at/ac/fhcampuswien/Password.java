package at.ac.fhcampuswien;

//Unterstützung bei der Übung von Sandra Bachinger erhalten.

public class Password {
    private String password;


    public Password(){
    }

    public Password(String password){
        this.password= password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    boolean checkPassword(){
        if(PWLaenge() && checkUpperLower() && checkHasNumber() && checkHasSpecialChar() ){
            return true;
        }
        else
            {
            return false;
            }
    }

    boolean PWLaenge(){
        if (this.getPassword().length()> 8 && this.getPassword().length()<25){
            return true;
        }
        else return false;
    }


    boolean checkUpperLower(){
        boolean lowerCase = this.getPassword().matches(".*[A-Z].*");
        boolean upperCase = this.getPassword().matches(".*[a-b].*");
        if(lowerCase && upperCase) {
            return true;
        }
        else return false;
    }

    boolean checkHasNumber(){
        return this.getPassword().matches(".*[1-9].*");
    }



    boolean checkHasSpecialChar(){
        boolean containsSpecialCharacter = this.getPassword().matches(".*[!@#$%()?/].*");
        boolean containsNoOtherSpecialCharacter = this.getPassword().matches("[a-zA-Z0-9!@#$%()?/]*");

        if (containsSpecialCharacter && containsNoOtherSpecialCharacter)
        {
            return true;
        }
        else return false;
    }

    public static void main(String [] args){



    }
}