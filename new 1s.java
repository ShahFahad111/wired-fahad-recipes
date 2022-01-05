package com.example.android.busbooking;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PassengerRegister extends AppCompatActivity {

    private EditText name,contact,email,password;
    private RadioGroup genderRadioGroup;
    private RadioButton checkedRadioButton;
    private TextView login_link;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_register);

        name = (EditText)findViewById(R.id.et_reg_pass_name);
        contact = (EditText)findViewById(R.id.et_reg_pass_contact);
        email = (EditText)findViewById(R.id.et_reg_pass_email);
        password = (EditText)findViewById(R.id.et_reg_pass_password);

        genderRadioGroup = (RadioGroup)findViewById(R.id.radiogroup_passenger);
        checkedRadioButton = (RadioButton)findViewById(genderRadioGroup.getCheckedRadioButtonId());
        login_link = (TextView)findViewById(R.id.tv_link_passenger_login);

        register = (Button)findViewById(R.id.btn_reg_pass_register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        login_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Class target = PassengerLogin.class;
                Intent intent = new Intent(context,target);
                startActivity(intent);
            }
        });
    }
}
