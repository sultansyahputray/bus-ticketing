package com.example.project_alfi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class slidedua extends Activity {
    TextView hasil;
    Button checkout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slidedua);

        hasil    = (TextView) findViewById(R.id.hasil);
        checkout = (Button) findViewById(R.id.checkout);

        hasil.setText("Nama Pemesan : " +MainActivity.inputNama+
                "\n\nKota Asal : Surabaya\n\nKota Tujuan : " +MainActivity.percobaan+
                "\n\nTanggal Keberangkatan : " +MainActivity.inputTanggalBerangkat+
                "\n\nJadwal Keberangkatan : " +MainActivity.hasilJadwalBerangkat+
                "\n\nTiket : " +MainActivity.tipeTiket+
                "\n\nKelas : " +MainActivity.kelas+
                "\n\nJumlah Penumpang : " +MainActivity.valueJumlahPenumpang+
                "\n\nTarif / penumpang : " +MainActivity.tarifPerPenumpang+
                "\n\nTotal Tagihan : " +MainActivity.subTotal);

        checkout.setOnClickListener(new checkoutPesanan());
    }

    class checkoutPesanan implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent y = new Intent(slidedua.this, slidetiga.class);
            finish();
            startActivity(y);
        }
    }
}
