            package p000;
            
            public abstract class liO1oilOi {
                public static final String I00000oIO(String str, Object obj) {
                    String str2;
/* 3 */             if (obj instanceof String) {
/* 5 */                 str2 = (String) obj;
                    } else {
/* 12 */                String name = obj.getClass().getName();
/* 18 */                if (obj instanceof Class) {
/* 22 */                    name = ((Class) obj).getName();
                        }
/* 28 */                String[] strArrSplit = name.split("\\.");
/* 32 */                int length = strArrSplit.length;
/* 40 */                str2 = length == 0 ? "" : strArrSplit[length - 1];
                    }
/* 46 */            return IIl001iO0Io.I000oI1ioi("[", str2, "] ", str);
                }
            }
