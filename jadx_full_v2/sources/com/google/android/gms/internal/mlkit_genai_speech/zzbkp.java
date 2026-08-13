            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Random;
            import p000.I000II;
            
            final class zzbkp extends zzawx {
                private final zzawn zzf;
                private zzawt zzg;
                private zzauv zzh = zzauv.IDLE;

                public zzbkp(zzawn zzawnVar) {
/* 8 */             this.zzf = zzawnVar;
                }

                public static void zze(zzbkp zzbkpVar, zzawt zzawtVar, zzauw zzauwVar) {
                    zzawu zzbklVar;
/* 1 */             zzauv zzauvVarZza = zzauwVar.zza();
/* 7 */             if (zzauvVarZza == zzauv.SHUTDOWN) {
/* 38 */                return;
                    }
/* 10 */            zzauv zzauvVar = zzauv.TRANSIENT_FAILURE;
/* 12 */            if (zzauvVarZza == zzauvVar || zzauvVarZza == zzauv.IDLE) {
/* 20 */                zzbkpVar.zzf.zzd();
                    }
/* 25 */            if (zzbkpVar.zzh == zzauvVar) {
/* 29 */                if (zzauvVarZza == zzauv.CONNECTING) {
/* 38 */                    return;
                        }
/* 33 */                if (zzauvVarZza == zzauv.IDLE) {
/* 35 */                    zzbkpVar.zzf();
/* 38 */                    return;
                        }
                    }
/* 39 */            int iOrdinal = zzauvVarZza.ordinal();
/* 43 */            if (iOrdinal != 0) {
/* 46 */                zzbko zzbkoVar = null;
/* 47 */                if (iOrdinal == 1) {
/* 95 */                    zzbklVar = new zzbkl(zzawp.zzd(zzawtVar, null));
                        } else if (iOrdinal == 2) {
/* 85 */                    zzbklVar = new zzbkl(zzawp.zzb(zzauwVar.zzd()));
                        } else {
/* 53 */                    if (iOrdinal != 3) {
/* 71 */                        I000II.I000iOII("Unsupported state:".concat(zzauvVarZza.toString()));
/* 74 */                        return;
                            }
/* 57 */                    zzbklVar = new zzbkn(zzbkpVar, zzbkoVar);
                        }
                    } else {
/* 106 */               zzbklVar = new zzbkl(zzawp.zzc());
                    }
/* 109 */           zzbkpVar.zzg(zzauvVarZza, zzbklVar);
                }

                private final void zzg(zzauv zzauvVar, zzawu zzawuVar) {
/* 1 */             this.zzh = zzauvVar;
/* 5 */             this.zzf.zze(zzauvVar, zzawuVar);
                }

                @Override
                public final zzazd zza(zzaws zzawsVar) {
                    Boolean bool;
/* 1 */             List listZzd = zzawsVar.zzd();
/* 9 */             if (listZzd.isEmpty()) {
/* 51 */                zzazd zzazdVarZze = zzazd.zzj.zze("NameResolver returned no usable address. addrs=" + String.valueOf(zzawsVar.zzd()) + ", attrs=" + zzawsVar.zza().toString());
/* 55 */                zzb(zzazdVarZze);
/* 58 */                return zzazdVarZze;
                    }
/* 65 */            if ((zzawsVar.zzc() instanceof zzbkk) && (bool = ((zzbkk) zzawsVar.zzc()).zza) != null && bool.booleanValue()) {
/* 85 */                ArrayList arrayList = new ArrayList(listZzd);
/* 93 */                Collections.shuffle(arrayList, new Random());
/* 96 */                listZzd = arrayList;
                    }
/* 97 */            zzawt zzawtVar = this.zzg;
/* 99 */            if (zzawtVar == null) {
/* 101 */               zzawn zzawnVar = this.zzf;
/* 103 */               zzawi zzawiVarZzb = zzawk.zzb();
/* 107 */               zzawiVarZzb.zzb(listZzd);
/* 114 */               zzawt zzawtVarZza = zzawnVar.zza(zzawiVarZzb.zzc());
/* 123 */               zzawtVarZza.zzd(new zzbkj(this, zzawtVarZza));
/* 126 */               this.zzg = zzawtVarZza;
/* 140 */               zzg(zzauv.CONNECTING, new zzbkl(zzawp.zzd(zzawtVarZza, null)));
/* 143 */               zzawtVarZza.zzb();
                    } else {
/* 147 */               zzawtVar.zze(listZzd);
                    }
/* 150 */           return zzazd.zza;
                }

                @Override
                public final void zzb(zzazd zzazdVar) {
/* 1 */             zzawt zzawtVar = this.zzg;
/* 3 */             if (zzawtVar != null) {
/* 5 */                 zzawtVar.zzc();
/* 9 */                 this.zzg = null;
                    }
/* 22 */            zzg(zzauv.TRANSIENT_FAILURE, new zzbkl(zzawp.zzb(zzazdVar)));
                }

                @Override
                public final void zzc() {
/* 1 */             zzawt zzawtVar = this.zzg;
/* 3 */             if (zzawtVar != null) {
/* 5 */                 zzawtVar.zzc();
                    }
                }

                public final void zzf() {
/* 1 */             zzawt zzawtVar = this.zzg;
/* 3 */             if (zzawtVar != null) {
/* 5 */                 zzawtVar.zzb();
                    }
                }
            }
