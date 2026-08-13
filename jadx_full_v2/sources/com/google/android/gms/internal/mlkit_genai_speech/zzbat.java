            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.os.DeadObjectException;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.TransactionTooLargeException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.NoSuchElementException;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.Oi010OO0;
            
/* 27 */    public abstract class zzbat implements IBinder.DeathRecipient {
                protected zzatu zzd;
                protected zzazd zze;
                private final zzbju zzg;
                private final ScheduledExecutorService zzh;
                private final zzawd zzi;
                private zzbbv zzm;
                private long zzo;
                private long zzp;
                private static final Logger zzf = Logger.getLogger(zzbat.class.getName());
                public static final zzats zza = zzats.zza("internal:remote-uid");
                public static final zzats zzb = zzats.zza("internal:inbound-parcelable-policy");
                private final LinkedHashSet zzk = new LinkedHashSet();
                private final List zzl = new ArrayList();
                private int zzq = 1;
                private final zzbbn zzj = new zzbbn(new zzbbm() {
                    @Override
                    public final boolean zza(int i, Parcel parcel) {
/* 3 */                 return this.zza.zzC(i, parcel);
                    }
                });
                protected final ConcurrentHashMap zzc = new ConcurrentHashMap();
                private final zzbaw zzn = new zzbaw(131072);

                public zzbat(zzbju zzbjuVar, zzatu zzatuVar, zzbbr zzbbrVar, zzawd zzawdVar) {
/* 21 */            this.zzg = zzbjuVar;
/* 23 */            this.zzd = zzatuVar;
/* 25 */            this.zzi = zzawdVar;
/* 33 */            this.zzh = (ScheduledExecutorService) zzbjuVar.zza();
                }

                private static zzazd zza(RemoteException remoteException) {
                    return ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) ? zzazd.zzj.zzd(remoteException) : zzazd.zzi.zzd(remoteException);
                }

                private final void zzb() {
/* 1 */             zzbbv zzbbvVar = this.zzm;
/* 3 */             if (zzbbvVar != null) {
                        try {
/* 8 */                     zzbbvVar.zza.unlinkToDeath(this, 0);
                        } catch (NoSuchElementException unused) {
                        }
                        try {
/* 11 */                    zzbbz zzbbzVarZzc = zzbbz.zzc();
                            try {
/* 19 */                        zzbbzVarZzc.zza().writeInt(0);
/* 25 */                        this.zzm.zza(2, zzbbzVarZzc);
/* 28 */                        zzbbzVarZzc.close();
                            } finally {
                            }
                        } catch (RemoteException unused2) {
                        }
                    }
                }

                @Override
                public final synchronized void binderDied() {
/* 11 */            zzA(zzazd.zzj.zze("Peer process crashed, exited or was killed (binderDied)"), true);
                }

                public final void zzA(final zzazd zzazdVar, boolean z) {
/* 5 */             if (!zzE()) {
/* 7 */                 this.zze = zzazdVar;
/* 10 */                zzG(4);
/* 13 */                zzo(zzazdVar);
                    }
/* 21 */            if (zzH(5)) {
/* 106 */               return;
                    }
/* 23 */            if (z || this.zzc.isEmpty()) {
/* 36 */                this.zzj.zzb(null);
/* 39 */                zzG(5);
/* 42 */                zzb();
/* 45 */                ConcurrentHashMap concurrentHashMap = this.zzc;
/* 53 */                final ArrayList arrayList = new ArrayList(concurrentHashMap.values());
/* 56 */                concurrentHashMap.clear();
/* 59 */                List list = this.zzl;
/* 63 */                final ArrayList arrayList2 = new ArrayList(list);
/* 66 */                list.clear();
/* 76 */                this.zzh.execute(new Runnable() {
                            @Override
                            public final void run() {
/* 1 */                         zzazd zzazdVar2 = zzazdVar;
/* 3 */                         ArrayList arrayList3 = arrayList;
/* 5 */                         int size = arrayList3.size();
/* 11 */                        for (int i = 0; i < size; i++) {
/* 17 */                            zzbbb zzbbbVar = (zzbbb) arrayList3.get(i);
                                    synchronized (zzbbbVar) {
/* 20 */                                zzbbbVar.zzg(zzazdVar2);
                                    }
                                }
/* 30 */                        ArrayList arrayList4 = arrayList2;
/* 32 */                        int size2 = arrayList4.size();
/* 37 */                        for (int i2 = 0; i2 < size2; i2++) {
/* 45 */                            ((Future) arrayList4.get(i2)).cancel(false);
                                }
/* 51 */                        zzbat zzbatVar = this.zza;
                                synchronized (zzbatVar) {
/* 54 */                            zzbatVar.zzp();
                                }
/* 58 */                        zzbatVar.zzq();
                            }
                        });
                    }
                }

                public final void zzB(int i) {
/* 1 */             ConcurrentHashMap concurrentHashMap = this.zzc;
/* 11 */            if (concurrentHashMap.remove(Integer.valueOf(i)) == null || !concurrentHashMap.isEmpty()) {
/* 29 */                return;
                    }
/* 26 */            this.zzh.execute(new Runnable() {
                        @Override
                        public final void run() {
/* 1 */                     zzbat zzbatVar = this.zza;
                            synchronized (zzbatVar) {
                                try {
/* 9 */                             if (zzbatVar.zzH(4)) {
/* 14 */                                zzbatVar.zzA(zzbatVar.zze, true);
                                    }
                                } catch (Throwable th) {
/* 55 */                            throw th;
                                }
                            }
                        }
                    });
                }

                public final boolean zzC(int i, Parcel parcel) {
                    zzbbz zzbbzVarZzc;
                    try {
/* 6 */                 if (i < 1001) {
                            synchronized (this) {
                                try {
/* 9 */                             if (i == 1) {
/* 163 */                               zzn(parcel);
                                    } else if (i == 2) {
/* 159 */                               zzA(zzazd.zzj.zze("transport shutdown by peer"), true);
                                    } else if (i == 3) {
/* 82 */                                if (this.zzn.zza(parcel.readLong())) {
/* 102 */                                   zzf.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(toString()));
/* 105 */                                   LinkedHashSet linkedHashSet = this.zzk;
/* 107 */                                   ConcurrentHashMap concurrentHashMap = this.zzc;
/* 113 */                                   linkedHashSet.addAll(concurrentHashMap.keySet());
/* 116 */                                   Iterator it = linkedHashSet.iterator();
/* 124 */                                   while (zzD() && it.hasNext()) {
/* 140 */                                       zzbbb zzbbbVar = (zzbbb) concurrentHashMap.get(it.next());
/* 142 */                                       it.remove();
/* 145 */                                       if (zzbbbVar != null) {
/* 147 */                                           zzbbbVar.zzm();
                                                }
                                            }
                                        }
                                    } else if (i == 4) {
/* 33 */                                int i2 = parcel.readInt();
/* 39 */                                if (this.zzq == 3) {
                                            try {
/* 41 */                                        zzbbzVarZzc = zzbbz.zzc();
                                                try {
/* 49 */                                            zzbbzVarZzc.zza().writeInt(i2);
/* 54 */                                            this.zzm.zza(5, zzbbzVarZzc);
/* 57 */                                            zzbbzVarZzc.close();
                                                } finally {
                                                }
                                            } catch (RemoteException unused) {
                                            }
                                        }
                                    } else {
/* 20 */                                if (i != 5) {
/* 3 */                                     return false;
                                        }
/* 28 */                                zzm(parcel);
                                    }
                                } finally {
                                }
                            }
                        } else {
/* 176 */                   int iDataSize = parcel.dataSize();
/* 190 */                   zzbbb zzbbbVar2 = (zzbbb) this.zzc.get(Integer.valueOf(i));
/* 193 */                   if (zzbbbVar2 == null) {
                                synchronized (this) {
                                }
/* 197 */                       zzbbbVar2 = null;
                            }
/* 203 */                   if (zzbbbVar2 != null) {
/* 205 */                       zzbbbVar2.zzj(parcel);
                            }
/* 211 */                   long j = this.zzo + iDataSize;
/* 212 */                   this.zzo = j;
/* 221 */                   if (j - this.zzp <= 16384) {
/* 5 */                         return true;
                            }
                            synchronized (this) {
/* 224 */                       zzbbv zzbbvVar = this.zzm;
/* 226 */                       if (zzbbvVar == null) {
/* 278 */                           throw null;
                                }
/* 228 */                       long j2 = this.zzo;
                                try {
/* 230 */                           zzbbzVarZzc = zzbbz.zzc();
                                } catch (RemoteException e) {
/* 269 */                           zzA(zza(e), true);
                                }
                                try {
/* 238 */                           zzbbzVarZzc.zza().writeLong(j2);
/* 241 */                           zzbbvVar.zza(3, zzbbzVarZzc);
/* 244 */                           zzbbzVarZzc.close();
                                } finally {
                                }
                            }
/* 275 */                   this.zzp = this.zzo;
                        }
/* 5 */                 return true;
                    } catch (RuntimeException e2) {
/* 296 */               zzf.logp(Level.SEVERE, "io.grpc.binder.internal.BinderTransport", "handleTransaction", Oi010OO0.I000oI1ioi(i, "Terminating transport for uncaught Exception in transaction "), (Throwable) e2);
                        synchronized (this) {
/* 306 */                   zzA(zzazd.zzi.zzd(e2), true);
/* 3 */                     return false;
                        }
                    }
                }

                public final boolean zzD() {
                    return !this.zzn.zzb();
                }

                public final boolean zzE() {
                    return zzH(4) || zzH(5);
                }

                public final boolean zzF(zzbbv zzbbvVar) throws RemoteException {
/* 1 */             this.zzm = zzbbvVar;
                    try {
/* 6 */                 zzbbvVar.zza.linkToDeath(this, 0);
/* 9 */                 return true;
                    } catch (RemoteException unused) {
/* 3 */                 return false;
                    }
                }

                public final void zzG(int i) {
/* 1 */             int i2 = this.zzq;
                    int i3 = i - 1;
/* 7 */             if (i3 == 1) {
/* 46 */                zzgo.zzm(i2 == 1);
                    } else if (i3 == 2) {
/* 39 */                zzgo.zzm(i2 == 1 || i2 == 2);
                    } else if (i3 != 3) {
/* 19 */                zzgo.zzm(i2 == 4);
                    } else {
/* 30 */                zzgo.zzm(i2 == 1 || i2 == 2 || i2 == 3);
                    }
/* 49 */            this.zzq = i;
                }

                public final boolean zzH(int i) {
                    return this.zzq == i;
                }

                public final zzawd zzc() {
/* 1 */             return this.zzi;
                }

                public abstract void zzo(zzazd zzazdVar);

                public abstract void zzp();

                public void zzq() {
/* 5 */             this.zzg.zzb(this.zzh);
                }

                public void zzs(zzbbb zzbbbVar) {
/* 29 */            throw null;
                }

                public final synchronized zzatu zzt() {
/* 2 */             return this.zzd;
                }

                public final Future zzu(Future future) {
/* 3 */             this.zzl.add(future);
/* 29 */            return future;
                }

                public final ScheduledExecutorService zzv() {
/* 1 */             return this.zzh;
                }

                public final void zzw(int i) {
/* 1 */             zzbbn zzbbnVar = this.zzj;
/* 3 */             zzbbm zzbbmVarZza = zzbbnVar.zza();
/* 7 */             if (zzbbmVarZza != null) {
/* 24 */                zzbbnVar.zzb(new zzbci(i, Logger.getLogger(zzbcj.class.getName()), zzbbmVarZza));
                    }
                }

                public final void zzx(int i, zzazd zzazdVar) {
                    try {
/* 1 */                 zzbbz zzbbzVarZzc = zzbbz.zzc();
                        try {
/* 10 */                    zzbbzVarZzc.zza().writeInt(0);
/* 13 */                    Parcel parcelZza = zzbbzVarZzc.zza();
/* 25 */                    int iZza = zzazdVar.zza().zza() << 16;
/* 27 */                    String strZzg = zzazdVar.zzg();
/* 31 */                    if (strZzg != null && strZzg.length() > 1000) {
/* 41 */                        strZzg = strZzg.substring(0, 1000);
                            }
/* 49 */                    if (strZzg != null) {
/* 51 */                        iZza |= 32;
/* 53 */                        parcelZza.writeString(strZzg);
                            }
/* 62 */                    zzbcj.zzb(zzbbzVarZzc.zza(), iZza | 8);
/* 65 */                    zzz(i, zzbbzVarZzc);
/* 68 */                    zzbbzVarZzc.close();
                        } finally {
                        }
                    } catch (zzaze e) {
/* 95 */                zzf.logp(Level.FINER, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", (Throwable) e);
                    }
                }

                public final void zzy(zzbbv zzbbvVar) {
                    try {
/* 2 */                 zzbbz zzbbzVarZzc = zzbbz.zzc();
                        try {
/* 10 */                    zzbbzVarZzc.zza().writeInt(1);
/* 19 */                    zzbbzVarZzc.zza().writeStrongBinder(this.zzj);
/* 22 */                    zzbbvVar.zza(1, zzbbzVarZzc);
/* 25 */                    zzbbzVarZzc.close();
                        } finally {
                        }
                    } catch (RemoteException e) {
/* 45 */                zzA(zza(e), true);
                    }
                }

                public final void zzz(int i, zzbbz zzbbzVar) throws zzaze {
/* 5 */             int iDataSize = zzbbzVar.zza().dataSize();
                    try {
/* 11 */                this.zzm.zza(i, zzbbzVar);
/* 21 */                if (this.zzn.zzc(iDataSize)) {
/* 41 */                    zzf.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
                        }
                    } catch (RemoteException e) {
/* 106 */               throw new zzaze(zza(e), null);
                    }
                }

/* 28 */        public void zzm(Parcel parcel) {
                }

/* 28 */        public void zzn(Parcel parcel) {
                }
            }
