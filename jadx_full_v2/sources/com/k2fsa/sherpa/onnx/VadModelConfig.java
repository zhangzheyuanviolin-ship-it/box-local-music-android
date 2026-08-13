            package com.k2fsa.sherpa.onnx;

            import com.google.ai.edge.gallery.whisper.WhisperEngine;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003JE\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\t\u0010.\u001a\u00020\nHÖ\u0001R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006/"}, d2 = {"Lcom/k2fsa/sherpa/onnx/VadModelConfig;", "", "sileroVadModelConfig", "Lcom/k2fsa/sherpa/onnx/SileroVadModelConfig;", "tenVadModelConfig", "Lcom/k2fsa/sherpa/onnx/TenVadModelConfig;", "sampleRate", "", "numThreads", "provider", "", "debug", "", "(Lcom/k2fsa/sherpa/onnx/SileroVadModelConfig;Lcom/k2fsa/sherpa/onnx/TenVadModelConfig;IILjava/lang/String;Z)V", "getDebug", "()Z", "setDebug", "(Z)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getProvider", "()Ljava/lang/String;", "setProvider", "(Ljava/lang/String;)V", "getSampleRate", "setSampleRate", "getSileroVadModelConfig", "()Lcom/k2fsa/sherpa/onnx/SileroVadModelConfig;", "setSileroVadModelConfig", "(Lcom/k2fsa/sherpa/onnx/SileroVadModelConfig;)V", "getTenVadModelConfig", "()Lcom/k2fsa/sherpa/onnx/TenVadModelConfig;", "setTenVadModelConfig", "(Lcom/k2fsa/sherpa/onnx/TenVadModelConfig;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 78 */    public final class VadModelConfig {
                private boolean debug;
                private int numThreads;
                private String provider;
                private int sampleRate;
                private SileroVadModelConfig sileroVadModelConfig;
                private TenVadModelConfig tenVadModelConfig;

                public VadModelConfig(SileroVadModelConfig sileroVadModelConfig, TenVadModelConfig tenVadModelConfig, int i, int i2, String str, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
/* 76 */            this((i3 & 1) != 0 ? new SileroVadModelConfig(null, 0.0f, 0.0f, 0.0f, 0, 0.0f, 63, null) : sileroVadModelConfig, (i3 & 2) != 0 ? new TenVadModelConfig(null, 0.0f, 0.0f, 0.0f, 0, 0.0f, 63, null) : tenVadModelConfig, (i3 & 4) != 0 ? WhisperEngine.SAMPLE_RATE : i, (i3 & 8) != 0 ? 1 : i2, (i3 & 16) != 0 ? "cpu" : str, (i3 & 32) != 0 ? false : z);
                }

                public static VadModelConfig copy$default(VadModelConfig vadModelConfig, SileroVadModelConfig sileroVadModelConfig, TenVadModelConfig tenVadModelConfig, int i, int i2, String str, boolean z, int i3, Object obj) {
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 sileroVadModelConfig = vadModelConfig.sileroVadModelConfig;
                    }
/* 9 */             if ((i3 & 2) != 0) {
/* 11 */                tenVadModelConfig = vadModelConfig.tenVadModelConfig;
                    }
/* 15 */            if ((i3 & 4) != 0) {
/* 17 */                i = vadModelConfig.sampleRate;
                    }
/* 21 */            if ((i3 & 8) != 0) {
/* 23 */                i2 = vadModelConfig.numThreads;
                    }
/* 27 */            if ((i3 & 16) != 0) {
/* 29 */                str = vadModelConfig.provider;
                    }
/* 33 */            if ((i3 & 32) != 0) {
/* 35 */                z = vadModelConfig.debug;
                    }
/* 37 */            String str2 = str;
/* 38 */            boolean z2 = z;
/* 44 */            return vadModelConfig.copy(sileroVadModelConfig, tenVadModelConfig, i, i2, str2, z2);
                }

                public final SileroVadModelConfig getSileroVadModelConfig() {
/* 1 */             return this.sileroVadModelConfig;
                }

                public final TenVadModelConfig getTenVadModelConfig() {
/* 1 */             return this.tenVadModelConfig;
                }

                public final int getSampleRate() {
/* 1 */             return this.sampleRate;
                }

                public final int getNumThreads() {
/* 1 */             return this.numThreads;
                }

                public final String getProvider() {
/* 1 */             return this.provider;
                }

                public final boolean getDebug() {
/* 1 */             return this.debug;
                }

                public final VadModelConfig copy(SileroVadModelConfig sileroVadModelConfig, TenVadModelConfig tenVadModelConfig, int sampleRate, int numThreads, String provider, boolean debug) {
/* 3 */             return new VadModelConfig(sileroVadModelConfig, tenVadModelConfig, sampleRate, numThreads, provider, debug);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof VadModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            VadModelConfig vadModelConfig = (VadModelConfig) other;
                    return O0000Ioio00.I0000O(this.sileroVadModelConfig, vadModelConfig.sileroVadModelConfig) && O0000Ioio00.I0000O(this.tenVadModelConfig, vadModelConfig.tenVadModelConfig) && this.sampleRate == vadModelConfig.sampleRate && this.numThreads == vadModelConfig.numThreads && O0000Ioio00.I0000O(this.provider, vadModelConfig.provider) && this.debug == vadModelConfig.debug;
                }

                public final boolean getDebug() {
/* 1 */             return this.debug;
                }

                public final int getNumThreads() {
/* 1 */             return this.numThreads;
                }

                public final String getProvider() {
/* 1 */             return this.provider;
                }

                public final int getSampleRate() {
/* 1 */             return this.sampleRate;
                }

                public final SileroVadModelConfig getSileroVadModelConfig() {
/* 1 */             return this.sileroVadModelConfig;
                }

                public final TenVadModelConfig getTenVadModelConfig() {
/* 1 */             return this.tenVadModelConfig;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 32 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(IIl001iO0Io.I0000O(this.numThreads, IIl001iO0Io.I0000O(this.sampleRate, (this.tenVadModelConfig.hashCode() + (this.sileroVadModelConfig.hashCode() * 31)) * 31, 31), 31), 31, this.provider);
/* 36 */            boolean z = this.debug;
                    int i = z;
/* 38 */            if (z != 0) {
/* 40 */                i = 1;
                    }
/* 41 */            return iI000O01llI0 + i;
                }

                public final void setDebug(boolean z) {
/* 1 */             this.debug = z;
                }

                public final void setNumThreads(int i) {
/* 1 */             this.numThreads = i;
                }

                public final void setProvider(String str) {
/* 1 */             this.provider = str;
                }

                public final void setSampleRate(int i) {
/* 1 */             this.sampleRate = i;
                }

                public final void setSileroVadModelConfig(SileroVadModelConfig sileroVadModelConfig) {
/* 1 */             this.sileroVadModelConfig = sileroVadModelConfig;
                }

                public final void setTenVadModelConfig(TenVadModelConfig tenVadModelConfig) {
/* 1 */             this.tenVadModelConfig = tenVadModelConfig;
                }

                public String toString() {
/* 68 */            return "VadModelConfig(sileroVadModelConfig=" + this.sileroVadModelConfig + ", tenVadModelConfig=" + this.tenVadModelConfig + ", sampleRate=" + this.sampleRate + ", numThreads=" + this.numThreads + ", provider=" + this.provider + ", debug=" + this.debug + ')';
                }

/* 79 */        public VadModelConfig(SileroVadModelConfig sileroVadModelConfig, TenVadModelConfig tenVadModelConfig, int i, int i2, String str, boolean z) {
/* 81 */            this.sileroVadModelConfig = sileroVadModelConfig;
/* 82 */            this.tenVadModelConfig = tenVadModelConfig;
/* 83 */            this.sampleRate = i;
/* 84 */            this.numThreads = i2;
/* 85 */            this.provider = str;
/* 86 */            this.debug = z;
                }

/* 86 */        public VadModelConfig() {
/* 87 */            this(null, null, 0, 0, null, false, 63, null);
                }
            }
