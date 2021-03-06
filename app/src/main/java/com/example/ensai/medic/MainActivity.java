package com.example.ensai.medic;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.example.ensai.medic.ContextProvider.sContext;


public class MainActivity extends Activity {
    private Button buttonPharma;
    private Button ajouter_medic;
    private Button vaccin;
    private Button geoloc;
    private Button scan;
    private TextView textView;
    public static MySQLiteHelper bdd=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bdd=new MySQLiteHelper(this);
        buttonPharma = (Button) findViewById((R.id.menu_pharma));
        ajouter_medic = (Button) findViewById((R.id.ajouter_medic));
        vaccin = (Button) findViewById((R.id.vaccin));
        geoloc = (Button) findViewById((R.id.geoloc));
        textView = (TextView) findViewById(R.id.tv);
        scan= (Button) findViewById(R.id.scan);


    }

    public void vers_pharma(View v) {
        Toast.makeText(this, "Bienvenue sur l'écran Ma Pharmacie", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MaPharma.class);
        startActivity(intent);
    }
    public void vers_ajouter_medic(View v) {
        Toast.makeText(this, "Bienvenue sur l'écran Ajouter Medicament", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, AjouterMedic.class);
        startActivity(intent);
    }
    public void vers_vaccin(View v) {
        Toast.makeText(this, "Bienvenue sur l'écran Mes Vaccins", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MesVaccins.class);
        startActivity(intent);
    }
    public void vers_geoloc(View v) {
        Toast.makeText(this, "Bienvenue sur l'écran Geoloc", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Geoloc.class);
        startActivity(intent);
    }
    public void vers_scan(View v) {
        Toast.makeText(this, "Bienvenue sur l'écran Scan", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Scan.class);
        startActivity(intent);
    }

}
