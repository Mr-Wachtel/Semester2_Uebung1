package at.ac.fhcampuswien;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @BeforeAll
    static void init() {
    }


    @Test
    public void PasswordLength_rdytogo() {
        Password password = new Password("PurrfectPassword!");
        assertTrue(password.PWLaenge());
    }

    @Test
    public void PasswordLength_tooShort() {
        Password password = new Password("bla");
        assertFalse(password.PWLaenge());
    }


    @Test
    public void CheckUpperLowerCase_rdytogo() {
        Password password = new Password("HuchWasIstDaLos?");
        assertTrue(password.checkUpperLower());
    }

    @Test
    public void CheckUpperLowerCase_onlylowercasearebad() {
        Password password = new Password("nurkl3inbuchstabensindböse!");
        assertFalse(password.checkUpperLower());
    }

    @Test
    public void CheckUpperLowerCase_onlyuppercasearebad() {
        Password password = new Password("NURGR0SSBUCHSTABENSINDAUCHBÖSE!");
        assertFalse(password.checkUpperLower());
    }

    @Test
    public void CheckHasNumber_rdytogo() {
        Password password = new Password("Nachfolgendeinezahl:3!");
        assertTrue(password.checkHasNumber());
    }

    @Test
    public void CheckHasNumber_NoNumber() {
        Password password = new Password("NachfolgendkeineZahl:!");
        assertFalse(password.checkHasNumber());
    }



    @Test
    public void HasSpecialCharacter_rdytogo() {
        Password password = new Password("husthust!");
        assertTrue(password.checkHasSpecialChar());
    }

    @Test
    public void HasSpecialCharacter_noSpecialChar() {
        Password password = new Password("SpecialCharismissing111");
        assertFalse(password.checkHasSpecialChar());
    }

    @Test
    public void HasSpecialCharacter_otherSpechialChar() {
        Password password = new Password("OtherSpecialCharButNotTheRight0ne~~");
        assertFalse(password.checkHasSpecialChar());
    }


    @Test
    public void CheckPassword_rdytogo() {
        Password password = new Password("hoofHearted?90");
        assertTrue(password.checkPassword());
    }

    @Test
    public void CheckPassword_wrong() {
        Password password = new Password("hoofhearted90");
        assertFalse(password.checkPassword());
    }

    @Test
    public void CheckSameNumber_rdytogo() {
        Password password = new Password("password90");
        assertTrue(password.checkSameNumber());
    }

    @Test
    public void checkSameNumber_false() {
        Password password = new Password("password0000");
        assertFalse(password.checkSameNumber());
    }
    @Test
    public void checkContNumbers_rdytogo() {
        Password password = new Password("password0815");
        assertTrue(password.checkContNumbers());
    }

    @Test
    public void checkContNumbers_false() {
        Password password = new Password("password123");
        assertFalse(password.checkContNumbers());
    }

}