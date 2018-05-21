package com.library;

/**
 * Created by zs on 18/5/21.
 * <p>
 * Description
 */

public class RadarData {
    private String title;
    private double percent;

    public RadarData() {
    }

    public RadarData(String title, double percent) {
        this.title = title;
        this.percent = percent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "RadarData{" +
                          "title='" + title + '\'' +
                          ", percent=" + percent +
                          '}';
    }
}
