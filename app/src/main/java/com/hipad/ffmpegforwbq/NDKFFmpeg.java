package com.hipad.ffmpegforwbq;

public class NDKFFmpeg {

    //1.NDK音视频编解码：FFmpeg-测试配置
//    public native void callFFmpegTestConfig();

    //2.NDK音视频编解码：FFmpeg-读取视频信息-老版本实现
//    public native void callFFmpegOldReadInfo(String filePath);
//    public native void callFFmpegNewReadInfo(Striing filePath);

    //4.NDK音视频编解码：FFmpeg-视频解码-视频像素数据(iYUV420P)-老版本
    public native void callFFmpegDecode(String inFilePath, String outFilePath);

    //4.NDK音视频编解码：FFmpeg-视频解码-视频像素数据(YUV420P)-老版本
    static {
        System.loadLibrary("native-lib");
    }

}
