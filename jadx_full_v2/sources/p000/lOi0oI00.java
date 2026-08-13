            package p000;

            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class lOi0oI00 {
                public static String I00000oIO(String str, Object... objArr) {
                    int iIndexOf;
/* 11 */            StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
/* 14 */            int i = 0;
/* 15 */            int i2 = 0;
/* 17 */            while (i < objArr.length && (iIndexOf = str.indexOf("%s", i2)) != -1) {
/* 29 */                sb.append((CharSequence) str, i2, iIndexOf);
/* 40 */                sb.append(I00000oOI(objArr[i]));
/* 43 */                i2 = iIndexOf + 2;
/* 32 */                i++;
                    }
/* 53 */            sb.append((CharSequence) str, i2, str.length());
/* 57 */            if (i < objArr.length) {
/* 59 */                String str2 = " [";
/* 62 */                while (i < objArr.length) {
/* 64 */                    sb.append(str2);
/* 73 */                    sb.append(I00000oOI(objArr[i]));
/* 76 */                    i++;
/* 78 */                    str2 = ", ";
                        }
/* 83 */                sb.append(']');
                    }
/* 86 */            return sb.toString();
                }

                public static String I00000oOI(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return "null";
                    }
                    try {
/* 6 */                 return obj.toString();
                    } catch (Exception e) {
/* 41 */                String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
/* 59 */                Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str), (Throwable) e);
/* 66 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("<", str, " threw ");
/* 78 */                sbI001IIilI0O.append(e.getClass().getName());
/* 83 */                sbI001IIilI0O.append(">");
/* 86 */                return sbI001IIilI0O.toString();
                    }
                }
            }
