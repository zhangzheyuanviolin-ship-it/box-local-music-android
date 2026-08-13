            package com.k2fsa.sherpa.onnx;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u00060"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTtsKokoroModelConfig;", "", "model", "", "voices", "tokens", "dataDir", "lexicon", "lang", "dictDir", "lengthScale", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", "getDataDir", "()Ljava/lang/String;", "setDataDir", "(Ljava/lang/String;)V", "getDictDir", "setDictDir", "getLang", "setLang", "getLengthScale", "()F", "setLengthScale", "(F)V", "getLexicon", "setLexicon", "getModel", "setModel", "getTokens", "setTokens", "getVoices", "setVoices", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 46 */    public final class OfflineTtsKokoroModelConfig {
                private String dataDir;
                private String dictDir;
                private String lang;
                private float lengthScale;
                private String lexicon;
                private String model;
                private String tokens;
                private String voices;

                public OfflineTtsKokoroModelConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 44 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & Barcode.FORMAT_ITF) != 0 ? 1.0f : f);
                }

                public static OfflineTtsKokoroModelConfig copy$default(OfflineTtsKokoroModelConfig offlineTtsKokoroModelConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, float f, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = offlineTtsKokoroModelConfig.model;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = offlineTtsKokoroModelConfig.voices;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = offlineTtsKokoroModelConfig.tokens;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                str4 = offlineTtsKokoroModelConfig.dataDir;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                str5 = offlineTtsKokoroModelConfig.lexicon;
                    }
/* 33 */            if ((i & 32) != 0) {
/* 35 */                str6 = offlineTtsKokoroModelConfig.lang;
                    }
/* 39 */            if ((i & 64) != 0) {
/* 41 */                str7 = offlineTtsKokoroModelConfig.dictDir;
                    }
/* 45 */            if ((i & Barcode.FORMAT_ITF) != 0) {
/* 47 */                f = offlineTtsKokoroModelConfig.lengthScale;
                    }
/* 49 */            String str8 = str7;
/* 50 */            float f2 = f;
/* 51 */            String str9 = str5;
/* 52 */            String str10 = str6;
/* 58 */            return offlineTtsKokoroModelConfig.copy(str, str2, str3, str4, str9, str10, str8, f2);
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

                public final String getLexicon() {
/* 1 */             return this.lexicon;
                }

                public final String getLang() {
/* 1 */             return this.lang;
                }

                public final String getDictDir() {
/* 1 */             return this.dictDir;
                }

                public final float getLengthScale() {
/* 1 */             return this.lengthScale;
                }

                public final OfflineTtsKokoroModelConfig copy(String model, String voices, String tokens, String dataDir, String lexicon, String lang, String dictDir, float lengthScale) {
/* 3 */             return new OfflineTtsKokoroModelConfig(model, voices, tokens, dataDir, lexicon, lang, dictDir, lengthScale);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineTtsKokoroModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineTtsKokoroModelConfig offlineTtsKokoroModelConfig = (OfflineTtsKokoroModelConfig) other;
                    return O0000Ioio00.I0000O(this.model, offlineTtsKokoroModelConfig.model) && O0000Ioio00.I0000O(this.voices, offlineTtsKokoroModelConfig.voices) && O0000Ioio00.I0000O(this.tokens, offlineTtsKokoroModelConfig.tokens) && O0000Ioio00.I0000O(this.dataDir, offlineTtsKokoroModelConfig.dataDir) && O0000Ioio00.I0000O(this.lexicon, offlineTtsKokoroModelConfig.lexicon) && O0000Ioio00.I0000O(this.lang, offlineTtsKokoroModelConfig.lang) && O0000Ioio00.I0000O(this.dictDir, offlineTtsKokoroModelConfig.dictDir) && Float.compare(this.lengthScale, offlineTtsKokoroModelConfig.lengthScale) == 0;
                }

                public final String getDataDir() {
/* 1 */             return this.dataDir;
                }

                public final String getDictDir() {
/* 1 */             return this.dictDir;
                }

                public final String getLang() {
/* 1 */             return this.lang;
                }

                public final float getLengthScale() {
/* 1 */             return this.lengthScale;
                }

                public final String getLexicon() {
/* 1 */             return this.lexicon;
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
/* 52 */            return Float.hashCode(this.lengthScale) + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.model.hashCode() * 31, 31, this.voices), 31, this.tokens), 31, this.dataDir), 31, this.lexicon), 31, this.lang), 31, this.dictDir);
                }

                public final void setDataDir(String str) {
/* 1 */             this.dataDir = str;
                }

                public final void setDictDir(String str) {
/* 1 */             this.dictDir = str;
                }

                public final void setLang(String str) {
/* 1 */             this.lang = str;
                }

                public final void setLengthScale(float f) {
/* 1 */             this.lengthScale = f;
                }

                public final void setLexicon(String str) {
/* 1 */             this.lexicon = str;
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
/* 88 */            return "OfflineTtsKokoroModelConfig(model=" + this.model + ", voices=" + this.voices + ", tokens=" + this.tokens + ", dataDir=" + this.dataDir + ", lexicon=" + this.lexicon + ", lang=" + this.lang + ", dictDir=" + this.dictDir + ", lengthScale=" + this.lengthScale + ')';
                }

/* 47 */        public OfflineTtsKokoroModelConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, float f) {
/* 49 */            this.model = str;
/* 50 */            this.voices = str2;
/* 51 */            this.tokens = str3;
/* 52 */            this.dataDir = str4;
/* 53 */            this.lexicon = str5;
/* 54 */            this.lang = str6;
/* 55 */            this.dictDir = str7;
/* 56 */            this.lengthScale = f;
                }

/* 56 */        public OfflineTtsKokoroModelConfig() {
/* 57 */            this(null, null, null, null, null, null, null, 0.0f, 255, null);
                }
            }
