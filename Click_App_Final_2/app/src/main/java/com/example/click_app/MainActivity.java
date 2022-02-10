package com.example.click_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Khai báo biến Count
    //(Ta phải thêm thư viện Button bằng cách bấm vào bóng đèn)
    Button btnCount;
    TextView txtCount;

    int mCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tham chiếu đến id của buttonCount
        // Giống getElementById
        btnCount = findViewById(R.id.button_count);
        txtCount = findViewById(R.id.show_count);

        // set sự kiện click (giống addEventListener)
        btnCount.setOnClickListener(view -> {
        //    Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        //    => Sử dụng cách này nhiều hơn toast.show()
            mCount++;
            // "" + mCount: để đổi thành chuỗi
            txtCount.setText("" + mCount);
        });

    }

    public void showToast(View view) {
        // Hiển thị thông báo j đó khi click thì dùng Toast
        // Hàm makeText có 3 tham số
        // + this
        // + chuỗi (tham chiếu đến 1 chuỗi định nghĩa trong string.sml
        // + Thời gian xuất hiện thông báo ngắn hay dài
        //   Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);

        // in thông báo ra màn hình
        // toast.show();
        mCount = 0;
        // Cách khác để biến thành chuỗi
        txtCount.setText(Integer.toString(mCount));
    }

    public void countUp(View view) {
    }
}