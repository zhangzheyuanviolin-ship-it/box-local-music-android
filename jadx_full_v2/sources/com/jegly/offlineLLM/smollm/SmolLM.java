            package com.jegly.offlineLLM.smollm;

            import kotlin.Metadata;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.Ii1oo1ooill0;
            import p000.IiI0oillOO10;
            import p000.IiiIil1lOIO;
            import p000.IlOil1ii;
            import p000.O0000Ioio00;
            import p000.O1o1iI;
            import p000.OO11OilO;
            import p000.Ol1OIil01I;
            import p000.Ol1OIlllo;
            import p000.OoiIlOl1iI;
            import p000.iOi1II01i0;
            import p000.ilOl0O00Il0i;
            
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001d\u0018\u0000 Q2\u00020\u0001:\u0002R\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\rJ\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\rJ\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\rJ\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0003J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 2\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J-\u0010)\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u0003J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010\u0003J\u0088\u0001\u0010?\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020,2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020,2\u0006\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020,H\u0082 ¢\u0006\u0004\b?\u0010@J\u0018\u0010A\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\bA\u0010\rJ\u0010\u0010B\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\bB\u0010\u000fJ(\u0010\u0012\u001a\u00020\b2\u0006\u0010C\u001a\u0002062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0012\u0010DJ\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010C\u001a\u000206H\u0082 ¢\u0006\u0004\b\u0018\u0010EJ\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010C\u001a\u000206H\u0082 ¢\u0006\u0004\b\u001a\u0010FJ\u0018\u0010G\u001a\u00020\u001c2\u0006\u0010C\u001a\u000206H\u0082 ¢\u0006\u0004\bG\u0010HJ\u0018\u0010+\u001a\u00020\b2\u0006\u0010C\u001a\u000206H\u0082 ¢\u0006\u0004\b+\u0010EJ \u0010I\u001a\u00020\b2\u0006\u0010C\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\u00020\u00042\u0006\u0010C\u001a\u000206H\u0082 ¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\u00020\b2\u0006\u0010C\u001a\u000206H\u0082 ¢\u0006\u0004\bM\u0010EJ8\u0010)\u001a\u00020\u00042\u0006\u0010C\u001a\u0002062\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001cH\u0082 ¢\u0006\u0004\b)\u0010NR\u0016\u0010O\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lcom/jegly/offlineLLM/smollm/SmolLM;", "", "<init>", "()V", "", "modelPath", "LOl1OIlllo;", "params", "LOoiIlOl1iI;", "load", "(Ljava/lang/String;LOl1OIlllo;LIOoil1iiIilo;)Ljava/lang/Object;", "nativeLibDir", "loadBackends", "(Ljava/lang/String;)V", "getGpuDeviceInfo", "()Ljava/lang/String;", "role", "message", "addChatMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "addUserMessage", "prompt", "addSystemPrompt", "addAssistantMessage", "prewarmHistory", "", "getResponseGenerationSpeed", "()F", "", "getContextLengthUsed", "()I", "query", "LIlOil1ii;", "getResponseAsFlow", "(Ljava/lang/String;)LIlOil1ii;", "getResponse", "(Ljava/lang/String;)Ljava/lang/String;", "pp", "tg", "pl", "nr", "benchModel", "(IIII)Ljava/lang/String;", "close", "", "isLoaded", "()Z", "verifyHandle", "minP", "temperature", "topP", "topK", "repeatPenalty", "storeChats", "", "contextSize", "chatTemplate", "nThreads", "useMmap", "useMlock", "nGpuLayers", "nThreadsBatch", "kvCacheQ8", "loadModel", "(Ljava/lang/String;FFFIFZJLjava/lang/String;IZZIIZ)J", "initBackends", "getGpuDeviceName", "modelPtr", "(JLjava/lang/String;Ljava/lang/String;)V", "(J)V", "(J)F", "getContextSizeUsed", "(J)I", "startCompletion", "(JLjava/lang/String;)V", "completionLoop", "(J)Ljava/lang/String;", "stopCompletion", "(JIIII)Ljava/lang/String;", "nativePtr", "J", "Companion", "Ol1OIil01I", "smollm"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class SmolLM {
                public static final Ol1OIil01I Companion = new Ol1OIil01I();
                private static final String TAG = "SmolLM";
                private long nativePtr;

                static {
/* 10 */            System.loadLibrary("smollm");
                }

                private final native void addChatMessage(long modelPtr, String message, String role);

                private final native String benchModel(long modelPtr, int pp, int tg, int pl, int nr);

                private final native void close(long modelPtr);

                private final native String completionLoop(long modelPtr);

                private final native int getContextSizeUsed(long modelPtr);

                private final native String getGpuDeviceName();

                private final native float getResponseGenerationSpeed(long modelPtr);

                private final native void initBackends(String nativeLibDir);

                public static Object load$default(SmolLM smolLM, String str, Ol1OIlllo ol1OIlllo, IOoil1iiIilo iOoil1iiIilo, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 19 */                ol1OIlllo = new Ol1OIlllo(0.0f, 0.0f, 0, null, 0, false, false, 0, 0, false, 16383);
                    }
/* 25 */            return smolLM.load(str, ol1OIlllo, iOoil1iiIilo);
                }

                private final native long loadModel(String modelPath, float minP, float temperature, float topP, int topK, float repeatPenalty, boolean storeChats, long contextSize, String chatTemplate, int nThreads, boolean useMmap, boolean useMlock, int nGpuLayers, int nThreadsBatch, boolean kvCacheQ8);

                private final native void prewarmHistory(long modelPtr);

                private final native void startCompletion(long modelPtr, String prompt);

                private final native void stopCompletion(long modelPtr);

                private final void verifyHandle() {
/* 7 */             if (this.nativePtr != 0) {
/* 9 */                 return;
                    }
/* 12 */            I000II.I001IO000("Model is not loaded. Call SmolLM.load() first.");
                }

                public final void addAssistantMessage(String message) {
/* 3 */             addChatMessage("assistant", message);
                }

                public final void addChatMessage(String role, String message) {
/* 1 */             verifyHandle();
/* 6 */             addChatMessage(this.nativePtr, message, role);
                }

                public final void addSystemPrompt(String prompt) {
/* 3 */             addChatMessage("system", prompt);
                }

                public final void addUserMessage(String message) {
/* 3 */             addChatMessage("user", message);
                }

                public final String benchModel(int pp, int tg, int pl, int nr) {
/* 1 */             verifyHandle();
/* 11 */            return benchModel(this.nativePtr, pp, tg, pl, nr);
                }

                public final void close() {
/* 1 */             long j = this.nativePtr;
/* 7 */             if (j != 0) {
/* 9 */                 close(j);
/* 12 */                this.nativePtr = 0L;
                    }
                }

                public final int getContextLengthUsed() {
/* 1 */             verifyHandle();
/* 6 */             return getContextSizeUsed(this.nativePtr);
                }

                public final String getGpuDeviceInfo() {
                    try {
/* 1 */                 return getGpuDeviceName();
                    } catch (Throwable unused) {
/* 6 */                 return "";
                    }
                }

                public final String getResponse(String query) {
/* 1 */             verifyHandle();
/* 6 */             startCompletion(this.nativePtr, query);
/* 11 */            String strCompletionLoop = completionLoop(this.nativePtr);
/* 15 */            String strI000o00OoI0I = "";
/* 23 */            while (!O0000Ioio00.I0000O(strCompletionLoop, "[EOG]")) {
/* 25 */                strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I(strI000o00OoI0I, strCompletionLoop);
/* 31 */                strCompletionLoop = completionLoop(this.nativePtr);
                    }
/* 38 */            stopCompletion(this.nativePtr);
/* 77 */            return strI000o00OoI0I;
                }

                public final IlOil1ii getResponseAsFlow(String query) {
/* 9 */             return ilOl0O00Il0i.I00000oOI(new OO11OilO(this, query, null, 17));
                }

                public final float getResponseGenerationSpeed() {
/* 1 */             verifyHandle();
/* 6 */             return getResponseGenerationSpeed(this.nativePtr);
                }

                public final boolean isLoaded() {
                    return this.nativePtr != 0;
                }

                public final Object load(String str, Ol1OIlllo ol1OIlllo, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 16 */            Object objI0000oI00 = iOi1II01i0.I0000oI00(Ii1oo1ooill0.I00iiI, new O1o1iI(str, this, ol1OIlllo, (IOoil1iiIilo) null, 11), iOoil1iiIilo);
                    return objI0000oI00 == Ii0111o.I00iOIl ? objI0000oI00 : OoiIlOl1iI.I00000oIO;
                }

                public final void loadBackends(String nativeLibDir) {
/* 1 */             initBackends(nativeLibDir);
                }

                public final void prewarmHistory() {
/* 1 */             verifyHandle();
/* 6 */             prewarmHistory(this.nativePtr);
                }
            }
