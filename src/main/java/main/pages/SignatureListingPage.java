package main.pages;

import com.ultimatesoftware.aeon.core.command.execution.AutomationInfo;
import com.ultimatesoftware.aeon.core.common.web.selectors.By;
import com.ultimatesoftware.aeon.core.testabstraction.elements.web.Label;
import com.ultimatesoftware.aeon.core.testabstraction.elements.web.ListContainer;
import com.ultimatesoftware.aeon.core.testabstraction.models.Page;
import main.pages.navigation.MyFilesComponentList;

public class SignatureListingPage extends Page {
    public ListContainer<MyFilesComponentList> signatureList;
    public Label signatureListTitle;

    public SignatureListingPage(AutomationInfo automationInfo) {
        super(automationInfo);
        signatureListTitle = new Label(automationInfo, By.cssSelector("#signature-list-type"));
        signatureList = new ListContainer<>(automationInfo, By.dataAutomationAttribute("signature-listing-data-table"), new MyFilesComponentList());    }

}

