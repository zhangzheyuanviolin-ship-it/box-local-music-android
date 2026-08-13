            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.ai.edge.litert.Environment;
            import java.io.BufferedReader;
            import java.io.InputStreamReader;
            import java.util.List;
            
            public final class O1o1IiIllOI {
                public CompiledModel I00000oIO;
                public Environment I00000oOI;
                public List I0000Il00O;
                public boolean I0000O;

                public static List I00000oOI(Context context) {
                    try {
/* 22 */                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("mobilenet_models/imagenet_labels.txt"), IO1IOI.I00000oIO), 8192);
                        try {
/* 29 */                    List listI000lI = OilO1oiooiII.I000lI(lOliOoIi.I00000oIO(bufferedReader));
/* 33 */                    bufferedReader.close();
/* 36 */                    return listI000lI;
                        } finally {
                        }
                    } catch (Throwable th) {
/* 49 */                Log.e("MobileNetEngine", "Failed to load imagenet_labels.txt", th);
/* 52 */                return Il01100l.I00iOIl;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
                
                    if (java.lang.Math.abs(r0 - 1.0f) < 0.05f) goto L15;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static float[] I0000Il00O(float[] fArr) {
/* 2 */             if (fArr.length != 0) {
/* 5 */                 float fI00IO1 = I1IoiO1l.I00IO1(fArr);
/* 9 */                 int length = fArr.length;
/* 11 */                int i = 0;
                        while (true) {
/* 15 */                    if (i < length) {
/* 17 */                        float f = fArr[i];
/* 21 */                        if (0.0f > f || f > 1.0001f) {
                                    break;
                                }
/* 30 */                        i++;
                            }
                        }
/* 46 */                float fI00II0Ol1O0l = I1IoiO1l.I00II0Ol1O0l(fArr);
/* 50 */                int length2 = fArr.length;
/* 51 */                float[] fArr2 = new float[length2];
/* 54 */                for (int i2 = 0; i2 < length2; i2++) {
/* 65 */                    fArr2[i2] = (float) Math.exp(fArr[i2] - fI00II0Ol1O0l);
                        }
/* 70 */                float fI00IO12 = I1IoiO1l.I00IO1(fArr2);
/* 74 */                Float fValueOf = Float.valueOf(fI00IO12);
/* 80 */                if (fI00IO12 <= 0.0f) {
/* 83 */                    fValueOf = null;
                        }
/* 86 */                float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
/* 90 */                int length3 = fArr.length;
/* 91 */                float[] fArr3 = new float[length3];
/* 93 */                for (int i3 = 0; i3 < length3; i3++) {
/* 98 */                    fArr3[i3] = fArr2[i3] / fFloatValue;
                        }
/* 168 */               return fArr3;
                    }
/* 45 */            return fArr;
                }

                public final void I00000oIO() {
                    try {
/* 1 */                 CompiledModel compiledModel = this.I00000oIO;
/* 3 */                 if (compiledModel != null) {
/* 5 */                     compiledModel.close();
                        }
                    } catch (Throwable unused) {
                    }
/* 9 */             this.I00000oIO = null;
                    try {
/* 11 */                Environment environment = this.I00000oOI;
/* 13 */                if (environment != null) {
/* 15 */                    environment.close();
                        }
                    } catch (Throwable unused2) {
                    }
/* 18 */            this.I00000oOI = null;
                }
            }
