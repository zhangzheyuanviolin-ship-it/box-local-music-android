            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Map;
            
            final class zzaft extends zzafs {
                @Override
                public final zzafw zza(Object obj) {
/* 1 */             zzagd zzagdVar = (zzagd) obj;
/* 3 */             zzafw zzafwVar = zzagdVar.zzb;
/* 7 */             if (!zzafwVar.zzb) {
/* 29 */                return zzafwVar;
                    }
/* 9 */             zzafw zzafwVarClone = zzafwVar.clone();
/* 13 */            zzagdVar.zzb = zzafwVarClone;
/* 29 */            return zzafwVarClone;
                }

                @Override
                public final void zzb(Object obj) {
/* 5 */             ((zzagd) obj).zzb.zzh();
                }

                @Override
                public final void zzc(zzahz zzahzVar, Object obj, zzafr zzafrVar, zzafw zzafwVar) {
/* 1 */             zzagf zzagfVar = (zzagf) obj;
/* 15 */            zzafwVar.zzj(zzagfVar.zzb, zzahzVar.zzs(zzagfVar.zza.getClass(), zzafrVar));
                }

                @Override
                public final void zzd(zzajb zzajbVar, Map.Entry entry) {
/* 5 */             zzage zzageVar = (zzage) entry.getKey();
/* 7 */             zzaiz zzaizVar = zzaiz.zza;
                    switch (zzageVar.zzb.ordinal()) {
                        case 0:
/* 315 */                   zzajbVar.zzf(zzageVar.zza, ((Double) entry.getValue()).doubleValue());
                            break;
                        case 1:
/* 299 */                   zzajbVar.zzo(zzageVar.zza, ((Float) entry.getValue()).floatValue());
                            break;
                        case 2:
/* 283 */                   zzajbVar.zzt(zzageVar.zza, ((Long) entry.getValue()).longValue());
                            break;
                        case 3:
/* 267 */                   zzajbVar.zzL(zzageVar.zza, ((Long) entry.getValue()).longValue());
                            break;
                        case 4:
/* 251 */                   zzajbVar.zzr(zzageVar.zza, ((Integer) entry.getValue()).intValue());
                            break;
                        case 5:
/* 235 */                   zzajbVar.zzm(zzageVar.zza, ((Long) entry.getValue()).longValue());
                            break;
                        case 6:
/* 219 */                   zzajbVar.zzk(zzageVar.zza, ((Integer) entry.getValue()).intValue());
                            break;
                        case 7:
/* 203 */                   zzajbVar.zzb(zzageVar.zza, ((Boolean) entry.getValue()).booleanValue());
                            break;
                        case 8:
/* 187 */                   zzajbVar.zzH(zzageVar.zza, (String) entry.getValue());
                            break;
                        case 9:
/* 175 */                   zzajbVar.zzq(zzageVar.zza, entry.getValue(), zzahw.zza().zzb(entry.getValue().getClass()));
                            break;
                        case 10:
/* 149 */                   zzajbVar.zzw(zzageVar.zza, entry.getValue(), zzahw.zza().zzb(entry.getValue().getClass()));
                            break;
                        case 11:
/* 123 */                   zzajbVar.zzd(zzageVar.zza, (zzafd) entry.getValue());
                            break;
                        case 12:
/* 111 */                   zzajbVar.zzJ(zzageVar.zza, ((Integer) entry.getValue()).intValue());
                            break;
                        case 13:
/* 95 */                    zzajbVar.zzr(zzageVar.zza, ((Integer) entry.getValue()).intValue());
                            break;
                        case 14:
/* 79 */                    zzajbVar.zzy(zzageVar.zza, ((Integer) entry.getValue()).intValue());
                            break;
                        case 15:
/* 63 */                    zzajbVar.zzA(zzageVar.zza, ((Long) entry.getValue()).longValue());
                            break;
                        case 16:
/* 47 */                    zzajbVar.zzC(zzageVar.zza, ((Integer) entry.getValue()).intValue());
                            break;
                        case 17:
/* 31 */                    zzajbVar.zzE(zzageVar.zza, ((Long) entry.getValue()).longValue());
                            break;
                    }
                }
            }
