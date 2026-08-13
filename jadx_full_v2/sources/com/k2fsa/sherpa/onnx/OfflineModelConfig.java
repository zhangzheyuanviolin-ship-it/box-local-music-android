            package com.k2fsa.sherpa.onnx;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u007f\b\u0086\b\u0018\u00002\u00020\u0001Bÿ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010*\u001a\u00020%\u0012\b\b\u0002\u0010+\u001a\u00020%\u0012\b\b\u0002\u0010,\u001a\u00020%\u0012\b\b\u0002\u0010-\u001a\u00020%\u0012\b\b\u0002\u0010.\u001a\u00020%¢\u0006\u0002\u0010/J\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u001bHÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u001fHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020!HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020#HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020'HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020)HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020%HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\rHÆ\u0003J\n\u0010 \u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0011HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0013HÆ\u0003J\u0084\u0002\u0010£\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020%2\b\b\u0002\u0010+\u001a\u00020%2\b\b\u0002\u0010,\u001a\u00020%2\b\b\u0002\u0010-\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020%HÆ\u0001J\u0015\u0010¤\u0001\u001a\u00020)2\t\u0010¥\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¦\u0001\u001a\u00020'HÖ\u0001J\n\u0010§\u0001\u001a\u00020%HÖ\u0001R\u001a\u0010.\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010+\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u00101\"\u0004\bU\u00103R\u001a\u0010-\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u00101\"\u0004\bW\u00103R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010*\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u00101\"\u0004\bm\u00103R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u00101\"\u0004\bw\u00103R\u001a\u0010,\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u00101\"\u0004\by\u00103R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001c\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001e\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001e\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006¨\u0001"}, d2 = {"Lcom/k2fsa/sherpa/onnx/OfflineModelConfig;", "", "transducer", "Lcom/k2fsa/sherpa/onnx/OfflineTransducerModelConfig;", "paraformer", "Lcom/k2fsa/sherpa/onnx/OfflineParaformerModelConfig;", "whisper", "Lcom/k2fsa/sherpa/onnx/OfflineWhisperModelConfig;", "fireRedAsr", "Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrModelConfig;", "moonshine", "Lcom/k2fsa/sherpa/onnx/OfflineMoonshineModelConfig;", "nemo", "Lcom/k2fsa/sherpa/onnx/OfflineNemoEncDecCtcModelConfig;", "senseVoice", "Lcom/k2fsa/sherpa/onnx/OfflineSenseVoiceModelConfig;", "dolphin", "Lcom/k2fsa/sherpa/onnx/OfflineDolphinModelConfig;", "zipformerCtc", "Lcom/k2fsa/sherpa/onnx/OfflineZipformerCtcModelConfig;", "wenetCtc", "Lcom/k2fsa/sherpa/onnx/OfflineWenetCtcModelConfig;", "omnilingual", "Lcom/k2fsa/sherpa/onnx/OfflineOmnilingualAsrCtcModelConfig;", "medasr", "Lcom/k2fsa/sherpa/onnx/OfflineMedAsrCtcModelConfig;", "funasrNano", "Lcom/k2fsa/sherpa/onnx/OfflineFunAsrNanoModelConfig;", "qwen3Asr", "Lcom/k2fsa/sherpa/onnx/OfflineQwen3AsrModelConfig;", "fireRedAsrCtc", "Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrCtcModelConfig;", "canary", "Lcom/k2fsa/sherpa/onnx/OfflineCanaryModelConfig;", "cohereTranscribe", "Lcom/k2fsa/sherpa/onnx/OfflineCohereTranscribeModelConfig;", "teleSpeech", "", "numThreads", "", "debug", "", "provider", "modelType", "tokens", "modelingUnit", "bpeVocab", "(Lcom/k2fsa/sherpa/onnx/OfflineTransducerModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineParaformerModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineWhisperModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineMoonshineModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineNemoEncDecCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineSenseVoiceModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineDolphinModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineZipformerCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineWenetCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineOmnilingualAsrCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineMedAsrCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineFunAsrNanoModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineQwen3AsrModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrCtcModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineCanaryModelConfig;Lcom/k2fsa/sherpa/onnx/OfflineCohereTranscribeModelConfig;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBpeVocab", "()Ljava/lang/String;", "setBpeVocab", "(Ljava/lang/String;)V", "getCanary", "()Lcom/k2fsa/sherpa/onnx/OfflineCanaryModelConfig;", "setCanary", "(Lcom/k2fsa/sherpa/onnx/OfflineCanaryModelConfig;)V", "getCohereTranscribe", "()Lcom/k2fsa/sherpa/onnx/OfflineCohereTranscribeModelConfig;", "setCohereTranscribe", "(Lcom/k2fsa/sherpa/onnx/OfflineCohereTranscribeModelConfig;)V", "getDebug", "()Z", "setDebug", "(Z)V", "getDolphin", "()Lcom/k2fsa/sherpa/onnx/OfflineDolphinModelConfig;", "setDolphin", "(Lcom/k2fsa/sherpa/onnx/OfflineDolphinModelConfig;)V", "getFireRedAsr", "()Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrModelConfig;", "setFireRedAsr", "(Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrModelConfig;)V", "getFireRedAsrCtc", "()Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrCtcModelConfig;", "setFireRedAsrCtc", "(Lcom/k2fsa/sherpa/onnx/OfflineFireRedAsrCtcModelConfig;)V", "getFunasrNano", "()Lcom/k2fsa/sherpa/onnx/OfflineFunAsrNanoModelConfig;", "setFunasrNano", "(Lcom/k2fsa/sherpa/onnx/OfflineFunAsrNanoModelConfig;)V", "getMedasr", "()Lcom/k2fsa/sherpa/onnx/OfflineMedAsrCtcModelConfig;", "setMedasr", "(Lcom/k2fsa/sherpa/onnx/OfflineMedAsrCtcModelConfig;)V", "getModelType", "setModelType", "getModelingUnit", "setModelingUnit", "getMoonshine", "()Lcom/k2fsa/sherpa/onnx/OfflineMoonshineModelConfig;", "setMoonshine", "(Lcom/k2fsa/sherpa/onnx/OfflineMoonshineModelConfig;)V", "getNemo", "()Lcom/k2fsa/sherpa/onnx/OfflineNemoEncDecCtcModelConfig;", "setNemo", "(Lcom/k2fsa/sherpa/onnx/OfflineNemoEncDecCtcModelConfig;)V", "getNumThreads", "()I", "setNumThreads", "(I)V", "getOmnilingual", "()Lcom/k2fsa/sherpa/onnx/OfflineOmnilingualAsrCtcModelConfig;", "setOmnilingual", "(Lcom/k2fsa/sherpa/onnx/OfflineOmnilingualAsrCtcModelConfig;)V", "getParaformer", "()Lcom/k2fsa/sherpa/onnx/OfflineParaformerModelConfig;", "setParaformer", "(Lcom/k2fsa/sherpa/onnx/OfflineParaformerModelConfig;)V", "getProvider", "setProvider", "getQwen3Asr", "()Lcom/k2fsa/sherpa/onnx/OfflineQwen3AsrModelConfig;", "setQwen3Asr", "(Lcom/k2fsa/sherpa/onnx/OfflineQwen3AsrModelConfig;)V", "getSenseVoice", "()Lcom/k2fsa/sherpa/onnx/OfflineSenseVoiceModelConfig;", "setSenseVoice", "(Lcom/k2fsa/sherpa/onnx/OfflineSenseVoiceModelConfig;)V", "getTeleSpeech", "setTeleSpeech", "getTokens", "setTokens", "getTransducer", "()Lcom/k2fsa/sherpa/onnx/OfflineTransducerModelConfig;", "setTransducer", "(Lcom/k2fsa/sherpa/onnx/OfflineTransducerModelConfig;)V", "getWenetCtc", "()Lcom/k2fsa/sherpa/onnx/OfflineWenetCtcModelConfig;", "setWenetCtc", "(Lcom/k2fsa/sherpa/onnx/OfflineWenetCtcModelConfig;)V", "getWhisper", "()Lcom/k2fsa/sherpa/onnx/OfflineWhisperModelConfig;", "setWhisper", "(Lcom/k2fsa/sherpa/onnx/OfflineWhisperModelConfig;)V", "getZipformerCtc", "()Lcom/k2fsa/sherpa/onnx/OfflineZipformerCtcModelConfig;", "setZipformerCtc", "(Lcom/k2fsa/sherpa/onnx/OfflineZipformerCtcModelConfig;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "sherpa_onnx_release"}, m18k = 1, mv = {1, 7, 1}, xi = 48)
/* 19 */    public final class OfflineModelConfig {
                private String bpeVocab;
                private OfflineCanaryModelConfig canary;
                private OfflineCohereTranscribeModelConfig cohereTranscribe;
                private boolean debug;
                private OfflineDolphinModelConfig dolphin;
                private OfflineFireRedAsrModelConfig fireRedAsr;
                private OfflineFireRedAsrCtcModelConfig fireRedAsrCtc;
                private OfflineFunAsrNanoModelConfig funasrNano;
                private OfflineMedAsrCtcModelConfig medasr;
                private String modelType;
                private String modelingUnit;
                private OfflineMoonshineModelConfig moonshine;
                private OfflineNemoEncDecCtcModelConfig nemo;
                private int numThreads;
                private OfflineOmnilingualAsrCtcModelConfig omnilingual;
                private OfflineParaformerModelConfig paraformer;
                private String provider;
                private OfflineQwen3AsrModelConfig qwen3Asr;
                private OfflineSenseVoiceModelConfig senseVoice;
                private String teleSpeech;
                private String tokens;
                private OfflineTransducerModelConfig transducer;
                private OfflineWenetCtcModelConfig wenetCtc;
                private OfflineWhisperModelConfig whisper;
                private OfflineZipformerCtcModelConfig zipformerCtc;

                public OfflineModelConfig(OfflineTransducerModelConfig offlineTransducerModelConfig, OfflineParaformerModelConfig offlineParaformerModelConfig, OfflineWhisperModelConfig offlineWhisperModelConfig, OfflineFireRedAsrModelConfig offlineFireRedAsrModelConfig, OfflineMoonshineModelConfig offlineMoonshineModelConfig, OfflineNemoEncDecCtcModelConfig offlineNemoEncDecCtcModelConfig, OfflineSenseVoiceModelConfig offlineSenseVoiceModelConfig, OfflineDolphinModelConfig offlineDolphinModelConfig, OfflineZipformerCtcModelConfig offlineZipformerCtcModelConfig, OfflineWenetCtcModelConfig offlineWenetCtcModelConfig, OfflineOmnilingualAsrCtcModelConfig offlineOmnilingualAsrCtcModelConfig, OfflineMedAsrCtcModelConfig offlineMedAsrCtcModelConfig, OfflineFunAsrNanoModelConfig offlineFunAsrNanoModelConfig, OfflineQwen3AsrModelConfig offlineQwen3AsrModelConfig, OfflineFireRedAsrCtcModelConfig offlineFireRedAsrCtcModelConfig, OfflineCanaryModelConfig offlineCanaryModelConfig, OfflineCohereTranscribeModelConfig offlineCohereTranscribeModelConfig, String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 20 */            this((i2 & 1) != 0 ? new OfflineTransducerModelConfig(null, null, null, 7, null) : offlineTransducerModelConfig, (i2 & 2) != 0 ? new OfflineParaformerModelConfig(null, null, 3, null) : offlineParaformerModelConfig, (i2 & 4) != 0 ? new OfflineWhisperModelConfig(null, null, null, null, 0, false, false, 127, null) : offlineWhisperModelConfig, (i2 & 8) != 0 ? new OfflineFireRedAsrModelConfig(null, null, 3, null) : offlineFireRedAsrModelConfig, (i2 & 16) != 0 ? new OfflineMoonshineModelConfig(null, null, null, null, null, 31, null) : offlineMoonshineModelConfig, (i2 & 32) != 0 ? new OfflineNemoEncDecCtcModelConfig(null, 1, null) : offlineNemoEncDecCtcModelConfig, (i2 & 64) != 0 ? new OfflineSenseVoiceModelConfig(null, null, false, null, 15, null) : offlineSenseVoiceModelConfig, (i2 & Barcode.FORMAT_ITF) != 0 ? new OfflineDolphinModelConfig(null, 1, null) : offlineDolphinModelConfig, (i2 & Barcode.FORMAT_QR_CODE) != 0 ? new OfflineZipformerCtcModelConfig(null, null, 3, null) : offlineZipformerCtcModelConfig, (i2 & Barcode.FORMAT_UPC_A) != 0 ? new OfflineWenetCtcModelConfig(null, 1, null) : offlineWenetCtcModelConfig, (i2 & Barcode.FORMAT_UPC_E) != 0 ? new OfflineOmnilingualAsrCtcModelConfig(null, 1, null) : offlineOmnilingualAsrCtcModelConfig, (i2 & Barcode.FORMAT_PDF417) != 0 ? new OfflineMedAsrCtcModelConfig(null, 1, null) : offlineMedAsrCtcModelConfig, (i2 & Barcode.FORMAT_AZTEC) != 0 ? new OfflineFunAsrNanoModelConfig(null, null, null, null, null, null, 0, 0.0f, 0.0f, 0, null, false, null, 8191, null) : offlineFunAsrNanoModelConfig, (i2 & 8192) != 0 ? new OfflineQwen3AsrModelConfig(null, null, null, null, 0, 0, 0.0f, 0.0f, 0, null, 1023, null) : offlineQwen3AsrModelConfig, (i2 & 16384) != 0 ? new OfflineFireRedAsrCtcModelConfig(null, 1, null) : offlineFireRedAsrCtcModelConfig, (i2 & 32768) != 0 ? new OfflineCanaryModelConfig(null, null, null, null, false, 31, null) : offlineCanaryModelConfig, (i2 & 65536) != 0 ? new OfflineCohereTranscribeModelConfig(null, null, null, false, false, 31, null) : offlineCohereTranscribeModelConfig, (i2 & 131072) != 0 ? "" : str, (i2 & 262144) == 0 ? i : 1, (i2 & 524288) != 0 ? false : z, (i2 & 1048576) != 0 ? "cpu" : str2, (i2 & 2097152) != 0 ? "" : str3, (i2 & 4194304) != 0 ? "" : str4, (i2 & 8388608) != 0 ? "" : str5, (i2 & 16777216) != 0 ? "" : str6);
                }

                public static OfflineModelConfig copy$default(OfflineModelConfig offlineModelConfig, OfflineTransducerModelConfig offlineTransducerModelConfig, OfflineParaformerModelConfig offlineParaformerModelConfig, OfflineWhisperModelConfig offlineWhisperModelConfig, OfflineFireRedAsrModelConfig offlineFireRedAsrModelConfig, OfflineMoonshineModelConfig offlineMoonshineModelConfig, OfflineNemoEncDecCtcModelConfig offlineNemoEncDecCtcModelConfig, OfflineSenseVoiceModelConfig offlineSenseVoiceModelConfig, OfflineDolphinModelConfig offlineDolphinModelConfig, OfflineZipformerCtcModelConfig offlineZipformerCtcModelConfig, OfflineWenetCtcModelConfig offlineWenetCtcModelConfig, OfflineOmnilingualAsrCtcModelConfig offlineOmnilingualAsrCtcModelConfig, OfflineMedAsrCtcModelConfig offlineMedAsrCtcModelConfig, OfflineFunAsrNanoModelConfig offlineFunAsrNanoModelConfig, OfflineQwen3AsrModelConfig offlineQwen3AsrModelConfig, OfflineFireRedAsrCtcModelConfig offlineFireRedAsrCtcModelConfig, OfflineCanaryModelConfig offlineCanaryModelConfig, OfflineCohereTranscribeModelConfig offlineCohereTranscribeModelConfig, String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
                    String str7;
                    String str8;
/* 1 */             OfflineTransducerModelConfig offlineTransducerModelConfig2 = (i2 & 1) != 0 ? offlineModelConfig.transducer : offlineTransducerModelConfig;
/* 1 */             OfflineParaformerModelConfig offlineParaformerModelConfig2 = (i2 & 2) != 0 ? offlineModelConfig.paraformer : offlineParaformerModelConfig;
/* 1 */             OfflineWhisperModelConfig offlineWhisperModelConfig2 = (i2 & 4) != 0 ? offlineModelConfig.whisper : offlineWhisperModelConfig;
/* 1 */             OfflineFireRedAsrModelConfig offlineFireRedAsrModelConfig2 = (i2 & 8) != 0 ? offlineModelConfig.fireRedAsr : offlineFireRedAsrModelConfig;
/* 1 */             OfflineMoonshineModelConfig offlineMoonshineModelConfig2 = (i2 & 16) != 0 ? offlineModelConfig.moonshine : offlineMoonshineModelConfig;
/* 1 */             OfflineNemoEncDecCtcModelConfig offlineNemoEncDecCtcModelConfig2 = (i2 & 32) != 0 ? offlineModelConfig.nemo : offlineNemoEncDecCtcModelConfig;
/* 1 */             OfflineSenseVoiceModelConfig offlineSenseVoiceModelConfig2 = (i2 & 64) != 0 ? offlineModelConfig.senseVoice : offlineSenseVoiceModelConfig;
/* 1 */             OfflineDolphinModelConfig offlineDolphinModelConfig2 = (i2 & Barcode.FORMAT_ITF) != 0 ? offlineModelConfig.dolphin : offlineDolphinModelConfig;
/* 1 */             OfflineZipformerCtcModelConfig offlineZipformerCtcModelConfig2 = (i2 & Barcode.FORMAT_QR_CODE) != 0 ? offlineModelConfig.zipformerCtc : offlineZipformerCtcModelConfig;
/* 1 */             OfflineWenetCtcModelConfig offlineWenetCtcModelConfig2 = (i2 & Barcode.FORMAT_UPC_A) != 0 ? offlineModelConfig.wenetCtc : offlineWenetCtcModelConfig;
/* 1 */             OfflineOmnilingualAsrCtcModelConfig offlineOmnilingualAsrCtcModelConfig2 = (i2 & Barcode.FORMAT_UPC_E) != 0 ? offlineModelConfig.omnilingual : offlineOmnilingualAsrCtcModelConfig;
/* 1 */             OfflineMedAsrCtcModelConfig offlineMedAsrCtcModelConfig2 = (i2 & Barcode.FORMAT_PDF417) != 0 ? offlineModelConfig.medasr : offlineMedAsrCtcModelConfig;
/* 1 */             OfflineFunAsrNanoModelConfig offlineFunAsrNanoModelConfig2 = (i2 & Barcode.FORMAT_AZTEC) != 0 ? offlineModelConfig.funasrNano : offlineFunAsrNanoModelConfig;
/* 1 */             OfflineQwen3AsrModelConfig offlineQwen3AsrModelConfig2 = (i2 & 8192) != 0 ? offlineModelConfig.qwen3Asr : offlineQwen3AsrModelConfig;
                    OfflineTransducerModelConfig offlineTransducerModelConfig3 = offlineTransducerModelConfig2;
/* 1 */             OfflineFireRedAsrCtcModelConfig offlineFireRedAsrCtcModelConfig2 = (i2 & 16384) != 0 ? offlineModelConfig.fireRedAsrCtc : offlineFireRedAsrCtcModelConfig;
/* 1 */             OfflineCanaryModelConfig offlineCanaryModelConfig2 = (i2 & 32768) != 0 ? offlineModelConfig.canary : offlineCanaryModelConfig;
/* 1 */             OfflineCohereTranscribeModelConfig offlineCohereTranscribeModelConfig2 = (i2 & 65536) != 0 ? offlineModelConfig.cohereTranscribe : offlineCohereTranscribeModelConfig;
/* 1 */             String str9 = (i2 & 131072) != 0 ? offlineModelConfig.teleSpeech : str;
/* 1 */             int i3 = (i2 & 262144) != 0 ? offlineModelConfig.numThreads : i;
/* 1 */             boolean z2 = (i2 & 524288) != 0 ? offlineModelConfig.debug : z;
/* 1 */             String str10 = (i2 & 1048576) != 0 ? offlineModelConfig.provider : str2;
/* 1 */             String str11 = (i2 & 2097152) != 0 ? offlineModelConfig.modelType : str3;
/* 1 */             String str12 = (i2 & 4194304) != 0 ? offlineModelConfig.tokens : str4;
/* 1 */             String str13 = (i2 & 8388608) != 0 ? offlineModelConfig.modelingUnit : str5;
                    if ((i2 & 16777216) != 0) {
                        str8 = str13;
/* 1 */                 str7 = offlineModelConfig.bpeVocab;
                    } else {
                        str7 = str6;
                        str8 = str13;
                    }
/* 1 */             return offlineModelConfig.copy(offlineTransducerModelConfig3, offlineParaformerModelConfig2, offlineWhisperModelConfig2, offlineFireRedAsrModelConfig2, offlineMoonshineModelConfig2, offlineNemoEncDecCtcModelConfig2, offlineSenseVoiceModelConfig2, offlineDolphinModelConfig2, offlineZipformerCtcModelConfig2, offlineWenetCtcModelConfig2, offlineOmnilingualAsrCtcModelConfig2, offlineMedAsrCtcModelConfig2, offlineFunAsrNanoModelConfig2, offlineQwen3AsrModelConfig2, offlineFireRedAsrCtcModelConfig2, offlineCanaryModelConfig2, offlineCohereTranscribeModelConfig2, str9, i3, z2, str10, str11, str12, str8, str7);
                }

                public final OfflineTransducerModelConfig getTransducer() {
/* 1 */             return this.transducer;
                }

                public final OfflineWenetCtcModelConfig getWenetCtc() {
/* 1 */             return this.wenetCtc;
                }

                public final OfflineOmnilingualAsrCtcModelConfig getOmnilingual() {
/* 1 */             return this.omnilingual;
                }

                public final OfflineMedAsrCtcModelConfig getMedasr() {
/* 1 */             return this.medasr;
                }

                public final OfflineFunAsrNanoModelConfig getFunasrNano() {
/* 1 */             return this.funasrNano;
                }

                public final OfflineQwen3AsrModelConfig getQwen3Asr() {
/* 1 */             return this.qwen3Asr;
                }

                public final OfflineFireRedAsrCtcModelConfig getFireRedAsrCtc() {
/* 1 */             return this.fireRedAsrCtc;
                }

                public final OfflineCanaryModelConfig getCanary() {
/* 1 */             return this.canary;
                }

                public final OfflineCohereTranscribeModelConfig getCohereTranscribe() {
/* 1 */             return this.cohereTranscribe;
                }

                public final String getTeleSpeech() {
/* 1 */             return this.teleSpeech;
                }

                public final int getNumThreads() {
/* 1 */             return this.numThreads;
                }

                public final OfflineParaformerModelConfig getParaformer() {
/* 1 */             return this.paraformer;
                }

                public final boolean getDebug() {
/* 1 */             return this.debug;
                }

                public final String getProvider() {
/* 1 */             return this.provider;
                }

                public final String getModelType() {
/* 1 */             return this.modelType;
                }

                public final String getTokens() {
/* 1 */             return this.tokens;
                }

                public final String getModelingUnit() {
/* 1 */             return this.modelingUnit;
                }

                public final String getBpeVocab() {
/* 1 */             return this.bpeVocab;
                }

                public final OfflineWhisperModelConfig getWhisper() {
/* 1 */             return this.whisper;
                }

                public final OfflineFireRedAsrModelConfig getFireRedAsr() {
/* 1 */             return this.fireRedAsr;
                }

                public final OfflineMoonshineModelConfig getMoonshine() {
/* 1 */             return this.moonshine;
                }

                public final OfflineNemoEncDecCtcModelConfig getNemo() {
/* 1 */             return this.nemo;
                }

                public final OfflineSenseVoiceModelConfig getSenseVoice() {
/* 1 */             return this.senseVoice;
                }

                public final OfflineDolphinModelConfig getDolphin() {
/* 1 */             return this.dolphin;
                }

                public final OfflineZipformerCtcModelConfig getZipformerCtc() {
/* 1 */             return this.zipformerCtc;
                }

                public final OfflineModelConfig copy(OfflineTransducerModelConfig transducer, OfflineParaformerModelConfig paraformer, OfflineWhisperModelConfig whisper, OfflineFireRedAsrModelConfig fireRedAsr, OfflineMoonshineModelConfig moonshine, OfflineNemoEncDecCtcModelConfig nemo, OfflineSenseVoiceModelConfig senseVoice, OfflineDolphinModelConfig dolphin, OfflineZipformerCtcModelConfig zipformerCtc, OfflineWenetCtcModelConfig wenetCtc, OfflineOmnilingualAsrCtcModelConfig omnilingual, OfflineMedAsrCtcModelConfig medasr, OfflineFunAsrNanoModelConfig funasrNano, OfflineQwen3AsrModelConfig qwen3Asr, OfflineFireRedAsrCtcModelConfig fireRedAsrCtc, OfflineCanaryModelConfig canary, OfflineCohereTranscribeModelConfig cohereTranscribe, String teleSpeech, int numThreads, boolean debug, String provider, String modelType, String tokens, String modelingUnit, String bpeVocab) {
/* 1 */             return new OfflineModelConfig(transducer, paraformer, whisper, fireRedAsr, moonshine, nemo, senseVoice, dolphin, zipformerCtc, wenetCtc, omnilingual, medasr, funasrNano, qwen3Asr, fireRedAsrCtc, canary, cohereTranscribe, teleSpeech, numThreads, debug, provider, modelType, tokens, modelingUnit, bpeVocab);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof OfflineModelConfig)) {
/* 7 */                 return false;
                    }
