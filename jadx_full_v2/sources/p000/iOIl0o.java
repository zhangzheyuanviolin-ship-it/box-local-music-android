            package p000;

            import android.util.LongSparseArray;
            import android.view.translation.TranslationResponseValue;
            import android.view.translation.ViewTranslationResponse;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOIl0o {
                public static void I00000oIO(I0lo1oIo i0lo1oIo, LongSparseArray longSparseArray) {
                    TranslationResponseValue value;
                    CharSequence text;
                    Oil00l oil00l;
                    Oil000 oil000;
                    Function1 function1;
/* 1 */             int size = longSparseArray.size();
/* 6 */             for (int i = 0; i < size; i++) {
/* 8 */                 long jKeyAt = longSparseArray.keyAt(i);
/* 16 */                ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
/* 18 */                if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (oil00l = (Oil00l) i0lo1oIo.I0000Il00O().I00000oOI((int) jKeyAt)) != null && (oil000 = oil00l.I00000oIO) != null) {
/* 57 */                    Object objI000II = oil000.I0000O.I00iOIl.I000II(Oiioi1IoIIli.I000l1);
/* 61 */                    if (objI000II == null) {
/* 63 */                        objI000II = null;
                            }
/* 64 */                    I01lOOlO0o i01lOOlO0o = (I01lOOlO0o) objI000II;
/* 66 */                    if (i01lOOlO0o != null && (function1 = (Function1) i01lOOlO0o.I00000oOI) != null) {
                            }
                        }
                    }
                }
            }
