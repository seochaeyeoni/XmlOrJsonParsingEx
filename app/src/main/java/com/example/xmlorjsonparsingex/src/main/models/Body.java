package com.example.xmlorjsonparsingex.src.main.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root (name = "body")
public class Body
{
    @Element (name = "pageNo")
    private String pageNo;
    @Element (name = "totalCount")
    private String totalCount;
    @Element (name = "items")
    private Items items;
    @Element (name = "numOfRows")
    private String numOfRows;

    public String getPageNo ()
    {
        return pageNo;
    }

    public void setPageNo (String pageNo)
    {
        this.pageNo = pageNo;
    }

    public String getTotalCount ()
    {
        return totalCount;
    }

    public void setTotalCount (String totalCount)
    {
        this.totalCount = totalCount;
    }

    public Items getItems ()
    {
        return items;
    }

    public void setItems (Items items)
    {
        this.items = items;
    }

    public String getNumOfRows ()
    {
        return numOfRows;
    }

    public void setNumOfRows (String numOfRows)
    {
        this.numOfRows = numOfRows;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pageNo = "+pageNo+", totalCount = "+totalCount+", items = "+items+", numOfRows = "+numOfRows+"]";
    }
}