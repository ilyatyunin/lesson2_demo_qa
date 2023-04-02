package com.demoqa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests extends TestBase {



    @Test
    void succesfulFillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Ilya");
        $("#userEmail").setValue("emailbyilya@gmail.com");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Bali");
        $("#submit").click();

        $("#output").shouldHave(text("Ilya"), text("emailbyilya@gmail.com"),
                text("Moscow"), text("Bali"));
    }

}
