            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlineLMConfig;", "", "model", "", "scale", "", "(Ljava/lang/String;F)V", "getModel", "()Ljava/lang/String;", "setModel", "(Ljava/lang/String;)V", "getScale", "()F", "setScale", "(F)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 15 */    public final class OnlineLMConfig {
                private String model;
                private float scale;

                public OnlineLMConfig(String str, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 13 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.5f : f);
                }

                public static OnlineLMConfig copy$default(OnlineLMConfig onlineLMConfig, String str, float f, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = onlineLMConfig.model;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                f = onlineLMConfig.scale;
                    }
/* 13 */            return onlineLMConfig.copy(str, f);
                }

                public final String getModel() {
/* 1 */             return this.model;
                }

                public final float getScale() {
/* 1 */             return this.scale;
                }

                public final OnlineLMConfig copy(String model, float scale) {
/* 3 */             return new OnlineLMConfig(model, scale);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OnlineLMConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OnlineLMConfig onlineLMConfig = (OnlineLMConfig) other;
                    return O0000Ioio00.I0000O(this.model, onlineLMConfig.model) && Float.compare(this.scale, onlineLMConfig.scale) == 0;
                }

                public final String getModel() {
/* 1 */             return this.model;
                }

                public final float getScale() {
/* 1 */             return this.scale;
                }

                public int hashCode() {
/* 15 */            return Float.hashCode(this.scale) + (this.model.hashCode() * 31);
                }

                public final void setModel(String str) {
/* 1 */             this.model = str;
                }

                public final void setScale(float f) {
/* 1 */             this.scale = f;
                }

                public String toString() {
/* 28 */            return "OnlineLMConfig(model=" + this.model + ", scale=" + this.scale + ')';
                }

/* 16 */        public OnlineLMConfig(String str, float f) {
/* 18 */            this.model = str;
/* 19 */            this.scale = f;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 19 */        public OnlineLMConfig() {
/* 20 */            this(null, 0.0f, 3, 0 == true ? 1 : 0);
                }
            }
