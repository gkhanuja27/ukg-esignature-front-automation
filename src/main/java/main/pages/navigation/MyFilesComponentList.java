package main.pages.navigation;

import com.ultimatesoftware.aeon.core.testabstraction.elements.web.ComponentList;

public class MyFilesComponentList extends ComponentList<MyFilesComponentList, MyFilesComponent> {

    public MyFilesComponentList() {
        super(MyFilesComponentList.class, MyFilesComponent.class);
        this.rowSelector = "tr";
    }

    public MyFilesComponentList name(String value) {
        return findRow(value, "span");
    }
}
