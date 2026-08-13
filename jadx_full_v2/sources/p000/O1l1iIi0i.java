            package p000;

            import com.google.ai.edge.gallery.data.local.dao.MessageDao;
            import com.google.ai.edge.gallery.data.local.entities.Message;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class O1l1iIi0i implements MessageDao {
                public Oi1oIiOiIi0 I00000oIO;
                public IOol1o01iII I00000oOI;
                public IOolI11o1l I0000Il00O;

                @Override
                public final Object delete(Message message, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             O1l1iIOo0 o1l1iIOo0 = new O1l1iIOo0(0);
/* 9 */             o1l1iIOo0.I00iiI = this;
/* 11 */            o1l1iIOo0.I00iiO = message;
/* 13 */            VarHandle.storeStoreFence();
/* 17 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, o1l1iIOo0);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final Object deleteAllForConversation(String str, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(21);
/* 10 */            i0ioO0Oio0ll.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 17 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, i0ioO0Oio0ll);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final IlOil1ii getMessagesForConversation(String str) {
/* 13 */            I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(20);
/* 16 */            i0ioO0Oio0ll.I00iiI = str;
/* 18 */            VarHandle.storeStoreFence();
/* 22 */            return ilOooi01I.I00000oIO(this.I00000oIO, false, new String[]{"messages"}, i0ioO0Oio0ll);
                }

                @Override
                public final Object getMessagesForConversationSync(String str, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(22);
/* 10 */            i0ioO0Oio0ll.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 17 */            return il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, true, false, i0ioO0Oio0ll);
                }

                @Override
                public final Object insert(Message message, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             O1l1iIOo0 o1l1iIOo0 = new O1l1iIOo0(1);
/* 9 */             o1l1iIOo0.I00iiI = this;
/* 11 */            o1l1iIOo0.I00iiO = message;
/* 13 */            VarHandle.storeStoreFence();
/* 17 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, o1l1iIOo0);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final Object insertAll(List list, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(28);
/* 10 */            iiioilIl1Il.I00iiI = this;
/* 12 */            iiioilIl1Il.I00iiO = list;
/* 14 */            VarHandle.storeStoreFence();
/* 19 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, iiioilIl1Il);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }
            }
