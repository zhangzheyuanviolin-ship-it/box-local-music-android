            package com.k2fsa.sherpa.onnx;

            import android.content.res.AssetManager;
            import com.google.ai.edge.gallery.BuildConfig;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 -2\u00020\u0001:\u0001-B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0004¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010 J\r\u0010\r\u001a\u00020\"¢\u0006\u0004\b\r\u0010#J\u0015\u0010\r\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010$J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b\u001d\u0010&J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b\u001a\u0010'J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010,¨\u0006."}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineRecognizer;", "", "Landroid/content/res/AssetManager;", "assetManager", "Lcom/k2fsa/sherpa/onnx/OfflineRecognizerConfig;", "config", "<init>", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/OfflineRecognizerConfig;)V", "", "ptr", "LOoiIlOl1iI;", "delete", "(J)V", "createStream", "(J)J", "", "hotwords", "createStreamWithHotwords", "(JLjava/lang/String;)J", "setConfig", "(JLcom/k2fsa/sherpa/onnx/OfflineRecognizerConfig;)V", "newFromAsset", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/OfflineRecognizerConfig;)J", "newFromFile", "(Lcom/k2fsa/sherpa/onnx/OfflineRecognizerConfig;)J", "streamPtr", "decode", "(JJ)V", "Lcom/k2fsa/sherpa/onnx/OfflineRecognizerResult;", "getResult", "(J)Lcom/k2fsa/sherpa/onnx/OfflineRecognizerResult;", "finalize", "()V", BuildConfig.BUILD_TYPE, "Lcom/k2fsa/sherpa/onnx/OfflineStream;", "()Lcom/k2fsa/sherpa/onnx/OfflineStream;", "(Ljava/lang/String;)Lcom/k2fsa/sherpa/onnx/OfflineStream;", "stream", "(Lcom/k2fsa/sherpa/onnx/OfflineStream;)Lcom/k2fsa/sherpa/onnx/OfflineRecognizerResult;", "(Lcom/k2fsa/sherpa/onnx/OfflineStream;)V", "(Lcom/k2fsa/sherpa/onnx/OfflineRecognizerConfig;)V", "Lcom/k2fsa/sherpa/onnx/OfflineRecognizerConfig;", "getConfig", "()Lcom/k2fsa/sherpa/onnx/OfflineRecognizerConfig;", "J", "Companion", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 2 */     public final class OfflineRecognizer {

                public static final Companion INSTANCE = new Companion(null);
                private final OfflineRecognizerConfig config;
                private long ptr;

                static {
/* 11 */            System.loadLibrary("sherpa-onnx-jni");
                }

                public OfflineRecognizer(AssetManager assetManager, OfflineRecognizerConfig offlineRecognizerConfig) {
/* 4 */             this.config = offlineRecognizerConfig;
/* 17 */            this.ptr = assetManager != null ? newFromAsset(assetManager, offlineRecognizerConfig) : newFromFile(offlineRecognizerConfig);
                }

                private final native long createStream(long ptr);

                private final native long createStreamWithHotwords(long ptr, String hotwords);

                private final native void decode(long ptr, long streamPtr);

                private final native void delete(long ptr);

                private final native OfflineRecognizerResult getResult(long streamPtr);

                private final native long newFromAsset(AssetManager assetManager, OfflineRecognizerConfig config);

                private final native long newFromFile(OfflineRecognizerConfig config);

                public static final native void prependAdspLibraryPath(String str);

                private final native void setConfig(long ptr, OfflineRecognizerConfig config);

                public final OfflineStream createStream() {
/* 9 */             return new OfflineStream(createStream(this.ptr));
                }

                public final void decode(OfflineStream stream) {
/* 7 */             decode(this.ptr, stream.getPtr());
                }

                public final void finalize() {
/* 1 */             long j = this.ptr;
/* 7 */             if (j != 0) {
/* 9 */                 delete(j);
/* 12 */                this.ptr = 0L;
                    }
                }

                public final OfflineRecognizerConfig getConfig() {
/* 1 */             return this.config;
                }

                public final OfflineRecognizerResult getResult(OfflineStream stream) {
/* 5 */             return getResult(stream.getPtr());
                }

                public final void release() {
/* 1 */             finalize();
                }

                public final void setConfig(OfflineRecognizerConfig config) {
/* 3 */             setConfig(this.ptr, config);
                }

                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineRecognizer$Companion;", "", "<init>", "()V", "", "newPath", "LOoiIlOl1iI;", "prependAdspLibraryPath", "(Ljava/lang/String;)V", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final void prependAdspLibraryPath(String newPath) {
/* 1 */                 OfflineRecognizer.prependAdspLibraryPath(newPath);
                    }

/* 4 */             private Companion() {
                    }
                }

/* 12 */        public final OfflineStream createStream(String hotwords) {
/* 14 */            return new OfflineStream(createStreamWithHotwords(this.ptr, hotwords));
                }

/* 19 */        public OfflineRecognizer(AssetManager assetManager, OfflineRecognizerConfig offlineRecognizerConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 20 */            this((i & 1) != 0 ? null : assetManager, offlineRecognizerConfig);
                }
            }
