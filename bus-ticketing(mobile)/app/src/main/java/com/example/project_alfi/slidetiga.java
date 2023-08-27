package com.example.project_alfi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class slidetiga extends Activity {
    TextView ucapan;
    Button beranda;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slidetiga);

        ucapan   = (TextView) findViewById(R.id.textView7);
        beranda  = (Button) findViewById(R.id.beranda);

        ucapan.setText("Terima Kasih\nPesanan atas nama " +MainActivity.inputNama+ "\nTelah kami proses");
        beranda.setOnClickListener(new kembaliBeranda());
    }

    class kembaliBeranda implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            MainActivity.tarifPerPenumpang = 0;
            MainActivity.subTotal = 0;
            MainActivity.valueJumlahPenumpang = 0;
            Intent z = new Intent(slidetiga.this, MainActivity.class);
            finish();
            startActivity(z);
        }
    }
}
