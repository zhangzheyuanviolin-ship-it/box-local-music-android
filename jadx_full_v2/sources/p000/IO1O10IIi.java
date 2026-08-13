            package p000;

            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            
            public final class IO1O10IIi extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final IO1OIo01l1 I00iiO;
                public final Conversation I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1O10IIi(IO1OIo01l1 iO1OIo01l1, Conversation conversation, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = iO1OIo01l1;
/* 5 */             this.I00iio = conversation;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Conversation conversation = this.I00iio;
/* 5 */             IO1OIo01l1 iO1OIo01l1 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 20 */                    return new IO1O10IIi(iO1OIo01l1, conversation, iOoil1iiIilo, 0);
                        default:
/* 13 */                    return new IO1O10IIi(iO1OIo01l1, conversation, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((IO1O10IIi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Conversation conversation = this.I00iio;
/* 5 */             IO1OIo01l1 iO1OIo01l1 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 48 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 50 */                    int i2 = this.I00iiI;
/* 52 */                    if (i2 != 0) {
/* 54 */                        if (i2 == 1) {
/* 56 */                            lIoii1l01l0i.I00000oOI(obj);
/* 85 */                            return obj;
                                }
/* 60 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 65 */                    lIoii1l01l0i.I00000oOI(obj);
/* 68 */                    IO1loOo1o iO1loOo1o = iO1OIo01l1.I00000oOI;
/* 70 */                    String id = conversation.getId();
/* 74 */                    this.I00iiI = 1;
/* 78 */                    Object messagesForConversationSync = iO1loOo1o.I00000oOI.getMessagesForConversationSync(id, this);
                            return messagesForConversationSync == ii0111o ? ii0111o : messagesForConversationSync;
                        default:
/* 14 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 16 */                    int i3 = this.I00iiI;
/* 18 */                    if (i3 == 0) {
/* 30 */                        lIoii1l01l0i.I00000oOI(obj);
/* 33 */                        IO1loOo1o iO1loOo1o2 = iO1OIo01l1.I00000oOI;
/* 35 */                        this.I00iiI = 1;
/* 41 */                        if (iO1loOo1o2.I0000Il00O(conversation, this) == ii0111o2) {
/* 43 */                            return ii0111o2;
                                }
                            } else {
/* 20 */                        if (i3 != 1) {
/* 26 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                             return null;
                                }
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 45 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
