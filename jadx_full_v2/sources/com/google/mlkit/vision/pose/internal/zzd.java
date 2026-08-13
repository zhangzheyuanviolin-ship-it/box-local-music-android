            package com.google.mlkit.vision.pose.internal;

            import android.content.Context;
            import android.os.Build;
            import java.lang.invoke.VarHandle;
            import p000.I01l1o;
            import p000.I01l1o0Oii;
            import p000.I1lI11l11OIo;
            import p000.IoIlOo1o0IIl;
            import p000.O0oO1lOOo1;
            import p000.O1o0111OI00;
            import p000.OO11il0;
            import p000.iOliil;
            import p000.lollOoOoo;
            import p000.lool1O1l11io;
            import p000.o0OIl1o1i0Oi;
            import p000.o0i0Ill1olo;
            
            public final class zzd extends I01l1o0Oii {
                private static OO11il0 zza;

                private zzd(Context context) {
/* 21 */            super(context, zzb(), new zzb(), new zzc(context), zza());
                }

                public static I01l1o zza() {
/* 1 */             OO11il0 oO11il0Zzb = zzb();
/* 7 */             new Object() {
                    };
/* 14 */            o0OIl1o1i0Oi o0oil1o1i0oiI00000oIO = o0i0Ill1olo.I00000oIO("acceleration");
/* 20 */            IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(1, false);
/* 23 */            ioIlOo1o0IIl.I00iiI = o0oil1o1i0oiI00000oIO;
/* 27 */            Integer numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
/* 31 */            String str = Build.ID;
/* 33 */            String str2 = Build.BRAND;
/* 35 */            String str3 = Build.DEVICE;
/* 37 */            String str4 = Build.HARDWARE;
/* 39 */            String str5 = Build.MANUFACTURER;
/* 41 */            String str6 = Build.MODEL;
/* 43 */            String str7 = Build.PRODUCT;
/* 47 */            lollOoOoo lollooooo = new lollOoOoo();
/* 50 */            lollooooo.I00000oIO = numValueOf;
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            ioIlOo1o0IIl.I00iiO = lollooooo;
/* 60 */            String str8 = ((I1lI11l11OIo) oO11il0Zzb).I00000oIO;
/* 62 */            I1lI11l11OIo i1lI11l11OIo = (I1lI11l11OIo) oO11il0Zzb;
/* 64 */            String str9 = i1lI11l11OIo.I00000oOI;
/* 66 */            String str10 = i1lI11l11OIo.I0000Il00O;
/* 68 */            String str11 = i1lI11l11OIo.I0000O;
/* 72 */            lool1O1l11io lool1o1l11io = new lool1O1l11io();
/* 75 */            lool1o1l11io.I00000oIO = str8;
/* 77 */            lool1o1l11io.I00000oOI = str9;
/* 79 */            lool1o1l11io.I0000Il00O = str10;
/* 81 */            lool1o1l11io.I0000O = str11;
/* 83 */            VarHandle.storeStoreFence();
/* 86 */            ioIlOo1o0IIl.I00iio = lool1o1l11io;
/* 88 */            VarHandle.storeStoreFence();
/* 113 */           return ioIlOo1o0IIl;
                }

                public static synchronized OO11il0 zzb() {
                    OO11il0 oO11il0I000lI;
                    try {
/* 4 */                 oO11il0I000lI = zza;
/* 6 */                 if (oO11il0I000lI == null) {
/* 12 */                    iOliil ioliil = new iOliil(17);
/* 17 */                    ioliil.I00iiI = "mediapipe";
/* 21 */                    ioliil.I00iiO = "mlkit-pose";
/* 25 */                    ioliil.I00iio = "pose-detection-common";
/* 31 */                    String strI00000oIO = O0oO1lOOo1.I0000Il00O.I00000oIO("pose-detection-common");
/* 35 */                    if (strI00000oIO == null) {
/* 55 */                        throw new NullPointerException("Null clientLibraryVersion");
                            }
/* 37 */                    ioliil.I00ilI0I1 = strI00000oIO;
/* 39 */                    oO11il0I000lI = ioliil.I000lI();
/* 43 */                    zza = oO11il0I000lI;
                        }
                    } catch (Throwable th) {
/* 113 */               throw th;
                    }
/* 57 */            return oO11il0I000lI;
                }

                public static synchronized zzd zzc() {
/* 18 */            return new zzd((Context) O1o0111OI00.I0000Il00O().I00000oIO(Context.class));
                }
            }
