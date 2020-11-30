package com.example.xmlorjsonparsingex.src.main.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root (name = "item")
public class Item
{
    @Element (name = "moonset")
    private String moonset;
    @Element (name = "nautm")
    private String nautm;
    @Element (name = "locdate")
    private String locdate;
    @Element (name = "sunrise")
    private String sunrise;
    @Element (name = "astm")
    private String astm;
    @Element (name = "latitude")
    private String latitude;
    @Element (name = "naute")
    private String naute;
    @Element (name = "moonrise")
    private String moonrise;
    @Element (name = "suntransit")
    private String suntransit;
    @Element (name = "latitudeNum")
    private String latitudeNum;
    @Element (name = "aste")
    private String aste;
    @Element (name = "longitudeNum")
    private String longitudeNum;
    @Element (name = "civilm")
    private String civilm;
    @Element (name = "sunset")
    private String sunset;
    @Element (name = "moontransit")
    private String moontransit;
    @Element (name = "location")
    private String location;
    @Element (name = "civile")
    private String civile;
    @Element (name = "longitude")
    private String longitude;

    public String getMoonset ()
    {
        return moonset;
    }

    public void setMoonset (String moonset)
    {
        this.moonset = moonset;
    }

    public String getNautm ()
    {
        return nautm;
    }

    public void setNautm (String nautm)
    {
        this.nautm = nautm;
    }

    public String getLocdate ()
    {
        return locdate;
    }

    public void setLocdate (String locdate)
    {
        this.locdate = locdate;
    }

    public String getSunrise ()
    {
        return sunrise;
    }

    public void setSunrise (String sunrise)
    {
        this.sunrise = sunrise;
    }

    public String getAstm ()
    {
        return astm;
    }

    public void setAstm (String astm)
    {
        this.astm = astm;
    }

    public String getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (String latitude)
    {
        this.latitude = latitude;
    }

    public String getNaute ()
    {
        return naute;
    }

    public void setNaute (String naute)
    {
        this.naute = naute;
    }

    public String getMoonrise ()
    {
        return moonrise;
    }

    public void setMoonrise (String moonrise)
    {
        this.moonrise = moonrise;
    }

    public String getSuntransit ()
    {
        return suntransit;
    }

    public void setSuntransit (String suntransit)
    {
        this.suntransit = suntransit;
    }

    public String getLatitudeNum ()
    {
        return latitudeNum;
    }

    public void setLatitudeNum (String latitudeNum)
    {
        this.latitudeNum = latitudeNum;
    }

    public String getAste ()
    {
        return aste;
    }

    public void setAste (String aste)
    {
        this.aste = aste;
    }

    public String getLongitudeNum ()
    {
        return longitudeNum;
    }

    public void setLongitudeNum (String longitudeNum)
    {
        this.longitudeNum = longitudeNum;
    }

    public String getCivilm ()
    {
        return civilm;
    }

    public void setCivilm (String civilm)
    {
        this.civilm = civilm;
    }

    public String getSunset ()
    {
        return sunset;
    }

    public void setSunset (String sunset)
    {
        this.sunset = sunset;
    }

    public String getMoontransit ()
    {
        return moontransit;
    }

    public void setMoontransit (String moontransit)
    {
        this.moontransit = moontransit;
    }

    public String getLocation ()
    {
        return location;
    }

    public void setLocation (String location)
    {
        this.location = location;
    }

    public String getCivile ()
    {
        return civile;
    }

    public void setCivile (String civile)
    {
        this.civile = civile;
    }

    public String getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (String longitude)
    {
        this.longitude = longitude;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [moonset = "+moonset+", nautm = "+nautm+", locdate = "+locdate+", sunrise = "+sunrise+", astm = "+astm+", latitude = "+latitude+", naute = "+naute+", moonrise = "+moonrise+", suntransit = "+suntransit+", latitudeNum = "+latitudeNum+", aste = "+aste+", longitudeNum = "+longitudeNum+", civilm = "+civilm+", sunset = "+sunset+", moontransit = "+moontransit+", location = "+location+", civile = "+civile+", longitude = "+longitude+"]";
    }
}
