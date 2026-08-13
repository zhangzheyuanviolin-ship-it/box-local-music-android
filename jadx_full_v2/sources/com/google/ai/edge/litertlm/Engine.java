            package com.google.ai.edge.litertlm;

            import com.google.ai.edge.litertlm.Backend;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I000II;
            import p000.O01I0il01001;
            
            @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \"2\u00060\u0001j\u0002`\u0002:\u0001\"B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/google/ai/edge/litertlm/Engine;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lcom/google/ai/edge/litertlm/EngineConfig;", "engineConfig", "<init>", "(Lcom/google/ai/edge/litertlm/EngineConfig;)V", "LOoiIlOl1iI;", "checkInitialized", "()V", "", "isInitialized", "()Z", "initialize", "close", "Lcom/google/ai/edge/litertlm/ConversationConfig;", "conversationConfig", "Lcom/google/ai/edge/litertlm/Conversation;", "createConversation", "(Lcom/google/ai/edge/litertlm/ConversationConfig;)Lcom/google/ai/edge/litertlm/Conversation;", "Lcom/google/ai/edge/litertlm/SessionConfig;", "sessionConfig", "Lcom/google/ai/edge/litertlm/Session;", "createSession", "(Lcom/google/ai/edge/litertlm/SessionConfig;)Lcom/google/ai/edge/litertlm/Session;", "Lcom/google/ai/edge/litertlm/EngineConfig;", "getEngineConfig", "()Lcom/google/ai/edge/litertlm/EngineConfig;", "", "lock", "Ljava/lang/Object;", "", "handle", "Ljava/lang/Long;", "Companion", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class Engine implements AutoCloseable {

                public static final Companion INSTANCE = new Companion(null);
                private final EngineConfig engineConfig;
                private volatile Long handle;
                private final Object lock = new Object();

                public Engine(EngineConfig engineConfig) {
/* 4 */             this.engineConfig = engineConfig;
                }

                private final void checkInitialized() {
/* 5 */             if (isInitialized()) {
/* 7 */                 return;
                    }
/* 10 */            I000II.I001IO000("Engine is not initialized.");
                }

                public static Conversation createConversation$default(Engine engine, ConversationConfig conversationConfig, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 17 */                conversationConfig = new ConversationConfig(null, null, null, null, false, null, null, 127, null);
                    }
/* 21 */            return engine.createConversation(conversationConfig);
                }

                public static Session createSession$default(Engine engine, SessionConfig sessionConfig, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 8 */                 sessionConfig = new SessionConfig(null, 1, null);
                    }
