            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayList;
            
            final class zzbdt {
                private ArrayList zza = new ArrayList();
                private volatile zzauv zzb = zzauv.IDLE;

                public final void zza(zzauv zzauvVar) {
/* 3 */             zzgo.zzc(zzauvVar, "newState");
/* 8 */             if (this.zzb == zzauvVar || this.zzb == zzauv.SHUTDOWN) {
/* 77 */                return;
                    }
/* 16 */            this.zzb = zzauvVar;
/* 24 */            if (this.zza.isEmpty()) {
/* 77 */                return;
                    }
/* 27 */            ArrayList arrayList = this.zza;
/* 34 */            this.zza = new ArrayList();
/* 40 */            if (arrayList.size() <= 0) {
/* 77 */                return;
                    }
/* 51 */            throw null;
                }
            }
