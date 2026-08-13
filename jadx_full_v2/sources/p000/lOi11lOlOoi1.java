            package p000;

            import java.io.Serializable;
            
            public final class lOi11lOlOoi1 extends OIil1lIl1O implements Serializable {
                public static final lOi11lOlOoi1 I00iiI = new lOi11lOlOoi1(0);
                public static final lOi11lOlOoi1 I00iiO = new lOi11lOlOoi1(1);
                public final int I00iOIl;

                public lOi11lOlOoi1(int i) {
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
/* 6 */                     lOio1lIO loio1lio = (lOio1lIO) obj;
/* 8 */                     lOio1lIO loio1lio2 = (lOio1lIO) obj2;
/* 28 */                    return lO0110Ioo00O.I00000oIO.I00000oIO(loio1lio.I00iOIl, loio1lio2.I00iOIl).I00000oIO(loio1lio.I00iiI, loio1lio2.I00iiI).I00000oOI();
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
