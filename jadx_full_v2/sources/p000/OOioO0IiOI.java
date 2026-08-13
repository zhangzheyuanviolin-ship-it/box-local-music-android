            package p000;

            import com.google.ai.edge.gallery.data.local.dao.RagDocumentDao;
            import com.google.ai.edge.gallery.data.local.entities.RagDocumentEntity;
            import java.lang.invoke.VarHandle;
            
            public final class OOioO0IiOI implements RagDocumentDao {
                public Oi1oIiOiIi0 I00000oIO;
                public IOol1o01iII I00000oOI;
                public IOolI11o1l I0000Il00O;

                @Override
                public final Object delete(RagDocumentEntity ragDocumentEntity, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             OOioI1IIiO0o oOioI1IIiO0o = new OOioI1IIiO0o(1);
/* 9 */             oOioI1IIiO0o.I00iiI = this;
/* 11 */            oOioI1IIiO0o.I00iiO = ragDocumentEntity;
/* 13 */            VarHandle.storeStoreFence();
/* 17 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, oOioI1IIiO0o);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final Object getById(String str, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(28);
/* 10 */            i0ioO0Oio0ll.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 17 */            return il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, true, false, i0ioO0Oio0ll);
                }

                @Override
                public final Object insert(RagDocumentEntity ragDocumentEntity, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             OOioI1IIiO0o oOioI1IIiO0o = new OOioI1IIiO0o(0);
/* 9 */             oOioI1IIiO0o.I00iiI = this;
/* 11 */            oOioI1IIiO0o.I00iiO = ragDocumentEntity;
/* 13 */            VarHandle.storeStoreFence();
/* 17 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, oOioI1IIiO0o);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final IlOil1ii observeAll() {
/* 12 */            OOii01Ioi1 oOii01Ioi1 = new OOii01Ioi1(3);
/* 15 */            VarHandle.storeStoreFence();
/* 19 */            return ilOooi01I.I00000oIO(this.I00000oIO, false, new String[]{"rag_documents"}, oOii01Ioi1);
                }
            }
