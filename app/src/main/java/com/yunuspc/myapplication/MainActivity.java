package com.yunuspc.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button Button;
   public Button  tıklabtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tıklabtn=findViewById(R.id.button3);

        tıklabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,uploadActivity.class));

            }
        });


        TextView email =(TextView) findViewById(R.id.emailText);
        TextView password=(TextView)findViewById(R.id.passwordText);

        Button=findViewById(R.id.button);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (email.getText().toString().equals("yunus")&&password.getText().toString().equals("123456")) {
                    Intent giris = new Intent(MainActivity.this, MainScreen.class);
                    startActivity((giris));

                    Toast.makeText(MainActivity.this,"sucsess",Toast.LENGTH_SHORT).show();

                }else {

                    Toast.makeText(MainActivity.this,"Fail",Toast.LENGTH_SHORT).show();
                }




                //Intent giris=new Intent(MainActivity.this,MainScreen.class);
                //startActivity(giris);
            }
        });

    }



    public void giris(View view){

    }

    public void kayit(View view){


    }


}


