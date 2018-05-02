# Android Video Compressor
- Fork from https://github.com/yovenny/VideoCompress.git
- Video Compressor based&update in the [**Telegram for Android**](https://github.com/DrKLO/Telegram) [![Telegram for Android](https://raw.githubusercontent.com/lalongooo/VideoCompressor/master/images/ic_launcher.png)](https://github.com/DrKLO/Telegram) app source code.
- Any different model problem can check the source code of  [**Telegram for Android**](https://github.com/DrKLO/Telegram)，cause there are no more tests
## Setup
```groovy
  compile project(':videocompress')
```

## Usage
### Call compressVideoLow, compressVideoMedium and compressVideoHigh that indicates 3 quality of compressing.

```java
VideoCompressTask task = VideoCompress.compressVideoLow(tv_input.getText().toString(), destPath, new VideoCompress.CompressListener() {
                    @Override
                    public void onStart() {
                        //Start Compress
                    }

                    @Override
                    public void onSuccess() {
                        //Finish successfully
                    }

                    @Override
                    public void onFail() {
                        //Failed
                    }
                    
                    
                    @Override
                    public void onCancel() {
                        //Canceled by user
                    }

                    @Override
                    public void onProgress(float percent) {
                        //Progress
                    }
                });
```                
