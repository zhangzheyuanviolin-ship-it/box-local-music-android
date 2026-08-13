            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbde extends zzbdu {
                final zzaxq zza;
                final zzbdi zzb;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbde(zzbdi zzbdiVar, zzbol zzbolVar, zzaxq zzaxqVar) {
/* 14 */            super(zzbdiVar.zza.zzg);
/* 1 */             this.zza = zzaxqVar;
/* 3 */             Objects.requireNonNull(zzbdiVar);
/* 6 */             this.zzb = zzbdiVar;
                }

                @Override
                public final void zza() {
/* 1 */             int i = zzbom.zza;
/* 3 */             zzbdi zzbdiVar = this.zzb;
/* 9 */             if (zzbdiVar.zzc == null) {
                        try {
/* 17 */                    zzbdiVar.zzb.zzb(this.zza);
                        } catch (Throwable th) {
/* 36 */                    zzbdi.zzc(this.zzb, zzazd.zzb.zzd(th).zze("Failed to read headers"));
                        }
                    }
                }
            }
