            package p000;

            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class ll1iOi {
                public static String I00000oIO(String str, Object... objArr) {
                    int length;
                    int length2;
                    int iIndexOf;
                    String strI001IO000;
/* 1 */             int i = 0;
/* 2 */             int i2 = 0;
                    while (true) {
/* 3 */                 length = objArr.length;
/* 4 */                 if (i2 >= length) {
                            break;
                        }
/* 6 */                 Object obj = objArr[i2];
/* 8 */                 if (obj == null) {
/* 10 */                    strI001IO000 = "null";
                        } else {
                            try {
/* 13 */                        strI001IO000 = obj.toString();
                            } catch (Exception e) {
/* 38 */                        String strI000lI = IlIi0I0.I000lI(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
/* 60 */                        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strI000lI), (Throwable) e);
/* 77 */                        strI001IO000 = Oi010OO0.I001IO000("<", strI000lI, " threw ", e.getClass().getName(), ">");
                            }
                        }
/* 81 */                objArr[i2] = strI001IO000;
/* 83 */                i2++;
                    }
/* 95 */            StringBuilder sb = new StringBuilder(str.length() + (length * 16));
/* 98 */            int i3 = 0;
                    while (true) {
/* 99 */                length2 = objArr.length;
/* 100 */               if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                            break;
                        }
/* 112 */               sb.append((CharSequence) str, i3, iIndexOf);
/* 119 */               sb.append(objArr[i]);
/* 115 */               i++;
/* 122 */               i3 = iIndexOf + 2;
                    }
/* 132 */           sb.append((CharSequence) str, i3, str.length());
/* 135 */           if (i < length2) {
/* 139 */               sb.append(" [");
/* 146 */               sb.append(objArr[i]);
/* 150 */               for (int i4 = i + 1; i4 < objArr.length; i4++) {
/* 154 */                   sb.append(", ");
/* 161 */                   sb.append(objArr[i4]);
                        }
/* 168 */               sb.append(']');
                    }
/* 171 */           return sb.toString();
                }

                public static boolean I00000oOI(String str) {
                    return str == null || str.isEmpty();
                }
            }
