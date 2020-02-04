package org.example.three;

public class Three {

    private String field1;
    private Byte field2;

    public Three(String field1, Byte field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public Byte getField2() {
        return field2;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public void setField2(Byte field2) {
        this.field2 = field2;
    }
}
