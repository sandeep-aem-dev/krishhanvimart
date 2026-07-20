package com.krishhanvimart.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

/**
 * Sling Model representing a single Category Card item.
 * <p>
 * Each object maps to one child node
 * under the "categories" multifield.
 */
@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CategoryItem {
    private static final Logger LOG =
            LoggerFactory.getLogger(CategoryItem.class);

    @PostConstruct
    protected void init() {

        LOG.debug("Category Item initialized");

    }

    /**
     * DAM image path selected by the author.
     */
    @ValueMapValue
    private String image;
    /**
     * Image title added by the author.
     */
    @ValueMapValue
    private String title;
    /**
     * Image path description.
     */
    @ValueMapValue
    private String description;
    /**
     * button text.
     */
    @ValueMapValue
    private String buttonText;
    /**
     * button Link .
     */
    @ValueMapValue
    private String buttonLink;

    public String getImage() {

        return image;
    }

    public String getTitle() {

        return title;
    }

    public String getDescription() {

        return description;
    }

    public String getButtonText() {

        return buttonText;
    }

    public String getButtonLink() {
        return buttonLink;
    }
}
