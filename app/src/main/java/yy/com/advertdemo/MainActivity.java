package yy.com.advertdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import yy.com.advertdemo.view.AdvertView;
import yy.com.advertdemo.view.AutoScrollTextView;

public class MainActivity extends AppCompatActivity {

    private AdvertView advertView;
    private AutoScrollTextView scrollTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        advertView = (AdvertView) findViewById(R.id.activity_main_advertView);
        final List<String> strList = new ArrayList<>();
        strList.add("如果奇迹有颜色，那么一定是红蓝");
        strList.add("人面不知何处去 桃花依旧笑春风");
        strList.add("道者深方能言之浅");
        advertView.setData(strList);
        advertView.setOnItemClickListener(new AdvertView.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, strList.get(position), Toast.LENGTH_SHORT).show();
            }
        });


        scrollTextView = (AutoScrollTextView) findViewById(R.id.activity_main_scrollTextView);
        scrollTextView.startScroll();
    }
}
