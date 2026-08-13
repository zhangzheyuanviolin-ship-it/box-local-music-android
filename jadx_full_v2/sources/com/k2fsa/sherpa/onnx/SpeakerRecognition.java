            package com.k2fsa.sherpa.onnx;

            import android.content.res.AssetManager;
            import android.util.Log;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u001a\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/k2fsa/sherpa/onnx/SpeakerRecognition;", "", "<init>", "()V", "Landroid/content/res/AssetManager;", "assetManager", "LOoiIlOl1iI;", "initExtractor", "(Landroid/content/res/AssetManager;)V", "Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractor;", "_extractor", "Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractor;", "get_extractor", "()Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractor;", "set_extractor", "(Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingExtractor;)V", "Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingManager;", "_manager", "Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingManager;", "get_manager", "()Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingManager;", "set_manager", "(Lcom/k2fsa/sherpa/onnx/SpeakerEmbeddingManager;)V", "getExtractor", "extractor", "getManager", "manager", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
            public final class SpeakerRecognition {
                public static final SpeakerRecognition INSTANCE = new SpeakerRecognition();
                private static SpeakerEmbeddingExtractor _extractor;
                private static SpeakerEmbeddingManager _manager;

                private SpeakerRecognition() {
                }

                public static void initExtractor$default(SpeakerRecognition speakerRecognition, AssetManager assetManager, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 assetManager = null;
                    }
/* 6 */             speakerRecognition.initExtractor(assetManager);
                }

                public final SpeakerEmbeddingExtractor getExtractor() {
/* 1 */             return _extractor;
                }

                public final SpeakerEmbeddingManager getManager() {
/* 1 */             return _manager;
                }

                public final SpeakerEmbeddingExtractor get_extractor() {
/* 1 */             return _extractor;
                }

                public final SpeakerEmbeddingManager get_manager() {
/* 1 */             return _manager;
                }

                public final void initExtractor(AssetManager assetManager) {
                    synchronized (this) {
/* 4 */                 if (_extractor != null) {
/* 7 */                     return;
                        }
/* 12 */                Log.i("sherpa-onnx", "Initializing speaker embedding extractor");
/* 33 */                _extractor = new SpeakerEmbeddingExtractor(assetManager, new SpeakerEmbeddingExtractorConfig(SpeakerKt.modelName, 2, false, "cpu"));
/* 46 */                _manager = new SpeakerEmbeddingManager(_extractor.dim());
                    }
                }

                public final void set_extractor(SpeakerEmbeddingExtractor speakerEmbeddingExtractor) {
/* 1 */             _extractor = speakerEmbeddingExtractor;
                }

                public final void set_manager(SpeakerEmbeddingManager speakerEmbeddingManager) {
/* 1 */             _manager = speakerEmbeddingManager;
                }
            }
