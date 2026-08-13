            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            import java.io.InputStream;
            import java.util.Objects;
            
            final class zzbdf extends zzbdu {
                final zzbni zza;
                final zzbdi zzb;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbdf(zzbdi zzbdiVar, zzbol zzbolVar, zzbni zzbniVar) {
/* 14 */            super(zzbdiVar.zza.zzg);
/* 1 */             this.zza = zzbniVar;
/* 3 */             Objects.requireNonNull(zzbdiVar);
/* 6 */             this.zzb = zzbdiVar;
                }

                @Override
                public final void zza() throws IOException {
/* 1 */             int i = zzbom.zza;
/* 3 */             zzbdi zzbdiVar = this.zzb;
/* 5 */             zzbdj zzbdjVar = zzbdiVar.zza;
/* 11 */            if (zzbdiVar.zzc != null) {
/* 72 */                zzbgr.zzd(this.zza);
/* 110 */               return;
                    }
                    while (true) {
                        try {
/* 15 */                    InputStream inputStreamZzf = this.zza.zzf();
/* 19 */                    if (inputStreamZzf == null) {
/* 69 */                        return;
                            }
                            try {
/* 33 */                        zzbdiVar.zzb.zzc(zzbdjVar.zzc.zzd(inputStreamZzf));
/* 36 */                        inputStreamZzf.close();
                            } catch (Throwable th) {
/* 43 */                        zzbgr.zze(inputStreamZzf);
/* 46 */                        throw th;
                            }
                        } catch (Throwable th2) {
/* 49 */                    zzbgr.zzd(this.zza);
/* 66 */                    zzbdi.zzc(this.zzb, zzazd.zzb.zzd(th2).zze("Failed to read message."));
/* 69 */                    return;
                        }
                    }
                }
            }
