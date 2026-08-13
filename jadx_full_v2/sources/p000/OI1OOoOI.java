            package p000;

            import java.util.Comparator;
            
            public final class OI1OOoOI implements Comparator {
                public static final OI1OOoOI I00iiI = new OI1OOoOI(0);
                public static final OI1OOoOI I00iiO = new OI1OOoOI(1);
                public final int I00iOIl;

                public OI1OOoOI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final int compare(Object obj, Object obj2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 19 */                    return ((Comparable) obj).compareTo((Comparable) obj2);
                        default:
/* 10 */                    return ((Comparable) obj2).compareTo((Comparable) obj);
                    }
                }

                @Override
                public final Comparator reversed() {
                    switch (this.I00iOIl) {
                        case 0:
/* 9 */                     return I00iiO;
                        default:
/* 6 */                     return I00iiI;
                    }
                }
            }
