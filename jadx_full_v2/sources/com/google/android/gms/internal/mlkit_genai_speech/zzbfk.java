            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.InputStream;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
/* 27 */    class zzbfk implements zzbdk {
                private volatile boolean zzb;
                private zzbdm zzc;
                private zzbdk zzd;
                private zzazd zze;
                private zzbfj zzg;
                private long zzh;
                private long zzi;
                private List zzf = new ArrayList();
                private List zzj = new ArrayList();
                private final String zza = "connecting_and_lb";

                public zzbfk(String str) {
                }

                private final void zzo(Runnable runnable) {
/* 10 */            zzgo.zzn(this.zzc != null, "May only be called after start");
                    synchronized (this) {
                        try {
/* 16 */                    if (this.zzb) {
/* 28 */                        runnable.run();
                            } else {
/* 20 */                        this.zzf.add(runnable);
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
                
                    r0 = r1.iterator();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
                
                    if (r0.hasNext() == false) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
                
                    ((java.lang.Runnable) r0.next()).run();
                 */
                /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final void zzp() {
                    zzbfj zzbfjVar;
                    List list;
/* 3 */             List arrayList = new ArrayList();
                    while (true) {
                        synchronized (this) {
/* 13 */                    if (this.zzf.isEmpty()) {
                                break;
                            }
/* 32 */                    list = this.zzf;
/* 34 */                    this.zzf = arrayList;
                        }
/* 24 */                if (zzbfjVar == null) {
/* 26 */                    zzbfjVar.zzb();
/* 29 */                    return;
                        }
/* 29 */                return;
/* 57 */                list.clear();
/* 60 */                arrayList = list;
                    }
/* 16 */            this.zzf = null;
/* 19 */            this.zzb = true;
/* 21 */            zzbfjVar = this.zzg;
/* 24 */            if (zzbfjVar == null) {
                    }
                }

                private final void zzq(zzbdm zzbdmVar) {
/* 3 */             Iterator it = this.zzj.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((Runnable) it.next()).run();
                    }
/* 24 */            this.zzj = null;
/* 28 */            this.zzd.zzl(zzbdmVar);
                }

                private final void zzv(zzbdk zzbdkVar) {
/* 1 */             zzbdk zzbdkVar2 = this.zzd;
/* 10 */            zzgo.zzo(zzbdkVar2 == null, "realStream already set to %s", zzbdkVar2);
/* 13 */            this.zzd = zzbdkVar;
/* 19 */            this.zzi = System.nanoTime();
                }

                @Override
                public void zza(zzbgu zzbguVar) {
                    synchronized (this) {
                        try {
/* 4 */                     if (this.zzc == null) {
/* 7 */                         return;
                            }
/* 10 */                    zzbdk zzbdkVar = this.zzd;
/* 12 */                    String str = this.zza;
/* 14 */                    if (zzbdkVar != null) {
/* 55 */                        zzbguVar.zzb(str + "_delay", (this.zzi - this.zzh) + "ns");
/* 60 */                        this.zzd.zza(zzbguVar);
                            } else {
/* 105 */                       zzbguVar.zzb(str + "_delay", (System.nanoTime() - this.zzh) + "ns");
/* 110 */                       zzbguVar.zza("was_still_waiting");
                            }
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
                }

                @Override
                public void zzb(zzazd zzazdVar) {
/* 3 */             boolean z = false;
/* 12 */            zzgo.zzn(this.zzc != null, "May only be called after start");
/* 17 */            zzgo.zzc(zzazdVar, "reason");
                    synchronized (this) {
                        try {
/* 23 */                    if (this.zzd == null) {
/* 27 */                        zzv(zzbjt.zza);
/* 30 */                        this.zze = zzazdVar;
                            } else {
/* 35 */                        z = true;
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 37 */            if (z) {
/* 44 */                zzo(new zzbfd(this, zzazdVar));
/* 47 */                return;
                    }
/* 48 */            zzp();
/* 51 */            zzr(zzazdVar);
/* 63 */            this.zzc.zzd(zzazdVar, zzbdl.PROCESSED, new zzaxq());
                }

                @Override
                public final void zzc() {
/* 10 */            zzgo.zzn(this.zzc != null, "May only be called after start");
/* 15 */            if (this.zzb) {
/* 19 */                this.zzd.zzc();
                    } else {
/* 28 */                zzo(new zzbfc(this));
                    }
                }

                @Override
                public final void zzd() {
/* 10 */            zzgo.zzn(this.zzc != null, "May only be called after start");
/* 18 */            zzo(new zzbfe(this));
                }

                @Override
                public final void zze() {
/* 10 */            zzgo.zzn(this.zzc == null, "May only be called before start");
/* 20 */            this.zzj.add(new zzbeu(this));
                }

                @Override
                public final void zzf(int i) {
/* 10 */            zzgo.zzn(this.zzc != null, "May only be called after start");
/* 15 */            if (this.zzb) {
/* 19 */                this.zzd.zzf(i);
                    } else {
/* 28 */                zzo(new zzbet(this, i));
                    }
                }

                @Override
                public final void zzg(zzaur zzaurVar) {
/* 10 */            zzgo.zzn(this.zzc == null, "May only be called before start");
/* 20 */            this.zzj.add(new zzbev(this, zzaurVar));
                }

                @Override
                public final void zzh(zzavf zzavfVar) {
/* 10 */            zzgo.zzn(this.zzc == null, "May only be called before start");
/* 20 */            this.zzj.add(new zzbez(this, zzavfVar));
                }

                @Override
                public final void zzi(zzavi zzaviVar) {
/* 10 */            zzgo.zzn(this.zzc == null, "May only be called before start");
/* 15 */            zzgo.zzc(zzaviVar, "decompressorRegistry");
/* 25 */            this.zzj.add(new zzbew(this, zzaviVar));
                }

                @Override
                public final void zzj(int i) {
/* 10 */            zzgo.zzn(this.zzc == null, "May only be called before start");
/* 20 */            this.zzj.add(new zzbex(this, i));
                }

                @Override
                public final void zzk(int i) {
/* 10 */            zzgo.zzn(this.zzc == null, "May only be called before start");
/* 20 */            this.zzj.add(new zzbey(this, i));
                }

                @Override
                public final void zzl(zzbdm zzbdmVar) {
                    zzazd zzazdVar;
                    boolean z;
/* 10 */            zzgo.zzn(this.zzc == null, "already started");
                    synchronized (this) {
                        try {
/* 14 */                    zzazdVar = this.zze;
/* 16 */                    z = this.zzb;
/* 18 */                    if (!z) {
/* 22 */                        zzbfj zzbfjVar = new zzbfj(zzbdmVar);
/* 25 */                        this.zzg = zzbfjVar;
/* 27 */                        zzbdmVar = zzbfjVar;
                            }
/* 31 */                    this.zzc = zzbdmVar;
/* 37 */                    this.zzh = System.nanoTime();
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 40 */            if (zzazdVar != null) {
/* 49 */                zzbdmVar.zzd(zzazdVar, zzbdl.PROCESSED, new zzaxq());
                    } else if (z) {
/* 55 */                zzq(zzbdmVar);
                    }
                }

                @Override
                public final void zzm(InputStream inputStream) {
/* 10 */            zzgo.zzn(this.zzc != null, "May only be called after start");
/* 15 */            if (this.zzb) {
/* 19 */                this.zzd.zzm(inputStream);
                    } else {
/* 28 */                zzo(new zzbfb(this, inputStream));
                    }
                }

                @Override
                public final boolean zzn() {
/* 3 */             if (this.zzb) {
/* 7 */                 return this.zzd.zzn();
                    }
/* 12 */            return false;
                }

                public final Runnable zzt(zzbdk zzbdkVar) {
                    synchronized (this) {
                        try {
/* 5 */                     if (this.zzd == null) {
/* 11 */                        zzv(zzbdkVar);
/* 14 */                        zzbdm zzbdmVar = this.zzc;
/* 16 */                        if (zzbdmVar == null) {
/* 18 */                            this.zzf = null;
/* 21 */                            this.zzb = true;
                                }
/* 24 */                        if (zzbdmVar != null) {
/* 26 */                            zzq(zzbdmVar);
/* 31 */                            return new zzbfa(this);
                                }
                            }
                        } finally {
                        }
                    }
/* 4 */             return null;
                }

/* 28 */        public void zzr(zzazd zzazdVar) {
                }
            }
