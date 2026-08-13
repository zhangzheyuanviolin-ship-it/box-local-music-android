            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReference;
            
            public abstract class l10O10 {
                public static final O0oi00O1l I00000oIO(I01O1lIi i01O1lIi) {
                    O0oi00O1l o0oi00O1l;
                    Io11l1li io11l1li;
                    IOoil1iiIilo iOoil1iiIilo;
/* 3 */             IIOOoll iIOOoll = (IIOOoll) i01O1lIi.I00iOIl;
/* 64 */            do {
/* 13 */                O0oi00O1l o0oi00O1l2 = (O0oi00O1l) ((AtomicReference) iIOOoll.I00iiI).get();
/* 15 */                if (o0oi00O1l2 != null) {
/* 17 */                    return o0oi00O1l2;
                        }
/* 20 */                Oliiii0 oliiii0I00000oIO = lOi1li0o0.I00000oIO();
/* 24 */                IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 26 */                io11l1li = O1OI1l011OO1.I00000oIO;
/* 30 */                Ii00l101O ii00l101OI00000oIO = iiollilo0IO1.I00000oIO(oliiii0I00000oIO, io11l1li.I00ilI0I1);
/* 34 */                o0oi00O1l = new O0oi00O1l();
/* 37 */                o0oi00O1l.I00iOIl = i01O1lIi;
/* 39 */                o0oi00O1l.I00iiI = ii00l101OI00000oIO;
/* 47 */                iOoil1iiIilo = null;
/* 48 */                if (i01O1lIi.I00ol1() == O0oOi0I.I00iOIl) {
/* 50 */                    l01oO1iOo.I00000oOI(ii00l101OI00000oIO, null);
                        }
/* 53 */                VarHandle.storeStoreFence();
/* 64 */            } while (!((AtomicReference) iIOOoll.I00iiI).compareAndSet(null, o0oi00O1l));
/* 75 */            iOi1II01i0.I0000O(o0oi00O1l, io11l1li.I00ilI0I1, null, new O00lOIIO(o0oi00O1l, iOoil1iiIilo, 1), 2);
/* 168 */           return o0oi00O1l;
                }
            }
