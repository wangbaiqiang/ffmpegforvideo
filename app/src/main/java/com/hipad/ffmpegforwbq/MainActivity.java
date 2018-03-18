package com.hipad.ffmpegforwbq;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private String inFilePath;
    private String outFilePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NDKFFmpeg ndkfFmpeg=new NDKFFmpeg();
        String rootPath = Environment.getExternalStorageDirectory()
                .getAbsolutePath();
        inFilePath = rootPath.concat("/FFmpeg/Test.mov");
        outFilePath = rootPath.concat("/FFmpeg/Test.yuv");
        ndkfFmpeg.callFFmpegDecode("","");
        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
    }
}
