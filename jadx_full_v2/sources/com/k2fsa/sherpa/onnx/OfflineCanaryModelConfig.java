            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineCanaryModelConfig;", "", "encoder", "", "decoder", "srcLang", "tgtLang", "usePnc", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDecoder", "()Ljava/lang/String;", "setDecoder", "(Ljava/lang/String;)V", "getEncoder", "setEncoder", "getSrcLang", "setSrcLang", "getTgtLang", "setTgtLang", "getUsePnc", "()Z", "setUsePnc", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 32 */    public final class OfflineCanaryModelConfig {
                private String decoder;
                private String encoder;
                private String srcLang;
                private String tgtLang;
                private boolean usePnc;

                public OfflineCanaryModelConfig(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 30 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "en" : str3, (i & 8) != 0 ? "en" : str4, (i & 16) != 0 ? true : z);
                }

                public static OfflineCanaryModelConfig copy$default(OfflineCanaryModelConfig offlineCanaryModelConfig, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = offlineCanaryModelConfig.encoder;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = offlineCanaryModelConfig.decoder;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = offlineCanaryModelConfig.srcLang;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                str4 = offlineCanaryModelConfig.tgtLang;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                z = offlineCanaryModelConfig.usePnc;
                    }
/* 32 */            boolean z2 = z;
/* 34 */            String str5 = str3;
/* 37 */            return offlineCanaryModelConfig.copy(str, str2, str5, str4, z2);
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getSrcLang() {
/* 1 */             return this.srcLang;
                }

                public final String getTgtLang() {
/* 1 */             return this.tgtLang;
                }

                public final boolean getUsePnc() {
/* 1 */             return this.usePnc;
                }

                public final OfflineCanaryModelConfig copy(String encoder, String decoder, String srcLang, String tgtLang, boolean usePnc) {
/* 3 */             return new OfflineCanaryModelConfig(encoder, decoder, srcLang, tgtLang, usePnc);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineCanaryModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineCanaryModelConfig offlineCanaryModelConfig = (OfflineCanaryModelConfig) other;
                    return O0000Ioio00.I0000O(this.encoder, offlineCanaryModelConfig.encoder) && O0000Ioio00.I0000O(this.decoder, offlineCanaryModelConfig.decoder) && O0000Ioio00.I0000O(this.srcLang, offlineCanaryModelConfig.srcLang) && O0000Ioio00.I0000O(this.tgtLang, offlineCanaryModelConfig.tgtLang) && this.usePnc == offlineCanaryModelConfig.usePnc;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getSrcLang() {
/* 1 */             return this.srcLang;
                }

                public final String getTgtLang() {
/* 1 */             return this.tgtLang;
                }

                public final boolean getUsePnc() {
/* 1 */             return this.usePnc;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 24 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.encoder.hashCode() * 31, 31, this.decoder), 31, this.srcLang), 31, this.tgtLang);
/* 28 */            boolean z = this.usePnc;
                    int i = z;
/* 30 */            if (z != 0) {
/* 32 */                i = 1;
                    }
/* 33 */            return iI000O01llI0 + i;
                }

                public final void setDecoder(String str) {
/* 1 */             this.decoder = str;
                }

                public final void setEncoder(String str) {
/* 1 */             this.encoder = str;
                }

                public final void setSrcLang(String str) {
/* 1 */             this.srcLang = str;
                }

                public final void setTgtLang(String str) {
/* 1 */             this.tgtLang = str;
                }

                public final void setUsePnc(boolean z) {
/* 1 */             this.usePnc = z;
                }

                public String toString() {
/* 58 */            return "OfflineCanaryModelConfig(encoder=" + this.encoder + ", decoder=" + this.decoder + ", srcLang=" + this.srcLang + ", tgtLang=" + this.tgtLang + ", usePnc=" + this.usePnc + ')';
                }

/* 33 */        public OfflineCanaryModelConfig(String str, String str2, String str3, String str4, boolean z) {
/* 35 */            this.encoder = str;
/* 36 */            this.decoder = str2;
/* 37 */            this.srcLang = str3;
/* 38 */            this.tgtLang = str4;
/* 39 */            this.usePnc = z;
                }

/* 39 */        public OfflineCanaryModelConfig() {
/* 40 */            this(null, null, null, null, false, 31, null);
                }
            }
