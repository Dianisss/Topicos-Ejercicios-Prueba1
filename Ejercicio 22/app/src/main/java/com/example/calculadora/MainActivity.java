package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText resp;
    private double op1, op2, res;
    int operacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resp= (EditText)findViewById(R.id.et_respuesta);
    }

    public void bt1(View view){
        String cap= resp.getText().toString();
        cap=cap+"0";
        resp.setText(cap);
    }
    public void bt4(View view){
        String cap= resp.getText().toString();
        cap=cap+"1";
        resp.setText(cap);
    }
    public void bt5(View view){
        String cap= resp.getText().toString();
        cap=cap+"2";
        resp.setText(cap);
    }
    public void bt6(View view){
        String cap= resp.getText().toString();
        cap=cap+"3";
        resp.setText(cap);
    }
    public void bt7(View view){
        String cap= resp.getText().toString();
        cap=cap+"4";
        resp.setText(cap);
    }
    public void bt8(View view){
        String cap= resp.getText().toString();
        cap=cap+"5";
        resp.setText(cap);
    }
    public void bt9(View view){
        String cap= resp.getText().toString();
        cap=cap+"6";
        resp.setText(cap);
    }
    public void bt10(View view){
        String cap= resp.getText().toString();
        cap=cap+"7";
        resp.setText(cap);
    }
    public void bt11(View view){
        String cap= resp.getText().toString();
        cap=cap+"8";
        resp.setText(cap);
    }
    public void bt12(View view){
        String cap= resp.getText().toString();
        cap=cap+"9";
        resp.setText(cap);
    }

    public void Suma(View view){
        try {
            String auxl=resp.getText().toString();
            op1=Double.parseDouble(auxl);
        }catch (NumberFormatException e) {}
        resp.setText("");
        operacion=1;
    }

    public void Resta(View view){
        try {
            String auxl=resp.getText().toString();
            op1=Double.parseDouble(auxl);
        }catch (NumberFormatException e) {}
        resp.setText("");
        operacion=2;
    }

    public void Multiplicaion(View view){
        try {
            String auxl=resp.getText().toString();
            op1=Double.parseDouble(auxl);
        }catch (NumberFormatException e) {}
        resp.setText("");
        operacion=3;
    }

    public void Division(View view){
        try {
            String auxl=resp.getText().toString();
            op1=Double.parseDouble(auxl);
        }catch (NumberFormatException e) {}
        resp.setText("");
        operacion=4;
    }

    public void Sin(View view){
        try {
            String auxl=resp.getText().toString();
            op1=Double.parseDouble(auxl);
        }catch (NumberFormatException e) {}
        resp.setText("Sin("+op1+")");
        operacion=5;
    }

    public void Cos(View view){
        try {
            String auxl=resp.getText().toString();
            op1=Double.parseDouble(auxl);
        }catch (NumberFormatException e) {}
        resp.setText("Cos("+op1+")");
        operacion=6;
    }

    public void Tan(View view){
        try {
            String auxl=resp.getText().toString();
            op1=Double.parseDouble(auxl);
        }catch (NumberFormatException e) {}
        resp.setText("Tan("+op1+")");
        operacion=7;
    }

    public void igual(View ciew){
        try {
            String auxl=resp.getText().toString();
            op2=Double.parseDouble(auxl);
        }catch (NumberFormatException e){}
        resp.setText("");

        if(operacion==1){
            res=op1+op2;
        }else if(operacion==2){
            res=op1-op2;
        }else if(operacion==3){
            res=op1*op2;
        }else if(operacion==4){
            if (op2==0){
                resp.setText("Error division para cero no existe");
            }else{
                res=op1/op2;
            }
        }else if(operacion==5){
            double rad=Math.toRadians(op1);
            res=(Math.sin(rad));
        }else if (operacion==6){
            double rad=Math.toRadians(op1);
            res=(Math.cos(rad));
        }else if (operacion==7){
            double rad=Math.toRadians(op1);
            res=(Math.tan(rad));
        }
        resp.setText(""+res);
        op1=res;
    }
    public void clear(View view){
        resp.setText("");
        op1=0.0;
        op2=0.0;
        res=0.0;
    }

    public void borrar(View view){
        if(!resp.getText().toString().equals("")){
            resp.setText(resp.getText().subSequence(0, resp.getText().length()-1)+"");
        }
    }
}