            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Collections;
            import java.util.HashMap;
            
            public abstract class OlOii1oo00 {
                static {
/* 9 */             I0OO1oilIOl[] i0OO1oilIOlArr = {new I0OO1oilIOl(2, OlOiOooOO1.class)};
/* 15 */            HashMap map = new HashMap();
/* 19 */            I0OO1oilIOl i0OO1oilIOl = i0OO1oilIOlArr[0];
/* 23 */            boolean zContainsKey = map.containsKey(i0OO1oilIOl.I00000oIO);
/* 27 */            Class cls = i0OO1oilIOl.I00000oIO;
/* 31 */            if (zContainsKey) {
/* 105 */               IoOOl0iOl1io.I001l0I00("KeyTypeManager constructed with duplicate factories for primitive ", cls.getCanonicalName());
/* 113 */               return;
                    }
/* 33 */            map.put(cls, i0OO1oilIOl);
/* 38 */            Class cls2 = i0OO1oilIOlArr[0].I00000oIO;
/* 40 */            Collections.unmodifiableMap(map);
/* 49 */            I0OO1oilIOl[] i0OO1oilIOlArr2 = {new I0OO1oilIOl(5, OlOiOooOO1.class)};
/* 55 */            HashMap map2 = new HashMap();
/* 58 */            I0OO1oilIOl i0OO1oilIOl2 = i0OO1oilIOlArr2[0];
/* 62 */            boolean zContainsKey2 = map2.containsKey(i0OO1oilIOl2.I00000oIO);
/* 66 */            Class cls3 = i0OO1oilIOl2.I00000oIO;
/* 68 */            if (zContainsKey2) {
/* 97 */                IoOOl0iOl1io.I001l0I00("KeyTypeManager constructed with duplicate factories for primitive ", cls3.getCanonicalName());
/* 100 */               return;
                    }
/* 70 */            map2.put(cls3, i0OO1oilIOl2);
/* 75 */            Class cls4 = i0OO1oilIOlArr2[0].I00000oIO;
/* 77 */            Collections.unmodifiableMap(map2);
/* 80 */            int i = OOoiooI1Iio.CONFIG_NAME_FIELD_NUMBER;
                    try {
/* 82 */                I00000oIO();
                    } catch (GeneralSecurityException e) {
/* 92 */                throw new ExceptionInInitializerError(e);
                    }
                }

                public static void I00000oIO() {
/* 3 */             OOoiolOO0i.I000II(IOIIllIl0.I0000Il00O);
/* 10 */            if (Oo11ii010IIO.I00000oIO()) {
/* 12 */                return;
                    }
/* 33 */            OOoiolOO0i.I0000oI00(new I0Oi0oOOollO(I0OiIlIl.class, new I0OO1oilIOl[]{new I0OO1oilIOl(2, OlOiOooOO1.class)}, 1), true);
/* 54 */            OOoiolOO0i.I0000oI00(new I0Oi0oOOollO(I0OoI1oo101.class, new I0OO1oilIOl[]{new I0OO1oilIOl(5, OlOiOooOO1.class)}, 4), true);
                }
            }
