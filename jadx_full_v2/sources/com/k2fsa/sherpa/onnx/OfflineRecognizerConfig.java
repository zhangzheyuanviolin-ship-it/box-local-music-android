            package com.k2fsa.sherpa.onnx;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            import p000.OooioIOo1;
            
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003Jm\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u000eHÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u000bHÖ\u0001J\t\u0010B\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0011\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001a¨\u0006C"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineRecognizerConfig;", "", "featConfig", "Lcom/k2fsa/sherpa/onnx/FeatureConfig;", "modelConfig", "Lcom/k2fsa/sherpa/onnx/OfflineModelConfig;", "hr", "Lcom/k2fsa/sherpa/onnx/HomophoneReplacerConfig;", "decodingMethod", "", "maxActivePaths", "", "hotwordsFile", "hotwordsScore", "", "ruleFsts", "ruleFars", "blankPenalty", "(Lcom/k2fsa/sherpa/onnx/FeatureConfig;Lcom/k2fsa/sherpa/onnx/OfflineModelConfig;Lcom/k2fsa/sherpa/onnx/HomophoneReplacerConfig;Ljava/lang/String;ILjava/lang/String;FLjava/lang/String;Ljava/lang/String;F)V", "getBlankPenalty", "()F", "setBlankPenalty", "(F)V", "getDecodingMethod", "()Ljava/lang/String;", "setDecodingMethod", "(Ljava/lang/String;)V", "getFeatConfig", "()Lcom/k2fsa/sherpa/onnx/FeatureConfig;", "setFeatConfig", "(Lcom/k2fsa/sherpa/onnx/FeatureConfig;)V", "getHotwordsFile", "setHotwordsFile", "getHotwordsScore", "setHotwordsScore", "getHr", "()Lcom/k2fsa/sherpa/onnx/HomophoneReplacerConfig;", "setHr", "(Lcom/k2fsa/sherpa/onnx/HomophoneReplacerConfig;)V", "getMaxActivePaths", "()I", "setMaxActivePaths", "(I)V", "getModelConfig", "()Lcom/k2fsa/sherpa/onnx/OfflineModelConfig;", "setModelConfig", "(Lcom/k2fsa/sherpa/onnx/OfflineModelConfig;)V", "getRuleFars", "setRuleFars", "getRuleFsts", "setRuleFsts", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 4 */     public final class OfflineRecognizerConfig {
                private float blankPenalty;
                private String decodingMethod;
                private FeatureConfig featConfig;
                private String hotwordsFile;
                private float hotwordsScore;
                private HomophoneReplacerConfig hr;
                private int maxActivePaths;
                private OfflineModelConfig modelConfig;
                private String ruleFars;
                private String ruleFsts;

                public OfflineRecognizerConfig(FeatureConfig featureConfig, OfflineModelConfig offlineModelConfig, HomophoneReplacerConfig homophoneReplacerConfig, String str, int i, String str2, float f, String str3, String str4, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 5 */             this((i2 & 1) != 0 ? new FeatureConfig(0, 0, 0.0f, 7, null) : featureConfig, (i2 & 2) != 0 ? new OfflineModelConfig(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, null, 33554431, null) : offlineModelConfig, (i2 & 4) != 0 ? new HomophoneReplacerConfig(null, null, null, 7, null) : homophoneReplacerConfig, (i2 & 8) != 0 ? "greedy_search" : str, (i2 & 16) != 0 ? 4 : i, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? 1.5f : f, (i2 & Barcode.FORMAT_ITF) != 0 ? "" : str3, (i2 & Barcode.FORMAT_QR_CODE) == 0 ? str4 : "", (i2 & Barcode.FORMAT_UPC_A) != 0 ? 0.0f : f2);
                }

                public static OfflineRecognizerConfig copy$default(OfflineRecognizerConfig offlineRecognizerConfig, FeatureConfig featureConfig, OfflineModelConfig offlineModelConfig, HomophoneReplacerConfig homophoneReplacerConfig, String str, int i, String str2, float f, String str3, String str4, float f2, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 featureConfig = offlineRecognizerConfig.featConfig;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                offlineModelConfig = offlineRecognizerConfig.modelConfig;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                homophoneReplacerConfig = offlineRecognizerConfig.hr;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                str = offlineRecognizerConfig.decodingMethod;
                    }
/* 27 */            if ((i2 & 16) != 0) {
/* 29 */                i = offlineRecognizerConfig.maxActivePaths;
                    }
/* 33 */            if ((i2 & 32) != 0) {
/* 35 */                str2 = offlineRecognizerConfig.hotwordsFile;
                    }
/* 39 */            if ((i2 & 64) != 0) {
/* 41 */                f = offlineRecognizerConfig.hotwordsScore;
                    }
/* 45 */            if ((i2 & Barcode.FORMAT_ITF) != 0) {
/* 47 */                str3 = offlineRecognizerConfig.ruleFsts;
                    }
/* 51 */            if ((i2 & Barcode.FORMAT_QR_CODE) != 0) {
/* 53 */                str4 = offlineRecognizerConfig.ruleFars;
                    }
/* 57 */            if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
/* 59 */                f2 = offlineRecognizerConfig.blankPenalty;
                    }
