            package com.k2fsa.sherpa.onnx;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.O0000Ioio00;
            import p000.OooioIOo1;
            
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineSpeakerDiarizationConfig;", "", "segmentation", "Lcom/k2fsa/sherpa/onnx/OfflineSpeakerSegmentationModelConfig;", "embedding", "Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractorConfig;", "clustering", "Lcom/k2fsa/sherpa/onnx/FastClusteringConfig;", "minDurationOn", "", "minDurationOff", "(Lcom/k2fsa/sherpa/onnx/OfflineSpeakerSegmentationModelConfig;Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractorConfig;Lcom/k2fsa/sherpa/onnx/FastClusteringConfig;FF)V", "getClustering", "()Lcom/k2fsa/sherpa/onnx/FastClusteringConfig;", "setClustering", "(Lcom/k2fsa/sherpa/onnx/FastClusteringConfig;)V", "getEmbedding", "()Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractorConfig;", "setEmbedding", "(Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractorConfig;)V", "getMinDurationOff", "()F", "setMinDurationOff", "(F)V", "getMinDurationOn", "setMinDurationOn", "getSegmentation", "()Lcom/k2fsa/sherpa/onnx/OfflineSpeakerSegmentationModelConfig;", "setSegmentation", "(Lcom/k2fsa/sherpa/onnx/OfflineSpeakerSegmentationModelConfig;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 63 */    public final class OfflineSpeakerDiarizationConfig {
                private FastClusteringConfig clustering;
                private SpeakerEmbeddingExtractorConfig embedding;
                private float minDurationOff;
                private float minDurationOn;
                private OfflineSpeakerSegmentationModelConfig segmentation;

                public OfflineSpeakerDiarizationConfig(OfflineSpeakerSegmentationModelConfig offlineSpeakerSegmentationModelConfig, SpeakerEmbeddingExtractorConfig speakerEmbeddingExtractorConfig, FastClusteringConfig fastClusteringConfig, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 61 */            this((i & 1) != 0 ? new OfflineSpeakerSegmentationModelConfig(null, 0, false, null, 15, null) : offlineSpeakerSegmentationModelConfig, (i & 2) != 0 ? new SpeakerEmbeddingExtractorConfig(null, 0, false, null, 15, null) : speakerEmbeddingExtractorConfig, (i & 4) != 0 ? new FastClusteringConfig(0, 0.0f, 3, null) : fastClusteringConfig, (i & 8) != 0 ? 0.2f : f, (i & 16) != 0 ? 0.5f : f2);
                }

                public static OfflineSpeakerDiarizationConfig copy$default(OfflineSpeakerDiarizationConfig offlineSpeakerDiarizationConfig, OfflineSpeakerSegmentationModelConfig offlineSpeakerSegmentationModelConfig, SpeakerEmbeddingExtractorConfig speakerEmbeddingExtractorConfig, FastClusteringConfig fastClusteringConfig, float f, float f2, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 offlineSpeakerSegmentationModelConfig = offlineSpeakerDiarizationConfig.segmentation;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                speakerEmbeddingExtractorConfig = offlineSpeakerDiarizationConfig.embedding;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                fastClusteringConfig = offlineSpeakerDiarizationConfig.clustering;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                f = offlineSpeakerDiarizationConfig.minDurationOn;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                f2 = offlineSpeakerDiarizationConfig.minDurationOff;
                    }
/* 32 */            float f3 = f2;
/* 34 */            FastClusteringConfig fastClusteringConfig2 = fastClusteringConfig;
/* 37 */            return offlineSpeakerDiarizationConfig.copy(offlineSpeakerSegmentationModelConfig, speakerEmbeddingExtractorConfig, fastClusteringConfig2, f, f3);
                }

                public final OfflineSpeakerSegmentationModelConfig getSegmentation() {
/* 1 */             return this.segmentation;
                }

                public final SpeakerEmbeddingExtractorConfig getEmbedding() {
/* 1 */             return this.embedding;
                }

                public final FastClusteringConfig getClustering() {
/* 1 */             return this.clustering;
                }

                public final float getMinDurationOn() {
/* 1 */             return this.minDurationOn;
                }

                public final float getMinDurationOff() {
/* 1 */             return this.minDurationOff;
                }

                public final OfflineSpeakerDiarizationConfig copy(OfflineSpeakerSegmentationModelConfig segmentation, SpeakerEmbeddingExtractorConfig embedding, FastClusteringConfig clustering, float minDurationOn, float minDurationOff) {
/* 3 */             return new OfflineSpeakerDiarizationConfig(segmentation, embedding, clustering, minDurationOn, minDurationOff);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineSpeakerDiarizationConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineSpeakerDiarizationConfig offlineSpeakerDiarizationConfig = (OfflineSpeakerDiarizationConfig) other;
                    return O0000Ioio00.I0000O(this.segmentation, offlineSpeakerDiarizationConfig.segmentation) && O0000Ioio00.I0000O(this.embedding, offlineSpeakerDiarizationConfig.embedding) && O0000Ioio00.I0000O(this.clustering, offlineSpeakerDiarizationConfig.clustering) && Float.compare(this.minDurationOn, offlineSpeakerDiarizationConfig.minDurationOn) == 0 && Float.compare(this.minDurationOff, offlineSpeakerDiarizationConfig.minDurationOff) == 0;
                }

                public final FastClusteringConfig getClustering() {
/* 1 */             return this.clustering;
                }

                public final SpeakerEmbeddingExtractorConfig getEmbedding() {
/* 1 */             return this.embedding;
                }

                public final float getMinDurationOff() {
/* 1 */             return this.minDurationOff;
                }

                public final float getMinDurationOn() {
/* 1 */             return this.minDurationOn;
                }

                public final OfflineSpeakerSegmentationModelConfig getSegmentation() {
/* 1 */             return this.segmentation;
                }

                public int hashCode() {
/* 38 */            return Float.hashCode(this.minDurationOff) + OooioIOo1.I0000O((this.clustering.hashCode() + ((this.embedding.hashCode() + (this.segmentation.hashCode() * 31)) * 31)) * 31, 31, this.minDurationOn);
                }

                public final void setClustering(FastClusteringConfig fastClusteringConfig) {
/* 1 */             this.clustering = fastClusteringConfig;
                }

                public final void setEmbedding(SpeakerEmbeddingExtractorConfig speakerEmbeddingExtractorConfig) {
/* 1 */             this.embedding = speakerEmbeddingExtractorConfig;
                }

                public final void setMinDurationOff(float f) {
/* 1 */             this.minDurationOff = f;
                }

                public final void setMinDurationOn(float f) {
/* 1 */             this.minDurationOn = f;
                }

                public final void setSegmentation(OfflineSpeakerSegmentationModelConfig offlineSpeakerSegmentationModelConfig) {
/* 1 */             this.segmentation = offlineSpeakerSegmentationModelConfig;
                }

                public String toString() {
/* 58 */            return "OfflineSpeakerDiarizationConfig(segmentation=" + this.segmentation + ", embedding=" + this.embedding + ", clustering=" + this.clustering + ", minDurationOn=" + this.minDurationOn + ", minDurationOff=" + this.minDurationOff + ')';
                }

/* 64 */        public OfflineSpeakerDiarizationConfig(OfflineSpeakerSegmentationModelConfig offlineSpeakerSegmentationModelConfig, SpeakerEmbeddingExtractorConfig speakerEmbeddingExtractorConfig, FastClusteringConfig fastClusteringConfig, float f, float f2) {
/* 66 */            this.segmentation = offlineSpeakerSegmentationModelConfig;
/* 67 */            this.embedding = speakerEmbeddingExtractorConfig;
/* 68 */            this.clustering = fastClusteringConfig;
/* 69 */            this.minDurationOn = f;
/* 70 */            this.minDurationOff = f2;
                }

/* 70 */        public OfflineSpeakerDiarizationConfig() {
/* 71 */            this(null, null, null, 0.0f, 0.0f, 31, null);
                }
            }