/* 11 */            OfflineModelConfig offlineModelConfig = (OfflineModelConfig) other;
                    return O0000Ioio00.I0000O(this.transducer, offlineModelConfig.transducer) && O0000Ioio00.I0000O(this.paraformer, offlineModelConfig.paraformer) && O0000Ioio00.I0000O(this.whisper, offlineModelConfig.whisper) && O0000Ioio00.I0000O(this.fireRedAsr, offlineModelConfig.fireRedAsr) && O0000Ioio00.I0000O(this.moonshine, offlineModelConfig.moonshine) && O0000Ioio00.I0000O(this.nemo, offlineModelConfig.nemo) && O0000Ioio00.I0000O(this.senseVoice, offlineModelConfig.senseVoice) && O0000Ioio00.I0000O(this.dolphin, offlineModelConfig.dolphin) && O0000Ioio00.I0000O(this.zipformerCtc, offlineModelConfig.zipformerCtc) && O0000Ioio00.I0000O(this.wenetCtc, offlineModelConfig.wenetCtc) && O0000Ioio00.I0000O(this.omnilingual, offlineModelConfig.omnilingual) && O0000Ioio00.I0000O(this.medasr, offlineModelConfig.medasr) && O0000Ioio00.I0000O(this.funasrNano, offlineModelConfig.funasrNano) && O0000Ioio00.I0000O(this.qwen3Asr, offlineModelConfig.qwen3Asr) && O0000Ioio00.I0000O(this.fireRedAsrCtc, offlineModelConfig.fireRedAsrCtc) && O0000Ioio00.I0000O(this.canary, offlineModelConfig.canary) && O0000Ioio00.I0000O(this.cohereTranscribe, offlineModelConfig.cohereTranscribe) && O0000Ioio00.I0000O(this.teleSpeech, offlineModelConfig.teleSpeech) && this.numThreads == offlineModelConfig.numThreads && this.debug == offlineModelConfig.debug && O0000Ioio00.I0000O(this.provider, offlineModelConfig.provider) && O0000Ioio00.I0000O(this.modelType, offlineModelConfig.modelType) && O0000Ioio00.I0000O(this.tokens, offlineModelConfig.tokens) && O0000Ioio00.I0000O(this.modelingUnit, offlineModelConfig.modelingUnit) && O0000Ioio00.I0000O(this.bpeVocab, offlineModelConfig.bpeVocab);
                }

                public final String getBpeVocab() {
/* 1 */             return this.bpeVocab;
                }

                public final OfflineCanaryModelConfig getCanary() {
/* 1 */             return this.canary;
                }

                public final OfflineCohereTranscribeModelConfig getCohereTranscribe() {
/* 1 */             return this.cohereTranscribe;
                }

                public final boolean getDebug() {
/* 1 */             return this.debug;
                }

                public final OfflineDolphinModelConfig getDolphin() {
/* 1 */             return this.dolphin;
                }

                public final OfflineFireRedAsrModelConfig getFireRedAsr() {
/* 1 */             return this.fireRedAsr;
                }

                public final OfflineFireRedAsrCtcModelConfig getFireRedAsrCtc() {
/* 1 */             return this.fireRedAsrCtc;
                }

                public final OfflineFunAsrNanoModelConfig getFunasrNano() {
/* 1 */             return this.funasrNano;
                }

                public final OfflineMedAsrCtcModelConfig getMedasr() {
/* 1 */             return this.medasr;
                }

                public final String getModelType() {
/* 1 */             return this.modelType;
                }

                public final String getModelingUnit() {
/* 1 */             return this.modelingUnit;
                }

                public final OfflineMoonshineModelConfig getMoonshine() {
/* 1 */             return this.moonshine;
                }

                public final OfflineNemoEncDecCtcModelConfig getNemo() {
/* 1 */             return this.nemo;
                }

                public final int getNumThreads() {
/* 1 */             return this.numThreads;
                }

                public final OfflineOmnilingualAsrCtcModelConfig getOmnilingual() {
/* 1 */             return this.omnilingual;
                }

                public final OfflineParaformerModelConfig getParaformer() {
/* 1 */             return this.paraformer;
                }

                public final String getProvider() {
/* 1 */             return this.provider;
                }

                public final OfflineQwen3AsrModelConfig getQwen3Asr() {
/* 1 */             return this.qwen3Asr;
                }

                public final OfflineSenseVoiceModelConfig getSenseVoice() {
/* 1 */             return this.senseVoice;
                }

                public final String getTeleSpeech() {
/* 1 */             return this.teleSpeech;
                }

                public final String getTokens() {
/* 1 */             return this.tokens;
                }

                public final OfflineTransducerModelConfig getTransducer() {
/* 1 */             return this.transducer;
                }

                public final OfflineWenetCtcModelConfig getWenetCtc() {
/* 1 */             return this.wenetCtc;
                }

                public final OfflineWhisperModelConfig getWhisper() {
/* 1 */             return this.whisper;
                }

                public final OfflineZipformerCtcModelConfig getZipformerCtc() {
/* 1 */             return this.zipformerCtc;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
/* 146 */           int iI0000O = IIl001iO0Io.I0000O(this.numThreads, Oi010OO0.I000O01llI0((this.cohereTranscribe.hashCode() + ((this.canary.hashCode() + ((this.fireRedAsrCtc.hashCode() + ((this.qwen3Asr.hashCode() + ((this.funasrNano.hashCode() + ((this.medasr.hashCode() + ((this.omnilingual.hashCode() + ((this.wenetCtc.hashCode() + ((this.zipformerCtc.hashCode() + ((this.dolphin.hashCode() + ((this.senseVoice.hashCode() + ((this.nemo.hashCode() + ((this.moonshine.hashCode() + ((this.fireRedAsr.hashCode() + ((this.whisper.hashCode() + ((this.paraformer.hashCode() + (this.transducer.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.teleSpeech), 31);
/* 150 */           boolean z = this.debug;
                    int i = z;
/* 152 */           if (z != 0) {
/* 154 */               i = 1;
                    }
/* 187 */           return this.bpeVocab.hashCode() + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0((iI0000O + i) * 31, 31, this.provider), 31, this.modelType), 31, this.tokens), 31, this.modelingUnit);
                }

                public final void setBpeVocab(String str) {
/* 1 */             this.bpeVocab = str;
                }

                public final void setCanary(OfflineCanaryModelConfig offlineCanaryModelConfig) {
/* 1 */             this.canary = offlineCanaryModelConfig;
                }

                public final void setCohereTranscribe(OfflineCohereTranscribeModelConfig offlineCohereTranscribeModelConfig) {
/* 1 */             this.cohereTranscribe = offlineCohereTranscribeModelConfig;
                }

                public final void setDebug(boolean z) {
/* 1 */             this.debug = z;
                }

                public final void setDolphin(OfflineDolphinModelConfig offlineDolphinModelConfig) {
/* 1 */             this.dolphin = offlineDolphinModelConfig;
                }

                public final void setFireRedAsr(OfflineFireRedAsrModelConfig offlineFireRedAsrModelConfig) {
/* 1 */             this.fireRedAsr = offlineFireRedAsrModelConfig;
                }

                public final void setFireRedAsrCtc(OfflineFireRedAsrCtcModelConfig offlineFireRedAsrCtcModelConfig) {
/* 1 */             this.fireRedAsrCtc = offlineFireRedAsrCtcModelConfig;
                }

                public final void setFunasrNano(OfflineFunAsrNanoModelConfig offlineFunAsrNanoModelConfig) {
/* 1 */             this.funasrNano = offlineFunAsrNanoModelConfig;
                }

                public final void setMedasr(OfflineMedAsrCtcModelConfig offlineMedAsrCtcModelConfig) {
/* 1 */             this.medasr = offlineMedAsrCtcModelConfig;
                }

                public final void setModelType(String str) {
/* 1 */             this.modelType = str;
                }

                public final void setModelingUnit(String str) {
/* 1 */             this.modelingUnit = str;
                }

                public final void setMoonshine(OfflineMoonshineModelConfig offlineMoonshineModelConfig) {
/* 1 */             this.moonshine = offlineMoonshineModelConfig;
                }

                public final void setNemo(OfflineNemoEncDecCtcModelConfig offlineNemoEncDecCtcModelConfig) {
/* 1 */             this.nemo = offlineNemoEncDecCtcModelConfig;
                }

                public final void setNumThreads(int i) {
/* 1 */             this.numThreads = i;
                }

                public final void setOmnilingual(OfflineOmnilingualAsrCtcModelConfig offlineOmnilingualAsrCtcModelConfig) {
/* 1 */             this.omnilingual = offlineOmnilingualAsrCtcModelConfig;
                }

                public final void setParaformer(OfflineParaformerModelConfig offlineParaformerModelConfig) {
/* 1 */             this.paraformer = offlineParaformerModelConfig;
                }

                public final void setProvider(String str) {
/* 1 */             this.provider = str;
                }

                public final void setQwen3Asr(OfflineQwen3AsrModelConfig offlineQwen3AsrModelConfig) {
/* 1 */             this.qwen3Asr = offlineQwen3AsrModelConfig;
                }

                public final void setSenseVoice(OfflineSenseVoiceModelConfig offlineSenseVoiceModelConfig) {
/* 1 */             this.senseVoice = offlineSenseVoiceModelConfig;
                }

                public final void setTeleSpeech(String str) {
/* 1 */             this.teleSpeech = str;
                }

                public final void setTokens(String str) {
/* 1 */             this.tokens = str;
                }

                public final void setTransducer(OfflineTransducerModelConfig offlineTransducerModelConfig) {
/* 1 */             this.transducer = offlineTransducerModelConfig;
                }

                public final void setWenetCtc(OfflineWenetCtcModelConfig offlineWenetCtcModelConfig) {
/* 1 */             this.wenetCtc = offlineWenetCtcModelConfig;
                }

                public final void setWhisper(OfflineWhisperModelConfig offlineWhisperModelConfig) {
/* 1 */             this.whisper = offlineWhisperModelConfig;
                }

                public final void setZipformerCtc(OfflineZipformerCtcModelConfig offlineZipformerCtcModelConfig) {
/* 1 */             this.zipformerCtc = offlineZipformerCtcModelConfig;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OfflineModelConfig(transducer=");
/* 10 */            sb.append(this.transducer);
/* 15 */            sb.append(", paraformer=");
/* 20 */            sb.append(this.paraformer);
/* 25 */            sb.append(", whisper=");
/* 30 */            sb.append(this.whisper);
/* 35 */            sb.append(", fireRedAsr=");
/* 40 */            sb.append(this.fireRedAsr);
/* 45 */            sb.append(", moonshine=");
/* 50 */            sb.append(this.moonshine);
/* 55 */            sb.append(", nemo=");
/* 60 */            sb.append(this.nemo);
/* 65 */            sb.append(", senseVoice=");
/* 70 */            sb.append(this.senseVoice);
/* 75 */            sb.append(", dolphin=");
/* 80 */            sb.append(this.dolphin);
/* 85 */            sb.append(", zipformerCtc=");
/* 90 */            sb.append(this.zipformerCtc);
/* 95 */            sb.append(", wenetCtc=");
/* 100 */           sb.append(this.wenetCtc);
/* 105 */           sb.append(", omnilingual=");
/* 110 */           sb.append(this.omnilingual);
/* 115 */           sb.append(", medasr=");
/* 120 */           sb.append(this.medasr);
/* 125 */           sb.append(", funasrNano=");
/* 130 */           sb.append(this.funasrNano);
/* 135 */           sb.append(", qwen3Asr=");
/* 140 */           sb.append(this.qwen3Asr);
/* 145 */           sb.append(", fireRedAsrCtc=");
/* 150 */           sb.append(this.fireRedAsrCtc);
/* 155 */           sb.append(", canary=");
/* 160 */           sb.append(this.canary);
/* 165 */           sb.append(", cohereTranscribe=");
/* 170 */           sb.append(this.cohereTranscribe);
/* 175 */           sb.append(", teleSpeech=");
/* 180 */           sb.append(this.teleSpeech);
/* 185 */           sb.append(", numThreads=");
/* 190 */           sb.append(this.numThreads);
/* 195 */           sb.append(", debug=");
/* 200 */           sb.append(this.debug);
/* 205 */           sb.append(", provider=");
/* 210 */           sb.append(this.provider);
/* 215 */           sb.append(", modelType=");
/* 220 */           sb.append(this.modelType);
/* 225 */           sb.append(", tokens=");
/* 230 */           sb.append(this.tokens);
/* 235 */           sb.append(", modelingUnit=");
/* 240 */           sb.append(this.modelingUnit);
/* 245 */           sb.append(", bpeVocab=");
/* 252 */           return IlIi0I0.I000oI1ioi(sb, this.bpeVocab, ')');
                }

/* 20 */        public OfflineModelConfig(OfflineTransducerModelConfig offlineTransducerModelConfig, OfflineParaformerModelConfig offlineParaformerModelConfig, OfflineWhisperModelConfig offlineWhisperModelConfig, OfflineFireRedAsrModelConfig offlineFireRedAsrModelConfig, OfflineMoonshineModelConfig offlineMoonshineModelConfig, OfflineNemoEncDecCtcModelConfig offlineNemoEncDecCtcModelConfig, OfflineSenseVoiceModelConfig offlineSenseVoiceModelConfig, OfflineDolphinModelConfig offlineDolphinModelConfig, OfflineZipformerCtcModelConfig offlineZipformerCtcModelConfig, OfflineWenetCtcModelConfig offlineWenetCtcModelConfig, OfflineOmnilingualAsrCtcModelConfig offlineOmnilingualAsrCtcModelConfig, OfflineMedAsrCtcModelConfig offlineMedAsrCtcModelConfig, OfflineFunAsrNanoModelConfig offlineFunAsrNanoModelConfig, OfflineQwen3AsrModelConfig offlineQwen3AsrModelConfig, OfflineFireRedAsrCtcModelConfig offlineFireRedAsrCtcModelConfig, OfflineCanaryModelConfig offlineCanaryModelConfig, OfflineCohereTranscribeModelConfig offlineCohereTranscribeModelConfig, String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6) {
/* 22 */            this.transducer = offlineTransducerModelConfig;
/* 23 */            this.paraformer = offlineParaformerModelConfig;
/* 24 */            this.whisper = offlineWhisperModelConfig;
/* 25 */            this.fireRedAsr = offlineFireRedAsrModelConfig;
/* 26 */            this.moonshine = offlineMoonshineModelConfig;
/* 27 */            this.nemo = offlineNemoEncDecCtcModelConfig;
/* 28 */            this.senseVoice = offlineSenseVoiceModelConfig;
/* 29 */            this.dolphin = offlineDolphinModelConfig;
/* 30 */            this.zipformerCtc = offlineZipformerCtcModelConfig;
/* 31 */            this.wenetCtc = offlineWenetCtcModelConfig;
/* 32 */            this.omnilingual = offlineOmnilingualAsrCtcModelConfig;
/* 33 */            this.medasr = offlineMedAsrCtcModelConfig;
/* 34 */            this.funasrNano = offlineFunAsrNanoModelConfig;
/* 35 */            this.qwen3Asr = offlineQwen3AsrModelConfig;
/* 36 */            this.fireRedAsrCtc = offlineFireRedAsrCtcModelConfig;
/* 37 */            this.canary = offlineCanaryModelConfig;
/* 38 */            this.cohereTranscribe = offlineCohereTranscribeModelConfig;
/* 39 */            this.teleSpeech = str;
/* 40 */            this.numThreads = i;
/* 41 */            this.debug = z;
/* 42 */            this.provider = str2;
/* 43 */            this.modelType = str3;
/* 44 */            this.tokens = str4;
/* 45 */            this.modelingUnit = str5;
/* 46 */            this.bpeVocab = str6;
                }

/* 46 */        public OfflineModelConfig() {
/* 47 */            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, null, 33554431, null);
                }
            }
