package com.wangjt.spitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.wangjt.aninterface.Display;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    private TextView et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        et = (TextView) findViewById(R.id.et_spi);
        findViewById(R.id.bt_spi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadMoudle();
            }
        });
    }

    private void loadMoudle() {
        StringBuilder builder = new StringBuilder();
        ServiceLoader<Display> loader = ServiceLoader.load(Display.class);
        Iterator<Display> iterator = loader.iterator();
        while (iterator.hasNext()) {
            builder.append(iterator.next().display());
        }

        for (Display display : loader) {
            builder.append(display.display()+"\n");
        }
        et.setText(builder.toString());
    }
}
