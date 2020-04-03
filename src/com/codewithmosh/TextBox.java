package com.codewithmosh;

public class TextBox extends UIControl {

    private String text="";

    public TextBox() {
        super(true);
        this.text = text;

    }

    public void setText(String text){
        this.text=text;
    }

    public void clear(){
        text="";
    }


    @Override
    public String toString(){
        return text;
    }
}
