            package p000;

            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            
            public final class O1OOlii0 extends LinkedHashMap {
                public static final O1OOlii0 I00iiI;
                public boolean I00iOIl = true;

                static {
/* 3 */             O1OOlii0 o1OOlii0 = new O1OOlii0();
/* 6 */             I00iiI = o1OOlii0;
/* 9 */             o1OOlii0.I00iOIl = false;
                }

                public static int I00000oIO(Object obj) {
/* 4 */             if (!(obj instanceof byte[])) {
/* 29 */                if (!(obj instanceof Iooio0II1Io)) {
/* 31 */                    return obj.hashCode();
                        }
/* 36 */                OIiilo1Ool0o.I000lI();
/* 3 */                 return 0;
                    }
/* 6 */             byte[] bArr = (byte[]) obj;
/* 8 */             int length = bArr.length;
/* 9 */             Charset charset = Iool1iOO11.I00000oIO;
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

                public final O1OOlii0 I0000Il00O() {
/* 5 */             if (isEmpty()) {
/* 9 */                 return new O1OOlii0();
                    }
/* 15 */            O1OOlii0 o1OOlii0 = new O1OOlii0(this);
/* 19 */            o1OOlii0.I00iOIl = true;
/* 29 */            return o1OOlii0;
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
/* 90 */                return false;
                    }
/* 5 */             Map map = (Map) obj;
/* 7 */             if (this == map) {
/* 88 */                return true;
                    }
/* 18 */            if (size() != map.size()) {
/* 90 */                return false;
                    }
/* 33 */            for (Map.Entry entry : entrySet()) {
/* 49 */                if (!map.containsKey(entry.getKey())) {
/* 90 */                    return false;
                        }
/* 52 */                Object value = entry.getValue();
/* 60 */                Object obj2 = map.get(entry.getKey());
/* 85 */                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
/* 90 */                    return false;
                        }
                    }
/* 88 */            return true;
                }

                @Override
                public final int hashCode() {
/* 9 */             int iI00000oIO = 0;
/* 14 */            for (Map.Entry entry : entrySet()) {
/* 39 */                iI00000oIO += I00000oIO(entry.getValue()) ^ I00000oIO(entry.getKey());
                    }
/* 113 */           return iI00000oIO;
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 1 */             I00000oOI();
/* 4 */             Charset charset = Iool1iOO11.I00000oIO;
/* 6 */             obj.getClass();
/* 9 */             obj2.getClass();
/* 12 */            return super.put(obj, obj2);
                }

                @Override
                public final void putAll(Map map) {
/* 1 */             I00000oOI();
/* 16 */            for (Object obj : map.keySet()) {
/* 22 */                Charset charset = Iool1iOO11.I00000oIO;
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
