            package p000;

            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class OoIIoiil1OI implements Function1 {
                public int I00iOIl;
                public OoIO11oiiiil I00iiI;
                public long I00iiO;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoIO11oiiiil ooIO11oiiiil = this.I00iiI;
/* 5 */             long j = this.I00iiO;
/* 7 */             String str = (String) obj;
/* 11 */            if (i == ooIO11oiiiil.I000O01llI0) {
/* 21 */                Log.e("AGTranslatorViewModel", "translate inference error: ".concat(str));
/* 27 */                OlOoOOIIi olOoOOIIi = new OlOoOOIIi(5);
/* 30 */                olOoOOIIi.I00iiI = str;
/* 32 */                VarHandle.storeStoreFence();
/* 35 */                ooIO11oiiiil.I000l1(j, olOoOOIIi);
/* 38 */                OlO0OIIl1 olO0OIIl1 = ooIO11oiiiil.I00000oOI;
/* 64 */                olO0OIIl1.I000lI(null, OoIIo0oOI1.I00000oIO((OoIIo0oOI1) olO0OIIl1.getValue(), null, null, OoII00OiO.I00iOIl, null, null, "Translation failed — try again.", false, false, 211));
                    }
/* 67 */            return OoiIlOl1iI.I00000oIO;
                }
            }
