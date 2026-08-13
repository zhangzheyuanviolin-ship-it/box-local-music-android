            package p000;

            import android.app.ActivityManager;
            import android.content.Context;
            import android.graphics.Bitmap;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            
            public final class IoiIl0 extends O0iO10011II implements IllOOo00lI {
                public final int I00iOIl;
                public final IoiIlI1oOO I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoiIl0(IoiIlI1oOO ioiIlI1oOO, int i) {
/* 6 */             super(0);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = ioiIlI1oOO;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final Object invoke() {
                    I0IIiO0iI i0IIiO0iI;
                    int largeMemoryClass;
                    OOllIO oOllIOI00000oIO;
                    switch (this.I00iOIl) {
                        case 0:
/* 99 */                    Context context = this.I00iiI.I00iOIl;
/* 101 */                   Bitmap.Config[] configArr = I000O01llI0.I00000oIO;
/* 103 */                   double d = 0.2d;
                            try {
/* 118 */                       if (((ActivityManager) context.getSystemService(ActivityManager.class)).isLowRamDevice()) {
/* 120 */                           d = 0.15d;
                                }
                            } catch (Exception unused) {
                            }
/* 129 */                   int i = 0;
/* 130 */                   O1I1OO o1i1oo = new O1I1OO(11, (byte) 0);
/* 138 */                   o1i1oo.I00iiO = new LinkedHashMap();
/* 140 */                   VarHandle.storeStoreFence();
/* 147 */                   if (d > 0.0d) {
/* 149 */                       Bitmap.Config[] configArr2 = I000O01llI0.I00000oIO;
                                try {
/* 155 */                           ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
/* 173 */                           largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                                } catch (Exception unused2) {
/* 178 */                           largeMemoryClass = Barcode.FORMAT_QR_CODE;
                                }
/* 186 */                       i = (int) (d * largeMemoryClass * 1024.0d * 1024.0d);
                            }
/* 187 */                   if (i > 0) {
/* 193 */                       OlOO1i11110 olOO1i11110 = new OlOO1i11110(23);
/* 196 */                       olOO1i11110.I00iiI = o1i1oo;
/* 203 */                       olOO1i11110.I00iiO = new OOllli10(i, olOO1i11110);
/* 205 */                       VarHandle.storeStoreFence();
                                i0IIiO0iI = olOO1i11110;
                            } else {
/* 213 */                       I0IIiO0iI i0IIiO0iI2 = new I0IIiO0iI(9);
/* 216 */                       i0IIiO0iI2.I00iiI = o1i1oo;
/* 218 */                       VarHandle.storeStoreFence();
                                i0IIiO0iI = i0IIiO0iI2;
                            }
/* 223 */                   OOlliOiioo oOlliOiioo = new OOlliOiioo();
/* 226 */                   oOlliOiioo.I00000oIO = i0IIiO0iI;
/* 228 */                   oOlliOiioo.I00000oOI = o1i1oo;
/* 230 */                   VarHandle.storeStoreFence();
/* 233 */                   return oOlliOiioo;
                        default:
/* 6 */                     IIIOlol iIIOlol = IIIOlol.I00ioIO;
/* 10 */                    Context context2 = this.I00iiI.I00iOIl;
                            synchronized (iIIOlol) {
                                try {
/* 13 */                            oOllIOI00000oIO = IIIOlol.I00l0I0l0lO1;
/* 15 */                            if (oOllIOI00000oIO == null) {
/* 19 */                                Iii1lIOoO iii1lIOoO = new Iii1lIOoO();
/* 24 */                                iii1lIOoO.I00000oOI = IlIiOO0ilI.I00iOIl;
/* 31 */                                iii1lIOoO.I0000Il00O = 0.02d;
/* 36 */                                iii1lIOoO.I0000O = 10485760L;
/* 41 */                                iii1lIOoO.I0000oI00 = 262144000L;
/* 43 */                                IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 47 */                                iii1lIOoO.I0001Ioi1lo = Ii1oo1ooill0.I00iiI;
/* 49 */                                Bitmap.Config[] configArr3 = I000O01llI0.I00000oIO;
/* 51 */                                File cacheDir = context2.getCacheDir();
/* 55 */                                if (cacheDir == null) {
/* 90 */                                    throw new IllegalStateException("cacheDir == null");
                                        }
/* 57 */                                cacheDir.mkdirs();
/* 62 */                                File fileI000iOII = IlIl10.I000iOII(cacheDir, "image_cache");
/* 66 */                                String str = OO0IIO1Il.I00iiI;
/* 72 */                                iii1lIOoO.I00000oIO = Iioi0lilII.I00ll1(fileI000iOII);
/* 74 */                                oOllIOI00000oIO = iii1lIOoO.I00000oIO();
/* 78 */                                IIIOlol.I00l0I0l0lO1 = oOllIOI00000oIO;
                                    }
                                } finally {
                                }
                            }
/* 92 */                    return oOllIOI00000oIO;
                    }
                }
            }
