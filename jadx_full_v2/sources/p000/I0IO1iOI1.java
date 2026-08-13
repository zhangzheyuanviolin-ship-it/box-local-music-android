            package p000;

            import android.os.Bundle;
            import android.util.Log;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            
            public final class I0IO1iOI1 extends iOI1I00I10 {
                public IOiO1IOloOiO I00000oIO;
                public String I00000oOI;
                public iOI110IOi11i I0000Il00O;

                @Override
                public final void I00000oIO(Object obj) throws Exception {
/* 1 */             IOiO1IOloOiO iOiO1IOloOiO = this.I00000oIO;
/* 3 */             ArrayList arrayList = iOiO1IOloOiO.I0000O;
/* 5 */             LinkedHashMap linkedHashMap = iOiO1IOloOiO.I00000oOI;
/* 7 */             String str = this.I00000oOI;
/* 9 */             Object obj2 = linkedHashMap.get(str);
/* 13 */            iOI110IOi11i ioi110ioi11i = this.I0000Il00O;
/* 15 */            if (obj2 == null) {
/* 77 */                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + ioi110ioi11i + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                    }
/* 19 */            int iIntValue = ((Number) obj2).intValue();
/* 23 */            arrayList.add(str);
                    try {
/* 26 */                iOiO1IOloOiO.I00000oOI(iIntValue, ioi110ioi11i, obj);
                    } catch (Exception e) {
/* 31 */                arrayList.remove(str);
/* 34 */                throw e;
                    }
                }

                public final void I00000oOI() {
                    Integer num;
/* 1 */             IOiO1IOloOiO iOiO1IOloOiO = this.I00000oIO;
/* 3 */             String str = this.I00000oOI;
/* 5 */             Bundle bundle = iOiO1IOloOiO.I000II;
/* 7 */             LinkedHashMap linkedHashMap = iOiO1IOloOiO.I0001Ioi1lo;
/* 15 */            if (!iOiO1IOloOiO.I0000O.contains(str) && (num = (Integer) iOiO1IOloOiO.I00000oOI.remove(str)) != null) {
/* 29 */                iOiO1IOloOiO.I00000oIO.remove(num);
                    }
/* 34 */            iOiO1IOloOiO.I0000oI00.remove(str);
/* 47 */            if (linkedHashMap.containsKey(str)) {
/* 49 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Dropping pending result for request ", str, ": ");
/* 57 */                sbI001IIilI0O.append(linkedHashMap.get(str));
/* 64 */                Log.w("ActivityResultRegistry", sbI001IIilI0O.toString());
/* 67 */                linkedHashMap.remove(str);
                    }
/* 74 */            if (bundle.containsKey(str)) {
/* 102 */               Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((I0IIOOO1O) bundle.getParcelable(str, I0IIOOO1O.class)));
/* 105 */               bundle.remove(str);
                    }
/* 114 */           if (iOiO1IOloOiO.I0000Il00O.get(str) == null) {
/* 116 */               return;
                    }
/* 117 */           OIiilo1Ool0o.I00000oIO();
                }
            }
