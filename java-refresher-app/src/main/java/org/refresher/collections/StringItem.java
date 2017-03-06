package org.refresher.collections;

import java.util.Comparator;

/**
 * Created by kulkamah on 2/7/2017.
 */
public class StringItem implements Comparator, Comparable{

    private String string;

    StringItem() {
        this.string = "DEFAULT STRING";
    }
    StringItem(String str) {
        if(str != null) {
            this.string = str;
        } else {
            this.string = "DEFAULT STRING";
        }

    }

    public String getString() {
        return this.string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "string : " + this.getString();
    }


    public int compare(Object o1, Object o2) {
        return ((StringItem)o1).getString().compareToIgnoreCase(((StringItem)o2).getString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StringItem)) return false;

        StringItem that = (StringItem) o;

        return getString() != null ? getString().equals(that.getString()) : that.getString() == null;
    }

    @Override
    public int hashCode() {
        return getString() != null ? getString().hashCode() : 25;
        //return 25;
    }

    public int compareTo(Object o) {
        return ((StringItem)o).getString().compareToIgnoreCase(this.getString());
    }
}
