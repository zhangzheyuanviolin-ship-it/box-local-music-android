            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlineNeMoCtcModelConfig;", "", "model", "", "(Ljava/lang/String;)V", "getModel", "()Ljava/lang/String;", "setModel", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 9 */     public final class OnlineNeMoCtcModelConfig {
                private String model;

                public OnlineNeMoCtcModelConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 7 */             this((i & 1) != 0 ? "" : str);
                }

                public static OnlineNeMoCtcModelConfig copy$default(OnlineNeMoCtcModelConfig onlineNeMoCtcModelConfig, String str, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = onlineNeMoCtcModelConfig.model;
                    }
/* 7 */             return onlineNeMoCtcModelConfig.copy(str);
                }

                public final String getModel() {
/* 1 */             return this.model;
                }

                public final OnlineNeMoCtcModelConfig copy(String model) {
/* 3 */             return new OnlineNeMoCtcModelConfig(model);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof OnlineNeMoCtcModelConfig) && O0000Ioio00.I0000O(this.model, ((OnlineNeMoCtcModelConfig) other).model);
                }

                public final String getModel() {
/* 1 */             return this.model;
                }

                public int hashCode() {
/* 3 */             return this.model.hashCode();
                }

                public final void setModel(String str) {
/* 1 */             this.model = str;
                }

                public String toString() {
/* 12 */            return IlIi0I0.I000oI1ioi(new StringBuilder("OnlineNeMoCtcModelConfig(model="), this.model, ')');
                }

/* 10 */        public OnlineNeMoCtcModelConfig(String str) {
/* 12 */            this.model = str;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 12 */        public OnlineNeMoCtcModelConfig() {
/* 13 */            this(null, 1, 0 == true ? 1 : 0);
                }
            }
