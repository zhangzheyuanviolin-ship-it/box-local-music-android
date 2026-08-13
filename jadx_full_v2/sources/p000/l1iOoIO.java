            package p000;

            import java.util.LinkedHashMap;
            
            public abstract class l1iOoIO {
                public static String I00000oIO(Class cls) {
/* 1 */             LinkedHashMap linkedHashMap = OII1IlOi0.I00000oOI;
/* 7 */             String strValue = (String) linkedHashMap.get(cls);
/* 9 */             if (strValue == null) {
/* 17 */                OII1IiiII oII1IiiII = (OII1IiiII) cls.getAnnotation(OII1IiiII.class);
/* 27 */                strValue = oII1IiiII != null ? oII1IiiII.value() : null;
/* 28 */                if (strValue == null || strValue.length() <= 0) {
/* 50 */                    I000II.I0010I0i("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
/* 19 */                    return null;
                        }
/* 36 */                linkedHashMap.put(cls, strValue);
                    }
/* 77 */            return strValue;
                }
            }
