package com.example.muneeb.picassosample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView targetImageView = (ImageView) findViewById(R.id.Logo);

        String internetUrl = "https://www.beginnersheap.com/wp-content/uploads/2016/08/Picasso-Android-library-Logo.png";

        Context context=this;
        Picasso
                .with(context)
                .load(internetUrl)
                .rotate(90f, 300f, 200f)
                .into(targetImageView);

    }
    public void ImageClick(View v)
    {
        Context context = this;
        ImageView targetImageView = (ImageView) findViewById(R.id.Logo);
        String internetUrl = "https://www.beginnersheap.com/wp-content/uploads/2016/08/Picasso-Android-library-Logo.png";

        if(targetImageView.getMeasuredHeight()==400 && targetImageView.getMeasuredWidth()==400) {

            Picasso
                    .with(context)
                    .load(internetUrl)
                    .rotate(45f, 100f, 100f)
                    .resize(200, 200)
                    .into(targetImageView);
        }
        else
        {
            int resource=R.drawable.picasso_logo;
            Picasso
                    .with(context)
                    .load(resource)
                    .resize(400, 400)
                    .into(targetImageView);
        }
        Toast.makeText(MainActivity.this, "Image Clicked", Toast.LENGTH_SHORT).show();
    }
}
