package com.example.mvpandroid;

public class Presenter {
    private Model mModel;
    private MainActivity view;
    public Presenter(MainActivity view){
        this.mModel = new Model();
        this.view = view;
    }
    private int calcNewModelvalue(int modelElementIndex){
        int currentvalue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentvalue+1;
    }
    public  void buttonClick(int btnIndex){
        int newModelValue;
        switch (btnIndex){
            case R.id.btnCounter1:
                newModelValue= calcNewModelvalue(0);
                mModel.setElementValueAtIndex(0,newModelValue);
                view.setButtonText(1,newModelValue);
                break;
            case R.id.btnCounter2:
                newModelValue= calcNewModelvalue(1);
                mModel.setElementValueAtIndex(1,newModelValue);
                view.setButtonText(2,newModelValue);
                break;
            case R.id.btnCounter3:
                newModelValue= calcNewModelvalue(2);
                mModel.setElementValueAtIndex(2,newModelValue);
                view.setButtonText(3,newModelValue);
                break;
        }
    }
}
