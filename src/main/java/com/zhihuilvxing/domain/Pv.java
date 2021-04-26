package com.zhihuilvxing.domain;

public class Pv {
    private Integer id;

    private Integer cityid;

    private Integer year;

    private Double gdpAverageGrowth;

    private Double gdpAverage;

    private Double populationGrowth;

    private Double populationForecast;

    private Double privateStock;

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

    public Double getPopulationGrowth() {
        return populationGrowth;
    }

    public void setPopulationGrowth(Double populationGrowth) {
        this.populationGrowth = populationGrowth;
    }

    public Double getPopulationForecast() {
        return populationForecast;
    }

    public void setPopulationForecast(Double populationForecast) {
        this.populationForecast = populationForecast;
    }

    public Double getPrivateStock() {
        return privateStock;
    }

    public void setPrivateStock(Double privateStock) {
        this.privateStock = privateStock;
    }
}