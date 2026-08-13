            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineMoonshineModelConfig;", "", "preprocessor", "", "encoder", "uncachedDecoder", "cachedDecoder", "mergedDecoder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCachedDecoder", "()Ljava/lang/String;", "setCachedDecoder", "(Ljava/lang/String;)V", "getEncoder", "setEncoder", "getMergedDecoder", "setMergedDecoder", "getPreprocessor", "setPreprocessor", "getUncachedDecoder", "setUncachedDecoder", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 30 */    public final class OfflineMoonshineModelConfig {
                private String cachedDecoder;
                private String encoder;
                private String mergedDecoder;
                private String preprocessor;
                private String uncachedDecoder;

                public OfflineMoonshineModelConfig(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 28 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
                }

                public static OfflineMoonshineModelConfig copy$default(OfflineMoonshineModelConfig offlineMoonshineModelConfig, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = offlineMoonshineModelConfig.preprocessor;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = offlineMoonshineModelConfig.encoder;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = offlineMoonshineModelConfig.uncachedDecoder;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                str4 = offlineMoonshineModelConfig.cachedDecoder;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                str5 = offlineMoonshineModelConfig.mergedDecoder;
                    }
/* 32 */            String str6 = str5;
/* 34 */            String str7 = str3;
/* 37 */            return offlineMoonshineModelConfig.copy(str, str2, str7, str4, str6);
                }

                public final String getPreprocessor() {
/* 1 */             return this.preprocessor;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getUncachedDecoder() {
/* 1 */             return this.uncachedDecoder;
                }

                public final String getCachedDecoder() {
/* 1 */             return this.cachedDecoder;
                }

                public final String getMergedDecoder() {
/* 1 */             return this.mergedDecoder;
                }

                public final OfflineMoonshineModelConfig copy(String preprocessor, String encoder, String uncachedDecoder, String cachedDecoder, String mergedDecoder) {
/* 3 */             return new OfflineMoonshineModelConfig(preprocessor, encoder, uncachedDecoder, cachedDecoder, mergedDecoder);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineMoonshineModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineMoonshineModelConfig offlineMoonshineModelConfig = (OfflineMoonshineModelConfig) other;
                    return O0000Ioio00.I0000O(this.preprocessor, offlineMoonshineModelConfig.preprocessor) && O0000Ioio00.I0000O(this.encoder, offlineMoonshineModelConfig.encoder) && O0000Ioio00.I0000O(this.uncachedDecoder, offlineMoonshineModelConfig.uncachedDecoder) && O0000Ioio00.I0000O(this.cachedDecoder, offlineMoonshineModelConfig.cachedDecoder) && O0000Ioio00.I0000O(this.mergedDecoder, offlineMoonshineModelConfig.mergedDecoder);
                }

                public final String getCachedDecoder() {
/* 1 */             return this.cachedDecoder;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getMergedDecoder() {
/* 1 */             return this.mergedDecoder;
                }

                public final String getPreprocessor() {
/* 1 */             return this.preprocessor;
                }

                public final String getUncachedDecoder() {
/* 1 */             return this.uncachedDecoder;
                }

                public int hashCode() {
/* 34 */            return this.mergedDecoder.hashCode() + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.preprocessor.hashCode() * 31, 31, this.encoder), 31, this.uncachedDecoder), 31, this.cachedDecoder);
                }

                public final void setCachedDecoder(String str) {
/* 1 */             this.cachedDecoder = str;
                }

                public final void setEncoder(String str) {
/* 1 */             this.encoder = str;
                }

                public final void setMergedDecoder(String str) {
/* 1 */             this.mergedDecoder = str;
                }

                public final void setPreprocessor(String str) {
/* 1 */             this.preprocessor = str;
                }

                public final void setUncachedDecoder(String str) {
/* 1 */             this.uncachedDecoder = str;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OfflineMoonshineModelConfig(preprocessor=");
/* 10 */            sb.append(this.preprocessor);
/* 15 */            sb.append(", encoder=");
/* 20 */            sb.append(this.encoder);
/* 25 */            sb.append(", uncachedDecoder=");
/* 30 */            sb.append(this.uncachedDecoder);
/* 35 */            sb.append(", cachedDecoder=");
/* 40 */            sb.append(this.cachedDecoder);
/* 45 */            sb.append(", mergedDecoder=");
/* 52 */            return IlIi0I0.I000oI1ioi(sb, this.mergedDecoder, ')');
                }

/* 31 */        public OfflineMoonshineModelConfig(String str, String str2, String str3, String str4, String str5) {
/* 33 */            this.preprocessor = str;
/* 34 */            this.encoder = str2;
/* 35 */            this.uncachedDecoder = str3;
/* 36 */            this.cachedDecoder = str4;
/* 37 */            this.mergedDecoder = str5;
                }

/* 37 */        public OfflineMoonshineModelConfig() {
/* 38 */            this(null, null, null, null, null, 31, null);
                }
            }
