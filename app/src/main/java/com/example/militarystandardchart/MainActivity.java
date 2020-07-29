package com.example.militarystandardchart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private EditText muestra;
    private TextView tv1;
    private TextView txtac1;
    private TextView txtac2;
    private TextView txtac3;
    private TextView txtre1;
    private TextView txtre2;
    private TextView txtre3;
    private TextView txtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        muestra=(EditText)findViewById(R.id.txt_nmuestra);
        spinner1=(Spinner)findViewById(R.id.list_inspeccion);
        txtac1=(TextView)findViewById(R.id.ac1);
        txtac2=(TextView)findViewById(R.id.ac2);
        txtac3=(TextView)findViewById(R.id.ac3);
        txtre1=(TextView)findViewById(R.id.re1);
        txtre2=(TextView)findViewById(R.id.re2);
        txtre3=(TextView)findViewById(R.id.re3);
        txtn=(TextView)findViewById(R.id.n);


        String [] opciones = {"II","S1","S2","S3","S4","I","III"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }
    //Metodo del boton
    public void Calcular (View view){
        String valor_1= muestra.getText().toString();
        String valor_2= spinner1.getSelectedItem().toString();
        int valor_1_int= Integer.parseInt(valor_1);
        int fila1=0;
        int columna1=0;
        int fila2=0;

        //conocer el rango

        //colocar validacion de si da uno informar error

        char [][] matriz1= {
                {'A','A','A','A','A','A','B'}, //fila 0
                {'A','A','A','A','A','B','C'}, //fila 1
                {'A','A','B','B','B','C','D'}, //fila 2
                {'A','B','B','C','C','D','E'}, //fila 3
                {'B','B','C','C','C','E','F'}, //fila 4
                {'B','B','C','D','D','F','G'}, //fila 5
                {'B','C','D','E','E','G','H'}, //fila 6
                {'B','C','D','E','F','H','J'}, //fila 7
                {'C','C','E','F','G','J','K'}, //fila 8
                {'C','D','E','G','H','K','L'}, //fila 9
                {'C','D','F','G','J','L','M'}, //fila 10
                {'C','D','F','H','K','M','N'}, //fila 11
                {'D','E','G','J','L','N','P'}, //fila 12
                {'D','E','G','J','M','P','Q'}, //fila 13
                {'D','E','H','K','N','Q','R'} //fila 14
        };

        int [][] matriz2= {
                {2,0,1,0,1,0,1}, //fila0
                {3,0,1,0,1,0,1}, //fila1
                {5,0,1,0,1,0,1}, //fila2
                {8,0,1,0,1,1,2}, //fila3
                {13,0,1,0,1,1,2}, //fila4
                {20,0,1,1,2,2,3}, //fila5
                {32,0,1,1,2,3,4}, //fila6
                {50,0,1,2,3,5,6}, //fila7
                {80,0,1,3,4,7,8}, //fila8
                {125,1,2,5,6,10,11}, //fila9
                {200,1,2,7,8,14,15}, //fila10
                {315,2,3,10,11,21,22}, //fila11
                {500,3,4,14,15,21,22}, //fila12
                {800,5,6,21,22,21,22}, //fila13
                {1250,7,8,21,22,21,22}, //fila14
                {2000,10,11,21,22,21,22} //fila15

        };

        if (valor_1_int<=8){
            fila1=0;
        }
        if ((valor_1_int>8)&(valor_1_int<=15)){
            fila1=1;
        }
        if ((valor_1_int>15)&(valor_1_int<=25)){
            fila1=2;
        }
        if ((valor_1_int>25)&(valor_1_int<=50)){
            fila1=3;
        }
        if ((valor_1_int>50)&(valor_1_int<=90)){
            fila1=4;
        }
        if ((valor_1_int>90)&(valor_1_int<=150)){
            fila1=5;
        }
        if ((valor_1_int>150)&(valor_1_int<=280)){
            fila1=6;
        }
        if ((valor_1_int>280)&(valor_1_int<=500)){
            fila1=7;
        }
        if ((valor_1_int>500)&(valor_1_int<=1200)){
            fila1=8;
        }
        if ((valor_1_int>1200)&(valor_1_int<=3200)){
            fila1=9;
        }
        if ((valor_1_int>3200)&(valor_1_int<=10000)){
            fila1=10;
        }
        if ((valor_1_int>10000)&(valor_1_int<=35000)){
            fila1=11;
        }
        if ((valor_1_int>35000)&(valor_1_int<=150000)){
            fila1=12;
        }
        if ((valor_1_int>150000)&(valor_1_int<=500000)){
            fila1=13;
        }
        if (valor_1_int>500000){
            fila1=14;
        }

        if (valor_2.equals("S1")){
            columna1=0;
        }
        if (valor_2.equals("S2")){
            columna1=1;
        }
        if (valor_2.equals("S3")){
            columna1=2;
        }
        if (valor_2.equals("S4")){
            columna1=3;
        }
        if (valor_2.equals("I")){
            columna1=4;
        }
        if (valor_2.equals("II")){
            columna1=5;
        }
        if (valor_2.equals("III")){
            columna1=6;
        }

        String codMuestra= String.valueOf(matriz1[fila1][columna1]);

        if (codMuestra.equals("A")){
            fila2=0;
        }
        if (codMuestra.equals("B")){
            fila2=1;
        }
        if (codMuestra.equals("C")){
            fila2=2;
        }
        if (codMuestra.equals("D")){
            fila2=3;
        }
        if (codMuestra.equals("E")){
            fila2=4;
        }
        if (codMuestra.equals("F")){
            fila2=5;
        }
        if (codMuestra.equals("G")){
            fila2=6;
        }
        if (codMuestra.equals("H")){
            fila2=7;
        }
        if (codMuestra.equals("J")){
            fila2=8;
        }
        if (codMuestra.equals("K")){
            fila2=9;
        }
        if (codMuestra.equals("L")){
            fila2=10;
        }
        if (codMuestra.equals("M")){
            fila2=11;
        }
        if (codMuestra.equals("N")){
            fila2=12;
        }
        if (codMuestra.equals("P")){
            fila2=13;
        }
        if (codMuestra.equals("Q")){
            fila2=14;
        }
        if (codMuestra.equals("R")){
            fila2=15;
        }



        String resultado =  "Codigo de Muestras:" + codMuestra +"\n" +
                            "Tamaño de la Muestra: " + String.valueOf(matriz2[fila2][0])+"\n" +
                            "0.25 AC:" + String.valueOf(matriz2[fila2][1])+"\n" +
                            "0.25 RE:" + String.valueOf(matriz2[fila2][2])+"\n" +
                            "1.5 AC:" + String.valueOf(matriz2[fila2][3])+"\n" +
                            "1.5 RE:" + String.valueOf(matriz2[fila2][4])+"\n" +
                            "4.0 AC:" + String.valueOf(matriz2[fila2][5])+"\n" +
                            "4.0 RE:" + String.valueOf(matriz2[fila2][6])+"\n";

        txtn.setText(String.valueOf(matriz2[fila2][0]));
        txtac1.setText(String.valueOf(matriz2[fila2][1]));
        txtac2.setText(String.valueOf(matriz2[fila2][3]));
        txtac3.setText(String.valueOf(matriz2[fila2][5]));
        txtre1.setText(String.valueOf(matriz2[fila2][2]));
        txtre2.setText(String.valueOf(matriz2[fila2][4]));
        txtre3.setText(String.valueOf(matriz2[fila2][6]));
    }
}

