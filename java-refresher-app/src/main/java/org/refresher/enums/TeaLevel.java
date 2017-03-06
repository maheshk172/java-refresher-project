package org.refresher.enums;

/**
 * Created by kulkamah on 2/7/2017.
 */
public enum TeaLevel {
    STRONG (10),
    MEDIUM (5),
    LOW (2);

    public int getTeaLevelCode() {
        return TeaLevelCode;
    }
    public void setTeaLevelCode(int level) {
        this.TeaLevelCode = level;
    }

    private int TeaLevelCode;

    private TeaLevel(int level) {
        this.TeaLevelCode = level;
    }
}
