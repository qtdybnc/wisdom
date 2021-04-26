package com.zhihuilvxing.domain;

public class Ubus {
    private Integer id;

    private Integer cityid;

    private Integer year;

    private Double gdpAverageGrowth;

    private Double gdpAverage;

    private Double stock;

    private Double sale;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getGdpAverageGrowth() {
        return gdpAverageGrowth;
    }

    public void setGdpAverageGrowth(Double gdpAverageGrowth) {
        this.gdpAverageGrowth = gdpAverageGrowth;
    }

    public Double getGdpAverage() {
        return gdpAverage;
    }

    public void setGdpAverage(Double gdpAverage) {
        this.gdpAverage = gdpAverage;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }
}