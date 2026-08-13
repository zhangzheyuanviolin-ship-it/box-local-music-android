            package com.k2fsa.sherpa.onnx;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            import p000.OooioIOo1;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003Jm\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\bHÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%¨\u0006:"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineQwen3AsrModelConfig;", "", "convFrontend", "", "encoder", "decoder", "tokenizer", "maxTotalLen", "", "maxNewTokens", "temperature", "", "topP", "seed", "hotwords", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFILjava/lang/String;)V", "getConvFrontend", "()Ljava/lang/String;", "setConvFrontend", "(Ljava/lang/String;)V", "getDecoder", "setDecoder", "getEncoder", "setEncoder", "getHotwords", "setHotwords", "getMaxNewTokens", "()I", "setMaxNewTokens", "(I)V", "getMaxTotalLen", "setMaxTotalLen", "getSeed", "setSeed", "getTemperature", "()F", "setTemperature", "(F)V", "getTokenizer", "setTokenizer", "getTopP", "setTopP", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 62 */    public final class OfflineQwen3AsrModelConfig {
                private String convFrontend;
                private String decoder;
                private String encoder;
                private String hotwords;
                private int maxNewTokens;
                private int maxTotalLen;
                private int seed;
                private float temperature;
                private String tokenizer;
                private float topP;

                public OfflineQwen3AsrModelConfig(String str, String str2, String str3, String str4, int i, int i2, float f, float f2, int i3, String str5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
/* 60 */            this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? 512 : i, (i4 & 32) != 0 ? Barcode.FORMAT_ITF : i2, (i4 & 64) != 0 ? 1.0E-6f : f, (i4 & Barcode.FORMAT_ITF) != 0 ? 0.8f : f2, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? 42 : i3, (i4 & Barcode.FORMAT_UPC_A) != 0 ? "" : str5);
                }

                public static OfflineQwen3AsrModelConfig copy$default(OfflineQwen3AsrModelConfig offlineQwen3AsrModelConfig, String str, String str2, String str3, String str4, int i, int i2, float f, float f2, int i3, String str5, int i4, Object obj) {
/* 3 */             if ((i4 & 1) != 0) {
/* 5 */                 str = offlineQwen3AsrModelConfig.convFrontend;
                    }
/* 9 */             if ((i4 & 2) != 0) {
/* 11 */                str2 = offlineQwen3AsrModelConfig.encoder;
                    }
/* 15 */            if ((i4 & 4) != 0) {
/* 17 */                str3 = offlineQwen3AsrModelConfig.decoder;
                    }
/* 21 */            if ((i4 & 8) != 0) {
/* 23 */                str4 = offlineQwen3AsrModelConfig.tokenizer;
                    }
/* 27 */            if ((i4 & 16) != 0) {
/* 29 */                i = offlineQwen3AsrModelConfig.maxTotalLen;
                    }
/* 33 */            if ((i4 & 32) != 0) {
/* 35 */                i2 = offlineQwen3AsrModelConfig.maxNewTokens;
                    }
/* 39 */            if ((i4 & 64) != 0) {
/* 41 */                f = offlineQwen3AsrModelConfig.temperature;
                    }
/* 45 */            if ((i4 & Barcode.FORMAT_ITF) != 0) {
/* 47 */                f2 = offlineQwen3AsrModelConfig.topP;
                    }
/* 51 */            if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
/* 53 */                i3 = offlineQwen3AsrModelConfig.seed;
                    }
/* 57 */            if ((i4 & Barcode.FORMAT_UPC_A) != 0) {
/* 59 */                str5 = offlineQwen3AsrModelConfig.hotwords;
                    }
