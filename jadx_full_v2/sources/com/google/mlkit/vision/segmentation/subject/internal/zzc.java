            package com.google.mlkit.vision.segmentation.subject.internal;

            import com.google.mlkit.vision.segmentation.subject.SubjectSegmenterOptions;
            import p000.Il1I0i;
            import p000.lolIlO00;
            
            public final class zzc {
                private final zze zza;
                private final Il1I0i zzb;

                public zzc(zze zzeVar, Il1I0i il1I0i) {
/* 4 */             this.zza = zzeVar;
/* 6 */             this.zzb = il1I0i;
                }

                public final zzd zza(SubjectSegmenterOptions subjectSegmenterOptions) {
/* 25 */            return new zzd(subjectSegmenterOptions, (zzj) this.zza.get(subjectSegmenterOptions), this.zzb.I00000oIO(subjectSegmenterOptions.zzb()), lolIlO00.I00000oIO());
                }
            }
