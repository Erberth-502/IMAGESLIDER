package com.erberth.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;
import com.denzcoskun.imageslider.constants.ScaleTypes;
public class MainActivity extends AppCompatActivity {

    ImageSlider imageSlider;
    String[] urlIMG={"https://www.themebeta.com/media/cache/400x225/files/chrome/images/201705/08/40b4cf78fe9c5aa21dc6dbfee9ff059b.jpeg",
            "https://honeysanime.com/wp-content/uploads/2016/01/no-game-no-life-wallpaper-shiro-izuna-hatsuse.jpg",
            "https://data.1freewallpapers.com/download/neko-girl-gamer-anime-art-3840x2160.jpg",
            "http://www.mepixels.com/cache/eef1ebff/anime-gamer-girl-1140x1140-ZPCxMLXUR.jpeg",
    "https://stackposts.com/blog/uploads/images/2021/image/anime%20(2191).jpg"};

    String[] nomSTG={"Num 1","Num 2","Num 3","Num 4","Num 5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSlider=findViewById(R.id.slideimage);

        ArrayList<SlideModel> images=new ArrayList<>();
        images.add(new SlideModel(urlIMG[0],nomSTG[0],null));
        images.add(new SlideModel(urlIMG[1],nomSTG[1],null));
        images.add(new SlideModel(urlIMG[2],nomSTG[2],null));
        images.add(new SlideModel(urlIMG[3],nomSTG[3],null));
        images.add(new SlideModel(urlIMG[4],nomSTG[4],null));

        imageSlider.setImageList(images,ScaleTypes.CENTER_CROP);
        imageSlider.startSliding(3000);

        imageSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int i) {
                Toast.makeText(MainActivity.this, "Nombre: "+nomSTG[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}