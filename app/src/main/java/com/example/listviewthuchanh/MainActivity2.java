package com.example.listviewthuchanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView imgView;
    TextView  txtMoTa,txtDiaDiem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtMoTa= findViewById(R.id.txtMoTa);
        txtDiaDiem= findViewById(R.id.txtDiaDiem);
        imgView = findViewById(R.id.imgView);

        Intent intent=getIntent();

        int index =intent.getIntExtra("index",-1);
        String mota ="";
        String diadiem="";
        switch (index)
        {
            case 0:
                mota="Hồ Tây trước đây còn có các tên gọi khác như Đầm Xác Cáo, Hồ Kim Ngưu, " +
                        "Lãng Bạc, Dâm Đàm, Đoài Hồ, là một hồ nước tự nhiên lớn nhất ở nội thành thủ đô Hà Nội," +
                        " nằm ở quận Tây Hồ. Hồ có diện tích hơn 500 ha với chu vi là khoảng 14,8 km";
                diadiem="Hồ Tây";
                imgView.setImageResource(R.drawable.hinh_anh_ho_tay_chieu_104018828);
                break;
            case 1:
                mota="Tháp Rùa là một ngọn tháp nhỏ nằm trên gò đảo giữa Hồ Hoàn Kiếm," +
                        " lui về phía Nam hồ, Hà Nội, Việt Nam.";
                imgView.setImageResource(R.drawable.hinh_anh_thap_rua);
                diadiem="Tháp Rùa";
                break;
            case 2:
                mota="Chùa Một Cột có tên ban đầu là Liên Hoa Đài (蓮花臺)[1][2][3] tức là Đài Hoa Sen" +
                        " với lối kiến trúc độc đáo: một điện thờ đặt trên một cột trụ duy nhất. " +
                        "Liên Hoa Đài là công trình nổi tiếng nhất nằm trong quần thể kiến trúc Chùa" +
                        " Diên Hựu (延祐寺)[1][4], có nghĩa là ngôi chùa \"Phúc lành dài lâu\"";
                imgView.setImageResource(R.drawable.hinh_anh_chua_mot_cot);
                diadiem="Chùa Một Cột";
                break;
            case 3:
                mota="Văn Miếu – Quốc Tử Giám là quần thể di tích đa dạng và phong phú hàng đầu của" +
                        " thành phố Hà Nội, nằm ở phía Nam kinh thành Thăng Long. Quần thể kiến trúc" +
                        " Văn Miếu – Quốc Tử Giám bao gồm: hồ Văn, khu Văn Miếu – Quốc Tử Giám và" +
                        " vườn Giám, mà kiến trúc chủ thể là Văn Miếu - nơi thờ Khổng Tử và Quốc Tử" +
                        " Giám - trường đại học đầu tiên của Việt Nam.";
                imgView.setImageResource(R.drawable.hinh_anh_quoc_tu_giam);
                diadiem="Quốc Tử Giám";
                break;
            case 4:
                mota="Lăng Chủ tịch Hồ Chí Minh, còn gọi là Lăng Hồ Chủ tịch, Lăng Bác, là nơi gìn" +
                        " giữ xác chết Hồ Chí Minh. Lăng được chính thức khởi công ngày 2 tháng 9 " +
                        "năm 1973, tại vị trí của lễ đài cũ giữa Quảng trường Ba Đình, nơi Hồ Chí " +
                        "Minh từng chủ trì các cuộc gặp mặt quan trọng.";
                imgView.setImageResource(R.drawable.hinh_anh_lang_bac);
                diadiem="Lăng Bác";
                break;
            case 5:
                mota="Thư viện Quốc gia Việt Nam (tên giao dịch quốc tế: National Library of" +
                        " Vietnam - NLV) là thư viện cấp quốc gia và là thư viện trung tâm của cả" +
                        " nước, trực thuộc Bộ Văn hóa, Thể thao và Du lịch Việt Nam" +
                        "Địa chỉ: Số 31 phố Tràng Thi, phường Hàng Trống, quận Hoàn Kiếm, thành phố Hà Nội";
                imgView.setImageResource(R.drawable.thu_vien_quoc_gia);
                diadiem="Thư viện QG";
                break;
        }
        txtMoTa.setText(mota);
        txtDiaDiem.setText(diadiem);
        //Toast.makeText(MainActivity2.this,index+"",Toast.LENGTH_SHORT).show();
    }
}