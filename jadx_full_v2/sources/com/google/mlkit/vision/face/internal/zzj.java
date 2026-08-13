            package com.google.mlkit.vision.face.internal;

            import com.google.mlkit.vision.face.FaceDetectorOptions;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.I00Ol00;
            import p000.I0Oi111ii;
            import p000.O1o0111OI00;
            import p000.l1oi1IlII;
            import p000.l1ol0o1i10o;
            import p000.lI000Oo;
            import p000.lI00l11IIo0O;
            import p000.lI0IOoI;
            import p000.lIIO1i1Oo01O;
            import p000.lIIi1il;
            import p000.lIIl0IOioI;
            import p000.lIo0010ol;
            import p000.lOoIoI1Ioii;
            import p000.li0ll1ooi1;
            import p000.li10lI1;
            
            public final class zzj {
                static final AtomicReference zza = new AtomicReference();

                public static lI0IOoI zza(FaceDetectorOptions faceDetectorOptions) {
/* 1 */             int iZzd = faceDetectorOptions.zzd();
/* 17 */            lI000Oo li000oo = iZzd != 1 ? iZzd != 2 ? lI000Oo.UNKNOWN_LANDMARKS : lI000Oo.ALL_LANDMARKS : lI000Oo.NO_LANDMARKS;
/* 19 */            int iZzb = faceDetectorOptions.zzb();
/* 33 */            l1oi1IlII l1oi1ilii = iZzb != 1 ? iZzb != 2 ? l1oi1IlII.UNKNOWN_CLASSIFICATIONS : l1oi1IlII.ALL_CLASSIFICATIONS : l1oi1IlII.NO_CLASSIFICATIONS;
/* 35 */            int iZze = faceDetectorOptions.zze();
/* 49 */            lI00l11IIo0O li00l11iio0o = iZze != 1 ? iZze != 2 ? lI00l11IIo0O.UNKNOWN_PERFORMANCE : lI00l11IIo0O.ACCURATE : lI00l11IIo0O.FAST;
/* 51 */            int iZzc = faceDetectorOptions.zzc();
/* 65 */            l1ol0o1i10o l1ol0o1i10oVar = iZzc != 1 ? iZzc != 2 ? l1ol0o1i10o.UNKNOWN_CONTOURS : l1ol0o1i10o.ALL_CONTOURS : l1ol0o1i10o.NO_CONTOURS;
/* 71 */            Boolean boolValueOf = Boolean.valueOf(faceDetectorOptions.zzg());
/* 79 */            Float fValueOf = Float.valueOf(faceDetectorOptions.zza());
/* 85 */            lI0IOoI li0iooi = new lI0IOoI();
/* 88 */            li0iooi.I00000oIO = li000oo;
/* 90 */            li0iooi.I00000oOI = l1oi1ilii;
/* 92 */            li0iooi.I0000Il00O = li00l11iio0o;
/* 94 */            li0iooi.I0000O = l1ol0o1i10oVar;
/* 96 */            li0iooi.I0000oI00 = boolValueOf;
/* 98 */            li0iooi.I0001Ioi1lo = fValueOf;
/* 100 */           VarHandle.storeStoreFence();
/* 168 */           return li0iooi;
                }

                public static String zzb() {
                    return true != zzd() ? "play-services-mlkit-face-detection" : "face-detection";
                }

                public static void zzc(li10lI1 li10li1, final boolean z, final lIIi1il liii1il) {
/* 8 */             li10li1.I0000Il00O(new li0ll1ooi1() {
                        @Override
                        public final lOoIoI1Ioii zza() {
/* 1 */                     boolean z2 = z;
/* 3 */                     lIIi1il liii1il2 = liii1il;
/* 9 */                     I0Oi111ii i0Oi111ii = new I0Oi111ii(14);
/* 19 */                    i0Oi111ii.I00iio = z2 ? lIIO1i1Oo01O.TYPE_THICK : lIIO1i1Oo01O.TYPE_THIN;
/* 23 */                    lIo0010ol lio0010ol = new lIo0010ol();
/* 26 */                    lio0010ol.I00000oIO = liii1il2;
/* 28 */                    VarHandle.storeStoreFence();
/* 31 */                    i0Oi111ii.I00ilO0 = lio0010ol;
/* 36 */                    return new I00Ol00(i0Oi111ii, 0);
                        }
                    }, lIIl0IOioI.ON_DEVICE_FACE_LOAD);
                }

                public static boolean zzd() {
/* 1 */             AtomicReference atomicReference = zza;
/* 7 */             if (atomicReference.get() != null) {
/* 15 */                return ((Boolean) atomicReference.get()).booleanValue();
                    }
/* 28 */            boolean zZzc = zza.zzc(O1o0111OI00.I0000Il00O().I00000oOI());
/* 36 */            atomicReference.set(Boolean.valueOf(zZzc));
/* 55 */            return zZzc;
                }
            }
