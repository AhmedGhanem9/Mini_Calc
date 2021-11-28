package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText num_1;
    EditText num_2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initvariables();

        TextView result =findViewById(R.id.result);
          EditText num_1 = findViewById(R.id.num1);
          EditText num_2 = findViewById(R.id.num2);
        Button btnadd = findViewById(R.id.add);
        Button btnsub = findViewById(R.id.sub);
        Button btnmulti = findViewById(R.id.muti);
        Button btndiv = findViewById(R.id.div);




        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 , n2 ,r;
                n1=Double.parseDouble(num_1.getText().toString());
                n2=Double.parseDouble(num_2.getText().toString());
                r =n1+n2;
                result.setText(String.valueOf(r));
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 , n2 ,r;
                n1=Double.parseDouble(num_1.getText().toString());
                n2=Double.parseDouble(num_2.getText().toString());
                r =n1-n2;
                result.setText(String.valueOf(r));
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 , n2 ,r;
                n1=Double.parseDouble(num_1.getText().toString());
                n2=Double.parseDouble(num_2.getText().toString());
                r =n1*n2;
                result.setText(String.valueOf(r));
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 , n2 ,r;
                n1=Double.parseDouble(num_1.getText().toString());
                n2=Double.parseDouble(num_2.getText().toString());
                r =n1/n2;
                result.setText(String.valueOf(r));
                if(n2==0) {Toast.makeText(MainActivity.this,"Can't Div On Zero",5).show();}
            }
        });



    }
//public void initvariables()
//        {TextView result = findViewById(R.id.result);
//        EditText num_1 = findViewById(R.id.num1);
//        EditText num_2 = findViewById(R.id.num2);
//    }
//
//
//    public void calc(double n1, double n2, String ope){
//        double res=0;
//        if(ope.equals("+")){res= getRes(n1) + getRes(n2);}
//        if(ope.equals("-")){res= getRes(n1) - getRes(n2);}
//        if(ope.equals("/")){res= getRes(n1) / getRes(n2); }
//        if(ope.equals("*")){res= getRes(n1) * getRes(n2);}
////        result.setText(String.valueOf(getRes(res)));
//        initvariables();
//    }
//
//    private double getRes(double res) {
//        return res;
//    }
//
//    public void MedAdd(View view) {
//        calc(Double.parseDouble(num_1.getText().toString()),Double.parseDouble(num_2.getText().toString()),"+");
//        result.setText(String.valueOf(getRes()));
//
//    }
//
//    public void MedSub(View view) {
//        calc(Double.parseDouble(num_1.getText().toString()),Double.parseDouble(num_2.getText().toString()),"-");
//    }
//
//    public void MedDiv(View view) {
//        calc(Double.parseDouble(num_1.getText().toString()),Double.parseDouble(num_2.getText().toString()),"/");
//    }
//
//    public void MedMulti(View view) {
//        calc(Double.parseDouble(num_1.getText().toString()),Double.parseDouble(num_2.getText().toString()),"*");
//    }
}