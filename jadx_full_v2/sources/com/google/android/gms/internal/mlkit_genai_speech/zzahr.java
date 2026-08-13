            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Iterator;
            import java.util.Map;
            import p000.I000II;
            
            final class zzahr implements zzaia {
                private final zzahn zza;
                private final zzaim zzb;
                private final boolean zzc;
                private final zzafs zzd;

                private zzahr(zzaim zzaimVar, zzafs zzafsVar, zzahn zzahnVar) {
/* 4 */             this.zzb = zzaimVar;
/* 8 */             this.zzc = zzahnVar instanceof zzagd;
/* 10 */            this.zzd = zzafsVar;
/* 12 */            this.zza = zzahnVar;
                }

                public static zzahr zzj(zzaim zzaimVar, zzafs zzafsVar, zzahn zzahnVar) {
/* 3 */             return new zzahr(zzaimVar, zzafsVar, zzahnVar);
                }

                @Override
                public final int zza(Object obj) {
/* 6 */             int iZzb = ((zzagg) obj).zzc.zzb();
                    return this.zzc ? iZzb + ((zzagd) obj).zzb.zzc() : iZzb;
                }

                @Override
                public final int zzb(Object obj) {
/* 6 */             int iHashCode = ((zzagg) obj).zzc.hashCode();
                    return this.zzc ? (iHashCode * 53) + ((zzagd) obj).zzb.zza.hashCode() : iHashCode;
                }

                @Override
                public final Object zzc() {
/* 1 */             zzahn zzahnVar = this.zza;
                    return zzahnVar instanceof zzagg ? ((zzagg) zzahnVar).zzt() : zzahnVar.zzH().zzo();
                }

                @Override
                public final void zzd(Object obj) {
/* 3 */             this.zzb.zzi(obj);
/* 8 */             this.zzd.zzb(obj);
                }

                @Override
                public final void zze(Object obj, Object obj2) {
/* 3 */             zzaic.zzr(this.zzb, obj, obj2);
/* 8 */             if (this.zzc) {
/* 12 */                zzaic.zzq(this.zzd, obj, obj2);
                    }
                }

                @Override
                public final void zzf(Object obj, zzahz zzahzVar, zzafr zzafrVar) {
                    boolean zZzR;
/* 9 */             zzafs zzafsVar = this.zzd;
/* 11 */            zzaim zzaimVar = this.zzb;
/* 13 */            Object objZza = zzaimVar.zza(obj);
/* 17 */            zzafw zzafwVarZza = zzafsVar.zza(obj);
/* 172 */           do {
                        try {
/* 28 */                    if (zzahzVar.zzc() != Integer.MAX_VALUE) {
/* 32 */                        int iZzd = zzahzVar.zzd();
/* 39 */                        zZzR = true;
/* 40 */                        if (iZzd == 11) {
/* 76 */                            zzagf zzagfVarZzb = null;
/* 77 */                            zzafd zzafdVarZzp = null;
/* 78 */                            int iZzj = 0;
/* 85 */                            for (int i = Integer.MAX_VALUE; zzahzVar.zzc() != i; i = Integer.MAX_VALUE) {
/* 88 */                                int iZzd2 = zzahzVar.zzd();
/* 94 */                                if (iZzd2 != 16) {
/* 112 */                                   if (iZzd2 != 26) {
/* 125 */                                       if (iZzd2 == 12 || !zzahzVar.zzR()) {
                                                    break;
                                                }
                                            } else if (zzagfVarZzb != null) {
/* 116 */                                       zzafsVar.zzc(zzahzVar, zzagfVarZzb, zzafrVar, zzafwVarZza);
                                            } else {
/* 120 */                                       zzafdVarZzp = zzahzVar.zzp();
                                            }
                                        } else {
/* 96 */                                    iZzj = zzahzVar.zzj();
/* 102 */                                   zzagfVarZzb = zzafrVar.zzb(this.zza, iZzj);
                                        }
                                    }
/* 137 */                           if (zzahzVar.zzd() != 12) {
/* 187 */                               throw new zzagr("Protocol message end-group tag did not match expected tag.");
                                    }
/* 139 */                           if (zzafdVarZzp != null) {
/* 141 */                               if (zzagfVarZzb != null) {
/* 145 */                                   zzahm zzahmVarZzH = zzagfVarZzb.zza.zzH();
/* 149 */                                   zzafh zzafhVarZzg = zzafdVarZzp.zzg();
/* 153 */                                   zzahmVarZzH.zzi(zzafhVarZzg, zzafrVar);
/* 162 */                                   zzafwVarZza.zzj(zzagfVarZzb.zzb, zzahmVarZzH.zzo());
/* 165 */                                   zzafhVarZzg.zzz(0);
                                        } else {
/* 169 */                                   zzaimVar.zzg(objZza, iZzj, zzafdVarZzp);
                                        }
                                    }
                                } else if ((iZzd & 7) == 2) {
/* 51 */                            zzagf zzagfVarZzb2 = zzafrVar.zzb(this.zza, iZzd >>> 3);
/* 55 */                            if (zzagfVarZzb2 != null) {
/* 57 */                                zzafsVar.zzc(zzahzVar, zzagfVarZzb2, zzafrVar, zzafwVarZza);
                                    } else {
/* 65 */                                zZzR = zzaimVar.zzk(objZza, zzahzVar, 0);
                                    }
                                } else {
/* 71 */                            zZzR = zzahzVar.zzR();
                                }
                            }
                        } finally {
/* 188 */                   zzaimVar.zzj(obj, objZza);
                        }
/* 172 */           } while (zZzR);
                }

                @Override
                public final void zzg(Object obj, zzajb zzajbVar) {
/* 6 */             Iterator itZzg = ((zzagd) obj).zzb.zzg();
/* 14 */            while (itZzg.hasNext()) {
/* 20 */                Map.Entry entry = (Map.Entry) itZzg.next();
/* 26 */                zzafv zzafvVar = (zzafv) entry.getKey();
/* 34 */                if (zzafvVar.zzc() != zzaja.MESSAGE) {
/* 78 */                    I000II.I001IO000("Found invalid MessageSet item.");
/* 81 */                    return;
                        }
/* 36 */                zzafvVar.zzg();
/* 39 */                zzafvVar.zzf();
/* 44 */                if (entry instanceof zzagt) {
/* 60 */                    zzajbVar.zzx(zzafvVar.zza(), ((zzagt) entry).zza().zzb());
                        } else {
/* 72 */                    zzajbVar.zzx(zzafvVar.zza(), entry.getValue());
                        }
                    }
/* 86 */            ((zzagg) obj).zzc.zzk(zzajbVar);
                }

                @Override
                public final boolean zzh(Object obj, Object obj2) {
/* 15 */            if (!((zzagg) obj).zzc.equals(((zzagg) obj2).zzc)) {
/* 17 */                return false;
                    }
/* 21 */            if (this.zzc) {
/* 31 */                return ((zzagd) obj).zzb.equals(((zzagd) obj2).zzb);
                    }
/* 36 */            return true;
                }

                @Override
                public final boolean zzi(Object obj) {
/* 5 */             return ((zzagd) obj).zzb.zzl();
                }
            }
