            package p000;

            import java.util.Arrays;
            import java.util.Locale;
            
            public abstract class o11I00 {
                public static final Locale I00000oIO = Locale.ROOT;

                public static String I00000oIO(Object obj) {
                    String simpleName;
/* 1 */             if (obj == null) {
/* 3 */                 return "null";
                    }
                    try {
/* 17 */                if (obj.getClass().isArray()) {
                            return obj instanceof int[] ? Arrays.toString((int[]) obj) : obj instanceof long[] ? Arrays.toString((long[]) obj) : obj instanceof byte[] ? Arrays.toString((byte[]) obj) : obj instanceof char[] ? Arrays.toString((char[]) obj) : obj instanceof short[] ? Arrays.toString((short[]) obj) : obj instanceof float[] ? Arrays.toString((float[]) obj) : obj instanceof double[] ? Arrays.toString((double[]) obj) : obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
                        }
/* 19 */                String string = obj.toString();
                        return string != null ? string : I0000Il00O("toString() returned null", obj);
                    } catch (RuntimeException e) {
                        try {
/* 137 */                   simpleName = e.toString();
                        } catch (RuntimeException e2) {
/* 147 */                   simpleName = e2.getClass().getSimpleName();
                        }
/* 151 */               return I0000Il00O(simpleName, obj);
                    }
                }

                public static void I00000oOI(StringBuilder sb, long j, boolean z) {
/* 5 */             if (j == 0) {
/* 9 */                 sb.append(OIllioIilO.I01OO1I);
/* 12 */                return;
                    }
/* 19 */            String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
/* 29 */            for (int iNumberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & (-4); iNumberOfLeadingZeros >= 0; iNumberOfLeadingZeros -= 4) {
/* 41 */                sb.append(str.charAt((int) ((j >>> iNumberOfLeadingZeros) & 15)));
                    }
                }

                public static String I0000Il00O(String str, Object obj) {
/* 5 */             String name = obj.getClass().getName();
/* 9 */             int iIdentityHashCode = System.identityHashCode(obj);
/* 13 */            int length = name.length();
/* 43 */            StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(iIdentityHashCode).length() + 2 + String.valueOf(str).length() + 1);
/* 48 */            sb.append("{");
/* 51 */            sb.append(name);
/* 56 */            sb.append("@");
/* 59 */            sb.append(iIdentityHashCode);
/* 66 */            return IIlIOloOOO.I0010I0i(sb, ": ", str, "}");
                }
            }
