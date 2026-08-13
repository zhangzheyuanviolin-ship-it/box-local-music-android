            package p000;

            import com.google.ai.edge.gallery.data.local.dao.ConversationDao;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import java.lang.invoke.VarHandle;
            
            public final class IOolIo implements ConversationDao {
                public Oi1oIiOiIi0 I00000oIO;
                public IOol1o01iII I00000oOI;
                public IOolI11o1l I0000Il00O;
                public IOolI11o1l I0000O;

                @Override
                public final Object delete(Conversation conversation, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             IOol1lll iOol1lll = new IOol1lll(2);
/* 9 */             iOol1lll.I00iiI = this;
/* 11 */            iOol1lll.I00iiO = conversation;
/* 13 */            VarHandle.storeStoreFence();
/* 18 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, iOol1lll);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final Object deleteAll(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             IO1I11OO io1i11oo = new IO1I11OO(16);
/* 10 */            VarHandle.storeStoreFence();
/* 15 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, io1i11oo);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final IlOil1ii getAllConversations() {
/* 13 */            IO1I11OO io1i11oo = new IO1I11OO(14);
/* 16 */            VarHandle.storeStoreFence();
/* 20 */            return ilOooi01I.I00000oIO(this.I00000oIO, false, new String[]{"conversations"}, io1i11oo);
                }

                @Override
                public final Object getAllConversationsSync(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             IO1I11OO io1i11oo = new IO1I11OO(15);
/* 10 */            VarHandle.storeStoreFence();
/* 15 */            return il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, true, false, io1i11oo);
                }

                @Override
                public final Object getConversationById(String str, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(6);
/* 9 */             i0ioO0Oio0ll.I00iiI = str;
/* 11 */            VarHandle.storeStoreFence();
/* 16 */            return il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, true, false, i0ioO0Oio0ll);
                }

                @Override
                public final IlOil1ii getConversationsByTask(String str) {
/* 12 */            I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(5);
/* 15 */            i0ioO0Oio0ll.I00iiI = str;
/* 17 */            VarHandle.storeStoreFence();
/* 21 */            return ilOooi01I.I00000oIO(this.I00000oIO, false, new String[]{"conversations"}, i0ioO0Oio0ll);
                }

                @Override
                public final Object getLatestForModel(String str, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(7);
/* 9 */             i0ioO0Oio0ll.I00iiI = str;
/* 11 */            VarHandle.storeStoreFence();
/* 16 */            return il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, true, false, i0ioO0Oio0ll);
                }

                @Override
                public final Object insert(Conversation conversation, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             IOol1lll iOol1lll = new IOol1lll(1);
/* 9 */             iOol1lll.I00iiI = this;
/* 11 */            iOol1lll.I00iiO = conversation;
/* 13 */            VarHandle.storeStoreFence();
/* 17 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, iOol1lll);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final Object update(Conversation conversation, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             IOol1lll iOol1lll = new IOol1lll(0);
/* 9 */             iOol1lll.I00iiI = this;
/* 11 */            iOol1lll.I00iiO = conversation;
/* 13 */            VarHandle.storeStoreFence();
/* 17 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, iOol1lll);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }
            }
