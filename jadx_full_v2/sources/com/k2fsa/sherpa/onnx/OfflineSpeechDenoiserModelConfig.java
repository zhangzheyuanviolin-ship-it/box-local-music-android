            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J;\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\t\u0010*\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006+"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserModelConfig;", "", "gtcrn", "Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserGtcrnModelConfig;", "dpdfnet", "Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserDpdfNetModelConfig;", "numThreads", "", "debug", "", "provider", "", "(Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserGtcrnModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserDpdfNetModelConfig;IZLjava/lang/String;)V", "getDebug", "()Z", "setDebug", "(Z)V", "getDpdfnet", "()Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserDpdfNetModelConfig;", "setDpdfnet", "(Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserDpdfNetModelConfig;)V", "getGtcrn", "()Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserGtcrnModelConfig;", "setGtcrn", "(Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserGtcrnModelConfig;)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getProvider", "()Ljava/lang/String;", "setProvider", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 45 */    public final class OfflineSpeechDenoiserModelConfig {
                private boolean debug;
                private OfflineSpeechDenoiserDpdfNetModelConfig dpdfnet;
                private OfflineSpeechDenoiserGtcrnModelConfig gtcrn;
                private int numThreads;
                private String provider;

                /* JADX WARN: Illegal instructions before constructor call */
                /* JADX WARN: Multi-variable type inference failed */
                public OfflineSpeechDenoiserModelConfig(OfflineSpeechDenoiserGtcrnModelConfig offlineSpeechDenoiserGtcrnModelConfig, OfflineSpeechDenoiserDpdfNetModelConfig offlineSpeechDenoiserDpdfNetModelConfig, int i, boolean z, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 4 */             int i3 = 1;
/* 43 */            this((i2 & 1) != 0 ? new OfflineSpeechDenoiserGtcrnModelConfig(null, i3, 0 == true ? 1 : 0) : offlineSpeechDenoiserGtcrnModelConfig, (i2 & 2) != 0 ? new OfflineSpeechDenoiserDpdfNetModelConfig(0 == true ? 1 : 0, i3, 0 == true ? 1 : 0) : offlineSpeechDenoiserDpdfNetModelConfig, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? "cpu" : str);
                }

                public static OfflineSpeechDenoiserModelConfig copy$default(OfflineSpeechDenoiserModelConfig offlineSpeechDenoiserModelConfig, OfflineSpeechDenoiserGtcrnModelConfig offlineSpeechDenoiserGtcrnModelConfig, OfflineSpeechDenoiserDpdfNetModelConfig offlineSpeechDenoiserDpdfNetModelConfig, int i, boolean z, String str, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 offlineSpeechDenoiserGtcrnModelConfig = offlineSpeechDenoiserModelConfig.gtcrn;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                offlineSpeechDenoiserDpdfNetModelConfig = offlineSpeechDenoiserModelConfig.dpdfnet;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                i = offlineSpeechDenoiserModelConfig.numThreads;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                z = offlineSpeechDenoiserModelConfig.debug;
                    }
/* 27 */            if ((i2 & 16) != 0) {
/* 29 */                str = offlineSpeechDenoiserModelConfig.provider;
                    }
/* 32 */            String str2 = str;
/* 34 */            int i3 = i;
/* 37 */            return offlineSpeechDenoiserModelConfig.copy(offlineSpeechDenoiserGtcrnModelConfig, offlineSpeechDenoiserDpdfNetModelConfig, i3, z, str2);
                }

                public final OfflineSpeechDenoiserGtcrnModelConfig getGtcrn() {
/* 1 */             return this.gtcrn;
                }

                public final OfflineSpeechDenoiserDpdfNetModelConfig getDpdfnet() {
/* 1 */             return this.dpdfnet;
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

                public final OfflineSpeechDenoiserModelConfig copy(OfflineSpeechDenoiserGtcrnModelConfig gtcrn, OfflineSpeechDenoiserDpdfNetModelConfig dpdfnet, int numThreads, boolean debug, String provider) {
/* 3 */             return new OfflineSpeechDenoiserModelConfig(gtcrn, dpdfnet, numThreads, debug, provider);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineSpeechDenoiserModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineSpeechDenoiserModelConfig offlineSpeechDenoiserModelConfig = (OfflineSpeechDenoiserModelConfig) other;
                    return O0000Ioio00.I0000O(this.gtcrn, offlineSpeechDenoiserModelConfig.gtcrn) && O0000Ioio00.I0000O(this.dpdfnet, offlineSpeechDenoiserModelConfig.dpdfnet) && this.numThreads == offlineSpeechDenoiserModelConfig.numThreads && this.debug == offlineSpeechDenoiserModelConfig.debug && O0000Ioio00.I0000O(this.provider, offlineSpeechDenoiserModelConfig.provider);
                }

                public final boolean getDebug() {
/* 1 */             return this.debug;
                }

                public final OfflineSpeechDenoiserDpdfNetModelConfig getDpdfnet() {
/* 1 */             return this.dpdfnet;
                }

                public final OfflineSpeechDenoiserGtcrnModelConfig getGtcrn() {
/* 1 */             return this.gtcrn;
                }

                public final int getNumThreads() {
/* 1 */             return this.numThreads;
                }

                public final String getProvider() {
/* 1 */             return this.provider;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 20 */            int iI0000O = IIl001iO0Io.I0000O(this.numThreads, (this.dpdfnet.hashCode() + (this.gtcrn.hashCode() * 31)) * 31, 31);
/* 24 */            boolean z = this.debug;
                    int i = z;
/* 26 */            if (z != 0) {
/* 28 */                i = 1;
                    }
/* 37 */            return this.provider.hashCode() + ((iI0000O + i) * 31);
                }

                public final void setDebug(boolean z) {
/* 1 */             this.debug = z;
                }

                public final void setDpdfnet(OfflineSpeechDenoiserDpdfNetModelConfig offlineSpeechDenoiserDpdfNetModelConfig) {
/* 1 */             this.dpdfnet = offlineSpeechDenoiserDpdfNetModelConfig;
                }

                public final void setGtcrn(OfflineSpeechDenoiserGtcrnModelConfig offlineSpeechDenoiserGtcrnModelConfig) {
/* 1 */             this.gtcrn = offlineSpeechDenoiserGtcrnModelConfig;
                }

                public final void setNumThreads(int i) {
/* 1 */             this.numThreads = i;
                }

                public final void setProvider(String str) {
/* 1 */             this.provider = str;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OfflineSpeechDenoiserModelConfig(gtcrn=");
/* 10 */            sb.append(this.gtcrn);
/* 15 */            sb.append(", dpdfnet=");
/* 20 */            sb.append(this.dpdfnet);
/* 25 */            sb.append(", numThreads=");
/* 30 */            sb.append(this.numThreads);
/* 35 */            sb.append(", debug=");
/* 40 */            sb.append(this.debug);
/* 45 */            sb.append(", provider=");
/* 52 */            return IlIi0I0.I000oI1ioi(sb, this.provider, ')');
                }

/* 46 */        public OfflineSpeechDenoiserModelConfig(OfflineSpeechDenoiserGtcrnModelConfig offlineSpeechDenoiserGtcrnModelConfig, OfflineSpeechDenoiserDpdfNetModelConfig offlineSpeechDenoiserDpdfNetModelConfig, int i, boolean z, String str) {
/* 48 */            this.gtcrn = offlineSpeechDenoiserGtcrnModelConfig;
/* 49 */            this.dpdfnet = offlineSpeechDenoiserDpdfNetModelConfig;
/* 50 */            this.numThreads = i;
/* 51 */            this.debug = z;
/* 52 */            this.provider = str;
                }

/* 52 */        public OfflineSpeechDenoiserModelConfig() {
/* 53 */            this(null, null, 0, false, null, 31, null);
                }
            }
