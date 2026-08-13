            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.Context;
            import java.util.concurrent.TimeUnit;
            
            public final class zzazw extends zzavl {
                private final zzbjj zza;
                private final zzban zzb;

                private zzazw(zzazq zzazqVar, String str, Context context, zzazx zzazxVar) {
/* 6 */             zzban zzbanVar = new zzban();
/* 9 */             zzbanVar.zzg(context);
/* 12 */            zzbanVar.zzc(zzazxVar);
/* 15 */            this.zzb = zzbanVar;
/* 27 */            zzbjj zzbjjVar = new zzbjj(zzazqVar, zzazqVar.zzd(), null, null, zzbanVar, null);
/* 30 */            this.zza = zzbjjVar;
/* 36 */            zzbjjVar.zzd(60L, TimeUnit.SECONDS);
                }

                public static zzazw zzd(zzazq zzazqVar, Context context) {
/* 8 */             return new zzazw(zzazqVar, null, context, zzazx.zza());
                }

                @Override
                public final zzaxd zza() {
/* 1 */             zzban zzbanVar = this.zzb;
/* 3 */             zzbjj zzbjjVar = this.zza;
/* 9 */             zzbanVar.zze(zzbjjVar.zzf());
/* 18 */            zzbjjVar.zze(zzazr.zza, zzbanVar.zza());
/* 21 */            return zzbjjVar.zza();
                }

                @Override
                public final zzaxf zzb() {
/* 1 */             return this.zza;
                }

                public final zzazw zze(zzazy zzazyVar) {
/* 3 */             this.zzb.zzd(zzazyVar);
/* 29 */            return this;
                }

                public final zzazw zzf(zzbab zzbabVar) {
/* 3 */             this.zzb.zzf(zzbabVar);
/* 29 */            return this;
                }

                public final zzazw zzg(zzazv zzazvVar) {
/* 3 */             this.zzb.zzb(zzazvVar);
/* 29 */            return this;
                }
            }
