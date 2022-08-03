package com.pr.java_mvc_user_ui.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pr.java_mvc_user_ui.Controller.MainController;
import com.pr.java_mvc_user_ui.Model.UserModel;
import com.pr.java_mvc_user_ui.R;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    MainController mainController;
    UserModel userModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button1);
        textView=findViewById(R.id.textview1);


        mainController=new MainController(this);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainController.loadData("Pr","12345678");
            }
        });



    }

    public void updateUi(String name,String password){
        textView.setText(name+"\n"+password);
    }


}