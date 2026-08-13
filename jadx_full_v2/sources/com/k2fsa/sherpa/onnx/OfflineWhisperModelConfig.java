            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u0006-"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineWhisperModelConfig;", "", "encoder", "", "decoder", "language", "task", "tailPaddings", "", "enableTokenTimestamps", "", "enableSegmentTimestamps", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZ)V", "getDecoder", "()Ljava/lang/String;", "setDecoder", "(Ljava/lang/String;)V", "getEnableSegmentTimestamps", "()Z", "setEnableSegmentTimestamps", "(Z)V", "getEnableTokenTimestamps", "setEnableTokenTimestamps", "getEncoder", "setEncoder", "getLanguage", "setLanguage", "getTailPaddings", "()I", "setTailPaddings", "(I)V", "getTask", "setTask", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 44 */    public final class OfflineWhisperModelConfig {
                private String decoder;
                private boolean enableSegmentTimestamps;
                private boolean enableTokenTimestamps;
                private String encoder;
                private String language;
                private int tailPaddings;
                private String task;

                public OfflineWhisperModelConfig(String str, String str2, String str3, String str4, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 42 */            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "en" : str3, (i2 & 8) != 0 ? "transcribe" : str4, (i2 & 16) != 0 ? 1000 : i, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2);
                }

                public static OfflineWhisperModelConfig copy$default(OfflineWhisperModelConfig offlineWhisperModelConfig, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 str = offlineWhisperModelConfig.encoder;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                str2 = offlineWhisperModelConfig.decoder;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                str3 = offlineWhisperModelConfig.language;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                str4 = offlineWhisperModelConfig.task;
                    }
/* 27 */            if ((i2 & 16) != 0) {
/* 29 */                i = offlineWhisperModelConfig.tailPaddings;
                    }
/* 33 */            if ((i2 & 32) != 0) {
/* 35 */                z = offlineWhisperModelConfig.enableTokenTimestamps;
                    }
/* 39 */            if ((i2 & 64) != 0) {
/* 41 */                z2 = offlineWhisperModelConfig.enableSegmentTimestamps;
                    }
/* 43 */            boolean z3 = z;
/* 44 */            boolean z4 = z2;
/* 46 */            int i3 = i;
/* 48 */            String str5 = str3;
/* 51 */            return offlineWhisperModelConfig.copy(str, str2, str5, str4, i3, z3, z4);
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final String getLanguage() {
/* 1 */             return this.language;
                }

                public final String getTask() {
/* 1 */             return this.task;
                }

                public final int getTailPaddings() {
/* 1 */             return this.tailPaddings;
                }

                public final boolean getEnableTokenTimestamps() {
/* 1 */             return this.enableTokenTimestamps;
                }

                public final boolean getEnableSegmentTimestamps() {
/* 1 */             return this.enableSegmentTimestamps;
                }

                public final OfflineWhisperModelConfig copy(String encoder, String decoder, String language, String task, int tailPaddings, boolean enableTokenTimestamps, boolean enableSegmentTimestamps) {
/* 3 */             return new OfflineWhisperModelConfig(encoder, decoder, language, task, tailPaddings, enableTokenTimestamps, enableSegmentTimestamps);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineWhisperModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineWhisperModelConfig offlineWhisperModelConfig = (OfflineWhisperModelConfig) other;
                    return O0000Ioio00.I0000O(this.encoder, offlineWhisperModelConfig.encoder) && O0000Ioio00.I0000O(this.decoder, offlineWhisperModelConfig.decoder) && O0000Ioio00.I0000O(this.language, offlineWhisperModelConfig.language) && O0000Ioio00.I0000O(this.task, offlineWhisperModelConfig.task) && this.tailPaddings == offlineWhisperModelConfig.tailPaddings && this.enableTokenTimestamps == offlineWhisperModelConfig.enableTokenTimestamps && this.enableSegmentTimestamps == offlineWhisperModelConfig.enableSegmentTimestamps;
                }

                public final String getDecoder() {
/* 1 */             return this.decoder;
                }

                public final boolean getEnableSegmentTimestamps() {
/* 1 */             return this.enableSegmentTimestamps;
                }

                public final boolean getEnableTokenTimestamps() {
/* 1 */             return this.enableTokenTimestamps;
                }

                public final String getEncoder() {
/* 1 */             return this.encoder;
                }

                public final String getLanguage() {
/* 1 */             return this.language;
                }

                public final int getTailPaddings() {
/* 1 */             return this.tailPaddings;
                }

                public final String getTask() {
/* 1 */             return this.task;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 30 */            int iI0000O = IIl001iO0Io.I0000O(this.tailPaddings, Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.encoder.hashCode() * 31, 31, this.decoder), 31, this.language), 31, this.task), 31);
/* 34 */            boolean z = this.enableTokenTimestamps;
                    int i = z;
/* 37 */            if (z != 0) {
/* 39 */                i = 1;
                    }
/* 41 */            int i2 = (iI0000O + i) * 31;
/* 42 */            boolean z2 = this.enableSegmentTimestamps;
/* 48 */            return i2 + (z2 ? 1 : z2 ? 1 : 0);
                }

                public final void setDecoder(String str) {
/* 1 */             this.decoder = str;
                }

                public final void setEnableSegmentTimestamps(boolean z) {
/* 1 */             this.enableSegmentTimestamps = z;
                }

                public final void setEnableTokenTimestamps(boolean z) {
/* 1 */             this.enableTokenTimestamps = z;
                }

                public final void setEncoder(String str) {
/* 1 */             this.encoder = str;
                }

                public final void setLanguage(String str) {
/* 1 */             this.language = str;
                }

                public final void setTailPaddings(int i) {
/* 1 */             this.tailPaddings = i;
                }

                public final void setTask(String str) {
/* 1 */             this.task = str;
                }

                public String toString() {
/* 78 */            return "OfflineWhisperModelConfig(encoder=" + this.encoder + ", decoder=" + this.decoder + ", language=" + this.language + ", task=" + this.task + ", tailPaddings=" + this.tailPaddings + ", enableTokenTimestamps=" + this.enableTokenTimestamps + ", enableSegmentTimestamps=" + this.enableSegmentTimestamps + ')';
                }

/* 45 */        public OfflineWhisperModelConfig(String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
/* 47 */            this.encoder = str;
/* 48 */            this.decoder = str2;
/* 49 */            this.language = str3;
/* 50 */            this.task = str4;
/* 51 */            this.tailPaddings = i;
/* 52 */            this.enableTokenTimestamps = z;
/* 53 */            this.enableSegmentTimestamps = z2;
                }

/* 53 */        public OfflineWhisperModelConfig() {
/* 54 */            this(null, null, null, null, 0, false, false, 127, null);
                }
            }
