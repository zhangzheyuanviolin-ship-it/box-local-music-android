            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006("}, d2 = {"Lcom/k2fsa/sherpa/onnx/AudioTaggingModelConfig;", "", "zipformer", "Lcom/k2fsa/sherpa/onnx/OfflineZipformerAudioTaggingModelConfig;", "ced", "", "numThreads", "", "debug", "", "provider", "(Lcom/k2fsa/sherpa/onnx/OfflineZipformerAudioTaggingModelConfig;Ljava/lang/String;IZLjava/lang/String;)V", "getCed", "()Ljava/lang/String;", "setCed", "(Ljava/lang/String;)V", "getDebug", "()Z", "setDebug", "(Z)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getProvider", "setProvider", "getZipformer", "()Lcom/k2fsa/sherpa/onnx/OfflineZipformerAudioTaggingModelConfig;", "setZipformer", "(Lcom/k2fsa/sherpa/onnx/OfflineZipformerAudioTaggingModelConfig;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 43 */    public final class AudioTaggingModelConfig {
                private String ced;
                private boolean debug;
                private int numThreads;
                private String provider;
                private OfflineZipformerAudioTaggingModelConfig zipformer;

                /* JADX WARN: Multi-variable type inference failed */
                public AudioTaggingModelConfig(OfflineZipformerAudioTaggingModelConfig offlineZipformerAudioTaggingModelConfig, String str, int i, boolean z, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 41 */            this((i2 & 1) != 0 ? new OfflineZipformerAudioTaggingModelConfig(null, 1, 0 == true ? 1 : 0) : offlineZipformerAudioTaggingModelConfig, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? "cpu" : str2);
                }

                public static AudioTaggingModelConfig copy$default(AudioTaggingModelConfig audioTaggingModelConfig, OfflineZipformerAudioTaggingModelConfig offlineZipformerAudioTaggingModelConfig, String str, int i, boolean z, String str2, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 offlineZipformerAudioTaggingModelConfig = audioTaggingModelConfig.zipformer;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                str = audioTaggingModelConfig.ced;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                i = audioTaggingModelConfig.numThreads;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                z = audioTaggingModelConfig.debug;
                    }
/* 27 */            if ((i2 & 16) != 0) {
/* 29 */                str2 = audioTaggingModelConfig.provider;
                    }
/* 32 */            String str3 = str2;
/* 34 */            int i3 = i;
/* 37 */            return audioTaggingModelConfig.copy(offlineZipformerAudioTaggingModelConfig, str, i3, z, str3);
                }

                public final OfflineZipformerAudioTaggingModelConfig getZipformer() {
/* 1 */             return this.zipformer;
                }

                public final String getCed() {
/* 1 */             return this.ced;
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

                public final AudioTaggingModelConfig copy(OfflineZipformerAudioTaggingModelConfig zipformer, String ced, int numThreads, boolean debug, String provider) {
/* 3 */             return new AudioTaggingModelConfig(zipformer, ced, numThreads, debug, provider);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof AudioTaggingModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            AudioTaggingModelConfig audioTaggingModelConfig = (AudioTaggingModelConfig) other;
                    return O0000Ioio00.I0000O(this.zipformer, audioTaggingModelConfig.zipformer) && O0000Ioio00.I0000O(this.ced, audioTaggingModelConfig.ced) && this.numThreads == audioTaggingModelConfig.numThreads && this.debug == audioTaggingModelConfig.debug && O0000Ioio00.I0000O(this.provider, audioTaggingModelConfig.provider);
                }

                public final String getCed() {
/* 1 */             return this.ced;
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

                public final OfflineZipformerAudioTaggingModelConfig getZipformer() {
/* 1 */             return this.zipformer;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 18 */            int iI0000O = IIl001iO0Io.I0000O(this.numThreads, Oi010OO0.I000O01llI0(this.zipformer.hashCode() * 31, 31, this.ced), 31);
/* 22 */            boolean z = this.debug;
                    int i = z;
/* 24 */            if (z != 0) {
/* 26 */                i = 1;
                    }
/* 35 */            return this.provider.hashCode() + ((iI0000O + i) * 31);
                }

                public final void setCed(String str) {
/* 1 */             this.ced = str;
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

                public final void setZipformer(OfflineZipformerAudioTaggingModelConfig offlineZipformerAudioTaggingModelConfig) {
/* 1 */             this.zipformer = offlineZipformerAudioTaggingModelConfig;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AudioTaggingModelConfig(zipformer=");
/* 10 */            sb.append(this.zipformer);
/* 15 */            sb.append(", ced=");
/* 20 */            sb.append(this.ced);
/* 25 */            sb.append(", numThreads=");
/* 30 */            sb.append(this.numThreads);
/* 35 */            sb.append(", debug=");
/* 40 */            sb.append(this.debug);
/* 45 */            sb.append(", provider=");
/* 52 */            return IlIi0I0.I000oI1ioi(sb, this.provider, ')');
                }

/* 44 */        public AudioTaggingModelConfig(OfflineZipformerAudioTaggingModelConfig offlineZipformerAudioTaggingModelConfig, String str, int i, boolean z, String str2) {
/* 46 */            this.zipformer = offlineZipformerAudioTaggingModelConfig;
/* 47 */            this.ced = str;
/* 48 */            this.numThreads = i;
/* 49 */            this.debug = z;
/* 50 */            this.provider = str2;
                }

/* 50 */        public AudioTaggingModelConfig() {
/* 51 */            this(null, null, 0, false, null, 31, null);
                }
            }
