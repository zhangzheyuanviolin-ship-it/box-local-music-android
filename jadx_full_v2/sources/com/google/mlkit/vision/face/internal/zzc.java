            package com.google.mlkit.vision.face.internal;

            import com.google.mlkit.vision.face.FaceDetectorOptions;
            import p000.Il1I0i;
            import p000.lII0I0I000I;
            
            public final class zzc {
                private final zze zza;
                private final Il1I0i zzb;

                public zzc(zze zzeVar, Il1I0i il1I0i) {
/* 4 */             this.zza = zzeVar;
/* 6 */             this.zzb = il1I0i;
                }

                public final FaceDetectorImpl zza() {
/* 3 */             return zzb(FaceDetectorImpl.zzb);
                }

                public final FaceDetectorImpl zzb(FaceDetectorOptions faceDetectorOptions) {
/* 3 */             lII0I0I000I.I000O01llI0("You must provide a valid FaceDetectorOptions.", faceDetectorOptions);
/* 19 */            return new FaceDetectorImpl((zzh) this.zza.get(faceDetectorOptions), this.zzb, faceDetectorOptions, null);
                }
            }
