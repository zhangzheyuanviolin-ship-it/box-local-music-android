            package p000;

            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public abstract class liol11lI00 {
                public static String I00000oIO(String str, Object... objArr) {
                    int length;
                    int length2;
                    int iIndexOf;
                    String string;
/* 1 */             int i = 0;
/* 2 */             int i2 = 0;
                    while (true) {
/* 3 */                 length = objArr.length;
/* 4 */                 if (i2 >= length) {
                            break;
                        }
/* 6 */                 Object obj = objArr[i2];
/* 8 */                 if (obj == null) {
/* 10 */                    string = "null";
                        } else {
                            try {
/* 13 */                        string = obj.toString();
                            } catch (Exception e) {
/* 49 */                        String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
/* 71 */                        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
/* 78 */                        StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("<", str2, " threw ");
/* 90 */                        sbI001IIilI0O.append(e.getClass().getName());
/* 95 */                        sbI001IIilI0O.append(">");
/* 98 */                        string = sbI001IIilI0O.toString();
                            }
                        }
/* 102 */               objArr[i2] = string;
/* 104 */               i2++;
                    }
/* 116 */           StringBuilder sb = new StringBuilder(str.length() + (length * 16));
/* 119 */           int i3 = 0;
                    while (true) {
/* 120 */               length2 = objArr.length;
/* 121 */               if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                            break;
                        }
/* 133 */               sb.append((CharSequence) str, i3, iIndexOf);
/* 140 */               sb.append(objArr[i]);
/* 136 */               i++;
/* 143 */               i3 = iIndexOf + 2;
                    }
/* 153 */           sb.append((CharSequence) str, i3, str.length());
/* 156 */           if (i < length2) {
/* 160 */               sb.append(" [");
/* 167 */               sb.append(objArr[i]);
/* 171 */               for (int i4 = i + 1; i4 < objArr.length; i4++) {
/* 175 */                   sb.append(", ");
/* 182 */                   sb.append(objArr[i4]);
                        }
/* 189 */               sb.append(']');
                    }
/* 192 */           return sb.toString();
                }
            }
