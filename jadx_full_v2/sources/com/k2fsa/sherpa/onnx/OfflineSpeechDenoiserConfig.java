            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserConfig;", "", "model", "Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserModelConfig;", "(Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserModelConfig;)V", "getModel", "()Lcom/k2fsa/sherpa/onnx/OfflineSpeechDenoiserModelConfig;", "setModel", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 21 */    public final class OfflineSpeechDenoiserConfig {
                private OfflineSpeechDenoiserModelConfig model;

                public OfflineSpeechDenoiserConfig(OfflineSpeechDenoiserModelConfig offlineSpeechDenoiserModelConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 3 */             if ((i & 1) != 0) {
/* 15 */                offlineSpeechDenoiserModelConfig = new OfflineSpeechDenoiserModelConfig(null, null, 0, false, null, 31, null);
                    }
/* 19 */            this(offlineSpeechDenoiserModelConfig);
                }

                public static OfflineSpeechDenoiserConfig copy$default(OfflineSpeechDenoiserConfig offlineSpeechDenoiserConfig, OfflineSpeechDenoiserModelConfig offlineSpeechDenoiserModelConfig, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 offlineSpeechDenoiserModelConfig = offlineSpeechDenoiserConfig.model;
                    }
/* 7 */             return offlineSpeechDenoiserConfig.copy(offlineSpeechDenoiserModelConfig);
                }

                public final OfflineSpeechDenoiserModelConfig getModel() {
/* 1 */             return this.model;
                }

                public final OfflineSpeechDenoiserConfig copy(OfflineSpeechDenoiserModelConfig model) {
/* 3 */             return new OfflineSpeechDenoiserConfig(model);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof OfflineSpeechDenoiserConfig) && O0000Ioio00.I0000O(this.model, ((OfflineSpeechDenoiserConfig) other).model);
                }

                public final OfflineSpeechDenoiserModelConfig getModel() {
/* 1 */             return this.model;
                }

                public int hashCode() {
/* 3 */             return this.model.hashCode();
                }

                public final void setModel(OfflineSpeechDenoiserModelConfig offlineSpeechDenoiserModelConfig) {
/* 1 */             this.model = offlineSpeechDenoiserModelConfig;
                }

                public String toString() {
/* 18 */            return "OfflineSpeechDenoiserConfig(model=" + this.model + ')';
                }

/* 22 */        public OfflineSpeechDenoiserConfig(OfflineSpeechDenoiserModelConfig offlineSpeechDenoiserModelConfig) {
/* 24 */            this.model = offlineSpeechDenoiserModelConfig;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 24 */        public OfflineSpeechDenoiserConfig() {
/* 25 */            this(null, 1, 0 == true ? 1 : 0);
                }
            }
