            package p000;

            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            
            public final class ioI1oI1I extends LinkedHashMap {
                public static final ioI1oI1I I00iiI;
                public boolean I00iOIl = true;

                static {
/* 3 */             ioI1oI1I ioi1oi1i = new ioI1oI1I();
/* 6 */             I00iiI = ioi1oi1i;
/* 9 */             ioi1oi1i.I00iOIl = false;
                }

                public static int I00000oIO(Object obj) {
/* 4 */             if (!(obj instanceof byte[])) {
/* 29 */                if (!(obj instanceof lli1Oi01I1l)) {
/* 31 */                    return obj.hashCode();
                        }
/* 36 */                OIiilo1Ool0o.I000lI();
/* 3 */                 return 0;
                    }
/* 6 */             byte[] bArr = (byte[]) obj;
/* 8 */             int length = bArr.length;
/* 9 */             Charset charset = iloi1OI100li.I00000oIO;
/* 11 */            int i = length;
/* 12 */            for (byte b : bArr) {
/* 18 */                i = (i * 31) + b;
                    }
/* 22 */            if (i == 0) {
/* 24 */                return 1;
                    }
/* 26 */            return i;
                }

                public final void I00000oOI() {
/* 3 */             if (this.I00iOIl) {
/* 5 */                 return;
                    }
/* 6 */             OIiilo1Ool0o.I000lI();
                }

                @Override
                public final void clear() {
/* 1 */             I00000oOI();
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
/* 9 */             int iI00000oIO = 0;
/* 14 */            for (Map.Entry entry : entrySet()) {
/* 39 */                iI00000oIO += I00000oIO(entry.getValue()) ^ I00000oIO(entry.getKey());
                    }
/* 55 */            return iI00000oIO;
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 1 */             I00000oOI();
/* 4 */             Charset charset = iloi1OI100li.I00000oIO;
/* 6 */             obj.getClass();
/* 9 */             obj2.getClass();
/* 12 */            return super.put(obj, obj2);
                }

                @Override
                public final void putAll(Map map) {
/* 1 */             I00000oOI();
/* 16 */            for (Object obj : map.keySet()) {
/* 22 */                Charset charset = iloi1OI100li.I00000oIO;
/* 24 */                obj.getClass();
/* 31 */                map.get(obj).getClass();
                    }
/* 35 */            super.putAll(map);
                }

                @Override
                public final Object remove(Object obj) {
/* 1 */             I00000oOI();
/* 4 */             return super.remove(obj);
                }
            }
