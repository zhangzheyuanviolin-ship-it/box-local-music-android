            package com.google.mlkit.vision.barcode.internal;

            import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
            import p000.Il1I0i;
            import p000.O1o0111OI00;
            import p000.o0iO0lI0ilO0;
            
            public final class zzg {
                private final zzi zza;
                private final Il1I0i zzb;
                private final O1o0111OI00 zzc;

                public zzg(zzi zziVar, Il1I0i il1I0i, O1o0111OI00 o1o0111OI00) {
/* 4 */             this.zza = zziVar;
/* 6 */             this.zzb = il1I0i;
/* 8 */             this.zzc = o1o0111OI00;
                }

                public final zzh zza() {
/* 5 */             return zzb(zzh.zzd);
                }

                public final zzh zzb(BarcodeScannerOptions barcodeScannerOptions) {
/* 33 */            return new zzh(barcodeScannerOptions, (zzl) this.zza.get(barcodeScannerOptions), this.zzb.I00000oIO(barcodeScannerOptions.zzc()), o0iO0lI0ilO0.I00000oIO(zzb.zzd()), this.zzc);
                }
            }
