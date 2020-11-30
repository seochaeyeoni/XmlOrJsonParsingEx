package com.example.xmlorjsonparsingex.src.main.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root (name = "response")
public class RiseSetInfoResponse {
    @Element(name = "header")
    private Header header;
    @Element(name = "body")
    private Body body;

    public RiseSetInfoResponse() {
        super();
    }

    public RiseSetInfoResponse(Header header, Body body) {
        this.body = body;
        this.header = header;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ClassPojo [header = " + header + ", body = " + body + "]";
    }
}
