package com.vaadin.components.common.html;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.dom.client.Document;

@JsType(prototype = "Document")
public interface HTMLDocument {
    static HTMLDocument $doc = (HTMLDocument)Document.get();
    Object registerElement(String tag, Object o);

    @JsProperty HTMLElement head();
    @JsProperty HTMLElement body();
    HTMLElement createElement(String tagName);
    HTMLEvents createEvent(String HTMLEvents);
    void dispatchEvent(HTMLEvents ev);
    void register(String tag, Object jso);
}