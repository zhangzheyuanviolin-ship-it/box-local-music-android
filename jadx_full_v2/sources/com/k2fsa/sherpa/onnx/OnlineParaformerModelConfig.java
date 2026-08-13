            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlineParaformerModelConfig;", "", "encoder", "", "decoder", "(Ljava/lang/String;Ljava/lang/String;)V", "getDecoder", "()Ljava/lang/String;", "setDecoder", "(Ljava/lang/String;)V", "getEncoder", "setEncoder", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 15 */    public final class OnlineParaformerModelConfig {
                private String decoder;
                private String encoder;

                public OnlineParaformerModelConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 13 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
                }

                public static OnlineParaformerModelConfig copy$default(OnlineParaformerModelConfig onlineParaformerModelConfig, String str, String str2, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = onlineParaformerModelConfig.encoder;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = onlineParaformerModelConfig.decoder;
                    }
/* 13 */            return onlineParaformerModelConfig.copy(str, str2);
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final OnlineParaformerModelConfig copy(String encoder, String decoder) {
/* 3 */             return new OnlineParaformerModelConfig(encoder, decoder);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OnlineParaformerModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OnlineParaformerModelConfig onlineParaformerModelConfig = (OnlineParaformerModelConfig) other;
                    return O0000Ioio00.I0000O(this.encoder, onlineParaformerModelConfig.encoder) && O0000Ioio00.I0000O(this.decoder, onlineParaformerModelConfig.decoder);
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public int hashCode() {
/* 15 */            return this.decoder.hashCode() + (this.encoder.hashCode() * 31);
                }

                public final void setDecoder(String str) {
/* 1 */             this.decoder = str;
                }

                public final void setEncoder(String str) {
/* 1 */             this.encoder = str;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OnlineParaformerModelConfig(encoder=");
/* 10 */            sb.append(this.encoder);
/* 15 */            sb.append(", decoder=");
/* 22 */            return IlIi0I0.I000oI1ioi(sb, this.decoder, ')');
                }

/* 16 */        public OnlineParaformerModelConfig(String str, String str2) {
/* 18 */            this.encoder = str;
/* 19 */            this.decoder = str2;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 19 */        public OnlineParaformerModelConfig() {
/* 20 */            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }
            }
