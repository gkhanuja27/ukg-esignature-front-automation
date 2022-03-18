package main.pages.navigation;

import com.ultimatesoftware.aeon.core.command.execution.AutomationInfo;
import com.ultimatesoftware.aeon.core.common.web.interfaces.IByWeb;
import com.ultimatesoftware.aeon.core.common.web.selectors.By;
import com.ultimatesoftware.aeon.core.testabstraction.elements.web.Link;
import com.ultimatesoftware.aeon.core.testabstraction.models.Component;

public class MyFilesComponent extends Component {
    public Link signatureNameLink;
    public Link signature;
    public MyFilesComponent(AutomationInfo automationInfo, IByWeb selector, IByWeb... switchMechanism) {
        super(automationInfo, selector, switchMechanism);

        signatureNameLink = new Link(automationInfo, selector.find(By.dataAutomationAttribute("signature-name")));
        signature = new Link(automationInfo, selector.find(By.dataAutomationAttribute("signature-title")));
    }
}
