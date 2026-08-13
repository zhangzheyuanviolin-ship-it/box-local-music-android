            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/k2fsa/sherpa/onnx/FastClusteringConfig;", "", "numClusters", "", "threshold", "", "(IF)V", "getNumClusters", "()I", "setNumClusters", "(I)V", "getThreshold", "()F", "setThreshold", "(F)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 14 */    public final class FastClusteringConfig {
                private int numClusters;
                private float threshold;

                public FastClusteringConfig(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 12 */            this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? 0.5f : f);
                }

                public static FastClusteringConfig copy$default(FastClusteringConfig fastClusteringConfig, int i, float f, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 i = fastClusteringConfig.numClusters;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                f = fastClusteringConfig.threshold;
                    }
/* 13 */            return fastClusteringConfig.copy(i, f);
                }

                public final int getNumClusters() {
/* 1 */             return this.numClusters;
                }

                public final float getThreshold() {
/* 1 */             return this.threshold;
                }

                public final FastClusteringConfig copy(int numClusters, float threshold) {
/* 3 */             return new FastClusteringConfig(numClusters, threshold);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof FastClusteringConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            FastClusteringConfig fastClusteringConfig = (FastClusteringConfig) other;
                    return this.numClusters == fastClusteringConfig.numClusters && Float.compare(this.threshold, fastClusteringConfig.threshold) == 0;
                }

                public final int getNumClusters() {
/* 1 */             return this.numClusters;
                }

                public final float getThreshold() {
/* 1 */             return this.threshold;
                }

                public int hashCode() {
/* 15 */            return Float.hashCode(this.threshold) + (Integer.hashCode(this.numClusters) * 31);
                }

                public final void setNumClusters(int i) {
/* 1 */             this.numClusters = i;
                }

                public final void setThreshold(float f) {
/* 1 */             this.threshold = f;
                }

                public String toString() {
/* 28 */            return "FastClusteringConfig(numClusters=" + this.numClusters + ", threshold=" + this.threshold + ')';
                }

/* 15 */        public FastClusteringConfig(int i, float f) {
/* 17 */            this.numClusters = i;
/* 18 */            this.threshold = f;
                }

/* 18 */        public FastClusteringConfig() {
/* 19 */            this(0, 0.0f, 3, null);
                }
            }
