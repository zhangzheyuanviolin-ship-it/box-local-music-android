            package com.google.ai.edge.litertlm;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.IIlIOloOOO;
            
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/google/ai/edge/litertlm/SamplerConfig;", "", "topK", "", "topP", "", "temperature", "seed", "<init>", "(IDDI)V", "getTopK", "()I", "getTopP", "()D", "getTemperature", "getSeed", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 96 */    public final class SamplerConfig {
                private final int seed;
                private final double temperature;
                private final int topK;
                private final double topP;

                public SamplerConfig(int i, double d, double d2, int i2) {
/* 4 */             this.topK = i;
/* 6 */             this.topP = d;
/* 8 */             this.temperature = d2;
/* 10 */            this.seed = i2;
/* 14 */            if (i <= 0) {
/* 93 */                I000II.I0010I0i(IIlIOloOOO.I00100l0("topK should be positive, but got ", i, "."));
/* 204 */               throw null;
                    }
/* 20 */            if (d < 0.0d || d > 1.0d) {
/* 86 */                throw new IllegalArgumentException(("topP should between 0 and 1 inclusively, but got " + d + ".").toString());
                    }
/* 30 */            if (d2 >= 0.0d) {
/* 32 */                return;
                    }
/* 59 */            throw new IllegalArgumentException(("temperature should be non-negative, but got " + d2 + ".").toString());
                }

                public static SamplerConfig copy$default(SamplerConfig samplerConfig, int i, double d, double d2, int i2, int i3, Object obj) {
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 i = samplerConfig.topK;
                    }
/* 9 */             if ((i3 & 2) != 0) {
/* 11 */                d = samplerConfig.topP;
                    }
/* 15 */            if ((i3 & 4) != 0) {
/* 17 */                d2 = samplerConfig.temperature;
                    }
/* 21 */            if ((i3 & 8) != 0) {
/* 23 */                i2 = samplerConfig.seed;
                    }
/* 25 */            int i4 = i2;
/* 30 */            return samplerConfig.copy(i, d, d2, i4);
                }

                public final int getTopK() {
/* 1 */             return this.topK;
                }

                public final double getTopP() {
/* 1 */             return this.topP;
                }

                public final double getTemperature() {
/* 1 */             return this.temperature;
                }

                public final int getSeed() {
/* 1 */             return this.seed;
                }

                public final SamplerConfig copy(int topK, double topP, double temperature, int seed) {
/* 3 */             return new SamplerConfig(topK, topP, temperature, seed);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof SamplerConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            SamplerConfig samplerConfig = (SamplerConfig) other;
                    return this.topK == samplerConfig.topK && Double.compare(this.topP, samplerConfig.topP) == 0 && Double.compare(this.temperature, samplerConfig.temperature) == 0 && this.seed == samplerConfig.seed;
                }

                public final int getSeed() {
/* 1 */             return this.seed;
                }

                public final double getTemperature() {
/* 1 */             return this.temperature;
                }

                public final int getTopK() {
/* 1 */             return this.topK;
                }

                public final double getTopP() {
/* 1 */             return this.topP;
                }

                public int hashCode() {
/* 33 */            return Integer.hashCode(this.seed) + ((Double.hashCode(this.temperature) + ((Double.hashCode(this.topP) + (Integer.hashCode(this.topK) * 31)) * 31)) * 31);
                }

                public String toString() {
/* 1 */             int i = this.topK;
/* 3 */             double d = this.topP;
/* 5 */             double d2 = this.temperature;
/* 7 */             int i2 = this.seed;
/* 13 */            StringBuilder sb = new StringBuilder("SamplerConfig(topK=");
/* 16 */            sb.append(i);
/* 21 */            sb.append(", topP=");
/* 24 */            sb.append(d);
/* 29 */            sb.append(", temperature=");
/* 32 */            sb.append(d2);
/* 37 */            sb.append(", seed=");
/* 42 */            return IIl001iO0Io.I000lI(i2, ")", sb);
                }

/* 97 */        public SamplerConfig(int i, double d, double d2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
/* 98 */            this(i, d, d2, (i3 & 8) != 0 ? 0 : i2);
                }
            }
