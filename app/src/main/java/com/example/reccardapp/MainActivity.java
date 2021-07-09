package com.example.reccardapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler and Card View Demo");

        rcv = (RecyclerView) findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue());
        rcv.setAdapter(adapter);

    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("Ocean");
        ob1.setDesc("The ocean (also the sea or the world ocean) is the body of salt water which " +
                "covers approximately 71% of the surface of the Earth.[1] It is also \"any of the " +
                "large bodies of water into which the great ocean is divided\".[1] A common definition" +
                " lists five oceans, in descending order by area, the Pacific, Atlantic, Indian," +
                " Southern (Antarctic), and Arctic Oceans.[2][3]");

        ob1.setImgname(R.drawable.ocean);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("Long Expoosure River Bridge");
        ob2.setDesc("The paths of bright moving objects become clearly visible—clouds form broad bands," +
                " vehicle lights draw bright streaks, stars leave trails in the sky, and water waves " +
                "appear smooth. Only bright objects leave visible trails, whereas dark objects usually " +
                "disappear. Boats in long exposures disappear during the daytime, but draw bright t" +
                "rails from their lights at night");
        ob2.setImgname(R.drawable.hill);
        holder.add(ob2);

        Model ob3=new Model();
        ob1.setHeader("Ocean");
        ob1.setDesc("The ocean (also the sea or the world ocean) is the body of salt water which " +
                "covers approximately 71% of the surface of the Earth.[1] It is also \"any of the " +
                "large bodies of water into which the great ocean is divided\".[1] A common definition" +
                " lists five oceans, in descending order by area, the Pacific, Atlantic, Indian," +
                " Southern (Antarctic), and Arctic Oceans.[2][3]");

        ob1.setImgname(R.drawable.ocean);
        holder.add(ob1);

        Model ob4=new Model();
        ob2.setHeader("Long Expoosure River Bridge");
        ob2.setDesc("The paths of bright moving objects become clearly visible—clouds form broad bands," +
                " vehicle lights draw bright streaks, stars leave trails in the sky, and water waves " +
                "appear smooth. Only bright objects leave visible trails, whereas dark objects usually " +
                "disappear. Boats in long exposures disappear during the daytime, but draw bright t" +
                "rails from their lights at night");
        ob2.setImgname(R.drawable.hill);
        holder.add(ob2);
        Model ob5=new Model();
        ob1.setHeader("Ocean");
        ob1.setDesc("The ocean (also the sea or the world ocean) is the body of salt water which " +
                "covers approximately 71% of the surface of the Earth.[1] It is also \"any of the " +
                "large bodies of water into which the great ocean is divided\".[1] A common definition" +
                " lists five oceans, in descending order by area, the Pacific, Atlantic, Indian," +
                " Southern (Antarctic), and Arctic Oceans.[2][3]");

        ob1.setImgname(R.drawable.ocean);
        holder.add(ob1);

        Model ob6=new Model();
        ob2.setHeader("Long Expoosure River Bridge");
        ob2.setDesc("The paths of bright moving objects become clearly visible—clouds form broad bands," +
                " vehicle lights draw bright streaks, stars leave trails in the sky, and water waves " +
                "appear smooth. Only bright objects leave visible trails, whereas dark objects usually " +
                "disappear. Boats in long exposures disappear during the daytime, but draw bright t" +
                "rails from their lights at night");
        ob2.setImgname(R.drawable.hill);
        holder.add(ob2);

        Model ob8=new Model();
        ob1.setHeader("Ocean");
        ob1.setDesc("The ocean (also the sea or the world ocean) is the body of salt water which " +
                "covers approximately 71% of the surface of the Earth.[1] It is also \"any of the " +
                "large bodies of water into which the great ocean is divided\".[1] A common definition" +
                " lists five oceans, in descending order by area, the Pacific, Atlantic, Indian," +
                " Southern (Antarctic), and Arctic Oceans.[2][3]");

        ob1.setImgname(R.drawable.ocean);
        holder.add(ob1);

        Model ob7=new Model();
        ob2.setHeader("Long Expoosure River Bridge");
        ob2.setDesc("The paths of bright moving objects become clearly visible—clouds form broad bands," +
                " vehicle lights draw bright streaks, stars leave trails in the sky, and water waves " +
                "appear smooth. Only bright objects leave visible trails, whereas dark objects usually " +
                "disappear. Boats in long exposures disappear during the daytime, but draw bright t" +
                "rails from their lights at night");
        ob2.setImgname(R.drawable.hill);
        holder.add(ob2);



        return holder;
    }


}
