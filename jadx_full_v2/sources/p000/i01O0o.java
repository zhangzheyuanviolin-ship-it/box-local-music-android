            package p000;

            import androidx.work.impl.model.WorkProgress;
            import androidx.work.impl.model.WorkProgressDao;
            import java.lang.invoke.VarHandle;
            
            public final class i01O0o implements WorkProgressDao {
                public Oi1oIiOiIi0 I00000oIO;
                public IOol1o01iII I00000oOI;

                @Override
                public final void delete(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(10);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 17 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, olOoOOIIi);
                }

                @Override
                public final void deleteAll() {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             Ooo0i1lloioO ooo0i1lloioO = new Ooo0i1lloioO(16);
/* 10 */            VarHandle.storeStoreFence();
/* 15 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, ooo0i1lloioO);
                }

                @Override
                public final Ii11I1OOII1 getProgressForWorkSpecId(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(9);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (Ii11I1OOII1) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, olOoOOIIi);
                }

                @Override
                public final void insert(WorkProgress workProgress) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             i01O0010i i01o0010i = new i01O0010i(0);
/* 9 */             i01o0010i.I00iiI = this;
/* 11 */            i01o0010i.I00iiO = workProgress;
/* 13 */            VarHandle.storeStoreFence();
/* 17 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, i01o0010i);
                }
            }
