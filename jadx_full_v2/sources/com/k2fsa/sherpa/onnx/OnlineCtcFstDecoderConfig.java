            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlineCtcFstDecoderConfig;", "", "graph", "", "maxActive", "", "(Ljava/lang/String;I)V", "getGraph", "()Ljava/lang/String;", "setGraph", "(Ljava/lang/String;)V", "getMaxActive", "()I", "setMaxActive", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 15 */    public final class OnlineCtcFstDecoderConfig {
                private String graph;
                private int maxActive;

                public OnlineCtcFstDecoderConfig(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 13 */            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 3000 : i);
                }

                public static OnlineCtcFstDecoderConfig copy$default(OnlineCtcFstDecoderConfig onlineCtcFstDecoderConfig, String str, int i, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 str = onlineCtcFstDecoderConfig.graph;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                i = onlineCtcFstDecoderConfig.maxActive;
                    }
/* 13 */            return onlineCtcFstDecoderConfig.copy(str, i);
                }

                public final String getGraph() {
/* 1 */             return this.graph;
                }

                public final int getMaxActive() {
/* 1 */             return this.maxActive;
                }

                public final OnlineCtcFstDecoderConfig copy(String graph, int maxActive) {
/* 3 */             return new OnlineCtcFstDecoderConfig(graph, maxActive);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OnlineCtcFstDecoderConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OnlineCtcFstDecoderConfig onlineCtcFstDecoderConfig = (OnlineCtcFstDecoderConfig) other;
                    return O0000Ioio00.I0000O(this.graph, onlineCtcFstDecoderConfig.graph) && this.maxActive == onlineCtcFstDecoderConfig.maxActive;
                }

                public final String getGraph() {
/* 1 */             return this.graph;
                }

                public final int getMaxActive() {
/* 1 */             return this.maxActive;
                }

                public int hashCode() {
/* 15 */            return Integer.hashCode(this.maxActive) + (this.graph.hashCode() * 31);
                }

                public final void setGraph(String str) {
/* 1 */             this.graph = str;
                }

                public final void setMaxActive(int i) {
/* 1 */             this.maxActive = i;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OnlineCtcFstDecoderConfig(graph=");
/* 10 */            sb.append(this.graph);
/* 15 */            sb.append(", maxActive=");
/* 22 */            return Oi010OO0.I001i1lo1io(sb, this.maxActive, ')');
                }

/* 16 */        public OnlineCtcFstDecoderConfig(String str, int i) {
/* 18 */            this.graph = str;
/* 19 */            this.maxActive = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 19 */        public OnlineCtcFstDecoderConfig() {
/* 20 */            this(null, 0, 3, 0 == true ? 1 : 0);
                }
            }
