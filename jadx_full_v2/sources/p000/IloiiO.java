            package p000;

            import com.google.ai.edge.gallery.data.local.BoxChatDatabase;
            import com.google.ai.edge.gallery.data.local.dao.ConversationDao;
            import com.google.ai.edge.gallery.data.local.dao.MessageDao;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.data.local.entities.Message;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class IloiiO extends Oll0io implements IlliIl1l11O {
                public OOo0ooi I00iOIl;
                public boolean I00iiI;
                public int I00iiO;
                public final BoxChatDatabase I00iio;
                public final Conversation I00ilI0I1;
                public final String I00ilO0;
                public final IlooOlI I00io1l;
                public final Ol1o0O0O0 I00ioIO;
                public final Ii0110 I00l0I0l0lO1;
                public final OI10i0Il I00l0OO0IO;
                public final OI10i0Il I00li1OI;
                public final Ol1OlloIO I00ll1;
                public final OI10i0Il I00lli11;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IloiiO(BoxChatDatabase boxChatDatabase, Conversation conversation, String str, IlooOlI ilooOlI, Ol1o0O0O0 ol1o0O0O0, Ii0110 ii0110, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, Ol1OlloIO ol1OlloIO, OI10i0Il oI10i0Il3, IOoil1iiIilo iOoil1iiIilo) {
/* 22 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iio = boxChatDatabase;
/* 3 */             this.I00ilI0I1 = conversation;
/* 5 */             this.I00ilO0 = str;
/* 7 */             this.I00io1l = ilooOlI;
/* 9 */             this.I00ioIO = ol1o0O0O0;
/* 11 */            this.I00l0I0l0lO1 = ii0110;
/* 13 */            this.I00l0OO0IO = oI10i0Il;
/* 15 */            this.I00li1OI = oI10i0Il2;
/* 17 */            this.I00ll1 = ol1OlloIO;
/* 19 */            this.I00lli11 = oI10i0Il3;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 24 */            return new IloiiO(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, this.I00li1OI, this.I00ll1, this.I00lli11, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IloiiO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:62:0x01fb, code lost:
                
                    if (r4.update(r5, r42) != r0) goto L64;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0111 A[Catch: all -> 0x012e, Exception -> 0x0133, PHI: r3 r12 r15 r28
                  0x0111: PHI (r3v22 java.lang.Object) = (r3v21 java.lang.Object), (r3v26 java.lang.Object) binds: [B:38:0x010d, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
                  0x0111: PHI (r12v5 java.lang.String) = (r12v4 java.lang.String), (r12v0 java.lang.String) binds: [B:38:0x010d, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
                  0x0111: PHI (r15v5 com.google.ai.edge.gallery.data.local.entities.Conversation) = 
                  (r15v4 com.google.ai.edge.gallery.data.local.entities.Conversation)
                  (r15v0 com.google.ai.edge.gallery.data.local.entities.Conversation)
                 binds: [B:38:0x010d, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
                  0x0111: PHI (r28v7 OI10i0Il) = (r28v3 OI10i0Il), (r28v8 OI10i0Il) binds: [B:38:0x010d, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {Exception -> 0x0133, all -> 0x012e, blocks: (B:40:0x0111, B:42:0x0119, B:37:0x00fa), top: B:90:0x00fa }] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0119 A[Catch: all -> 0x012e, Exception -> 0x0133, TRY_LEAVE, TryCatch #6 {Exception -> 0x0133, all -> 0x012e, blocks: (B:40:0x0111, B:42:0x0119, B:37:0x00fa), top: B:90:0x00fa }] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x01b5  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x01b6 A[Catch: all -> 0x0204, Exception -> 0x0206, PHI: r3 r13 r15
                  0x01b6: PHI (r3v29 boolean) = (r3v27 boolean), (r3v30 boolean) binds: [B:56:0x01b3, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]
                  0x01b6: PHI (r13v19 OI10i0Il) = (r13v17 OI10i0Il), (r13v20 OI10i0Il) binds: [B:56:0x01b3, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]
                  0x01b6: PHI (r15v7 com.google.ai.edge.gallery.data.local.entities.Conversation) = 
                  (r15v6 com.google.ai.edge.gallery.data.local.entities.Conversation)
                  (r15v0 com.google.ai.edge.gallery.data.local.entities.Conversation)
                 binds: [B:56:0x01b3, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0204, blocks: (B:61:0x01cd, B:58:0x01b6, B:55:0x0170, B:51:0x013a, B:69:0x0207, B:72:0x020f, B:74:0x0218, B:76:0x0220, B:78:0x0228, B:81:0x0232, B:83:0x024f, B:82:0x0240), top: B:87:0x001e }] */
                /* JADX WARN: Removed duplicated region for block: B:60:0x01cc  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x01cd A[Catch: all -> 0x0204, Exception -> 0x0206, PHI: r3 r4 r13 r15
                  0x01cd: PHI (r3v31 boolean) = (r3v29 boolean), (r3v33 boolean) binds: [B:59:0x01ca, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE]
                  0x01cd: PHI (r4v16 java.lang.Object) = (r4v15 java.lang.Object), (r4v19 java.lang.Object) binds: [B:59:0x01ca, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE]
                  0x01cd: PHI (r13v22 OI10i0Il) = (r13v19 OI10i0Il), (r13v23 OI10i0Il) binds: [B:59:0x01ca, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE]
                  0x01cd: PHI (r15v8 com.google.ai.edge.gallery.data.local.entities.Conversation) = 
                  (r15v7 com.google.ai.edge.gallery.data.local.entities.Conversation)
                  (r15v0 com.google.ai.edge.gallery.data.local.entities.Conversation)
                 binds: [B:59:0x01ca, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0204, blocks: (B:61:0x01cd, B:58:0x01b6, B:55:0x0170, B:51:0x013a, B:69:0x0207, B:72:0x020f, B:74:0x0218, B:76:0x0220, B:78:0x0228, B:81:0x0232, B:83:0x024f, B:82:0x0240), top: B:87:0x001e }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x020d  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x0240 A[Catch: all -> 0x0204, TryCatch #0 {all -> 0x0204, blocks: (B:61:0x01cd, B:58:0x01b6, B:55:0x0170, B:51:0x013a, B:69:0x0207, B:72:0x020f, B:74:0x0218, B:76:0x0220, B:78:0x0228, B:81:0x0232, B:83:0x024f, B:82:0x0240), top: B:87:0x001e }] */
                /* JADX WARN: Type inference failed for: r13v0 */
                /* JADX WARN: Type inference failed for: r13v1 */
                /* JADX WARN: Type inference failed for: r13v13 */
                /* JADX WARN: Type inference failed for: r13v3, types: [OI10i0Il] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OI10i0Il oI10i0Il;
                    String message;
                    Boolean bool;
                    Conversation conversation;
                    OI10i0Il oI10i0Il2;
                    Object objI0000Il00O;
                    boolean zBooleanValue;
                    OOo0ooi oOo0ooi;
                    MessageDao messageDaoI001i1O0Ol;
                    Message message2;
                    Object messagesForConversationSync;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iiO;
/* 11 */            IlooOlI ilooOlI = this.I00io1l;
/* 13 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 15 */            OI10i0Il oI10i0Il3 = this.I00li1OI;
/* 19 */            Ol1o0O0O0 ol1o0O0O0 = this.I00ioIO;
/* 21 */            String str = this.I00ilO0;
/* 23 */            ?? r13 = 1;
/* 24 */            OI10i0Il oI10i0Il4 = this.I00lli11;
/* 26 */            Conversation conversation2 = this.I00ilI0I1;
/* 28 */            BoxChatDatabase boxChatDatabase = this.I00iio;
                    try {
                        try {
                        } catch (Throwable th) {
/* 517 */                   th = th;
                        }
                    } catch (Exception e) {
/* 50 */                e = e;
/* 51 */                oI10i0Il = oI10i0Il4;
                    } catch (Throwable th2) {
/* 46 */                th = th2;
/* 47 */                r13 = oI10i0Il4;
                    }
                    switch (i) {
                        case 0:
/* 109 */                   lIoii1l01l0i.I00000oOI(obj);
/* 112 */                   MessageDao messageDaoI001i1O0Ol2 = boxChatDatabase.I001i1O0Ol();
/* 153 */                   conversation = conversation2;
/* 159 */                   oI10i0Il2 = oI10i0Il4;
/* 161 */                   Message message3 = new Message(null, conversation2.getId(), "user", str, 0L, 0, 0L, null, 241, null);
/* 165 */                   str = str;
/* 167 */                   this.I00iiO = 1;
/* 173 */                   if (messageDaoI001i1O0Ol2.insert(message3, this) != ii0111o) {
/* 181 */                       if (conversation.getMessageCount() != 0) {
/* 206 */                           String strConcat = str.length() > 40 ? OlOoOIi0o.I00OIl(37, str).concat("…") : str;
/* 208 */                           ConversationDao conversationDaoI001IIilI0O = boxChatDatabase.I001IIilI0O();
/* 218 */                           conversation2 = conversation;
/* 234 */                           Conversation conversationCopy$default = Conversation.copy$default(conversation2, null, strConcat, null, null, 0L, System.currentTimeMillis(), 1, null, 157, null);
/* 239 */                           this.I00iiO = 2;
/* 245 */                           if (conversationDaoI001IIilI0O.update(conversationCopy$default, this) != ii0111o) {
                                    }
                                } else {
/* 249 */                           conversation2 = conversation;
                                }
                                try {
/* 251 */                           OI10i0Il oI10i0Il5 = this.I00l0OO0IO;
/* 255 */                           IlI0iIl011 ilI0iIl011 = new IlI0iIl011(20);
/* 258 */                           ilI0iIl011.I00iiI = oI10i0Il5;
/* 260 */                           VarHandle.storeStoreFence();
/* 264 */                           this.I00iiO = 3;
/* 266 */                           objI0000Il00O = ilooOlI.I0000Il00O(ilI0iIl011, this);
                                } catch (Exception e2) {
/* 308 */                           e = e2;
/* 309 */                           oI10i0Il = oI10i0Il2;
/* 520 */                           message = e.getMessage();
/* 524 */                           if (message == null) {
                                    }
/* 535 */                           if (OlOoOIi0o.I000oI1ioi(message, "DOWNLOAD_ERROR", false)) {
/* 589 */                               iOi1II01i0.I0000O(this.I00l0I0l0lO1, null, null, new IO1lI1l0Oi(this.I00ll1, null, 1), 3);
/* 592 */                               List list = Iloo0ilo.I00000oIO;
/* 594 */                               oI10i0Il3.setValue("");
/* 513 */                               bool = Boolean.FALSE;
                                    }
/* 299 */                           oI10i0Il.setValue(bool);
/* 302 */                           return ooiIlOl1iI;
                                } catch (Throwable th3) {
/* 303 */                           th = th3;
/* 304 */                           r13 = oI10i0Il2;
/* 598 */                           List list2 = Iloo0ilo.I00000oIO;
/* 602 */                           r13.setValue(Boolean.FALSE);
/* 605 */                           throw th;
                                }
/* 270 */                       if (objI0000Il00O != ii0111o) {
/* 276 */                           zBooleanValue = ((Boolean) objI0000Il00O).booleanValue();
/* 280 */                           if (zBooleanValue) {
/* 290 */                               ol1o0O0O0.add(new OI1O0o0("Feature unavailable on this device.", false));
/* 293 */                               List list3 = Iloo0ilo.I00000oIO;
/* 295 */                               bool = Boolean.FALSE;
/* 297 */                               oI10i0Il = oI10i0Il2;
/* 299 */                               oI10i0Il.setValue(bool);
/* 302 */                               return ooiIlOl1iI;
                                    }
/* 313 */                           oI10i0Il = oI10i0Il2;
                                    try {
/* 323 */                               String strI00IOO = Iloo0ilo.I00IOO(str, IOOi0Ool1i.I00i0O(20, IOOi0Ool1i.I001l0I00(ol1o0O0O0)));
/* 329 */                               OOo0ooi oOo0ooi2 = new OOo0ooi();
/* 332 */                               oOo0ooi2.I00iOIl = "";
/* 336 */                               Ii1Io1loiI ii1Io1loiII0000O = IlooOlI.I0000O(ilooOlI, strI00IOO, null, 6);
/* 343 */                               IloiOl iloiOl = new IloiOl(0);
/* 346 */                               iloiOl.I00iiI = oOo0ooi2;
/* 348 */                               iloiOl.I00iiO = oI10i0Il3;
/* 350 */                               VarHandle.storeStoreFence();
/* 353 */                               this.I00iOIl = oOo0ooi2;
/* 355 */                               this.I00iiI = zBooleanValue;
/* 358 */                               this.I00iiO = 4;
/* 364 */                               if (ii1Io1loiII0000O.I00000oIO(iloiOl, this) != ii0111o) {
/* 368 */                                   oOo0ooi = oOo0ooi2;
/* 379 */                                   ol1o0O0O0.add(new OI1O0o0((String) oOo0ooi.I00iOIl, false));
/* 382 */                                   List list4 = Iloo0ilo.I00000oIO;
/* 384 */                                   oI10i0Il3.setValue("");
/* 387 */                                   messageDaoI001i1O0Ol = boxChatDatabase.I001i1O0Ol();
/* 419 */                                   message2 = new Message(null, conversation2.getId(), "assistant", (String) oOo0ooi.I00iOIl, 0L, 0, 0L, null, 241, null);
/* 425 */                                   this.I00iOIl = null;
/* 427 */                                   this.I00iiI = zBooleanValue;
/* 430 */                                   this.I00iiO = 5;
/* 436 */                                   if (messageDaoI001i1O0Ol.insert(message2, this) == ii0111o) {
/* 439 */                                       MessageDao messageDaoI001i1O0Ol3 = boxChatDatabase.I001i1O0Ol();
/* 443 */                                       String id = conversation2.getId();
/* 448 */                                       this.I00iOIl = null;
/* 450 */                                       this.I00iiI = zBooleanValue;
/* 453 */                                       this.I00iiO = 6;
/* 455 */                                       messagesForConversationSync = messageDaoI001i1O0Ol3.getMessagesForConversationSync(id, this);
/* 459 */                                       if (messagesForConversationSync == ii0111o) {
/* 464 */                                           int size = ((List) messagesForConversationSync).size();
/* 468 */                                           ConversationDao conversationDaoI001IIilI0O2 = boxChatDatabase.I001IIilI0O();
/* 492 */                                           Conversation conversationCopy$default2 = Conversation.copy$default(conversation2, null, null, null, null, 0L, System.currentTimeMillis(), size, null, 159, null);
/* 497 */                                           this.I00iOIl = null;
/* 499 */                                           this.I00iiI = zBooleanValue;
/* 502 */                                           this.I00iiO = 7;
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception e3) {
/* 519 */                               e = e3;
/* 520 */                               message = e.getMessage();
/* 524 */                               if (message == null) {
/* 526 */                                   message = "Unknown error";
                                        }
/* 535 */                               if (!OlOoOIi0o.I000oI1ioi(message, "DOWNLOAD_ERROR", false) || OlOoOIi0o.I000oI1ioi(message, "Task was cancelled", false) || OlOoOIi0o.I000oI1ioi(message, "AICore", false) || OlOoOIi0o.I000oI1ioi(message, "model not ready", true)) {
/* 589 */                                   iOi1II01i0.I0000O(this.I00l0I0l0lO1, null, null, new IO1lI1l0Oi(this.I00ll1, null, 1), 3);
                                        } else {
/* 573 */                                   ol1o0O0O0.add(new OI1O0o0("Error: ".concat(message), false));
                                        }
/* 592 */                               List list5 = Iloo0ilo.I00000oIO;
/* 594 */                               oI10i0Il3.setValue("");
/* 513 */                               bool = Boolean.FALSE;
/* 299 */                               oI10i0Il.setValue(bool);
/* 302 */                               return ooiIlOl1iI;
                                    }
                                }
                            }
/* 510 */                   return ii0111o;
                        case 1:
/* 100 */                   lIoii1l01l0i.I00000oOI(obj);
/* 104 */                   oI10i0Il2 = oI10i0Il4;
/* 106 */                   conversation = conversation2;
/* 181 */                   if (conversation.getMessageCount() != 0) {
                            }
/* 251 */                   OI10i0Il oI10i0Il52 = this.I00l0OO0IO;
/* 255 */                   IlI0iIl011 ilI0iIl0112 = new IlI0iIl011(20);
/* 258 */                   ilI0iIl0112.I00iiI = oI10i0Il52;
/* 260 */                   VarHandle.storeStoreFence();
/* 264 */                   this.I00iiO = 3;
/* 266 */                   objI0000Il00O = ilooOlI.I0000Il00O(ilI0iIl0112, this);
/* 270 */                   if (objI0000Il00O != ii0111o) {
                            }
/* 510 */                   return ii0111o;
                        case 2:
/* 92 */                    lIoii1l01l0i.I00000oOI(obj);
/* 96 */                    oI10i0Il2 = oI10i0Il4;
/* 251 */                   OI10i0Il oI10i0Il522 = this.I00l0OO0IO;
/* 255 */                   IlI0iIl011 ilI0iIl01122 = new IlI0iIl011(20);
/* 258 */                   ilI0iIl01122.I00iiI = oI10i0Il522;
/* 260 */                   VarHandle.storeStoreFence();
/* 264 */                   this.I00iiO = 3;
/* 266 */                   objI0000Il00O = ilooOlI.I0000Il00O(ilI0iIl01122, this);
/* 270 */                   if (objI0000Il00O != ii0111o) {
                            }
/* 510 */                   return ii0111o;
                        case 3:
/* 82 */                    lIoii1l01l0i.I00000oOI(obj);
/* 85 */                    objI0000Il00O = obj;
/* 88 */                    oI10i0Il2 = oI10i0Il4;
/* 276 */                   zBooleanValue = ((Boolean) objI0000Il00O).booleanValue();
/* 280 */                   if (zBooleanValue) {
                            }
                            break;
                        case 4:
/* 72 */                    zBooleanValue = this.I00iiI;
/* 74 */                    oOo0ooi = this.I00iOIl;
/* 76 */                    lIoii1l01l0i.I00000oOI(obj);
/* 79 */                    oI10i0Il = oI10i0Il4;
/* 379 */                   ol1o0O0O0.add(new OI1O0o0((String) oOo0ooi.I00iOIl, false));
/* 382 */                   List list42 = Iloo0ilo.I00000oIO;
/* 384 */                   oI10i0Il3.setValue("");
/* 387 */                   messageDaoI001i1O0Ol = boxChatDatabase.I001i1O0Ol();
/* 419 */                   message2 = new Message(null, conversation2.getId(), "assistant", (String) oOo0ooi.I00iOIl, 0L, 0, 0L, null, 241, null);
/* 425 */                   this.I00iOIl = null;
/* 427 */                   this.I00iiI = zBooleanValue;
/* 430 */                   this.I00iiO = 5;
/* 436 */                   if (messageDaoI001i1O0Ol.insert(message2, this) == ii0111o) {
                            }
/* 510 */                   return ii0111o;
                        case 5:
/* 64 */                    zBooleanValue = this.I00iiI;
/* 66 */                    lIoii1l01l0i.I00000oOI(obj);
/* 69 */                    oI10i0Il = oI10i0Il4;
/* 439 */                   MessageDao messageDaoI001i1O0Ol32 = boxChatDatabase.I001i1O0Ol();
/* 443 */                   String id2 = conversation2.getId();
/* 448 */                   this.I00iOIl = null;
/* 450 */                   this.I00iiI = zBooleanValue;
/* 453 */                   this.I00iiO = 6;
/* 455 */                   messagesForConversationSync = messageDaoI001i1O0Ol32.getMessagesForConversationSync(id2, this);
/* 459 */                   if (messagesForConversationSync == ii0111o) {
                            }
/* 510 */                   return ii0111o;
                        case 6:
/* 54 */                    zBooleanValue = this.I00iiI;
/* 56 */                    lIoii1l01l0i.I00000oOI(obj);
/* 59 */                    messagesForConversationSync = obj;
/* 61 */                    oI10i0Il = oI10i0Il4;
/* 464 */                   int size2 = ((List) messagesForConversationSync).size();
/* 468 */                   ConversationDao conversationDaoI001IIilI0O22 = boxChatDatabase.I001IIilI0O();
/* 492 */                   Conversation conversationCopy$default22 = Conversation.copy$default(conversation2, null, null, null, null, 0L, System.currentTimeMillis(), size2, null, 159, null);
/* 497 */                   this.I00iOIl = null;
/* 499 */                   this.I00iiI = zBooleanValue;
/* 502 */                   this.I00iiO = 7;
                            break;
                        case 7:
/* 40 */                    lIoii1l01l0i.I00000oOI(obj);
/* 43 */                    oI10i0Il = oI10i0Il4;
/* 511 */                   List list6 = Iloo0ilo.I00000oIO;
/* 513 */                   bool = Boolean.FALSE;
/* 299 */                   oI10i0Il.setValue(bool);
/* 302 */                   return ooiIlOl1iI;
                        default:
/* 36 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 30 */                    return null;
                    }
                }
            }
