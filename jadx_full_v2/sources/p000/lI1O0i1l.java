            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public abstract class lI1O0i1l {
                public static final int I00000oIO(OilOloI oilOloI, OilOloI[] oilOloIArr) {
/* 15 */            int iHashCode = (oilOloI.I00000oIO().hashCode() * 31) + Arrays.hashCode(oilOloIArr);
/* 16 */            int iI0000oI00 = oilOloI.I0000oI00();
/* 21 */            int i = 1;
                    while (true) {
/* 22 */                int iHashCode2 = 0;
/* 28 */                if (!(iI0000oI00 > 0)) {
                            break;
                        }
                        int i2 = iI0000oI00 - 1;
/* 41 */                int i3 = i * 31;
/* 43 */                String strI00000oIO = oilOloI.I000O01llI0(oilOloI.I0000oI00() - iI0000oI00).I00000oIO();
/* 47 */                if (strI00000oIO != null) {
/* 49 */                    iHashCode2 = strI00000oIO.hashCode();
                        }
/* 53 */                i = i3 + iHashCode2;
/* 54 */                iI0000oI00 = i2;
                    }
/* 56 */            int iI0000oI002 = oilOloI.I0000oI00();
/* 60 */            int iHashCode3 = 1;
                    while (true) {
/* 66 */                if (!(iI0000oI002 > 0)) {
/* 101 */                   return (((iHashCode * 31) + i) * 31) + iHashCode3;
                        }
                        int i4 = iI0000oI002 - 1;
/* 79 */                int i5 = iHashCode3 * 31;
/* 81 */                lO1oIl1ii lo1oil1iiI000oI1ioi = oilOloI.I000O01llI0(oilOloI.I0000oI00() - iI0000oI002).I000oI1ioi();
/* 93 */                iHashCode3 = i5 + (lo1oil1iiI000oI1ioi != null ? lo1oil1iiI000oI1ioi.hashCode() : 0);
/* 94 */                iI0000oI002 = i4;
                    }
                }

                public static final String I00000oOI(OilOloI oilOloI) {
/* 6 */             IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(0, oilOloI.I0000oI00());
/* 27 */            String str = oilOloI.I00000oIO() + '(';
/* 34 */            OIoO1Ol oIoO1Ol = new OIoO1Ol(1);
/* 37 */            oIoO1Ol.I00iiI = oilOloI;
/* 39 */            VarHandle.storeStoreFence();
/* 48 */            return IOOi0Ool1i.I00IlilI0i0i(iooO11lI000O01llI0, ", ", str, ")", oIoO1Ol, 24);
                }
            }
