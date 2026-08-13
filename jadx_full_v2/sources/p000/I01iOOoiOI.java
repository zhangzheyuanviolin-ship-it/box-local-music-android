            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import android.view.Choreographer;
            import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import com.google.mlkit.vision.segmentation.subject.SubjectSegmentation;
            import com.google.mlkit.vision.segmentation.subject.SubjectSegmenterOptions;
            import java.lang.invoke.VarHandle;
            import java.util.UUID;
            
            public final class I01iOOoiOI implements IllOOo00lI {
                public final int I00iOIl;

                public I01iOOoiOI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final Object invoke() {
                    Choreographer choreographer;
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 2;
/* 4 */             Object[] objArr = 0;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = null;
                    switch (i) {
                        case 0:
/* 313 */                   return ooiIlOl1iI;
                        case 1:
/* 291 */                   I01Io1ilOIIo i01Io1ilOIIo = OOl1i000OO.I00iOIl;
/* 308 */                   return Integer.valueOf(OOl1i000OO.I00iOIl.I0000O().nextInt(2147418112) + 65536);
                        case 2:
/* 286 */                   return UUID.randomUUID().toString();
                        case 3:
/* 281 */                   return ooiIlOl1iI;
                        case 4:
/* 277 */                   I0lloOI0oio.I00000oIO("LocalConfiguration");
/* 280 */                   throw null;
                        case 5:
/* 271 */                   I0lloOI0oio.I00000oIO("LocalContext");
/* 274 */                   throw null;
                        case 6:
/* 265 */                   I0lloOI0oio.I00000oIO("LocalImageVectorCache");
/* 268 */                   throw null;
                        case 7:
/* 259 */                   I0lloOI0oio.I00000oIO("LocalResourceIdCache");
/* 262 */                   throw null;
                        case 8:
/* 253 */                   I0lloOI0oio.I00000oIO("LocalView");
/* 256 */                   throw null;
                        case 9:
/* 246 */                   return UUID.randomUUID();
                        case 10:
/* 243 */                   return "DEFAULT_TEST_TAG";
                        case 11:
/* 238 */                   return UUID.randomUUID();
                        case 12:
/* 197 */                   if (Looper.myLooper() == Looper.getMainLooper()) {
/* 199 */                       choreographer = Choreographer.getInstance();
                            } else {
/* 204 */                       IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 218 */                       choreographer = (Choreographer) iOi1IOoIO0l.I00000oIO(O1OI1l011OO1.I00000oIO, new I01ii1i(i2, iOoil1iiIilo, 1));
                            }
/* 228 */                   I101OO01 i101oo01 = new I101OO01(choreographer, Handler.createAsync(Looper.getMainLooper()));
/* 233 */                   return iiollilo0IO1.I00000oIO(i101oo01, i101oo01.I00li1OI);
                        case 13:
                        case 14:
                        case 15:
/* 186 */                   return ooiIlOl1iI;
                        case 16:
/* 182 */                   return new I1Ilill(Oi1lo0illIO.Companion.serializer());
                        case 17:
/* 169 */                   return Float.valueOf(1.0f);
                        case PoseLandmark.RIGHT_PINKY:
/* 162 */                   return IOoOoo0.Companion.serializer();
                        case PoseLandmark.LEFT_INDEX:
/* 156 */                   return new OlI00IIlOO(iiO01ll11o1l.I00000oOI(1308617531));
                        case PoseLandmark.RIGHT_INDEX:
/* 142 */                   return SubjectSegmentation.getClient(new SubjectSegmenterOptions.Builder().enableForegroundBitmap().enableForegroundConfidenceMask().build());
                        case PoseLandmark.LEFT_THUMB:
/* 87 */                    OllO00oiil ollO00oiil = BackportedFixQuirk.I00000oIO;
/* 95 */                    Oi0Oooi oi0Oooi = new Oi0Oooi(22, objArr == true ? 1 : 0);
/* 100 */                   OlOiIoII olOiIoII = new OlOiIoII(i2);
/* 103 */                   VarHandle.storeStoreFence();
/* 111 */                   oi0Oooi.I00iiI = new OllO00oiil(olOiIoII);
/* 113 */                   VarHandle.storeStoreFence();
/* 116 */                   I1o1OoIiOlI i1o1OoIiOlI = new I1o1OoIiOlI();
/* 119 */                   i1o1OoIiOlI.I00000oIO = oi0Oooi;
/* 121 */                   VarHandle.storeStoreFence();
/* 124 */                   return i1o1OoIiOlI;
                        case PoseLandmark.RIGHT_THUMB:
/* 86 */                    throw new ClassCastException();
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_HIP:
/* 7 */                     return null;
                        case PoseLandmark.LEFT_KNEE:
/* 41 */                    float[] fArr = new float[Barcode.FORMAT_AZTEC];
/* 46 */                    for (int i3 = 0; i3 < 32; i3++) {
/* 49 */                        for (int i4 = 0; i4 < 32; i4++) {
/* 54 */                            int i5 = ((i3 * 32) + i4) * 4;
/* 57 */                            fArr[i5] = 0.0f;
/* 62 */                            fArr[i5 + 1] = i3;
/* 67 */                            fArr[i5 + 2] = i4;
/* 71 */                            fArr[i5 + 3] = 0.0f;
                                }
                            }
/* 79 */                    return fArr;
                        case PoseLandmark.RIGHT_KNEE:
/* 22 */                    float[] fArr2 = new float[Barcode.FORMAT_UPC_E];
/* 26 */                    for (int i6 = 0; i6 < 256; i6++) {
/* 33 */                        fArr2[(i6 * 4) + 3] = i6;
                            }
/* 38 */                    return fArr2;
                        case 27:
                        case PoseLandmark.RIGHT_ANKLE:
/* 19 */                    return ooiIlOl1iI;
                        default:
/* 15 */                    return new I1Ilill(IOoIIoIooo01.I0000Il00O);
                    }
                }
            }
