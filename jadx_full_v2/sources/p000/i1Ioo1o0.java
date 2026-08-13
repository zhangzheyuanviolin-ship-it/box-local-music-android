            package p000;

            import android.view.KeyEvent;
            import java.lang.invoke.VarHandle;
            
            public abstract class i1Ioo1o0 {
                public static i1IoOioloO1 I00000oIO;

                public static O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, OI0lOIiOIOOo oI0lOIiOIOOo, Iol100iI0lO iol100iI0lO, boolean z, Oi1o00lo oi1o00lo, IllOOo00lI illOOo00lI, int i) {
                    O1ooiI111i o1ooiI111iI00000oIO;
/* 3 */             if ((i & 4) != 0) {
/* 5 */                 z = true;
                    }
/* 6 */             boolean z2 = z;
/* 9 */             if ((i & 16) != 0) {
/* 11 */                oi1o00lo = null;
                    }
/* 12 */            Oi1o00lo oi1o00lo2 = oi1o00lo;
/* 14 */            if (iol100iI0lO != null) {
/* 22 */                o1ooiI111iI00000oIO = new IOIlIiO0(oI0lOIiOIOOo, iol100iI0lO, false, z2, null, oi1o00lo2, illOOo00lI);
                    } else if (iol100iI0lO == null) {
/* 35 */                o1ooiI111iI00000oIO = new IOIlIiO0(oI0lOIiOIOOo, null, false, z2, null, oi1o00lo2, illOOo00lI);
                    } else {
/* 39 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 41 */                if (oI0lOIiOIOOo != null) {
/* 54 */                    o1ooiI111iI00000oIO = Iol0oOO.I00000oIO(o1ooIo101ll, oI0lOIiOIOOo, iol100iI0lO).I0000O(new IOIlIiO0(oI0lOIiOIOOo, null, false, z2, null, oi1o00lo2, illOOo00lI));
                        } else {
/* 61 */                    IOIlOI10Ii iOIlOI10Ii = new IOIlOI10Ii();
/* 64 */                    iOIlOI10Ii.I00iOIl = iol100iI0lO;
/* 66 */                    iOIlOI10Ii.I00iiI = z2;
/* 68 */                    iOIlOI10Ii.I00iiO = oi1o00lo2;
/* 70 */                    iOIlOI10Ii.I00iio = illOOo00lI;
/* 72 */                    VarHandle.storeStoreFence();
/* 75 */                    o1ooiI111iI00000oIO = iilOllOlO1.I00000oIO(o1ooIo101ll, iOIlOI10Ii);
                        }
                    }
/* 79 */            return o1ooiI111i.I0000O(o1ooiI111iI00000oIO);
                }

                public static O1ooiI111i I00000oOI(O1ooiI111i o1ooiI111i, boolean z, String str, IllOOo00lI illOOo00lI, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 z = true;
                    }
/* 6 */             boolean z2 = z;
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str = null;
                    }
/* 23 */            return o1ooiI111i.I0000O(new IOIlIiO0(null, null, true, z2, str, null, illOOo00lI));
                }

                public static O1ooiI111i I0000Il00O(O1ooiI111i o1ooiI111i, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2) {
/* 8 */             return o1ooiI111i.I0000O(new IOOo11lI1(null, true, illOOo00lI2, illOOo00lI));
                }

                public static final boolean I0000O(KeyEvent keyEvent) {
/* 1 */             long jI00000oIO = l0iloO.I00000oIO(keyEvent);
/* 5 */             int i = O0O11OI0i.I00IoiI;
                    return O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I000O01llI0) || O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I0010I0i) || O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00II0oii1o) || O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00100o1O0lo);
                }
            }
