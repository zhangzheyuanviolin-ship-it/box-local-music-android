            package com.k2fsa.sherpa.onnx;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            import p000.OooioIOo1;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003Jm\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012¨\u00068"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTtsZipVoiceModelConfig;", "", "tokens", "", "encoder", "decoder", "vocoder", "dataDir", "lexicon", "featScale", "", "tShift", "targetRms", "guidanceScale", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFF)V", "getDataDir", "()Ljava/lang/String;", "setDataDir", "(Ljava/lang/String;)V", "getDecoder", "setDecoder", "getEncoder", "setEncoder", "getFeatScale", "()F", "setFeatScale", "(F)V", "getGuidanceScale", "setGuidanceScale", "getLexicon", "setLexicon", "getTShift", "setTShift", "getTargetRms", "setTargetRms", "getTokens", "setTokens", "getVocoder", "setVocoder", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 60 */    public final class OfflineTtsZipVoiceModelConfig {
                private String dataDir;
                private String decoder;
                private String encoder;
                private float featScale;
                private float guidanceScale;
                private String lexicon;
                private float tShift;
                private float targetRms;
                private String tokens;
                private String vocoder;

                public OfflineTtsZipVoiceModelConfig(String str, String str2, String str3, String str4, String str5, String str6, float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 58 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? 0.1f : f, (i & Barcode.FORMAT_ITF) != 0 ? 0.5f : f2, (i & Barcode.FORMAT_QR_CODE) != 0 ? 0.1f : f3, (i & Barcode.FORMAT_UPC_A) != 0 ? 1.0f : f4);
                }

                public static OfflineTtsZipVoiceModelConfig copy$default(OfflineTtsZipVoiceModelConfig offlineTtsZipVoiceModelConfig, String str, String str2, String str3, String str4, String str5, String str6, float f, float f2, float f3, float f4, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = offlineTtsZipVoiceModelConfig.tokens;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = offlineTtsZipVoiceModelConfig.encoder;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = offlineTtsZipVoiceModelConfig.decoder;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                str4 = offlineTtsZipVoiceModelConfig.vocoder;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                str5 = offlineTtsZipVoiceModelConfig.dataDir;
                    }
/* 33 */            if ((i & 32) != 0) {
/* 35 */                str6 = offlineTtsZipVoiceModelConfig.lexicon;
                    }
/* 39 */            if ((i & 64) != 0) {
/* 41 */                f = offlineTtsZipVoiceModelConfig.featScale;
                    }
/* 45 */            if ((i & Barcode.FORMAT_ITF) != 0) {
/* 47 */                f2 = offlineTtsZipVoiceModelConfig.tShift;
                    }
/* 51 */            if ((i & Barcode.FORMAT_QR_CODE) != 0) {
/* 53 */                f3 = offlineTtsZipVoiceModelConfig.targetRms;
                    }
/* 57 */            if ((i & Barcode.FORMAT_UPC_A) != 0) {
/* 59 */                f4 = offlineTtsZipVoiceModelConfig.guidanceScale;
                    }
