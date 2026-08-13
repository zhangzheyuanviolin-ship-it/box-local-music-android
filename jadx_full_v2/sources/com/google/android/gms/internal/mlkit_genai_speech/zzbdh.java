            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzbdh extends zzbdu {
                final zzbdi zza;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbdh(zzbdi zzbdiVar, zzbol zzbolVar) {
/* 12 */            super(zzbdiVar.zza.zzg);
/* 1 */             Objects.requireNonNull(zzbdiVar);
/* 4 */             this.zza = zzbdiVar;
                }

                @Override
                public final void zza() {
/* 1 */             int i = zzbom.zza;
/* 3 */             zzbdi zzbdiVar = this.zza;
/* 9 */             if (zzbdiVar.zzc == null) {
                        try {
/* 15 */                    zzbdiVar.zzb.zzd();
                        } catch (Throwable th) {
/* 34 */                    zzbdi.zzc(this.zza, zzazd.zzb.zzd(th).zze("Failed to call onReady."));
                        }
                    }
                }
            }
