package com.example.xiaoqieweather.db;

import org.litepal.crud.LitePalSupport;

public class District extends LitePalSupport {
    private int id;
    private String districtName;//区的名字
    /*private int districtCode;//区的代号*/
    private int weatherId;//区所对应的天气
    private int countyId;//区所属市的ID
}
