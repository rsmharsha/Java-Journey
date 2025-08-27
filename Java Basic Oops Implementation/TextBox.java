package com.rsmharsha;
public class TextBox {
    //field
    public String text; // field-camelCase, in java we should declare more fields as public

    //method
    public void setText(String text){
        this.text = text;
    }

    //method
    public void clear(){
        this.text = ""; // we can just use text too
    }
}
