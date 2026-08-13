            package com.k2fsa.sherpa.onnx;

            import android.content.res.AssetManager;
            import com.google.ai.edge.gallery.BuildConfig;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u0011\u001a\u00020\u001d¢\u0006\u0004\b\u0011\u0010\u001eJ%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010 R\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010!¨\u0006#"}, d2 = {"Lcom/k2fsa/sherpa/onnx/AudioTagging;", "", "Landroid/content/res/AssetManager;", "assetManager", "Lcom/k2fsa/sherpa/onnx/AudioTaggingConfig;", "config", "<init>", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/AudioTaggingConfig;)V", "", "newFromAsset", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/AudioTaggingConfig;)J", "newFromFile", "(Lcom/k2fsa/sherpa/onnx/AudioTaggingConfig;)J", "ptr", "LOoiIlOl1iI;", "delete", "(J)V", "createStream", "(J)J", "streamPtr", "", "topK", "", "Lcom/k2fsa/sherpa/onnx/AudioEvent;", "compute", "(JJI)[Lcom/k2fsa/sherpa/onnx/AudioEvent;", "finalize", "()V", BuildConfig.BUILD_TYPE, "Lcom/k2fsa/sherpa/onnx/OfflineStream;", "()Lcom/k2fsa/sherpa/onnx/OfflineStream;", "stream", "(Lcom/k2fsa/sherpa/onnx/OfflineStream;I)[Lcom/k2fsa/sherpa/onnx/AudioEvent;", "J", "Companion", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 16 */    public final class AudioTagging {
                private long ptr;

                static {
/* 11 */            System.loadLibrary("sherpa-onnx-jni");
                }

                public AudioTagging(AssetManager assetManager, AudioTaggingConfig audioTaggingConfig) {
/* 15 */            this.ptr = assetManager != null ? newFromAsset(assetManager, audioTaggingConfig) : newFromFile(audioTaggingConfig);
                }

                private final native AudioEvent[] compute(long ptr, long streamPtr, int topK);

                public static AudioEvent[] compute$default(AudioTagging audioTagging, OfflineStream offlineStream, int i, int i2, Object obj) {
/* 3 */             if ((i2 & 2) != 0) {
/* 5 */                 i = -1;
                    }
/* 6 */             return audioTagging.compute(offlineStream, i);
                }

                private final native long createStream(long ptr);

                private final native void delete(long ptr);

                private final native long newFromAsset(AssetManager assetManager, AudioTaggingConfig config);

                private final native long newFromFile(AudioTaggingConfig config);

                public final AudioEvent[] compute(OfflineStream stream, int topK) {
/* 9 */             return compute(this.ptr, stream.getPtr(), topK);
                }

                public final OfflineStream createStream() {
/* 9 */             return new OfflineStream(createStream(this.ptr));
                }

                public final void finalize() {
/* 1 */             long j = this.ptr;
/* 7 */             if (j != 0) {
/* 9 */                 delete(j);
/* 12 */                this.ptr = 0L;
                    }
                }

                public final void release() {
/* 1 */             finalize();
                }

/* 17 */        public AudioTagging(AssetManager assetManager, AudioTaggingConfig audioTaggingConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 18 */            this((i & 1) != 0 ? null : assetManager, audioTaggingConfig);
                }
            }
