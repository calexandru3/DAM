package com.example.davinci.proiect_android;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class AddDomains extends AppCompatActivity {

    ImageView img;
    private static final int pick_image = 100;
    Uri image_uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_domains);


        img = (ImageView) findViewById(R.id.pick_image);


    }

    public void Save(View view){
        EditText titlu = (EditText) findViewById(R.id.text_titlu);
        EditText description = (EditText) findViewById(R.id.text_descriere);

        if (!titlu.getText().equals("") && !description.getText().equals("")) {

            //TODO send domain to database
            Domain new_dom = new Domain(1, titlu.getText().toString(), description.getText().toString(), 0);
            ListDomain.getList().add(new_dom);
            setResult(RESULT_OK);
            Toast.makeText(this, new_dom.toString(), Toast.LENGTH_SHORT).show();
            finish();

        } else {

            Toast.makeText(this, "Titlu si descriere obligatorii!", Toast.LENGTH_LONG).show();

        }

    }

    public void Cancel(View view){
        setResult(RESULT_CANCELED);
        finish();
    }

    public void select_image(View view) {
        openGallery();
    }

    private void openGallery(){
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, pick_image);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK && requestCode == pick_image){
            image_uri = data.getData();
            img.setImageURI(image_uri);
        }
    }
}























