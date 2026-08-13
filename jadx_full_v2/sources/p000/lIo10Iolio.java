            package p000;

            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            
            public final class lIo10Iolio extends LinkedHashMap {
                public static final lIo10Iolio I00iiI;
                public boolean I00iOIl = true;

                static {
/* 3 */             lIo10Iolio lio10iolio = new lIo10Iolio();
/* 6 */             I00iiI = lio10iolio;
/* 9 */             lio10iolio.I00iOIl = false;
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
/* 35 */                    Charset charset = lIOOlo11OOii.I00000oIO;
/* 38 */                    iHashCode = length;
/* 39 */                    for (byte b : bArr) {
/* 45 */                        iHashCode = (iHashCode * 31) + b;
                            }
/* 49 */                    if (iHashCode == 0) {
/* 51 */                        iHashCode = 1;
                            }
                        } else {
/* 53 */                    iHashCode = key.hashCode();
                        }
/* 57 */                Object value = entry.getValue();
/* 63 */                if (value instanceof byte[]) {
/* 65 */                    byte[] bArr2 = (byte[]) value;
/* 67 */                    int length2 = bArr2.length;
/* 68 */                    Charset charset2 = lIOOlo11OOii.I00000oIO;
/* 71 */                    int i2 = length2;
/* 72 */                    for (byte b2 : bArr2) {
/* 78 */                        i2 = (i2 * 31) + b2;
                            }
/* 82 */                    if (i2 != 0) {
/* 85 */                        iHashCode2 = i2;
                            }
                        } else {
/* 87 */                    iHashCode2 = value.hashCode();
                        }
/* 93 */                i += iHashCode ^ iHashCode2;
                    }
/* 110 */           return i;
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 1 */             I00000oIO();
/* 4 */             Charset charset = lIOOlo11OOii.I00000oIO;
/* 6 */             obj.getClass();
/* 9 */             obj2.getClass();
/* 12 */            return super.put(obj, obj2);
                }

                @Override
                public final void putAll(Map map) {
/* 1 */             I00000oIO();
/* 16 */            for (Object obj : map.keySet()) {
/* 22 */                Charset charset = lIOOlo11OOii.I00000oIO;
/* 24 */                obj.getClass();
/* 31 */                map.get(obj).getClass();
                    }
/* 35 */            super.putAll(map);
                }

                @Override
                public final Object remove(Object obj) {
/* 1 */             I00000oIO();
/* 4 */             return super.remove(obj);
                }
            }
