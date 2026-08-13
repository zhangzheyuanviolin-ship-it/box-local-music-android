            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ!\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/k2fsa/sherpa/onnx/DenoisedAudio;", "", "samples", "", "sampleRate", "", "([FI)V", "getSampleRate", "()I", "getSamples", "()[F", "save", "", "filename", "", "saveImpl", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
            public final class DenoisedAudio {
                private final int sampleRate;
                private final float[] samples;

                public DenoisedAudio(float[] fArr, int i) {
/* 4 */             this.samples = fArr;
/* 6 */             this.sampleRate = i;
                }

                private final native boolean saveImpl(String filename, float[] samples, int sampleRate);

                public final int getSampleRate() {
/* 1 */             return this.sampleRate;
                }

                public final float[] getSamples() {
/* 1 */             return this.samples;
                }

                public final boolean save(String filename) {
/* 5 */             return saveImpl(filename, this.samples, this.sampleRate);
                }
            }
