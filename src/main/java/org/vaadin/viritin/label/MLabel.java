/*
 * Copyright 2016 martenpriess.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.viritin.label;

import org.vaadin.viritin.MSize;
import org.vaadin.viritin.fluency.label.ILabel;


/**
 * Fluent Label
 */
public class MLabel extends FLabel {

    private static final long serialVersionUID = -635245868195615938L;

    public MLabel() {
        super();
    }

    public MLabel(String content) {
        super(content);
    }

    public MLabel(String caption, String content) {
        super(content);
        setCaption(caption);
    }

    /**
     * equals to withValue
     *
     * @param content value of label
     * @return itself
     */
    public MLabel withContent(String content) {
        setValue(content);
        return this;
    }

    public MLabel withValue(String value) {
        setValue(value);
        return this;
    }

    public MLabel withSize(String width, String height) {
        setWidth(width);
        setHeight(height);
        return this;
    }

    public MLabel withSize(MSize mSize) {
        setWidth(mSize.getWidth(), mSize.getWidthUnit());
        setHeight(mSize.getHeight(), mSize.getHeightUnit());
        return this;
    }

    

    @Override
    public MLabel withStyleName(String... styles) {
        for (String style : styles) {
            addStyleName(style);
        }
        return this;
    }

    @Override
    public MLabel withFullWidth() {
        return withWidth("100%");
    }

    @Override
    public MLabel withFullHeight() {
        return withHeight("100%");
    }

}
