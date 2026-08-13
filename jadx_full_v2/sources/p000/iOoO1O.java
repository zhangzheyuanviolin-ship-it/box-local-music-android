            package p000;

            import java.util.Arrays;
            import java.util.HashSet;
            
            public final class iOoO1O {
                public static final HashSet I0000Il00O = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));
                public StringBuilder I00000oIO;
                public boolean I00000oOI;

                public static int I00000oOI(int i, String str) {
/* 5 */             while (i < str.length()) {
/* 7 */                 char cCharAt = str.charAt(i);
/* 13 */                if (cCharAt < ' ' || cCharAt == '\"' || cCharAt == '\\') {
/* 27 */                    return i;
                        }
/* 24 */                i++;
                    }
/* 28 */            return -1;
                }

                public final void I00000oIO(String str, Object obj) {
/* 1 */             boolean z = this.I00000oOI;
/* 3 */             StringBuilder sb = this.I00000oIO;
/* 11 */            if (z) {
/* 13 */                sb.append(' ');
                    } else {
/* 21 */                if (sb.length() > 0) {
/* 40 */                    sb.append((sb.length() > 1000 || sb.indexOf("\n") != -1) ? '\n' : ' ');
                        }
/* 45 */                sb.append("[CONTEXT ");
/* 48 */                this.I00000oOI = true;
                    }
/* 50 */            sb.append(str);
/* 55 */            sb.append('=');
/* 58 */            if (obj == null) {
/* 60 */                sb.append(true);
/* 63 */                return;
                    }
/* 74 */            if (I0000Il00O.contains(obj.getClass())) {
/* 76 */                sb.append(obj);
/* 79 */                return;
                    }
/* 82 */            sb.append('\"');
/* 85 */            String string = obj.toString();
/* 89 */            int i = 0;
                    while (true) {
/* 90 */                int iI00000oOI = I00000oOI(i, string);
/* 94 */                if (iI00000oOI == -1) {
/* 149 */                   sb.append((CharSequence) string, i, string.length());
/* 152 */                   sb.append('\"');
/* 332 */                   return;
                        }
/* 96 */                sb.append((CharSequence) string, i, iI00000oOI);
/* 99 */                i = iI00000oOI + 1;
/* 101 */               char cCharAt = string.charAt(iI00000oOI);
/* 107 */               if (cCharAt == '\t') {
/* 134 */                   cCharAt = 't';
                        } else if (cCharAt == '\n') {
/* 131 */                   cCharAt = 'n';
                        } else if (cCharAt == '\r') {
/* 128 */                   cCharAt = 'r';
                        } else if (cCharAt != '\"' && cCharAt != '\\') {
/* 124 */                   sb.append((char) 65533);
                        }
/* 138 */               sb.append("\\");
/* 141 */               sb.append(cCharAt);
                    }
                }
            }
