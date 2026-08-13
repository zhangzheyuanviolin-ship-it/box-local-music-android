            package p000;

            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            
/* 12 */    public final class Ii11I1OOII1 {
                public static final Ii11I1OOII1 I00000oOI;
                public final HashMap I00000oIO;

                static {
/* 8 */             Ii11I1OOII1 ii11I1OOII1 = new Ii11I1OOII1(new LinkedHashMap());
/* 11 */            il01ool0o.I0000Il00O(ii11I1OOII1);
/* 14 */            I00000oOI = ii11I1OOII1;
                }

                public Ii11I1OOII1(Ii11I1OOII1 ii11I1OOII1) {
/* 11 */            this.I00000oIO = new HashMap(ii11I1OOII1.I00000oIO);
                }

                public final boolean I00000oIO(String str) {
/* 1 */             Object obj = Boolean.FALSE;
/* 5 */             Object obj2 = this.I00000oIO.get(str);
/* 11 */            if (obj2 instanceof Boolean) {
/* 13 */                obj = obj2;
                    }
/* 16 */            return ((Boolean) obj).booleanValue();
                }

                public final long I00000oOI(String str, long j) {
/* 1 */             Object objValueOf = Long.valueOf(j);
/* 7 */             Object obj = this.I00000oIO.get(str);
/* 13 */            if (obj instanceof Long) {
/* 15 */                objValueOf = obj;
                    }
/* 18 */            return ((Number) objValueOf).longValue();
                }

                public final String I0000Il00O(String str) {
/* 3 */             Object obj = this.I00000oIO.get(str);
/* 9 */             if (obj instanceof String) {
/* 11 */                return (String) obj;
                    }
/* 14 */            return null;
                }

                public final String[] I0000O(String str) {
/* 3 */             Object obj = this.I00000oIO.get(str);
/* 10 */            if (!(obj instanceof Object[])) {
/* 9 */                 return null;
                    }
/* 12 */            Object[] objArr = (Object[]) obj;
/* 14 */            int length = objArr.length;
/* 15 */            String[] strArr = new String[length];
/* 18 */            for (int i = 0; i < length; i++) {
/* 20 */                Object obj2 = objArr[i];
/* 22 */                if (obj2 == null) {
/* 33 */                    IOOlIIilOl0.I000II("null cannot be cast to non-null type kotlin.String");
/* 9 */                     return null;
                        }
/* 26 */                strArr[i] = (String) obj2;
                    }
/* 37 */            return strArr;
                }

                public final boolean I0000oI00(String str) {
/* 3 */             Object obj = this.I00000oIO.get(str);
                    return obj != null && String.class.isAssignableFrom(obj.getClass());
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
                    boolean zI000II;
/* 2 */             if (this != obj) {
/* 7 */                 if (obj != null && Ii11I1OOII1.class.equals(obj.getClass())) {
/* 24 */                    HashMap map = ((Ii11I1OOII1) obj).I00000oIO;
/* 26 */                    HashMap map2 = this.I00000oIO;
/* 28 */                    Set<String> setKeySet = map2.keySet();
/* 40 */                    if (O0000Ioio00.I0000O(setKeySet, map.keySet())) {
/* 51 */                        for (String str : setKeySet) {
/* 59 */                            Object obj2 = map2.get(str);
/* 63 */                            Object obj3 = map.get(str);
/* 67 */                            if (obj2 == null || obj3 == null) {
/* 99 */                                zI000II = obj2 == obj3;
                                    } else if (obj2 instanceof Object[]) {
/* 90 */                                zI000II = obj3 instanceof Object[] ? I1IoiO1l.I000II((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3);
                                    }
/* 100 */                           if (!zI000II) {
                                    }
                                }
                            }
                        }
/* 6 */                 return false;
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 11 */            int iHashCode = 0;
/* 16 */            for (Map.Entry entry : this.I00000oIO.entrySet()) {
/* 24 */                Object value = entry.getValue();
/* 52 */                iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
                    }
/* 54 */            return iHashCode * 31;
                }

                public final String toString() {
/* 35 */            return IIl001iO0Io.I00100l0(new StringBuilder("Data {"), IOOi0Ool1i.I00IlilI0i0i(this.I00000oIO.entrySet(), null, null, null, new IO1I11OO(18), 31), "}");
                }

/* 13 */        public Ii11I1OOII1(LinkedHashMap linkedHashMap) {
/* 15 */            this.I00000oIO = new HashMap(linkedHashMap);
                }
            }
