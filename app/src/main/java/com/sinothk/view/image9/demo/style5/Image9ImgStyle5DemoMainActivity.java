package com.sinothk.view.image9.demo.style5;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.sinothk.view.image9.demo.R;
import com.sinothk.view.image9.style3.NineGridClickViewAdapter;
import com.sinothk.view.image9.style3.NineGridView;
import com.sinothk.view.image9.style5.NineImageView;

import java.util.ArrayList;

public class Image9ImgStyle5DemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s5_image9_img_demo_main);

        ArrayList<String> imageUrls = new ArrayList<>();
        imageUrls.add("https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=829517287,685236282&fm=173&app=49&f=JPEG?w=312&h=208&s=049A5C3253026147D6E89846030020F1");
//        imageUrls.add("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=431680344,3254176197&fm=173&app=49&f=JPEG?w=312&h=208&s=711B36D5001031DEC03001250300E042");
//        imageUrls.add("https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=1252006621,4016768871&fm=173&app=49&f=JPEG?w=312&h=208&s=9963DE144BB0448E924750D80300D0B8");

//        imageUrls.add("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=3996130137,1482805126&fm=173&app=49&f=JPEG?w=312&h=208&s=752A9455CC873149549F8DEF0300801B");
//        imageUrls.add("https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=829517287,685236282&fm=173&app=49&f=JPEG?w=312&h=208&s=049A5C3253026147D6E89846030020F1");
//        imageUrls.add("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=2831567826,680499950&fm=173&app=49&f=JPEG?w=312&h=208&s=BBBB4C81D4DB03C66EBC350C0300E040");

//        imageUrls.add("https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=1252006621,4016768871&fm=173&app=49&f=JPEG?w=312&h=208&s=9963DE144BB0448E924750D80300D0B8");
//        imageUrls.add("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=3996130137,1482805126&fm=173&app=49&f=JPEG?w=312&h=208&s=752A9455CC873149549F8DEF0300801B");
//        imageUrls.add("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=3996130137,1482805126&fm=173&app=49&f=JPEG?w=312&h=208&s=752A9455CC873149549F8DEF0300801B");

        NineImageView nineImageView = findViewById(R.id.multi_image);
        //set the picture url set
        nineImageView.setImageUrls(imageUrls);
        nineImageView.setOnClickItemListener(new NineImageView.OnClickItemListener() {
            @Override
            public void onClick(int i, ArrayList<String> url) {
                //set the picture click event,then do you have to do operation
            }
        });

    }
}
