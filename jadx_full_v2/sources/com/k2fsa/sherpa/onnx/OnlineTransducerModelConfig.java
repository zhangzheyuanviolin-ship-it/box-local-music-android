            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlineTransducerModelConfig;", "", "encoder", "", "decoder", "joiner", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDecoder", "()Ljava/lang/String;", "setDecoder", "(Ljava/lang/String;)V", "getEncoder", "setEncoder", "getJoiner", "setJoiner", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 20 */    public final class OnlineTransducerModelConfig {
                private String decoder;
                private String encoder;
                private String joiner;

                public OnlineTransducerModelConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 18 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
                }

                public static OnlineTransducerModelConfig copy$default(OnlineTransducerModelConfig onlineTransducerModelConfig, String str, String str2, String str3, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = onlineTransducerModelConfig.encoder;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = onlineTransducerModelConfig.decoder;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = onlineTransducerModelConfig.joiner;
                    }
/* 19 */            return onlineTransducerModelConfig.copy(str, str2, str3);
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getJoiner() {
/* 1 */             return this.joiner;
                }

                public final OnlineTransducerModelConfig copy(String encoder, String decoder, String joiner) {
/* 3 */             return new OnlineTransducerModelConfig(encoder, decoder, joiner);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OnlineTransducerModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OnlineTransducerModelConfig onlineTransducerModelConfig = (OnlineTransducerModelConfig) other;
                    return O0000Ioio00.I0000O(this.encoder, onlineTransducerModelConfig.encoder) && O0000Ioio00.I0000O(this.decoder, onlineTransducerModelConfig.decoder) && O0000Ioio00.I0000O(this.joiner, onlineTransducerModelConfig.joiner);
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getJoiner() {
/* 1 */             return this.joiner;
                }

                public int hashCode() {
/* 22 */            return this.joiner.hashCode() + Oi010OO0.I000O01llI0(this.encoder.hashCode() * 31, 31, this.decoder);
                }

                public final void setDecoder(String str) {
/* 1 */             this.decoder = str;
                }

                public final void setEncoder(String str) {
/* 1 */             this.encoder = str;
                }

                public final void setJoiner(String str) {
/* 1 */             this.joiner = str;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OnlineTransducerModelConfig(encoder=");
/* 10 */            sb.append(this.encoder);
/* 15 */            sb.append(", decoder=");
/* 20 */            sb.append(this.decoder);
/* 25 */            sb.append(", joiner=");
/* 32 */            return IlIi0I0.I000oI1ioi(sb, this.joiner, ')');
                }

/* 21 */        public OnlineTransducerModelConfig(String str, String str2, String str3) {
/* 23 */            this.encoder = str;
/* 24 */            this.decoder = str2;
/* 25 */            this.joiner = str3;
                }

/* 25 */        public OnlineTransducerModelConfig() {
/* 26 */            this(null, null, null, 7, null);
                }
            }
