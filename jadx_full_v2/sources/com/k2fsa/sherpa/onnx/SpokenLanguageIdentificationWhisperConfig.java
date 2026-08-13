            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/k2fsa/sherpa/onnx/SpokenLanguageIdentificationWhisperConfig;", "", "encoder", "", "decoder", "tailPaddings", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getDecoder", "()Ljava/lang/String;", "setDecoder", "(Ljava/lang/String;)V", "getEncoder", "setEncoder", "getTailPaddings", "()I", "setTailPaddings", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 20 */    public final class SpokenLanguageIdentificationWhisperConfig {
                private String decoder;
                private String encoder;
                private int tailPaddings;

                public SpokenLanguageIdentificationWhisperConfig(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 18 */            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? -1 : i);
                }

                public static SpokenLanguageIdentificationWhisperConfig copy$default(SpokenLanguageIdentificationWhisperConfig spokenLanguageIdentificationWhisperConfig, String str, String str2, int i, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 str = spokenLanguageIdentificationWhisperConfig.encoder;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                str2 = spokenLanguageIdentificationWhisperConfig.decoder;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                i = spokenLanguageIdentificationWhisperConfig.tailPaddings;
                    }
/* 19 */            return spokenLanguageIdentificationWhisperConfig.copy(str, str2, i);
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final int getTailPaddings() {
/* 1 */             return this.tailPaddings;
                }

                public final SpokenLanguageIdentificationWhisperConfig copy(String encoder, String decoder, int tailPaddings) {
/* 3 */             return new SpokenLanguageIdentificationWhisperConfig(encoder, decoder, tailPaddings);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof SpokenLanguageIdentificationWhisperConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            SpokenLanguageIdentificationWhisperConfig spokenLanguageIdentificationWhisperConfig = (SpokenLanguageIdentificationWhisperConfig) other;
                    return O0000Ioio00.I0000O(this.encoder, spokenLanguageIdentificationWhisperConfig.encoder) && O0000Ioio00.I0000O(this.decoder, spokenLanguageIdentificationWhisperConfig.decoder) && this.tailPaddings == spokenLanguageIdentificationWhisperConfig.tailPaddings;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final int getTailPaddings() {
/* 1 */             return this.tailPaddings;
                }

                public int hashCode() {
/* 22 */            return Integer.hashCode(this.tailPaddings) + Oi010OO0.I000O01llI0(this.encoder.hashCode() * 31, 31, this.decoder);
                }

                public final void setDecoder(String str) {
/* 1 */             this.decoder = str;
                }

                public final void setEncoder(String str) {
/* 1 */             this.encoder = str;
                }

                public final void setTailPaddings(int i) {
/* 1 */             this.tailPaddings = i;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SpokenLanguageIdentificationWhisperConfig(encoder=");
/* 10 */            sb.append(this.encoder);
/* 15 */            sb.append(", decoder=");
/* 20 */            sb.append(this.decoder);
/* 25 */            sb.append(", tailPaddings=");
/* 32 */            return Oi010OO0.I001i1lo1io(sb, this.tailPaddings, ')');
                }

/* 21 */        public SpokenLanguageIdentificationWhisperConfig(String str, String str2, int i) {
/* 23 */            this.encoder = str;
/* 24 */            this.decoder = str2;
/* 25 */            this.tailPaddings = i;
                }

/* 25 */        public SpokenLanguageIdentificationWhisperConfig() {
/* 26 */            this(null, null, 0, 7, null);
                }
            }
