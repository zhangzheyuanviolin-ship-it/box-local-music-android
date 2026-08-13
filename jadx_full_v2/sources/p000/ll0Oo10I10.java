            package p000;

            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class ll0Oo10I10 {
                public static String I00000oIO(String str, Object... objArr) {
                    int length;
                    int iIndexOf;
/* 11 */            StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
/* 14 */            int i = 0;
/* 15 */            int i2 = 0;
                    while (true) {
/* 16 */                length = objArr.length;
/* 17 */                if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                            break;
                        }
/* 29 */                sb.append((CharSequence) str, i2, iIndexOf);
/* 40 */                sb.append(I00000oOI(objArr[i]));
/* 43 */                i2 = iIndexOf + 2;
/* 32 */                i++;
                    }
/* 53 */            sb.append((CharSequence) str, i2, str.length());
/* 56 */            if (i < length) {
/* 58 */                String str2 = " [";
/* 61 */                while (i < objArr.length) {
/* 63 */                    sb.append(str2);
/* 72 */                    sb.append(I00000oOI(objArr[i]));
/* 75 */                    i++;
/* 77 */                    str2 = ", ";
                        }
/* 82 */                sb.append(']');
                    }
/* 85 */            return sb.toString();
                }

                public static String I00000oOI(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return "null";
                    }
                    try {
/* 6 */                 return obj.toString();
                    } catch (Exception e) {
/* 17 */                String name = obj.getClass().getName();
/* 25 */                String hexString = Integer.toHexString(System.identityHashCode(obj));
/* 51 */                String strI0010I0i = IIlIOloOOO.I0010I0i(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
/* 73 */                Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strI0010I0i), (Throwable) e);
/* 80 */                String name2 = e.getClass().getName();
/* 99 */                StringBuilder sb = new StringBuilder(strI0010I0i.length() + 8 + name2.length() + 1);
/* 106 */               IIl001iO0Io.I001lIiIIo1O(sb, "<", strI0010I0i, " threw ", name2);
/* 111 */               sb.append(">");
/* 114 */               return sb.toString();
                    }
                }
            }
