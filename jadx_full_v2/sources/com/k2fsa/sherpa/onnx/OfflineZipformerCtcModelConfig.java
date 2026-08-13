            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineZipformerCtcModelConfig;", "", "model", "", "qnnConfig", "Lcom/k2fsa/sherpa/onnx/QnnConfig;", "(Ljava/lang/String;Lcom/k2fsa/sherpa/onnx/QnnConfig;)V", "getModel", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "getQnnConfig", "()Lcom/k2fsa/sherpa/onnx/QnnConfig;", "setQnnConfig", "(Lcom/k2fsa/sherpa/onnx/QnnConfig;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 24 */    public final class OfflineZipformerCtcModelConfig {
                private String model;
                private QnnConfig qnnConfig;

                public OfflineZipformerCtcModelConfig(String str, QnnConfig qnnConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 22 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new QnnConfig(null, null, null, 7, null) : qnnConfig);
                }

                public static OfflineZipformerCtcModelConfig copy$default(OfflineZipformerCtcModelConfig offlineZipformerCtcModelConfig, String str, QnnConfig qnnConfig, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = offlineZipformerCtcModelConfig.model;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                qnnConfig = offlineZipformerCtcModelConfig.qnnConfig;
                    }
/* 13 */            return offlineZipformerCtcModelConfig.copy(str, qnnConfig);
                }

                public final String getModel() {
/* 1 */             return this.model;
                }

                public final QnnConfig getQnnConfig() {
/* 1 */             return this.qnnConfig;
                }

                public final OfflineZipformerCtcModelConfig copy(String model, QnnConfig qnnConfig) {
/* 3 */             return new OfflineZipformerCtcModelConfig(model, qnnConfig);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineZipformerCtcModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineZipformerCtcModelConfig offlineZipformerCtcModelConfig = (OfflineZipformerCtcModelConfig) other;
                    return O0000Ioio00.I0000O(this.model, offlineZipformerCtcModelConfig.model) && O0000Ioio00.I0000O(this.qnnConfig, offlineZipformerCtcModelConfig.qnnConfig);
                }

                public final String getModel() {
/* 1 */             return this.model;
                }

                public final QnnConfig getQnnConfig() {
/* 1 */             return this.qnnConfig;
                }

                public int hashCode() {
/* 15 */            return this.qnnConfig.hashCode() + (this.model.hashCode() * 31);
                }

                public final void setModel(String str) {
/* 1 */             this.model = str;
                }

                public final void setQnnConfig(QnnConfig qnnConfig) {
/* 1 */             this.qnnConfig = qnnConfig;
                }

                public String toString() {
/* 28 */            return "OfflineZipformerCtcModelConfig(model=" + this.model + ", qnnConfig=" + this.qnnConfig + ')';
                }

/* 25 */        public OfflineZipformerCtcModelConfig(String str, QnnConfig qnnConfig) {
/* 27 */            this.model = str;
/* 28 */            this.qnnConfig = qnnConfig;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 28 */        public OfflineZipformerCtcModelConfig() {
/* 29 */            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }
            }
