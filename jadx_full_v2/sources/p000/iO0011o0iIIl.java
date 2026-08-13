            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iO0011o0iIIl {
                public static final O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, OII1lIlol oII1lIlol, OIIII0oOo1o oIIII0oOo1o) {
/* 3 */             OIIII0oi oIIII0oi = new OIIII0oi();
/* 6 */             oIIII0oi.I00000oIO = oII1lIlol;
/* 8 */             oIIII0oi.I00000oOI = oIIII0oOo1o;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            return o1ooiI111i.I0000O(oIIII0oi);
                }
            }
