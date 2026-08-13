            package com.k2fsa.sherpa.onnx;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0015HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\t\u0010C\u001a\u00020\tHÆ\u0003J\t\u0010D\u001a\u00020\u000bHÆ\u0003J\t\u0010E\u001a\u00020\rHÆ\u0003J\t\u0010F\u001a\u00020\u000fHÆ\u0003J\t\u0010G\u001a\u00020\u0011HÆ\u0003J\t\u0010H\u001a\u00020\u0013HÆ\u0003Jm\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u0010J\u001a\u00020\u00132\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\u0011HÖ\u0001J\t\u0010M\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006N"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineTtsModelConfig;", "", "vits", "Lcom/k2fsa/sherpa/onnx/OfflineTtsVitsModelConfig;", "matcha", "Lcom/k2fsa/sherpa/onnx/OfflineTtsMatchaModelConfig;", "kokoro", "Lcom/k2fsa/sherpa/onnx/OfflineTtsKokoroModelConfig;", "zipvoice", "Lcom/k2fsa/sherpa/onnx/OfflineTtsZipVoiceModelConfig;", "kitten", "Lcom/k2fsa/sherpa/onnx/OfflineTtsKittenModelConfig;", "pocket", "Lcom/k2fsa/sherpa/onnx/OfflineTtsPocketModelConfig;", "supertonic", "Lcom/k2fsa/sherpa/onnx/OfflineTtsSupertonicModelConfig;", "numThreads", "", "debug", "", "provider", "", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsVitsModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineTtsMatchaModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineTtsKokoroModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineTtsZipVoiceModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineTtsKittenModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineTtsPocketModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineTtsSupertonicModelConfig;IZLjava/lang/String;)V", "getDebug", "()Z", "setDebug", "(Z)V", "getKitten", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsKittenModelConfig;", "setKitten", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsKittenModelConfig;)V", "getKokoro", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsKokoroModelConfig;", "setKokoro", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsKokoroModelConfig;)V", "getMatcha", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsMatchaModelConfig;", "setMatcha", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsMatchaModelConfig;)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getPocket", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsPocketModelConfig;", "setPocket", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsPocketModelConfig;)V", "getProvider", "()Ljava/lang/String;", "setProvider", "(Ljava/lang/String;)V", "getSupertonic", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsSupertonicModelConfig;", "setSupertonic", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsSupertonicModelConfig;)V", "getVits", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsVitsModelConfig;", "setVits", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsVitsModelConfig;)V", "getZipvoice", "()Lcom/k2fsa/sherpa/onnx/OfflineTtsZipVoiceModelConfig;", "setZipvoice", "(Lcom/k2fsa/sherpa/onnx/OfflineTtsZipVoiceModelConfig;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 8 */     public final class OfflineTtsModelConfig {
                private boolean debug;
                private OfflineTtsKittenModelConfig kitten;
                private OfflineTtsKokoroModelConfig kokoro;
                private OfflineTtsMatchaModelConfig matcha;
                private int numThreads;
                private OfflineTtsPocketModelConfig pocket;
                private String provider;
                private OfflineTtsSupertonicModelConfig supertonic;
                private OfflineTtsVitsModelConfig vits;
                private OfflineTtsZipVoiceModelConfig zipvoice;

                public OfflineTtsModelConfig(OfflineTtsVitsModelConfig offlineTtsVitsModelConfig, OfflineTtsMatchaModelConfig offlineTtsMatchaModelConfig, OfflineTtsKokoroModelConfig offlineTtsKokoroModelConfig, OfflineTtsZipVoiceModelConfig offlineTtsZipVoiceModelConfig, OfflineTtsKittenModelConfig offlineTtsKittenModelConfig, OfflineTtsPocketModelConfig offlineTtsPocketModelConfig, OfflineTtsSupertonicModelConfig offlineTtsSupertonicModelConfig, int i, boolean z, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 9 */             this((i2 & 1) != 0 ? new OfflineTtsVitsModelConfig(null, null, null, null, null, 0.0f, 0.0f, 0.0f, 255, null) : offlineTtsVitsModelConfig, (i2 & 2) != 0 ? new OfflineTtsMatchaModelConfig(null, null, null, null, null, null, 0.0f, 0.0f, 255, null) : offlineTtsMatchaModelConfig, (i2 & 4) != 0 ? new OfflineTtsKokoroModelConfig(null, null, null, null, null, null, null, 0.0f, 255, null) : offlineTtsKokoroModelConfig, (i2 & 8) != 0 ? new OfflineTtsZipVoiceModelConfig(null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 1023, null) : offlineTtsZipVoiceModelConfig, (i2 & 16) != 0 ? new OfflineTtsKittenModelConfig(null, null, null, null, 0.0f, 31, null) : offlineTtsKittenModelConfig, (i2 & 32) != 0 ? new OfflineTtsPocketModelConfig(null, null, null, null, null, null, null, 0, 255, null) : offlineTtsPocketModelConfig, (i2 & 64) != 0 ? new OfflineTtsSupertonicModelConfig(null, null, null, null, null, null, null, 127, null) : offlineTtsSupertonicModelConfig, (i2 & Barcode.FORMAT_ITF) != 0 ? 1 : i, (i2 & Barcode.FORMAT_QR_CODE) != 0 ? false : z, (i2 & Barcode.FORMAT_UPC_A) != 0 ? "cpu" : str);
                }

                public static OfflineTtsModelConfig copy$default(OfflineTtsModelConfig offlineTtsModelConfig, OfflineTtsVitsModelConfig offlineTtsVitsModelConfig, OfflineTtsMatchaModelConfig offlineTtsMatchaModelConfig, OfflineTtsKokoroModelConfig offlineTtsKokoroModelConfig, OfflineTtsZipVoiceModelConfig offlineTtsZipVoiceModelConfig, OfflineTtsKittenModelConfig offlineTtsKittenModelConfig, OfflineTtsPocketModelConfig offlineTtsPocketModelConfig, OfflineTtsSupertonicModelConfig offlineTtsSupertonicModelConfig, int i, boolean z, String str, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 offlineTtsVitsModelConfig = offlineTtsModelConfig.vits;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                offlineTtsMatchaModelConfig = offlineTtsModelConfig.matcha;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                offlineTtsKokoroModelConfig = offlineTtsModelConfig.kokoro;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                offlineTtsZipVoiceModelConfig = offlineTtsModelConfig.zipvoice;
                    }
/* 27 */            if ((i2 & 16) != 0) {
/* 29 */                offlineTtsKittenModelConfig = offlineTtsModelConfig.kitten;
                    }
/* 33 */            if ((i2 & 32) != 0) {
/* 35 */                offlineTtsPocketModelConfig = offlineTtsModelConfig.pocket;
                    }
/* 39 */            if ((i2 & 64) != 0) {
/* 41 */                offlineTtsSupertonicModelConfig = offlineTtsModelConfig.supertonic;
                    }
/* 45 */            if ((i2 & Barcode.FORMAT_ITF) != 0) {
/* 47 */                i = offlineTtsModelConfig.numThreads;
                    }
/* 51 */            if ((i2 & Barcode.FORMAT_QR_CODE) != 0) {
/* 53 */                z = offlineTtsModelConfig.debug;
                    }
/* 57 */            if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
/* 59 */                str = offlineTtsModelConfig.provider;
                    }
/* 61 */            boolean z2 = z;
/* 62 */            String str2 = str;
/* 63 */            OfflineTtsSupertonicModelConfig offlineTtsSupertonicModelConfig2 = offlineTtsSupertonicModelConfig;
/* 64 */            int i3 = i;
/* 65 */            OfflineTtsKittenModelConfig offlineTtsKittenModelConfig2 = offlineTtsKittenModelConfig;
/* 66 */            OfflineTtsPocketModelConfig offlineTtsPocketModelConfig2 = offlineTtsPocketModelConfig;
/* 72 */            return offlineTtsModelConfig.copy(offlineTtsVitsModelConfig, offlineTtsMatchaModelConfig, offlineTtsKokoroModelConfig, offlineTtsZipVoiceModelConfig, offlineTtsKittenModelConfig2, offlineTtsPocketModelConfig2, offlineTtsSupertonicModelConfig2, i3, z2, str2);
                }

                public final OfflineTtsVitsModelConfig getVits() {
/* 1 */             return this.vits;
                }

                public final String getProvider() {
/* 1 */             return this.provider;
                }

                public final OfflineTtsMatchaModelConfig getMatcha() {
/* 1 */             return this.matcha;
                }

                public final OfflineTtsKokoroModelConfig getKokoro() {
/* 1 */             return this.kokoro;
                }

                public final OfflineTtsZipVoiceModelConfig getZipvoice() {
/* 1 */             return this.zipvoice;
                }

                public final OfflineTtsKittenModelConfig getKitten() {
/* 1 */             return this.kitten;
                }

                public final OfflineTtsPocketModelConfig getPocket() {
/* 1 */             return this.pocket;
                }

                public final OfflineTtsSupertonicModelConfig getSupertonic() {
/* 1 */             return this.supertonic;
                }

                public final int getNumThreads() {
/* 1 */             return this.numThreads;
                }

                public final boolean getDebug() {
/* 1 */             return this.debug;
                }

                public final OfflineTtsModelConfig copy(OfflineTtsVitsModelConfig vits, OfflineTtsMatchaModelConfig matcha, OfflineTtsKokoroModelConfig kokoro, OfflineTtsZipVoiceModelConfig zipvoice, OfflineTtsKittenModelConfig kitten, OfflineTtsPocketModelConfig pocket, OfflineTtsSupertonicModelConfig supertonic, int numThreads, boolean debug, String provider) {
/* 3 */             return new OfflineTtsModelConfig(vits, matcha, kokoro, zipvoice, kitten, pocket, supertonic, numThreads, debug, provider);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineTtsModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineTtsModelConfig offlineTtsModelConfig = (OfflineTtsModelConfig) other;
                    return O0000Ioio00.I0000O(this.vits, offlineTtsModelConfig.vits) && O0000Ioio00.I0000O(this.matcha, offlineTtsModelConfig.matcha) && O0000Ioio00.I0000O(this.kokoro, offlineTtsModelConfig.kokoro) && O0000Ioio00.I0000O(this.zipvoice, offlineTtsModelConfig.zipvoice) && O0000Ioio00.I0000O(this.kitten, offlineTtsModelConfig.kitten) && O0000Ioio00.I0000O(this.pocket, offlineTtsModelConfig.pocket) && O0000Ioio00.I0000O(this.supertonic, offlineTtsModelConfig.supertonic) && this.numThreads == offlineTtsModelConfig.numThreads && this.debug == offlineTtsModelConfig.debug && O0000Ioio00.I0000O(this.provider, offlineTtsModelConfig.provider);
                }

                public final boolean getDebug() {
/* 1 */             return this.debug;
                }

                public final OfflineTtsKittenModelConfig getKitten() {
/* 1 */             return this.kitten;
                }

                public final OfflineTtsKokoroModelConfig getKokoro() {
/* 1 */             return this.kokoro;
                }

                public final OfflineTtsMatchaModelConfig getMatcha() {
/* 1 */             return this.matcha;
                }

                public final int getNumThreads() {
/* 1 */             return this.numThreads;
                }

                public final OfflineTtsPocketModelConfig getPocket() {
/* 1 */             return this.pocket;
                }

                public final String getProvider() {
/* 1 */             return this.provider;
                }

                public final OfflineTtsSupertonicModelConfig getSupertonic() {
/* 1 */             return this.supertonic;
                }

                public final OfflineTtsVitsModelConfig getVits() {
/* 1 */             return this.vits;
                }

                public final OfflineTtsZipVoiceModelConfig getZipvoice() {
/* 1 */             return this.zipvoice;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 60 */            int iI0000O = IIl001iO0Io.I0000O(this.numThreads, (this.supertonic.hashCode() + ((this.pocket.hashCode() + ((this.kitten.hashCode() + ((this.zipvoice.hashCode() + ((this.kokoro.hashCode() + ((this.matcha.hashCode() + (this.vits.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
/* 64 */            boolean z = this.debug;
                    int i = z;
/* 66 */            if (z != 0) {
/* 68 */                i = 1;
                    }
/* 77 */            return this.provider.hashCode() + ((iI0000O + i) * 31);
                }

                public final void setDebug(boolean z) {
/* 1 */             this.debug = z;
                }

                public final void setKitten(OfflineTtsKittenModelConfig offlineTtsKittenModelConfig) {
/* 1 */             this.kitten = offlineTtsKittenModelConfig;
                }

                public final void setKokoro(OfflineTtsKokoroModelConfig offlineTtsKokoroModelConfig) {
/* 1 */             this.kokoro = offlineTtsKokoroModelConfig;
                }

                public final void setMatcha(OfflineTtsMatchaModelConfig offlineTtsMatchaModelConfig) {
/* 1 */             this.matcha = offlineTtsMatchaModelConfig;
                }

                public final void setNumThreads(int i) {
/* 1 */             this.numThreads = i;
                }

                public final void setPocket(OfflineTtsPocketModelConfig offlineTtsPocketModelConfig) {
/* 1 */             this.pocket = offlineTtsPocketModelConfig;
                }

                public final void setProvider(String str) {
/* 1 */             this.provider = str;
                }

                public final void setSupertonic(OfflineTtsSupertonicModelConfig offlineTtsSupertonicModelConfig) {
/* 1 */             this.supertonic = offlineTtsSupertonicModelConfig;
                }

                public final void setVits(OfflineTtsVitsModelConfig offlineTtsVitsModelConfig) {
/* 1 */             this.vits = offlineTtsVitsModelConfig;
                }

                public final void setZipvoice(OfflineTtsZipVoiceModelConfig offlineTtsZipVoiceModelConfig) {
/* 1 */             this.zipvoice = offlineTtsZipVoiceModelConfig;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OfflineTtsModelConfig(vits=");
/* 10 */            sb.append(this.vits);
/* 15 */            sb.append(", matcha=");
/* 20 */            sb.append(this.matcha);
/* 25 */            sb.append(", kokoro=");
/* 30 */            sb.append(this.kokoro);
/* 35 */            sb.append(", zipvoice=");
/* 40 */            sb.append(this.zipvoice);
/* 45 */            sb.append(", kitten=");
/* 50 */            sb.append(this.kitten);
/* 55 */            sb.append(", pocket=");
/* 60 */            sb.append(this.pocket);
/* 65 */            sb.append(", supertonic=");
/* 70 */            sb.append(this.supertonic);
/* 75 */            sb.append(", numThreads=");
/* 80 */            sb.append(this.numThreads);
/* 85 */            sb.append(", debug=");
/* 90 */            sb.append(this.debug);
/* 95 */            sb.append(", provider=");
/* 102 */           return IlIi0I0.I000oI1ioi(sb, this.provider, ')');
                }

/* 9 */         public OfflineTtsModelConfig(OfflineTtsVitsModelConfig offlineTtsVitsModelConfig, OfflineTtsMatchaModelConfig offlineTtsMatchaModelConfig, OfflineTtsKokoroModelConfig offlineTtsKokoroModelConfig, OfflineTtsZipVoiceModelConfig offlineTtsZipVoiceModelConfig, OfflineTtsKittenModelConfig offlineTtsKittenModelConfig, OfflineTtsPocketModelConfig offlineTtsPocketModelConfig, OfflineTtsSupertonicModelConfig offlineTtsSupertonicModelConfig, int i, boolean z, String str) {
/* 11 */            this.vits = offlineTtsVitsModelConfig;
/* 12 */            this.matcha = offlineTtsMatchaModelConfig;
/* 13 */            this.kokoro = offlineTtsKokoroModelConfig;
/* 14 */            this.zipvoice = offlineTtsZipVoiceModelConfig;
/* 15 */            this.kitten = offlineTtsKittenModelConfig;
/* 16 */            this.pocket = offlineTtsPocketModelConfig;
/* 17 */            this.supertonic = offlineTtsSupertonicModelConfig;
/* 18 */            this.numThreads = i;
/* 19 */            this.debug = z;
/* 20 */            this.provider = str;
                }

/* 20 */        public OfflineTtsModelConfig() {
/* 21 */            this(null, null, null, null, null, null, null, 0, false, null, 1023, null);
                }
            }
