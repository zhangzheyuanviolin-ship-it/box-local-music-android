            package p000;

            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            
            public abstract class lO0i0I {
                public static OiIloOOiiOii I00000oIO(Bundle bundle, Bundle bundle2) {
/* 1 */             if (bundle == null) {
/* 3 */                 bundle = bundle2;
                    }
/* 4 */             if (bundle == null) {
/* 8 */                 OiIloOOiiOii oiIloOOiiOii = new OiIloOOiiOii();
/* 16 */                oiIloOOiiOii.I00000oIO = new LinkedHashMap();
/* 25 */                oiIloOOiiOii.I00000oOI = new I1ii1o0(Il011I1OiO0I.I00iOIl);
/* 27 */                VarHandle.storeStoreFence();
/* 30 */                return oiIloOOiiOii;
                    }
/* 37 */            bundle.setClassLoader(OiIloOOiiOii.class.getClassLoader());
/* 46 */            O1OOII o1ooii = new O1OOII(bundle.size());
/* 61 */            for (String str : bundle.keySet()) {
/* 73 */                o1ooii.put(str, bundle.get(str));
                    }
/* 77 */            O1OOII o1ooiiI00000oOI = o1ooii.I00000oOI();
/* 83 */            OiIloOOiiOii oiIloOOiiOii2 = new OiIloOOiiOii();
/* 91 */            oiIloOOiiOii2.I00000oIO = new LinkedHashMap();
/* 98 */            oiIloOOiiOii2.I00000oOI = new I1ii1o0(o1ooiiI00000oOI);
/* 100 */           VarHandle.storeStoreFence();
/* 106 */           return oiIloOOiiOii2;
                }
            }
