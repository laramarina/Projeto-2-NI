package br.edu.fecap.projeto2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton opcPesto;
    private RadioButton opcBolonhesa;
    private RadioButton opcPepperoni;
    private RadioButton opcFrango;
    private RadioButton opcBrocolis;
    private RadioButton opcAlho;
    
    private TextView textoExibição;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        opcPesto        = findViewById(R.id.opcPesto);
        opcBolonhesa    = findViewById(R.id.opcBolonhesa);
        opcPepperoni    = findViewById(R.id.opcPepperoni);
        opcFrango       = findViewById(R.id.opcFrango);
        opcBrocolis     = findViewById(R.id.opcBrocolis);
        opcAlho         = findViewById(R.id.opcAlho);


    }

    public void radioButton(){
        if(opcPesto.isChecked()){
            textoExibição.setText("Pesto");
        } else if (opcBolonhesa.isChecked()) {
            textoExibição.setText("Bolonhesa");
        } else if (opcPepperoni.isChecked()) {
            textoExibição.setText("Bolonhesa");
        } else if (opcFrango.isChecked()) {
            textoExibição.setText("Frango");
        } else if (opcBrocolis.isChecked()) {
            textoExibição.setText("Brócolis");
        } else if (opcAlho.isChecked()) {
            textoExibição.setText("Alho");
        }
    }

    public void alterarTexto (View view){

    }
    public void abrirDialog (View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setTitle("Confirme seu pedido!");
        dialog.setMessage("Confirma suas informações e confirme seu pedido");

        dialog.setCancelable(false);

        dialog.setIcon(android.R.drawable.ic_dialog_alert);

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(
                        getApplicationContext(),
                        "Seu pedido foi confirmado",
                        Toast.LENGTH_LONG
                ).show();

            }
        });
        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(
                        getApplicationContext(),
                        "Seu pedido não foi cofirmado",
                        Toast.LENGTH_LONG
                ).show();

            }
        });

        dialog.create();
        dialog.show();
    }
}