            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006$"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTtsKittenModelConfig;", "", "model", "", "voices", "tokens", "dataDir", "lengthScale", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", "getDataDir", "()Ljava/lang/String;", "setDataDir", "(Ljava/lang/String;)V", "getLengthScale", "()F", "setLengthScale", "(F)V", "getModel", "setModel", "getTokens", "setTokens", "getVoices", "setVoices", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 31 */    public final class OfflineTtsKittenModelConfig {
                private String dataDir;
                private float lengthScale;
                private String model;
                private String tokens;
                private String voices;

                public OfflineTtsKittenModelConfig(String str, String str2, String str3, String str4, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 29 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 1.0f : f);
                }

                public static OfflineTtsKittenModelConfig copy$default(OfflineTtsKittenModelConfig offlineTtsKittenModelConfig, String str, String str2, String str3, String str4, float f, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = offlineTtsKittenModelConfig.model;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = offlineTtsKittenModelConfig.voices;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = offlineTtsKittenModelConfig.tokens;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                str4 = offlineTtsKittenModelConfig.dataDir;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                f = offlineTtsKittenModelConfig.lengthScale;
                    }
/* 32 */            float f2 = f;
/* 34 */            String str5 = str3;
/* 37 */            return offlineTtsKittenModelConfig.copy(str, str2, str5, str4, f2);
                }

                public final String getModel() {
/* 1 */             return this.model;
                }

                public final String getVoices() {
/* 1 */             return this.voices;
                }

                public final String getTokens() {
/* 1 */             return this.tokens;
                }

                public final String getDataDir() {
/* 1 */             return this.dataDir;
                }

                public final float getLengthScale() {
/* 1 */             return this.lengthScale;
                }

                public final OfflineTtsKittenModelConfig copy(String model, String voices, String tokens, String dataDir, float lengthScale) {
/* 3 */             return new OfflineTtsKittenModelConfig(model, voices, tokens, dataDir, lengthScale);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineTtsKittenModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineTtsKittenModelConfig offlineTtsKittenModelConfig = (OfflineTtsKittenModelConfig) other;
                    return O0000Ioio00.I0000O(this.model, offlineTtsKittenModelConfig.model) && O0000Ioio00.I0000O(this.voices, offlineTtsKittenModelConfig.voices) && O0000Ioio00.I0000O(this.tokens, offlineTtsKittenModelConfig.tokens) && O0000Ioio00.I0000O(this.dataDir, offlineTtsKittenModelConfig.dataDir) && Float.compare(this.lengthScale, offlineTtsKittenModelConfig.lengthScale) == 0;
                }

                public final String getDataDir() {
/* 1 */             return this.dataDir;
                }

                public final float getLengthScale() {
/* 1 */             return this.lengthScale;
                }

                public final String getModel() {
/* 1 */             return this.model;
                }

                public final String getTokens() {
/* 1 */             return this.tokens;
                }

                public final String getVoices() {
/* 1 */             return this.voices;
                }

                public int hashCode() {
/* 34 */            return Float.hashCode(this.lengthScale) + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.model.hashCode() * 31, 31, this.voices), 31, this.tokens), 31, this.dataDir);
                }

                public final void setDataDir(String str) {
/* 1 */             this.dataDir = str;
                }

                public final void setLengthScale(float f) {
/* 1 */             this.lengthScale = f;
                }

                public final void setModel(String str) {
/* 1 */             this.model = str;
                }

                public final void setTokens(String str) {
/* 1 */             this.tokens = str;
                }

                public final void setVoices(String str) {
/* 1 */             this.voices = str;
                }

                public String toString() {
/* 58 */            return "OfflineTtsKittenModelConfig(model=" + this.model + ", voices=" + this.voices + ", tokens=" + this.tokens + ", dataDir=" + this.dataDir + ", lengthScale=" + this.lengthScale + ')';
                }

/* 32 */        public OfflineTtsKittenModelConfig(String str, String str2, String str3, String str4, float f) {
/* 34 */            this.model = str;
/* 35 */            this.voices = str2;
/* 36 */            this.tokens = str3;
/* 37 */            this.dataDir = str4;
/* 38 */            this.lengthScale = f;
                }

/* 38 */        public OfflineTtsKittenModelConfig() {
/* 39 */            this(null, null, null, null, 0.0f, 31, null);
                }
            }
