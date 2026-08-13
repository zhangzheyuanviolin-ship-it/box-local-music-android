            package p000;

            import java.io.Serializable;
            
            public final class i0Iill0 extends OIil1lIl1O implements Serializable {
                public static final i0Iill0 I00iiI = new i0Iill0(0);
                public static final i0Iill0 I00iiO = new i0Iill0(1);
                public final int I00iOIl;

                public i0Iill0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final int compare(Object obj, Object obj2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 33 */                    Comparable comparable = (Comparable) obj;
/* 35 */                    Comparable comparable2 = (Comparable) obj2;
/* 37 */                    comparable.getClass();
/* 40 */                    comparable2.getClass();
/* 43 */                    return comparable.compareTo(comparable2);
                        default:
/* 6 */                     i0IioIo i0iioio = (i0IioIo) obj;
/* 8 */                     i0IioIo i0iioio2 = (i0IioIo) obj2;
/* 28 */                    return i0I1oi1iil.I00000oIO.I00000oOI(i0iioio.I00iOIl, i0iioio2.I00iOIl).I00000oOI(i0iioio.I00iiI, i0iioio2.I00iiI).I00000oIO();
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 11 */                    return "Ordering.natural()";
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
