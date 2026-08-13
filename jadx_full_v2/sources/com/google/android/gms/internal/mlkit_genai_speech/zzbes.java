            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.concurrent.Executor;
            
            final class zzbes implements zzbjr {
                private final Executor zzc;
                private final zzazm zzd;
                private Runnable zze;
                private Runnable zzf;
                private Runnable zzg;
                private zzbjq zzh;
                private final zzawd zza = zzawd.zzb(zzbes.class, null);
                private final Object zzb = new Object();
                private Collection zzi = new LinkedHashSet();
                private volatile zzbeq zzj = new zzbeq();

                public zzbes(Executor executor, zzazm zzazmVar) {
/* 34 */            this.zzc = executor;
/* 36 */            this.zzd = zzazmVar;
                }

                @Override
                public final zzawd zzc() {
/* 1 */             return this.zza;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
                
                    r4 = new com.google.android.gms.internal.mlkit_genai_speech.zzbep(r3, r0, r7, r6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
                
                    if (r0.zza().zzo() == false) goto L26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
                
                    if (r5 == null) goto L26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
                
                    if (r5.zzg() == false) goto L26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
                
                    ((com.google.android.gms.internal.mlkit_genai_speech.zzbep) r4).zze = r5.zzf();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
                
                    r3.zzi.add(r4);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
                
                    monitor-enter(r1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
                
                    r5 = r3.zzi.size();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
                
                    r3.zzd.zzb();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
                
                    return r4;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v11, types: [com.google.android.gms.internal.mlkit_genai_speech.zzbdk] */
                /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.gms.internal.mlkit_genai_speech.zzbgb] */
                /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.mlkit_genai_speech.zzbdk] */
                /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.mlkit_genai_speech.zzbep, java.lang.Object] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final zzbdk zze(zzaxv zzaxvVar, zzaxq zzaxqVar, zzatz zzatzVar, zzaum[] zzaumVarArr) {
                    ?? zzbgbVar;
                    zzawp zzawpVarZza;
                    zzbeq zzbeqVar;
                    int size;
                    try {
/* 8 */                 zzbkr zzbkrVar = new zzbkr(zzaxvVar, zzaxqVar, zzatzVar, new zzbjv(zzaumVarArr));
/* 11 */                zzbeq zzbeqVar2 = this.zzj;
                        while (true) {
/* 13 */                    zzazd zzazdVar = zzbeqVar2.zzb;
/* 15 */                    if (zzazdVar != null) {
/* 21 */                        zzbgbVar = new zzbgb(zzazdVar, zzbdl.PROCESSED, zzaumVarArr);
                                break;
                            }
/* 29 */                    zzawu zzawuVar = zzbeqVar2.zza;
/* 31 */                    zzber zzberVar = null;
/* 32 */                    if (zzawuVar != null) {
/* 34 */                        zzawpVarZza = zzawuVar.zza(zzbkrVar);
/* 38 */                        zzatz zzatzVarZza = zzbkrVar.zza();
/* 46 */                        zzbdn zzbdnVarZzb = zzbgr.zzb(zzawpVarZza, zzatzVarZza.zzo());
/* 50 */                        if (zzbdnVarZzb != null) {
/* 60 */                            zzbgbVar = zzbdnVarZzb.zze(zzbkrVar.zzc(), zzbkrVar.zzb(), zzatzVarZza, zzaumVarArr);
                                    break;
                                }
                            } else {
/* 65 */                        zzawpVarZza = null;
                            }
/* 66 */                    Object obj = this.zzb;
                            synchronized (obj) {
                                try {
/* 69 */                            zzbeqVar = this.zzj;
/* 71 */                            if (zzbeqVar2 == zzbeqVar) {
                                        break;
                                    }
                                } finally {
                                }
                            }
/* 120 */                   if (size == 1) {
/* 126 */                       this.zzd.zzc(this.zze);
                            }
/* 131 */                   for (zzaum zzaumVar : zzaumVarArr) {
                            }
/* 149 */                   zzbeqVar2 = zzbeqVar;
                        }
                    } catch (Throwable th) {
/* 156 */               this.zzd.zzb();
/* 204 */               throw th;
                    }
                }

                @Override
                public final Runnable zzf(zzbjq zzbjqVar) {
/* 1 */             this.zzh = zzbjqVar;
/* 8 */             this.zze = new zzbel(this, zzbjqVar);
/* 15 */            this.zzf = new zzbem(this, zzbjqVar);
/* 22 */            this.zzg = new zzben(this, zzbjqVar);
/* 24 */            return null;
                }

                public final void zzl(zzawu zzawuVar) {
                    Runnable runnable;
                    synchronized (this.zzb) {
/* 10 */                this.zzj = this.zzj.zza(zzawuVar);
/* 12 */                if (zzawuVar != null && zzm()) {
/* 26 */                    ArrayList arrayList = new ArrayList(this.zzi);
/* 32 */                    ArrayList arrayList2 = new ArrayList();
/* 35 */                    int size = arrayList.size();
/* 41 */                    for (int i = 0; i < size; i++) {
/* 47 */                        zzbep zzbepVar = (zzbep) arrayList.get(i);
/* 53 */                        zzawp zzawpVarZza = zzawuVar.zza(zzbepVar.zzb);
/* 61 */                        zzatz zzatzVarZza = zzbepVar.zzb.zza();
/* 69 */                        if (zzatzVarZza.zzo() && zzawpVarZza.zzg()) {
/* 1 */                             zzbepVar.zze = zzawpVarZza.zzf();
                                }
/* 88 */                        zzbdn zzbdnVarZzb = zzbgr.zzb(zzawpVarZza, zzatzVarZza.zzo());
/* 92 */                        if (zzbdnVarZzb != null) {
/* 94 */                            Executor executorZzn = this.zzc;
/* 100 */                           if (zzatzVarZza.zzn() != null) {
/* 102 */                               executorZzn = zzatzVarZza.zzn();
                                    }
/* 106 */                           Runnable runnableZzp = zzbep.zzp(zzbepVar, zzbdnVarZzb, null);
/* 110 */                           if (runnableZzp != null) {
/* 112 */                               executorZzn.execute(runnableZzp);
                                    }
/* 115 */                           arrayList2.add(zzbepVar);
                                }
                            }
                            synchronized (this.zzb) {
                                try {
/* 128 */                           if (zzm()) {
/* 134 */                               Iterator it = arrayList2.iterator();
/* 142 */                               while (it.hasNext()) {
/* 152 */                                   this.zzi.remove((zzbep) it.next());
                                        }
/* 162 */                               if (this.zzi.isEmpty()) {
/* 169 */                                   this.zzi = new LinkedHashSet();
                                        }
/* 175 */                               if (!zzm()) {
/* 177 */                                   zzazm zzazmVar = this.zzd;
/* 181 */                                   zzazmVar.zzc(this.zzf);
/* 188 */                                   if (this.zzj.zzb != null && (runnable = this.zzg) != null) {
/* 194 */                                       zzazmVar.zzc(runnable);
/* 197 */                                       this.zzg = null;
                                            }
                                        }
/* 202 */                               this.zzd.zzb();
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }

                public final boolean zzm() {
                    boolean z;
                    synchronized (this.zzb) {
                        z = !this.zzi.isEmpty();
                    }
/* 13 */            return z;
                }

                @Override
                public final void zzr(zzazd zzazdVar) {
                    Runnable runnable;
                    synchronized (this.zzb) {
                        try {
/* 8 */                     if (this.zzj.zzb != null) {
/* 11 */                        return;
                            }
/* 20 */                    this.zzj = this.zzj.zzb(zzazdVar);
/* 22 */                    zzazm zzazmVar = this.zzd;
/* 29 */                    zzazmVar.zzc(new zzbeo(this, zzazdVar));
/* 36 */                    if (!zzm() && (runnable = this.zzg) != null) {
/* 42 */                        zzazmVar.zzc(runnable);
/* 46 */                        this.zzg = null;
                            }
/* 51 */                    this.zzd.zzb();
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }
            }
