            package p000;

            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            import kotlin.jvm.functions.Function1;
            
            public final class I000lI implements Function1 {
                public final int I00iOIl;
                public float I00iiI;
                public int I00iiO;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 29 */                    float f = this.I00iiI;
/* 31 */                    int i2 = this.I00iiO;
/* 33 */                    GenerateContentRequest.Builder builder = (GenerateContentRequest.Builder) obj;
/* 39 */                    builder.setTemperature(Float.valueOf(f));
/* 46 */                    builder.setTopK(Integer.valueOf(i2));
                            break;
                        default:
/* 8 */                     float f2 = this.I00iiI;
/* 10 */                    int i3 = this.I00iiO;
/* 12 */                    GenerateContentRequest.Builder builder2 = (GenerateContentRequest.Builder) obj;
/* 18 */                    builder2.setTemperature(Float.valueOf(f2));
/* 25 */                    builder2.setTopK(Integer.valueOf(i3));
                            break;
                    }
/* 28 */            return ooiIlOl1iI;
                }
            }
