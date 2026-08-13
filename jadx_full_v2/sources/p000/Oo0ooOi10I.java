            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class Oo0ooOi10I {
                public static final I0OooiI1I I00000oIO = new I0OooiI1I("NO_THREAD_ELEMENTS", 3);
                public static final Oll1iiOII I00000oOI = new Oll1iiOII(8);
                public static final Oll1iiOII I0000Il00O = new Oll1iiOII(9);
                public static final Oll1iiOII I0000O = new Oll1iiOII(10);

                public static final void I00000oIO(Ii00l101O ii00l101O, Object obj) {
/* 3 */             if (obj == I00000oIO) {
/* 35 */                return;
                    }
/* 8 */             if (!(obj instanceof Oo10Ii01I0i1)) {
/* 45 */                ((Oo0ooO0ll0) ii00l101O.I00IoiI(I0000Il00O, null)).I00lll10(obj);
/* 89 */                return;
                    }
/* 10 */            Oo10Ii01I0i1 oo10Ii01I0i1 = (Oo10Ii01I0i1) obj;
/* 12 */            Oo0ooO0ll0[] oo0ooO0ll0Arr = oo10Ii01I0i1.I0000Il00O;
                    int length = oo0ooO0ll0Arr.length - 1;
/* 17 */            if (length < 0) {
/* 35 */                return;
                    }
                    while (true) {
                        int i = length - 1;
/* 27 */                oo0ooO0ll0Arr[length].I00lll10(oo10Ii01I0i1.I00000oOI[length]);
/* 30 */                if (i < 0) {
/* 35 */                    return;
                        } else {
/* 33 */                    length = i;
                        }
                    }
                }

                public static final Object I00000oOI(Ii00l101O ii00l101O, Object obj) {
/* 6 */             if (obj == null) {
/* 10 */                obj = ii00l101O.I00IoiI(I00000oOI, 0);
                    }
/* 14 */            if (obj == 0) {
/* 16 */                return I00000oIO;
                    }
/* 21 */            if (!(obj instanceof Integer)) {
/* 56 */                return ((Oo0ooO0ll0) obj).I00Ol00();
                    }
/* 27 */            int iIntValue = ((Number) obj).intValue();
/* 31 */            Oo10Ii01I0i1 oo10Ii01I0i1 = new Oo10Ii01I0i1();
/* 34 */            oo10Ii01I0i1.I00000oIO = ii00l101O;
/* 38 */            oo10Ii01I0i1.I00000oOI = new Object[iIntValue];
/* 42 */            oo10Ii01I0i1.I0000Il00O = new Oo0ooO0ll0[iIntValue];
/* 44 */            VarHandle.storeStoreFence();
/* 49 */            return ii00l101O.I00IoiI(I0000O, oo10Ii01I0i1);
                }
            }
