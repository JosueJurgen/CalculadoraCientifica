package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultado;
    double n1,n2,res;
    String operador;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    Button btnOff,btnRnd,btnDel,btnAc,btnFact,btnPotN,btnPot2,btnPot3,btnSin,btnCos,btnTan,btnSqrt,btnSuma,btnResta,btnMul,btnDiv,btnPunto,btnIgual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Cero(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        resultado.setText(resultado.getText()+"0");
    }

    public void Uno(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        resultado.setText(resultado.getText()+"1");
    }

    public void Dos(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        resultado.setText(resultado.getText()+"2");
    }

    public void Tres(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        resultado.setText(resultado.getText()+"3");
    }

    public void Cuatro(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        resultado.setText(resultado.getText()+"4");
    }

    public void Cinco(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        resultado.setText(resultado.getText()+"5");
    }

    public void Seis(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        resultado.setText(resultado.getText()+"6");
    }

    public void Siete(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        resultado.setText(resultado.getText()+"7");
    }

    public void Ocho(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        resultado.setText(resultado.getText()+"8");
    }

    public void Nueve(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        resultado.setText(resultado.getText()+"9");
    }

    public void Punto(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        resultado.setText(resultado.getText()+".");
    }

    public void CapturaNum1(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        n1 = Double.parseDouble(resultado.getText().toString());
        resultado.setText(" ");
    }

    public void Sumar(View view){
        operador = "+";
        CapturaNum1(view);
    }

    public void Restar(View view){
        operador = "-";
        CapturaNum1(view);
    }

    public void Multiplicar(View view){
        operador = "*";
        CapturaNum1(view);
    }

    public void Dividir(View view){
        operador = "/";
        CapturaNum1(view);
    }

    public void PotenciaN(View view){
        operador = "pot";
        resultado = (TextView)findViewById(R.id.txtResultado);
        try {
            n1 = Double.parseDouble(resultado.getText().toString());
            resultado.setText("");
        }catch (NumberFormatException nfe){}
    }

    public void Igual(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        n2 = Double.parseDouble(resultado.getText().toString());
        if (operador.equals("+")) {
            res = n1+n2;
        } else if (operador.equals("-")) {
            res = n1-n2;
        } else if (operador.equals("*")) {
            res = n1*n2;
        } else if (operador.equals("/")) {
            res = n1/n2;
        } else if (operador.equals("pot")) {
            resultado = (TextView)findViewById(R.id.txtResultado);
            n2 = Double.parseDouble(resultado.getText().toString());
            resultado.setText("");
            res = Math.pow(n1,n2);
        }
        resultado.setText(" "+res);
    }

    public void Rnd(View view){
        for (int x=0; x<=100;x++){
            int n = (int)Math.floor(Math.random()*(100-(1+1))+(1));
            resultado.setText(String.valueOf(n));
        }
    }

    public void Raiz (View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        try {
            n1 = Double.parseDouble(resultado.getText().toString());
            res = Math.sqrt(n1);
            resultado.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }

    public void Potencia2(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        try {
            n1 = Double.parseDouble(resultado.getText().toString());
            res = Math.pow(n1,2);
            resultado.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }

    public void Potencia3(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        try {
            n1 = Double.parseDouble(resultado.getText().toString());
            res = Math.pow(n1,3);
            resultado.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }

    public void Sin(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        try {
            n1 = Double.parseDouble(resultado.getText().toString());
            double rd = Math.toRadians(n1);
            res = Math.sin(rd);
            resultado.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }

    public void Cos(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        try {
            n1 = Double.parseDouble(resultado.getText().toString());
            double rd = Math.toRadians(n1);
            res = Math.cos(rd);
            resultado.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }

    public void Tan(View view){
        resultado = (TextView)findViewById(R.id.txtResultado);
        try {
            n1 = Double.parseDouble(resultado.getText().toString());
            double rd = Math.toRadians(n1);
            res = Math.tan(rd);
            resultado.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }

    public void Factorial(View view){
        int fact = 1;
        int x;
        try {
            for (x=1; x<=n1;x++){
                fact = fact*x;
            }
            resultado.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }

    public void BorrarUlt(View view){
        if(resultado.getText().toString().equals(" ")){
            resultado.setText(resultado.getText().subSequence(0, resultado.getText().length()-1)+ " ");
        }
    }

    public void BorrarTodo(View view){
        n1 = 0.0;
        n2 = 0.0;
        resultado = (TextView)findViewById(R.id.txtResultado);
        resultado.setText(" ");
    }

    public void Salir(View view){
        finish();
    }
}
