            package com.k2fsa.sherpa.onnx;

            import android.content.res.AssetManager;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/k2fsa/sherpa/onnx/WaveReader;", "", "()V", "Companion", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 2 */     public final class WaveReader {

                public static final Companion INSTANCE = new Companion(null);

                static {
/* 11 */            System.loadLibrary("sherpa-onnx-jni");
                }

                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0019\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086 J\u0011\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0086 ¨\u0006\u000b"}, d2 = {"Lcom/k2fsa/sherpa/onnx/WaveReader$Companion;", "", "()V", "readWave", "Lcom/k2fsa/sherpa/onnx/WaveData;", "assetManager", "Landroid/content/res/AssetManager;", "filename", "", "readWaveFromAsset", "readWaveFromFile", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final WaveData readWave(AssetManager assetManager, String filename) {
/* 1 */                 return readWaveFromAsset(assetManager, filename);
                    }

                    public final native WaveData readWaveFromAsset(AssetManager assetManager, String filename);

                    public final native WaveData readWaveFromFile(String filename);

/* 4 */             private Companion() {
                    }

/* 5 */             public final WaveData readWave(String filename) {
/* 6 */                 return readWaveFromFile(filename);
                    }
                }
            }
