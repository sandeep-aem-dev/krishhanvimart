package com.krishhanvimart.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NavigationItem {

    @ValueMapValue
    private String menuText;
    @ValueMapValue
    private String menuLink;
    @ValueMapValue
    private boolean openInNewTab;

    public String getMenuText() {
        return menuText;
    }

    public String getMenuLink() {
        return menuLink;
    }

    public boolean isOpenInNewTab() {
        return openInNewTab;
    }
}
