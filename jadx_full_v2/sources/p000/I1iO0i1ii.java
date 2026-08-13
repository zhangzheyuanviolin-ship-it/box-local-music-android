            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class I1iO0i1ii implements Function1 {
                public final int I00iOIl;
                public I1iOI11ioi1 I00iiI;

                @Override
                public final Object invoke(Object obj) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             I1iOI11ioi1 i1iOI11ioi1 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 69 */                    Integer numI000lI = OlOolloIIOl0.I000lI(10, (String) obj);
/* 81 */                    int iIntValue = numI000lI != null ? numI000lI.intValue() : 0;
/* 83 */                    OlO0OIIl1 olO0OIIl1 = i1iOI11ioi1.I00000oOI;
/* 110 */                   olO0OIIl1.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl1.getValue(), null, 0, null, iIntValue, null, null, null, null, null, 0.0f, null, null, 4087));
                            break;
                        default:
/* 17 */                    float fFloatValue = ((Float) obj).floatValue();
/* 21 */                    OlO0OIIl1 olO0OIIl12 = i1iOI11ioi1.I00000oOI;
/* 59 */                    olO0OIIl12.I000lI(null, I1iO1loOII1.I00000oIO((I1iO1loOII1) olO0OIIl12.getValue(), null, 0, null, 0, null, null, null, null, null, fFloatValue, IIlIOloOOO.I00100l0("Downloading diarization models… ", (int) (100.0f * fFloatValue), "%"), null, 2559));
                            break;
                    }
/* 62 */            return ooiIlOl1iI;
                }
            }
