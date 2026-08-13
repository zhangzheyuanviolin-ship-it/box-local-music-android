            package p000;
            
            public abstract class ll0iOo11011i {
                public static void I00000oIO(Object obj, Object obj2) {
/* 1 */             if (obj == null) {
/* 43 */                IOOlIIilOl0.I000II("null key in entry: null=".concat(String.valueOf(obj2)));
                    } else {
/* 3 */                 if (obj2 != null) {
/* 5 */                     return;
                        }
/* 6 */                 String string = obj.toString();
/* 29 */                IOOlIIilOl0.I000II(IIlIOloOOO.I0010I0i(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
                    }
                }

                public static void I00000oOI(int i, String str) {
/* 1 */             if (i >= 0) {
/* 3 */                 return;
                    }
/* 23 */            StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(i).length());
/* 26 */            sb.append(str);
/* 31 */            sb.append(" cannot be negative but was: ");
/* 34 */            sb.append(i);
/* 106 */           throw new IllegalArgumentException(sb.toString());
                }
            }
