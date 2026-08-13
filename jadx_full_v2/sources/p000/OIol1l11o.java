            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class OIol1l11o implements Iterable, O0IlIoi {
                public static final OIol1l11o I00iiI = new OIol1l11o(Il011I1OiO0I.I00iOIl);
                public final Map I00iOIl;

                public OIol1l11o(Map map) {
/* 4 */             this.I00iOIl = map;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (obj instanceof OIol1l11o) {
                        return O0000Ioio00.I0000O(this.I00iOIl, ((OIol1l11o) obj).I00iOIl);
                    }
/* 22 */            return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                @Override
                public final Iterator iterator() {
/* 3 */             Map map = this.I00iOIl;
/* 9 */             ArrayList arrayList = new ArrayList(map.size());
/* 24 */            for (Map.Entry entry : map.entrySet()) {
/* 36 */                String str = (String) entry.getKey();
/* 43 */                if (entry.getValue() != null) {
/* 54 */                    OIiilo1Ool0o.I00000oIO();
/* 42 */                    return null;
                        }
/* 50 */                arrayList.add(new OIoi0IIoi(str, null));
                    }
/* 58 */            return arrayList.iterator();
                }

                public final String toString() {
/* 18 */            return "Parameters(entries=" + this.I00iOIl + ')';
                }
            }
