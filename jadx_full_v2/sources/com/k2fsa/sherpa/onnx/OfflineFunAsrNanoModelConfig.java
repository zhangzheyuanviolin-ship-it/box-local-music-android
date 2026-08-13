            package com.k2fsa.sherpa.onnx;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            import p000.OooioIOo1;
            
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0011HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\nHÆ\u0003J\t\u0010A\u001a\u00020\fHÆ\u0003J\t\u0010B\u001a\u00020\fHÆ\u0003J\u008b\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u0010D\u001a\u00020\u00112\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\nHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017¨\u0006H"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineFunAsrNanoModelConfig;", "", "encoderAdaptor", "", "llm", "embedding", "tokenizer", "systemPrompt", "userPrompt", "maxNewTokens", "", "temperature", "", "topP", "seed", "language", "itn", "", "hotwords", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IFFILjava/lang/String;ZLjava/lang/String;)V", "getEmbedding", "()Ljava/lang/String;", "setEmbedding", "(Ljava/lang/String;)V", "getEncoderAdaptor", "setEncoderAdaptor", "getHotwords", "setHotwords", "getItn", "()Z", "setItn", "(Z)V", "getLanguage", "setLanguage", "getLlm", "setLlm", "getMaxNewTokens", "()I", "setMaxNewTokens", "(I)V", "getSeed", "setSeed", "getSystemPrompt", "setSystemPrompt", "getTemperature", "()F", "setTemperature", "(F)V", "getTokenizer", "setTokenizer", "getTopP", "setTopP", "getUserPrompt", "setUserPrompt", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 3 */     public final class OfflineFunAsrNanoModelConfig {
                private String embedding;
                private String encoderAdaptor;
                private String hotwords;
                private boolean itn;
                private String language;
                private String llm;
                private int maxNewTokens;
                private int seed;
                private String systemPrompt;
                private float temperature;
                private String tokenizer;
                private float topP;
                private String userPrompt;

                public OfflineFunAsrNanoModelConfig(String str, String str2, String str3, String str4, String str5, String str6, int i, float f, float f2, int i2, String str7, boolean z, String str8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
/* 4 */             this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "You are a helpful assistant." : str5, (i3 & 32) != 0 ? "语音转写：" : str6, (i3 & 64) != 0 ? Barcode.FORMAT_UPC_A : i, (i3 & Barcode.FORMAT_ITF) != 0 ? 1.0E-6f : f, (i3 & Barcode.FORMAT_QR_CODE) != 0 ? 0.8f : f2, (i3 & Barcode.FORMAT_UPC_A) != 0 ? 42 : i2, (i3 & Barcode.FORMAT_UPC_E) != 0 ? "" : str7, (i3 & Barcode.FORMAT_PDF417) != 0 ? true : z, (i3 & Barcode.FORMAT_AZTEC) != 0 ? "" : str8);
                }

                public static OfflineFunAsrNanoModelConfig copy$default(OfflineFunAsrNanoModelConfig offlineFunAsrNanoModelConfig, String str, String str2, String str3, String str4, String str5, String str6, int i, float f, float f2, int i2, String str7, boolean z, String str8, int i3, Object obj) {
/* 1 */             if ((i3 & 1) != 0) {
                        str = offlineFunAsrNanoModelConfig.encoderAdaptor;
                    }
                    return offlineFunAsrNanoModelConfig.copy(str, (i3 & 2) != 0 ? offlineFunAsrNanoModelConfig.llm : str2, (i3 & 4) != 0 ? offlineFunAsrNanoModelConfig.embedding : str3, (i3 & 8) != 0 ? offlineFunAsrNanoModelConfig.tokenizer : str4, (i3 & 16) != 0 ? offlineFunAsrNanoModelConfig.systemPrompt : str5, (i3 & 32) != 0 ? offlineFunAsrNanoModelConfig.userPrompt : str6, (i3 & 64) != 0 ? offlineFunAsrNanoModelConfig.maxNewTokens : i, (i3 & Barcode.FORMAT_ITF) != 0 ? offlineFunAsrNanoModelConfig.temperature : f, (i3 & Barcode.FORMAT_QR_CODE) != 0 ? offlineFunAsrNanoModelConfig.topP : f2, (i3 & Barcode.FORMAT_UPC_A) != 0 ? offlineFunAsrNanoModelConfig.seed : i2, (i3 & Barcode.FORMAT_UPC_E) != 0 ? offlineFunAsrNanoModelConfig.language : str7, (i3 & Barcode.FORMAT_PDF417) != 0 ? offlineFunAsrNanoModelConfig.itn : z, (i3 & Barcode.FORMAT_AZTEC) != 0 ? offlineFunAsrNanoModelConfig.hotwords : str8);
                }

                public final String getEncoderAdaptor() {
/* 1 */             return this.encoderAdaptor;
                }

                public final int getSeed() {
/* 1 */             return this.seed;
                }

                public final String getLanguage() {
/* 1 */             return this.language;
                }

                public final boolean getItn() {
/* 1 */             return this.itn;
                }

                public final String getHotwords() {
/* 1 */             return this.hotwords;
                }

                public final String getLlm() {
/* 1 */             return this.llm;
                }

                public final String getEmbedding() {
/* 1 */             return this.embedding;
                }

                public final String getTokenizer() {
/* 1 */             return this.tokenizer;
                }

                public final String getSystemPrompt() {
/* 1 */             return this.systemPrompt;
                }

                public final String getUserPrompt() {
/* 1 */             return this.userPrompt;
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

                public final OfflineFunAsrNanoModelConfig copy(String encoderAdaptor, String llm, String embedding, String tokenizer, String systemPrompt, String userPrompt, int maxNewTokens, float temperature, float topP, int seed, String language, boolean itn, String hotwords) {
/* 3 */             return new OfflineFunAsrNanoModelConfig(encoderAdaptor, llm, embedding, tokenizer, systemPrompt, userPrompt, maxNewTokens, temperature, topP, seed, language, itn, hotwords);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineFunAsrNanoModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineFunAsrNanoModelConfig offlineFunAsrNanoModelConfig = (OfflineFunAsrNanoModelConfig) other;
                    return O0000Ioio00.I0000O(this.encoderAdaptor, offlineFunAsrNanoModelConfig.encoderAdaptor) && O0000Ioio00.I0000O(this.llm, offlineFunAsrNanoModelConfig.llm) && O0000Ioio00.I0000O(this.embedding, offlineFunAsrNanoModelConfig.embedding) && O0000Ioio00.I0000O(this.tokenizer, offlineFunAsrNanoModelConfig.tokenizer) && O0000Ioio00.I0000O(this.systemPrompt, offlineFunAsrNanoModelConfig.systemPrompt) && O0000Ioio00.I0000O(this.userPrompt, offlineFunAsrNanoModelConfig.userPrompt) && this.maxNewTokens == offlineFunAsrNanoModelConfig.maxNewTokens && Float.compare(this.temperature, offlineFunAsrNanoModelConfig.temperature) == 0 && Float.compare(this.topP, offlineFunAsrNanoModelConfig.topP) == 0 && this.seed == offlineFunAsrNanoModelConfig.seed && O0000Ioio00.I0000O(this.language, offlineFunAsrNanoModelConfig.language) && this.itn == offlineFunAsrNanoModelConfig.itn && O0000Ioio00.I0000O(this.hotwords, offlineFunAsrNanoModelConfig.hotwords);
                }

                public final String getEmbedding() {
/* 1 */             return this.embedding;
                }

                public final String getEncoderAdaptor() {
/* 1 */             return this.encoderAdaptor;
                }

                public final String getHotwords() {
/* 1 */             return this.hotwords;
                }

                public final boolean getItn() {
/* 1 */             return this.itn;
                }

                public final String getLanguage() {
/* 1 */             return this.language;
                }

                public final String getLlm() {
/* 1 */             return this.llm;
                }

                public final int getMaxNewTokens() {
/* 1 */             return this.maxNewTokens;
                }

                public final int getSeed() {
/* 1 */             return this.seed;
                }

                public final String getSystemPrompt() {
/* 1 */             return this.systemPrompt;
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

                public final String getUserPrompt() {
/* 1 */             return this.userPrompt;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 66 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(IIl001iO0Io.I0000O(this.seed, OooioIOo1.I0000O(OooioIOo1.I0000O(IIl001iO0Io.I0000O(this.maxNewTokens, Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.encoderAdaptor.hashCode() * 31, 31, this.llm), 31, this.embedding), 31, this.tokenizer), 31, this.systemPrompt), 31, this.userPrompt), 31), 31, this.temperature), 31, this.topP), 31), 31, this.language);
/* 70 */            boolean z = this.itn;
                    int i = z;
