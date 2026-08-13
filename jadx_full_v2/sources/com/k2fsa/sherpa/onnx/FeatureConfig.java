            package com.k2fsa.sherpa.onnx;

            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/k2fsa/sherpa/onnx/FeatureConfig;", "", "sampleRate", "", "featureDim", "dither", "", "(IIF)V", "getDither", "()F", "setDither", "(F)V", "getFeatureDim", "()I", "setFeatureDim", "(I)V", "getSampleRate", "setSampleRate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 20 */    public final class FeatureConfig {
                private float dither;
                private int featureDim;
                private int sampleRate;

                public FeatureConfig(int i, int i2, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
/* 18 */            this((i3 & 1) != 0 ? WhisperEngine.SAMPLE_RATE : i, (i3 & 2) != 0 ? 80 : i2, (i3 & 4) != 0 ? 0.0f : f);
                }

                public static FeatureConfig copy$default(FeatureConfig featureConfig, int i, int i2, float f, int i3, Object obj) {
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 i = featureConfig.sampleRate;
                    }
/* 9 */             if ((i3 & 2) != 0) {
/* 11 */                i2 = featureConfig.featureDim;
                    }
/* 15 */            if ((i3 & 4) != 0) {
/* 17 */                f = featureConfig.dither;
                    }
/* 19 */            return featureConfig.copy(i, i2, f);
                }

                public final int getSampleRate() {
/* 1 */             return this.sampleRate;
                }

                public final int getFeatureDim() {
/* 1 */             return this.featureDim;
                }

                public final float getDither() {
/* 1 */             return this.dither;
                }

                public final FeatureConfig copy(int sampleRate, int featureDim, float dither) {
/* 3 */             return new FeatureConfig(sampleRate, featureDim, dither);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof FeatureConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            FeatureConfig featureConfig = (FeatureConfig) other;
                    return this.sampleRate == featureConfig.sampleRate && this.featureDim == featureConfig.featureDim && Float.compare(this.dither, featureConfig.dither) == 0;
                }

                public final float getDither() {
/* 1 */             return this.dither;
                }

                public final int getFeatureDim() {
/* 1 */             return this.featureDim;
                }

                public final int getSampleRate() {
/* 1 */             return this.sampleRate;
                }

                public int hashCode() {
/* 22 */            return Float.hashCode(this.dither) + IIl001iO0Io.I0000O(this.featureDim, Integer.hashCode(this.sampleRate) * 31, 31);
                }

                public final void setDither(float f) {
/* 1 */             this.dither = f;
                }

                public final void setFeatureDim(int i) {
/* 1 */             this.featureDim = i;
                }

                public final void setSampleRate(int i) {
/* 1 */             this.sampleRate = i;
                }

                public String toString() {
/* 38 */            return "FeatureConfig(sampleRate=" + this.sampleRate + ", featureDim=" + this.featureDim + ", dither=" + this.dither + ')';
                }

/* 21 */        public FeatureConfig(int i, int i2, float f) {
/* 23 */            this.sampleRate = i;
/* 24 */            this.featureDim = i2;
/* 25 */            this.dither = f;
                }

/* 25 */        public FeatureConfig() {
/* 26 */            this(0, 0, 0.0f, 7, null);
                }
            }
