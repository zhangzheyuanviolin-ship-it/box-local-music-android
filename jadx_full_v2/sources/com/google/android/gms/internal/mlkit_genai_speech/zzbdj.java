            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.nio.charset.Charset;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            final class zzbdj extends zzaue {
                private static final Logger zza = Logger.getLogger(zzbdj.class.getName());
                private static final double zzb;
                private final zzaxv zzc;
                private final Executor zzd;
                private final boolean zze;
                private final zzbda zzf;
                private final zzavb zzg;
                private zzbdd zzh;
                private final boolean zzi;
                private zzatz zzj;
                private zzbdk zzk;
                private boolean zzl;
                private boolean zzm;
                private final ScheduledExecutorService zzn;
                private zzavi zzo = zzavi.zza();
                private final zzbid zzp;

                static {
/* 21 */            "gzip".getBytes(Charset.forName("US-ASCII"));
/* 29 */            zzb = 1.0E9d;
                }

                public zzbdj(zzaxv zzaxvVar, Executor executor, zzatz zzatzVar, zzbid zzbidVar, ScheduledExecutorService scheduledExecutorService, zzbda zzbdaVar, zzavz zzavzVar) {
/* 10 */            int i = zzaus.zza;
/* 12 */            this.zzc = zzaxvVar;
/* 14 */            zzaxvVar.zzf();
/* 17 */            System.identityHashCode(this);
/* 20 */            int i2 = zzbom.zza;
/* 28 */            if (executor == zzji.zza()) {
/* 35 */                this.zzd = new zzbmq();
/* 37 */                this.zze = true;
                    } else {
/* 45 */                this.zzd = new zzbmv(executor);
/* 47 */                this.zze = false;
                    }
/* 49 */            this.zzf = zzbdaVar;
/* 55 */            this.zzg = zzavb.zzc();
/* 74 */            this.zzi = zzaxvVar.zzb() == zzaxt.UNARY || zzaxvVar.zzb() == zzaxt.SERVER_STREAMING;
/* 76 */            this.zzj = zzatzVar;
/* 78 */            this.zzp = zzbidVar;
/* 80 */            this.zzn = scheduledExecutorService;
                }

                public static void zzr(zzbdj zzbdjVar, zzaud zzaudVar, zzazd zzazdVar, zzaxq zzaxqVar) {
                    try {
/* 1 */                 zzaudVar.zza(zzazdVar, zzaxqVar);
                    } catch (RuntimeException e) {
/* 17 */                zza.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e);
                    }
                }

                private final zzavf zzs() {
/* 3 */             zzavf zzavfVarZzi = this.zzj.zzi();
/* 7 */             if (zzavfVarZzi == null) {
/* 9 */                 return null;
                    }
/* 20 */            return zzavfVarZzi;
                }

                private final void zzt(Object obj) {
/* 11 */            zzgo.zzn(this.zzk != null, "Not started");
/* 19 */            zzgo.zzn(!this.zzl, "call was cancelled");
/* 27 */            zzgo.zzn(!this.zzm, "call was half-closed");
                    try {
/* 30 */                zzbdk zzbdkVar = this.zzk;
/* 34 */                if (zzbdkVar instanceof zzbmj) {
/* 38 */                    ((zzbmj) zzbdkVar).zzaa(obj);
                        } else {
/* 52 */                    zzbdkVar.zzm(this.zzc.zzc(obj));
                        }
/* 57 */                if (this.zzi) {
/* 64 */                    return;
                        }
/* 61 */                this.zzk.zzc();
                    } catch (Error e) {
/* 75 */                this.zzk.zzb(zzazd.zzb.zze("Client sendMessage() failed with Error"));
/* 78 */                throw e;
                    } catch (RuntimeException e2) {
/* 93 */                this.zzk.zzb(zzazd.zzb.zzd(e2).zze("Failed to stream message"));
                    }
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("method", this.zzc);
/* 12 */            return zzgkVarZzb.toString();
                }

                @Override
                public final void zza(String str, Throwable th) {
/* 1 */             int i = zzbom.zza;
/* 3 */             if (str == null && th == null) {
/* 11 */                CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
/* 24 */                zza.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
/* 27 */                th = cancellationException;
                    }
/* 30 */            if (this.zzl) {
/* 76 */                return;
                    }
/* 34 */            this.zzl = true;
                    try {
/* 38 */                if (this.zzk != null) {
/* 40 */                    zzazd zzazdVar = zzazd.zzb;
/* 54 */                    zzazd zzazdVarZze = str != null ? zzazdVar.zze(str) : zzazdVar.zze("Call cancelled without message");
/* 58 */                    if (th != null) {
/* 60 */                        zzazdVarZze = zzazdVarZze.zzd(th);
                            }
/* 66 */                    this.zzk.zzb(zzazdVarZze);
                        }
/* 69 */                zzbdd zzbddVar = this.zzh;
/* 71 */                if (zzbddVar != null) {
/* 73 */                    zzbddVar.zzd();
                        }
                    } finally {
                    }
                }

                @Override
                public final void zzb() {
/* 1 */             int i = zzbom.zza;
/* 13 */            zzgo.zzn(this.zzk != null, "Not started");
/* 21 */            zzgo.zzn(!this.zzl, "call was cancelled");
/* 29 */            zzgo.zzn(!this.zzm, "call already half-closed");
/* 32 */            this.zzm = true;
/* 36 */            this.zzk.zzd();
                }

                @Override
                public final void zzc(int i) {
/* 1 */             int i2 = zzbom.zza;
/* 14 */            zzgo.zzn(this.zzk != null, "Not started");
/* 22 */            zzgo.zzf(i >= 0, "Number requested must be non-negative");
/* 27 */            this.zzk.zzf(i);
                }

                @Override
                public final void zzd(Object obj) {
/* 1 */             int i = zzbom.zza;
/* 3 */             zzt(obj);
                }

                @Override
                public final void zze(zzaud zzaudVar, zzaxq zzaxqVar) {
                    zzbdk zzbicVar;
/* 1 */             int i = zzbom.zza;
/* 14 */            zzgo.zzn(this.zzk == null, "Already started");
/* 22 */            zzgo.zzn(!this.zzl, "call was cancelled");
/* 27 */            zzgo.zzc(zzaudVar, "observer");
/* 32 */            zzgo.zzc(zzaxqVar, "headers");
/* 35 */            zzavb zzavbVar = this.zzg;
/* 37 */            zzatz zzatzVar = this.zzj;
/* 39 */            zzatx zzatxVar = zzbjm.zza;
/* 45 */            zzbjm zzbjmVar = (zzbjm) zzatzVar.zzl(zzatxVar);
/* 47 */            if (zzbjmVar != null) {
/* 51 */                Long l = zzbjmVar.zzb;
/* 53 */                if (l != null) {
/* 61 */                    zzavf zzavfVarZzc = zzavf.zzc(l.longValue(), TimeUnit.NANOSECONDS);
/* 67 */                    zzavf zzavfVarZzi = this.zzj.zzi();
/* 71 */                    if (zzavfVarZzi == null || zzavfVarZzc.compareTo(zzavfVarZzi) < 0) {
/* 85 */                        this.zzj = this.zzj.zza(zzavfVarZzc);
                            }
                        }
/* 87 */                Boolean bool = zzbjmVar.zzc;
/* 89 */                if (bool != null) {
/* 91 */                    boolean zBooleanValue = bool.booleanValue();
/* 95 */                    zzatz zzatzVar2 = this.zzj;
/* 108 */                   this.zzj = zBooleanValue ? zzatzVar2.zzg() : zzatzVar2.zzh();
                        }
/* 110 */               Integer num = zzbjmVar.zzd;
/* 112 */               if (num != null) {
/* 116 */                   Integer numZzj = this.zzj.zzj();
/* 120 */                   zzatz zzatzVar3 = this.zzj;
/* 122 */                   if (numZzj != null) {
/* 140 */                       this.zzj = zzatzVar3.zzc(Math.min(numZzj.intValue(), num.intValue()));
                            } else {
/* 151 */                       this.zzj = zzatzVar3.zzc(num.intValue());
                            }
                        }
/* 153 */               Integer num2 = zzbjmVar.zze;
/* 155 */               if (num2 != null) {
/* 159 */                   Integer numZzk = this.zzj.zzk();
/* 163 */                   zzatz zzatzVar4 = this.zzj;
/* 165 */                   if (numZzk != null) {
/* 183 */                       this.zzj = zzatzVar4.zzd(Math.min(numZzk.intValue(), num2.intValue()));
                            } else {
/* 194 */                       this.zzj = zzatzVar4.zzd(num2.intValue());
                            }
                        }
                    }
/* 196 */           zzauq zzauqVar = zzaup.zza;
/* 198 */           zzavi zzaviVar = this.zzo;
/* 202 */           zzaxqVar.zzd(zzbgr.zzf);
/* 207 */           zzaxqVar.zzd(zzbgr.zzb);
/* 210 */           zzaxk zzaxkVar = zzbgr.zzc;
/* 212 */           zzaxqVar.zzd(zzaxkVar);
/* 215 */           byte[] bArrZza = zzawb.zza(zzaviVar);
/* 220 */           if (bArrZza.length != 0) {
/* 222 */               zzaxqVar.zzf(zzaxkVar, bArrZza);
                    }
/* 227 */           zzaxqVar.zzd(zzbgr.zzd);
/* 232 */           zzaxqVar.zzd(zzbgr.zze);
/* 235 */           zzavf zzavfVarZzs = zzs();
/* 250 */           boolean z = zzavfVarZzs != null && zzavfVarZzs.equals(null);
/* 253 */           zzbdd zzbddVar = new zzbdd(this, zzavfVarZzs, z);
/* 256 */           this.zzh = zzbddVar;
/* 258 */           if (zzavfVarZzs == null || zzbddVar.zzd > 0) {
/* 349 */               zzbgs zzbgsVar = null;
/* 350 */               zzbid zzbidVar = this.zzp;
/* 352 */               zzaxv zzaxvVar = this.zzc;
/* 354 */               zzatz zzatzVar5 = this.zzj;
/* 356 */               zzbjd zzbjdVar = zzbidVar.zzb;
/* 362 */               if (zzbjdVar.zzac) {
/* 395 */                   zzbjm zzbjmVar2 = (zzbjm) zzatzVar5.zzl(zzatxVar);
/* 401 */                   zzbmk zzbmkVar = zzbjmVar2 == null ? null : zzbjmVar2.zzf;
/* 404 */                   if (zzbjmVar2 != null) {
/* 408 */                       zzbgsVar = zzbjmVar2.zzg;
                            }
/* 414 */                   zzbicVar = new zzbic(zzbidVar, zzaxvVar, zzaxqVar, zzatzVar5, zzbmkVar, zzbgsVar, zzavbVar);
                        } else {
/* 364 */                   zzaum[] zzaumVarArrZzg = zzbgr.zzg(zzatzVar5, zzaxqVar, 0, false, false);
/* 368 */                   zzavb zzavbVarZzb = zzavbVar.zzb();
                            try {
/* 376 */                       zzbdk zzbdkVarZze = zzbjdVar.zzK.zze(zzaxvVar, zzaxqVar, zzatzVar5, zzaumVarArrZzg);
/* 380 */                       zzavbVar.zzf(zzavbVarZzb);
/* 383 */                       zzbicVar = zzbdkVarZze;
                            } catch (Throwable th) {
/* 387 */                       zzavbVar.zzf(zzavbVarZzb);
/* 390 */                       throw th;
                            }
                        }
/* 418 */               this.zzk = zzbicVar;
                    } else {
/* 272 */               zzaum[] zzaumVarArrZzg2 = zzbgr.zzg(this.zzj, zzaxqVar, 0, false, false);
/* 281 */               String str = true != z ? "CallOptions" : "Context";
/* 291 */               Long l2 = (Long) this.zzj.zzl(zzaum.zza);
/* 1 */                 double d = this.zzh.zzd;
/* 300 */               double d2 = zzb;
/* 343 */               zzbicVar = new zzbgb(zzazd.zzd.zze(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(d / d2), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d2))), zzbdl.PROCESSED, zzaumVarArrZzg2);
/* 346 */               this.zzk = zzbicVar;
                    }
/* 422 */           if (this.zze) {
/* 424 */               zzbicVar.zze();
                    }
/* 433 */           if (this.zzj.zzj() != null) {
/* 447 */               this.zzk.zzj(this.zzj.zzj().intValue());
                    }
/* 456 */           if (this.zzj.zzk() != null) {
/* 470 */               this.zzk.zzk(this.zzj.zzk().intValue());
                    }
/* 473 */           if (zzavfVarZzs != null) {
/* 477 */               this.zzk.zzh(zzavfVarZzs);
                    }
/* 482 */           this.zzk.zzg(zzauqVar);
/* 489 */           this.zzk.zzi(this.zzo);
/* 494 */           this.zzf.zzb();
/* 504 */           this.zzk.zzl(new zzbdi(this, zzaudVar));
/* 509 */           this.zzh.zzc();
                }

                @Override
                public final boolean zzf() {
/* 3 */             if (this.zzm) {
/* 5 */                 return false;
                    }
/* 9 */             return this.zzk.zzn();
                }

                public final zzbdj zzn(zzavi zzaviVar) {
/* 1 */             this.zzo = zzaviVar;
/* 29 */            return this;
                }
            }
