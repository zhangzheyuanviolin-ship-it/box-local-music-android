            package p000;

            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
/* 27 */    public final class Oi01iIoI {
                public final List I00000oIO;
                public final Map I00000oOI;
                public final Map I0000Il00O;
                public final List I0000O;
                public final Oi0OO1IIl1 I0000oI00;
                public final Ioloo0I1O0l0 I0001Ioi1lo;

                /* JADX WARN: Illegal instructions before constructor call */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [Il011I1OiO0I] */
                public Oi01iIoI(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ArrayList arrayList, Oi0OO1IIl1 oi0OO1IIl1, int i) {
/* 1 */             int i2 = i & 2;
/* 3 */             ?? r1 = Il011I1OiO0I.I00iOIl;
/* 25 */            this(list, i2 != 0 ? r1 : linkedHashMap, (i & 4) != 0 ? r1 : linkedHashMap2, (i & 8) != 0 ? Il01100l.I00iOIl : arrayList, (i & 16) != 0 ? null : oi0OO1IIl1, (Ioloo0I1O0l0) null);
                }

                public final String toString() {
                    String str;
/* 3 */             Oi0OO1IIl1 oi0OO1IIl1 = this.I0000oI00;
/* 5 */             if (oi0OO1IIl1 == null) {
/* 1 */                 str = "";
                    } else {
/* 25 */                str = ", template=" + ((Object) Oi0OO1IIl1.I0000Il00O(oi0OO1IIl1.I00000oIO));
                    }
/* 66 */            return "Request(streams=" + this.I00000oIO + str + ")@" + Integer.toHexString(hashCode());
                }

/* 28 */        public Oi01iIoI(List list, Map map, Map map2, List list2, Oi0OO1IIl1 oi0OO1IIl1, Ioloo0I1O0l0 ioloo0I1O0l0) {
/* 30 */            this.I00000oIO = list;
/* 31 */            this.I00000oOI = map;
/* 32 */            this.I0000Il00O = map2;
/* 33 */            this.I0000O = list2;
/* 34 */            this.I0000oI00 = oi0OO1IIl1;
/* 35 */            this.I0001Ioi1lo = ioloo0I1O0l0;
                }
            }