/* 61 */            String str5 = str4;
/* 62 */            float f3 = f2;
/* 63 */            float f4 = f;
/* 64 */            String str6 = str3;
/* 65 */            int i3 = i;
/* 66 */            String str7 = str2;
/* 72 */            return offlineRecognizerConfig.copy(featureConfig, offlineModelConfig, homophoneReplacerConfig, str, i3, str7, f4, str6, str5, f3);
                }

                public final FeatureConfig getFeatConfig() {
/* 1 */             return this.featConfig;
                }

                public final float getBlankPenalty() {
/* 1 */             return this.blankPenalty;
                }

                public final OfflineModelConfig getModelConfig() {
/* 1 */             return this.modelConfig;
                }

                public final HomophoneReplacerConfig getHr() {
/* 1 */             return this.hr;
                }

                public final String getDecodingMethod() {
/* 1 */             return this.decodingMethod;
                }

                public final int getMaxActivePaths() {
/* 1 */             return this.maxActivePaths;
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

                public final OfflineRecognizerConfig copy(FeatureConfig featConfig, OfflineModelConfig modelConfig, HomophoneReplacerConfig hr, String decodingMethod, int maxActivePaths, String hotwordsFile, float hotwordsScore, String ruleFsts, String ruleFars, float blankPenalty) {
/* 3 */             return new OfflineRecognizerConfig(featConfig, modelConfig, hr, decodingMethod, maxActivePaths, hotwordsFile, hotwordsScore, ruleFsts, ruleFars, blankPenalty);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineRecognizerConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineRecognizerConfig offlineRecognizerConfig = (OfflineRecognizerConfig) other;
                    return O0000Ioio00.I0000O(this.featConfig, offlineRecognizerConfig.featConfig) && O0000Ioio00.I0000O(this.modelConfig, offlineRecognizerConfig.modelConfig) && O0000Ioio00.I0000O(this.hr, offlineRecognizerConfig.hr) && O0000Ioio00.I0000O(this.decodingMethod, offlineRecognizerConfig.decodingMethod) && this.maxActivePaths == offlineRecognizerConfig.maxActivePaths && O0000Ioio00.I0000O(this.hotwordsFile, offlineRecognizerConfig.hotwordsFile) && Float.compare(this.hotwordsScore, offlineRecognizerConfig.hotwordsScore) == 0 && O0000Ioio00.I0000O(this.ruleFsts, offlineRecognizerConfig.ruleFsts) && O0000Ioio00.I0000O(this.ruleFars, offlineRecognizerConfig.ruleFars) && Float.compare(this.blankPenalty, offlineRecognizerConfig.blankPenalty) == 0;
                }

                public final float getBlankPenalty() {
/* 1 */             return this.blankPenalty;
                }

                public final String getDecodingMethod() {
/* 1 */             return this.decodingMethod;
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

                public final int getMaxActivePaths() {
/* 1 */             return this.maxActivePaths;
                }

                public final OfflineModelConfig getModelConfig() {
/* 1 */             return this.modelConfig;
                }

                public final String getRuleFars() {
/* 1 */             return this.ruleFars;
                }

                public final String getRuleFsts() {
/* 1 */             return this.ruleFsts;
                }

                public int hashCode() {
/* 68 */            return Float.hashCode(this.blankPenalty) + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(OooioIOo1.I0000O(Oi010OO0.I000O01llI0(IIl001iO0Io.I0000O(this.maxActivePaths, Oi010OO0.I000O01llI0((this.hr.hashCode() + ((this.modelConfig.hashCode() + (this.featConfig.hashCode() * 31)) * 31)) * 31, 31, this.decodingMethod), 31), 31, this.hotwordsFile), 31, this.hotwordsScore), 31, this.ruleFsts), 31, this.ruleFars);
                }

                public final void setBlankPenalty(float f) {
/* 1 */             this.blankPenalty = f;
                }

                public final void setDecodingMethod(String str) {
/* 1 */             this.decodingMethod = str;
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

                public final void setMaxActivePaths(int i) {
/* 1 */             this.maxActivePaths = i;
                }

                public final void setModelConfig(OfflineModelConfig offlineModelConfig) {
/* 1 */             this.modelConfig = offlineModelConfig;
                }

                public final void setRuleFars(String str) {
/* 1 */             this.ruleFars = str;
                }

                public final void setRuleFsts(String str) {
/* 1 */             this.ruleFsts = str;
                }

                public String toString() {
/* 108 */           return "OfflineRecognizerConfig(featConfig=" + this.featConfig + ", modelConfig=" + this.modelConfig + ", hr=" + this.hr + ", decodingMethod=" + this.decodingMethod + ", maxActivePaths=" + this.maxActivePaths + ", hotwordsFile=" + this.hotwordsFile + ", hotwordsScore=" + this.hotwordsScore + ", ruleFsts=" + this.ruleFsts + ", ruleFars=" + this.ruleFars + ", blankPenalty=" + this.blankPenalty + ')';
                }

/* 5 */         public OfflineRecognizerConfig(FeatureConfig featureConfig, OfflineModelConfig offlineModelConfig, HomophoneReplacerConfig homophoneReplacerConfig, String str, int i, String str2, float f, String str3, String str4, float f2) {
/* 7 */             this.featConfig = featureConfig;
/* 8 */             this.modelConfig = offlineModelConfig;
/* 9 */             this.hr = homophoneReplacerConfig;
/* 10 */            this.decodingMethod = str;
/* 11 */            this.maxActivePaths = i;
/* 12 */            this.hotwordsFile = str2;
/* 13 */            this.hotwordsScore = f;
/* 14 */            this.ruleFsts = str3;
/* 15 */            this.ruleFars = str4;
/* 16 */            this.blankPenalty = f2;
                }

/* 16 */        public OfflineRecognizerConfig() {
/* 17 */            this(null, null, null, null, 0, null, 0.0f, null, null, 0.0f, 1023, null);
                }
            }
