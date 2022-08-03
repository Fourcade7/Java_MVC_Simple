package com.pr.java_mvc_user_ui.Controller;

import com.pr.java_mvc_user_ui.Model.UserModel;
import com.pr.java_mvc_user_ui.View.MainActivity;

public class MainController {

    UserModel userModel;
    MainActivity mainActivity;

    public MainController(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void loadData(String username,String password){
        userModel=new UserModel(username,password);
        //updateui
        mainActivity.updateUi(userModel.getUsername(),userModel.getPassword());
    }
}