/* 61 */            float f5 = f3;
/* 62 */            float f6 = f4;
/* 63 */            float f7 = f;
/* 64 */            float f8 = f2;
/* 65 */            String str7 = str5;
/* 66 */            String str8 = str6;
/* 72 */            return offlineTtsZipVoiceModelConfig.copy(str, str2, str3, str4, str7, str8, f7, f8, f5, f6);
                }

                public final String getTokens() {
/* 1 */             return this.tokens;
                }

                public final float getGuidanceScale() {
/* 1 */             return this.guidanceScale;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getVocoder() {
/* 1 */             return this.vocoder;
                }

                public final String getDataDir() {
/* 1 */             return this.dataDir;
                }

                public final String getLexicon() {
/* 1 */             return this.lexicon;
                }

                public final float getFeatScale() {
/* 1 */             return this.featScale;
                }

                public final float getTShift() {
/* 1 */             return this.tShift;
                }

                public final float getTargetRms() {
/* 1 */             return this.targetRms;
                }

                public final OfflineTtsZipVoiceModelConfig copy(String tokens, String encoder, String decoder, String vocoder, String dataDir, String lexicon, float featScale, float tShift, float targetRms, float guidanceScale) {
/* 3 */             return new OfflineTtsZipVoiceModelConfig(tokens, encoder, decoder, vocoder, dataDir, lexicon, featScale, tShift, targetRms, guidanceScale);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineTtsZipVoiceModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineTtsZipVoiceModelConfig offlineTtsZipVoiceModelConfig = (OfflineTtsZipVoiceModelConfig) other;
                    return O0000Ioio00.I0000O(this.tokens, offlineTtsZipVoiceModelConfig.tokens) && O0000Ioio00.I0000O(this.encoder, offlineTtsZipVoiceModelConfig.encoder) && O0000Ioio00.I0000O(this.decoder, offlineTtsZipVoiceModelConfig.decoder) && O0000Ioio00.I0000O(this.vocoder, offlineTtsZipVoiceModelConfig.vocoder) && O0000Ioio00.I0000O(this.dataDir, offlineTtsZipVoiceModelConfig.dataDir) && O0000Ioio00.I0000O(this.lexicon, offlineTtsZipVoiceModelConfig.lexicon) && Float.compare(this.featScale, offlineTtsZipVoiceModelConfig.featScale) == 0 && Float.compare(this.tShift, offlineTtsZipVoiceModelConfig.tShift) == 0 && Float.compare(this.targetRms, offlineTtsZipVoiceModelConfig.targetRms) == 0 && Float.compare(this.guidanceScale, offlineTtsZipVoiceModelConfig.guidanceScale) == 0;
                }

                public final String getDataDir() {
/* 1 */             return this.dataDir;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final float getFeatScale() {
/* 1 */             return this.featScale;
                }

                public final float getGuidanceScale() {
/* 1 */             return this.guidanceScale;
                }

                public final String getLexicon() {
/* 1 */             return this.lexicon;
                }

                public final float getTShift() {
/* 1 */             return this.tShift;
                }

                public final float getTargetRms() {
/* 1 */             return this.targetRms;
                }

                public final String getTokens() {
/* 1 */             return this.tokens;
                }

                public final String getVocoder() {
/* 1 */             return this.vocoder;
                }

                public int hashCode() {
/* 64 */            return Float.hashCode(this.guidanceScale) + OooioIOo1.I0000O(OooioIOo1.I0000O(OooioIOo1.I0000O(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.tokens.hashCode() * 31, 31, this.encoder), 31, this.decoder), 31, this.vocoder), 31, this.dataDir), 31, this.lexicon), 31, this.featScale), 31, this.tShift), 31, this.targetRms);
                }

                public final void setDataDir(String str) {
/* 1 */             this.dataDir = str;
                }

                public final void setDecoder(String str) {
/* 1 */             this.decoder = str;
                }

                public final void setEncoder(String str) {
/* 1 */             this.encoder = str;
                }

                public final void setFeatScale(float f) {
/* 1 */             this.featScale = f;
                }

                public final void setGuidanceScale(float f) {
/* 1 */             this.guidanceScale = f;
                }

                public final void setLexicon(String str) {
/* 1 */             this.lexicon = str;
                }

                public final void setTShift(float f) {
/* 1 */             this.tShift = f;
                }

                public final void setTargetRms(float f) {
/* 1 */             this.targetRms = f;
                }

                public final void setTokens(String str) {
/* 1 */             this.tokens = str;
                }

                public final void setVocoder(String str) {
/* 1 */             this.vocoder = str;
                }

                public String toString() {
/* 108 */           return "OfflineTtsZipVoiceModelConfig(tokens=" + this.tokens + ", encoder=" + this.encoder + ", decoder=" + this.decoder + ", vocoder=" + this.vocoder + ", dataDir=" + this.dataDir + ", lexicon=" + this.lexicon + ", featScale=" + this.featScale + ", tShift=" + this.tShift + ", targetRms=" + this.targetRms + ", guidanceScale=" + this.guidanceScale + ')';
                }

/* 61 */        public OfflineTtsZipVoiceModelConfig(String str, String str2, String str3, String str4, String str5, String str6, float f, float f2, float f3, float f4) {
/* 63 */            this.tokens = str;
/* 64 */            this.encoder = str2;
/* 65 */            this.decoder = str3;
/* 66 */            this.vocoder = str4;
/* 67 */            this.dataDir = str5;
/* 68 */            this.lexicon = str6;
/* 69 */            this.featScale = f;
/* 70 */            this.tShift = f2;
/* 71 */            this.targetRms = f3;
/* 72 */            this.guidanceScale = f4;
                }

/* 72 */        public OfflineTtsZipVoiceModelConfig() {
/* 73 */            this(null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 1023, null);
                }
            }
