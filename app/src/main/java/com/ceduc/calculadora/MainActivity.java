package com.ceduc.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    Button btn_cero = (Button) this.findViewById(btn_cero);
    Button btn_uno = (Button) this.findViewById(btn_uno);
    Button btn_dos = (Button) this.findViewById(btn_dos);
    Button btn_tres = (Button) this.findViewById(btn_tres);
    Button btn_cuatro = (Button) this.findViewById(btn_cuatro);
    Button btn_cinco = (Button) this.findViewById(btn_cinco);
    Button btn_seis = (Button) this.findViewById(btn_seis) ;
    Button btn_siete = (Button) this.findViewById(btn_siete);
    Button btn_ocho = (Button) this.findViewById(btn_ocho);
    Button btn_nueve = (Button) this.findViewById(btn_nueve);
    //Asignamos los botones operacionales
    Button btn_sumar = (Button) this.findViewById(btn_sumar);
    Button btn_restar = (Button) this.findViewById(btn_restar);
    Button btn_dividir= (Button) this.findViewById(btn_dividir);
    Button btn_multiplicar = (Button) this.findViewById(btn_multiplicar);
    Button btn_borrar = (Button) this.findViewById(btn_borrar);
    Button btn_decimal = (Button) this.findViewById(btn_decimal);
    Button btn_igual = (Button) this.findViewById(btn_igual);
    //Asignamos la pantalla
    TextView txt_display  = (TextView) this.findViewById(txt_display);

    btn_cero.setOnClickListener(new view.OnClickListener(){
        public void onClick(View v){
            setDigito("0");
            }
    });
    btn_uno.setOnClickListener(new view.OnClickListener(){
        public void onClick(View v){
            setDigito("1");
        }
    });
    btn_dos.setOnClickListener(new view.OnClickListener(){
        public void onClick (View v){
            setDigito("2");
        }
    });
    btn_tres.setOnClickListener(new view.OnClickListener(){
        public void onClick (View v){
            setDigito("3");
        }
     });
    btn_cuatro.setOnClickListener(new view.OnClickListener(){
        public void onClick (View v){
            setDigito("4");
        }
    });
    btn_cinco.setOnClickListener(new view.OnClickListener(){
        public void onClick (View v){
            setDigito("5");
        }
    });
    btn_seis.setOnClickListener(new view.OnClickListener(){
        public void onClick (View v){
             setDigito("6");
        }
    });
    btn_siete.setOnClickListener(new view.OnClickListener(){
        public void onClick (View v){
            setDigito("7");
        }
    });
    btn_ocho.setOnClickListener(new view.OnClickListener(){
        public void onClick (View v){
            setDigito("8");
        }
    });
    btn_nueve.setOnClickListener(new view.OnClickListener(){
        public void onClick (View v){
            setDigito("9");
        }
    });

    }

    void setDigito(String digito){
    TextView txt_display = (TextView) this.findViewById(R.id.txt_display);
    String actual = txt_display.getText().toString();
    String nuevo = actual + digito;
    txt_display.setText(nuevo);
    }
}