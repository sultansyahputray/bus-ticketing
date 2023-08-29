package com.example.project_alfi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText jumlahPenumpang, tanggalBerangkat, nama;
    TextView jadwalBerangkat, tujuan;
    RadioButton singleTrip, roundTrip, firstClass, economy;
    Spinner spinner, spinner2;

    public static int tanggal, bulan, tahun, valueJumlahPenumpang, Tarif = 300, Tax = 10,
            jarak = 0, TTarif = 0, Dtax = 0, subTotal = 0, tarifPerPenumpang;
    public static String hasilJadwalBerangkat, hasilTujuan,
            inputJumlahPenumpang, inputTanggalBerangkat, tipeTiket = "", percobaan, kelas, inputNama;
    public static String[] itemTujuan = {"Bekasi", "Jakarta", "Merak", "Jambi", "Palembang", "Pekanbaru", "Riau", "Medan", "Aceh"},
            itemJadwal = {"01:30", "02:30", "11:30", "12:30"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit           = (Button) findViewById(R.id.submit);
        jumlahPenumpang  = (EditText) findViewById(R.id.jumlahPenumpang);
        tujuan           = (TextView) findViewById(R.id.tujuan);
        tanggalBerangkat = (EditText) findViewById(R.id.tanggalBerangkat);
        nama             = (EditText) findViewById(R.id.nama);
        jadwalBerangkat  = (TextView) findViewById(R.id.jadwalBerangkat);
        singleTrip       = (RadioButton) findViewById(R.id.singleTrip);
        roundTrip        = (RadioButton) findViewById(R.id.roundTrip);
        firstClass       = (RadioButton) findViewById(R.id.firstClass);
        economy          = (RadioButton) findViewById(R.id.economy);
        spinner          = (Spinner) findViewById(R.id.spinner);
        spinner2         = (Spinner) findViewById(R.id.spinner2);

        submit.setOnClickListener(new submission());
        tanggalBerangkat.setOnClickListener(new tanggal());

        ArrayAdapter<String> milihJadwal = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,itemJadwal);
        milihJadwal.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(milihJadwal);

        ArrayAdapter<String> milihTujuan = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,itemTujuan);
        milihTujuan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(milihTujuan);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String value = parent.getItemAtPosition(position).toString();
                jadwalBerangkat.setText(value);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String value = parent.getItemAtPosition(position).toString();
                tujuan.setText(value);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    class submission implements View.OnClickListener{
        public void onClick(View v){
            inputNama             = nama.getText().toString();
            inputJumlahPenumpang  = jumlahPenumpang.getText().toString();
            inputTanggalBerangkat = tanggalBerangkat.getText().toString();
            hasilJadwalBerangkat  = jadwalBerangkat.getText().toString();
            hasilTujuan           = tujuan.getText().toString();
            valueJumlahPenumpang  = Integer.parseInt(inputJumlahPenumpang);
            String inputTujuan    = spinner2.getSelectedItem().toString();

            for (String item : itemTujuan)
            {
                if (item.equalsIgnoreCase(inputTujuan))
                {
                    percobaan = item;
                    break;
                }
            }

            //Jambi
            if (singleTrip.isChecked() && economy.isChecked() && percobaan == "Jambi"){
                tipeTiket = "single trip";
                kelas = "economy";
                jarak = 1000;
                TTarif = jarak * Tarif;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && firstClass.isChecked() && percobaan == "Jambi"){
                tipeTiket = "round trip";
                kelas = "first class";
                jarak = 1000;
                TTarif = (jarak * Tarif * 2) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && economy.isChecked() && percobaan == "Jambi"){
                tipeTiket = "round trip";
                kelas = "economy";
                jarak = 1000;
                TTarif = jarak * Tarif * 2;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (singleTrip.isChecked() && firstClass.isChecked() && percobaan == "Jambi"){
                tipeTiket = "single trip";
                kelas = "first class";
                jarak = 1000;
                TTarif = (jarak * Tarif) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            //Merak
            else if (singleTrip.isChecked() && economy.isChecked() && percobaan == "Merak"){
                tipeTiket = "single trip";
                kelas = "economy";
                jarak = 1150;
                TTarif = jarak * Tarif;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && firstClass.isChecked() && percobaan == "Merak"){
                tipeTiket = "round trip";
                kelas = "first class";
                jarak = 1150;
                TTarif = (jarak * Tarif * 2) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && economy.isChecked() && percobaan == "Merak"){
                tipeTiket = "round trip";
                kelas = "economy";
                jarak = 1150;
                TTarif = jarak * Tarif * 2;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (singleTrip.isChecked() && firstClass.isChecked() && percobaan == "Merak"){
                tipeTiket = "single trip";
                kelas = "first class";
                jarak = 1150;
                TTarif = (jarak * Tarif) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            //Jakarta
            else if (singleTrip.isChecked() && economy.isChecked() && percobaan == "Jakarta"){
                tipeTiket = "single trip";
                kelas = "economy";
                jarak = 850;
                TTarif = jarak * Tarif;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && firstClass.isChecked() && percobaan == "Jakarta"){
                tipeTiket = "round trip";
                kelas = "first class";
                jarak = 850;
                TTarif = (jarak * Tarif * 2) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && economy.isChecked() && percobaan == "Jakarta"){
                tipeTiket = "round trip";
                kelas = "economy";
                jarak = 850;
                TTarif = jarak * Tarif * 2;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (singleTrip.isChecked() && firstClass.isChecked() && percobaan == "Jakarta"){
                tipeTiket = "single trip";
                kelas = "first class";
                jarak = 850;
                TTarif = (jarak * Tarif) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            //Bekasi
            else if (singleTrip.isChecked() && economy.isChecked() && percobaan == "Bekasi"){
                tipeTiket = "single trip";
                kelas = "economy";
                jarak = 800;
                TTarif = jarak * Tarif;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && firstClass.isChecked() && percobaan == "Bekasi"){
                tipeTiket = "round trip";
                kelas = "first class";
                jarak = 800;
                TTarif = (jarak * Tarif * 2) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && economy.isChecked() && percobaan == "Bekasi"){
                tipeTiket = "round trip";
                kelas = "economy";
                jarak = 800;
                TTarif = jarak * Tarif * 2;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (singleTrip.isChecked() && firstClass.isChecked() && percobaan == "Bekasi"){
                tipeTiket = "single trip";
                kelas = "first class";
                jarak = 800;
                TTarif = (jarak * Tarif) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            //Palembang
            else if (singleTrip.isChecked() && economy.isChecked() && percobaan == "Palembang"){
                tipeTiket = "single trip";
                kelas = "economy";
                jarak = 1100;
                TTarif = jarak * Tarif;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && firstClass.isChecked() && percobaan == "Palembang"){
                tipeTiket = "round trip";
                kelas = "first class";
                jarak = 1100;
                TTarif = (jarak * Tarif * 2) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && economy.isChecked() && percobaan == "Palembang"){
                tipeTiket = "round trip";
                kelas = "economy";
                jarak = 1100;
                TTarif = jarak * Tarif * 2;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (singleTrip.isChecked() && firstClass.isChecked() && percobaan == "Palembang"){
                tipeTiket = "single trip";
                kelas = "first class";
                jarak = 1100;
                TTarif = (jarak * Tarif) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            //Pekanbaru
            else if (singleTrip.isChecked() && economy.isChecked() && percobaan == "Pekanbaru"){
                tipeTiket = "single trip";
                kelas = "economy";
                jarak = 1200;
                TTarif = jarak * Tarif;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && firstClass.isChecked() && percobaan == "Pekanbaru"){
                tipeTiket = "round trip";
                kelas = "first class";
                jarak = 1200;
                TTarif = (jarak * Tarif * 2) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && economy.isChecked() && percobaan == "Pekanbaru"){
                tipeTiket = "round trip";
                kelas = "economy";
                jarak = 1200;
                TTarif = jarak * Tarif * 2;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (singleTrip.isChecked() && firstClass.isChecked() && percobaan == "Pekanbaru"){
                tipeTiket = "single trip";
                kelas = "first class";
                jarak = 1200;
                TTarif = (jarak * Tarif) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            //Riau
            else if (singleTrip.isChecked() && economy.isChecked() && percobaan == "Riau"){
                tipeTiket = "single trip";
                kelas = "economy";
                jarak = 1300;
                TTarif = jarak * Tarif;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && firstClass.isChecked() && percobaan == "Riau"){
                tipeTiket = "round trip";
                kelas = "first class";
                jarak = 1300;
                TTarif = (jarak * Tarif * 2) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && economy.isChecked() && percobaan == "Riau"){
                tipeTiket = "round trip";
                kelas = "economy";
                jarak = 1300;
                TTarif = jarak * Tarif * 2;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (singleTrip.isChecked() && firstClass.isChecked() && percobaan == "Riau"){
                tipeTiket = "single trip";
                kelas = "first class";
                jarak = 1300;
                TTarif = (jarak * Tarif) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            //Medan
            else if (singleTrip.isChecked() && economy.isChecked() && percobaan == "Medan"){
                tipeTiket = "single trip";
                kelas = "economy";
                jarak = 1400;
                TTarif = jarak * Tarif;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && firstClass.isChecked() && percobaan == "Medan"){
                tipeTiket = "round trip";
                kelas = "first class";
                jarak = 1400;
                TTarif = (jarak * Tarif * 2) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && economy.isChecked() && percobaan == "Medan"){
                tipeTiket = "round trip";
                kelas = "economy";
                jarak = 1400;
                TTarif = jarak * Tarif * 2;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (singleTrip.isChecked() && firstClass.isChecked() && percobaan == "Medan"){
                tipeTiket = "single trip";
                kelas = "first class";
                jarak = 1400;
                TTarif = (jarak * Tarif) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            //Aceh
            else if (singleTrip.isChecked() && economy.isChecked() && percobaan == "Aceh"){
                tipeTiket = "single trip";
                kelas = "economy";
                jarak = 1500;
                TTarif = jarak * Tarif;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && firstClass.isChecked() && percobaan == "Aceh"){
                tipeTiket = "round trip";
                kelas = "first class";
                jarak = 1500;
                TTarif = (jarak * Tarif * 2) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (roundTrip.isChecked() && economy.isChecked() && percobaan == "Aceh"){
                tipeTiket = "round trip";
                kelas = "economy";
                jarak = 1500;
                TTarif = jarak * Tarif * 2;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            else if (singleTrip.isChecked() && firstClass.isChecked() && percobaan == "Aceh"){
                tipeTiket = "single trip";
                kelas = "first class";
                jarak = 1500;
                TTarif = (jarak * Tarif) + 50000;
                Dtax = (Tax*TTarif)/100;
                subTotal += (Dtax + TTarif) * valueJumlahPenumpang;
                tarifPerPenumpang     = subTotal/valueJumlahPenumpang;
            }

            Intent x = new Intent(MainActivity.this, slidedua.class);
            finish();
            startActivity(x);
        }
    }

    class tanggal implements View.OnClickListener{
        public void onClick(View v){
            Calendar calendar = Calendar.getInstance();
            tahun             = calendar.get(Calendar.YEAR);
            bulan             = calendar.get(Calendar.MONTH);
            tanggal           = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog;
            dialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    tahun = year;
                    bulan = month;
                    tanggal = dayOfMonth;

                    tanggalBerangkat.setText(tanggal + " - " + bulan + " - " + tahun);
                }
            }, tahun,bulan,tanggal);
            dialog.show();
        }
    }
}