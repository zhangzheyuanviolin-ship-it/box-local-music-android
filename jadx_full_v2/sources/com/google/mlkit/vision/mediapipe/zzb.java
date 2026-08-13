            package com.google.mlkit.vision.mediapipe;

            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhl;
            import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv;
            import p000.illIo1I;
            import p000.iloIi0ili1;
            import p000.iloooiIioI10;
            import p000.io1IillOoO;
            import p000.l0oioo1oO;
            
            final class zzb implements MediaPipeInput {
                private final io1IillOoO zza;

                static {
/* 1 */             l0oioo1oO.I00000oIO();
                }

                public zzb(boolean z, boolean z2, String str, String str2) {
/* 4 */             iloIi0ili1 iloii0ili1I000o00OoI0I = iloooiIioI10.I000o00OoI0I();
/* 8 */             iloii0ili1I000o00OoI0I.I0000oI00();
/* 15 */            iloooiIioI10.I0010I0i((iloooiIioI10) iloii0ili1I000o00OoI0I.I00iiI);
/* 18 */            if (z) {
/* 20 */                iloii0ili1I000o00OoI0I.I0000oI00();
/* 28 */                iloooiIioI10.I0010o((iloooiIioI10) iloii0ili1I000o00OoI0I.I00iiI, 3);
/* 31 */                iloii0ili1I000o00OoI0I.I0000oI00();
/* 38 */                iloooiIioI10.I000oI1ioi((iloooiIioI10) iloii0ili1I000o00OoI0I.I00iiI, z2);
/* 41 */                iloii0ili1I000o00OoI0I.I0000oI00();
/* 48 */                iloooiIioI10.I00100l0((iloooiIioI10) iloii0ili1I000o00OoI0I.I00iiI, str);
/* 51 */                iloii0ili1I000o00OoI0I.I0000oI00();
/* 58 */                iloooiIioI10.I00100o1O0lo((iloooiIioI10) iloii0ili1I000o00OoI0I.I00iiI, str2);
                    } else {
/* 62 */                iloii0ili1I000o00OoI0I.I0000oI00();
/* 70 */                iloooiIioI10.I0010o((iloooiIioI10) iloii0ili1I000o00OoI0I.I00iiI, 2);
                    }
/* 73 */            illIo1I illio1iI000o00OoI0I = io1IillOoO.I000o00OoI0I();
/* 77 */            illio1iI000o00OoI0I.I0000oI00();
/* 90 */            io1IillOoO.I00100l0((io1IillOoO) illio1iI000o00OoI0I.I00iiI, (iloooiIioI10) iloii0ili1I000o00OoI0I.I00000oOI());
/* 99 */            this.zza = (io1IillOoO) illio1iI000o00OoI0I.I00000oOI();
                }

                @Override
                public final long zza() {
/* 1 */             return 0L;
                }

                @Override
                public final zzhv zzb(zzhl zzhlVar) {
/* 3 */             return zzhlVar.zze(this.zza);
                }
            }
