package main.pages;

import com.ultimatesoftware.aeon.core.command.execution.AutomationInfo;
import com.ultimatesoftware.aeon.core.common.web.selectors.By;
import com.ultimatesoftware.aeon.core.testabstraction.elements.web.Label;
import com.ultimatesoftware.aeon.core.testabstraction.models.Page;

public class SignatureDetailPage extends Page {
  public Label signatureDetails;

  public SignatureDetailPage(AutomationInfo automationInfo) {
    super(automationInfo);
    signatureDetails = new Label(automationInfo, By.cssSelector("#signature-details-name"));
  }
}
