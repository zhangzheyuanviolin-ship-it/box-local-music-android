            package p000;

            import android.util.ArrayMap;
            import java.util.Collections;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.TreeMap;
            
            public final class OI0oiliol10O extends OIil0iio0 {
                public static OI0oiliol10O I000OOo1O() {
/* 10 */            return new OI0oiliol10O(new TreeMap(OIil0iio0.I00iiI));
                }

                public static OI0oiliol10O I000iOII(IOlOo1ll1l1 iOlOo1ll1l1) {
/* 5 */             TreeMap treeMap = new TreeMap(OIil0iio0.I00iiI);
/* 20 */            for (I1ioiI i1ioiI : iOlOo1ll1l1.I0000Il00O()) {
/* 28 */                Set<IOlOo0> setI0000oI00 = iOlOo1ll1l1.I0000oI00(i1ioiI);
/* 34 */                ArrayMap arrayMap = new ArrayMap();
/* 45 */                for (IOlOo0 iOlOo0 : setI0000oI00) {
/* 57 */                    arrayMap.put(iOlOo0, iOlOo1ll1l1.I000II(i1ioiI, iOlOo0));
                        }
/* 61 */                treeMap.put(i1ioiI, arrayMap);
                    }
/* 67 */            return new OI0oiliol10O(treeMap);
                }

                public final void I000lI(I1ioiI i1ioiI, IOlOo0 iOlOo0, Object obj) {
                    IOlOo0 iOlOo02;
/* 1 */             TreeMap treeMap = this.I00iOIl;
/* 7 */             Map map = (Map) treeMap.get(i1ioiI);
/* 9 */             if (map == null) {
/* 13 */                ArrayMap arrayMap = new ArrayMap();
/* 16 */                treeMap.put(i1ioiI, arrayMap);
/* 19 */                arrayMap.put(iOlOo0, obj);
/* 22 */                return;
                    }
/* 31 */            IOlOo0 iOlOo03 = (IOlOo0) Collections.min(map.keySet());
/* 41 */            if (Objects.equals(map.get(iOlOo03), obj) || iOlOo03 != (iOlOo02 = IOlOo0.I00iiO) || iOlOo0 != iOlOo02) {
/* 106 */               map.put(iOlOo0, obj);
/* 408 */               return;
                    }
/* 56 */            StringBuilder sb = new StringBuilder("Option values conflicts: ");
/* 61 */            sb.append(i1ioiI.I00000oIO);
/* 66 */            sb.append(", existing value (");
/* 69 */            sb.append(iOlOo03);
/* 72 */            Object obj2 = map.get(iOlOo03);
/* 78 */            sb.append(")=");
/* 81 */            sb.append(obj2);
/* 86 */            sb.append(", conflicting (");
/* 89 */            sb.append(iOlOo0);
/* 92 */            sb.append(")=");
/* 95 */            sb.append(obj);
/* 105 */           throw new IllegalArgumentException(sb.toString());
                }

                public final void I0010I0i(I1ioiI i1ioiI, Object obj) {
/* 3 */             I000lI(i1ioiI, IOlOo0.I00iio, obj);
                }

                public final void I001IO000(I1ioiI i1ioiI) {
/* 3 */             this.I00iOIl.remove(i1ioiI);
                }
            }