/* 61 */            int i5 = i3;
/* 62 */            String str6 = str5;
/* 63 */            float f3 = f;
/* 64 */            float f4 = f2;
/* 65 */            int i6 = i;
/* 66 */            int i7 = i2;
/* 72 */            return offlineQwen3AsrModelConfig.copy(str, str2, str3, str4, i6, i7, f3, f4, i5, str6);
                }

                public final String getConvFrontend() {
/* 1 */             return this.convFrontend;
                }

                public final String getHotwords() {
/* 1 */             return this.hotwords;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getTokenizer() {
/* 1 */             return this.tokenizer;
                }

                public final int getMaxTotalLen() {
/* 1 */             return this.maxTotalLen;
                }

                public final int getMaxNewTokens() {
/* 1 */             return this.maxNewTokens;
                }

                public final float getTemperature() {
/* 1 */             return this.temperature;
                }

                public final float getTopP() {
/* 1 */             return this.topP;
                }

                public final int getSeed() {
/* 1 */             return this.seed;
                }

                public final OfflineQwen3AsrModelConfig copy(String convFrontend, String encoder, String decoder, String tokenizer, int maxTotalLen, int maxNewTokens, float temperature, float topP, int seed, String hotwords) {
/* 3 */             return new OfflineQwen3AsrModelConfig(convFrontend, encoder, decoder, tokenizer, maxTotalLen, maxNewTokens, temperature, topP, seed, hotwords);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineQwen3AsrModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineQwen3AsrModelConfig offlineQwen3AsrModelConfig = (OfflineQwen3AsrModelConfig) other;
                    return O0000Ioio00.I0000O(this.convFrontend, offlineQwen3AsrModelConfig.convFrontend) && O0000Ioio00.I0000O(this.encoder, offlineQwen3AsrModelConfig.encoder) && O0000Ioio00.I0000O(this.decoder, offlineQwen3AsrModelConfig.decoder) && O0000Ioio00.I0000O(this.tokenizer, offlineQwen3AsrModelConfig.tokenizer) && this.maxTotalLen == offlineQwen3AsrModelConfig.maxTotalLen && this.maxNewTokens == offlineQwen3AsrModelConfig.maxNewTokens && Float.compare(this.temperature, offlineQwen3AsrModelConfig.temperature) == 0 && Float.compare(this.topP, offlineQwen3AsrModelConfig.topP) == 0 && this.seed == offlineQwen3AsrModelConfig.seed && O0000Ioio00.I0000O(this.hotwords, offlineQwen3AsrModelConfig.hotwords);
                }

                public final String getConvFrontend() {
/* 1 */             return this.convFrontend;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getHotwords() {
/* 1 */             return this.hotwords;
                }

                public final int getMaxNewTokens() {
/* 1 */             return this.maxNewTokens;
                }

                public final int getMaxTotalLen() {
/* 1 */             return this.maxTotalLen;
                }

                public final int getSeed() {
/* 1 */             return this.seed;
                }

                public final float getTemperature() {
/* 1 */             return this.temperature;
                }

                public final String getTokenizer() {
/* 1 */             return this.tokenizer;
                }

                public final float getTopP() {
/* 1 */             return this.topP;
                }

                public int hashCode() {
/* 64 */            return this.hotwords.hashCode() + IIl001iO0Io.I0000O(this.seed, OooioIOo1.I0000O(OooioIOo1.I0000O(IIl001iO0Io.I0000O(this.maxNewTokens, IIl001iO0Io.I0000O(this.maxTotalLen, Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.convFrontend.hashCode() * 31, 31, this.encoder), 31, this.decoder), 31, this.tokenizer), 31), 31), 31, this.temperature), 31, this.topP), 31);
                }

                public final void setConvFrontend(String str) {
/* 1 */             this.convFrontend = str;
                }

                public final void setDecoder(String str) {
/* 1 */             this.decoder = str;
                }

                public final void setEncoder(String str) {
/* 1 */             this.encoder = str;
                }

                public final void setHotwords(String str) {
/* 1 */             this.hotwords = str;
                }

                public final void setMaxNewTokens(int i) {
/* 1 */             this.maxNewTokens = i;
                }

                public final void setMaxTotalLen(int i) {
/* 1 */             this.maxTotalLen = i;
                }

                public final void setSeed(int i) {
/* 1 */             this.seed = i;
                }

                public final void setTemperature(float f) {
/* 1 */             this.temperature = f;
                }

                public final void setTokenizer(String str) {
/* 1 */             this.tokenizer = str;
                }

                public final void setTopP(float f) {
/* 1 */             this.topP = f;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OfflineQwen3AsrModelConfig(convFrontend=");
/* 10 */            sb.append(this.convFrontend);
/* 15 */            sb.append(", encoder=");
/* 20 */            sb.append(this.encoder);
/* 25 */            sb.append(", decoder=");
/* 30 */            sb.append(this.decoder);
/* 35 */            sb.append(", tokenizer=");
/* 40 */            sb.append(this.tokenizer);
/* 45 */            sb.append(", maxTotalLen=");
/* 50 */            sb.append(this.maxTotalLen);
/* 55 */            sb.append(", maxNewTokens=");
/* 60 */            sb.append(this.maxNewTokens);
/* 65 */            sb.append(", temperature=");
/* 70 */            sb.append(this.temperature);
/* 75 */            sb.append(", topP=");
/* 80 */            sb.append(this.topP);
/* 85 */            sb.append(", seed=");
/* 90 */            sb.append(this.seed);
/* 95 */            sb.append(", hotwords=");
/* 102 */           return IlIi0I0.I000oI1ioi(sb, this.hotwords, ')');
                }

/* 63 */        public OfflineQwen3AsrModelConfig(String str, String str2, String str3, String str4, int i, int i2, float f, float f2, int i3, String str5) {
/* 65 */            this.convFrontend = str;
/* 66 */            this.encoder = str2;
/* 67 */            this.decoder = str3;
/* 68 */            this.tokenizer = str4;
/* 69 */            this.maxTotalLen = i;
/* 70 */            this.maxNewTokens = i2;
/* 71 */            this.temperature = f;
/* 72 */            this.topP = f2;
/* 73 */            this.seed = i3;
/* 74 */            this.hotwords = str5;
                }

/* 74 */        public OfflineQwen3AsrModelConfig() {
/* 75 */            this(null, null, null, null, 0, 0, 0.0f, 0.0f, 0, null, 1023, null);
                }
            }
