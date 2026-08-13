            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.ComponentName;
            import android.content.Context;
            import android.os.Binder;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Process;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class zzbam extends zzbat implements zzbdr, zzbac {
                private final zzbju zzf;
                private final Executor zzg;
                private final zzbab zzh;
                private final zzbad zzi;
                private final AtomicInteger zzj;
                private final long zzk;
                private final zzbcb zzl;
                private final boolean zzm;
                private zzbjq zzn;
                private int zzo;
                private ScheduledFuture zzp;
                private final zzbak zzq;

                /* JADX WARN: Illegal instructions before constructor call */
                /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.mlkit_genai_speech.zzbah] */
                public zzbam(zzbap zzbapVar, zzazq zzazqVar, zzbdo zzbdoVar) {
/* 1 */             zzbju zzbjuVar = zzbapVar.zzd;
/* 3 */             zzatu zzatuVarZza = zzbdoVar.zza();
/* 7 */             Context context = zzbapVar.zza;
/* 9 */             zzazy zzazyVar = zzbapVar.zzh;
/* 11 */            zzatr zzatrVarZza = zzatu.zza();
/* 19 */            zzatrVarZza.zzb(zzbgj.zza, zzayv.NONE);
/* 24 */            zzatrVarZza.zzb(zzbgj.zzb, zzatuVarZza);
/* 42 */            zzatrVarZza.zzb(zzavn.zzb, zzazq.zzc(new ComponentName(context, context.getClass())));
/* 47 */            zzatrVarZza.zzb(zzavn.zza, zzazqVar);
/* 52 */            zzatrVarZza.zzb(zzbat.zzb, zzazyVar);
/* 98 */            super(zzbjuVar, zzatrVarZza.zzc(), zzbapVar.zzk, zzawd.zzb(zzbam.class, zzbapVar.zza.getClass().getSimpleName() + "->" + String.valueOf(zzazqVar)));
/* 103 */           this.zzo = 1001;
/* 105 */           zzbju zzbjuVar2 = zzbapVar.zze;
/* 107 */           this.zzf = zzbjuVar2;
/* 111 */           this.zzh = zzbapVar.zzf;
/* 119 */           this.zzg = (Executor) zzbjuVar2.zza();
/* 124 */           this.zzk = 60000L;
/* 136 */           Boolean bool = (Boolean) zzbdoVar.zza().zzc(zzazr.zzc);
/* 146 */           this.zzm = bool != null ? bool.booleanValue() : false;
/* 154 */           this.zzq = new zzbak(this, null);
/* 161 */           this.zzj = new AtomicInteger();
/* 177 */           this.zzl = new zzbcb(zzgx.zza(), new Object(this) {
                    });
/* 205 */           this.zzi = new zzbcf(zzbapVar.zzc, zzbapVar.zza, zzbapVar.zzb, zzazqVar.zza(), zzazqVar.zzb(), zzbapVar.zzg.zza(), this);
                }

                private final ListenableFuture zzI(final int i) {
/* 1 */             zzbab zzbabVar = this.zzh;
                    return zzbabVar instanceof zzazs ? ((zzazs) zzbabVar).zzb(i) : zzja.zza(new Callable() {
                        @Override
                        public final Object call() {
/* 3 */                     return this.zza.zzh.zza(i);
                        }
                    }, this.zzg);
                }

                private static zzbdk zzJ(zzazd zzazdVar, zzatu zzatuVar, zzaxq zzaxqVar, zzaum[] zzaumVarArr) {
/* 5 */             zzbng.zza(zzaumVarArr, zzatuVar, zzaxqVar).zzd();
/* 12 */            return new zzbgb(zzazdVar, zzbdl.PROCESSED, zzaumVarArr);
                }

                private final synchronized void zzK(zzazd zzazdVar) {
/* 7 */             if (zzH(2)) {
/* 14 */                if (!zzazdVar.zzj()) {
/* 17 */                    zzA(zzazdVar, true);
/* 21 */                    return;
                        }
/* 26 */                zzbam zzbamVar = this.zzq.zza;
/* 29 */                zzbamVar.zzG(3);
/* 32 */                zzbjq zzbjqVar = zzbamVar.zzn;
/* 34 */                zzatu zzatuVar = zzbamVar.zzd;
/* 36 */                zzbjqVar.zza(zzatuVar);
/* 39 */                zzbamVar.zzd = zzatuVar;
/* 43 */                zzbamVar.zzn.zze();
/* 46 */                ScheduledFuture scheduledFuture = zzbamVar.zzp;
/* 48 */                if (scheduledFuture != null) {
/* 51 */                    scheduledFuture.cancel(false);
/* 55 */                    zzbamVar.zzp = null;
                        }
                    }
                }

                private final synchronized void zzL(Throwable th) {
/* 15 */            zzA(zzazd.zzi.zze("Could not evaluate SecurityPolicy").zzd(th), true);
                }

                private final synchronized void zzM(zzazd zzazdVar) {
/* 7 */             if (zzH(2)) {
/* 15 */                if (zzazdVar.zzj()) {
/* 27 */                    this.zzi.zzb();
                        } else {
/* 18 */                    zzA(zzazdVar, true);
                        }
                    }
                }

                private final synchronized void zzN() {
/* 9 */             if (zzH(2)) {
/* 12 */                this.zzp = null;
/* 14 */                long j = this.zzk;
/* 40 */                zzA(zzazd.zzd.zze("Connect timeout " + j + "ms lapsed"), true);
                    }
                }

                private final synchronized void zzO() {
                    try {
/* 7 */                 if (zzH(1)) {
/* 12 */                    zzG(2);
                            try {
/* 15 */                        boolean z = this.zzm;
/* 17 */                        zzbad zzbadVar = this.zzi;
/* 19 */                        if (z) {
/* 29 */                            ListenableFuture listenableFutureZzI = zzI(zzbadVar.zza().applicationInfo.uid);
/* 33 */                            zzu(listenableFutureZzI);
/* 43 */                            zzja.zzb(listenableFutureZzI, new zzbai(this), this.zzg);
                                } else {
/* 51 */                            zzbadVar.zzb();
                                }
/* 71 */                        this.zzp = zzv().schedule(new Runnable() {
                                    @Override
                                    public final void run() {
/* 1 */                                 this.zza.zzN();
                                    }
                                }, this.zzk, TimeUnit.MILLISECONDS);
                            } catch (zzaze e) {
/* 79 */                        zzA(e.zza(), true);
                            }
                        }
                    } catch (Throwable th) {
/* 110 */               throw th;
                    }
                }

                public static void zzi(zzbam zzbamVar, int i) {
/* 1 */             ListenableFuture listenableFutureZzI = zzbamVar.zzI(i);
/* 5 */             zzbamVar.zzu(listenableFutureZzI);
/* 15 */            zzja.zzb(listenableFutureZzI, new zzbaj(zzbamVar), zzbamVar.zzg);
                }

                @Override
                public final synchronized void zza(IBinder iBinder) {
/* 12 */            this.zzq.zza.zzy(zzbbv.zzb(iBinder, this.zzg));
                }

                @Override
                public final synchronized void zzb(zzazd zzazdVar) {
/* 3 */             zzA(zzazdVar, true);
                }

                @Override
                public final synchronized zzbdk zze(zzaxv zzaxvVar, zzaxq zzaxqVar, zzatz zzatzVar, zzaum[] zzaumVarArr) throws Throwable {
                    Throwable th;
                    zzbam zzbamVar;
                    try {
                        try {
                            try {
/* 7 */                         if (!zzH(3)) {
/* 33 */                            return zzJ(zzE() ? this.zze : zzazd.zzi.zze("newStream() before transportReady()"), this.zzd, zzaxqVar, zzaumVarArr);
                                }
/* 39 */                        int i = this.zzo;
/* 41 */                        int i2 = i + 1;
/* 43 */                        this.zzo = i2;
/* 48 */                        if (i2 == 16777215) {
/* 52 */                            this.zzo = 1001;
                                }
/* 56 */                        zzbng zzbngVarZza = zzbng.zza(zzaumVarArr, this.zzd, zzaxqVar);
/* 78 */                        zzbax zzbaxVar = new zzbax(this, this.zzd, i, !Boolean.TRUE.equals(zzatzVar.zzl(zzbgr.zzh)));
/* 91 */                        if (this.zzc.putIfAbsent(Integer.valueOf(i), zzbaxVar) != null) {
/* 97 */                            zzazd zzazdVarZze = zzazd.zzi.zze("Clashing call IDs");
/* 101 */                           zzA(zzazdVarZze, true);
/* 106 */                           return zzJ(zzazdVarZze, this.zzd, zzaxqVar, zzaumVarArr);
                                }
/* 116 */                       if (zzbaxVar.zze() && this.zzj.getAndIncrement() == 0) {
/* 128 */                           this.zzn.zzd(true);
                                }
/* 136 */                       zzbbw zzbbwVar = new zzbbw(this, i, zzaxvVar, zzaxqVar, zzbngVarZza);
/* 147 */                       if (zzaxvVar.zzb().zza()) {
/* 153 */                           return new zzbcg(zzbaxVar, zzbbwVar, this.zzd);
                                }
/* 165 */                       return new zzbbq(zzbaxVar, zzbbwVar, this.zzd);
                            } catch (Throwable th2) {
/* 19 */                        th = th2;
/* 20 */                        zzbamVar = this;
/* 204 */                       throw th;
                            }
                        } catch (Throwable th3) {
/* 170 */                   th = th3;
/* 171 */                   zzbamVar = this;
/* 159 */                   th = th;
/* 204 */                   throw th;
                        }
                    } catch (Throwable th4) {
/* 158 */               th = th4;
                    }
                }

                @Override
                public final synchronized Runnable zzf(zzbjq zzbjqVar) {
/* 2 */             this.zzn = zzbjqVar;
/* 6 */             return new Runnable() {
                        @Override
                        public final void run() {
/* 1 */                     this.zza.zzO();
                        }
                    };
                }

                @Override
                public final void zzm(Parcel parcel) {
/* 7 */             this.zzl.zza(parcel.readInt());
                }

                @Override
                public final void zzn(Parcel parcel) {
/* 6 */             if (zzH(2)) {
/* 14 */                if (parcel.readInt() != 1) {
/* 24 */                    zzA(zzazd.zzj.zze("Wire format version mismatch"), true);
/* 27 */                    return;
                        }
/* 28 */                IBinder strongBinder = parcel.readStrongBinder();
/* 32 */                if (strongBinder == null) {
/* 42 */                    zzA(zzazd.zzj.zze("Malformed SETUP_TRANSPORT data"), true);
/* 45 */                    return;
                        }
/* 56 */                if (!zzF(zzbbv.zzb(strongBinder, this.zzg))) {
/* 66 */                    zzA(zzazd.zzj.zze("Failed to observe outgoing binder"), true);
/* 69 */                    return;
                        }
/* 72 */                zzbam zzbamVar = this.zzq.zza;
/* 74 */                int callingUid = Binder.getCallingUid();
/* 78 */                zzbamVar.zzw(callingUid);
/* 83 */                zzatr zzatrVarZzb = zzbamVar.zzd.zzb();
/* 93 */                zzatrVarZzb.zzb(zzbat.zza, Integer.valueOf(callingUid));
/* 109 */               zzatrVarZzb.zzb(zzbgj.zza, callingUid == Process.myUid() ? zzayv.PRIVACY_AND_INTEGRITY : zzayv.INTEGRITY);
/* 116 */               zzbamVar.zzd = zzatrVarZzb.zzc();
/* 118 */               zzi(zzbamVar, callingUid);
                    }
                }

                @Override
                public final void zzo(zzazd zzazdVar) {
/* 5 */             this.zzn.zzf(zzazdVar, zzbnf.UNKNOWN);
                }

                @Override
                public final void zzp() {
/* 8 */             if (this.zzj.getAndSet(0) > 0) {
/* 12 */                this.zzn.zzd(false);
                    }
/* 15 */            ScheduledFuture scheduledFuture = this.zzp;
/* 17 */            if (scheduledFuture != null) {
/* 19 */                scheduledFuture.cancel(false);
/* 23 */                this.zzp = null;
                    }
/* 31 */            ((zzbcf) this.zzi).zze(zzazd.zzb);
/* 36 */            this.zzn.zzg();
                }

                @Override
                public final void zzq() {
/* 1 */             super.zzq();
/* 8 */             this.zzf.zzb(this.zzg);
                }

                @Override
                public final synchronized void zzr(zzazd zzazdVar) {
/* 4 */             zzgo.zzc(zzazdVar, "reason");
/* 8 */             zzA(zzazdVar, false);
                }

                @Override
                public final void zzs(zzbbb zzbbbVar) {
/* 5 */             if (zzbbbVar.zze() && this.zzj.decrementAndGet() == 0) {
/* 18 */                this.zzn.zzd(false);
                    }
/* 23 */            zzB(zzbbbVar.zzc);
                }
            }
