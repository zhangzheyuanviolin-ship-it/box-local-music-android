            package com.k2fsa.sherpa.onnx;

            import android.content.res.AssetManager;
            import com.google.ai.edge.gallery.BuildConfig;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u0011\u001a\u00020\u001a¢\u0006\u0004\b\u0011\u0010\u001bJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u0015\u0010\u001dR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001e¨\u0006 "}, d2 = {"Lcom/k2fsa/sherpa/onnx/SpokenLanguageIdentification;", "", "Landroid/content/res/AssetManager;", "assetManager", "Lcom/k2fsa/sherpa/onnx/SpokenLanguageIdentificationConfig;", "config", "<init>", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/SpokenLanguageIdentificationConfig;)V", "", "newFromAsset", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/SpokenLanguageIdentificationConfig;)J", "newFromFile", "(Lcom/k2fsa/sherpa/onnx/SpokenLanguageIdentificationConfig;)J", "ptr", "LOoiIlOl1iI;", "delete", "(J)V", "createStream", "(J)J", "streamPtr", "", "compute", "(JJ)Ljava/lang/String;", "finalize", "()V", BuildConfig.BUILD_TYPE, "Lcom/k2fsa/sherpa/onnx/OfflineStream;", "()Lcom/k2fsa/sherpa/onnx/OfflineStream;", "stream", "(Lcom/k2fsa/sherpa/onnx/OfflineStream;)Ljava/lang/String;", "J", "Companion", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 16 */    public final class SpokenLanguageIdentification {
                private long ptr;

                static {
/* 11 */            System.loadLibrary("sherpa-onnx-jni");
                }

                public SpokenLanguageIdentification(AssetManager assetManager, SpokenLanguageIdentificationConfig spokenLanguageIdentificationConfig) {
/* 15 */            this.ptr = assetManager != null ? newFromAsset(assetManager, spokenLanguageIdentificationConfig) : newFromFile(spokenLanguageIdentificationConfig);
                }

                private final native String compute(long ptr, long streamPtr);

                private final native long createStream(long ptr);

                private final native void delete(long ptr);

                private final native long newFromAsset(AssetManager assetManager, SpokenLanguageIdentificationConfig config);

                private final native long newFromFile(SpokenLanguageIdentificationConfig config);

                public final String compute(OfflineStream stream) {
/* 7 */             return compute(this.ptr, stream.getPtr());
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

/* 17 */        public SpokenLanguageIdentification(AssetManager assetManager, SpokenLanguageIdentificationConfig spokenLanguageIdentificationConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 18 */            this((i & 1) != 0 ? null : assetManager, spokenLanguageIdentificationConfig);
                }
            }
