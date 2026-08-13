            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.litert.CompiledModel;
            import java.io.BufferedReader;
            import java.io.InputStreamReader;
            import java.util.List;
            
            public final class OO1I0o {
                public CompiledModel I00000oIO;
                public List I00000oOI;

                public static List I00000oIO(Context context) {
                    try {
/* 22 */                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("plantrecognise_models/plant_labels.txt"), IO1IOI.I00000oIO), 8192);
                        try {
/* 29 */                    List listI000lI = OilO1oiooiII.I000lI(lOliOoIi.I00000oIO(bufferedReader));
/* 33 */                    bufferedReader.close();
/* 36 */                    return listI000lI;
                        } finally {
                        }
                    } catch (Throwable th) {
/* 49 */                Log.e("PlantRecogniseEngine", "Failed to load plant_labels.txt", th);
/* 52 */                return Il01100l.I00iOIl;
                    }
                }
            }
