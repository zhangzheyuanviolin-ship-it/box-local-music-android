            package com.google.ai.edge.litertlm;

            import com.google.ai.edge.litertlm.Content;
            import com.google.ai.edge.litertlm.LiteRtLmJni;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.Ii1OliO0l;
            import p000.Il011I1OiO0I;
            import p000.IlIi0I0;
            import p000.IlOil1ii;
            import p000.IlliIl1l11O;
            import p000.O0000Ioio00;
            import p000.O01I0il01001;
            import p000.O01O10Ii;
            import p000.O01l0lO0li;
            import p000.O100O1O;
            import p000.O100Oo;
            import p000.O100iii0I0i;
            import p000.O100l1;
            import p000.O100l1O0IiiO;
            import p000.OOIoO0IIOO0;
            import p000.OOIoOo0O;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.ilOl0O00Il0i;
            import p000.l0IIiOIooI1;
            import p000.lIIl0IOilo0;
            import p000.lIoii1l01l0i;
            
            @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ;2\u00060\u0001j\u0002`\u0002:\u0002<;B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0015J+\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0017J3\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u001b\u0010\u001dJ3\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u001b\u0010\u001eJ1\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u001b\u0010 J1\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f2\u0006\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u001b\u0010!J1\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f2\u0006\u0010\u0016\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u001b\u0010\"J\r\u0010#\u001a\u00020\u001a¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b&\u0010'J-\u0010(\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001aH\u0016¢\u0006\u0004\b*\u0010$J\u0017\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001aH\u0002¢\u0006\u0004\b/\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0011\u0010:\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b:\u00106¨\u0006="}, d2 = {"Lcom/google/ai/edge/litertlm/Conversation;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "handle", "Lcom/google/ai/edge/litertlm/ToolManager;", "toolManager", "", "automaticToolCalling", "<init>", "(JLcom/google/ai/edge/litertlm/ToolManager;Z)V", "Lcom/google/ai/edge/litertlm/Message;", "message", "", "", "", "extraContext", "sendMessage", "(Lcom/google/ai/edge/litertlm/Message;Ljava/util/Map;)Lcom/google/ai/edge/litertlm/Message;", "Lcom/google/ai/edge/litertlm/Contents;", "contents", "(Lcom/google/ai/edge/litertlm/Contents;Ljava/util/Map;)Lcom/google/ai/edge/litertlm/Message;", "text", "(Ljava/lang/String;Ljava/util/Map;)Lcom/google/ai/edge/litertlm/Message;", "Lcom/google/ai/edge/litertlm/MessageCallback;", "callback", "LOoiIlOl1iI;", "sendMessageAsync", "(Lcom/google/ai/edge/litertlm/Message;Lcom/google/ai/edge/litertlm/MessageCallback;Ljava/util/Map;)V", "(Lcom/google/ai/edge/litertlm/Contents;Lcom/google/ai/edge/litertlm/MessageCallback;Ljava/util/Map;)V", "(Ljava/lang/String;Lcom/google/ai/edge/litertlm/MessageCallback;Ljava/util/Map;)V", "LIlOil1ii;", "(Lcom/google/ai/edge/litertlm/Message;Ljava/util/Map;)LIlOil1ii;", "(Lcom/google/ai/edge/litertlm/Contents;Ljava/util/Map;)LIlOil1ii;", "(Ljava/lang/String;Ljava/util/Map;)LIlOil1ii;", "cancelProcess", "()V", "Lcom/google/ai/edge/litertlm/BenchmarkInfo;", "getBenchmarkInfo", "()Lcom/google/ai/edge/litertlm/BenchmarkInfo;", "renderMessageIntoString", "(Lcom/google/ai/edge/litertlm/Message;Ljava/util/Map;)Ljava/lang/String;", "close", "LO01l0lO0li;", "toolCallsJsonObject", "handleToolCalls", "(LO01l0lO0li;)LO01l0lO0li;", "checkIsAlive", "J", "Lcom/google/ai/edge/litertlm/ToolManager;", "getToolManager", "()Lcom/google/ai/edge/litertlm/ToolManager;", "Z", "getAutomaticToolCalling", "()Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isAlive", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isAlive", "Companion", "JniMessageCallbackImpl", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class Conversation implements AutoCloseable {

                public static final Companion INSTANCE = new Companion(null);
                private static final int RECURRING_TOOL_CALL_LIMIT = 25;
                private final AtomicBoolean _isAlive;
                private final boolean automaticToolCalling;
                private final long handle;
                private final ToolManager toolManager;

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/ai/edge/litertlm/Conversation$JniMessageCallbackImpl;", "Lcom/google/ai/edge/litertlm/LiteRtLmJni$JniMessageCallback;", "Lcom/google/ai/edge/litertlm/MessageCallback;", "callback", "<init>", "(Lcom/google/ai/edge/litertlm/Conversation;Lcom/google/ai/edge/litertlm/MessageCallback;)V", "", "messageJsonString", "LOoiIlOl1iI;", "onMessage", "(Ljava/lang/String;)V", "onDone", "()V", "", "statusCode", "message", "onError", "(ILjava/lang/String;)V", "Lcom/google/ai/edge/litertlm/MessageCallback;", "LO01l0lO0li;", "pendingToolResponseJSONMessage", "LO01l0lO0li;", "toolCallCount", "I", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public final class JniMessageCallbackImpl implements LiteRtLmJni.JniMessageCallback {
                    private final MessageCallback callback;
                    private O01l0lO0li pendingToolResponseJSONMessage;
                    private int toolCallCount;

                    public JniMessageCallbackImpl(MessageCallback messageCallback) {
/* 6 */                 this.callback = messageCallback;
                    }

                    @Override
                    public void onDone() {
/* 1 */                 O01l0lO0li o01l0lO0li = this.pendingToolResponseJSONMessage;
/* 3 */                 if (o01l0lO0li == null) {
/* 36 */                    this.callback.onDone();
                        } else {
/* 26 */                    LiteRtLmJni.INSTANCE.nativeSendMessageAsync(Conversation.this.handle, o01l0lO0li.toString(), "{}", this, ExperimentalFlags.INSTANCE.getVisualTokenBudget());
/* 30 */                    this.pendingToolResponseJSONMessage = null;
                        }
                    }

                    @Override
                    public void onError(int statusCode, String message) {
/* 1 */                 MessageCallback messageCallback = this.callback;
/* 4 */                 if (statusCode == 1) {
/* 11 */                    messageCallback.onError(new CancellationException(message));
                        } else {
/* 28 */                    messageCallback.onError(new LiteRtLmJniException(IlIi0I0.I000OiO(statusCode, "Status Code: ", ". Message: ", message)));
                        }
                    }

                    @Override
                    public void onMessage(String messageJsonString) {
/* 5 */                 O01l0lO0li o01l0lO0liI00000oOI = l0IIiOIooI1.I00000oOI(messageJsonString).I00000oOI();
/* 9 */                 O100l1O0IiiO o100l1O0IiiO = o01l0lO0liI00000oOI.I00iOIl;
/* 17 */                if (!o100l1O0IiiO.containsKey("tool_calls")) {
/* 84 */                    if (o100l1O0IiiO.containsKey("channels") || o100l1O0IiiO.containsKey("content")) {
/* 94 */                        this.callback.onMessage(Conversation.INSTANCE.jsonToMessage(o01l0lO0liI00000oOI));
/* 168 */                       return;
                            }
/* 168 */                   return;
                        }
/* 25 */                if (!Conversation.this.getAutomaticToolCalling()) {
/* 35 */                    this.callback.onMessage(Conversation.INSTANCE.jsonToMessage(o01l0lO0liI00000oOI));
/* 38 */                    return;
                        }
/* 39 */                int i = this.toolCallCount;
/* 43 */                if (i >= 25) {
/* 54 */                    this.callback.onError(new IllegalStateException("Exceeded recurring tool call limit of 25"));
                        } else {
/* 60 */                    this.toolCallCount = i + 1;
/* 68 */                    this.pendingToolResponseJSONMessage = Conversation.this.handleToolCalls(o01l0lO0liI00000oOI);
                        }
                    }
                }

                @Ii1OliO0l(m0c = "com.google.ai.edge.litertlm.Conversation$sendMessageAsync$1", m1f = "Conversation.kt", m2l = {273}, m3m = "invokeSuspend", m4v = 2)
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOOIoOo0O;", "Lcom/google/ai/edge/litertlm/Message;", "LOoiIlOl1iI;", "<anonymous>", "(LOOIoOo0O;)V"}, m18k = 3, mv = {2, 3, 0})
                public static final class C00041 extends Oll0io implements IlliIl1l11O {
                    final Map<String, Object> $extraContext;
                    final Message $message;
                    private Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00041(Message message, Map<String, ? extends Object> map, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */                 super(2, iOoil1iiIilo);
/* 3 */                 this.$message = message;
/* 5 */                 this.$extraContext = map;
                    }

                    @Override
                    public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */                 C00041 c00041 = Conversation.this.new C00041(this.$message, this.$extraContext, iOoil1iiIilo);
/* 12 */                c00041.L$0 = obj;
/* 37 */                return c00041;
                    }

                    @Override
                    public final Object invoke(OOIoOo0O oOIoOo0O, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */                 return ((C00041) create(oOIoOo0O, iOoil1iiIilo)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */                 Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */                 int i = this.label;
/* 6 */                 if (i == 0) {
/* 21 */                    lIoii1l01l0i.I00000oOI(obj);
/* 26 */                    final OOIoOo0O oOIoOo0O = (OOIoOo0O) this.L$0;
/* 39 */                    Conversation.this.sendMessageAsync(this.$message, new MessageCallback() {
                                @Override
                                public void onDone() {
/* 6 */                             ((OOIoO0IIOO0) oOIoOo0O).I0001Ioi1lo(null);
                                }

                                @Override
                                public void onError(Throwable throwable) {
/* 5 */                             ((OOIoO0IIOO0) oOIoOo0O).I0001Ioi1lo(throwable);
                                }

                                @Override
                                public void onMessage(Message message) {
/* 5 */                             ((OOIoO0IIOO0) oOIoOo0O).I000lI(message);
                                }
                            }, this.$extraContext);
/* 44 */                    I00000oIO i00000oIO = new I00000oIO();
/* 47 */                    this.label = 1;
/* 53 */                    if (lIIl0IOilo0.I00000oIO(oOIoOo0O, i00000oIO, this) == ii0111o) {
/* 55 */                        return ii0111o;
                            }
                        } else {
/* 8 */                     if (i != 1) {
/* 16 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                        return null;
                            }
/* 10 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 56 */                return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Conversation(long j, ToolManager toolManager, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 17 */            this(j, (i & 2) != 0 ? new ToolManager(null, 1, 0 == true ? 1 : 0) : toolManager, (i & 4) != 0 ? true : z);
                }

                private final void checkIsAlive() {
/* 5 */             if (isAlive()) {
/* 7 */                 return;
                    }
/* 10 */            I000II.I001IO000("Conversation is not alive.");
                }

                private final O01l0lO0li handleToolCalls(O01l0lO0li toolCallsJsonObject) {
/* 9 */             O01I0il01001 o01I0il01001 = (O01I0il01001) toolCallsJsonObject.I00iOIl.get("tool_calls");
/* 13 */            O01I0il01001 o01I0il010012 = new O01I0il01001();
/* 18 */            Iterator it = o01I0il01001.I00iOIl.iterator();
/* 26 */            while (it.hasNext()) {
/* 38 */                O100l1O0IiiO o100l1O0IiiO = ((O01O10Ii) it.next()).I00000oOI().I00iOIl;
/* 46 */                if (o100l1O0IiiO.containsKey("function")) {
/* 53 */                    O01l0lO0li o01l0lO0li = (O01l0lO0li) o100l1O0IiiO.get("function");
/* 61 */                    String strI0000O = o01l0lO0li.I000OOo1O("name").I0000O();
/* 77 */                    O01O10Ii o01O10IiExecute = this.toolManager.execute(strI0000O, (O01l0lO0li) o01l0lO0li.I00iOIl.get("arguments"));
/* 83 */                    O01l0lO0li o01l0lO0li2 = new O01l0lO0li();
/* 90 */                    o01l0lO0li2.I0001Ioi1lo("type", "tool_response");
/* 93 */                    o01l0lO0li2.I0001Ioi1lo("name", strI0000O);
/* 98 */                    o01l0lO0li2.I0000oI00("response", o01O10IiExecute);
/* 101 */                   o01I0il010012.I0000oI00(o01l0lO0li2);
                        }
                    }
/* 107 */           O01l0lO0li o01l0lO0li3 = new O01l0lO0li();
/* 114 */           o01l0lO0li3.I0001Ioi1lo("role", "tool");
/* 119 */           o01l0lO0li3.I0000oI00("content", o01I0il010012);
/* 168 */           return o01l0lO0li3;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static String renderMessageIntoString$default(Conversation conversation, Message message, Map map, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 map = Il011I1OiO0I.I00iOIl;
                    }
/* 7 */             return conversation.renderMessageIntoString(message, map);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static Message sendMessage$default(Conversation conversation, Message message, Map map, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 map = Il011I1OiO0I.I00iOIl;
                    }
/* 7 */             return conversation.sendMessage(message, (Map<String, ? extends Object>) map);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static IlOil1ii sendMessageAsync$default(Conversation conversation, Message message, Map map, int i, Object obj) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 map = Il011I1OiO0I.I00iOIl;
                    }
/* 7 */             return conversation.sendMessageAsync(message, (Map<String, ? extends Object>) map);
                }

                public final void cancelProcess() {
/* 1 */             checkIsAlive();
/* 8 */             LiteRtLmJni.INSTANCE.nativeConversationCancelProcess(this.handle);
                }

                @Override
                public void close() {
/* 9 */             if (this._isAlive.compareAndSet(true, false)) {
/* 15 */                LiteRtLmJni.INSTANCE.nativeDeleteConversation(this.handle);
                    } else {
/* 21 */                I000II.I001IO000("Conversation is closed already.");
                    }
                }

                public final boolean getAutomaticToolCalling() {
/* 1 */             return this.automaticToolCalling;
                }

                public final BenchmarkInfo getBenchmarkInfo() {
/* 1 */             checkIsAlive();
/* 8 */             return LiteRtLmJni.INSTANCE.nativeConversationGetBenchmarkInfo(this.handle);
                }

                public final ToolManager getToolManager() {
/* 1 */             return this.toolManager;
                }

                public final boolean isAlive() {
/* 3 */             return this._isAlive.get();
                }

                public final String renderMessageIntoString(Message message, Map<String, ? extends Object> extraContext) {
/* 1 */             checkIsAlive();
/* 24 */            return LiteRtLmJni.INSTANCE.nativeConversationRenderMessageIntoString(this.handle, message.m14x6d7146a3().toString(), JsonConvertersKt.toJsonObject(extraContext).toString());
                }

                public final Message sendMessage(Message message, Map<String, ? extends Object> extraContext) {
/* 1 */             checkIsAlive();
/* 4 */             O01l0lO0li o01l0lO0liM14x6d7146a3 = message.m14x6d7146a3();
/* 12 */            String string = JsonConvertersKt.toJsonObject(extraContext).toString();
/* 18 */            Integer visualTokenBudget = ExperimentalFlags.INSTANCE.getVisualTokenBudget();
/* 26 */            for (int i = 0; i < 25; i++) {
/* 36 */                String strNativeSendMessage = LiteRtLmJni.INSTANCE.nativeSendMessage(this.handle, o01l0lO0liM14x6d7146a3.toString(), string, visualTokenBudget);
/* 44 */                O01l0lO0li o01l0lO0liI00000oOI = l0IIiOIooI1.I00000oOI(strNativeSendMessage).I00000oOI();
/* 48 */                O100l1O0IiiO o100l1O0IiiO = o01l0lO0liI00000oOI.I00iOIl;
/* 56 */                if (!o100l1O0IiiO.containsKey("tool_calls")) {
/* 82 */                    if (o100l1O0IiiO.containsKey("content")) {
/* 1 */                         return INSTANCE.jsonToMessage(o01l0lO0liI00000oOI);
                            }
/* 97 */                    I000II.I001IO000(IIl001iO0Io.I000o00OoI0I("Invalid response from native layer: ", strNativeSendMessage));
/* 25 */                    return null;
                        }
/* 60 */                if (!this.automaticToolCalling) {
/* 1 */                     return INSTANCE.jsonToMessage(o01l0lO0liI00000oOI);
                        }
/* 69 */                o01l0lO0liM14x6d7146a3 = handleToolCalls(o01l0lO0liI00000oOI);
                    }
/* 103 */           I000II.I001IO000("Exceeded recurring tool call limit of 25");
/* 25 */            return null;
                }

                public final void sendMessageAsync(Message message, MessageCallback callback, Map<String, ? extends Object> extraContext) {
/* 1 */             checkIsAlive();
/* 8 */             String string = JsonConvertersKt.toJsonObject(extraContext).toString();
/* 14 */            Integer visualTokenBudget = ExperimentalFlags.INSTANCE.getVisualTokenBudget();
/* 35 */            LiteRtLmJni.INSTANCE.nativeSendMessageAsync(this.handle, message.m14x6d7146a3().toString(), string, new JniMessageCallbackImpl(callback), visualTokenBudget);
                }

                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/ai/edge/litertlm/Conversation$Companion;", "", "<init>", "()V", "LO01l0lO0li;", "messageJsonObject", "Lcom/google/ai/edge/litertlm/Message;", "jsonToMessage", "(LO01l0lO0li;)Lcom/google/ai/edge/litertlm/Message;", "", "RECURRING_TOOL_CALL_LIMIT", "I", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    private final Message jsonToMessage(O01l0lO0li messageJsonObject) {
/* 3 */                 ArrayList arrayList = new ArrayList();
/* 6 */                 O100l1O0IiiO o100l1O0IiiO = messageJsonObject.I00iOIl;
/* 8 */                 O100l1O0IiiO o100l1O0IiiO2 = messageJsonObject.I00iOIl;
/* 16 */                if (o100l1O0IiiO.containsKey("content")) {
/* 26 */                    Iterator it = ((O01I0il01001) o100l1O0IiiO2.get("content")).I00iOIl.iterator();
/* 34 */                    while (it.hasNext()) {
/* 42 */                        O01l0lO0li o01l0lO0liI00000oOI = ((O01O10Ii) it.next()).I00000oOI();
/* 62 */                        if (O0000Ioio00.I0000O(o01l0lO0liI00000oOI.I000OOo1O("type").I0000O(), "text")) {
/* 77 */                            arrayList.add(new Content.Text(o01l0lO0liI00000oOI.I000OOo1O("text").I0000O()));
                                }
                            }
                        }
/* 83 */                ArrayList arrayList2 = new ArrayList();
/* 92 */                if (o100l1O0IiiO.containsKey("tool_calls")) {
/* 102 */                   Iterator it2 = ((O01I0il01001) o100l1O0IiiO2.get("tool_calls")).I00iOIl.iterator();
/* 110 */                   while (it2.hasNext()) {
/* 122 */                       O100l1O0IiiO o100l1O0IiiO3 = ((O01O10Ii) it2.next()).I00000oOI().I00iOIl;
/* 130 */                       if (o100l1O0IiiO3.containsKey("function")) {
/* 136 */                           O01l0lO0li o01l0lO0li = (O01l0lO0li) o100l1O0IiiO3.get("function");
/* 167 */                           arrayList2.add(new ToolCall(o01l0lO0li.I000OOo1O("name").I0000O(), JsonConvertersKt.toMap((O01l0lO0li) o01l0lO0li.I00iOIl.get("arguments"))));
                                }
                            }
                        }
/* 173 */               LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 182 */               if (o100l1O0IiiO.containsKey("channels")) {
/* 198 */                   Iterator it3 = ((O100Oo) ((O01l0lO0li) o100l1O0IiiO2.get("channels")).I00iOIl.entrySet()).iterator();
/* 209 */                   while (((O100iii0I0i) it3).hasNext()) {
/* 214 */                       O100l1 o100l1I00000oIO = ((O100O1O) it3).I00000oIO();
/* 232 */                       linkedHashMap.put(o100l1I00000oIO.getKey(), ((O01O10Ii) o100l1I00000oIO.getValue()).I0000O());
                            }
                        }
/* 244 */               return Message.INSTANCE.model(Contents.INSTANCE.of(arrayList), arrayList2, linkedHashMap);
                    }

/* 4 */             private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 11 */        public static Message sendMessage$default(Conversation conversation, Contents contents, Map map, int i, Object obj) {
                    if ((i & 2) != 0) {
/* 12 */                map = Il011I1OiO0I.I00iOIl;
                    }
                    return conversation.sendMessage(contents, (Map<String, ? extends Object>) map);
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 11 */        public static void sendMessageAsync$default(Conversation conversation, Contents contents, MessageCallback messageCallback, Map map, int i, Object obj) {
                    if ((i & 4) != 0) {
/* 12 */                map = Il011I1OiO0I.I00iOIl;
                    }
/* 13 */            conversation.sendMessageAsync(contents, messageCallback, (Map<String, ? extends Object>) map);
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 12 */        public static Message sendMessage$default(Conversation conversation, String str, Map map, int i, Object obj) {
                    if ((i & 2) != 0) {
/* 13 */                map = Il011I1OiO0I.I00iOIl;
                    }
                    return conversation.sendMessage(str, (Map<String, ? extends Object>) map);
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 13 */        public static void sendMessageAsync$default(Conversation conversation, String str, MessageCallback messageCallback, Map map, int i, Object obj) {
                    if ((i & 4) != 0) {
/* 14 */                map = Il011I1OiO0I.I00iOIl;
                    }
/* 15 */            conversation.sendMessageAsync(str, messageCallback, (Map<String, ? extends Object>) map);
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 15 */        public static void sendMessageAsync$default(Conversation conversation, Message message, MessageCallback messageCallback, Map map, int i, Object obj) {
                    if ((i & 4) != 0) {
/* 16 */                map = Il011I1OiO0I.I00iOIl;
                    }
/* 17 */            conversation.sendMessageAsync(message, messageCallback, (Map<String, ? extends Object>) map);
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 17 */        public static IlOil1ii sendMessageAsync$default(Conversation conversation, Contents contents, Map map, int i, Object obj) {
                    if ((i & 2) != 0) {
/* 18 */                map = Il011I1OiO0I.I00iOIl;
                    }
/* 19 */            return conversation.sendMessageAsync(contents, (Map<String, ? extends Object>) map);
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 19 */        public static IlOil1ii sendMessageAsync$default(Conversation conversation, String str, Map map, int i, Object obj) {
                    if ((i & 2) != 0) {
/* 20 */                map = Il011I1OiO0I.I00iOIl;
                    }
                    return conversation.sendMessageAsync(str, (Map<String, ? extends Object>) map);
                }

/* 20 */        public Conversation(long j, ToolManager toolManager, boolean z) {
/* 22 */            this.handle = j;
/* 23 */            this.toolManager = toolManager;
/* 24 */            this.automaticToolCalling = z;
/* 25 */            this._isAlive = new AtomicBoolean(true);
                }

/* 38 */        public final void sendMessageAsync(Contents contents, MessageCallback callback, Map<String, ? extends Object> extraContext) {
/* 39 */            sendMessageAsync(Message.INSTANCE.user(contents), callback, extraContext);
                }

/* 39 */        public final void sendMessageAsync(String text, MessageCallback callback, Map<String, ? extends Object> extraContext) {
/* 40 */            sendMessageAsync(Contents.INSTANCE.of(text), callback, extraContext);
                }

/* 40 */        public final IlOil1ii sendMessageAsync(Message message, Map<String, ? extends Object> extraContext) {
/* 42 */            return ilOl0O00Il0i.I00000oIO(new C00041(message, extraContext, null));
                }

/* 42 */        public final IlOil1ii sendMessageAsync(Contents contents, Map<String, ? extends Object> extraContext) {
/* 43 */            return sendMessageAsync(Message.INSTANCE.user(contents), extraContext);
                }

/* 43 */        public final IlOil1ii sendMessageAsync(String text, Map<String, ? extends Object> extraContext) {
/* 44 */            return sendMessageAsync(Contents.INSTANCE.of(text), extraContext);
                }

/* 106 */       public final Message sendMessage(Contents contents, Map<String, ? extends Object> extraContext) {
/* 107 */           return sendMessage(Message.INSTANCE.user(contents), extraContext);
                }

/* 107 */       public final Message sendMessage(String text, Map<String, ? extends Object> extraContext) {
/* 108 */           return sendMessage(Contents.INSTANCE.of(text), extraContext);
                }
            }
