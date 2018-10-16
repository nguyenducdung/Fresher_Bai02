package rikkeisoft.nguyenducdung.com.homework01activitysinhvien.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import rikkeisoft.nguyenducdung.com.homework01activitysinhvien.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etName;
    private Button btnLogin;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.edt_name);
        btnLogin = (Button) findViewById(R.id.btn_main);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, StudentActivity.class);
        name = etName.getText().toString();
        intent.putExtra("key_1", name);
        startActivity(intent);
    }
}
