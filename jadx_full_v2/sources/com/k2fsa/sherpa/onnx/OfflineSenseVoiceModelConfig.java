            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineSenseVoiceModelConfig;", "", "model", "", "language", "useInverseTextNormalization", "", "qnnConfig", "Lcom/k2fsa/sherpa/onnx/QnnConfig;", "(Ljava/lang/String;Ljava/lang/String;ZLcom/k2fsa/sherpa/onnx/QnnConfig;)V", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "getModel", "setModel", "getQnnConfig", "()Lcom/k2fsa/sherpa/onnx/QnnConfig;", "setQnnConfig", "(Lcom/k2fsa/sherpa/onnx/QnnConfig;)V", "getUseInverseTextNormalization", "()Z", "setUseInverseTextNormalization", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 35 */    public final class OfflineSenseVoiceModelConfig {
                private String language;
                private String model;
                private QnnConfig qnnConfig;
                private boolean useInverseTextNormalization;

                public OfflineSenseVoiceModelConfig(String str, String str2, boolean z, QnnConfig qnnConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 33 */            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? new QnnConfig(null, null, null, 7, null) : qnnConfig);
                }

                public static OfflineSenseVoiceModelConfig copy$default(OfflineSenseVoiceModelConfig offlineSenseVoiceModelConfig, String str, String str2, boolean z, QnnConfig qnnConfig, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = offlineSenseVoiceModelConfig.model;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = offlineSenseVoiceModelConfig.language;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                z = offlineSenseVoiceModelConfig.useInverseTextNormalization;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                qnnConfig = offlineSenseVoiceModelConfig.qnnConfig;
                    }
/* 25 */            return offlineSenseVoiceModelConfig.copy(str, str2, z, qnnConfig);
                }

                public final String getModel() {
/* 1 */             return this.model;
                }

                public final String getLanguage() {
/* 1 */             return this.language;
                }

                public final boolean getUseInverseTextNormalization() {
/* 1 */             return this.useInverseTextNormalization;
                }

                public final QnnConfig getQnnConfig() {
/* 1 */             return this.qnnConfig;
                }

                public final OfflineSenseVoiceModelConfig copy(String model, String language, boolean useInverseTextNormalization, QnnConfig qnnConfig) {
/* 3 */             return new OfflineSenseVoiceModelConfig(model, language, useInverseTextNormalization, qnnConfig);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineSenseVoiceModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineSenseVoiceModelConfig offlineSenseVoiceModelConfig = (OfflineSenseVoiceModelConfig) other;
                    return O0000Ioio00.I0000O(this.model, offlineSenseVoiceModelConfig.model) && O0000Ioio00.I0000O(this.language, offlineSenseVoiceModelConfig.language) && this.useInverseTextNormalization == offlineSenseVoiceModelConfig.useInverseTextNormalization && O0000Ioio00.I0000O(this.qnnConfig, offlineSenseVoiceModelConfig.qnnConfig);
                }

                public final String getLanguage() {
/* 1 */             return this.language;
                }

                public final String getModel() {
/* 1 */             return this.model;
                }

                public final QnnConfig getQnnConfig() {
/* 1 */             return this.qnnConfig;
                }

                public final boolean getUseInverseTextNormalization() {
/* 1 */             return this.useInverseTextNormalization;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 12 */            int iI000O01llI0 = Oi010OO0.I000O01llI0(this.model.hashCode() * 31, 31, this.language);
/* 16 */            boolean z = this.useInverseTextNormalization;
                    int i = z;
/* 18 */            if (z != 0) {
/* 20 */                i = 1;
                    }
/* 29 */            return this.qnnConfig.hashCode() + ((iI000O01llI0 + i) * 31);
                }

                public final void setLanguage(String str) {
/* 1 */             this.language = str;
                }

                public final void setModel(String str) {
/* 1 */             this.model = str;
                }

                public final void setQnnConfig(QnnConfig qnnConfig) {
/* 1 */             this.qnnConfig = qnnConfig;
                }

                public final void setUseInverseTextNormalization(boolean z) {
/* 1 */             this.useInverseTextNormalization = z;
                }

                public String toString() {
/* 48 */            return "OfflineSenseVoiceModelConfig(model=" + this.model + ", language=" + this.language + ", useInverseTextNormalization=" + this.useInverseTextNormalization + ", qnnConfig=" + this.qnnConfig + ')';
                }

/* 36 */        public OfflineSenseVoiceModelConfig(String str, String str2, boolean z, QnnConfig qnnConfig) {
/* 38 */            this.model = str;
/* 39 */            this.language = str2;
/* 40 */            this.useInverseTextNormalization = z;
/* 41 */            this.qnnConfig = qnnConfig;
                }

/* 41 */        public OfflineSenseVoiceModelConfig() {
/* 42 */            this(null, null, false, null, 15, null);
                }
            }
