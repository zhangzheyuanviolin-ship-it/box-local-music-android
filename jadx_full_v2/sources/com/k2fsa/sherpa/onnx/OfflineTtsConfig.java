            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\bHÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTtsConfig;", "", "model", "Lcom/k2fsa/sherpa/onnx/OfflineTtsModelConfig;", "ruleFsts", "", "ruleFars", "maxNumSentences", "", "silenceScale", "", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsModelConfig;Ljava/lang/String;Ljava/lang/String;IF)V", "getMaxNumSentences", "()I", "setMaxNumSentences", "(I)V", "getModel", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsModelConfig;", "setModel", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsModelConfig;)V", "getRuleFars", "()Ljava/lang/String;", "setRuleFars", "(Ljava/lang/String;)V", "getRuleFsts", "setRuleFsts", "getSilenceScale", "()F", "setSilenceScale", "(F)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 73 */    public final class OfflineTtsConfig {
                private int maxNumSentences;
                private OfflineTtsModelConfig model;
                private String ruleFars;
                private String ruleFsts;
                private float silenceScale;

                public OfflineTtsConfig(OfflineTtsModelConfig offlineTtsModelConfig, String str, String str2, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 71 */            this((i2 & 1) != 0 ? new OfflineTtsModelConfig(null, null, null, null, null, null, null, 0, false, null, 1023, null) : offlineTtsModelConfig, (i2 & 2) != 0 ? "" : str, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? 0.2f : f);
                }

                public static OfflineTtsConfig copy$default(OfflineTtsConfig offlineTtsConfig, OfflineTtsModelConfig offlineTtsModelConfig, String str, String str2, int i, float f, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 offlineTtsModelConfig = offlineTtsConfig.model;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                str = offlineTtsConfig.ruleFsts;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                str2 = offlineTtsConfig.ruleFars;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                i = offlineTtsConfig.maxNumSentences;
                    }
/* 27 */            if ((i2 & 16) != 0) {
/* 29 */                f = offlineTtsConfig.silenceScale;
                    }
/* 32 */            float f2 = f;
/* 34 */            String str3 = str2;
/* 37 */            return offlineTtsConfig.copy(offlineTtsModelConfig, str, str3, i, f2);
                }

                public final OfflineTtsModelConfig getModel() {
/* 1 */             return this.model;
                }

                public final String getRuleFsts() {
/* 1 */             return this.ruleFsts;
                }

                public final String getRuleFars() {
/* 1 */             return this.ruleFars;
                }

                public final int getMaxNumSentences() {
/* 1 */             return this.maxNumSentences;
                }

                public final float getSilenceScale() {
/* 1 */             return this.silenceScale;
                }

                public final OfflineTtsConfig copy(OfflineTtsModelConfig model, String ruleFsts, String ruleFars, int maxNumSentences, float silenceScale) {
/* 3 */             return new OfflineTtsConfig(model, ruleFsts, ruleFars, maxNumSentences, silenceScale);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineTtsConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineTtsConfig offlineTtsConfig = (OfflineTtsConfig) other;
                    return O0000Ioio00.I0000O(this.model, offlineTtsConfig.model) && O0000Ioio00.I0000O(this.ruleFsts, offlineTtsConfig.ruleFsts) && O0000Ioio00.I0000O(this.ruleFars, offlineTtsConfig.ruleFars) && this.maxNumSentences == offlineTtsConfig.maxNumSentences && Float.compare(this.silenceScale, offlineTtsConfig.silenceScale) == 0;
                }

                public final int getMaxNumSentences() {
/* 1 */             return this.maxNumSentences;
                }

                public final OfflineTtsModelConfig getModel() {
/* 1 */             return this.model;
                }

                public final String getRuleFars() {
/* 1 */             return this.ruleFars;
                }

                public final String getRuleFsts() {
/* 1 */             return this.ruleFsts;
                }

                public final float getSilenceScale() {
/* 1 */             return this.silenceScale;
                }

                public int hashCode() {
/* 34 */            return Float.hashCode(this.silenceScale) + IIl001iO0Io.I0000O(this.maxNumSentences, Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.model.hashCode() * 31, 31, this.ruleFsts), 31, this.ruleFars), 31);
                }

                public final void setMaxNumSentences(int i) {
/* 1 */             this.maxNumSentences = i;
                }

                public final void setModel(OfflineTtsModelConfig offlineTtsModelConfig) {
/* 1 */             this.model = offlineTtsModelConfig;
                }

                public final void setRuleFars(String str) {
/* 1 */             this.ruleFars = str;
                }

                public final void setRuleFsts(String str) {
/* 1 */             this.ruleFsts = str;
                }

                public final void setSilenceScale(float f) {
/* 1 */             this.silenceScale = f;
                }

                public String toString() {
/* 58 */            return "OfflineTtsConfig(model=" + this.model + ", ruleFsts=" + this.ruleFsts + ", ruleFars=" + this.ruleFars + ", maxNumSentences=" + this.maxNumSentences + ", silenceScale=" + this.silenceScale + ')';
                }

/* 74 */        public OfflineTtsConfig(OfflineTtsModelConfig offlineTtsModelConfig, String str, String str2, int i, float f) {
/* 76 */            this.model = offlineTtsModelConfig;
/* 77 */            this.ruleFsts = str;
/* 78 */            this.ruleFars = str2;
/* 79 */            this.maxNumSentences = i;
/* 80 */            this.silenceScale = f;
                }

/* 80 */        public OfflineTtsConfig() {
/* 81 */            this(null, null, null, 0, 0.0f, 31, null);
                }
            }
