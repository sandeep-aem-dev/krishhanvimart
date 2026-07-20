package com.krishhanvimart.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.Collections;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderModel {
    @ValueMapValue
    private String logoImage;
    @ValueMapValue
    private String logoLink;
    @ValueMapValue
    private String loginButtonText;
    @ValueMapValue
    private String loginButtonLink;
    @ChildResource(name = "navigation")
    private List<NavigationItem> navigationItems;

    public String getLogoImage() {
        return logoImage;
    }

    public String getLogoLink() {
        return logoLink;
    }

    public String getLoginButtonText() {
        return loginButtonText;
    }

    public String getLoginButtonLink() {
        return loginButtonLink;
    }

    public List<NavigationItem> getNavigationItems() {
        return navigationItems != null ? navigationItems : Collections.emptyList();
    }
}
