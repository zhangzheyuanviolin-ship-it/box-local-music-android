            package p000;

            import java.util.List;
            import java.util.NoSuchElementException;
            import kotlin.jvm.functions.Function1;
            
            public abstract class O10lllI0o0 {
                public static String I00000oIO(List list, String str, Function1 function1, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = ", ";
                    }
/* 15 */            String str2 = (i & 2) != 0 ? "" : "[\n\t";
/* 22 */            String str3 = (i & 4) == 0 ? "\n]" : "";
/* 26 */            if ((i & 32) != 0) {
/* 28 */                function1 = null;
                    }
/* 31 */            StringBuilder sb = new StringBuilder();
/* 34 */            sb.append((CharSequence) str2);
/* 40 */            int size = list.size();
/* 45 */            int i2 = 0;
/* 46 */            for (int i3 = 0; i3 < size; i3++) {
/* 48 */                Object obj = list.get(i3);
/* 53 */                i2++;
/* 54 */                if (i2 > 1) {
/* 56 */                    sb.append((CharSequence) str);
                        }
/* 59 */                if (function1 != null) {
/* 67 */                    sb.append((CharSequence) function1.invoke(obj));
                        } else if (obj != null ? obj instanceof CharSequence : true) {
/* 80 */                    sb.append((CharSequence) obj);
                        } else if (obj instanceof Character) {
/* 94 */                    sb.append(((Character) obj).charValue());
                        } else {
/* 102 */                   sb.append((CharSequence) obj.toString());
                        }
                    }
/* 108 */           sb.append((CharSequence) str3);
/* 111 */           return sb.toString();
                }

                public static final Void I00000oOI(String str) {
/* 29 */            throw new NoSuchElementException(str);
                }

                public static final void I0000Il00O(String str) {
/* 29 */            throw new UnsupportedOperationException(str);
                }
            }
