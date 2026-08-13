            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/k2fsa/sherpa/onnx/SpokenLanguageIdentificationConfig;", "", "whisper", "Lcom/k2fsa/sherpa/onnx/SpokenLanguageIdentificationWhisperConfig;", "numThreads", "", "debug", "", "provider", "", "(Lcom/k2fsa/sherpa/onnx/SpokenLanguageIdentificationWhisperConfig;IZLjava/lang/String;)V", "getDebug", "()Z", "setDebug", "(Z)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getProvider", "()Ljava/lang/String;", "setProvider", "(Ljava/lang/String;)V", "getWhisper", "()Lcom/k2fsa/sherpa/onnx/SpokenLanguageIdentificationWhisperConfig;", "setWhisper", "(Lcom/k2fsa/sherpa/onnx/SpokenLanguageIdentificationWhisperConfig;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 34 */    public final class SpokenLanguageIdentificationConfig {
                private boolean debug;
                private int numThreads;
                private String provider;
                private SpokenLanguageIdentificationWhisperConfig whisper;

                public SpokenLanguageIdentificationConfig(SpokenLanguageIdentificationWhisperConfig spokenLanguageIdentificationWhisperConfig, int i, boolean z, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 32 */            this((i2 & 1) != 0 ? new SpokenLanguageIdentificationWhisperConfig(null, null, 0, 7, null) : spokenLanguageIdentificationWhisperConfig, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "cpu" : str);
                }

                public static SpokenLanguageIdentificationConfig copy$default(SpokenLanguageIdentificationConfig spokenLanguageIdentificationConfig, SpokenLanguageIdentificationWhisperConfig spokenLanguageIdentificationWhisperConfig, int i, boolean z, String str, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 spokenLanguageIdentificationWhisperConfig = spokenLanguageIdentificationConfig.whisper;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                i = spokenLanguageIdentificationConfig.numThreads;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                z = spokenLanguageIdentificationConfig.debug;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                str = spokenLanguageIdentificationConfig.provider;
                    }
/* 25 */            return spokenLanguageIdentificationConfig.copy(spokenLanguageIdentificationWhisperConfig, i, z, str);
                }

                public final SpokenLanguageIdentificationWhisperConfig getWhisper() {
/* 1 */             return this.whisper;
                }

                public final int getNumThreads() {
/* 1 */             return this.numThreads;
                }

                public final boolean getDebug() {
/* 1 */             return this.debug;
                }

                public final String getProvider() {
/* 1 */             return this.provider;
                }

                public final SpokenLanguageIdentificationConfig copy(SpokenLanguageIdentificationWhisperConfig whisper, int numThreads, boolean debug, String provider) {
/* 3 */             return new SpokenLanguageIdentificationConfig(whisper, numThreads, debug, provider);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof SpokenLanguageIdentificationConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            SpokenLanguageIdentificationConfig spokenLanguageIdentificationConfig = (SpokenLanguageIdentificationConfig) other;
                    return O0000Ioio00.I0000O(this.whisper, spokenLanguageIdentificationConfig.whisper) && this.numThreads == spokenLanguageIdentificationConfig.numThreads && this.debug == spokenLanguageIdentificationConfig.debug && O0000Ioio00.I0000O(this.provider, spokenLanguageIdentificationConfig.provider);
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

                public final SpokenLanguageIdentificationWhisperConfig getWhisper() {
/* 1 */             return this.whisper;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 12 */            int iI0000O = IIl001iO0Io.I0000O(this.numThreads, this.whisper.hashCode() * 31, 31);
/* 16 */            boolean z = this.debug;
                    int i = z;
/* 18 */            if (z != 0) {
/* 20 */                i = 1;
                    }
/* 29 */            return this.provider.hashCode() + ((iI0000O + i) * 31);
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

                public final void setWhisper(SpokenLanguageIdentificationWhisperConfig spokenLanguageIdentificationWhisperConfig) {
/* 1 */             this.whisper = spokenLanguageIdentificationWhisperConfig;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SpokenLanguageIdentificationConfig(whisper=");
/* 10 */            sb.append(this.whisper);
/* 15 */            sb.append(", numThreads=");
/* 20 */            sb.append(this.numThreads);
/* 25 */            sb.append(", debug=");
/* 30 */            sb.append(this.debug);
/* 35 */            sb.append(", provider=");
/* 42 */            return IlIi0I0.I000oI1ioi(sb, this.provider, ')');
                }

/* 35 */        public SpokenLanguageIdentificationConfig(SpokenLanguageIdentificationWhisperConfig spokenLanguageIdentificationWhisperConfig, int i, boolean z, String str) {
/* 37 */            this.whisper = spokenLanguageIdentificationWhisperConfig;
/* 38 */            this.numThreads = i;
/* 39 */            this.debug = z;
/* 40 */            this.provider = str;
                }

/* 40 */        public SpokenLanguageIdentificationConfig() {
/* 41 */            this(null, 0, false, null, 15, null);
                }
            }
