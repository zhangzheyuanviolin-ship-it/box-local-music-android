            package com.k2fsa.sherpa.onnx;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u000bHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTtsPocketModelConfig;", "", "lmFlow", "", "lmMain", "encoder", "decoder", "textConditioner", "vocabJson", "tokenScoresJson", "voiceEmbeddingCacheCapacity", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDecoder", "()Ljava/lang/String;", "setDecoder", "(Ljava/lang/String;)V", "getEncoder", "setEncoder", "getLmFlow", "setLmFlow", "getLmMain", "setLmMain", "getTextConditioner", "setTextConditioner", "getTokenScoresJson", "setTokenScoresJson", "getVocabJson", "setVocabJson", "getVoiceEmbeddingCacheCapacity", "()I", "setVoiceEmbeddingCacheCapacity", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 46 */    public final class OfflineTtsPocketModelConfig {
                private String decoder;
                private String encoder;
                private String lmFlow;
                private String lmMain;
                private String textConditioner;
                private String tokenScoresJson;
                private String vocabJson;
                private int voiceEmbeddingCacheCapacity;

                public OfflineTtsPocketModelConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 44 */            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & Barcode.FORMAT_ITF) != 0 ? 50 : i);
                }

                public static OfflineTtsPocketModelConfig copy$default(OfflineTtsPocketModelConfig offlineTtsPocketModelConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 str = offlineTtsPocketModelConfig.lmFlow;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                str2 = offlineTtsPocketModelConfig.lmMain;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                str3 = offlineTtsPocketModelConfig.encoder;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                str4 = offlineTtsPocketModelConfig.decoder;
                    }
/* 27 */            if ((i2 & 16) != 0) {
/* 29 */                str5 = offlineTtsPocketModelConfig.textConditioner;
                    }
/* 33 */            if ((i2 & 32) != 0) {
/* 35 */                str6 = offlineTtsPocketModelConfig.vocabJson;
                    }
/* 39 */            if ((i2 & 64) != 0) {
/* 41 */                str7 = offlineTtsPocketModelConfig.tokenScoresJson;
                    }
/* 45 */            if ((i2 & Barcode.FORMAT_ITF) != 0) {
/* 47 */                i = offlineTtsPocketModelConfig.voiceEmbeddingCacheCapacity;
                    }
