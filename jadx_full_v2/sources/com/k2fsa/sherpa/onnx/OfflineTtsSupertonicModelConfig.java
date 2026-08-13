            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006)"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTtsSupertonicModelConfig;", "", "durationPredictor", "", "textEncoder", "vectorEstimator", "vocoder", "ttsJson", "unicodeIndexer", "voiceStyle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDurationPredictor", "()Ljava/lang/String;", "setDurationPredictor", "(Ljava/lang/String;)V", "getTextEncoder", "setTextEncoder", "getTtsJson", "setTtsJson", "getUnicodeIndexer", "setUnicodeIndexer", "getVectorEstimator", "setVectorEstimator", "getVocoder", "setVocoder", "getVoiceStyle", "setVoiceStyle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 40 */    public final class OfflineTtsSupertonicModelConfig {
                private String durationPredictor;
                private String textEncoder;
                private String ttsJson;
                private String unicodeIndexer;
                private String vectorEstimator;
                private String vocoder;
                private String voiceStyle;

                public OfflineTtsSupertonicModelConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 38 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
                }

                public static OfflineTtsSupertonicModelConfig copy$default(OfflineTtsSupertonicModelConfig offlineTtsSupertonicModelConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = offlineTtsSupertonicModelConfig.durationPredictor;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = offlineTtsSupertonicModelConfig.textEncoder;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = offlineTtsSupertonicModelConfig.vectorEstimator;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                str4 = offlineTtsSupertonicModelConfig.vocoder;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                str5 = offlineTtsSupertonicModelConfig.ttsJson;
                    }
/* 33 */            if ((i & 32) != 0) {
/* 35 */                str6 = offlineTtsSupertonicModelConfig.unicodeIndexer;
                    }
/* 39 */            if ((i & 64) != 0) {
/* 41 */                str7 = offlineTtsSupertonicModelConfig.voiceStyle;
                    }
/* 43 */            String str8 = str6;
/* 44 */            String str9 = str7;
/* 46 */            String str10 = str5;
/* 48 */            String str11 = str3;
/* 51 */            return offlineTtsSupertonicModelConfig.copy(str, str2, str11, str4, str10, str8, str9);
                }

                public final String getDurationPredictor() {
/* 1 */             return this.durationPredictor;
                }

                public final String getTextEncoder() {
/* 1 */             return this.textEncoder;
                }

                public final String getVectorEstimator() {
/* 1 */             return this.vectorEstimator;
                }

                public final String getVocoder() {
/* 1 */             return this.vocoder;
                }

                public final String getTtsJson() {
/* 1 */             return this.ttsJson;
                }

                public final String getUnicodeIndexer() {
/* 1 */             return this.unicodeIndexer;
                }

                public final String getVoiceStyle() {
/* 1 */             return this.voiceStyle;
                }

                public final OfflineTtsSupertonicModelConfig copy(String durationPredictor, String textEncoder, String vectorEstimator, String vocoder, String ttsJson, String unicodeIndexer, String voiceStyle) {
/* 3 */             return new OfflineTtsSupertonicModelConfig(durationPredictor, textEncoder, vectorEstimator, vocoder, ttsJson, unicodeIndexer, voiceStyle);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineTtsSupertonicModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineTtsSupertonicModelConfig offlineTtsSupertonicModelConfig = (OfflineTtsSupertonicModelConfig) other;
                    return O0000Ioio00.I0000O(this.durationPredictor, offlineTtsSupertonicModelConfig.durationPredictor) && O0000Ioio00.I0000O(this.textEncoder, offlineTtsSupertonicModelConfig.textEncoder) && O0000Ioio00.I0000O(this.vectorEstimator, offlineTtsSupertonicModelConfig.vectorEstimator) && O0000Ioio00.I0000O(this.vocoder, offlineTtsSupertonicModelConfig.vocoder) && O0000Ioio00.I0000O(this.ttsJson, offlineTtsSupertonicModelConfig.ttsJson) && O0000Ioio00.I0000O(this.unicodeIndexer, offlineTtsSupertonicModelConfig.unicodeIndexer) && O0000Ioio00.I0000O(this.voiceStyle, offlineTtsSupertonicModelConfig.voiceStyle);
                }

                public final String getDurationPredictor() {
/* 1 */             return this.durationPredictor;
                }

                public final String getTextEncoder() {
/* 1 */             return this.textEncoder;
                }

                public final String getTtsJson() {
/* 1 */             return this.ttsJson;
                }

                public final String getUnicodeIndexer() {
/* 1 */             return this.unicodeIndexer;
                }

                public final String getVectorEstimator() {
/* 1 */             return this.vectorEstimator;
                }

                public final String getVocoder() {
/* 1 */             return this.vocoder;
                }

                public final String getVoiceStyle() {
/* 1 */             return this.voiceStyle;
                }

                public int hashCode() {
/* 46 */            return this.voiceStyle.hashCode() + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.durationPredictor.hashCode() * 31, 31, this.textEncoder), 31, this.vectorEstimator), 31, this.vocoder), 31, this.ttsJson), 31, this.unicodeIndexer);
                }

                public final void setDurationPredictor(String str) {
/* 1 */             this.durationPredictor = str;
                }

                public final void setTextEncoder(String str) {
/* 1 */             this.textEncoder = str;
                }

                public final void setTtsJson(String str) {
/* 1 */             this.ttsJson = str;
                }

                public final void setUnicodeIndexer(String str) {
/* 1 */             this.unicodeIndexer = str;
                }

                public final void setVectorEstimator(String str) {
/* 1 */             this.vectorEstimator = str;
                }

                public final void setVocoder(String str) {
/* 1 */             this.vocoder = str;
                }

                public final void setVoiceStyle(String str) {
/* 1 */             this.voiceStyle = str;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OfflineTtsSupertonicModelConfig(durationPredictor=");
/* 10 */            sb.append(this.durationPredictor);
/* 15 */            sb.append(", textEncoder=");
/* 20 */            sb.append(this.textEncoder);
/* 25 */            sb.append(", vectorEstimator=");
/* 30 */            sb.append(this.vectorEstimator);
/* 35 */            sb.append(", vocoder=");
/* 40 */            sb.append(this.vocoder);
/* 45 */            sb.append(", ttsJson=");
/* 50 */            sb.append(this.ttsJson);
/* 55 */            sb.append(", unicodeIndexer=");
/* 60 */            sb.append(this.unicodeIndexer);
/* 65 */            sb.append(", voiceStyle=");
/* 72 */            return IlIi0I0.I000oI1ioi(sb, this.voiceStyle, ')');
                }

/* 41 */        public OfflineTtsSupertonicModelConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
/* 43 */            this.durationPredictor = str;
/* 44 */            this.textEncoder = str2;
/* 45 */            this.vectorEstimator = str3;
/* 46 */            this.vocoder = str4;
/* 47 */            this.ttsJson = str5;
/* 48 */            this.unicodeIndexer = str6;
/* 49 */            this.voiceStyle = str7;
                }

/* 49 */        public OfflineTtsSupertonicModelConfig() {
/* 50 */            this(null, null, null, null, null, null, null, 127, null);
                }
            }
