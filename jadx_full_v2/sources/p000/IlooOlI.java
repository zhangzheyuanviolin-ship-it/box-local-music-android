            package p000;

            import android.graphics.Bitmap;
            import android.os.Build;
            import com.google.mlkit.genai.prompt.Generation;
            import com.google.mlkit.genai.prompt.GenerativeModel;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.regex.Pattern;
            import kotlin.jvm.functions.Function1;
            
            public final class IlooOlI {
                public final GenerativeModel I00000oIO = Generation.INSTANCE.getClient();

                public static Ii1Io1loiI I0000O(IlooOlI ilooOlI, String str, Bitmap bitmap, int i) {
                    String str2;
                    Integer numI000lI;
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 bitmap = null;
                    }
/* 6 */             Bitmap bitmap2 = bitmap;
/* 9 */             Pattern patternCompile = Pattern.compile("Pixel (\\d+)");
/* 13 */            String str3 = Build.MODEL;
/* 19 */            int iIntValue = 0;
/* 20 */            O1OlOOioiI o1OlOOioiII00000oIO = lIo0ol0oI010.I00000oIO(patternCompile.matcher(str3), 0, str3);
/* 26 */            if (o1OlOOioiII00000oIO != null && (str2 = (String) ((O1OlO1II) o1OlOOioiII00000oIO.I00000oIO()).get(1)) != null && (numI000lI = OlOolloIIOl0.I000lI(10, str2)) != null) {
/* 49 */                iIntValue = numI000lI.intValue();
                    }
/* 75 */            int iMin = Math.min(iIntValue >= 10 ? 6144 : iIntValue == 9 ? 3072 : iIntValue == 8 ? 768 : 256, Barcode.FORMAT_QR_CODE);
/* 79 */            ilooOlI.getClass();
/* 90 */            return ilOl0O00Il0i.I00000oOI(new IlooIo11l(str, bitmap2, iMin, ilooOlI, null));
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoilo iOoilo) throws Throwable {
                    Iloo10l0 iloo10l0;
/* 3 */             if (iOoilo instanceof Iloo10l0) {
/* 6 */                 iloo10l0 = (Iloo10l0) iOoilo;
/* 8 */                 int i = iloo10l0.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iloo10l0.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iloo10l0 = new Iloo10l0(this, iOoilo);
                        }
                    }
/* 25 */            Object objCheckStatus = iloo10l0.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iloo10l0.I00iiO;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objCheckStatus);
/* 50 */                iloo10l0.I00iiO = 1;
/* 54 */                objCheckStatus = this.I00000oIO.checkStatus(iloo10l0);
/* 58 */                if (objCheckStatus == ii0111o) {
/* 60 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(objCheckStatus);
                    }
/* 69 */            return new Integer(((Number) objCheckStatus).intValue());
                }

                public final void I00000oOI() {
                    try {
/* 3 */                 this.I00000oIO.close();
                    } catch (Exception e) {
/* 16 */                IIlIOloOOO.I001iOo1i0O("close() failed: ", e.getMessage(), "GeminiNanoProvider");
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(Function1 function1, IOoilo iOoilo) throws Exception {
                    Iloo1l01 iloo1l01;
                    Function1 function12;
/* 3 */             if (iOoilo instanceof Iloo1l01) {
/* 6 */                 iloo1l01 = (Iloo1l01) iOoilo;
/* 8 */                 int i = iloo1l01.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iloo1l01.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iloo1l01 = new Iloo1l01(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00000oIO = iloo1l01.I00iiI;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i2 = iloo1l01.I00iio;
                    try {
/* 34 */                if (i2 == 0) {
/* 59 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 62 */                    iloo1l01.I00iOIl = function1;
/* 64 */                    iloo1l01.I00iio = 1;
/* 66 */                    objI00000oIO = I00000oIO(iloo1l01);
/* 70 */                    if (objI00000oIO != obj) {
                            }
/* 123 */                   return obj;
                        }
/* 36 */                if (i2 != 1) {
/* 38 */                    if (i2 != 2) {
/* 48 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                        return null;
                            }
/* 40 */                    function12 = iloo1l01.I00iOIl;
/* 42 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 130 */                   function12.invoke(new Integer(3));
/* 133 */                   return Boolean.TRUE;
                        }
/* 53 */                function1 = iloo1l01.I00iOIl;
/* 55 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 75 */                int iIntValue = ((Number) objI00000oIO).intValue();
/* 84 */                function1.invoke(new Integer(iIntValue));
/* 87 */                if (iIntValue == 3) {
/* 89 */                    return Boolean.TRUE;
                        }
/* 92 */                if (iIntValue == 0) {
/* 94 */                    return Boolean.FALSE;
                        }
/* 102 */               function1.invoke(new Integer(2));
/* 107 */               IlOil1ii ilOil1iiDownload = this.I00000oIO.download();
/* 111 */               Iloo1l01iI iloo1l01iI = Iloo1l01iI.I00iOIl;
/* 113 */               iloo1l01.I00iOIl = function1;
/* 115 */               iloo1l01.I00iio = 2;
/* 121 */               if (ilOil1iiDownload.I00000oIO(iloo1l01iI, iloo1l01) != obj) {
/* 124 */                   function12 = function1;
/* 130 */                   function12.invoke(new Integer(3));
/* 133 */                   return Boolean.TRUE;
                        }
/* 123 */               return obj;
                    } catch (Exception e) {
/* 145 */               IIlIOloOOO.I001iOo1i0O("ensureAvailable failed: ", e.getMessage(), "GeminiNanoProvider");
/* 332 */               throw e;
                    }
                }
            }
