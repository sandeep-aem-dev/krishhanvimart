package com.krishhanvimart.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.Collections;
import java.util.List;

/**
 * Sling Model for the Category Cards component.
 * <p>
 * This model reads all authored category items from the composite
 * multifield named "categories".
 */
@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CategoryCardsModel {
    /**
     * Injects all child resources under the "categories" node.
     */
    @ChildResource(name = "categories")
    private List<CategoryItem> categoryItems;

    /**
     * Returns all category items.
     * Returns an empty list if no categories are authored.
     */
    public List<CategoryItem> getCategoryItems() {

        return categoryItems != null ? categoryItems : Collections.emptyList();

    }
}
