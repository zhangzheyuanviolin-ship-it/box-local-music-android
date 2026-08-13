            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.ValueType;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.litertlm.Contents;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            import kotlin.jvm.functions.Function1;
            
            public class O11iO00I1o extends IO1oiol {
                public IO1loOo1o I0000O;
                public Context I0000oI00;
                public String I0001Ioi1lo;
                public final OI1I0OoOl I000II;
                public final ConcurrentHashMap I000O01llI0;
                public final OlO0OIIl1 I000OOo1O;
                public final OOli1O I000OiO;

                public O11iO00I1o() {
/* 5 */             OlO0iOl0il.I00000oIO(null);
/* 13 */            this.I000II = new OI1I0OoOl();
/* 20 */            this.I000O01llI0 = new ConcurrentHashMap();
/* 24 */            OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO("");
/* 28 */            this.I000OOo1O = olO0OIIl1I00000oIO;
/* 34 */            this.I000OiO = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
                }

                public static void I000oI1ioi(O11iO00I1o o11iO00I1o, O1oIOiI11o0 o1oIOiI11o0, String str, List list, List list2, Function1 function1, IllOOo00lI illOOo00lI, Function1 function12, boolean z, int i) {
/* 1 */             int i2 = i & 4;
/* 3 */             Il01100l il01100l = Il01100l.I00iOIl;
/* 9 */             List list3 = i2 != 0 ? il01100l : list;
/* 17 */            List list4 = (i & 8) != 0 ? il01100l : list2;
/* 32 */            Function1 i01OoIoio00O = (i & 16) != 0 ? new I01OoIoio00O(8) : function1;
/* 37 */            I01OoIoio00O i01OoIoio00O2 = new I01OoIoio00O(7);
/* 53 */            IllOOo00lI o0o0Ol0 = (i & 64) != 0 ? new O0o0Ol0(10) : illOOo00lI;
/* 55 */            o11iO00I1o.getClass();
/* 100 */           iOi1II01i0.I0000O(OooiooIOO.I00000oIO(o11iO00I1o), IiiIil1lOIO.I00000oIO, null, new O11i0Oi(o11iO00I1o, str, o1oIOiI11o0, list3, (String) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Accelerator", ""), ValueType.STRING), function12, list4, z, i01OoIoio00O2, i01OoIoio00O, o0o0Ol0, null), 2);
                }

                public static void I00111O(O11iO00I1o o11iO00I1o, O1oIOiI11o0 o1oIOiI11o0, Contents contents, boolean z, boolean z2) {
/* 5 */             O0o0Ol0 o0o0Ol0 = new O0o0Ol0(9);
/* 8 */             o11iO00I1o.getClass();
/* 34 */            iOi1II01i0.I0000O(OooiooIOO.I00000oIO(o11iO00I1o), IiiIil1lOIO.I00000oIO, null, new O11iIIiO(o11iO00I1o, o1oIOiI11o0, z, z2, contents, Il01100l.I00iOIl, false, o0o0Ol0, null), 2);
                }

                public final IO1loOo1o I00100l0() {
/* 1 */             IO1loOo1o iO1loOo1o = this.I0000O;
/* 3 */             if (iO1loOo1o != null) {
/* 5 */                 return iO1loOo1o;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("chatRepository");
/* 20 */            throw null;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00100o1O0lo(String str, IOoilo iOoilo) throws Throwable {
                    O11i1illoO o11i1illoO;
/* 3 */             if (iOoilo instanceof O11i1illoO) {
/* 6 */                 o11i1illoO = (O11i1illoO) iOoilo;
/* 8 */                 int i = o11i1illoO.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o11i1illoO.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o11i1illoO = new O11i1illoO(this, iOoilo);
                        }
                    }
/* 25 */            Object latestForModel = o11i1illoO.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o11i1illoO.I00iiO;
                    try {
/* 33 */                if (i2 == 0) {
/* 49 */                    lIoii1l01l0i.I00000oOI(latestForModel);
/* 52 */                    IO1loOo1o iO1loOo1oI00100l0 = I00100l0();
/* 56 */                    o11i1illoO.I00iiO = 1;
/* 60 */                    latestForModel = iO1loOo1oI00100l0.I00000oIO.getLatestForModel(str, o11i1illoO);
/* 64 */                    if (latestForModel == ii0111o) {
/* 66 */                        return ii0111o;
                            }
                        } else {
/* 35 */                    if (i2 != 1) {
/* 45 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 37 */                    lIoii1l01l0i.I00000oOI(latestForModel);
                        }
/* 67 */                return (Conversation) latestForModel;
                    } catch (Exception e) {
/* 74 */                Log.e("AGLlmChatViewModel", "Failed to get latest conversation for model", e);
/* 31 */                return null;
                    }
                }

                public final void I0010I0i(Context context, OloIl1l1oOii oloIl1l1oOii, O1oIOiI11o0 o1oIOiI11o0, O1ol100o0O o1ol100o0O, String str) {
/* 7 */             if (I0001Ioi1lo(o1oIOiI11o0) instanceof IO1i11) {
/* 9 */                 I000OOo1O(o1oIOiI11o0);
                    }
/* 23 */            IO1Oo0 iO1Oo0 = new IO1Oo0(IO1iIoo.I00iiO, IO1loo.I00iiO, 0.0f, null, false, 60);
/* 26 */            iO1Oo0.I000II = str;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            I0000oI00(o1oIOiI11o0, iO1Oo0);
/* 54 */            iOi1II01i0.I0000O(OooiooIOO.I00000oIO(this), IiiIil1lOIO.I00000oIO, null, new I0O0Ooi10l(o1ol100o0O, context, oloIl1l1oOii, o1oIOiI11o0, this, null, 3), 2);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0010o(String str, IOoilo iOoilo) throws Throwable {
                    O11i1l o11i1l;
/* 3 */             if (iOoilo instanceof O11i1l) {
/* 6 */                 o11i1l = (O11i1l) iOoilo;
/* 8 */                 int i = o11i1l.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o11i1l.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o11i1l = new O11i1l(this, iOoilo);
                        }
                    }
/* 25 */            Object messagesForConversationSync = o11i1l.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o11i1l.I00iiO;
                    try {
/* 33 */                if (i2 == 0) {
/* 49 */                    lIoii1l01l0i.I00000oOI(messagesForConversationSync);
/* 52 */                    IO1loOo1o iO1loOo1oI00100l0 = I00100l0();
/* 56 */                    o11i1l.I00iiO = 1;
/* 60 */                    messagesForConversationSync = iO1loOo1oI00100l0.I00000oOI.getMessagesForConversationSync(str, o11i1l);
/* 64 */                    if (messagesForConversationSync == ii0111o) {
/* 66 */                        return ii0111o;
                            }
                        } else {
/* 35 */                    if (i2 != 1) {
/* 45 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 32 */                        return null;
                            }
/* 37 */                    lIoii1l01l0i.I00000oOI(messagesForConversationSync);
                        }
/* 67 */                return (List) messagesForConversationSync;
                    } catch (Exception e) {
/* 74 */                Log.e("AGLlmChatViewModel", "Failed to load conversation history", e);
/* 32 */                return null;
                    }
                }
            }
