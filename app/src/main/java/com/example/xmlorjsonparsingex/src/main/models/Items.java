package com.example.xmlorjsonparsingex.src.main.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root (name = "items")
public class Items
{
    @Element (name = "item")
    private Item item;

    public Item getItem ()
    {
        return item;
    }

    public void setItem (Item item)
    {
        this.item = item;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [item = "+item+"]";
    }
}