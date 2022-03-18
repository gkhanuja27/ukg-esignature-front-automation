package main.pages;

import com.ultimatesoftware.aeon.core.command.execution.AutomationInfo;
import com.ultimatesoftware.aeon.core.common.web.selectors.By;
import com.ultimatesoftware.aeon.core.testabstraction.elements.web.Button;
import com.ultimatesoftware.aeon.core.testabstraction.elements.web.Label;
import com.ultimatesoftware.aeon.core.testabstraction.elements.web.TextBox;
import com.ultimatesoftware.aeon.core.testabstraction.models.Page;

public class LoginPage extends Page {
    public TextBox userNameTextBox;
    public TextBox passwordTextBox;
    public Button loginButton;

    public LoginPage(AutomationInfo automationInfo) {
        super(automationInfo);

        userNameTextBox = new TextBox(automationInfo, By.cssSelector("[data-automation='username'] input"));
        passwordTextBox = new TextBox(automationInfo, By.cssSelector("[data-automation='password'] input"));
        loginButton = new Button(automationInfo, By.dataAutomationAttribute("loginButton"));
    }
}

