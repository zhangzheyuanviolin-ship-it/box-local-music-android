            package com.k2fsa.sherpa.onnx;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.OooioIOo1;
            
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006*"}, d2 = {"Lcom/k2fsa/sherpa/onnx/SileroVadModelConfig;", "", "model", "", "threshold", "", "minSilenceDuration", "minSpeechDuration", "windowSize", "", "maxSpeechDuration", "(Ljava/lang/String;FFFIF)V", "getMaxSpeechDuration", "()F", "setMaxSpeechDuration", "(F)V", "getMinSilenceDuration", "setMinSilenceDuration", "getMinSpeechDuration", "setMinSpeechDuration", "getModel", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "getThreshold", "setThreshold", "getWindowSize", "()I", "setWindowSize", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 46 */    public final class SileroVadModelConfig {
                private float maxSpeechDuration;
                private float minSilenceDuration;
                private float minSpeechDuration;
                private String model;
                private float threshold;
                private int windowSize;

                public SileroVadModelConfig(String str, float f, float f2, float f3, int i, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 44 */            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.5f : f, (i2 & 4) != 0 ? 0.25f : f2, (i2 & 8) != 0 ? 0.25f : f3, (i2 & 16) != 0 ? Barcode.FORMAT_UPC_A : i, (i2 & 32) != 0 ? 5.0f : f4);
                }

                public static SileroVadModelConfig copy$default(SileroVadModelConfig sileroVadModelConfig, String str, float f, float f2, float f3, int i, float f4, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 str = sileroVadModelConfig.model;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                f = sileroVadModelConfig.threshold;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                f2 = sileroVadModelConfig.minSilenceDuration;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                f3 = sileroVadModelConfig.minSpeechDuration;
                    }
/* 27 */            if ((i2 & 16) != 0) {
/* 29 */                i = sileroVadModelConfig.windowSize;
                    }
/* 33 */            if ((i2 & 32) != 0) {
/* 35 */                f4 = sileroVadModelConfig.maxSpeechDuration;
                    }
/* 37 */            int i3 = i;
/* 38 */            float f5 = f4;
/* 44 */            return sileroVadModelConfig.copy(str, f, f2, f3, i3, f5);
                }

                public final String getModel() {
/* 1 */             return this.model;
                }

                public final float getThreshold() {
/* 1 */             return this.threshold;
                }

                public final float getMinSilenceDuration() {
/* 1 */             return this.minSilenceDuration;
                }

                public final float getMinSpeechDuration() {
/* 1 */             return this.minSpeechDuration;
                }

                public final int getWindowSize() {
/* 1 */             return this.windowSize;
                }

                public final float getMaxSpeechDuration() {
/* 1 */             return this.maxSpeechDuration;
                }

                public final SileroVadModelConfig copy(String model, float threshold, float minSilenceDuration, float minSpeechDuration, int windowSize, float maxSpeechDuration) {
/* 3 */             return new SileroVadModelConfig(model, threshold, minSilenceDuration, minSpeechDuration, windowSize, maxSpeechDuration);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof SileroVadModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            SileroVadModelConfig sileroVadModelConfig = (SileroVadModelConfig) other;
                    return O0000Ioio00.I0000O(this.model, sileroVadModelConfig.model) && Float.compare(this.threshold, sileroVadModelConfig.threshold) == 0 && Float.compare(this.minSilenceDuration, sileroVadModelConfig.minSilenceDuration) == 0 && Float.compare(this.minSpeechDuration, sileroVadModelConfig.minSpeechDuration) == 0 && this.windowSize == sileroVadModelConfig.windowSize && Float.compare(this.maxSpeechDuration, sileroVadModelConfig.maxSpeechDuration) == 0;
                }

                public final float getMaxSpeechDuration() {
/* 1 */             return this.maxSpeechDuration;
                }

                public final float getMinSilenceDuration() {
/* 1 */             return this.minSilenceDuration;
                }

                public final float getMinSpeechDuration() {
/* 1 */             return this.minSpeechDuration;
                }

                public final String getModel() {
/* 1 */             return this.model;
                }

                public final float getThreshold() {
/* 1 */             return this.threshold;
                }

                public final int getWindowSize() {
/* 1 */             return this.windowSize;
                }

                public int hashCode() {
/* 40 */            return Float.hashCode(this.maxSpeechDuration) + IIl001iO0Io.I0000O(this.windowSize, OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(this.model.hashCode() * 31, 31, this.threshold), 31, this.minSilenceDuration), 31, this.minSpeechDuration), 31);
                }

                public final void setMaxSpeechDuration(float f) {
/* 1 */             this.maxSpeechDuration = f;
                }

                public final void setMinSilenceDuration(float f) {
/* 1 */             this.minSilenceDuration = f;
                }

                public final void setMinSpeechDuration(float f) {
/* 1 */             this.minSpeechDuration = f;
                }

                public final void setModel(String str) {
/* 1 */             this.model = str;
                }

                public final void setThreshold(float f) {
/* 1 */             this.threshold = f;
                }

                public final void setWindowSize(int i) {
/* 1 */             this.windowSize = i;
                }

                public String toString() {
/* 68 */            return "SileroVadModelConfig(model=" + this.model + ", threshold=" + this.threshold + ", minSilenceDuration=" + this.minSilenceDuration + ", minSpeechDuration=" + this.minSpeechDuration + ", windowSize=" + this.windowSize + ", maxSpeechDuration=" + this.maxSpeechDuration + ')';
                }

/* 47 */        public SileroVadModelConfig(String str, float f, float f2, float f3, int i, float f4) {
/* 49 */            this.model = str;
/* 50 */            this.threshold = f;
/* 51 */            this.minSilenceDuration = f2;
/* 52 */            this.minSpeechDuration = f3;
/* 53 */            this.windowSize = i;
/* 54 */            this.maxSpeechDuration = f4;
                }

/* 54 */        public SileroVadModelConfig() {
/* 55 */            this(null, 0.0f, 0.0f, 0.0f, 0, 0.0f, 63, null);
                }
            }
