            package p000;

            import android.util.Log;
            import com.google.ai.edge.gallery.data.AICoreModelPreference;
            import com.google.ai.edge.gallery.data.AICoreModelReleaseStage;
            import com.google.mlkit.genai.prompt.GenerationConfig;
            import com.google.mlkit.genai.prompt.ModelConfig;
            import com.google.mlkit.genai.prompt.ModelConfigKt;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class I000l1 implements Function1 {
                public final int I00iOIl;
                public O1oIOiI11o0 I00iiI;

                public I000l1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             O1oIOiI11o0 o1oIOiI11o0 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 55 */                    ModelConfig.Builder builder = (ModelConfig.Builder) obj;
/* 65 */                    builder.setReleaseStage(o1oIOiI11o0.I000o00OoI0I == AICoreModelReleaseStage.PREVIEW ? 1 : 0);
/* 75 */                    builder.setPreference(o1oIOiI11o0.I000oI1ioi == AICoreModelPreference.FULL ? 2 : 1);
                            break;
                        case 1:
/* 39 */                    I000l1 i000l1 = new I000l1(i);
/* 42 */                    i000l1.I00iiI = o1oIOiI11o0;
/* 44 */                    VarHandle.storeStoreFence();
/* 51 */                    ((GenerationConfig.Builder) obj).setModelConfig(ModelConfigKt.modelConfig(i000l1));
                            break;
                        default:
/* 31 */                    Log.e("BoxLlamaCppModelHelper", "Failed to reset conversation for " + o1oIOiI11o0.I00000oIO, (Exception) obj);
                            break;
                    }
/* 34 */            return ooiIlOl1iI;
                }
            }
