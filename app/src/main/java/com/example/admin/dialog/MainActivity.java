package com.example.admin.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Dialog dialog;
    private Button btnDialog;
    private Button btnAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDialog = (Button)findViewById(R.id.btnDialog);
        btnAlert = (Button)findViewById(R.id.btnAlertDialog);
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog();
            }
        });
    }
    public void showDialog(){
        dialog = new Dialog(MainActivity.this);
        dialog.setTitle("Lecongan.com");
        dialog.setContentView(R.layout.dilog);
        dialog.show();
    }
    public void showAlertDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("anroi2d.com");
        builder.setMessage("Bạn có muốn tiếp tục không?");
        builder.setCancelable(false);//neu la true thi click bat ky dau se mat
        builder.setPositiveButton("Ứ chịu", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Không thoát được",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
