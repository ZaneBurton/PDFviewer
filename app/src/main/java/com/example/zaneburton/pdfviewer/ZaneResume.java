package com.example.zaneburton.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ZaneResume extends AppCompatActivity {


    PDFView zaneresume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zane_resume);

        zaneresume=(PDFView) findViewById(R.id.pdfZaneResume);

        zaneresume.fromAsset("ZaneResume.pdf").load();
    }
}
