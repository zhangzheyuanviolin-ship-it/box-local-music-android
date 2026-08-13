            package p000;

            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            
            public final class iOllI1i1l extends LinkedHashMap {
                public static final iOllI1i1l I00iiI;
                public boolean I00iOIl = true;

                static {
/* 3 */             iOllI1i1l iolli1i1l = new iOllI1i1l();
/* 6 */             I00iiI = iolli1i1l;
/* 9 */             iolli1i1l.I00iOIl = false;
                }

                public final void I00000oIO() {
/* 3 */             if (this.I00iOIl) {
/* 5 */                 return;
                    }
/* 6 */             OIiilo1Ool0o.I000lI();
                }

                @Override
                public final void clear() {
/* 1 */             I00000oIO();
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
                    int iHashCode;
/* 10 */            int i = 0;
/* 15 */            for (Map.Entry entry : entrySet()) {
/* 23 */                Object key = entry.getKey();
/* 29 */                int iHashCode2 = 1;
/* 30 */                if (key instanceof byte[]) {
/* 32 */                    byte[] bArr = (byte[]) key;
/* 34 */                    int length = bArr.length;
/* 35 */                    iHashCode = iOlilI1ill0.I00000oIO(length, bArr, 0, length);
/* 39 */                    if (iHashCode == 0) {
/* 41 */                        iHashCode = 1;
                            }
                        } else {
/* 43 */                    iHashCode = key.hashCode();
                        }
/* 47 */                Object value = entry.getValue();
/* 53 */                if (value instanceof byte[]) {
/* 55 */                    byte[] bArr2 = (byte[]) value;
/* 57 */                    int length2 = bArr2.length;
/* 58 */                    int iI00000oIO = iOlilI1ill0.I00000oIO(length2, bArr2, 0, length2);
/* 62 */                    if (iI00000oIO != 0) {
/* 65 */                        iHashCode2 = iI00000oIO;
                            }
                        } else {
/* 67 */                    iHashCode2 = value.hashCode();
                        }
/* 73 */                i += iHashCode ^ iHashCode2;
                    }
/* 110 */           return i;
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 1 */             I00000oIO();
/* 4 */             obj.getClass();
/* 7 */             obj2.getClass();
/* 10 */            return super.put(obj, obj2);
                }

                @Override
                public final void putAll(Map map) {
/* 1 */             I00000oIO();
/* 16 */            for (Object obj : map.keySet()) {
/* 22 */                obj.getClass();
/* 29 */                map.get(obj).getClass();
                    }
/* 33 */            super.putAll(map);
                }

                @Override
                public final Object remove(Object obj) {
/* 1 */             I00000oIO();
/* 4 */             return super.remove(obj);
                }
            }
