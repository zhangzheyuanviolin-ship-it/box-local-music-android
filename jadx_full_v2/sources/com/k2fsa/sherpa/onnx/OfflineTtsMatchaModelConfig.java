            package com.k2fsa.sherpa.onnx;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            import p000.OooioIOo1;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u00060"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTtsMatchaModelConfig;", "", "acousticModel", "", "vocoder", "lexicon", "tokens", "dataDir", "dictDir", "noiseScale", "", "lengthScale", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FF)V", "getAcousticModel", "()Ljava/lang/String;", "setAcousticModel", "(Ljava/lang/String;)V", "getDataDir", "setDataDir", "getDictDir", "setDictDir", "getLengthScale", "()F", "setLengthScale", "(F)V", "getLexicon", "setLexicon", "getNoiseScale", "setNoiseScale", "getTokens", "setTokens", "getVocoder", "setVocoder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 47 */    public final class OfflineTtsMatchaModelConfig {
                private String acousticModel;
                private String dataDir;
                private String dictDir;
                private float lengthScale;
                private String lexicon;
                private float noiseScale;
                private String tokens;
                private String vocoder;

                public OfflineTtsMatchaModelConfig(String str, String str2, String str3, String str4, String str5, String str6, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 45 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? 1.0f : f, (i & Barcode.FORMAT_ITF) != 0 ? 1.0f : f2);
                }

                public static OfflineTtsMatchaModelConfig copy$default(OfflineTtsMatchaModelConfig offlineTtsMatchaModelConfig, String str, String str2, String str3, String str4, String str5, String str6, float f, float f2, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = offlineTtsMatchaModelConfig.acousticModel;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = offlineTtsMatchaModelConfig.vocoder;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = offlineTtsMatchaModelConfig.lexicon;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                str4 = offlineTtsMatchaModelConfig.tokens;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                str5 = offlineTtsMatchaModelConfig.dataDir;
                    }
/* 33 */            if ((i & 32) != 0) {
/* 35 */                str6 = offlineTtsMatchaModelConfig.dictDir;
                    }
/* 39 */            if ((i & 64) != 0) {
/* 41 */                f = offlineTtsMatchaModelConfig.noiseScale;
                    }
/* 45 */            if ((i & Barcode.FORMAT_ITF) != 0) {
/* 47 */                f2 = offlineTtsMatchaModelConfig.lengthScale;
                    }
/* 49 */            float f3 = f;
/* 50 */            float f4 = f2;
/* 51 */            String str7 = str5;
/* 52 */            String str8 = str6;
/* 58 */            return offlineTtsMatchaModelConfig.copy(str, str2, str3, str4, str7, str8, f3, f4);
                }

                public final String getAcousticModel() {
/* 1 */             return this.acousticModel;
                }

                public final String getVocoder() {
/* 1 */             return this.vocoder;
                }

                public final String getLexicon() {
/* 1 */             return this.lexicon;
                }

                public final String getTokens() {
/* 1 */             return this.tokens;
                }

                public final String getDataDir() {
/* 1 */             return this.dataDir;
                }

                public final String getDictDir() {
/* 1 */             return this.dictDir;
                }

                public final float getNoiseScale() {
/* 1 */             return this.noiseScale;
                }

                public final float getLengthScale() {
/* 1 */             return this.lengthScale;
                }

                public final OfflineTtsMatchaModelConfig copy(String acousticModel, String vocoder, String lexicon, String tokens, String dataDir, String dictDir, float noiseScale, float lengthScale) {
/* 3 */             return new OfflineTtsMatchaModelConfig(acousticModel, vocoder, lexicon, tokens, dataDir, dictDir, noiseScale, lengthScale);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineTtsMatchaModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineTtsMatchaModelConfig offlineTtsMatchaModelConfig = (OfflineTtsMatchaModelConfig) other;
                    return O0000Ioio00.I0000O(this.acousticModel, offlineTtsMatchaModelConfig.acousticModel) && O0000Ioio00.I0000O(this.vocoder, offlineTtsMatchaModelConfig.vocoder) && O0000Ioio00.I0000O(this.lexicon, offlineTtsMatchaModelConfig.lexicon) && O0000Ioio00.I0000O(this.tokens, offlineTtsMatchaModelConfig.tokens) && O0000Ioio00.I0000O(this.dataDir, offlineTtsMatchaModelConfig.dataDir) && O0000Ioio00.I0000O(this.dictDir, offlineTtsMatchaModelConfig.dictDir) && Float.compare(this.noiseScale, offlineTtsMatchaModelConfig.noiseScale) == 0 && Float.compare(this.lengthScale, offlineTtsMatchaModelConfig.lengthScale) == 0;
                }

                public final String getAcousticModel() {
/* 1 */             return this.acousticModel;
                }

                public final String getDataDir() {
/* 1 */             return this.dataDir;
                }

                public final String getDictDir() {
/* 1 */             return this.dictDir;
                }

                public final float getLengthScale() {
/* 1 */             return this.lengthScale;
                }

                public final String getLexicon() {
/* 1 */             return this.lexicon;
                }

                public final float getNoiseScale() {
/* 1 */             return this.noiseScale;
                }

                public final String getTokens() {
/* 1 */             return this.tokens;
                }

                public final String getVocoder() {
/* 1 */             return this.vocoder;
                }

                public int hashCode() {
/* 52 */            return Float.hashCode(this.lengthScale) + OooioIOo1.I0000O(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.acousticModel.hashCode() * 31, 31, this.vocoder), 31, this.lexicon), 31, this.tokens), 31, this.dataDir), 31, this.dictDir), 31, this.noiseScale);
                }

                public final void setAcousticModel(String str) {
/* 1 */             this.acousticModel = str;
                }

                public final void setDataDir(String str) {
/* 1 */             this.dataDir = str;
                }

                public final void setDictDir(String str) {
/* 1 */             this.dictDir = str;
                }

                public final void setLengthScale(float f) {
/* 1 */             this.lengthScale = f;
                }

                public final void setLexicon(String str) {
/* 1 */             this.lexicon = str;
                }

                public final void setNoiseScale(float f) {
/* 1 */             this.noiseScale = f;
                }

                public final void setTokens(String str) {
/* 1 */             this.tokens = str;
                }

                public final void setVocoder(String str) {
/* 1 */             this.vocoder = str;
                }

                public String toString() {
/* 88 */            return "OfflineTtsMatchaModelConfig(acousticModel=" + this.acousticModel + ", vocoder=" + this.vocoder + ", lexicon=" + this.lexicon + ", tokens=" + this.tokens + ", dataDir=" + this.dataDir + ", dictDir=" + this.dictDir + ", noiseScale=" + this.noiseScale + ", lengthScale=" + this.lengthScale + ')';
                }

/* 48 */        public OfflineTtsMatchaModelConfig(String str, String str2, String str3, String str4, String str5, String str6, float f, float f2) {
/* 50 */            this.acousticModel = str;
/* 51 */            this.vocoder = str2;
/* 52 */            this.lexicon = str3;
/* 53 */            this.tokens = str4;
/* 54 */            this.dataDir = str5;
/* 55 */            this.dictDir = str6;
/* 56 */            this.noiseScale = f;
/* 57 */            this.lengthScale = f2;
                }

/* 57 */        public OfflineTtsMatchaModelConfig() {
/* 58 */            this(null, null, null, null, null, null, 0.0f, 0.0f, 255, null);
                }
            }
