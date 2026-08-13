            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/k2fsa/sherpa/onnx/SpeechSegment;", "", "start", "", "samples", "", "(I[F)V", "getSamples", "()[F", "getStart", "()I", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
            public final class SpeechSegment {
                private final float[] samples;
                private final int start;

                public SpeechSegment(int i, float[] fArr) {
/* 4 */             this.start = i;
/* 6 */             this.samples = fArr;
                }

                public final float[] getSamples() {
/* 1 */             return this.samples;
                }

                public final int getStart() {
/* 1 */             return this.start;
                }
            }
