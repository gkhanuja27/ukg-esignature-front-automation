package main;

import com.ultimatesoftware.aeon.core.command.execution.AutomationInfo;
import com.ultimatesoftware.aeon.core.testabstraction.product.WebProduct;
import main.pages.SignatureDetailPage;
import main.pages.SignatureListingPage;
import main.pages.LoginPage;

public class ESign extends WebProduct {
    public LoginPage login;
    public SignatureListingPage signatureListingPage;
    public SignatureDetailPage signatureDetailPage;

    public ESign(AutomationInfo automationInfo) {
        super(automationInfo);
        login = new LoginPage(automationInfo);
        signatureListingPage = new SignatureListingPage(automationInfo);
        signatureDetailPage = new SignatureDetailPage(automationInfo);
    }
}
