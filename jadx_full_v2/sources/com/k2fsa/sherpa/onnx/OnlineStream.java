            package com.k2fsa.sherpa.onnx;

            import com.google.ai.edge.gallery.BuildConfig;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\r\u0010\u0005J(\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0015\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0016J\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0017J\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0018J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0004¢\u0006\u0004\b\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u0017J!\u0010\u001e\u001a\u00020\n2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0005¨\u0006%"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlineStream;", "", "", "ptr", "<init>", "(J)V", "", "samples", "", "sampleRate", "LOoiIlOl1iI;", "acceptWaveform", "(J[FI)V", "inputFinished", "", "key", "value", "setOption", "(JLjava/lang/String;Ljava/lang/String;)V", "getOption", "(JLjava/lang/String;)Ljava/lang/String;", "delete", "([FI)V", "()V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)Ljava/lang/String;", "finalize", BuildConfig.BUILD_TYPE, "Lkotlin/Function1;", "block", "use", "(Lkotlin/jvm/functions/Function1;)V", "J", "getPtr", "()J", "setPtr", "Companion", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 9 */     public final class OnlineStream {
                private long ptr;

                static {
/* 11 */            System.loadLibrary("sherpa-onnx-jni");
                }

                public OnlineStream(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 7 */             this((i & 1) != 0 ? 0L : j);
                }

                private final native void acceptWaveform(long ptr, float[] samples, int sampleRate);

                private final native void delete(long ptr);

                private final native String getOption(long ptr, String key);

                private final native void inputFinished(long ptr);

                private final native void setOption(long ptr, String key, String value);

                public final void acceptWaveform(float[] samples, int sampleRate) {
/* 3 */             acceptWaveform(this.ptr, samples, sampleRate);
                }

                public final void finalize() {
/* 1 */             long j = this.ptr;
/* 7 */             if (j != 0) {
/* 9 */                 delete(j);
/* 12 */                this.ptr = 0L;
                    }
                }

                public final String getOption(String key) {
/* 3 */             return getOption(this.ptr, key);
                }

                public final long getPtr() {
/* 1 */             return this.ptr;
                }

                public final void inputFinished() {
/* 3 */             inputFinished(this.ptr);
                }

                public final void release() {
/* 1 */             finalize();
                }

                public final void setOption(String key, String value) {
/* 3 */             setOption(this.ptr, key, value);
                }

                public final void setPtr(long j) {
/* 1 */             this.ptr = j;
                }

                public final void use(Function1 block) {
                    try {
/* 1 */                 block.invoke(this);
                    } finally {
/* 9 */                 release();
                    }
                }

/* 10 */        public OnlineStream(long j) {
                    this.ptr = j;
                }

/* 11 */        public OnlineStream() {
/* 12 */            this(0L, 1, null);
                }
            }
