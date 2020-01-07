package com.sinothk.view.image9.demo.style2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sinothk.view.image9.style2.NineImageView;
import com.sinothk.view.image9.demo.R;

import java.util.ArrayList;

public class Image9ImgDemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image9_img_demo_main);

        ArrayList<String> imageUrls = new ArrayList<>();
        imageUrls.add("https://pics3.baidu.com/feed/902397dda144ad3480281d5433450ef233ad85b8.png?token=fcadb77c5a11e03ea749a2b90412677d&s=5198E53A1D0A64495A75C0DA030050B2");
        imageUrls.add("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=431680344,3254176197&fm=173&app=49&f=JPEG?w=312&h=208&s=711B36D5001031DEC03001250300E042");
        imageUrls.add("https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=1252006621,4016768871&fm=173&app=49&f=JPEG?w=312&h=208&s=9963DE144BB0448E924750D80300D0B8");
//
//        imageUrls.add("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=3996130137,1482805126&fm=173&app=49&f=JPEG?w=312&h=208&s=752A9455CC873149549F8DEF0300801B");
//        imageUrls.add("https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=829517287,685236282&fm=173&app=49&f=JPEG?w=312&h=208&s=049A5C3253026147D6E89846030020F1");
//        imageUrls.add("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=2831567826,680499950&fm=173&app=49&f=JPEG?w=312&h=208&s=BBBB4C81D4DB03C66EBC350C0300E040");
//
//        imageUrls.add("https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=1252006621,4016768871&fm=173&app=49&f=JPEG?w=312&h=208&s=9963DE144BB0448E924750D80300D0B8");
//        imageUrls.add("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=3996130137,1482805126&fm=173&app=49&f=JPEG?w=312&h=208&s=752A9455CC873149549F8DEF0300801B");
//        imageUrls.add("https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=829517287,685236282&fm=173&app=49&f=JPEG?w=312&h=208&s=049A5C3253026147D6E89846030020F1");

        NineImageView nineImageView = (NineImageView) findViewById(R.id.multi_image);
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
