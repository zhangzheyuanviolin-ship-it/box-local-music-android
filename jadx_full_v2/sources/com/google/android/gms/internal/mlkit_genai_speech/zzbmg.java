            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Objects;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicInteger;
            
            final class zzbmg implements zzbdm {
                final zzbmh zza;
                final zzbmj zzb;

                public zzbmg(zzbmj zzbmjVar, zzbmh zzbmhVar) {
/* 1 */             Objects.requireNonNull(zzbmjVar);
/* 4 */             this.zzb = zzbmjVar;
/* 9 */             this.zza = zzbmhVar;
                }

                private static final Integer zza(zzaxq zzaxqVar) {
/* 7 */             String str = (String) zzaxqVar.zzb(zzbmj.zzf);
/* 9 */             if (str == null) {
/* 22 */                return null;
                    }
                    try {
/* 11 */                return Integer.valueOf(str);
                    } catch (NumberFormatException unused) {
/* 17 */                return -1;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:112:0x0268  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x01e5  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void zzd(zzazd zzazdVar, zzbdl zzbdlVar, zzaxq zzaxqVar) {
                    boolean z;
                    zzblt zzbltVar;
                    String string;
/* 9 */             zzbmj zzbmjVar = this.zzb;
                    synchronized (zzbmjVar.zzn) {
                        try {
/* 1 */                     zzbly zzblyVar = zzbmjVar.zzt;
/* 20 */                    zzbmh zzbmhVar = this.zza;
/* 23 */                    zzbmhVar.zzb = true;
/* 25 */                    Collection collection = zzblyVar.zzc;
/* 31 */                    if (collection.contains(zzbmhVar)) {
/* 35 */                        ArrayList arrayList = new ArrayList(collection);
/* 38 */                        arrayList.remove(zzbmhVar);
/* 69 */                        zzblyVar = new zzbly(zzblyVar.zzb, Collections.unmodifiableCollection(arrayList), zzblyVar.zzd, zzblyVar.zzf, zzblyVar.zzg, zzblyVar.zza, zzblyVar.zzh, zzblyVar.zze);
                            }
/* 1 */                     zzbmjVar.zzt = zzblyVar;
/* 88 */                    zzbmjVar.zzs.zza(zzazdVar.zza());
                        } finally {
                        }
                    }
/* 92 */            zzbmj zzbmjVar2 = this.zzb;
/* 104 */           if (zzbmjVar2.zzw.decrementAndGet() == Integer.MIN_VALUE) {
/* 115 */               zzazm zzazmVar = (zzazm) zzbmjVar2.zzh;
/* 117 */               zzazmVar.zzc(new zzbmc(this));
/* 120 */               zzazmVar.zzb();
/* 123 */               return;
                    }
/* 124 */           zzbmh zzbmhVar2 = this.zza;
/* 128 */           if (zzbmhVar2.zzc) {
/* 130 */               zzbmj.zzV(zzbmjVar2, zzbmhVar2);
/* 139 */               if (zzbmjVar2.zzt.zzf == zzbmhVar2) {
/* 1 */                     zzbmjVar2.zzaj(zzazdVar, zzbdlVar, zzaxqVar);
/* 144 */                   return;
                        }
/* 774 */               return;
                    }
/* 145 */           zzbdl zzbdlVar2 = zzbdl.MISCARRIED;
/* 147 */           if (zzbdlVar == zzbdlVar2 && zzbmjVar2.zzv.incrementAndGet() > 1000) {
/* 161 */               zzbmj.zzV(zzbmjVar2, zzbmhVar2);
/* 170 */               if (zzbmjVar2.zzt.zzf == zzbmhVar2) {
/* 172 */                   zzayz zzayzVar = zzayz.INTERNAL;
/* 174 */                   zzaxk zzaxkVar = zzbgr.zza;
/* 176 */                   zzazd zzazdVarZzb = zzayzVar.zzb();
/* 184 */                   if (zzazdVar.zzg() == null) {
/* 190 */                       string = zzazdVar.zza().toString();
                            } else {
/* 223 */                       string = zzazdVar.zza().toString() + ": " + zzazdVar.zzg();
                            }
/* 1 */                     zzbmjVar2.zzaj(zzazdVarZzb.zze("Too many transparent retries. Might be a bug in gRPC: ".concat(String.valueOf(string))).zzd(zzazdVar.zzh()), zzbdlVar, zzaxqVar);
/* 252 */                   return;
                        }
/* 774 */               return;
                    }
/* 259 */           if (zzbmjVar2.zzt.zzf == null) {
/* 262 */               if (zzbdlVar == zzbdlVar2 || (zzbdlVar == zzbdl.REFUSED && zzbmjVar2.zzu.compareAndSet(false, true))) {
/* 668 */                   zzbmj zzbmjVar3 = this.zzb;
/* 670 */                   zzbmh zzbmhVar3 = this.zza;
/* 1 */                     zzbmh zzbmhVarZzae = zzbmjVar3.zzae(zzbmhVar3.zzd, true, false);
/* 678 */                   if (zzbmhVarZzae != null) {
/* 684 */                       if (zzbmjVar3.zzm) {
                                    synchronized (zzbmjVar3.zzn) {
/* 1 */                                 zzbly zzblyVar2 = zzbmjVar3.zzt;
/* 699 */                               ArrayList arrayList2 = new ArrayList(zzblyVar2.zzd);
/* 702 */                               arrayList2.remove(zzbmhVar3);
/* 705 */                               arrayList2.add(zzbmhVarZzae);
/* 1 */                                 zzbmjVar3.zzt = new zzbly(zzblyVar2.zzb, zzblyVar2.zzc, Collections.unmodifiableCollection(arrayList2), zzblyVar2.zzf, zzblyVar2.zzg, zzblyVar2.zza, zzblyVar2.zzh, zzblyVar2.zze);
                                    }
                                }
/* 752 */                       this.zzb.zzg.execute(new zzbmd(this, zzbmhVarZzae));
/* 755 */                       return;
                            }
/* 774 */                   return;
                        }
/* 282 */               if (zzbdlVar != zzbdl.DROPPED) {
/* 299 */                   zzbmjVar2.zzu.set(true);
/* 306 */                   if (zzbmjVar2.zzm) {
/* 308 */                       Integer numZza = zza(zzaxqVar);
/* 312 */                       zzbmj zzbmjVar4 = this.zzb;
/* 324 */                       boolean zContains = zzbmjVar4.zzl.zzc.contains(zzazdVar.zza());
/* 355 */                       boolean z2 = (zzbmjVar4.zzr == null || (!zContains && (numZza == null || numZza.intValue() >= 0))) ? false : !zzbmjVar4.zzr.zzb();
/* 356 */                       if (zContains && !z2 && !zzazdVar.zzj() && numZza != null && numZza.intValue() > 0) {
/* 374 */                           numZza = 0;
                                }
/* 378 */                       boolean z3 = zContains && !z2;
/* 384 */                       if (z3) {
/* 386 */                           zzbmj.zzY(zzbmjVar4, numZza);
                                }
                                synchronized (zzbmjVar4.zzn) {
                                    try {
/* 1 */                                 zzbly zzblyVar3 = zzbmjVar4.zzt;
/* 398 */                               zzbmh zzbmhVar4 = this.zza;
/* 404 */                               ArrayList arrayList3 = new ArrayList(zzblyVar3.zzd);
/* 407 */                               arrayList3.remove(zzbmhVar4);
/* 1 */                                 zzbmjVar4.zzt = new zzbly(zzblyVar3.zzb, zzblyVar3.zzc, Collections.unmodifiableCollection(arrayList3), zzblyVar3.zzf, zzblyVar3.zzg, zzblyVar3.zza, zzblyVar3.zzh, zzblyVar3.zze);
/* 444 */                               if (!z3 || (!zzbmjVar4.zzak(zzbmjVar4.zzt) && zzbmjVar4.zzt.zzd.isEmpty())) {
                                        }
/* 472 */                               return;
                                    } finally {
                                    }
                                }
                            }
/* 482 */                   long nanos = 0;
/* 484 */                   if (zzbmjVar2.zzk == null) {
/* 486 */                       z = false;
/* 615 */                       if (z) {
/* 1 */                             zzbmh zzbmhVarZzae2 = zzbmjVar2.zzae(zzbmhVar2.zzd + 1, false, false);
/* 624 */                           if (zzbmhVarZzae2 != null) {
                                        synchronized (zzbmjVar2.zzn) {
/* 637 */                                   zzbltVar = new zzblt(zzbmjVar2.zzn);
/* 1 */                                     zzbmjVar2.zzA = zzbltVar;
                                        }
/* 661 */                               zzbltVar.zzb(this.zzb.zzi.schedule(new zzbmb(this, zzbltVar, zzbmhVarZzae2), nanos, TimeUnit.NANOSECONDS));
/* 664 */                               return;
                                    }
/* 774 */                           return;
                                }
                            } else {
/* 499 */                       boolean zContains2 = zzbmjVar2.zzk.zzf.contains(zzazdVar.zza());
/* 503 */                       Integer numZza2 = zza(zzaxqVar);
/* 534 */                       boolean z4 = (zzbmjVar2.zzr == null || (!zContains2 && (numZza2 == null || numZza2.intValue() >= 0))) ? false : !zzbmjVar2.zzr.zzb();
/* 544 */                       if (zzbmjVar2.zzk.zza > zzbmhVar2.zzd + 1 && !z4) {
/* 548 */                           if (numZza2 == null) {
/* 550 */                               if (zContains2) {
/* 556 */                                   nanos = zzbmj.zzv(zzbmjVar2.zzC);
/* 1 */                                     zzbmjVar2.zzC = Math.min((long) (zzbmjVar2.zzC * zzbmjVar2.zzk.zzd), zzbmjVar2.zzk.zzc);
/* 586 */                                   z = true;
                                        }
/* 486 */                               z = false;
                                    } else {
/* 592 */                               if (numZza2.intValue() >= 0) {
/* 601 */                                   nanos = TimeUnit.MILLISECONDS.toNanos(numZza2.intValue());
/* 1 */                                     zzbmjVar2.zzC = zzbmjVar2.zzk.zzb;
/* 586 */                                   z = true;
                                        }
/* 486 */                               z = false;
                                    }
/* 615 */                           if (z) {
                                    }
                                }
                            }
                        } else if (zzbmjVar2.zzm) {
/* 1 */                     zzbmjVar2.zzai();
                        }
                    }
/* 756 */           zzbmj zzbmjVar5 = this.zzb;
/* 758 */           zzbmh zzbmhVar5 = this.zza;
/* 760 */           zzbmj.zzV(zzbmjVar5, zzbmhVar5);
/* 769 */           if (zzbmjVar5.zzt.zzf == zzbmhVar5) {
/* 1 */                 zzbmjVar5.zzaj(zzazdVar, zzbdlVar, zzaxqVar);
                    }
                }

                @Override
                public final void zze(zzaxq zzaxqVar) {
                    AtomicInteger atomicInteger;
                    int i;
                    int i2;
/* 1 */             zzbmh zzbmhVar = this.zza;
/* 3 */             int i3 = zzbmhVar.zzd;
/* 5 */             if (i3 > 0) {
/* 7 */                 zzaxk zzaxkVar = zzbmj.zze;
/* 9 */                 zzaxqVar.zzd(zzaxkVar);
/* 16 */                zzaxqVar.zzf(zzaxkVar, String.valueOf(i3));
                    }
/* 19 */            zzbmj zzbmjVar = this.zzb;
/* 21 */            zzbmj.zzV(zzbmjVar, zzbmhVar);
/* 30 */            if (zzbmjVar.zzt.zzf == zzbmhVar) {
/* 36 */                if (zzbmjVar.zzr != null) {
/* 1 */                     zzbmi zzbmiVar = zzbmjVar.zzr;
/* 64 */                    do {
/* 42 */                        atomicInteger = zzbmiVar.zzd;
/* 44 */                        i = atomicInteger.get();
/* 48 */                        i2 = zzbmiVar.zza;
/* 50 */                        if (i == i2) {
                                    break;
                                }
/* 64 */                    } while (!atomicInteger.compareAndSet(i, Math.min(zzbmiVar.zzc + i, i2)));
                        }
/* 75 */                zzazm zzazmVar = (zzazm) zzbmjVar.zzh;
/* 77 */                zzazmVar.zzc(new zzblz(this, zzaxqVar));
/* 80 */                zzazmVar.zzb();
                    }
                }

                @Override
                public final void zzf(zzbni zzbniVar) throws IOException {
/* 1 */             zzbmj zzbmjVar = this.zzb;
/* 7 */             zzbmh zzbmhVar = zzbmjVar.zzt.zzf;
/* 16 */            zzgo.zzn(zzbmhVar != null, "Headers should be received prior to messages.");
/* 21 */            if (zzbmhVar != this.zza) {
/* 23 */                zzbgr.zzd(zzbniVar);
/* 26 */                return;
                    }
/* 36 */            zzazm zzazmVar = (zzazm) zzbmjVar.zzh;
/* 38 */            zzazmVar.zzc(new zzbme(this, zzbniVar));
/* 41 */            zzazmVar.zzb();
                }

                @Override
                public final void zzg() {
/* 1 */             zzbmj zzbmjVar = this.zzb;
/* 7 */             if (zzbmjVar.zzn()) {
/* 19 */                zzazm zzazmVar = (zzazm) zzbmjVar.zzh;
/* 21 */                zzazmVar.zzc(new zzbmf(this));
/* 24 */                zzazmVar.zzb();
                    }
                }
            }
