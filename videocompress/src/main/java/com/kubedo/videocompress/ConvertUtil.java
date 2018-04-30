package com.kubedo.videocompress;

import java.nio.ByteBuffer;

public class ConvertUtil {

    public native static int convertVideoFrame(ByteBuffer src, ByteBuffer dest, int destFormat, int width, int height, int padding, int swap);

    static {
        System.loadLibrary("compress");
    }
}
