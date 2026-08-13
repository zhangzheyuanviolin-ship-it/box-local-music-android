            package com.google.mlkit.vision.facemesh.internal;

            import com.google.mlkit.vision.facemesh.FaceMeshDetectorOptions;
            import p000.Il1I0i;
            import p000.lII0I0I000I;
            import p000.lolI1l0OO;
            
            public final class zza {
                private final zzc zza;
                private final Il1I0i zzb;

                public zza(zzc zzcVar, Il1I0i il1I0i) {
/* 4 */             this.zza = zzcVar;
/* 6 */             this.zzb = il1I0i;
                }

                public final zzb zza() {
/* 3 */             return zzb(zzb.zzb);
                }

                public final zzb zzb(FaceMeshDetectorOptions faceMeshDetectorOptions) {
/* 3 */             lII0I0I000I.I000O01llI0("You must provide a valid FaceMeshDetectorOptions.", faceMeshDetectorOptions);
/* 22 */            return new zzb((zzf) this.zza.get(faceMeshDetectorOptions), this.zzb, faceMeshDetectorOptions, lolI1l0OO.I00000oIO());
                }
            }
