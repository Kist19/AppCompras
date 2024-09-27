package br.ulbra.appcompras;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.icu.text.SymbolTable;
import android.webkit.WebView;

public class ComprasActivity extends AppCompatActivity {
    CheckBox chkArroz, chkLeite, chkCarne, chkFeijao;
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkArroz = (CheckBox) findViewById(R.id.chkArroz);
        chkLeite = (CheckBox) findViewById(R.id.chkLeite);
        chkCarne = (CheckBox) findViewById(R.id.chkCarne);
        chkFeijao = (CheckBox) findViewById(R.id.chkFeijao);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double Calcular = 0;
                if (chkArroz.isChecked()) { Calcular += 2.69;}
                if (chkLeite.isChecked()) { Calcular += 5.00;}
                if (chkCarne.isChecked()) { Calcular += 9.70;}
                if (chkFeijao.isChecked()) { Calcular += 2.70;}

                AlertDialog.Builder dialogo = new AlertDialog.Builder(ComprasActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Valor total na compra :" + String.valueOf(Calcular));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }
}