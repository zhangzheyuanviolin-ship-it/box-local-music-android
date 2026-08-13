            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/k2fsa/sherpa/onnx/AudioTaggingConfig;", "", "model", "Lcom/k2fsa/sherpa/onnx/AudioTaggingModelConfig;", "labels", "", "topK", "", "(Lcom/k2fsa/sherpa/onnx/AudioTaggingModelConfig;Ljava/lang/String;I)V", "getLabels", "()Ljava/lang/String;", "setLabels", "(Ljava/lang/String;)V", "getModel", "()Lcom/k2fsa/sherpa/onnx/AudioTaggingModelConfig;", "setModel", "(Lcom/k2fsa/sherpa/onnx/AudioTaggingModelConfig;)V", "getTopK", "()I", "setTopK", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 32 */    public final class AudioTaggingConfig {
                private String labels;
                private AudioTaggingModelConfig model;
                private int topK;

                public AudioTaggingConfig(AudioTaggingModelConfig audioTaggingModelConfig, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 30 */            this((i2 & 1) != 0 ? new AudioTaggingModelConfig(null, null, 0, false, null, 31, null) : audioTaggingModelConfig, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 5 : i);
                }

                public static AudioTaggingConfig copy$default(AudioTaggingConfig audioTaggingConfig, AudioTaggingModelConfig audioTaggingModelConfig, String str, int i, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 audioTaggingModelConfig = audioTaggingConfig.model;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                str = audioTaggingConfig.labels;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                i = audioTaggingConfig.topK;
                    }
/* 19 */            return audioTaggingConfig.copy(audioTaggingModelConfig, str, i);
                }

                public final AudioTaggingModelConfig getModel() {
/* 1 */             return this.model;
                }

                public final String getLabels() {
/* 1 */             return this.labels;
                }

                public final int getTopK() {
/* 1 */             return this.topK;
                }

                public final AudioTaggingConfig copy(AudioTaggingModelConfig model, String labels, int topK) {
/* 3 */             return new AudioTaggingConfig(model, labels, topK);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof AudioTaggingConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            AudioTaggingConfig audioTaggingConfig = (AudioTaggingConfig) other;
                    return O0000Ioio00.I0000O(this.model, audioTaggingConfig.model) && O0000Ioio00.I0000O(this.labels, audioTaggingConfig.labels) && this.topK == audioTaggingConfig.topK;
                }

                public final String getLabels() {
/* 1 */             return this.labels;
                }

                public final AudioTaggingModelConfig getModel() {
/* 1 */             return this.model;
                }

                public final int getTopK() {
/* 1 */             return this.topK;
                }

                public int hashCode() {
/* 22 */            return Integer.hashCode(this.topK) + Oi010OO0.I000O01llI0(this.model.hashCode() * 31, 31, this.labels);
                }

                public final void setLabels(String str) {
/* 1 */             this.labels = str;
                }

                public final void setModel(AudioTaggingModelConfig audioTaggingModelConfig) {
/* 1 */             this.model = audioTaggingModelConfig;
                }

                public final void setTopK(int i) {
/* 1 */             this.topK = i;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AudioTaggingConfig(model=");
/* 10 */            sb.append(this.model);
/* 15 */            sb.append(", labels=");
/* 20 */            sb.append(this.labels);
/* 25 */            sb.append(", topK=");
/* 32 */            return Oi010OO0.I001i1lo1io(sb, this.topK, ')');
                }

/* 33 */        public AudioTaggingConfig(AudioTaggingModelConfig audioTaggingModelConfig, String str, int i) {
/* 35 */            this.model = audioTaggingModelConfig;
/* 36 */            this.labels = str;
/* 37 */            this.topK = i;
                }

/* 37 */        public AudioTaggingConfig() {
/* 38 */            this(null, null, 0, 7, null);
                }
            }
