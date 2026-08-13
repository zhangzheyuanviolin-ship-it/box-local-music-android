            package com.k2fsa.sherpa.onnx;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            import p000.OooioIOo1;
            
            @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\bH\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016¢\u0006\u0002\u0010\u001aJ\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0011HÆ\u0003J\t\u0010M\u001a\u00020\u0016HÆ\u0003J\t\u0010N\u001a\u00020\u0011HÆ\u0003J\t\u0010O\u001a\u00020\u0011HÆ\u0003J\t\u0010P\u001a\u00020\u0016HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0007HÆ\u0003J\t\u0010S\u001a\u00020\tHÆ\u0003J\t\u0010T\u001a\u00020\u000bHÆ\u0003J\t\u0010U\u001a\u00020\rHÆ\u0003J\t\u0010V\u001a\u00020\u000fHÆ\u0003J\t\u0010W\u001a\u00020\u0011HÆ\u0003J\t\u0010X\u001a\u00020\u0013HÆ\u0003J\u0095\u0001\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u0016HÆ\u0001J\u0013\u0010Z\u001a\u00020\u000f2\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\\\u001a\u00020\u0013HÖ\u0001J\t\u0010]\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0019\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0014\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010\u0018\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010$\"\u0004\bH\u0010&R\u001a\u0010\u0017\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010$\"\u0004\bJ\u0010&¨\u0006^"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OnlineRecognizerConfig;", "", "featConfig", "Lcom/k2fsa/sherpa/onnx/FeatureConfig;", "modelConfig", "Lcom/k2fsa/sherpa/onnx/OnlineModelConfig;", "lmConfig", "Lcom/k2fsa/sherpa/onnx/OnlineLMConfig;", "ctcFstDecoderConfig", "Lcom/k2fsa/sherpa/onnx/OnlineCtcFstDecoderConfig;", "hr", "Lcom/k2fsa/sherpa/onnx/HomophoneReplacerConfig;", "endpointConfig", "Lcom/k2fsa/sherpa/onnx/EndpointConfig;", "enableEndpoint", "", "decodingMethod", "", "maxActivePaths", "", "hotwordsFile", "hotwordsScore", "", "ruleFsts", "ruleFars", "blankPenalty", "(Lcom/k2fsa/sherpa/onnx/FeatureConfig;Lcom/k2fsa/sherpa/onnx/OnlineModelConfig;Lcom/k2fsa/sherpa/onnx/OnlineLMConfig;Lcom/k2fsa/sherpa/onnx/OnlineCtcFstDecoderConfig;Lcom/k2fsa/sherpa/onnx/HomophoneReplacerConfig;Lcom/k2fsa/sherpa/onnx/EndpointConfig;ZLjava/lang/String;ILjava/lang/String;FLjava/lang/String;Ljava/lang/String;F)V", "getBlankPenalty", "()F", "setBlankPenalty", "(F)V", "getCtcFstDecoderConfig", "()Lcom/k2fsa/sherpa/onnx/OnlineCtcFstDecoderConfig;", "setCtcFstDecoderConfig", "(Lcom/k2fsa/sherpa/onnx/OnlineCtcFstDecoderConfig;)V", "getDecodingMethod", "()Ljava/lang/String;", "setDecodingMethod", "(Ljava/lang/String;)V", "getEnableEndpoint", "()Z", "setEnableEndpoint", "(Z)V", "getEndpointConfig", "()Lcom/k2fsa/sherpa/onnx/EndpointConfig;", "setEndpointConfig", "(Lcom/k2fsa/sherpa/onnx/EndpointConfig;)V", "getFeatConfig", "()Lcom/k2fsa/sherpa/onnx/FeatureConfig;", "setFeatConfig", "(Lcom/k2fsa/sherpa/onnx/FeatureConfig;)V", "getHotwordsFile", "setHotwordsFile", "getHotwordsScore", "setHotwordsScore", "getHr", "()Lcom/k2fsa/sherpa/onnx/HomophoneReplacerConfig;", "setHr", "(Lcom/k2fsa/sherpa/onnx/HomophoneReplacerConfig;)V", "getLmConfig", "()Lcom/k2fsa/sherpa/onnx/OnlineLMConfig;", "setLmConfig", "(Lcom/k2fsa/sherpa/onnx/OnlineLMConfig;)V", "getMaxActivePaths", "()I", "setMaxActivePaths", "(I)V", "getModelConfig", "()Lcom/k2fsa/sherpa/onnx/OnlineModelConfig;", "setModelConfig", "(Lcom/k2fsa/sherpa/onnx/OnlineModelConfig;)V", "getRuleFars", "setRuleFars", "getRuleFsts", "setRuleFsts", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 7 */     public final class OnlineRecognizerConfig {
                private float blankPenalty;
                private OnlineCtcFstDecoderConfig ctcFstDecoderConfig;
                private String decodingMethod;
                private boolean enableEndpoint;
                private EndpointConfig endpointConfig;
                private FeatureConfig featConfig;
                private String hotwordsFile;
                private float hotwordsScore;
                private HomophoneReplacerConfig hr;
                private OnlineLMConfig lmConfig;
                private int maxActivePaths;
                private OnlineModelConfig modelConfig;
                private String ruleFars;
                private String ruleFsts;

                /* JADX WARN: Illegal instructions before constructor call */
                /* JADX WARN: Multi-variable type inference failed */
                public OnlineRecognizerConfig(FeatureConfig featureConfig, OnlineModelConfig onlineModelConfig, OnlineLMConfig onlineLMConfig, OnlineCtcFstDecoderConfig onlineCtcFstDecoderConfig, HomophoneReplacerConfig homophoneReplacerConfig, EndpointConfig endpointConfig, boolean z, String str, int i, String str2, float f, String str3, String str4, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                    int i3 = 3;
/* 8 */             this((i2 & 1) != 0 ? new FeatureConfig(0, 0, 0.0f, 7, null) : featureConfig, (i2 & 2) != 0 ? new OnlineModelConfig(null, null, null, null, null, null, 0, false, null, null, null, null, 4095, null) : onlineModelConfig, (i2 & 4) != 0 ? new OnlineLMConfig(null, 0.0f, i3, 0 == true ? 1 : 0) : onlineLMConfig, (i2 & 8) != 0 ? new OnlineCtcFstDecoderConfig(0 == true ? 1 : 0, 0, i3, 0 == true ? 1 : 0) : onlineCtcFstDecoderConfig, (i2 & 16) != 0 ? new HomophoneReplacerConfig(null, null, null, 7, null) : homophoneReplacerConfig, (i2 & 32) != 0 ? new EndpointConfig(null, null, null, 7, null) : endpointConfig, (i2 & 64) != 0 ? true : z, (i2 & Barcode.FORMAT_ITF) != 0 ? "greedy_search" : str, (i2 & Barcode.FORMAT_QR_CODE) != 0 ? 4 : i, (i2 & Barcode.FORMAT_UPC_A) != 0 ? "" : str2, (i2 & Barcode.FORMAT_UPC_E) != 0 ? 1.5f : f, (i2 & Barcode.FORMAT_PDF417) != 0 ? "" : str3, (i2 & Barcode.FORMAT_AZTEC) == 0 ? str4 : "", (i2 & 8192) != 0 ? 0.0f : f2);
                }

                public final FeatureConfig getFeatConfig() {
/* 1 */             return this.featConfig;
                }

                public final String getHotwordsFile() {
/* 1 */             return this.hotwordsFile;
                }

                public final float getHotwordsScore() {
/* 1 */             return this.hotwordsScore;
                }

                public final String getRuleFsts() {
/* 1 */             return this.ruleFsts;
                }

                public final String getRuleFars() {
/* 1 */             return this.ruleFars;
                }

                public final float getBlankPenalty() {
/* 1 */             return this.blankPenalty;
                }

                public final OnlineModelConfig getModelConfig() {
/* 1 */             return this.modelConfig;
                }

                public final OnlineLMConfig getLmConfig() {
/* 1 */             return this.lmConfig;
                }

                public final OnlineCtcFstDecoderConfig getCtcFstDecoderConfig() {
/* 1 */             return this.ctcFstDecoderConfig;
                }

                public final HomophoneReplacerConfig getHr() {
/* 1 */             return this.hr;
                }

                public final EndpointConfig getEndpointConfig() {
/* 1 */             return this.endpointConfig;
                }

                public final boolean getEnableEndpoint() {
/* 1 */             return this.enableEndpoint;
                }

                public final String getDecodingMethod() {
/* 1 */             return this.decodingMethod;
                }

                public final int getMaxActivePaths() {
/* 1 */             return this.maxActivePaths;
                }

                public final OnlineRecognizerConfig copy(FeatureConfig featConfig, OnlineModelConfig modelConfig, OnlineLMConfig lmConfig, OnlineCtcFstDecoderConfig ctcFstDecoderConfig, HomophoneReplacerConfig hr, EndpointConfig endpointConfig, boolean enableEndpoint, String decodingMethod, int maxActivePaths, String hotwordsFile, float hotwordsScore, String ruleFsts, String ruleFars, float blankPenalty) {
/* 3 */             return new OnlineRecognizerConfig(featConfig, modelConfig, lmConfig, ctcFstDecoderConfig, hr, endpointConfig, enableEndpoint, decodingMethod, maxActivePaths, hotwordsFile, hotwordsScore, ruleFsts, ruleFars, blankPenalty);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OnlineRecognizerConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OnlineRecognizerConfig onlineRecognizerConfig = (OnlineRecognizerConfig) other;
                    return O0000Ioio00.I0000O(this.featConfig, onlineRecognizerConfig.featConfig) && O0000Ioio00.I0000O(this.modelConfig, onlineRecognizerConfig.modelConfig) && O0000Ioio00.I0000O(this.lmConfig, onlineRecognizerConfig.lmConfig) && O0000Ioio00.I0000O(this.ctcFstDecoderConfig, onlineRecognizerConfig.ctcFstDecoderConfig) && O0000Ioio00.I0000O(this.hr, onlineRecognizerConfig.hr) && O0000Ioio00.I0000O(this.endpointConfig, onlineRecognizerConfig.endpointConfig) && this.enableEndpoint == onlineRecognizerConfig.enableEndpoint && O0000Ioio00.I0000O(this.decodingMethod, onlineRecognizerConfig.decodingMethod) && this.maxActivePaths == onlineRecognizerConfig.maxActivePaths && O0000Ioio00.I0000O(this.hotwordsFile, onlineRecognizerConfig.hotwordsFile) && Float.compare(this.hotwordsScore, onlineRecognizerConfig.hotwordsScore) == 0 && O0000Ioio00.I0000O(this.ruleFsts, onlineRecognizerConfig.ruleFsts) && O0000Ioio00.I0000O(this.ruleFars, onlineRecognizerConfig.ruleFars) && Float.compare(this.blankPenalty, onlineRecognizerConfig.blankPenalty) == 0;
                }

                public final float getBlankPenalty() {
/* 1 */             return this.blankPenalty;
                }

                public final OnlineCtcFstDecoderConfig getCtcFstDecoderConfig() {
/* 1 */             return this.ctcFstDecoderConfig;
                }

                public final String getDecodingMethod() {
/* 1 */             return this.decodingMethod;
                }

                public final boolean getEnableEndpoint() {
/* 1 */             return this.enableEndpoint;
                }

                public final EndpointConfig getEndpointConfig() {
/* 1 */             return this.endpointConfig;
                }

                public final FeatureConfig getFeatConfig() {
/* 1 */             return this.featConfig;
                }

                public final String getHotwordsFile() {
/* 1 */             return this.hotwordsFile;
                }

                public final float getHotwordsScore() {
/* 1 */             return this.hotwordsScore;
                }

                public final HomophoneReplacerConfig getHr() {
/* 1 */             return this.hr;
                }

                public final OnlineLMConfig getLmConfig() {
/* 1 */             return this.lmConfig;
                }

                public final int getMaxActivePaths() {
/* 1 */             return this.maxActivePaths;
                }

                public final OnlineModelConfig getModelConfig() {
/* 1 */             return this.modelConfig;
                }

                public final String getRuleFars() {
/* 1 */             return this.ruleFars;
                }

                public final String getRuleFsts() {
/* 1 */             return this.ruleFsts;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 49 */            int iHashCode = (this.endpointConfig.hashCode() + ((this.hr.hashCode() + ((this.ctcFstDecoderConfig.hashCode() + ((this.lmConfig.hashCode() + ((this.modelConfig.hashCode() + (this.featConfig.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
/* 50 */            boolean z = this.enableEndpoint;
                    int i = z;
/* 52 */            if (z != 0) {
/* 54 */                i = 1;
                    }
/* 99 */            return Float.hashCode(this.blankPenalty) + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(OooioIOo1.I0000O(Oi010OO0.I000O01llI0(IIl001iO0Io.I0000O(this.maxActivePaths, Oi010OO0.I000O01llI0((iHashCode + i) * 31, 31, this.decodingMethod), 31), 31, this.hotwordsFile), 31, this.hotwordsScore), 31, this.ruleFsts), 31, this.ruleFars);
                }

                public final void setBlankPenalty(float f) {
/* 1 */             this.blankPenalty = f;
                }

                public final void setCtcFstDecoderConfig(OnlineCtcFstDecoderConfig onlineCtcFstDecoderConfig) {
/* 1 */             this.ctcFstDecoderConfig = onlineCtcFstDecoderConfig;
                }

                public final void setDecodingMethod(String str) {
/* 1 */             this.decodingMethod = str;
                }

                public final void setEnableEndpoint(boolean z) {
/* 1 */             this.enableEndpoint = z;
                }

                public final void setEndpointConfig(EndpointConfig endpointConfig) {
/* 1 */             this.endpointConfig = endpointConfig;
                }

                public final void setFeatConfig(FeatureConfig featureConfig) {
/* 1 */             this.featConfig = featureConfig;
                }

                public final void setHotwordsFile(String str) {
/* 1 */             this.hotwordsFile = str;
                }

                public final void setHotwordsScore(float f) {
/* 1 */             this.hotwordsScore = f;
                }

                public final void setHr(HomophoneReplacerConfig homophoneReplacerConfig) {
/* 1 */             this.hr = homophoneReplacerConfig;
                }

                public final void setLmConfig(OnlineLMConfig onlineLMConfig) {
/* 1 */             this.lmConfig = onlineLMConfig;
                }

                public final void setMaxActivePaths(int i) {
/* 1 */             this.maxActivePaths = i;
                }

                public final void setModelConfig(OnlineModelConfig onlineModelConfig) {
/* 1 */             this.modelConfig = onlineModelConfig;
                }

                public final void setRuleFars(String str) {
/* 1 */             this.ruleFars = str;
                }

                public final void setRuleFsts(String str) {
/* 1 */             this.ruleFsts = str;
                }

                public String toString() {
/* 148 */           return "OnlineRecognizerConfig(featConfig=" + this.featConfig + ", modelConfig=" + this.modelConfig + ", lmConfig=" + this.lmConfig + ", ctcFstDecoderConfig=" + this.ctcFstDecoderConfig + ", hr=" + this.hr + ", endpointConfig=" + this.endpointConfig + ", enableEndpoint=" + this.enableEndpoint + ", decodingMethod=" + this.decodingMethod + ", maxActivePaths=" + this.maxActivePaths + ", hotwordsFile=" + this.hotwordsFile + ", hotwordsScore=" + this.hotwordsScore + ", ruleFsts=" + this.ruleFsts + ", ruleFars=" + this.ruleFars + ", blankPenalty=" + this.blankPenalty + ')';
                }

/* 8 */         public OnlineRecognizerConfig(FeatureConfig featureConfig, OnlineModelConfig onlineModelConfig, OnlineLMConfig onlineLMConfig, OnlineCtcFstDecoderConfig onlineCtcFstDecoderConfig, HomophoneReplacerConfig homophoneReplacerConfig, EndpointConfig endpointConfig, boolean z, String str, int i, String str2, float f, String str3, String str4, float f2) {
/* 10 */            this.featConfig = featureConfig;
/* 11 */            this.modelConfig = onlineModelConfig;
/* 12 */            this.lmConfig = onlineLMConfig;
/* 13 */            this.ctcFstDecoderConfig = onlineCtcFstDecoderConfig;
/* 14 */            this.hr = homophoneReplacerConfig;
/* 15 */            this.endpointConfig = endpointConfig;
/* 16 */            this.enableEndpoint = z;
/* 17 */            this.decodingMethod = str;
/* 18 */            this.maxActivePaths = i;
/* 19 */            this.hotwordsFile = str2;
/* 20 */            this.hotwordsScore = f;
/* 21 */            this.ruleFsts = str3;
/* 22 */            this.ruleFars = str4;
/* 23 */            this.blankPenalty = f2;
                }

/* 23 */        public OnlineRecognizerConfig() {
/* 24 */            this(null, null, null, null, null, null, false, null, 0, null, 0.0f, null, null, 0.0f, 16383, null);
                }
            }
