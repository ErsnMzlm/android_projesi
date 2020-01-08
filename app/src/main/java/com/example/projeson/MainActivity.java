package com.example.projeson;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

import java.util.function.ToIntBiFunction;

public class MainActivity extends AppCompatActivity {
    private Button bttn,bttn2,bttn3,bttn4,bttn5,bttn6,bttn7,bttn8,bttn9,bttn10,bttn11,bttn12,bttn13,bttn14,bttn15,bttn16,bttn17,bttn18,bttn19;
    float toplam=0;
    private TextView textView2;
    private AppBarConfiguration mAppBarConfiguration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bttn = (Button) findViewById(R.id.button2);
        bttn2 = (Button) findViewById(R.id.button);
        bttn3 = (Button) findViewById(R.id.button3);
        bttn4 = (Button) findViewById(R.id.button4);
        bttn5 = (Button) findViewById(R.id.button5);
        bttn6 = (Button) findViewById(R.id.button6);
        bttn7 = (Button) findViewById(R.id.button7);
        bttn8 = (Button) findViewById(R.id.button8);
        bttn9 = (Button) findViewById(R.id.button9);
        bttn10 = (Button) findViewById(R.id.button10);
        bttn11 = (Button) findViewById(R.id.button11);
        bttn12 = (Button) findViewById(R.id.button12);
        bttn13 = (Button) findViewById(R.id.button13);
        bttn14 = (Button) findViewById(R.id.button14);
        bttn15 = (Button) findViewById(R.id.button15);
        bttn16 = (Button) findViewById(R.id.button16);
        bttn17 = (Button) findViewById(R.id.button17);
        bttn18 = (Button) findViewById(R.id.button19);
        bttn19 = (Button) findViewById(R.id.button20);


        textView2 = (TextView) findViewById(R.id.textView2);

        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pilav = 3;
                toplam += pilav;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kuru = 4.5;
                toplam += kuru;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double makarna = 3;
                toplam += makarna;
                textView2.setText(String.valueOf(toplam));

            }

        });


        bttn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toplam = 0;
                textView2.setText(String.valueOf(toplam));
            }

        });
        bttn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nohut =4;
                toplam += nohut;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tavuk = 6;
                toplam += tavuk;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kelle = 5;
                toplam += kelle;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mantı = 4.5;
                toplam += mantı;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double zalata = 2.5;
                toplam += zalata;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sehcor = 3;
                toplam += sehcor;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tavcor = 3;
                toplam += tavcor;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pilkav = 8;
                toplam += pilkav;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sekerpare = 2.5;
                toplam += sekerpare;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int patates = 3;
                toplam += patates;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double musakka = 5;
                toplam += musakka;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double turlu = 7.5;
                toplam += turlu;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int puding = 3;
                toplam += puding;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double su = 1.5;
                toplam += su;
                textView2.setText(String.valueOf(toplam));

            }

        });
        bttn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bulpil = 3;
                toplam += bulpil;
                textView2.setText(String.valueOf(toplam));

            }

        });


    }
}

