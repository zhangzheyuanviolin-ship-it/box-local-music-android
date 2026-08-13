            package p000;

            import android.util.Log;
            import com.google.ai.edge.litertlm.Conversation;
            import com.google.ai.edge.litertlm.ConversationConfig;
            import com.google.ai.edge.litertlm.Message;
            import com.google.ai.edge.litertlm.MessageCallback;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
/* 33 */    public final class O111ol0lilll implements MessageCallback {
                public boolean I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public Object I00ioIO;

                public O111ol0lilll(OI1IlOlol oI1IlOlol, Oi0Oooi oi0Oooi, OooO111lO1OI oooO111lO1OI, boolean z, O111ol0lilll o111ol0lilll, List list) {
/* 4 */             this.I00iiI = oI1IlOlol;
/* 6 */             this.I00iiO = oi0Oooi;
/* 8 */             this.I00iio = oooO111lO1OI;
/* 10 */            this.I00iOIl = z;
/* 12 */            this.I00ilI0I1 = o111ol0lilll;
/* 14 */            this.I00ilO0 = list;
/* 21 */            this.I00io1l = new LinkedHashMap();
/* 25 */            O1li00Io.I00000oIO.getClass();
/* 32 */            this.I00ioIO = O1lOolo.I00000oIO();
                }

                public Integer I00000oIO(int i) {
/* 13 */            Integer num = (Integer) ((LinkedHashMap) this.I00io1l).get(Integer.valueOf(i));
/* 15 */            if (num != null) {
/* 77 */                return num;
                    }
/* 19 */            O111ol0lilll o111ol0lilll = (O111ol0lilll) this.I00ilI0I1;
/* 21 */            if (o111ol0lilll != null) {
/* 23 */                return o111ol0lilll.I00000oIO(i);
                    }
/* 28 */            return null;
                }

                public void I00000oOI(O0iOOoiioO o0iOOoiioO) {
/* 3 */             I1ii1o0 i1ii1o0 = (I1ii1o0) this.I00io1l;
/* 5 */             if (i1ii1o0 == null || o0iOOoiioO != ((O0iOOoiioO) this.I00ioIO) || i1ii1o0.I0000O()) {
/* 19 */                this.I00ioIO = o0iOOoiioO;
/* 53 */                i1ii1o0 = new I1ii1o0((I1111OO10i) this.I00iiI, (IiIooOOOI) this.I00iio, (IliO0o11i01) this.I00ilI0I1, lOlilIi0I.I00000oIO((Oo0lloOiiIOI) this.I00iiO, o0iOOoiioO), (List) this.I00ilO0, this.I00iOIl);
                    }
/* 57 */            this.I00io1l = i1ii1o0;
                }

                public O111ol0lilll I0000Il00O(List list) {
/* 23 */            O111ol0lilll o111ol0lilll = new O111ol0lilll((OI1IlOlol) this.I00iiI, (Oi0Oooi) this.I00iiO, (OooO111lO1OI) this.I00iio, this.I00iOIl, this, (List) this.I00ilO0);
/* 26 */            Iterator it = list.iterator();
/* 34 */            while (it.hasNext()) {
/* 40 */                OOi0O1i1lOi oOi0O1i1lOi = (OOi0O1i1lOi) it.next();
/* 58 */                ((LinkedHashMap) o111ol0lilll.I00io1l).put(Integer.valueOf(oOi0O1i1lOi.I00ilI0I1), Integer.valueOf(oOi0O1i1lOi.I00iio));
                    }
/* 77 */            return o111ol0lilll;
                }

                @Override
                public void onDone() {
/* 3 */             OOo0l0ii10l oOo0l0ii10l = (OOo0l0ii10l) this.I00iiI;
/* 7 */             if (oOo0l0ii10l.I00iOIl) {
/* 110 */               return;
                    }
/* 11 */            oOo0l0ii10l.I00iOIl = true;
/* 22 */            ((Function3) this.I00ilI0I1).invoke("", Boolean.TRUE, null);
/* 27 */            if (!this.I00iOIl || ((OOo0l0ii10l) this.I00iiO).I00iOIl) {
/* 110 */               return;
                    }
/* 37 */            O111ooi11li o111ooi11li = O111ooi11li.I00000oIO;
/* 41 */            O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00io1l;
/* 45 */            Object obj = o1oIOiI11o0.I00IlilI0i0i;
/* 54 */            O11illi o11illi = obj instanceof O11illi ? (O11illi) obj : null;
/* 55 */            if (o11illi == null) {
/* 110 */               return;
                    }
                    try {
/* 77 */                Conversation conversationCreateConversation = o11illi.I00000oIO.createConversation(new ConversationConfig(o11illi.I0000Il00O, null, o11illi.I0000O, null, false, null, null, 114, null));
/* 83 */                o11illi.I00000oOI.close();
/* 92 */                o1oIOiI11o0.I00IlilI0i0i = O11illi.I00000oIO(o11illi, conversationCreateConversation, null, null, 13);
/* 96 */                Log.w("AGLlmChatModelHelper", "NPU empty completion — rebuilt a fresh session so retries aren't wedged");
                    } catch (Exception e) {
/* 104 */               Log.w("AGLlmChatModelHelper", "empty-recovery rebuild failed; continuing", e);
                    }
                }

                @Override
                public void onError(Throwable th) {
/* 3 */             OOo0l0ii10l oOo0l0ii10l = (OOo0l0ii10l) this.I00iiI;
/* 7 */             if (oOo0l0ii10l.I00iOIl) {
/* 9 */                 return;
                    }
/* 11 */            oOo0l0ii10l.I00iOIl = true;
/* 17 */            if (th instanceof CancellationException) {
/* 21 */                Log.i("AGLlmChatModelHelper", "The inference is cancelled.");
/* 33 */                ((Function3) this.I00ilI0I1).invoke("", Boolean.TRUE, null);
/* 36 */                return;
                    }
/* 39 */            Log.e("AGLlmChatModelHelper", "onError", th);
/* 64 */            ((Function1) this.I00ioIO).invoke("Error: " + th.getMessage());
                }

                @Override
                public void onMessage(Message message) {
/* 3 */             Function3 function3 = (Function3) this.I00ilI0I1;
/* 7 */             StringBuilder sb = (StringBuilder) this.I00iio;
/* 11 */            OOo0l0ii10l oOo0l0ii10l = (OOo0l0ii10l) this.I00iiI;
/* 15 */            if (oOo0l0ii10l.I00iOIl) {
/* 17 */                return;
                    }
/* 18 */            String string = message.toString();
/* 27 */            if (string.length() > 0) {
/* 33 */                ((OOo0l0ii10l) this.I00iiO).I00iOIl = true;
                    }
/* 37 */            if (sb != null) {
/* 39 */                sb.append(string);
/* 42 */                O111ooi11li o111ooi11li = O111ooi11li.I00000oIO;
/* 44 */                int length = sb.length();
/* 50 */                if (length >= 30) {
/* 61 */                    String strSubstring = sb.substring(Math.max(0, length - 600));
/* 65 */                    int length2 = strSubstring.length();
/* 69 */                    int i = length2 / 5;
/* 71 */                    int i2 = 6;
/* 72 */                    if (6 <= i) {
                                while (true) {
/* 74 */                            int i3 = length2 - i2;
/* 76 */                            int i4 = 1;
/* 77 */                            int i5 = i3;
/* 89 */                            do {
/* 78 */                                i5 -= i2;
/* 79 */                                if (i5 >= 0 && strSubstring.regionMatches(i5, strSubstring, i3, i2)) {
/* 87 */                                    i4++;
                                        } else if (i2 == i) {
                                            break;
                                        } else {
/* 169 */                                   i2++;
                                        }
/* 89 */                            } while (i4 < 5);
/* 101 */                           function3.invoke(string, Boolean.FALSE, message.getChannels().get("thought"));
/* 104 */                           oOo0l0ii10l.I00iOIl = true;
/* 111 */                           function3.invoke("", Boolean.TRUE, null);
/* 139 */                           Log.i("AGLlmChatModelHelper", "NPU loop guard: stopped runaway repetition at " + sb.length() + " chars");
/* 146 */                           Conversation conversation = (Conversation) this.I00ilO0;
/* 152 */                           I0100i i0100i = new I0100i(26);
/* 155 */                           i0100i.I00iiI = conversation;
/* 157 */                           VarHandle.storeStoreFence();
/* 163 */                           new Thread(i0100i).start();
/* 166 */                           return;
                                }
                            }
                        }
                    }
/* 182 */           function3.invoke(string, Boolean.FALSE, message.getChannels().get("thought"));
                }

/* 34 */        public O111ol0lilll(OI1IlOlol oI1IlOlol, Oi0Oooi oi0Oooi, OooO111lO1OI oooO111lO1OI, boolean z, List list, int i) {
/* 36 */            this(oI1IlOlol, oi0Oooi, oooO111lO1OI, z, (O111ol0lilll) null, (i & 32) != 0 ? Il01100l.I00iOIl : list);
                }

/* 36 */        public O111ol0lilll(I1111OO10i i1111OO10i, IiIooOOOI iiIooOOOI, IliO0o11i01 iliO0o11i01, Oo0lloOiiIOI oo0lloOiiIOI, List list, boolean z) {
/* 38 */            this.I00iiI = i1111OO10i;
/* 39 */            this.I00iiO = oo0lloOiiIOI;
/* 40 */            this.I00iOIl = z;
/* 41 */            this.I00iio = iiIooOOOI;
/* 42 */            this.I00ilI0I1 = iliO0o11i01;
/* 43 */            this.I00ilO0 = list;
                }
            }
