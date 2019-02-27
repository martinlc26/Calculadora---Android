package com.example.martin.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import net.objecthunter.exp4j.ValidationResult;

public class MainActivity extends AppCompatActivity {
    String expresion = "";
    String ans = "";

    int parentesis_abiertos = 0;
    int parentesis_cerrados = 0;
    //banderas
    boolean bandera_ans = false;
    boolean bandera_resultado = false;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView texto = (TextView) findViewById(R.id.cajatexto); //instancie al texview del xml en 'texto'

        final Button boton_0 = (Button) findViewById(R.id.boton0);
        boton_0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bandera_resultado == true) {
                    expresion = "0";
                    bandera_resultado = false;
                } else {
                    expresion = expresion.concat("0");
                }
                texto.setText(expresion);
            }
        });
        final Button boton_1 = (Button) findViewById(R.id.boton1);
        boton_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bandera_resultado == true) {
                    expresion = "1";
                    bandera_resultado = false;
                } else {
                    expresion = expresion.concat("1");
                }
                texto.setText(expresion);
            }
        });
        final Button boton_2 = (Button) findViewById(R.id.boton2);
        boton_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //
                if (bandera_resultado == true) {
                    expresion = "2";
                    bandera_resultado = false;
                } else {
                    expresion = expresion.concat("2");
                }
                texto.setText(expresion);
            }
        });
        final Button boton_3 = (Button) findViewById(R.id.boton3);
        boton_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bandera_resultado == true) {
                    expresion = "3";
                    bandera_resultado = false;
                } else {
                    expresion = expresion.concat("3");
                }
                texto.setText(expresion);
            }
        });

        final Button boton_4 = (Button) findViewById(R.id.boton4);
        boton_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bandera_resultado == true) {
                    expresion = "4";
                    bandera_resultado = false;
                } else {
                    expresion = expresion.concat("4");
                }
                texto.setText(expresion);
            }
        });
        final Button boton_5 = (Button) findViewById(R.id.boton5);
        boton_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bandera_resultado == true) {
                    expresion = "5";
                    bandera_resultado = false;
                } else {
                    expresion = expresion.concat("5");
                }
                texto.setText(expresion);
            }
        });
        final Button boton_6 = (Button) findViewById(R.id.boton6);
        boton_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bandera_resultado == true) {
                    expresion = "6";
                    bandera_resultado = false;
                } else {
                    expresion = expresion.concat("6");
                }
                texto.setText(expresion);
            }
        });
        final Button boton_7 = (Button) findViewById(R.id.boton7);
        boton_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bandera_resultado == true) {
                    expresion = "7";
                    bandera_resultado = false;
                } else {
                    expresion = expresion.concat("7");
                }
                texto.setText(expresion);
            }
        });
        final Button boton_8 = (Button) findViewById(R.id.boton8);
        boton_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bandera_resultado == true) {
                    expresion = "8";
                    bandera_resultado = false;
                } else {
                    expresion = expresion.concat("8");
                }
                texto.setText(expresion);
            }
        });
        final Button boton_9 = (Button) findViewById(R.id.boton9);
        boton_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bandera_resultado == true) {
                    expresion = "9";
                    bandera_resultado = false;
                } else {
                    expresion = expresion.concat("9");
                }
                texto.setText(expresion);
            }
        });
        final Button boton_decimal = (Button) findViewById(R.id.boton_decimal);
        boton_decimal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!expresion.endsWith(".")) {
                    if (bandera_resultado == true) {
                        expresion = ".";
                        bandera_resultado = false;
                    } else {
                        expresion = expresion.concat(".");
                    }
                    texto.setText(expresion);
                }
            }
        });
        final Button boton_add = (Button) findViewById(R.id.boton_add);
        boton_add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //
                expresion = expresion.concat("+");
                texto.setText(expresion);
                bandera_ans = true; //aprete el igual
                bandera_resultado = false;
            }
        });
        final Button boton_substract = (Button) findViewById(R.id.boton_substract);
        boton_substract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //
                expresion = expresion.concat("-");
                texto.setText(expresion);
                bandera_ans = true; //aprete el igual
                bandera_resultado = false;
            }
        });
        final Button boton_multiply = (Button) findViewById(R.id.boton_multiply);
        boton_multiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //
                expresion = expresion.concat("*");
                texto.setText(expresion);
                bandera_ans = true; //aprete el igual
                bandera_resultado = false;
            }
        });
        final Button boton_divide = (Button) findViewById(R.id.boton_divide);
        boton_divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //
                expresion = expresion.concat("/");
                texto.setText(expresion);
                bandera_ans = true; //aprete el igual
                bandera_resultado = false;
            }
        });
        final Button boton_exponente = (Button) findViewById(R.id.boton_exponente);
        boton_exponente.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //
                expresion = expresion.concat("^");
                texto.setText(expresion);
                bandera_ans = true; //aprete el igual
                bandera_resultado = false;
            }
        });
        final Button boton_resto = (Button) findViewById(R.id.boton_resto);
        boton_resto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //
                expresion = expresion.concat("%");
                texto.setText(expresion);
                bandera_ans = true; //aprete el igual
                bandera_resultado = false;
            }
        });
        final Button boton_raiz = (Button) findViewById(R.id.boton_raiz);
        boton_raiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //texto.setText(expresion + "√");
                expresion = expresion.concat("sqrt(");
                texto.setText(expresion);
                bandera_ans = true; //aprete el igual
                bandera_resultado = false;
                parentesis_abiertos +=1;

            }
        });
        final Button boton_par_a = (Button) findViewById(R.id.boton_parentesis_open);
        boton_par_a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                parentesis_abiertos +=1;
                if (bandera_resultado == true) {
                        expresion = "(";
                        bandera_resultado = false;
                } else {
                        expresion = expresion.concat("(");
                       }
                texto.setText(expresion);
            }
        });
        final Button boton_par_c = (Button) findViewById(R.id.boton_parentesis_close);
        boton_par_c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                parentesis_cerrados +=1;
                if (bandera_resultado == true) {
                    expresion = ")";
                    bandera_resultado = false;
                } else {
                        expresion = expresion.concat(")");
                       }
                texto.setText(expresion);
            }
        });
        final Button boton_delete = (Button) findViewById(R.id.boton_delete);
        boton_delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (expresion.length()>1) {
                    if (expresion.endsWith("(")) {parentesis_abiertos -=1;} //si borro algun parentesis, disminuyo el contador
                    if (expresion.endsWith(")")) {parentesis_cerrados -=1;}
                    expresion = expresion.substring(0, expresion.length() - 1);
                    texto.setText(expresion);
                } else { expresion = "";
                         texto.setText("0");
                         parentesis_cerrados = 0;
                         parentesis_abiertos = 0;
                }
            }
        });
        final Button boton_clear = (Button) findViewById(R.id.boton_clear);
        boton_clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //
                expresion = "";
                ans = "";
                bandera_ans = false;
                texto.setText("0");

                parentesis_abiertos = 0;
                parentesis_cerrados = 0;
            }
        });

        final Button boton_resultado = (Button) findViewById(R.id.boton_result);
        boton_resultado.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean parentesis = parentesis_cerrados == parentesis_abiertos;
                boolean eval_expresion = (expresion.equals("()") || expresion.equals("") || expresion.equals(")("));
                if (parentesis && !eval_expresion) {
                        Expression e = new ExpressionBuilder(expresion).build();
                        ValidationResult result = e.validate();
                        if (result.isValid()) {
                            double resultado = e.evaluate();
                            //String resultado_s = Double.toString(resultado);
                            String resultado_s;
                            if ((long) resultado == resultado) {
                                resultado_s = "" + (long) resultado;
                            } else {
                                resultado_s = "" + resultado;
                            }
                            texto.setText(resultado_s);
                            expresion = resultado_s;
                            ans = resultado_s;  // coloco el resultado en ans
                            bandera_ans = false;
                            bandera_resultado = true;

                            parentesis_abiertos = 0;
                            parentesis_cerrados = 0;
                        }
                }
            }
        });

        final Button boton_ans = (Button) findViewById(R.id.boton_ans);
        boton_ans.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //
                if (bandera_ans == true && ans != "") {
                    expresion = expresion.concat(ans);
                    texto.setText(expresion);
                    bandera_ans = false;
                }
            }
        });

    }

}




