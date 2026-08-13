            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006!"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflinePunctuationModelConfig;", "", "ctTransformer", "", "numThreads", "", "debug", "", "provider", "(Ljava/lang/String;IZLjava/lang/String;)V", "getCtTransformer", "()Ljava/lang/String;", "setCtTransformer", "(Ljava/lang/String;)V", "getDebug", "()Z", "setDebug", "(Z)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getProvider", "setProvider", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 25 */    public final class OfflinePunctuationModelConfig {
                private String ctTransformer;
                private boolean debug;
                private int numThreads;
                private String provider;

                public OfflinePunctuationModelConfig(String str, int i, boolean z, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 23 */            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "cpu" : str2);
                }

                public static OfflinePunctuationModelConfig copy$default(OfflinePunctuationModelConfig offlinePunctuationModelConfig, String str, int i, boolean z, String str2, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 str = offlinePunctuationModelConfig.ctTransformer;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                i = offlinePunctuationModelConfig.numThreads;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                z = offlinePunctuationModelConfig.debug;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                str2 = offlinePunctuationModelConfig.provider;
                    }
/* 25 */            return offlinePunctuationModelConfig.copy(str, i, z, str2);
                }

                public final String getCtTransformer() {
/* 1 */             return this.ctTransformer;
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

                public final OfflinePunctuationModelConfig copy(String ctTransformer, int numThreads, boolean debug, String provider) {
/* 3 */             return new OfflinePunctuationModelConfig(ctTransformer, numThreads, debug, provider);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflinePunctuationModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflinePunctuationModelConfig offlinePunctuationModelConfig = (OfflinePunctuationModelConfig) other;
                    return O0000Ioio00.I0000O(this.ctTransformer, offlinePunctuationModelConfig.ctTransformer) && this.numThreads == offlinePunctuationModelConfig.numThreads && this.debug == offlinePunctuationModelConfig.debug && O0000Ioio00.I0000O(this.provider, offlinePunctuationModelConfig.provider);
                }

                public final String getCtTransformer() {
/* 1 */             return this.ctTransformer;
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
/* 12 */            int iI0000O = IIl001iO0Io.I0000O(this.numThreads, this.ctTransformer.hashCode() * 31, 31);
/* 16 */            boolean z = this.debug;
                    int i = z;
/* 18 */            if (z != 0) {
/* 20 */                i = 1;
                    }
/* 29 */            return this.provider.hashCode() + ((iI0000O + i) * 31);
                }

                public final void setCtTransformer(String str) {
/* 1 */             this.ctTransformer = str;
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
/* 5 */             StringBuilder sb = new StringBuilder("OfflinePunctuationModelConfig(ctTransformer=");
/* 10 */            sb.append(this.ctTransformer);
/* 15 */            sb.append(", numThreads=");
/* 20 */            sb.append(this.numThreads);
/* 25 */            sb.append(", debug=");
/* 30 */            sb.append(this.debug);
/* 35 */            sb.append(", provider=");
/* 42 */            return IlIi0I0.I000oI1ioi(sb, this.provider, ')');
                }

/* 26 */        public OfflinePunctuationModelConfig(String str, int i, boolean z, String str2) {
/* 28 */            this.ctTransformer = str;
/* 29 */            this.numThreads = i;
/* 30 */            this.debug = z;
/* 31 */            this.provider = str2;
                }

/* 31 */        public OfflinePunctuationModelConfig() {
/* 32 */            this(null, 0, false, null, 15, null);
                }
            }
