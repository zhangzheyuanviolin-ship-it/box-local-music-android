            package p000;

            import android.content.Context;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteTransactionListener;
            import android.os.CancellationSignal;
            import com.google.mlkit.vision.face.FaceDetection;
            import com.google.mlkit.vision.face.FaceDetectorOptions;
            import com.google.mlkit.vision.facemesh.FaceMeshDetection;
            import com.google.mlkit.vision.facemesh.FaceMeshDetectorOptions;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.annotation.Annotation;
            import java.lang.reflect.Method;
            import org.jetbrains.compose.resources.AndroidContextProvider;
            
            public final class IOlIlo1 implements IllOOo00lI {
                public final int I00iOIl;

                public IOlIlo1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    Class<?> returnType;
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 300 */                   IOlO0o100i1i.I00000oOI("LocalInputManager");
/* 303 */                   throw null;
                        case 1:
/* 294 */                   IOlO0o100i1i.I00000oOI("LocalLayoutDirection");
/* 297 */                   throw null;
                        case 2:
/* 288 */                   IOlO0o100i1i.I00000oOI("LocalProvidableLocaleList");
/* 291 */                   throw null;
                        case 3:
                        case 4:
/* 6 */                     return null;
                        case 5:
/* 281 */                   IOlO0o100i1i.I00000oOI("LocalTextToolbar");
/* 284 */                   throw null;
                        case 6:
/* 269 */                   IOl1II00.I00000oOI("Unexpected call to default provider");
/* 278 */                   throw new IOiIIo1l(5);
                        case 7:
/* 262 */                   return ilIIOO0loi1i.I00000oIO("io.modelcontextprotocol.kotlin.sdk.types.ContentTypes", IOoOoo0.values(), new String[]{"text", "image", "audio", "resource_link", "resource"}, new Annotation[][]{null, null, null, null, null});
                        case 8:
/* 234 */                   return new I1Ilill(OiIiIiiII.I00000oIO);
                        case 9:
/* 225 */                   return Iol01oi1o.Companion.serializer();
                        case 10:
/* 219 */                   return new I1Ilill(OlOlllO.I00000oIO);
                        case 11:
/* 210 */                   return Oi1lo0illIO.Companion.serializer();
                        case 12:
/* 207 */                   return ooiIlOl1iI;
                        case 13:
/* 192 */                   Context context = AndroidContextProvider.I00iOIl;
/* 194 */                   if (context != null) {
/* 196 */                       return context.getAssets();
                            }
/* 203 */                   I000II.I001IO000("Android context is not initialized. If it happens in the Preview mode then call PreviewContextConfigurationEffect() function.");
/* 6 */                     return null;
                        case 14:
/* 187 */                   return O1I1lilOlO0I.I00000oOI("io.ktor.client.plugins.SaveBody");
                        case 15:
                        case 16:
                        case 17:
/* 184 */                   return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 181 */                   return Boolean.TRUE;
                        case PoseLandmark.LEFT_INDEX:
/* 177 */                   return new I1Ilill(OlOlllO.I00000oIO);
                        case PoseLandmark.RIGHT_INDEX:
/* 168 */                   return Iiol0ol0oI.Companion.serializer();
                        case PoseLandmark.LEFT_THUMB:
/* 161 */                   return ilIIOO0loi1i.I00000oIO("io.modelcontextprotocol.kotlin.sdk.types.ElicitResult.Action", Iiol0ol0oI.values(), new String[]{"accept", "decline", "cancel"}, new Annotation[][]{null, null, null});
                        case PoseLandmark.RIGHT_THUMB:
/* 136 */                   return IOoOoo0.Companion.serializer();
                        case PoseLandmark.LEFT_HIP:
/* 129 */                   return FaceDetection.getClient(new FaceDetectorOptions.Builder().setPerformanceMode(2).setLandmarkMode(2).setMinFaceSize(0.04f).build());
                        case PoseLandmark.RIGHT_HIP:
/* 99 */                    return FaceMeshDetection.getClient(new FaceMeshDetectorOptions.Builder().setUseCase(1).build());
                        case PoseLandmark.LEFT_KNEE:
/* 81 */                    return 0;
                        case PoseLandmark.RIGHT_KNEE:
                            try {
/* 71 */                        Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
/* 75 */                        declaredMethod.setAccessible(true);
/* 78 */                        return declaredMethod;
                            } catch (Throwable unused) {
/* 6 */                         return null;
                            }
                        case 27:
                            try {
/* 40 */                        Method method = (Method) IllO0lI.I00iio.getValue();
/* 42 */                        if (method == null || (returnType = method.getReturnType()) == null) {
/* 6 */                             return null;
                                }
/* 52 */                        Class cls = Integer.TYPE;
/* 62 */                        return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                            } catch (Throwable unused2) {
/* 6 */                         return null;
                            }
                        case PoseLandmark.RIGHT_ANKLE:
/* 30 */                    return new Il0lloiOlO("io.ktor.util.date.WeekDay", i0010oOIlI.values());
                        default:
/* 18 */                    return new Il0lloiOlO("io.ktor.util.date.Month", OI010IlI.values());
                    }
                }
            }
