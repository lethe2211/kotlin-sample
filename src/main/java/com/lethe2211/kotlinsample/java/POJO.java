package com.lethe2211.kotlinsample.java;

public class POJO {

    private Integer num;
    private String str;

    public POJO() {
        this.num = -1;
        this.str = "";
    }

    public POJO(Integer num, String str) {
        this.num = num;
        this.str = str;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        POJO pojo = (POJO) o;

        if (num != null ? !num.equals(pojo.num) : pojo.num != null) return false;

        return str != null ? str.equals(pojo.str) : pojo.str == null;
    }

    @Override
    public int hashCode() {
        int result = num != null ? num.hashCode() : 0;
        result = 31 * result + (str != null ? str.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "POJO{" +
                "num=" + num +
                ", str='" + str + '\'' +
                '}';
    }
}