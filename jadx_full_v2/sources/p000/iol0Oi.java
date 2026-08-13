            package p000;

            import java.io.Serializable;
            
            public final class iol0Oi extends OIil1lIl1O implements Serializable {
                public static final iol0Oi I00iiI = new iol0Oi(0);
                public static final iol0Oi I00iiO = new iol0Oi(1);
                public final int I00iOIl;

                public iol0Oi(int i) {
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
/* 6 */                     ioo01ioIl ioo01ioil = (ioo01ioIl) obj;
/* 8 */                     ioo01ioIl ioo01ioil2 = (ioo01ioIl) obj2;
/* 28 */                    return io01l0i.I00000oIO.I00000oOI(ioo01ioil.I00iOIl, ioo01ioil2.I00iOIl).I00000oOI(ioo01ioil.I00iiI, ioo01ioil2.I00iiI).I00000oIO();
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
