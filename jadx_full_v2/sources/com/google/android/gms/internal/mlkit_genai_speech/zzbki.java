            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.SocketAddress;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Random;
            import java.util.concurrent.TimeUnit;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.I000II;
            
            final class zzbki extends zzawx {
                private static final Logger zzf = Logger.getLogger(zzbki.class.getName());
                private final boolean zzg;
                private final zzawn zzh;
                private final Map zzi;
                private final zzbkb zzj;
                private int zzk;
                private boolean zzl;
                private zzazk zzm;
                private zzauv zzn;
                private zzauv zzo;
                private boolean zzp;
                private zzazk zzq;
                private final boolean zzr;
                private zzbga zzs;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public zzbki(zzawn zzawnVar) {
                    boolean z;
/* 10 */            if (!zzn()) {
/* 12 */                int i = zzbkq.zzb;
/* 24 */                z = zzbgr.zzf("GRPC_PF_USE_HAPPY_EYEBALLS", false);
                    }
/* 25 */            this.zzg = z;
/* 32 */            this.zzi = new HashMap();
/* 43 */            this.zzj = new zzbkb(zzhk.zzj(), z);
/* 45 */            this.zzk = 0;
/* 47 */            this.zzl = true;
/* 50 */            this.zzm = null;
/* 52 */            zzauv zzauvVar = zzauv.IDLE;
/* 54 */            this.zzn = zzauvVar;
/* 56 */            this.zzo = zzauvVar;
/* 58 */            this.zzp = true;
/* 60 */            this.zzq = null;
/* 66 */            this.zzr = zzn();
/* 68 */            this.zzh = zzawnVar;
                }

                public static void zzh(zzbki zzbkiVar, zzbkg zzbkgVar, zzauw zzauwVar) {
/* 1 */             zzauv zzauvVarZza = zzauwVar.zza();
/* 9 */             SocketAddress socketAddressZzu = zzu(zzbkgVar.zza);
/* 13 */            Map map = zzbkiVar.zzi;
/* 19 */            if (zzbkgVar == map.get(socketAddressZzu) && zzauvVarZza != zzauv.SHUTDOWN) {
/* 27 */                zzauv zzauvVar = zzauv.IDLE;
/* 29 */                if (zzauvVarZza == zzauvVar && zzbkgVar.zzb == zzauv.READY) {
/* 41 */                    zzbkiVar.zzh.zzd();
                        }
/* 44 */                zzbkg.zzh(zzbkgVar, zzauvVarZza);
/* 47 */                zzauv zzauvVar2 = zzbkiVar.zzn;
/* 49 */                zzauv zzauvVar3 = zzauv.TRANSIENT_FAILURE;
/* 51 */                if (zzauvVar2 == zzauvVar3 || zzbkiVar.zzo == zzauvVar3) {
/* 59 */                    if (zzauvVarZza == zzauv.CONNECTING) {
/* 408 */                       return;
                            }
/* 61 */                    if (zzauvVarZza == zzauvVar) {
/* 63 */                        zzbkiVar.zzl();
/* 66 */                        return;
                            }
                        }
/* 67 */                int iOrdinal = zzauvVarZza.ordinal();
/* 71 */                if (iOrdinal == 0) {
/* 340 */                   zzauv zzauvVar4 = zzauv.CONNECTING;
/* 342 */                   zzbkiVar.zzn = zzauvVar4;
/* 353 */                   zzbkiVar.zzr(zzauvVar4, new zzbkd(zzawp.zzc()));
/* 408 */                   return;
                        }
/* 74 */                if (iOrdinal == 1) {
/* 245 */                   zzazk zzazkVar = zzbkiVar.zzq;
/* 248 */                   if (zzazkVar != null) {
/* 250 */                       zzazkVar.zza();
/* 253 */                       zzbkiVar.zzq = null;
                            }
/* 255 */                   zzbkiVar.zzs = null;
/* 257 */                   zzbkiVar.zzo();
/* 272 */                   for (zzbkg zzbkgVar2 : map.values()) {
/* 292 */                       if (!zzbkgVar2.zzf().equals(zzbkgVar.zza)) {
/* 298 */                           zzbkgVar2.zzf().zzc();
                                }
                            }
/* 302 */                   map.clear();
/* 305 */                   zzauv zzauvVar5 = zzauv.READY;
/* 307 */                   zzbkg.zzh(zzbkgVar, zzauvVar5);
/* 318 */                   map.put(zzu(zzbkgVar.zza), zzbkgVar);
/* 331 */                   zzbkiVar.zzj.zzi(zzu(zzbkgVar.zza));
/* 334 */                   zzbkiVar.zzn = zzauvVar5;
/* 336 */                   zzbkiVar.zzs(zzbkgVar);
/* 339 */                   return;
                        }
/* 77 */                if (iOrdinal != 2) {
/* 80 */                    if (iOrdinal != 3) {
/* 108 */                       I000II.I000iOII("Unsupported state:".concat(zzauvVarZza.toString()));
/* 111 */                       return;
                            }
/* 84 */                    zzbkiVar.zzj.zze();
/* 87 */                    zzbkiVar.zzn = zzauvVar;
/* 94 */                    zzbkiVar.zzr(zzauvVar, new zzbkf(zzbkiVar, zzbkiVar));
/* 97 */                    return;
                        }
/* 112 */               zzbkb zzbkbVar = zzbkiVar.zzj;
/* 118 */               if (zzbkbVar.zzh() && map.get(zzbkbVar.zzc()) == zzbkgVar) {
/* 134 */                   if (zzbkbVar.zzg()) {
/* 136 */                       zzbkiVar.zzo();
/* 139 */                       zzbkiVar.zzl();
                            } else if (map.size() >= zzbkbVar.zza()) {
/* 153 */                       zzbkiVar.zzp();
                            } else {
/* 157 */                       zzbkbVar.zze();
/* 160 */                       zzbkiVar.zzl();
                            }
                        }
/* 171 */               if (map.size() >= zzbkbVar.zza()) {
/* 177 */                   Iterator it = map.values().iterator();
/* 185 */                   while (it.hasNext()) {
/* 197 */                       if (!((zzbkg) it.next()).zzi()) {
/* 408 */                           return;
                                }
                            }
/* 201 */                   zzbkiVar.zzn = zzauvVar3;
/* 216 */                   zzbkiVar.zzr(zzauvVar3, new zzbkd(zzawp.zzb(zzauwVar.zzd())));
/* 221 */                   int i = zzbkiVar.zzk + 1;
/* 222 */                   zzbkiVar.zzk = i;
/* 228 */                   if (i >= zzbkbVar.zza() || zzbkiVar.zzl) {
/* 235 */                       zzbkiVar.zzl = false;
/* 237 */                       zzbkiVar.zzk = 0;
/* 241 */                       zzbkiVar.zzh.zzd();
                            }
                        }
                    }
                }

                public static boolean zzn() {
/* 4 */             return zzbgr.zzf("GRPC_SERIALIZE_RETRIES", false);
                }

                private final void zzo() {
/* 1 */             zzazk zzazkVar = this.zzm;
/* 3 */             if (zzazkVar != null) {
/* 5 */                 zzazkVar.zza();
/* 9 */                 this.zzm = null;
                    }
                }

                private final void zzp() {
/* 3 */             if (this.zzr && this.zzq == null) {
/* 10 */                zzbga zzbgaVar = this.zzs;
/* 12 */                if (zzbgaVar == null) {
/* 16 */                    zzbgaVar = new zzbga();
/* 19 */                    this.zzs = zzbgaVar;
                        }
/* 21 */                long jZza = zzbgaVar.zza();
/* 25 */                zzawn zzawnVar = this.zzh;
/* 46 */                this.zzq = zzawnVar.zzb().zza(new zzbjx(this), jZza, TimeUnit.NANOSECONDS, zzawnVar.zzc());
                    }
                }

                private final void zzq() {
/* 3 */             if (this.zzg) {
/* 5 */                 zzazk zzazkVar = this.zzm;
/* 7 */                 if (zzazkVar == null || !zzazkVar.zzb()) {
/* 16 */                    zzawn zzawnVar = this.zzh;
/* 39 */                    this.zzm = zzawnVar.zzb().zza(new zzbjy(this), 250L, TimeUnit.MILLISECONDS, zzawnVar.zzc());
                        }
                    }
                }

                private final void zzr(zzauv zzauvVar, zzawu zzawuVar) {
/* 3 */             if (zzauvVar == this.zzo && (zzauvVar == zzauv.IDLE || zzauvVar == zzauv.CONNECTING)) {
/* 13 */                return;
                    }
/* 14 */            this.zzo = zzauvVar;
/* 18 */            this.zzh.zze(zzauvVar, zzawuVar);
                }

                private final void zzs(zzbkg zzbkgVar) {
/* 1 */             zzauv zzauvVar = zzbkgVar.zzb;
/* 5 */             zzauv zzauvVar2 = zzauv.READY;
/* 7 */             if (zzauvVar != zzauvVar2) {
/* 70 */                return;
                    }
/* 12 */            if (this.zzp || zzbkgVar.zzd.zza() == zzauvVar2) {
/* 85 */                zzr(zzauvVar2, new zzawm(zzawp.zzd(zzbkgVar.zza, null)));
/* 168 */               return;
                    }
/* 3 */             zzauv zzauvVarZza = zzbkgVar.zzd.zza();
/* 25 */            zzauv zzauvVar3 = zzauv.TRANSIENT_FAILURE;
/* 27 */            if (zzauvVarZza == zzauvVar3) {
/* 46 */                zzr(zzauvVar3, new zzbkd(zzawp.zzb(zzbkgVar.zzd.zzd())));
                    } else if (this.zzo != zzauvVar3) {
/* 67 */                zzr(zzbkgVar.zzd.zza(), new zzbkd(zzawp.zzc()));
                    }
                }

                private final boolean zzt(zzhk zzhkVar) {
/* 1 */             Map map = this.zzi;
/* 9 */             HashSet hashSet = new HashSet(map.keySet());
/* 14 */            HashSet hashSet2 = new HashSet();
/* 17 */            int size = zzhkVar.size();
/* 22 */            for (int i = 0; i < size; i++) {
/* 34 */                hashSet2.addAll(((zzavj) zzhkVar.get(i)).zzb());
                    }
/* 40 */            Iterator it = hashSet.iterator();
/* 48 */            while (it.hasNext()) {
/* 54 */                SocketAddress socketAddress = (SocketAddress) it.next();
/* 60 */                if (!hashSet2.contains(socketAddress)) {
/* 72 */                    ((zzbkg) map.remove(socketAddress)).zzf().zzc();
                        }
                    }
/* 76 */            return hashSet.isEmpty();
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static final SocketAddress zzu(zzawt zzawtVar) {
                    boolean z;
/* 1 */             zzbja zzbjaVar = (zzbja) zzawtVar;
/* 7 */             zzbjaVar.zzj.zzd.zzd();
/* 14 */            zzgo.zzn(zzbjaVar.zzg, "not started");
/* 17 */            List list = zzbjaVar.zze;
/* 20 */            if (list != null) {
/* 27 */                z = list.size() == 1;
                    }
/* 33 */            zzgo.zzo(z, "%s does not have exactly one group", list);
/* 50 */            return (SocketAddress) ((zzavj) list.get(0)).zzb().get(0);
                }

                @Override
                public final zzazd zza(zzaws zzawsVar) {
                    Boolean bool;
/* 5 */             if (this.zzn == zzauv.SHUTDOWN) {
/* 11 */                return zzazd.zzg.zze("Already shut down");
                    }
/* 26 */            Boolean bool2 = (Boolean) zzawsVar.zza().zzc(zzawx.zze);
/* 40 */            this.zzp = bool2 == null || !bool2.booleanValue();
/* 42 */            List<zzavj> listZzd = zzawsVar.zzd();
/* 52 */            if (listZzd.isEmpty()) {
/* 92 */                zzazd zzazdVarZze = zzazd.zzj.zze("NameResolver returned no usable address. addrs=" + String.valueOf(zzawsVar.zzd()) + ", attrs=" + zzawsVar.zza().toString());
/* 96 */                zzb(zzazdVarZze);
/* 99 */                return zzazdVarZze;
                    }
/* 100 */           Iterator it = listZzd.iterator();
/* 108 */           while (it.hasNext()) {
/* 116 */               if (((zzavj) it.next()) == null) {
/* 156 */                   zzazd zzazdVarZze2 = zzazd.zzj.zze("NameResolver returned address list with null endpoint. addrs=" + String.valueOf(zzawsVar.zzd()) + ", attrs=" + zzawsVar.zza().toString());
/* 160 */                   zzb(zzazdVarZze2);
/* 163 */                   return zzazdVarZze2;
                        }
                    }
/* 164 */           this.zzl = true;
/* 168 */           HashSet hashSet = new HashSet();
/* 173 */           ArrayList arrayList = new ArrayList();
/* 184 */           for (zzavj zzavjVar : listZzd) {
/* 194 */               ArrayList arrayList2 = new ArrayList();
/* 209 */               for (SocketAddress socketAddress : zzavjVar.zzb()) {
/* 221 */                   if (hashSet.add(socketAddress)) {
/* 223 */                       arrayList2.add(socketAddress);
                            }
                        }
/* 231 */               if (!arrayList2.isEmpty()) {
/* 242 */                   arrayList.add(new zzavj(arrayList2, zzavjVar.zza()));
                        }
                    }
/* 252 */           if ((zzawsVar.zzc() instanceof zzbkc) && (bool = ((zzbkc) zzawsVar.zzc()).zza) != null && bool.booleanValue()) {
/* 275 */               Collections.shuffle(arrayList, new Random());
                    }
/* 278 */           int i = zzhk.zzd;
/* 282 */           zzhh zzhhVar = new zzhh();
/* 285 */           zzhhVar.zzf(arrayList);
/* 288 */           zzhk zzhkVarZzg = zzhhVar.zzg();
/* 292 */           zzauv zzauvVar = this.zzn;
/* 294 */           zzauv zzauvVar2 = zzauv.READY;
/* 296 */           if (zzauvVar == zzauvVar2 || (zzauvVar == zzauv.CONNECTING && (!this.zzg || this.zzj.zzh()))) {
/* 321 */               zzbkb zzbkbVar = this.zzj;
/* 323 */               SocketAddress socketAddressZzc = zzbkbVar.zzc();
/* 327 */               zzbkbVar.zzf(zzhkVarZzg);
/* 334 */               if (zzbkbVar.zzi(socketAddressZzc)) {
/* 408 */                   ((zzbkg) this.zzi.get(socketAddressZzc)).zzf().zze(zzbkbVar.zzd());
/* 411 */                   zzt(zzhkVarZzg);
/* 414 */                   return zzazd.zza;
                        }
                    } else {
/* 317 */               this.zzj.zzf(zzhkVarZzg);
                    }
/* 340 */           if (zzt(zzhkVarZzg)) {
/* 342 */               zzauv zzauvVar3 = zzauv.CONNECTING;
/* 344 */               this.zzn = zzauvVar3;
/* 355 */               zzr(zzauvVar3, new zzbkd(zzawp.zzc()));
                    }
/* 358 */           zzauv zzauvVar4 = this.zzn;
/* 360 */           if (zzauvVar4 == zzauvVar2) {
/* 362 */               zzauv zzauvVar5 = zzauv.IDLE;
/* 364 */               this.zzn = zzauvVar5;
/* 371 */               zzr(zzauvVar5, new zzbkf(this, this));
                    } else if (zzauvVar4 == zzauv.CONNECTING || zzauvVar4 == zzauv.TRANSIENT_FAILURE) {
/* 383 */               zzo();
/* 386 */               zzl();
                    }
/* 389 */           return zzazd.zza;
                }

                @Override
                public final void zzb(zzazd zzazdVar) {
/* 5 */             if (this.zzn == zzauv.SHUTDOWN) {
/* 7 */                 return;
                    }
/* 8 */             Map map = this.zzi;
/* 14 */            Iterator it = map.values().iterator();
/* 22 */            while (it.hasNext()) {
/* 34 */                ((zzbkg) it.next()).zzf().zzc();
                    }
/* 38 */            map.clear();
/* 47 */            this.zzj.zzf(zzhk.zzj());
/* 50 */            zzauv zzauvVar = zzauv.TRANSIENT_FAILURE;
/* 52 */            this.zzn = zzauvVar;
/* 63 */            zzr(zzauvVar, new zzbkd(zzawp.zzb(zzazdVar)));
                }

                @Override
                public final void zzc() {
/* 1 */             Map map = this.zzi;
/* 21 */            zzf.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
/* 24 */            zzauv zzauvVar = zzauv.SHUTDOWN;
/* 26 */            this.zzn = zzauvVar;
/* 28 */            this.zzo = zzauvVar;
/* 30 */            zzo();
/* 33 */            zzazk zzazkVar = this.zzq;
/* 36 */            if (zzazkVar != null) {
/* 38 */                zzazkVar.zza();
/* 41 */                this.zzq = null;
                    }
/* 43 */            this.zzs = null;
/* 49 */            Iterator it = map.values().iterator();
/* 57 */            while (it.hasNext()) {
/* 69 */                ((zzbkg) it.next()).zzf().zzc();
                    }
/* 73 */            map.clear();
                }

                public final void zzl() {
/* 1 */             zzbkb zzbkbVar = this.zzj;
/* 7 */             if (!zzbkbVar.zzh() || this.zzn == zzauv.SHUTDOWN) {
/* 245 */               return;
                    }
/* 17 */            Map map = this.zzi;
/* 19 */            SocketAddress socketAddressZzc = zzbkbVar.zzc();
/* 27 */            zzbkg zzbkgVar = (zzbkg) map.get(socketAddressZzc);
/* 29 */            if (zzbkgVar == null) {
/* 31 */                zzatu zzatuVarZzb = zzbkbVar.zzb();
/* 38 */                zzbjz zzbjzVar = new zzbjz(this, null);
/* 41 */                zzawn zzawnVar = this.zzh;
/* 43 */                zzawi zzawiVarZzb = zzawk.zzb();
/* 64 */                zzawiVarZzb.zzb(zzhq.zza(new zzavj(Collections.singletonList(socketAddressZzc), zzatuVarZzb)));
/* 69 */                zzawiVarZzb.zza(zzawx.zzb, zzbjzVar);
/* 80 */                zzawiVarZzb.zza(zzawx.zzc, Boolean.valueOf(this.zzr));
/* 87 */                zzawt zzawtVarZza = zzawnVar.zza(zzawiVarZzb.zzc());
/* 95 */                final zzbkg zzbkgVar2 = new zzbkg(zzawtVarZza, zzauv.IDLE);
/* 1 */                 zzbjzVar.zzb = zzbkgVar2;
/* 101 */               map.put(socketAddressZzc, zzbkgVar2);
/* 109 */               zzatu zzatuVarZza = ((zzbja) zzawtVarZza).zza.zza();
/* 115 */               if (this.zzp || zzatuVarZza.zzc(zzawx.zzd) == null) {
/* 1 */                     zzbkgVar2.zzd = zzauw.zzb(zzauv.READY);
                        }
/* 139 */               zzawtVarZza.zzd(new zzawv() {
                            @Override
                            public final void zza(zzauw zzauwVar) {
/* 5 */                         zzbki.zzh(this.zza, zzbkgVar2, zzauwVar);
                            }
                        });
/* 142 */               zzbkgVar = zzbkgVar2;
                    }
/* 147 */           int iOrdinal = zzbkgVar.zzc().ordinal();
/* 151 */           if (iOrdinal == 0) {
/* 210 */               zzq();
/* 245 */               return;
                    }
/* 154 */           if (iOrdinal != 2) {
/* 157 */               if (iOrdinal != 3) {
/* 245 */                   return;
                        }
/* 164 */               zzbkgVar.zza.zzb();
/* 169 */               zzbkg.zzh(zzbkgVar, zzauv.CONNECTING);
/* 172 */               zzq();
/* 175 */               return;
                    }
/* 178 */           if (!this.zzr) {
/* 180 */               zzbkbVar.zzg();
/* 183 */               zzl();
                    } else if (!zzbkbVar.zzh()) {
/* 193 */               zzp();
                    } else {
/* 201 */               zzbkgVar.zza.zzb();
/* 206 */               zzbkg.zzh(zzbkgVar, zzauv.CONNECTING);
                    }
                }
            }
