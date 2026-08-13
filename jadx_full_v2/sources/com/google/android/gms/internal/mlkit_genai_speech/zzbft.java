            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            import java.util.Collections;
            import java.util.Objects;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            final class zzbft implements Runnable {
                final zzbfx zza;
                private final zzayg zzb;

                public zzbft(zzbfx zzbfxVar, zzayg zzaygVar) {
/* 1 */             Objects.requireNonNull(zzbfxVar);
/* 4 */             this.zza = zzbfxVar;
/* 11 */            zzgo.zzc(zzaygVar, "savedListener");
/* 14 */            this.zzb = zzaygVar;
                }

                public static void zza(zzbft zzbftVar, IOException iOException) {
/* 1 */             zzbfx zzbfxVar = zzbftVar.zza;
/* 3 */             zzayh zzayhVarZzc = zzayi.zzc();
/* 35 */            zzayhVarZzc.zza(zzazf.zzb(zzazd.zzj.zze("Unable to resolve host ".concat(String.valueOf(zzbfxVar.zzr))).zzd(iOException)));
/* 44 */            zzbftVar.zzb.zza(zzayhVarZzc.zzd());
                }

                public static void zzc(zzbft zzbftVar, zzbfn zzbfnVar) {
/* 1 */             zzayh zzayhVarZzc = zzayi.zzc();
/* 13 */            zzayhVarZzc.zza(zzazf.zzb(zzbfnVar.zza));
/* 22 */            zzbftVar.zzb.zza(zzayhVarZzc.zzd());
                }

                @Override
                public final void run() {
                    boolean z;
                    zzbfs zzbfsVar;
                    zzazm zzazmVar;
                    zzbfx zzbfxVar;
                    zzavj zzavjVarZzg;
                    final zzayh zzayhVarZzc;
/* 1 */             Logger logger = zzbfx.zzh;
/* 7 */             Level level = Level.FINER;
/* 17 */            if (logger.isLoggable(level)) {
/* 39 */                zzbfx.zzh.logp(level, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Attempting DNS resolution of ".concat(String.valueOf(this.zza.zzr)));
                    }
/* 43 */            final zzbfn zzbfnVarZzi = null;
                    try {
                        try {
/* 45 */                    zzbfxVar = this.zza;
/* 47 */                    zzavjVarZzg = zzbfx.zzg(zzbfxVar);
/* 51 */                    zzayhVarZzc = zzayi.zzc();
                        } catch (IOException e) {
/* 1 */                     zzazm zzazmVar2 = this.zza.zzv;
/* 211 */                   zzazmVar2.zzc(new Runnable() {
                                @Override
                                public final void run() {
/* 5 */                             zzbft.zza(this.zza, e);
                                }
                            });
/* 214 */                   zzazmVar2.zzb();
                        }
/* 55 */                if (zzavjVarZzg != null) {
/* 65 */                    if (zzbfx.zzh.isLoggable(level)) {
/* 87 */                        zzbfx.zzh.logp(level, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Using proxy address " + zzavjVarZzg.toString());
                            }
/* 98 */                    zzayhVarZzc.zza(zzazf.zzc(Collections.singletonList(zzavjVarZzg)));
                        } else {
/* 102 */                   zzbfnVarZzi = zzbfxVar.zzi(false);
/* 110 */                   if (zzbfnVarZzi.zza != null) {
/* 1 */                         zzazm zzazmVar3 = zzbfxVar.zzv;
/* 121 */                       zzazmVar3.zzc(new Runnable() {
                                    @Override
                                    public final void run() {
/* 5 */                                 zzbft.zzc(this.zza, zzbfnVarZzi);
                                    }
                                });
/* 124 */                       zzazmVar3.zzb();
/* 131 */                       z = zzbfnVarZzi.zza == null;
/* 1 */                         zzazmVar = zzbfxVar.zzv;
/* 141 */                       zzbfsVar = new zzbfs(this, z);
/* 144 */                       zzazmVar.zzc(zzbfsVar);
/* 147 */                       zzazmVar.zzb();
                            }
/* 155 */                   if (zzbfnVarZzi.zzb != null) {
/* 165 */                       zzayhVarZzc.zza(zzazf.zzc(zzbfnVarZzi.zzb));
                            }
/* 172 */                   if (zzbfnVarZzi.zzc != null) {
/* 178 */                       zzayhVarZzc.zzc(zzbfnVarZzi.zzc);
                            }
                        }
/* 1 */                 zzazm zzazmVar4 = zzbfxVar.zzv;
/* 190 */               zzazmVar4.zzc(new Runnable() {
                            @Override
                            public final void run() {
/* 7 */                         this.zza.zzb.zza(zzayhVarZzc.zzd());
                            }
                        });
/* 193 */               zzazmVar4.zzb();
/* 217 */               z = zzbfnVarZzi != null && zzbfnVarZzi.zza == null;
/* 1 */                 zzazmVar = this.zza.zzv;
/* 235 */               zzbfsVar = new zzbfs(this, z);
/* 144 */               zzazmVar.zzc(zzbfsVar);
/* 147 */               zzazmVar.zzb();
                    } catch (Throwable th) {
/* 239 */               z = 0 != 0 && null.zza == null;
/* 1 */                 zzazm zzazmVar5 = this.zza.zzv;
/* 260 */               zzazmVar5.zzc(new zzbfs(this, z));
/* 263 */               zzazmVar5.zzb();
/* 743 */               throw th;
                    }
                }
            }