/* 49 */            String str8 = str7;
/* 50 */            int i3 = i;
/* 51 */            String str9 = str5;
/* 52 */            String str10 = str6;
/* 58 */            return offlineTtsPocketModelConfig.copy(str, str2, str3, str4, str9, str10, str8, i3);
                }

                public final String getLmFlow() {
/* 1 */             return this.lmFlow;
                }

                public final String getLmMain() {
/* 1 */             return this.lmMain;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getTextConditioner() {
/* 1 */             return this.textConditioner;
                }

                public final String getVocabJson() {
/* 1 */             return this.vocabJson;
                }

                public final String getTokenScoresJson() {
/* 1 */             return this.tokenScoresJson;
                }

                public final int getVoiceEmbeddingCacheCapacity() {
/* 1 */             return this.voiceEmbeddingCacheCapacity;
                }

                public final OfflineTtsPocketModelConfig copy(String lmFlow, String lmMain, String encoder, String decoder, String textConditioner, String vocabJson, String tokenScoresJson, int voiceEmbeddingCacheCapacity) {
/* 3 */             return new OfflineTtsPocketModelConfig(lmFlow, lmMain, encoder, decoder, textConditioner, vocabJson, tokenScoresJson, voiceEmbeddingCacheCapacity);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineTtsPocketModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineTtsPocketModelConfig offlineTtsPocketModelConfig = (OfflineTtsPocketModelConfig) other;
                    return O0000Ioio00.I0000O(this.lmFlow, offlineTtsPocketModelConfig.lmFlow) && O0000Ioio00.I0000O(this.lmMain, offlineTtsPocketModelConfig.lmMain) && O0000Ioio00.I0000O(this.encoder, offlineTtsPocketModelConfig.encoder) && O0000Ioio00.I0000O(this.decoder, offlineTtsPocketModelConfig.decoder) && O0000Ioio00.I0000O(this.textConditioner, offlineTtsPocketModelConfig.textConditioner) && O0000Ioio00.I0000O(this.vocabJson, offlineTtsPocketModelConfig.vocabJson) && O0000Ioio00.I0000O(this.tokenScoresJson, offlineTtsPocketModelConfig.tokenScoresJson) && this.voiceEmbeddingCacheCapacity == offlineTtsPocketModelConfig.voiceEmbeddingCacheCapacity;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getLmFlow() {
/* 1 */             return this.lmFlow;
                }

                public final String getLmMain() {
/* 1 */             return this.lmMain;
                }

                public final String getTextConditioner() {
/* 1 */             return this.textConditioner;
                }

                public final String getTokenScoresJson() {
/* 1 */             return this.tokenScoresJson;
                }

                public final String getVocabJson() {
/* 1 */             return this.vocabJson;
                }

                public final int getVoiceEmbeddingCacheCapacity() {
/* 1 */             return this.voiceEmbeddingCacheCapacity;
                }

                public int hashCode() {
/* 52 */            return Integer.hashCode(this.voiceEmbeddingCacheCapacity) + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.lmFlow.hashCode() * 31, 31, this.lmMain), 31, this.encoder), 31, this.decoder), 31, this.textConditioner), 31, this.vocabJson), 31, this.tokenScoresJson);
                }

                public final void setDecoder(String str) {
/* 1 */             this.decoder = str;
                }

                public final void setEncoder(String str) {
/* 1 */             this.encoder = str;
                }

                public final void setLmFlow(String str) {
/* 1 */             this.lmFlow = str;
                }

                public final void setLmMain(String str) {
/* 1 */             this.lmMain = str;
                }

                public final void setTextConditioner(String str) {
/* 1 */             this.textConditioner = str;
                }

                public final void setTokenScoresJson(String str) {
/* 1 */             this.tokenScoresJson = str;
                }

                public final void setVocabJson(String str) {
/* 1 */             this.vocabJson = str;
                }

                public final void setVoiceEmbeddingCacheCapacity(int i) {
/* 1 */             this.voiceEmbeddingCacheCapacity = i;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OfflineTtsPocketModelConfig(lmFlow=");
/* 10 */            sb.append(this.lmFlow);
/* 15 */            sb.append(", lmMain=");
/* 20 */            sb.append(this.lmMain);
/* 25 */            sb.append(", encoder=");
/* 30 */            sb.append(this.encoder);
/* 35 */            sb.append(", decoder=");
/* 40 */            sb.append(this.decoder);
/* 45 */            sb.append(", textConditioner=");
/* 50 */            sb.append(this.textConditioner);
/* 55 */            sb.append(", vocabJson=");
/* 60 */            sb.append(this.vocabJson);
/* 65 */            sb.append(", tokenScoresJson=");
/* 70 */            sb.append(this.tokenScoresJson);
/* 75 */            sb.append(", voiceEmbeddingCacheCapacity=");
/* 82 */            return Oi010OO0.I001i1lo1io(sb, this.voiceEmbeddingCacheCapacity, ')');
                }

/* 47 */        public OfflineTtsPocketModelConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
/* 49 */            this.lmFlow = str;
/* 50 */            this.lmMain = str2;
/* 51 */            this.encoder = str3;
/* 52 */            this.decoder = str4;
/* 53 */            this.textConditioner = str5;
/* 54 */            this.vocabJson = str6;
/* 55 */            this.tokenScoresJson = str7;
/* 56 */            this.voiceEmbeddingCacheCapacity = i;
                }

/* 56 */        public OfflineTtsPocketModelConfig() {
/* 57 */            this(null, null, null, null, null, null, null, 0, 255, null);
                }
            }
