            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Collections;
            import java.util.HashMap;
            
            public abstract class IiOoi0i0io0l {
                public static final int I00000oIO = 0;

                static {
/* 10 */            I0OO1oilIOl[] i0OO1oilIOlArr = {new I0OO1oilIOl(8, IiOoOl0oIOi.class)};
/* 16 */            HashMap map = new HashMap();
/* 20 */            I0OO1oilIOl i0OO1oilIOl = i0OO1oilIOlArr[0];
/* 24 */            boolean zContainsKey = map.containsKey(i0OO1oilIOl.I00000oIO);
/* 28 */            Class cls = i0OO1oilIOl.I00000oIO;
/* 30 */            if (zContainsKey) {
/* 91 */                IoOOl0iOl1io.I001l0I00("KeyTypeManager constructed with duplicate factories for primitive ", cls.getCanonicalName());
/* 113 */               return;
                    }
/* 32 */            map.put(cls, i0OO1oilIOl);
/* 37 */            Class cls2 = i0OO1oilIOlArr[0].I00000oIO;
/* 39 */            Collections.unmodifiableMap(map);
/* 42 */            int i = OOoiooI1Iio.CONFIG_NAME_FIELD_NUMBER;
                    try {
/* 46 */                OOoiolOO0i.I000II(IiOoi0oOo1.I00000oOI);
/* 53 */                if (Oo11ii010IIO.I00000oIO()) {
/* 55 */                    return;
                        }
/* 74 */                OOoiolOO0i.I0000oI00(new I0Oi0oOOollO(I0i0loloI.class, new I0OO1oilIOl[]{new I0OO1oilIOl(8, IiOoOl0oIOi.class)}, 7), true);
                    } catch (GeneralSecurityException e) {
/* 84 */                throw new ExceptionInInitializerError(e);
                    }
                }
            }
