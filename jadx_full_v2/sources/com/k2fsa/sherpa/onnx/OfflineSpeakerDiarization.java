            package com.k2fsa.sherpa.onnx;

            import android.content.res.AssetManager;
            import com.google.ai.edge.gallery.BuildConfig;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function3;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 -2\u00020\u0001:\u0001-B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082 ¢\u0006\u0004\b\u001a\u0010\u001bJN\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u001e\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u001c2\u0006\u0010\u001e\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0004¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\"J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010$J\r\u0010%\u001a\u00020\u0013¢\u0006\u0004\b%\u0010&J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010'JE\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u001e\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010,¨\u0006."}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarization;", "", "Landroid/content/res/AssetManager;", "assetManager", "Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationConfig;", "config", "<init>", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationConfig;)V", "", "ptr", "LOoiIlOl1iI;", "delete", "(J)V", "newFromAsset", "(Landroid/content/res/AssetManager;Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationConfig;)J", "newFromFile", "(Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationConfig;)J", "setConfig", "(JLcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationConfig;)V", "", "getSampleRate", "(J)I", "", "samples", "", "Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationSegment;", "process", "(J[F)[Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationSegment;", "Lkotlin/Function3;", "callback", "arg", "processWithCallback", "(J[FLkotlin/jvm/functions/Function3;J)[Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationSegment;", "finalize", "()V", BuildConfig.BUILD_TYPE, "(Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationConfig;)V", "sampleRate", "()I", "([F)[Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationSegment;", "([FLkotlin/jvm/functions/Function3;J)[Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationSegment;", "Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationConfig;", "getConfig", "()Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationConfig;", "J", "Companion", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 18 */    public final class OfflineSpeakerDiarization {
                private final OfflineSpeakerDiarizationConfig config;
                private long ptr;

                static {
/* 11 */            System.loadLibrary("sherpa-onnx-jni");
                }

                public OfflineSpeakerDiarization(AssetManager assetManager, OfflineSpeakerDiarizationConfig offlineSpeakerDiarizationConfig) {
/* 4 */             this.config = offlineSpeakerDiarizationConfig;
/* 17 */            this.ptr = assetManager != null ? newFromAsset(assetManager, offlineSpeakerDiarizationConfig) : newFromFile(offlineSpeakerDiarizationConfig);
                }

                private final native void delete(long ptr);

                private final native int getSampleRate(long ptr);

                private final native long newFromAsset(AssetManager assetManager, OfflineSpeakerDiarizationConfig config);

                private final native long newFromFile(OfflineSpeakerDiarizationConfig config);

                private final native OfflineSpeakerDiarizationSegment[] process(long ptr, float[] samples);

                private final native OfflineSpeakerDiarizationSegment[] processWithCallback(long ptr, float[] samples, Function3 callback, long arg);

                public static OfflineSpeakerDiarizationSegment[] processWithCallback$default(OfflineSpeakerDiarization offlineSpeakerDiarization, float[] fArr, Function3 function3, long j, int i, Object obj) {
/* 3 */             if ((i & 4) != 0) {
/* 5 */                 j = 0;
                    }
/* 7 */             return offlineSpeakerDiarization.processWithCallback(fArr, function3, j);
                }

                private final native void setConfig(long ptr, OfflineSpeakerDiarizationConfig config);

                public final void finalize() {
/* 1 */             long j = this.ptr;
/* 7 */             if (j != 0) {
/* 9 */                 delete(j);
/* 12 */                this.ptr = 0L;
                    }
                }

                public final OfflineSpeakerDiarizationConfig getConfig() {
/* 1 */             return this.config;
                }

                public final OfflineSpeakerDiarizationSegment[] process(float[] samples) {
/* 3 */             return process(this.ptr, samples);
                }

                public final OfflineSpeakerDiarizationSegment[] processWithCallback(float[] samples, Function3 callback, long arg) {
/* 7 */             return processWithCallback(this.ptr, samples, callback, arg);
                }

                public final void release() {
/* 1 */             finalize();
                }

                public final int sampleRate() {
/* 3 */             return getSampleRate(this.ptr);
                }

                public final void setConfig(OfflineSpeakerDiarizationConfig config) {
/* 3 */             setConfig(this.ptr, config);
                }

/* 19 */        public OfflineSpeakerDiarization(AssetManager assetManager, OfflineSpeakerDiarizationConfig offlineSpeakerDiarizationConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 20 */            this((i & 1) != 0 ? null : assetManager, offlineSpeakerDiarizationConfig);
                }
            }
