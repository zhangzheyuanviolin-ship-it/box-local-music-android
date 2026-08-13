            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006%"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlinePunctuationModelConfig;", "", "cnnBilstm", "", "bpeVocab", "numThreads", "", "debug", "", "provider", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V", "getBpeVocab", "()Ljava/lang/String;", "setBpeVocab", "(Ljava/lang/String;)V", "getCnnBilstm", "setCnnBilstm", "getDebug", "()Z", "setDebug", "(Z)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getProvider", "setProvider", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 31 */    public final class OnlinePunctuationModelConfig {
                private String bpeVocab;
                private String cnnBilstm;
                private boolean debug;
                private int numThreads;
                private String provider;

                public OnlinePunctuationModelConfig(String str, String str2, int i, boolean z, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 29 */            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? "cpu" : str3);
                }

                public static OnlinePunctuationModelConfig copy$default(OnlinePunctuationModelConfig onlinePunctuationModelConfig, String str, String str2, int i, boolean z, String str3, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 str = onlinePunctuationModelConfig.cnnBilstm;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                str2 = onlinePunctuationModelConfig.bpeVocab;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                i = onlinePunctuationModelConfig.numThreads;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                z = onlinePunctuationModelConfig.debug;
                    }
/* 27 */            if ((i2 & 16) != 0) {
/* 29 */                str3 = onlinePunctuationModelConfig.provider;
                    }
/* 32 */            String str4 = str3;
/* 34 */            int i3 = i;
/* 37 */            return onlinePunctuationModelConfig.copy(str, str2, i3, z, str4);
                }

                public final String getCnnBilstm() {
/* 1 */             return this.cnnBilstm;
                }

                public final String getBpeVocab() {
/* 1 */             return this.bpeVocab;
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

                public final OnlinePunctuationModelConfig copy(String cnnBilstm, String bpeVocab, int numThreads, boolean debug, String provider) {
/* 3 */             return new OnlinePunctuationModelConfig(cnnBilstm, bpeVocab, numThreads, debug, provider);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OnlinePunctuationModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OnlinePunctuationModelConfig onlinePunctuationModelConfig = (OnlinePunctuationModelConfig) other;
                    return O0000Ioio00.I0000O(this.cnnBilstm, onlinePunctuationModelConfig.cnnBilstm) && O0000Ioio00.I0000O(this.bpeVocab, onlinePunctuationModelConfig.bpeVocab) && this.numThreads == onlinePunctuationModelConfig.numThreads && this.debug == onlinePunctuationModelConfig.debug && O0000Ioio00.I0000O(this.provider, onlinePunctuationModelConfig.provider);
                }

                public final String getBpeVocab() {
/* 1 */             return this.bpeVocab;
                }

                public final String getCnnBilstm() {
/* 1 */             return this.cnnBilstm;
                }

                public final boolean getDebug() {
/* 1 */             return this.debug;
                }

                public final int getNumThreads() {
/* 1 */             return this.numThreads;
                }

                public final String getProvider() {
/* 1 */             return this.provider;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 18 */            int iI0000O = IIl001iO0Io.I0000O(this.numThreads, Oi010OO0.I000O01llI0(this.cnnBilstm.hashCode() * 31, 31, this.bpeVocab), 31);
/* 22 */            boolean z = this.debug;
                    int i = z;
/* 24 */            if (z != 0) {
/* 26 */                i = 1;
                    }
/* 35 */            return this.provider.hashCode() + ((iI0000O + i) * 31);
                }

                public final void setBpeVocab(String str) {
/* 1 */             this.bpeVocab = str;
                }

                public final void setCnnBilstm(String str) {
/* 1 */             this.cnnBilstm = str;
                }

                public final void setDebug(boolean z) {
/* 1 */             this.debug = z;
                }

                public final void setNumThreads(int i) {
/* 1 */             this.numThreads = i;
                }

                public final void setProvider(String str) {
/* 1 */             this.provider = str;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OnlinePunctuationModelConfig(cnnBilstm=");
/* 10 */            sb.append(this.cnnBilstm);
/* 15 */            sb.append(", bpeVocab=");
/* 20 */            sb.append(this.bpeVocab);
/* 25 */            sb.append(", numThreads=");
/* 30 */            sb.append(this.numThreads);
/* 35 */            sb.append(", debug=");
/* 40 */            sb.append(this.debug);
/* 45 */            sb.append(", provider=");
/* 52 */            return IlIi0I0.I000oI1ioi(sb, this.provider, ')');
                }

/* 32 */        public OnlinePunctuationModelConfig(String str, String str2, int i, boolean z, String str3) {
/* 34 */            this.cnnBilstm = str;
/* 35 */            this.bpeVocab = str2;
/* 36 */            this.numThreads = i;
/* 37 */            this.debug = z;
/* 38 */            this.provider = str3;
                }

/* 38 */        public OnlinePunctuationModelConfig() {
/* 39 */            this(null, null, 0, false, null, 31, null);
                }
            }
