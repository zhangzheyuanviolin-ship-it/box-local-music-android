            package p000;

            import androidx.work.impl.model.WorkTag;
            import androidx.work.impl.model.WorkTagDao;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class i01OoioI001o implements WorkTagDao {
                public Oi1oIiOiIi0 I00000oIO;
                public IOol1o01iII I00000oOI;

                @Override
                public final void deleteByWorkSpecId(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(24);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 17 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, olOoOOIIi);
                }

                @Override
                public final List getTagsForWorkSpecId(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(25);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, olOoOOIIi);
                }

                @Override
                public final List getWorkSpecIdsWithTag(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(26);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, olOoOOIIi);
                }

                @Override
                public final void insert(WorkTag workTag) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             i01O0010i i01o0010i = new i01O0010i(3);
/* 9 */             i01o0010i.I00iiI = this;
/* 11 */            i01o0010i.I00iiO = workTag;
/* 13 */            VarHandle.storeStoreFence();
/* 18 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, i01o0010i);
                }
            }