/* 72 */            if (z != 0) {
/* 74 */                i = 1;
                    }
/* 83 */            return this.hotwords.hashCode() + ((iI000O01llI0 + i) * 31);
                }

                public final void setEmbedding(String str) {
/* 1 */             this.embedding = str;
                }

                public final void setEncoderAdaptor(String str) {
/* 1 */             this.encoderAdaptor = str;
                }

                public final void setHotwords(String str) {
/* 1 */             this.hotwords = str;
                }

                public final void setItn(boolean z) {
/* 1 */             this.itn = z;
                }

                public final void setLanguage(String str) {
/* 1 */             this.language = str;
                }

                public final void setLlm(String str) {
/* 1 */             this.llm = str;
                }

                public final void setMaxNewTokens(int i) {
/* 1 */             this.maxNewTokens = i;
                }

                public final void setSeed(int i) {
/* 1 */             this.seed = i;
                }

                public final void setSystemPrompt(String str) {
/* 1 */             this.systemPrompt = str;
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

                public final void setUserPrompt(String str) {
/* 1 */             this.userPrompt = str;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OfflineFunAsrNanoModelConfig(encoderAdaptor=");
/* 10 */            sb.append(this.encoderAdaptor);
/* 15 */            sb.append(", llm=");
/* 20 */            sb.append(this.llm);
/* 25 */            sb.append(", embedding=");
/* 30 */            sb.append(this.embedding);
/* 35 */            sb.append(", tokenizer=");
/* 40 */            sb.append(this.tokenizer);
/* 45 */            sb.append(", systemPrompt=");
/* 50 */            sb.append(this.systemPrompt);
/* 55 */            sb.append(", userPrompt=");
/* 60 */            sb.append(this.userPrompt);
/* 65 */            sb.append(", maxNewTokens=");
/* 70 */            sb.append(this.maxNewTokens);
/* 75 */            sb.append(", temperature=");
/* 80 */            sb.append(this.temperature);
/* 85 */            sb.append(", topP=");
/* 90 */            sb.append(this.topP);
/* 95 */            sb.append(", seed=");
/* 100 */           sb.append(this.seed);
/* 105 */           sb.append(", language=");
/* 110 */           sb.append(this.language);
/* 115 */           sb.append(", itn=");
/* 120 */           sb.append(this.itn);
/* 125 */           sb.append(", hotwords=");
/* 132 */           return IlIi0I0.I000oI1ioi(sb, this.hotwords, ')');
                }

/* 4 */         public OfflineFunAsrNanoModelConfig(String str, String str2, String str3, String str4, String str5, String str6, int i, float f, float f2, int i2, String str7, boolean z, String str8) {
/* 6 */             this.encoderAdaptor = str;
/* 7 */             this.llm = str2;
/* 8 */             this.embedding = str3;
/* 9 */             this.tokenizer = str4;
/* 10 */            this.systemPrompt = str5;
/* 11 */            this.userPrompt = str6;
/* 12 */            this.maxNewTokens = i;
/* 13 */            this.temperature = f;
/* 14 */            this.topP = f2;
/* 15 */            this.seed = i2;
/* 16 */            this.language = str7;
/* 17 */            this.itn = z;
/* 18 */            this.hotwords = str8;
                }

/* 18 */        public OfflineFunAsrNanoModelConfig() {
/* 19 */            this(null, null, null, null, null, null, 0, 0.0f, 0.0f, 0, null, false, null, 8191, null);
                }
            }
