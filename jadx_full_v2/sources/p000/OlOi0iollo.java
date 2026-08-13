            package p000;

            import android.app.ActivityOptions;
            import android.app.PendingIntent;
            import android.app.RemoteAction;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.params.StreamConfigurationMap;
            import android.os.Build;
            import android.util.Log;
            import android.view.inputmethod.BaseInputConnection;
            import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.math.BigInteger;
            import java.util.concurrent.Executor;
            
            public final class OlOi0iollo implements IllOOo00lI {
                public final int I00iOIl;
                public Object I00iiI;

                public OlOi0iollo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() throws PendingIntent.CanceledException {
/* 3 */             int i = this.I00iOIl;
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 10 */            Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 452 */                   OillO0lO1O oillO0lO1O = (OillO0lO1O) obj;
/* 454 */                   String str = oillO0lO1O.I00000oOI;
/* 456 */                   String str2 = oillO0lO1O.I00000oIO;
/* 458 */                   String str3 = oillO0lO1O.I0000Il00O;
/* 466 */                   StringBuilder sbI00111O = IIl001iO0Io.I00111O("Client received SSE event: event=", str, ", data=", str2, ", id=");
/* 470 */                   sbI00111O.append(str3);
/* 473 */                   return sbI00111O.toString();
                        case 1:
/* 435 */                   Oli0oiO oli0oiO = (Oli0oiO) obj;
/* 437 */                   Io10IOI io10IOI = oli0oiO.I00oOio10iI1;
/* 439 */                   if (io10IOI != null) {
/* 451 */                       return io10IOI;
                            }
/* 445 */                   Io10IOI io10IOII0000Il00O = il0lI1i1olii.I0001Ioi1lo(oli0oiO).I0000Il00O();
/* 449 */                   oli0oiO.I00oOio10iI1 = io10IOII0000Il00O;
/* 451 */                   return io10IOII0000Il00O;
                        case 2:
/* 320 */                   O0io0olo o0io0oloI00000oIO = ((Oli1o0i) obj).I00000oIO();
/* 324 */                   O0iiOioolIi o0iiOioolIi = o0io0oloI00000oIO.I00iOIl;
/* 340 */                   if (o0io0oloI00000oIO.I00lll10 != ((OI110O0) ((OI0oIOI) o0iiOioolIi.I000oI1ioi()).I00iiI).I00iiO) {
/* 342 */                       OI10I1IoI0Ol oI10I1IoI0Ol = o0io0oloI00000oIO.I00ilO0;
/* 344 */                       Object[] objArr = oI10I1IoI0Ol.I0000Il00O;
/* 346 */                       long[] jArr = oI10I1IoI0Ol.I00000oIO;
                                int length = jArr.length - 2;
/* 352 */                       if (length >= 0) {
/* 354 */                           int i2 = 0;
                                    while (true) {
/* 355 */                               long j = jArr[i2];
/* 368 */                               if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 377 */                                   int i3 = 8 - ((~(i2 - length)) >>> 31);
/* 380 */                                   for (int i4 = 0; i4 < i3; i4++) {
/* 389 */                                       if ((255 & j) < 128) {
/* 398 */                                           ((O0il1o0oIi) objArr[(i2 << 3) + i4]).I0000O = true;
                                                }
/* 400 */                                       j >>= 8;
                                            }
/* 404 */                                   if (i3 == 8) {
/* 406 */                                       if (i2 != length) {
/* 408 */                                           i2++;
                                                }
                                            }
                                        }
                                    }
                                }
/* 413 */                       if (o0iiOioolIi.I00l0I0l0lO1 != null) {
/* 419 */                           if (!o0iiOioolIi.I010I0.I0000oI00) {
/* 421 */                               O0iiOioolIi.I00OilO00Il(o0iiOioolIi, false, 7);
                                    }
                                } else if (!o0iiOioolIi.I00100o1O0lo()) {
/* 431 */                           O0iiOioolIi.I00Ol00(o0iiOioolIi, false, 7);
                                }
                            }
/* 434 */                   return ooiIlOl1iI;
                        case 3:
/* 314 */                   ((Oliii00iliIi) obj).I0001Ioi1lo();
/* 317 */                   return ooiIlOl1iI;
                        case 4:
/* 296 */                   OloOoi oloOoi = (OloOoi) obj;
/* 298 */                   oloOoi.I0100o111I = null;
/* 300 */                   lO1OiIiIo0oi.I00000oOI(oloOoi);
/* 303 */                   l0o11Oi.I00000oOI(oloOoi);
/* 306 */                   il1ollIO0I.I00000oIO(oloOoi);
/* 309 */                   return Boolean.TRUE;
                        case 5:
/* 236 */                   PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                            try {
/* 240 */                       ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
/* 248 */                       if (Build.VERSION.SDK_INT >= 36) {
/* 251 */                           activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
                                } else {
/* 257 */                           activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                                }
/* 264 */                       actionIntent.send(activityOptionsMakeBasic.toBundle());
                            } catch (PendingIntent.CanceledException e) {
/* 292 */                       Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                            }
/* 295 */                   return ooiIlOl1iI;
                        case 6:
/* 220 */                   Oloo0l1lIl oloo0l1lIl = (Oloo0l1lIl) obj;
                            return oloo0l1lIl.I00lll10 ? lOioli00i0ii.I00000oIO(oloo0l1lIl) : Olol0I1o1IO.I00000oOI;
                        case 7:
/* 216 */                   return new BaseInputConnection(((Oo0Ooo1Oi) obj).I00000oIO, false);
                        case 8:
/* 205 */                   return IooO0O.I00000oIO(((IooO1IOlo) obj).I0000Il00O());
                        case 9:
/* 183 */                   Oo0ll0I1OO00 oo0ll0I1OO00 = (Oo0ll0I1OO00) obj;
/* 185 */                   oo0ll0I1OO00.I00oliIiO01i = null;
/* 187 */                   lO1OiIiIo0oi.I00000oOI(oo0ll0I1OO00);
/* 190 */                   l0o11Oi.I00000oOI(oo0ll0I1OO00);
/* 193 */                   il1ollIO0I.I00000oIO(oo0ll0I1OO00);
/* 196 */                   return Boolean.TRUE;
                        case 10:
/* 180 */                   return (Executor) ((Oo0olOi) obj).invoke();
                        case 11:
/* 170 */                   ((Oo1Ii1lloO1) obj).I010l10O.invoke(Boolean.valueOf(!r0.I010ioo));
/* 173 */                   return ooiIlOl1iI;
                        case 12:
/* 130 */                   OlO0OIIl1 olO0OIIl1 = ((OoIO11oiiiil) obj).I00000oOI;
/* 155 */                   olO0OIIl1.I000lI(null, OoIIo0oOI1.I00000oIO((OoIIo0oOI1) olO0OIIl1.getValue(), null, null, null, null, Il01100l.I00iOIl, "", false, false, 207));
/* 158 */                   return ooiIlOl1iI;
                        case 13:
/* 124 */                   ((OoIoI0iii0) obj).I000O01llI0();
/* 127 */                   return ooiIlOl1iI;
                        case 14:
/* 117 */                   return Boolean.valueOf(((IIo0OlO) ((o01l1ioOo0) obj).I00iOIl).I00000oIO().I00000oIO(UltraWideFlashCaptureUnderexposureQuirk.class));
                        case 15:
/* 97 */                    ((Ooo1l0o) obj).I00ioIO.setValue(ooiIlOl1iI);
/* 100 */                   return ooiIlOl1iI;
                        case 16:
/* 51 */                    OooO0l0000 oooO0l0000 = (OooO0l0000) obj;
/* 88 */                    return BigInteger.valueOf(oooO0l0000.I00iOIl).shiftLeft(32).or(BigInteger.valueOf(oooO0l0000.I00iiI)).shiftLeft(32).or(BigInteger.valueOf(oooO0l0000.I00iiO));
                        case 17:
/* 47 */                    ((i001ll1) obj).I0000oI00();
/* 50 */                    return ooiIlOl1iI;
                        case PoseLandmark.RIGHT_PINKY:
/* 41 */                    Il0Olo.I00000oIO((i01I0IOOI10) obj);
/* 44 */                    return ooiIlOl1iI;
                        default:
/* 23 */                    Object objI0000O = ((IIioli) ((i0I11Oo1) obj).I00000oIO).I0000O(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
/* 27 */                    if (objI0000O != null) {
/* 30 */                        return (StreamConfigurationMap) objI0000O;
                            }
/* 35 */                    I000II.I001IO000("Required value was null.");
/* 7 */                     return null;
                    }
                }
            }
