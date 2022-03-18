package tests.smoke;

import org.junit.jupiter.api.*;
import tests.BaseTests;
import static com.ultimatesoftware.aeon.core.testabstraction.product.AeonTestExecution.*;

@Tag("eSignature")
@DisplayName("eSign Automation Tests")
class SampleTests extends BaseTests {

    @Test
    @DisplayName("Test successful login")
    void successLoginTest() {
        given("I am using valid login credentials");
        esign.login.userNameTextBox.set("esign.user@ukg.com");
        esign.login.passwordTextBox.set("Azeaze1234");

        when("I click the login button");
        esign.login.loginButton.click();

        then("I am redirected to the signature listing page");
        esign.signatureListingPage.signatureListTitle.isLike("Action Required");
    }

    @Test
    @DisplayName("Test signature title")
    void clickSignatureTitleTest() {
        given("I am using valid login credentials");
        esign.login.userNameTextBox.set("esign.user@ukg.com");
        esign.login.passwordTextBox.set("Azeaze1234");

        when("I click the login button and then click on the Signature title");
        esign.login.loginButton.click();
        esign.signatureListingPage.signatureList.rowBy.index(2).signature.click();

       then("I am redirected to the signature detail page");
       esign.signatureDetailPage.signatureDetails.isLike("details");
    }
}
