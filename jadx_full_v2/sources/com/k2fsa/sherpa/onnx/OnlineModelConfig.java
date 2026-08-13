            package com.k2fsa.sherpa.onnx;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b?\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r¢\u0006\u0002\u0010\u0016J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\rHÆ\u0003J\t\u0010A\u001a\u00020\rHÆ\u0003J\t\u0010B\u001a\u00020\rHÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\t\u0010F\u001a\u00020\u000bHÆ\u0003J\t\u0010G\u001a\u00020\rHÆ\u0003J\t\u0010H\u001a\u00020\u000fHÆ\u0003J\t\u0010I\u001a\u00020\u0011HÆ\u0003J\t\u0010J\u001a\u00020\rHÆ\u0003J\u0081\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\rHÆ\u0001J\u0013\u0010L\u001a\u00020\u00112\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\u000fHÖ\u0001J\t\u0010O\u001a\u00020\rHÖ\u0001R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0013\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\u0014\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006P"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlineModelConfig;", "", "transducer", "Lcom/k2fsa/sherpa/onnx/OnlineTransducerModelConfig;", "paraformer", "Lcom/k2fsa/sherpa/onnx/OnlineParaformerModelConfig;", "zipformer2Ctc", "Lcom/k2fsa/sherpa/onnx/OnlineZipformer2CtcModelConfig;", "neMoCtc", "Lcom/k2fsa/sherpa/onnx/OnlineNeMoCtcModelConfig;", "toneCtc", "Lcom/k2fsa/sherpa/onnx/OnlineToneCtcModelConfig;", "tokens", "", "numThreads", "", "debug", "", "provider", "modelType", "modelingUnit", "bpeVocab", "(Lcom/k2fsa/sherpa/onnx/OnlineTransducerModelConfig;Lcom/k2fsa/sherpa/onnx/OnlineParaformerModelConfig;Lcom/k2fsa/sherpa/onnx/OnlineZipformer2CtcModelConfig;Lcom/k2fsa/sherpa/onnx/OnlineNeMoCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OnlineToneCtcModelConfig;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBpeVocab", "()Ljava/lang/String;", "setBpeVocab", "(Ljava/lang/String;)V", "getDebug", "()Z", "setDebug", "(Z)V", "getModelType", "setModelType", "getModelingUnit", "setModelingUnit", "getNeMoCtc", "()Lcom/k2fsa/sherpa/onnx/OnlineNeMoCtcModelConfig;", "setNeMoCtc", "(Lcom/k2fsa/sherpa/onnx/OnlineNeMoCtcModelConfig;)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getParaformer", "()Lcom/k2fsa/sherpa/onnx/OnlineParaformerModelConfig;", "setParaformer", "(Lcom/k2fsa/sherpa/onnx/OnlineParaformerModelConfig;)V", "getProvider", "setProvider", "getTokens", "setTokens", "getToneCtc", "()Lcom/k2fsa/sherpa/onnx/OnlineToneCtcModelConfig;", "setToneCtc", "(Lcom/k2fsa/sherpa/onnx/OnlineToneCtcModelConfig;)V", "getTransducer", "()Lcom/k2fsa/sherpa/onnx/OnlineTransducerModelConfig;", "setTransducer", "(Lcom/k2fsa/sherpa/onnx/OnlineTransducerModelConfig;)V", "getZipformer2Ctc", "()Lcom/k2fsa/sherpa/onnx/OnlineZipformer2CtcModelConfig;", "setZipformer2Ctc", "(Lcom/k2fsa/sherpa/onnx/OnlineZipformer2CtcModelConfig;)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 7 */     public final class OnlineModelConfig {
                private String bpeVocab;
                private boolean debug;
                private String modelType;
                private String modelingUnit;
                private OnlineNeMoCtcModelConfig neMoCtc;
                private int numThreads;
                private OnlineParaformerModelConfig paraformer;
                private String provider;
                private String tokens;
                private OnlineToneCtcModelConfig toneCtc;
                private OnlineTransducerModelConfig transducer;
                private OnlineZipformer2CtcModelConfig zipformer2Ctc;

                /* JADX WARN: Illegal instructions before constructor call */
                /* JADX WARN: Multi-variable type inference failed */
                public OnlineModelConfig(OnlineTransducerModelConfig onlineTransducerModelConfig, OnlineParaformerModelConfig onlineParaformerModelConfig, OnlineZipformer2CtcModelConfig onlineZipformer2CtcModelConfig, OnlineNeMoCtcModelConfig onlineNeMoCtcModelConfig, OnlineToneCtcModelConfig onlineToneCtcModelConfig, String str, int i, boolean z, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 8 */             this((i2 & 1) != 0 ? new OnlineTransducerModelConfig(null, null, null, 7, null) : onlineTransducerModelConfig, (i2 & 2) != 0 ? new OnlineParaformerModelConfig(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : onlineParaformerModelConfig, (i2 & 4) != 0 ? new OnlineZipformer2CtcModelConfig(0 == true ? 1 : 0, i, 0 == true ? 1 : 0) : onlineZipformer2CtcModelConfig, (i2 & 8) != 0 ? new OnlineNeMoCtcModelConfig(0 == true ? 1 : 0, i, 0 == true ? 1 : 0) : onlineNeMoCtcModelConfig, (i2 & 16) != 0 ? new OnlineToneCtcModelConfig(0 == true ? 1 : 0, i, 0 == true ? 1 : 0) : onlineToneCtcModelConfig, (i2 & 32) != 0 ? "" : str, (i2 & 64) == 0 ? i : 1, (i2 & Barcode.FORMAT_ITF) != 0 ? false : z, (i2 & Barcode.FORMAT_QR_CODE) != 0 ? "cpu" : str2, (i2 & Barcode.FORMAT_UPC_A) != 0 ? "" : str3, (i2 & Barcode.FORMAT_UPC_E) != 0 ? "" : str4, (i2 & Barcode.FORMAT_PDF417) != 0 ? "" : str5);
                }

                public static OnlineModelConfig copy$default(OnlineModelConfig onlineModelConfig, OnlineTransducerModelConfig onlineTransducerModelConfig, OnlineParaformerModelConfig onlineParaformerModelConfig, OnlineZipformer2CtcModelConfig onlineZipformer2CtcModelConfig, OnlineNeMoCtcModelConfig onlineNeMoCtcModelConfig, OnlineToneCtcModelConfig onlineToneCtcModelConfig, String str, int i, boolean z, String str2, String str3, String str4, String str5, int i2, Object obj) {
/* 1 */             if ((i2 & 1) != 0) {
                        onlineTransducerModelConfig = onlineModelConfig.transducer;
                    }
                    if ((i2 & 2) != 0) {
                        onlineParaformerModelConfig = onlineModelConfig.paraformer;
                    }
                    if ((i2 & 4) != 0) {
                        onlineZipformer2CtcModelConfig = onlineModelConfig.zipformer2Ctc;
                    }
                    if ((i2 & 8) != 0) {
                        onlineNeMoCtcModelConfig = onlineModelConfig.neMoCtc;
                    }
                    if ((i2 & 16) != 0) {
                        onlineToneCtcModelConfig = onlineModelConfig.toneCtc;
                    }
                    if ((i2 & 32) != 0) {
                        str = onlineModelConfig.tokens;
                    }
                    if ((i2 & 64) != 0) {
                        i = onlineModelConfig.numThreads;
                    }
                    if ((i2 & Barcode.FORMAT_ITF) != 0) {
                        z = onlineModelConfig.debug;
                    }
                    if ((i2 & Barcode.FORMAT_QR_CODE) != 0) {
                        str2 = onlineModelConfig.provider;
                    }
                    if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
                        str3 = onlineModelConfig.modelType;
                    }
                    if ((i2 & Barcode.FORMAT_UPC_E) != 0) {
                        str4 = onlineModelConfig.modelingUnit;
                    }
                    if ((i2 & Barcode.FORMAT_PDF417) != 0) {
                        str5 = onlineModelConfig.bpeVocab;
                    }
                    String str6 = str4;
                    String str7 = str5;
                    String str8 = str2;
                    String str9 = str3;
                    int i3 = i;
                    boolean z2 = z;
                    OnlineToneCtcModelConfig onlineToneCtcModelConfig2 = onlineToneCtcModelConfig;
                    String str10 = str;
                    return onlineModelConfig.copy(onlineTransducerModelConfig, onlineParaformerModelConfig, onlineZipformer2CtcModelConfig, onlineNeMoCtcModelConfig, onlineToneCtcModelConfig2, str10, i3, z2, str8, str9, str6, str7);
                }

                public final OnlineTransducerModelConfig getTransducer() {
/* 1 */             return this.transducer;
                }

                public final String getModelType() {
/* 1 */             return this.modelType;
                }

                public final String getModelingUnit() {
/* 1 */             return this.modelingUnit;
                }

                public final String getBpeVocab() {
/* 1 */             return this.bpeVocab;
                }

                public final OnlineParaformerModelConfig getParaformer() {
/* 1 */             return this.paraformer;
                }

                public final OnlineZipformer2CtcModelConfig getZipformer2Ctc() {
/* 1 */             return this.zipformer2Ctc;
                }

                public final OnlineNeMoCtcModelConfig getNeMoCtc() {
/* 1 */             return this.neMoCtc;
                }

                public final OnlineToneCtcModelConfig getToneCtc() {
/* 1 */             return this.toneCtc;
                }

                public final String getTokens() {
/* 1 */             return this.tokens;
                }

                public final int getNumThreads() {
/* 1 */             return this.numThreads;
                }

                public final boolean getDebug() {
/* 1 */             return this.debug;
                }

                public final String getProvider() {
/* 1 */             return this.provider;
                }

                public final OnlineModelConfig copy(OnlineTransducerModelConfig transducer, OnlineParaformerModelConfig paraformer, OnlineZipformer2CtcModelConfig zipformer2Ctc, OnlineNeMoCtcModelConfig neMoCtc, OnlineToneCtcModelConfig toneCtc, String tokens, int numThreads, boolean debug, String provider, String modelType, String modelingUnit, String bpeVocab) {
/* 3 */             return new OnlineModelConfig(transducer, paraformer, zipformer2Ctc, neMoCtc, toneCtc, tokens, numThreads, debug, provider, modelType, modelingUnit, bpeVocab);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OnlineModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OnlineModelConfig onlineModelConfig = (OnlineModelConfig) other;
                    return O0000Ioio00.I0000O(this.transducer, onlineModelConfig.transducer) && O0000Ioio00.I0000O(this.paraformer, onlineModelConfig.paraformer) && O0000Ioio00.I0000O(this.zipformer2Ctc, onlineModelConfig.zipformer2Ctc) && O0000Ioio00.I0000O(this.neMoCtc, onlineModelConfig.neMoCtc) && O0000Ioio00.I0000O(this.toneCtc, onlineModelConfig.toneCtc) && O0000Ioio00.I0000O(this.tokens, onlineModelConfig.tokens) && this.numThreads == onlineModelConfig.numThreads && this.debug == onlineModelConfig.debug && O0000Ioio00.I0000O(this.provider, onlineModelConfig.provider) && O0000Ioio00.I0000O(this.modelType, onlineModelConfig.modelType) && O0000Ioio00.I0000O(this.modelingUnit, onlineModelConfig.modelingUnit) && O0000Ioio00.I0000O(this.bpeVocab, onlineModelConfig.bpeVocab);
                }

                public final String getBpeVocab() {
/* 1 */             return this.bpeVocab;
                }

                public final boolean getDebug() {
/* 1 */             return this.debug;
                }

                public final String getModelType() {
/* 1 */             return this.modelType;
                }

                public final String getModelingUnit() {
/* 1 */             return this.modelingUnit;
                }

                public final OnlineNeMoCtcModelConfig getNeMoCtc() {
/* 1 */             return this.neMoCtc;
                }

                public final int getNumThreads() {
/* 1 */             return this.numThreads;
                }

                public final OnlineParaformerModelConfig getParaformer() {
/* 1 */             return this.paraformer;
                }

                public final String getProvider() {
/* 1 */             return this.provider;
                }

                public final String getTokens() {
/* 1 */             return this.tokens;
                }

                public final OnlineToneCtcModelConfig getToneCtc() {
/* 1 */             return this.toneCtc;
                }

                public final OnlineTransducerModelConfig getTransducer() {
/* 1 */             return this.transducer;
                }

                public final OnlineZipformer2CtcModelConfig getZipformer2Ctc() {
/* 1 */             return this.zipformer2Ctc;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 50 */            int iI0000O = IIl001iO0Io.I0000O(this.numThreads, Oi010OO0.I000O01llI0((this.toneCtc.hashCode() + ((this.neMoCtc.hashCode() + ((this.zipformer2Ctc.hashCode() + ((this.paraformer.hashCode() + (this.transducer.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.tokens), 31);
/* 54 */            boolean z = this.debug;
                    int i = z;
/* 56 */            if (z != 0) {
/* 58 */                i = 1;
                    }
/* 85 */            return this.bpeVocab.hashCode() + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0((iI0000O + i) * 31, 31, this.provider), 31, this.modelType), 31, this.modelingUnit);
                }

                public final void setBpeVocab(String str) {
/* 1 */             this.bpeVocab = str;
                }

                public final void setDebug(boolean z) {
/* 1 */             this.debug = z;
                }

                public final void setModelType(String str) {
/* 1 */             this.modelType = str;
                }

                public final void setModelingUnit(String str) {
/* 1 */             this.modelingUnit = str;
                }

                public final void setNeMoCtc(OnlineNeMoCtcModelConfig onlineNeMoCtcModelConfig) {
/* 1 */             this.neMoCtc = onlineNeMoCtcModelConfig;
                }

                public final void setNumThreads(int i) {
/* 1 */             this.numThreads = i;
                }

                public final void setParaformer(OnlineParaformerModelConfig onlineParaformerModelConfig) {
/* 1 */             this.paraformer = onlineParaformerModelConfig;
                }

                public final void setProvider(String str) {
/* 1 */             this.provider = str;
                }

                public final void setTokens(String str) {
/* 1 */             this.tokens = str;
                }

                public final void setToneCtc(OnlineToneCtcModelConfig onlineToneCtcModelConfig) {
/* 1 */             this.toneCtc = onlineToneCtcModelConfig;
                }

                public final void setTransducer(OnlineTransducerModelConfig onlineTransducerModelConfig) {
/* 1 */             this.transducer = onlineTransducerModelConfig;
                }

                public final void setZipformer2Ctc(OnlineZipformer2CtcModelConfig onlineZipformer2CtcModelConfig) {
/* 1 */             this.zipformer2Ctc = onlineZipformer2CtcModelConfig;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OnlineModelConfig(transducer=");
/* 10 */            sb.append(this.transducer);
/* 15 */            sb.append(", paraformer=");
/* 20 */            sb.append(this.paraformer);
/* 25 */            sb.append(", zipformer2Ctc=");
/* 30 */            sb.append(this.zipformer2Ctc);
/* 35 */            sb.append(", neMoCtc=");
/* 40 */            sb.append(this.neMoCtc);
/* 45 */            sb.append(", toneCtc=");
/* 50 */            sb.append(this.toneCtc);
/* 55 */            sb.append(", tokens=");
/* 60 */            sb.append(this.tokens);
/* 65 */            sb.append(", numThreads=");
/* 70 */            sb.append(this.numThreads);
/* 75 */            sb.append(", debug=");
/* 80 */            sb.append(this.debug);
/* 85 */            sb.append(", provider=");
/* 90 */            sb.append(this.provider);
/* 95 */            sb.append(", modelType=");
/* 100 */           sb.append(this.modelType);
/* 105 */           sb.append(", modelingUnit=");
/* 110 */           sb.append(this.modelingUnit);
/* 115 */           sb.append(", bpeVocab=");
/* 122 */           return IlIi0I0.I000oI1ioi(sb, this.bpeVocab, ')');
                }

/* 8 */         public OnlineModelConfig(OnlineTransducerModelConfig onlineTransducerModelConfig, OnlineParaformerModelConfig onlineParaformerModelConfig, OnlineZipformer2CtcModelConfig onlineZipformer2CtcModelConfig, OnlineNeMoCtcModelConfig onlineNeMoCtcModelConfig, OnlineToneCtcModelConfig onlineToneCtcModelConfig, String str, int i, boolean z, String str2, String str3, String str4, String str5) {
/* 10 */            this.transducer = onlineTransducerModelConfig;
/* 11 */            this.paraformer = onlineParaformerModelConfig;
/* 12 */            this.zipformer2Ctc = onlineZipformer2CtcModelConfig;
/* 13 */            this.neMoCtc = onlineNeMoCtcModelConfig;
/* 14 */            this.toneCtc = onlineToneCtcModelConfig;
/* 15 */            this.tokens = str;
/* 16 */            this.numThreads = i;
/* 17 */            this.debug = z;
/* 18 */            this.provider = str2;
/* 19 */            this.modelType = str3;
/* 20 */            this.modelingUnit = str4;
/* 21 */            this.bpeVocab = str5;
                }

/* 21 */        public OnlineModelConfig() {
/* 22 */            this(null, null, null, null, null, null, 0, false, null, null, null, null, 4095, null);
                }
            }