/* 11 */            return engine.createSession(sessionConfig);
                }

                @Override
                public void close() {
                    synchronized (this.lock) {
/* 4 */                 checkInitialized();
/* 15 */                LiteRtLmJni.INSTANCE.nativeDeleteEngine(this.handle.longValue());
/* 19 */                this.handle = null;
                    }
                }

                public final Conversation createConversation(ConversationConfig conversationConfig) {
                    O01I0il01001 o01I0il01001;
                    Conversation conversation;
                    synchronized (this.lock) {
                        try {
/* 6 */                     checkInitialized();
/* 15 */                    ToolManager toolManager = new ToolManager(conversationConfig.getTools());
/* 20 */                    O01I0il01001 o01I0il010012 = new O01I0il01001();
/* 23 */                    Contents systemInstruction = conversationConfig.getSystemInstruction();
/* 27 */                    if (systemInstruction != null) {
/* 45 */                        o01I0il010012.I0000oI00(new Message(Role.SYSTEM, systemInstruction, null, null, 12, null).m14x6d7146a3());
                            }
/* 56 */                    Iterator<Message> it = conversationConfig.getInitialMessages().iterator();
/* 64 */                    while (it.hasNext()) {
/* 76 */                        o01I0il010012.I0000oI00(it.next().m14x6d7146a3());
                            }
/* 80 */                    List<Channel> channels = conversationConfig.getChannels();
/* 85 */                    if (channels != null) {
/* 89 */                        o01I0il01001 = new O01I0il01001();
/* 92 */                        Iterator<Channel> it2 = channels.iterator();
/* 100 */                       while (it2.hasNext()) {
/* 112 */                           o01I0il01001.I0000oI00(it2.next().m10x6d7146a3());
                                }
                            } else {
/* 116 */                       o01I0il01001 = null;
                            }
/* 119 */                   LiteRtLmJni liteRtLmJni = LiteRtLmJni.INSTANCE;
/* 123 */                   long jLongValue = this.handle.longValue();
/* 127 */                   SamplerConfig samplerConfig = conversationConfig.getSamplerConfig();
/* 131 */                   String string = o01I0il010012.toString();
/* 139 */                   String string2 = toolManager.getToolsDescription().toString();
/* 145 */                   String string3 = o01I0il01001 != null ? o01I0il01001.toString() : null;
/* 158 */                   String string4 = JsonConvertersKt.toJsonObject(conversationConfig.getExtraContext()).toString();
/* 162 */                   ExperimentalFlags experimentalFlags = ExperimentalFlags.INSTANCE;
/* 184 */                   conversation = new Conversation(liteRtLmJni.nativeCreateConversation(jLongValue, samplerConfig, string, string2, string3, string4, experimentalFlags.getEnableConversationConstrainedDecoding(), experimentalFlags.getFilterChannelContentFromKvCache(), experimentalFlags.getOverwritePromptTemplate()), toolManager, conversationConfig.getAutomaticToolCalling());
                        } catch (Throwable th) {
/* 437 */                   throw th;
                        }
                    }
/* 188 */           return conversation;
                }

                public final Session createSession(SessionConfig sessionConfig) {
                    Session session;
                    synchronized (this.lock) {
/* 4 */                 checkInitialized();
/* 25 */                session = new Session(LiteRtLmJni.INSTANCE.nativeCreateSession(this.handle.longValue(), sessionConfig.getSamplerConfig()));
                    }
/* 29 */            return session;
                }

                public final EngineConfig getEngineConfig() {
/* 1 */             return this.engineConfig;
                }

                public final void initialize() {
                    int i;
                    int iIntValue;
                    int i2;
                    String name;
                    String name2;
                    String nativeLibraryDir;
                    String nativeLibraryDir2;
                    String nativeLibraryDir3;
                    Integer numOfThreads;
                    Integer numOfThreads2;
                    synchronized (this.lock) {
                        try {
/* 10 */                    if (isInitialized()) {
/* 287 */                       throw new IllegalStateException("Engine is already initialized.");
                            }
/* 14 */                    Backend backend = this.engineConfig.getBackend();
/* 28 */                    Backend.CPU cpu = backend instanceof Backend.CPU ? (Backend.CPU) backend : null;
/* 30 */                    if (cpu == null || (numOfThreads2 = cpu.getNumOfThreads()) == null) {
/* 49 */                        i = -1;
                            } else {
/* 38 */                        int iIntValue2 = numOfThreads2.intValue();
/* 42 */                        if (iIntValue2 <= 0) {
/* 45 */                            iIntValue2 = -1;
                                }
/* 46 */                        i = iIntValue2;
                            }
/* 53 */                    Backend audioBackend = this.engineConfig.getAudioBackend();
/* 64 */                    Backend.CPU cpu2 = audioBackend instanceof Backend.CPU ? (Backend.CPU) audioBackend : null;
/* 65 */                    if (cpu2 == null || (numOfThreads = cpu2.getNumOfThreads()) == null) {
/* 85 */                        iIntValue = -1;
/* 86 */                        i2 = -1;
                            } else {
/* 73 */                        int iIntValue3 = numOfThreads.intValue();
/* 77 */                        if (iIntValue3 <= 0) {
/* 80 */                            iIntValue3 = -1;
                                }
/* 81 */                        i2 = iIntValue3;
/* 83 */                        iIntValue = -1;
                            }
/* 88 */                    LiteRtLmJni liteRtLmJni = LiteRtLmJni.INSTANCE;
/* 92 */                    String modelPath = this.engineConfig.getModelPath();
/* 102 */                   String name3 = this.engineConfig.getBackend().getName();
/* 108 */                   Backend visionBackend = this.engineConfig.getVisionBackend();
/* 112 */                   if (visionBackend == null || (name = visionBackend.getName()) == null) {
/* 120 */                       name = "";
                            }
/* 124 */                   Backend audioBackend2 = this.engineConfig.getAudioBackend();
/* 128 */                   if (audioBackend2 == null || (name2 = audioBackend2.getName()) == null) {
/* 136 */                       name2 = "";
                            }
/* 140 */                   Integer maxNumTokens = this.engineConfig.getMaxNumTokens();
/* 151 */                   int iIntValue4 = maxNumTokens != null ? maxNumTokens.intValue() : iIntValue;
/* 154 */                   Integer maxNumImages = this.engineConfig.getMaxNumImages();
/* 158 */                   if (maxNumImages != null) {
/* 160 */                       iIntValue = maxNumImages.intValue();
                            }
/* 166 */                   String cacheDir = this.engineConfig.getCacheDir();
/* 170 */                   if (cacheDir == null) {
/* 172 */                       cacheDir = "";
                            }
/* 174 */                   ExperimentalFlags experimentalFlags = ExperimentalFlags.INSTANCE;
/* 177 */                   boolean enableBenchmark = experimentalFlags.getEnableBenchmark();
/* 181 */                   Boolean enableSpeculativeDecoding = experimentalFlags.getEnableSpeculativeDecoding();
/* 187 */                   Backend backend2 = this.engineConfig.getBackend();
/* 198 */                   Backend.NPU npu = backend2 instanceof Backend.NPU ? (Backend.NPU) backend2 : null;
/* 199 */                   if (npu == null || (nativeLibraryDir = npu.getNativeLibraryDir()) == null) {
/* 207 */                       nativeLibraryDir = "";
                            }
/* 211 */                   Backend visionBackend2 = this.engineConfig.getVisionBackend();
/* 222 */                   Backend.NPU npu2 = visionBackend2 instanceof Backend.NPU ? (Backend.NPU) visionBackend2 : null;
/* 223 */                   if (npu2 == null || (nativeLibraryDir2 = npu2.getNativeLibraryDir()) == null) {
/* 231 */                       nativeLibraryDir2 = "";
                            }
/* 235 */                   Backend audioBackend3 = this.engineConfig.getAudioBackend();
/* 247 */                   Backend.NPU npu3 = audioBackend3 instanceof Backend.NPU ? (Backend.NPU) audioBackend3 : null;
/* 248 */                   if (npu3 == null || (nativeLibraryDir3 = npu3.getNativeLibraryDir()) == null) {
/* 265 */                       nativeLibraryDir3 = "";
                            }
/* 276 */                   this.handle = Long.valueOf(liteRtLmJni.nativeCreateEngine(modelPath, name3, name, name2, iIntValue4, iIntValue, cacheDir, enableBenchmark, enableSpeculativeDecoding, nativeLibraryDir, nativeLibraryDir2, nativeLibraryDir3, i, i2));
                        } catch (Throwable th) {
/* 743 */                   throw th;
                        }
                    }
                }

                public final boolean isInitialized() {
                    return this.handle != null;
                }

                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/ai/edge/litertlm/Engine$Companion;", "", "<init>", "()V", "Lcom/google/ai/edge/litertlm/LogSeverity;", "level", "LOoiIlOl1iI;", "setNativeMinLogSeverity", "(Lcom/google/ai/edge/litertlm/LogSeverity;)V", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final void setNativeMinLogSeverity(LogSeverity level) {
/* 7 */                 LiteRtLmJni.INSTANCE.nativeSetMinLogSeverity(level.getSeverity());
                    }

/* 4 */             private Companion() {
                    }
                }
            }
