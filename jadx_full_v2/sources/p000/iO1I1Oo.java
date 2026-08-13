            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iO1I1Oo {
                public static final O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, boolean z, OI0lOIiOIOOo oI0lOIiOIOOo, Oi1lioiOilI oi1lioiOilI, boolean z2, Oi1o00lo oi1o00lo, Function1 function1) {
                    O1ooiI111i o1ooiI111iI00000oIO;
/* 1 */             if (oi1lioiOilI != null) {
/* 11 */                o1ooiI111iI00000oIO = new Oo1IIoOI0(z, oI0lOIiOIOOo, oi1lioiOilI, z2, oi1o00lo, function1);
                    } else if (oi1lioiOilI == null) {
/* 26 */                o1ooiI111iI00000oIO = new Oo1IIoOI0(z, oI0lOIiOIOOo, null, z2, oi1o00lo, function1);
                    } else {
/* 31 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 33 */                if (oI0lOIiOIOOo != null) {
/* 45 */                    o1ooiI111iI00000oIO = Iol0oOO.I00000oIO(o1ooIo101ll, oI0lOIiOIOOo, oi1lioiOilI).I0000O(new Oo1IIoOI0(z, oI0lOIiOIOOo, null, z2, oi1o00lo, function1));
                        } else {
/* 53 */                    OiiO1I10oO11 oiiO1I10oO11 = new OiiO1I10oO11(1);
/* 56 */                    oiiO1I10oO11.I00iiI = oi1lioiOilI;
/* 58 */                    oiiO1I10oO11.I00iiO = z;
/* 60 */                    oiiO1I10oO11.I00iio = z2;
/* 62 */                    oiiO1I10oO11.I00ilI0I1 = oi1o00lo;
/* 64 */                    oiiO1I10oO11.I00ilO0 = function1;
/* 66 */                    VarHandle.storeStoreFence();
/* 69 */                    o1ooiI111iI00000oIO = iilOllOlO1.I00000oIO(o1ooIo101ll, oiiO1I10oO11);
                        }
                    }
/* 73 */            return o1ooiI111i.I0000O(o1ooiI111iI00000oIO);
                }
            }
