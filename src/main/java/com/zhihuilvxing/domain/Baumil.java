package com.zhihuilvxing.domain;

public class Baumil {
    private Integer id;

    private Integer cityid;

    private Integer modeid;

    public Integer getModeid() {
        return modeid;
    }

    public void setModeid(Integer modeid) {
        this.modeid = modeid;
    }

    private Integer mileage;

    private Double pv;

    private Double taxi;

    private Double ldt;

    private Double urbanBus;

    private Double roadBus;

    private Double hdvTruck;

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

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Double getPv() {
        return pv;
    }

    public void setPv(Double pv) {
        this.pv = pv;
    }

    public Double getTaxi() {
        return taxi;
    }

    public void setTaxi(Double taxi) {
        this.taxi = taxi;
    }

    public Double getLdt() {
        return ldt;
    }

    public void setLdt(Double ldt) {
        this.ldt = ldt;
    }

    public Double getUrbanBus() {
        return urbanBus;
    }

    public void setUrbanBus(Double urbanBus) {
        this.urbanBus = urbanBus;
    }

    public Double getRoadBus() {
        return roadBus;
    }

    public void setRoadBus(Double roadBus) {
        this.roadBus = roadBus;
    }

    public Double getHdvTruck() {
        return hdvTruck;
    }

    public void setHdvTruck(Double hdvTruck) {
        this.hdvTruck = hdvTruck;
    }
}