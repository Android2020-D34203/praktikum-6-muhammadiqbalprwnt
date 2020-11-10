package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText isiTeks;
    Button buttonPindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isiTeks = (EditText) findViewById(R.id.isiTeks);
        buttonPindah = (Button) findViewById(R.id.buttonPindah);

        buttonPindah.setOnClickListener(new View.OnClickListener() {

        Button buttonPindah = findViewById(R.id.buttonPindah);

            @Override
            public void onClick(View v) {

                EditText isiTeks = (EditText) findViewById(R.id.isiTeks);

                if (isiTeks.getText().toString()==null || isiTeks.getText().toString().trim().equals("")){
                    Toast.makeText(getBaseContext(),"Input tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
                else{
                    //do what you want with the entered text
                }

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Teks", isiTeks.getText().toString());
                startActivity(intent);
            }

            public void alert(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("Coba Alert Dialog");
                builder.setMessage("Ini adalah isi body alert dialog");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                        startActivity(i);
                    }
                });
                builder.setNegativeButton("Tidak", null);
                builder.show();

            }
        });
}
}