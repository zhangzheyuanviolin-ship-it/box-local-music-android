            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.InputStream;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Random;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            
            abstract class zzbmj implements zzbdk {
                private static final zzazd zza;
                private static final Random zzb;
                private static final boolean zzc;
                static final zzaxk zze;
                static final zzaxk zzf;
                private zzblt zzA;
                private zzblt zzB;
                private long zzC;
                private zzazd zzD;
                private boolean zzE;
                private final zzaxv zzd;
                private final Executor zzg;
                private final ScheduledExecutorService zzi;
                private final zzaxq zzj;
                private final zzbmk zzk;
                private final zzbgs zzl;
                private final boolean zzm;
                private final zzbls zzo;
                private final long zzp;
                private final long zzq;
                private final zzbmi zzr;
                private zzblw zzx;
                private long zzy;
                private zzbdm zzz;
                private final Executor zzh = new zzazm(new zzbla(this));
                private final Object zzn = new Object();
                private final zzbgu zzs = new zzbgu();
                private volatile zzbly zzt = new zzbly(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
                private final AtomicBoolean zzu = new AtomicBoolean();
                private final AtomicInteger zzv = new AtomicInteger();
                private final AtomicInteger zzw = new AtomicInteger();

                static {
/* 1 */             zzaxi zzaxiVar = zzaxq.zza;
/* 9 */             zze = zzaxk.zzc("grpc-previous-rpc-attempts", zzaxiVar);
/* 17 */            zzf = zzaxk.zzc("grpc-retry-pushback-ms", zzaxiVar);
/* 27 */            zza = zzazd.zzb.zze("Stream thrown away because RetriableStream committed");
/* 34 */            zzb = new Random();
/* 43 */            zzc = zzbgr.zzf("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
                }

                public zzbmj(zzaxv zzaxvVar, zzaxq zzaxqVar, zzbls zzblsVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, zzbmk zzbmkVar, zzbgs zzbgsVar, zzbmi zzbmiVar) {
/* 77 */            this.zzd = zzaxvVar;
/* 79 */            this.zzo = zzblsVar;
/* 83 */            this.zzp = j;
/* 87 */            this.zzq = j2;
/* 91 */            this.zzg = executor;
/* 95 */            this.zzi = scheduledExecutorService;
/* 97 */            this.zzj = zzaxqVar;
/* 99 */            this.zzk = zzbmkVar;
/* 101 */           if (zzbmkVar != null) {
/* 105 */               this.zzC = zzbmkVar.zzb;
                    }
/* 107 */           this.zzl = zzbgsVar;
/* 120 */           zzgo.zzf(zzbmkVar == null || zzbgsVar == null, "Should not provide both retryPolicy and hedgingPolicy");
/* 126 */           this.zzm = zzbgsVar != null;
/* 130 */           this.zzr = zzbmiVar;
                }

                public static void zzV(zzbmj zzbmjVar, zzbmh zzbmhVar) {
/* 1 */             Runnable runnableZzaf = zzbmjVar.zzaf(zzbmhVar);
/* 5 */             if (runnableZzaf != null) {
/* 9 */                 zzbmjVar.zzg.execute(runnableZzaf);
                    }
                }

                public static void zzY(zzbmj zzbmjVar, Integer num) {
/* 1 */             if (num == null) {
/* 3 */                 return;
                    }
/* 8 */             if (num.intValue() < 0) {
/* 10 */                zzbmjVar.zzai();
/* 13 */                return;
                    }
/* 14 */            Object obj = zzbmjVar.zzn;
                    synchronized (obj) {
                        try {
/* 17 */                    zzblt zzbltVar = zzbmjVar.zzB;
/* 19 */                    if (zzbltVar == null) {
/* 22 */                        return;
                            }
/* 25 */                    Future futureZza = zzbltVar.zza();
/* 31 */                    zzblt zzbltVar2 = new zzblt(obj);
/* 34 */                    zzbmjVar.zzB = zzbltVar2;
/* 37 */                    if (futureZza != null) {
/* 40 */                        futureZza.cancel(false);
                            }
/* 61 */                    zzbltVar2.zzb(zzbmjVar.zzi.schedule(new zzblv(zzbmjVar, zzbltVar2), num.intValue(), TimeUnit.MILLISECONDS));
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
                }

                private final zzbmh zzae(int i, boolean z, boolean z2) {
                    AtomicInteger atomicInteger;
                    int i2;
/* 17 */            do {
/* 1 */                 atomicInteger = this.zzw;
/* 3 */                 i2 = atomicInteger.get();
/* 7 */                 if (i2 < 0) {
/* 9 */                     return null;
                        }
/* 17 */            } while (!atomicInteger.compareAndSet(i2, i2 + 1));
/* 21 */            zzbmh zzbmhVar = new zzbmh(i);
/* 31 */            zzbln zzblnVar = new zzbln(this, new zzblr(this, zzbmhVar));
/* 34 */            zzaxq zzaxqVar = this.zzj;
/* 38 */            zzaxq zzaxqVar2 = new zzaxq();
/* 41 */            zzaxqVar2.zze(zzaxqVar);
/* 44 */            if (i > 0) {
/* 52 */                zzaxqVar2.zzf(zze, String.valueOf(i));
                    }
/* 63 */            zzbmhVar.zza = zzp(zzaxqVar2, zzblnVar, i, z, z2);
/* 98 */            return zzbmhVar;
                }

                private final Runnable zzaf(zzbmh zzbmhVar) {
                    List list;
                    Collection collectionSingleton;
                    boolean z;
                    Future future;
                    Future future2;
                    synchronized (this.zzn) {
                        try {
/* 11 */                    if (this.zzt.zzf != null) {
/* 10 */                        return null;
                            }
/* 20 */                    Collection collection = this.zzt.zzc;
/* 22 */                    zzbly zzblyVar = this.zzt;
/* 35 */                    zzgo.zzn(zzblyVar.zzf == null, "Already committed");
/* 38 */                    List list2 = zzblyVar.zzb;
/* 48 */                    if (zzblyVar.zzc.contains(zzbmhVar)) {
/* 54 */                        list = null;
/* 50 */                        collectionSingleton = Collections.singleton(zzbmhVar);
/* 56 */                        z = true;
                            } else {
/* 60 */                        list = list2;
/* 58 */                        collectionSingleton = Collections.EMPTY_LIST;
/* 62 */                        z = false;
                            }
/* 80 */                    this.zzt = new zzbly(list, collectionSingleton, zzblyVar.zzd, zzbmhVar, zzblyVar.zzg, z, zzblyVar.zzh, zzblyVar.zze);
/* 87 */                    this.zzo.zza(-this.zzy);
/* 90 */                    zzblt zzbltVar = this.zzA;
/* 94 */                    boolean z2 = zzbltVar != null ? zzbltVar.zzc : false;
/* 97 */                    if (zzbltVar != null) {
/* 99 */                        Future futureZza = zzbltVar.zza();
/* 103 */                       this.zzA = null;
/* 105 */                       future = futureZza;
                            } else {
/* 107 */                       future = null;
                            }
/* 108 */                   zzblt zzbltVar2 = this.zzB;
/* 110 */                   if (zzbltVar2 != null) {
/* 112 */                       Future futureZza2 = zzbltVar2.zza();
/* 116 */                       this.zzB = null;
/* 118 */                       future2 = futureZza2;
                            } else {
/* 121 */                       future2 = null;
                            }
/* 127 */                   return new zzblc(this, collection, zzbmhVar, future, z2, future2);
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }

                private final void zzag(zzblq zzblqVar) {
                    Collection collection;
                    synchronized (this.zzn) {
                        try {
/* 8 */                     if (!this.zzt.zza) {
/* 14 */                        this.zzt.zzb.add(zzblqVar);
                            }
/* 22 */                    collection = this.zzt.zzc;
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 25 */            Iterator it = collection.iterator();
/* 33 */            while (it.hasNext()) {
/* 41 */                zzblqVar.zza((zzbmh) it.next());
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
                
                    if (r1 == null) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
                
                    r9 = (com.google.android.gms.internal.mlkit_genai_speech.zzazm) r9.zzh;
                    r9.zzc(r1);
                    r9.zzb();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
                
                    if (r4 != false) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
                
                    r10.zza.zzl(new com.google.android.gms.internal.mlkit_genai_speech.zzbmg(r9, r10));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
                
                    r0 = r10.zza;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
                
                    if (r9.zzt.zzf != r10) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
                
                    r9 = r9.zzD;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
                
                    r9 = com.google.android.gms.internal.mlkit_genai_speech.zzbmj.zza;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
                
                    r0.zzb(r9);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
                
                    r2 = r3.size();
                    r5 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
                
                    if (r5 >= r2) goto L59;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
                
                    r7 = (com.google.android.gms.internal.mlkit_genai_speech.zzblq) r3.get(r5);
                    r7.zza(r10);
                    r4 = r4 | (r7 instanceof com.google.android.gms.internal.mlkit_genai_speech.zzblx);
                    r7 = r9.zzt;
                    r8 = r7.zzf;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
                
                    if (r8 == null) goto L49;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
                
                    if (r8 != r10) goto L60;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
                
                    r5 = r5 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
                
                    if (r7.zzg == false) goto L62;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final void zzah(zzbmh zzbmhVar) {
                    int iMin;
/* 2 */             zzblo zzbloVar = null;
/* 3 */             int i = 0;
/* 4 */             boolean z = false;
/* 5 */             ArrayList arrayList = null;
                    while (true) {
                        synchronized (this.zzn) {
                            try {
/* 9 */                         zzbly zzblyVar = this.zzt;
/* 11 */                        zzbmh zzbmhVar2 = zzblyVar.zzf;
/* 13 */                        if (zzbmhVar2 == null || zzbmhVar2 == zzbmhVar) {
/* 24 */                            if (!zzblyVar.zzg) {
/* 28 */                                List list = zzblyVar.zzb;
/* 34 */                                if (i == list.size()) {
/* 40 */                                    this.zzt = zzblyVar.zzc(zzbmhVar);
/* 46 */                                    if (!zzn()) {
/* 49 */                                        return;
                                            } else {
/* 52 */                                        zzbloVar = new zzblo(this);
                                            }
                                        } else {
/* 100 */                                   if (zzbmhVar.zzb) {
/* 103 */                                       return;
                                            }
/* 110 */                                   iMin = Math.min(i + Barcode.FORMAT_ITF, list.size());
/* 114 */                                   if (arrayList == null) {
/* 122 */                                       arrayList = new ArrayList(list.subList(i, iMin));
                                            } else {
/* 126 */                                       arrayList.clear();
/* 133 */                                       arrayList.addAll(list.subList(i, iMin));
                                            }
                                        }
                                    }
                                }
                            } finally {
                            }
                        }
/* 170 */               i = iMin;
                    }
                }

                private final void zzai() {
                    Future future;
                    synchronized (this.zzn) {
                        try {
/* 4 */                     zzblt zzbltVar = this.zzB;
/* 6 */                     future = null;
/* 7 */                     if (zzbltVar != null) {
/* 9 */                         Future futureZza = zzbltVar.zza();
/* 13 */                        this.zzB = null;
/* 15 */                        future = futureZza;
                            }
/* 25 */                    this.zzt = this.zzt.zzb();
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 28 */            if (future != null) {
/* 31 */                future.cancel(false);
                    }
                }

                private final void zzaj(zzazd zzazdVar, zzbdl zzbdlVar, zzaxq zzaxqVar) {
/* 6 */             this.zzx = new zzblw(zzazdVar, zzbdlVar, zzaxqVar);
/* 16 */            if (this.zzw.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
/* 25 */                zzazm zzazmVar = (zzazm) this.zzh;
/* 27 */                zzazmVar.zzc(new zzblp(this, zzazdVar, zzbdlVar, zzaxqVar));
/* 30 */                zzazmVar.zzb();
                    }
                }

                private final boolean zzak(zzbly zzblyVar) {
                    return zzblyVar.zzf == null && zzblyVar.zze < this.zzl.zza && !zzblyVar.zzh;
                }

                public static long zzv(long j) {
/* 32 */            return (long) (j * (zzc ? (zzb.nextDouble() * 0.8d) + 0.4d : zzb.nextDouble()));
                }

                @Override
                public final void zza(zzbgu zzbguVar) {
                    zzbly zzblyVar;
                    synchronized (this.zzn) {
/* 8 */                 zzbguVar.zzb("closed", this.zzs);
/* 11 */                zzblyVar = this.zzt;
                    }
/* 14 */            zzbmh zzbmhVar = zzblyVar.zzf;
/* 16 */            if (zzbmhVar != null) {
/* 20 */                zzbgu zzbguVar2 = new zzbgu();
/* 25 */                zzbmhVar.zza.zza(zzbguVar2);
/* 30 */                zzbguVar.zzb("committed", zzbguVar2);
/* 33 */                return;
                    }
/* 36 */            zzbgu zzbguVar3 = new zzbgu();
/* 49 */            for (zzbmh zzbmhVar2 : zzblyVar.zzc) {
/* 59 */                zzbgu zzbguVar4 = new zzbgu();
/* 64 */                zzbmhVar2.zza.zza(zzbguVar4);
/* 67 */                zzbguVar3.zza(zzbguVar4);
                    }
/* 73 */            zzbguVar.zzb("open", zzbguVar3);
                }

                public final void zzaa(Object obj) {
/* 1 */             zzbly zzblyVar = this.zzt;
/* 5 */             if (zzblyVar.zza) {
/* 17 */                zzblyVar.zzf.zza.zzm(this.zzd.zzc(obj));
                    } else {
/* 26 */                zzag(new zzblm(this, obj));
                    }
                }

                @Override
                public final void zzb(zzazd zzazdVar) {
                    zzbmh zzbmhVar;
/* 4 */             zzbmh zzbmhVar2 = new zzbmh(0);
/* 12 */            zzbmhVar2.zza = new zzbjt();
/* 14 */            Runnable runnableZzaf = zzaf(zzbmhVar2);
/* 18 */            Object obj = this.zzn;
/* 20 */            if (runnableZzaf != null) {
                        synchronized (obj) {
/* 29 */                    this.zzt = this.zzt.zzc(zzbmhVar2);
                        }
/* 32 */                runnableZzaf.run();
/* 42 */                zzaj(zzazdVar, zzbdl.PROCESSED, new zzaxq());
/* 45 */                return;
                    }
                    synchronized (obj) {
                        try {
/* 63 */                    if (this.zzt.zzc.contains(this.zzt.zzf)) {
/* 67 */                        zzbmhVar = this.zzt.zzf;
                            } else {
/* 73 */                        this.zzD = zzazdVar;
/* 75 */                        zzbmhVar = null;
                            }
/* 76 */                    zzbly zzblyVar = this.zzt;
/* 98 */                    this.zzt = new zzbly(zzblyVar.zzb, zzblyVar.zzc, zzblyVar.zzd, zzblyVar.zzf, true, zzblyVar.zza, zzblyVar.zzh, zzblyVar.zze);
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
/* 101 */           if (zzbmhVar != null) {
/* 105 */               zzbmhVar.zza.zzb(zzazdVar);
                    }
                }

                @Override
                public final void zzc() {
/* 1 */             zzbly zzblyVar = this.zzt;
/* 5 */             if (zzblyVar.zza) {
/* 11 */                zzblyVar.zzf.zza.zzc();
                    } else {
/* 20 */                zzag(new zzblg(this));
                    }
                }

                @Override
                public final void zzd() {
/* 6 */             zzag(new zzblh(this));
                }

                @Override
                public final void zze() {
/* 6 */             zzag(new zzblk(this));
                }

                @Override
                public final void zzf(int i) {
/* 1 */             zzbly zzblyVar = this.zzt;
/* 5 */             if (zzblyVar.zza) {
/* 11 */                zzblyVar.zzf.zza.zzf(i);
                    } else {
/* 20 */                zzag(new zzbll(this, i));
                    }
                }

                @Override
                public final void zzg(zzaur zzaurVar) {
/* 6 */             zzag(new zzbld(this, zzaurVar));
                }

                @Override
                public final void zzh(zzavf zzavfVar) {
/* 6 */             zzag(new zzble(this, zzavfVar));
                }

                @Override
                public final void zzi(zzavi zzaviVar) {
/* 6 */             zzag(new zzblf(this, zzaviVar));
                }

                @Override
                public final void zzj(int i) {
/* 6 */             zzag(new zzbli(this, i));
                }

                @Override
                public final void zzk(int i) {
/* 6 */             zzag(new zzblj(this, i));
                }

                @Override
                public final void zzl(zzbdm zzbdmVar) {
                    zzblt zzbltVar;
                    zzbmi zzbmiVar;
/* 1 */             this.zzz = zzbdmVar;
/* 3 */             zzazd zzazdVarZzo = zzo();
/* 7 */             if (zzazdVarZzo != null) {
/* 9 */                 zzb(zzazdVarZzo);
/* 12 */                return;
                    }
                    synchronized (this.zzn) {
/* 25 */                this.zzt.zzb.add(new zzblx(this));
                    }
/* 30 */            zzbmh zzbmhVarZzae = zzae(0, false, false);
/* 34 */            if (zzbmhVarZzae == null) {
/* 36 */                return;
                    }
/* 39 */            if (this.zzm) {
/* 41 */                Object obj = this.zzn;
                        synchronized (obj) {
                            try {
/* 50 */                        this.zzt = this.zzt.zza(zzbmhVarZzae);
/* 58 */                        zzbltVar = null;
/* 59 */                        if (zzak(this.zzt) && ((zzbmiVar = this.zzr) == null || zzbmiVar.zza())) {
/* 76 */                            zzbltVar = new zzblt(obj);
/* 79 */                            this.zzB = zzbltVar;
                                }
                            } catch (Throwable th) {
/* 106 */                       throw th;
                            }
                        }
/* 82 */                if (zzbltVar != null) {
/* 101 */                   zzbltVar.zzb(this.zzi.schedule(new zzblv(this, zzbltVar), this.zzl.zzb, TimeUnit.NANOSECONDS));
                        }
                    }
/* 107 */           zzah(zzbmhVarZzae);
                }

                @Override
                public final void zzm(InputStream inputStream) {
/* 29 */            throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
                }

                @Override
                public final boolean zzn() {
/* 5 */             Iterator it = this.zzt.zzc.iterator();
/* 13 */            while (it.hasNext()) {
/* 27 */                if (((zzbmh) it.next()).zza.zzn()) {
/* 29 */                    return true;
                        }
                    }
/* 31 */            return false;
                }

                public abstract zzazd zzo();

                public abstract zzbdk zzp(zzaxq zzaxqVar, zzauj zzaujVar, int i, boolean z, boolean z2);

                public abstract void zzq();
            }
