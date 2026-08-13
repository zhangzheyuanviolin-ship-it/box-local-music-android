            package p000;

            import com.google.ai.edge.gallery.data.local.dao.RagChunkDao;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class OOio1O implements RagChunkDao {
                public Oi1oIiOiIi0 I00000oIO;
                public IOol1o01iII I00000oOI;

                @Override
                public final Object getAll(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             OOii01Ioi1 oOii01Ioi1 = new OOii01Ioi1(2);
/* 9 */             VarHandle.storeStoreFence();
/* 14 */            return il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, true, false, oOii01Ioi1);
                }

                @Override
                public final Object getForDocuments(List list, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append("SELECT * FROM rag_chunks WHERE document_id IN (");
/* 15 */            lOi01iio0o.I00000oIO(list.size(), sb);
/* 20 */            sb.append(")");
/* 23 */            String string = sb.toString();
/* 27 */            Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 33 */            O1lIIi o1lIIi = new O1lIIi(24);
/* 36 */            o1lIIi.I00iiI = string;
/* 38 */            o1lIIi.I00iiO = list;
/* 40 */            VarHandle.storeStoreFence();
/* 45 */            return il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, true, false, o1lIIi);
                }

                @Override
                public final Object insertAll(List list, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             O1lIIi o1lIIi = new O1lIIi(23);
/* 10 */            o1lIIi.I00iiI = this;
/* 12 */            o1lIIi.I00iiO = list;
/* 14 */            VarHandle.storeStoreFence();
/* 19 */            Object objI0000Il00O = il01ioIoI.I0000Il00O(iOoil1iiIilo, oi1oIiOiIi0, false, true, o1lIIi);
                    return objI0000Il00O == Ii0111o.I00iOIl ? objI0000Il00O : OoiIlOl1iI.I00000oIO;
                }
            }
