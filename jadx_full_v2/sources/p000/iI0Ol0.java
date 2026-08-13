            package p000;

            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            
            public final class iI0Ol0 extends LinkedHashMap {
                public static final iI0Ol0 I00iiI;
                public boolean I00iOIl = true;

                static {
/* 3 */             iI0Ol0 ii0ol0 = new iI0Ol0();
/* 6 */             I00iiI = ii0ol0;
/* 9 */             ii0ol0.I00iOIl = false;
                }

                public static int I00000oOI(Object obj) {
/* 4 */             if (!(obj instanceof byte[])) {
/* 19 */                if (!(obj instanceof i1ol0il1l0i)) {
/* 21 */                    return obj.hashCode();
                        }
/* 26 */                OIiilo1Ool0o.I000lI();
/* 3 */                 return 0;
                    }
/* 6 */             byte[] bArr = (byte[]) obj;
/* 8 */             int length = bArr.length;
/* 9 */             int iI00000oIO = iI000IO.I00000oIO(length, bArr, 0, length);
/* 13 */            if (iI00000oIO == 0) {
/* 15 */                return 1;
                    }
/* 16 */            return iI00000oIO;
                }

                public final iI0Ol0 I00000oIO() {
/* 5 */             if (isEmpty()) {
/* 9 */                 return new iI0Ol0();
                    }
/* 15 */            iI0Ol0 ii0ol0 = new iI0Ol0(this);
/* 19 */            ii0ol0.I00iOIl = true;
/* 55 */            return ii0ol0;
                }

                public final void I0000Il00O() {
/* 3 */             if (this.I00iOIl) {
/* 5 */                 return;
                    }
/* 6 */             OIiilo1Ool0o.I000lI();
                }

                @Override
                public final void clear() {
/* 1 */             I0000Il00O();
/* 4 */             super.clear();
                }

                @Override
                public final Set entrySet() {
                    return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
                }

                @Override
                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof Map)) {
/* 89 */                return false;
                    }
/* 5 */             Map map = (Map) obj;
/* 7 */             if (this == map) {
/* 87 */                return true;
                    }
/* 18 */            if (size() != map.size()) {
/* 89 */                return false;
                    }
/* 33 */            for (Map.Entry entry : entrySet()) {
/* 49 */                if (!map.containsKey(entry.getKey())) {
/* 89 */                    return false;
                        }
/* 51 */                Object value = entry.getValue();
/* 59 */                Object obj2 = map.get(entry.getKey());
/* 84 */                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
/* 89 */                    return false;
                        }
                    }
/* 87 */            return true;
                }

                @Override
                public final int hashCode() {
/* 9 */             int iI00000oOI = 0;
/* 14 */            for (Map.Entry entry : entrySet()) {
/* 39 */                iI00000oOI += I00000oOI(entry.getValue()) ^ I00000oOI(entry.getKey());
                    }
/* 55 */            return iI00000oOI;
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 1 */             I0000Il00O();
/* 4 */             obj.getClass();
/* 7 */             obj2.getClass();
/* 10 */            return super.put(obj, obj2);
                }

                @Override
                public final void putAll(Map map) {
/* 1 */             I0000Il00O();
/* 16 */            for (Object obj : map.keySet()) {
/* 22 */                obj.getClass();
/* 29 */                map.get(obj).getClass();
                    }
/* 33 */            super.putAll(map);
                }

                @Override
                public final Object remove(Object obj) {
/* 1 */             I0000Il00O();
/* 4 */             return super.remove(obj);
                }
            }
