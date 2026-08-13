            package com.google.mlkit.vision.common.internal;

            import android.content.Context;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.List;
            import p000.O11o0I1oo;
            
            public class AutoMLModelUtils {
                private AutoMLModelUtils() {
                }

                public static String[] getModelAndLabelFilePaths(Context context, O11o0I1oo o11o0I1oo, boolean z) {
/* 2 */             if (z) {
/* 4 */                 throw null;
                    }
/* 215 */           throw null;
                }

                public static List<String> readLabelsFile(Context context, String str, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
/* 5 */             ArrayList arrayList = new ArrayList();
/* 26 */            InputStream inputStreamOpen = z ? context.getAssets().open(str) : new FileInputStream(new File(str));
                    try {
/* 38 */                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, "UTF-8"));
/* 45 */                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
/* 47 */                    arrayList.add(line);
                        }
/* 57 */                if (inputStreamOpen != null) {
/* 59 */                    inputStreamOpen.close();
                        }
/* 62 */                return arrayList;
                    } catch (Throwable th) {
/* 63 */                if (inputStreamOpen != null) {
                            try {
/* 65 */                        inputStreamOpen.close();
                            } catch (Throwable th2) {
                                try {
/* 84 */                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                } catch (Exception unused) {
                                }
                            }
                        }
/* 215 */               throw th;
                    }
                }
            }
