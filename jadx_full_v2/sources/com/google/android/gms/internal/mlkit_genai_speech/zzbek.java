            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.logging.Logger;
            
/* 18 */    public class zzbek extends zzaue {
                private static final zzaue zza;
                private final ScheduledFuture zzb;
                private final Executor zzc;
                private final zzavb zzd;
                private volatile boolean zze;
                private zzaud zzf;
                private zzaxq zzg;
                private zzaue zzh;
                private zzazd zzi;
                private List zzj = new ArrayList();
                private zzbej zzk;

                static {
/* 7 */             Logger.getLogger(zzbek.class.getName());
/* 15 */            zza = new zzbed();
                }

                public zzbek(Executor executor, ScheduledExecutorService scheduledExecutorService, zzavf zzavfVar) {
                    ScheduledFuture<?> scheduledFutureSchedule;
/* 13 */            zzgo.zzc(executor, "callExecutor");
/* 16 */            this.zzc = executor;
/* 20 */            zzgo.zzc(scheduledExecutorService, "scheduler");
/* 27 */            this.zzd = zzavb.zzc();
/* 29 */            if (zzavfVar != null) {
/* 31 */                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
/* 33 */                long jZzb = zzavfVar.zzb(timeUnit);
/* 44 */                scheduledFutureSchedule = scheduledExecutorService.schedule(new zzbdx(this, jZzb, "CallOptions"), jZzb, timeUnit);
                    } else {
/* 49 */                scheduledFutureSchedule = null;
                    }
/* 50 */            this.zzb = scheduledFutureSchedule;
                }

                private final void zzn(zzazd zzazdVar, boolean z) {
                    zzaud zzaudVar;
                    boolean z2;
                    synchronized (this) {
                        try {
/* 4 */                     if (this.zzh == null) {
/* 8 */                         zzr(zza);
/* 11 */                        zzaudVar = this.zzf;
/* 13 */                        this.zzi = zzazdVar;
/* 15 */                        z2 = false;
                            } else {
/* 19 */                        if (z) {
/* 58 */                            return;
                                }
/* 21 */                        zzaudVar = null;
/* 22 */                        z2 = true;
                            }
/* 24 */                    if (z2) {
/* 31 */                        zzo(new zzbdz(this, zzazdVar));
                            } else {
/* 35 */                        if (zzaudVar != null) {
/* 44 */                            this.zzc.execute(new zzbee(this, zzaudVar, zzazdVar));
                                }
/* 47 */                        zzq(zzaudVar);
/* 50 */                        zzp();
                            }
/* 53 */                    zzm();
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
                }

                private final void zzo(Runnable runnable) {
                    synchronized (this) {
                        try {
/* 4 */                     if (this.zze) {
/* 16 */                        runnable.run();
                            } else {
/* 8 */                         this.zzj.add(runnable);
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
                
                    r0 = r1.iterator();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
                
                    if (r0.hasNext() == false) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
                
                    ((java.lang.Runnable) r0.next()).run();
                 */
                /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final void zzp() {
                    zzbej zzbejVar;
                    List list;
/* 3 */             List arrayList = new ArrayList();
                    while (true) {
                        synchronized (this) {
/* 13 */                    if (this.zzj.isEmpty()) {
                                break;
                            }
/* 39 */                    list = this.zzj;
/* 41 */                    this.zzj = arrayList;
                        }
/* 24 */                if (zzbejVar == null) {
/* 33 */                    this.zzc.execute(new zzbdy(this, zzbejVar));
/* 36 */                    return;
                        }
/* 36 */                return;
/* 64 */                list.clear();
/* 67 */                arrayList = list;
                    }
/* 16 */            this.zzj = null;
/* 19 */            this.zze = true;
/* 21 */            zzbejVar = this.zzk;
/* 24 */            if (zzbejVar == null) {
                    }
                }

                private final void zzq(final zzaud zzaudVar) {
/* 1 */             final zzaxq zzaxqVar = this.zzg;
/* 4 */             this.zzg = null;
/* 8 */             Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
/* 3 */                     this.zza.zzh.zze(zzaudVar, zzaxqVar);
                        }
                    };
/* 11 */            zzavb zzavbVar = this.zzd;
/* 13 */            zzavb zzavbVarZzb = zzavbVar.zzb();
                    try {
/* 17 */                runnable.run();
                    } finally {
/* 25 */                zzavbVar.zzf(zzavbVarZzb);
                    }
                }

                private final void zzr(zzaue zzaueVar) {
/* 1 */             zzaue zzaueVar2 = this.zzh;
/* 11 */            zzgo.zzo(zzaueVar2 == null, "realCall already set to %s", zzaueVar2);
/* 14 */            ScheduledFuture scheduledFuture = this.zzb;
/* 16 */            if (scheduledFuture != null) {
/* 18 */                scheduledFuture.cancel(false);
                    }
/* 21 */            this.zzh = zzaueVar;
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("realCall", this.zzh);
/* 12 */            return zzgkVarZzb.toString();
                }

                @Override
                public final void zza(String str, Throwable th) {
/* 1 */             zzazd zzazdVar = zzazd.zzb;
/* 12 */            zzazd zzazdVarZze = str != null ? zzazdVar.zze(str) : zzazdVar.zze("Call cancelled without message");
/* 16 */            if (th != null) {
/* 18 */                zzazdVarZze = zzazdVarZze.zzd(th);
                    }
/* 23 */            zzn(zzazdVarZze, false);
                }

                @Override
                public final void zzb() {
/* 6 */             zzo(new zzbec(this));
                }

                @Override
                public final void zzc(int i) {
/* 3 */             if (this.zze) {
/* 7 */                 this.zzh.zzc(i);
                    } else {
/* 16 */                zzo(new zzbeb(this, i));
                    }
                }

                @Override
                public final void zzd(Object obj) {
/* 3 */             if (this.zze) {
/* 7 */                 this.zzh.zzd(obj);
                    } else {
/* 16 */                zzo(new zzbea(this, obj));
                    }
                }

                @Override
                public final void zze(zzaud zzaudVar, zzaxq zzaxqVar) {
                    zzazd zzazdVar;
                    boolean z;
/* 3 */             zzgo.zzc(zzaxqVar, "headers");
/* 15 */            zzgo.zzn(this.zzf == null, "already started");
                    synchronized (this) {
                        try {
/* 21 */                    zzgo.zzc(zzaudVar, "listener");
/* 24 */                    this.zzf = zzaudVar;
/* 26 */                    zzazdVar = this.zzi;
/* 28 */                    z = this.zze;
/* 30 */                    if (!z) {
/* 34 */                        zzbej zzbejVar = new zzbej(zzaudVar);
/* 37 */                        this.zzk = zzbejVar;
/* 39 */                        this.zzg = zzaxqVar;
/* 41 */                        zzaudVar = zzbejVar;
                            }
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
/* 46 */            if (zzazdVar != null) {
/* 55 */                this.zzc.execute(new zzbee(this, zzaudVar, zzazdVar));
                    } else if (z) {
/* 63 */                this.zzh.zze(zzaudVar, zzaxqVar);
                    }
                }

                @Override
                public final boolean zzf() {
/* 3 */             if (this.zze) {
/* 7 */                 return this.zzh.zzf();
                    }
/* 12 */            return false;
                }

                public final Runnable zzi(zzaue zzaueVar) {
                    synchronized (this) {
                        try {
/* 5 */                     if (this.zzh == null) {
/* 11 */                        zzr(zzaueVar);
/* 14 */                        zzbej zzbejVar = this.zzk;
/* 16 */                        if (zzbejVar != null) {
/* 26 */                            zzq(zzbejVar);
/* 33 */                            return new zzbdw(this, this.zzd);
                                }
/* 18 */                        this.zzj = null;
/* 21 */                        this.zze = true;
                            }
/* 4 */                     return null;
                        } finally {
                        }
                    }
                }

/* 19 */        public void zzm() {
                }
            }
