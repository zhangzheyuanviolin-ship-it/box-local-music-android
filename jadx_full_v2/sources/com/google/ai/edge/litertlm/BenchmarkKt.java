            package com.google.ai.edge.litertlm;

            import com.google.ai.edge.litertlm.Backend;
            import java.util.Map;
            import kotlin.Metadata;
            import p000.iOOl00;
            
            @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0007¨\u0006\n"}, d2 = {"benchmark", "Lcom/google/ai/edge/litertlm/BenchmarkInfo;", "modelPath", "", "backend", "Lcom/google/ai/edge/litertlm/Backend;", "prefillTokens", "", "decodeTokens", "cacheDir", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 2, mv = {2, 3, 0}, xi = 48)
            public final class BenchmarkKt {
                public static final BenchmarkInfo benchmark(String str, Backend backend, int i, int i2, String str2) {
                    String str3;
                    int i3;
                    LiteRtLmJni liteRtLmJni;
                    String str4;
                    int i4;
                    String nativeLibraryDir;
/* 3 */             LiteRtLmJni liteRtLmJni2 = LiteRtLmJni.INSTANCE;
/* 5 */             String name = backend.getName();
/* 15 */            String str5 = str2 == null ? "" : str2;
/* 25 */            Backend.NPU npu = backend instanceof Backend.NPU ? (Backend.NPU) backend : null;
/* 26 */            if (npu == null || (nativeLibraryDir = npu.getNativeLibraryDir()) == null) {
/* 9 */                 str3 = "";
/* 45 */                i3 = i2;
/* 47 */                liteRtLmJni = liteRtLmJni2;
/* 48 */                str4 = str;
/* 50 */                i4 = i;
                    } else {
/* 35 */                str3 = nativeLibraryDir;
/* 36 */                i4 = i;
/* 38 */                i3 = i2;
/* 40 */                liteRtLmJni = liteRtLmJni2;
/* 41 */                str4 = str;
                    }
/* 52 */            long jNativeCreateBenchmark = liteRtLmJni.nativeCreateBenchmark(str4, name, i4, i3, str5, str3);
                    try {
/* 62 */                ExperimentalFlags experimentalFlags = ExperimentalFlags.INSTANCE;
/* 88 */                Conversation conversation = new Conversation(liteRtLmJni.nativeCreateConversation(jNativeCreateBenchmark, null, "[]", "[]", null, "{}", false, experimentalFlags.getFilterChannelContentFromKvCache(), experimentalFlags.getOverwritePromptTemplate()), null, false, 6, null);
                        try {
/* 94 */                    Conversation.sendMessage$default(conversation, "Engine ignore this message in this mode.", (Map) null, 2, (Object) null);
/* 97 */                    BenchmarkInfo benchmarkInfo = conversation.getBenchmarkInfo();
/* 101 */                   iOOl00.I00000oIO(conversation, null);
/* 104 */                   liteRtLmJni.nativeDeleteEngine(jNativeCreateBenchmark);
/* 107 */                   return benchmarkInfo;
                        } finally {
                        }
                    } catch (Throwable th) {
/* 120 */               LiteRtLmJni.INSTANCE.nativeDeleteEngine(jNativeCreateBenchmark);
/* 399 */               throw th;
                    }
                }

                public static BenchmarkInfo benchmark$default(String str, Backend backend, int i, int i2, String str2, int i3, Object obj) {
/* 5 */             if ((i3 & 4) != 0) {
/* 7 */                 i = 256;
                    }
/* 10 */            if ((i3 & 8) != 0) {
/* 12 */                i2 = 256;
                    }
/* 15 */            if ((i3 & 16) != 0) {
/* 17 */                str2 = null;
                    }
/* 18 */            return benchmark(str, backend, i, i2, str2);
                }
            }
