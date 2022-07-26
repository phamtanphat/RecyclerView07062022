package com.example.recyclerview07062022;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvFood;
    FoodAdapter foodAdapter;
    List<Food> foodList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvFood = findViewById(R.id.recycler_view_food);
        foodList = Food.getMock();
        foodAdapter = new FoodAdapter(foodList);
        rcvFood.setHasFixedSize(true);
        rcvFood.setAdapter(foodAdapter);

        foodAdapter.setOnClickListener(new FoodAdapter.OnListenerItemClick() {
            @Override
            public void onClick(int position) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(foodList.get(position).getName());
                builder.setMessage("Bạn có muốn xóa thông tin quán?");

                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        foodList.remove(position);
                        foodAdapter.notifyItemRemoved(position);
                        Toast.makeText(MainActivity.this, "Bạn đã xóa thành công", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.show();
            }
        });
    }
}
