            package p000;

            import androidx.work.impl.model.WorkName;
            import androidx.work.impl.model.WorkNameDao;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class i01IoiO implements WorkNameDao {
                public Oi1oIiOiIi0 I00000oIO;
                public IOol1o01iII I00000oOI;

                @Override
                public final List getNamesForWorkSpecId(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(8);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, olOoOOIIi);
                }

                @Override
                public final List getWorkSpecIdsWithName(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(7);
/* 9 */             olOoOOIIi.I00iiI = str;
/* 11 */            VarHandle.storeStoreFence();
/* 20 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, olOoOOIIi);
                }

                @Override
                public final void insert(WorkName workName) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OiOi011iI1ol oiOi011iI1ol = new OiOi011iI1ol(29);
/* 10 */            oiOi011iI1ol.I00iiI = this;
/* 12 */            oiOi011iI1ol.I00iiO = workName;
/* 14 */            VarHandle.storeStoreFence();
/* 19 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, oiOi011iI1ol);
                }
            }
