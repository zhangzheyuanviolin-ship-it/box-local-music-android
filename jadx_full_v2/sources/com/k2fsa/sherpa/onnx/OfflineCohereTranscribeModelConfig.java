            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006#"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineCohereTranscribeModelConfig;", "", "encoder", "", "decoder", "language", "usePunct", "", "useItn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getDecoder", "()Ljava/lang/String;", "setDecoder", "(Ljava/lang/String;)V", "getEncoder", "setEncoder", "getLanguage", "setLanguage", "getUseItn", "()Z", "setUseItn", "(Z)V", "getUsePunct", "setUsePunct", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 31 */    public final class OfflineCohereTranscribeModelConfig {
                private String decoder;
                private String encoder;
                private String language;
                private boolean useItn;
                private boolean usePunct;

                public OfflineCohereTranscribeModelConfig(String str, String str2, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 29 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2);
                }

                public static OfflineCohereTranscribeModelConfig copy$default(OfflineCohereTranscribeModelConfig offlineCohereTranscribeModelConfig, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = offlineCohereTranscribeModelConfig.encoder;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = offlineCohereTranscribeModelConfig.decoder;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = offlineCohereTranscribeModelConfig.language;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                z = offlineCohereTranscribeModelConfig.usePunct;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                z2 = offlineCohereTranscribeModelConfig.useItn;
                    }
/* 32 */            boolean z3 = z2;
/* 34 */            String str4 = str3;
/* 37 */            return offlineCohereTranscribeModelConfig.copy(str, str2, str4, z, z3);
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getLanguage() {
/* 1 */             return this.language;
                }

                public final boolean getUsePunct() {
/* 1 */             return this.usePunct;
                }

                public final boolean getUseItn() {
/* 1 */             return this.useItn;
                }

                public final OfflineCohereTranscribeModelConfig copy(String encoder, String decoder, String language, boolean usePunct, boolean useItn) {
/* 3 */             return new OfflineCohereTranscribeModelConfig(encoder, decoder, language, usePunct, useItn);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineCohereTranscribeModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineCohereTranscribeModelConfig offlineCohereTranscribeModelConfig = (OfflineCohereTranscribeModelConfig) other;
                    return O0000Ioio00.I0000O(this.encoder, offlineCohereTranscribeModelConfig.encoder) && O0000Ioio00.I0000O(this.decoder, offlineCohereTranscribeModelConfig.decoder) && O0000Ioio00.I0000O(this.language, offlineCohereTranscribeModelConfig.language) && this.usePunct == offlineCohereTranscribeModelConfig.usePunct && this.useItn == offlineCohereTranscribeModelConfig.useItn;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getLanguage() {
/* 1 */             return this.language;
                }

                public final boolean getUseItn() {
/* 1 */             return this.useItn;
                }

                public final boolean getUsePunct() {
/* 1 */             return this.usePunct;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 18 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.encoder.hashCode() * 31, 31, this.decoder), 31, this.language);
/* 22 */            boolean z = this.usePunct;
                    int i = z;
/* 25 */            if (z != 0) {
/* 27 */                i = 1;
                    }
/* 29 */            int i2 = (iI000O01llI0 + i) * 31;
/* 30 */            boolean z2 = this.useItn;
/* 36 */            return i2 + (z2 ? 1 : z2 ? 1 : 0);
                }

                public final void setDecoder(String str) {
/* 1 */             this.decoder = str;
                }

                public final void setEncoder(String str) {
/* 1 */             this.encoder = str;
                }

                public final void setLanguage(String str) {
/* 1 */             this.language = str;
                }

                public final void setUseItn(boolean z) {
/* 1 */             this.useItn = z;
                }

                public final void setUsePunct(boolean z) {
/* 1 */             this.usePunct = z;
                }

                public String toString() {
/* 58 */            return "OfflineCohereTranscribeModelConfig(encoder=" + this.encoder + ", decoder=" + this.decoder + ", language=" + this.language + ", usePunct=" + this.usePunct + ", useItn=" + this.useItn + ')';
                }

/* 32 */        public OfflineCohereTranscribeModelConfig(String str, String str2, String str3, boolean z, boolean z2) {
/* 34 */            this.encoder = str;
/* 35 */            this.decoder = str2;
/* 36 */            this.language = str3;
/* 37 */            this.usePunct = z;
/* 38 */            this.useItn = z2;
                }

/* 38 */        public OfflineCohereTranscribeModelConfig() {
/* 39 */            this(null, null, null, false, false, 31, null);
                }
            }
