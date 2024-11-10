package com.robysun.shemobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText ipemployeeid;
    private EditText ippassword;
    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ipemployeeid = findViewById((R.id.ip_employee_id));
        ippassword = findViewById(R.id.ip_password);
        btnlogin = findViewById(R.id.btn_login);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String employeeId = ipemployeeid.getText().toString();
                String password = ippassword.getText().toString();

                // Pengkondisian sederhana
                if (employeeId.equals("Roby") && password.equals("312310075")) {
                    Intent pindahKeDashboard = new Intent(MainActivity.this, dashboard.class);
                    startActivity(pindahKeDashboard);
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}