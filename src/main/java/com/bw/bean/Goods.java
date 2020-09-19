package com.bw.bean;

import java.io.Serializable;

/**
 * @author DELL
 */
public class Goods implements Serializable {
    private int gid;
    private String gname;
    private double price;
    private double bfb;

    public Goods(int gid, String gname, double price, double bfb) {
        this.gid = gid;
        this.gname = gname;
        this.price = price;
        this.bfb = bfb;
    }

    public Goods() {
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBfb() {
        return bfb;
    }

    public void setBfb(double bfb) {
        this.bfb = bfb;
    }

    @Override
    public String toString() {
        return "GoodsController{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", price=" + price +
                ", bfb=" + bfb +
                '}';
    }
}
