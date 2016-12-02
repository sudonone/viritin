package org.vaadin.viritin.layouts;

import org.vaadin.viritin.MSize;
import org.vaadin.viritin.fluency.ui.IFormLayout;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;

public class MFormLayout extends FFormLayout {

    private static final long serialVersionUID = -4097293516833876208L;

    public MFormLayout() {
    }

    public MFormLayout(Component... children) {
        super(children);
    }

    public MFormLayout withCaption(String caption, boolean captionAsHtml) {
        setCaption(caption);
        setCaptionAsHtml(captionAsHtml);
        return this;
    }

    @Override
    public MFormLayout withFullWidth() {
        setWidth(100, Unit.PERCENTAGE);
        return this;
    }

    public MFormLayout withSize(MSize size) {
        setWidth(size.getWidth(), size.getWidthUnit());
        setHeight(size.getHeight(), size.getHeightUnit());
        return this;
    }

    @Override
    public MFormLayout withStyleName(String... styleNames) {
        for (String styleName : styleNames) {
            addStyleName(styleName);
        }
        return this;
    }

    public MFormLayout with(Component... components) {
        addComponents(components);
        return this;
    }

    @Override
    public MFormLayout withComponent(Component component, Alignment alignment) {
        addComponent(component);
        return withComponentAlignment(component, alignment);  
    }

    /**
     * @deprecated This method currently has no effect as expand ratios are not
     *             implemented in FormLayout
     */
    @Override
    @Deprecated
    public IFormLayout withExpandRatio(Component component, float ratio) {
        setExpandRatio(component, ratio);
        return this;
    }

    @Override
    public MFormLayout withFullHeight() {
        return withHeight("100%");
    }
}
