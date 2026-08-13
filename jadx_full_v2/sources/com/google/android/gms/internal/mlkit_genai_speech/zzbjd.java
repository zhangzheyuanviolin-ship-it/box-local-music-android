            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.URI;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.IdentityHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.Executor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.logging.Logger;
            import p000.I000II;
            import p000.IlIi0I0;
            
            final class zzbjd extends zzaxd implements zzawc {
                static final Logger zza = Logger.getLogger(zzbjd.class.getName());
                static final zzazd zzb;
                static final zzazd zzc;
                private static final zzbjp zzf;
                private static final zzavz zzg;
                private static final zzawo zzh;
                private static final zzaue zzi;
                private final zzaua zzA;
                private final List zzB;
                private zzayl zzC;
                private boolean zzD;
                private zzbil zzE;
                private boolean zzF;
                private final Set zzG;
                private Collection zzH;
                private final Object zzI;
                private final Set zzJ;
                private final zzbes zzK;
                private final zzbjb zzL;
                private final AtomicBoolean zzM;
                private boolean zzN;
                private volatile boolean zzO;
                private final CountDownLatch zzP;
                private final zzbcz zzQ;
                private final zzbda zzR;
                private final zzbdc zzS;
                private final zzauc zzT;
                private final zzavv zzU;
                private final zzbiw zzV;
                private zzbjp zzW;
                private boolean zzX;
                private final boolean zzY;
                private final zzbls zzZ;
                private final long zzaa;
                private final long zzab;
                private final boolean zzac;
                private final zzbjq zzad;
                private final zzbid zzae;
                private final zzbkz zzaf;
                private final zzaxz zzag;
                private int zzah;
                private final zzbfz zzai;
                final zzazm zzd;
                final zzbgt zze;
                private final zzawd zzj;
                private final String zzk;
                private final URI zzl;
                private final zzaym zzm;
                private final zzayd zzn;
                private final zzbcu zzo;
                private final zzbdp zzp;
                private final zzbix zzq;
                private final Executor zzr;
                private final zzbju zzs;
                private final zzbih zzt;
                private final zzbih zzu;
                private final zzbnl zzv;
                private final zzavi zzw;
                private final zzgu zzx;
                private final long zzy;
                private final zzbdt zzz;

                static {
/* 13 */            zzazd zzazdVar = zzazd.zzj;
/* 17 */            zzazdVar.zze("Channel shutdownNow invoked");
/* 26 */            zzb = zzazdVar.zze("Channel shutdown invoked");
/* 34 */            zzc = zzazdVar.zze("Subchannel shutdown invoked");
/* 55 */            zzf = new zzbjp(null, new HashMap(), new HashMap(), null, null, null);
/* 62 */            zzg = new zzbhv();
/* 69 */            zzh = new zzbhz();
/* 76 */            zzi = new zzbib();
                }

                public zzbjd(zzbjj zzbjjVar, zzbdp zzbdpVar, URI uri, zzaym zzaymVar, zzbfz zzbfzVar, zzbju zzbjuVar, zzgu zzguVar, List list, zzbnl zzbnlVar) {
/* 25 */            zzazm zzazmVar = new zzazm(new zzbia(this));
/* 28 */            this.zzd = zzazmVar;
/* 35 */            this.zzz = new zzbdt();
/* 46 */            this.zzG = new HashSet(16, 0.75f);
/* 53 */            this.zzI = new Object();
/* 61 */            this.zzJ = new HashSet(1, 0.75f);
/* 65 */            zzbjc zzbjcVar = null;
/* 69 */            this.zzL = new zzbjb(this, zzbjcVar);
/* 77 */            this.zzM = new AtomicBoolean(false);
/* 84 */            this.zzP = new CountDownLatch(1);
/* 86 */            this.zzah = 1;
/* 90 */            this.zzW = zzf;
/* 92 */            this.zzX = false;
/* 99 */            this.zzZ = new zzbls();
/* 101 */           int i = zzavf.zza;
/* 108 */           this.zzad = new zzbig(this, zzbjcVar);
/* 115 */           this.zze = new zzbii(this, zzbjcVar);
/* 122 */           this.zzae = new zzbid(this, null);
/* 124 */           String str = zzbjjVar.zzh;
/* 128 */           zzgo.zzc(str, "target");
/* 131 */           this.zzk = str;
/* 135 */           zzawd zzawdVarZzc = zzawd.zzc("Channel", str);
/* 139 */           this.zzj = zzawdVarZzc;
/* 143 */           zzgo.zzc(zzbnlVar, "timeProvider");
/* 146 */           this.zzv = zzbnlVar;
/* 148 */           zzbju zzbjuVar2 = zzbjjVar.zzd;
/* 152 */           zzgo.zzc(zzbjuVar2, "executorPool");
/* 155 */           this.zzs = zzbjuVar2;
/* 161 */           Executor executor = (Executor) zzbjuVar2.zza();
/* 165 */           zzgo.zzc(executor, "executor");
/* 168 */           this.zzr = executor;
/* 172 */           zzbju zzbjuVar3 = zzbjjVar.zze;
/* 176 */           zzgo.zzc(zzbjuVar3, "offloadExecutorPool");
/* 179 */           zzbih zzbihVar = new zzbih(zzbjuVar3);
/* 182 */           this.zzu = zzbihVar;
/* 186 */           zzbcy zzbcyVar = new zzbcy(zzbdpVar, null, zzbihVar);
/* 189 */           this.zzp = zzbcyVar;
/* 193 */           new zzbcy(zzbdpVar, null, zzbihVar);
/* 202 */           zzbix zzbixVar = new zzbix(zzbcyVar.zzb(), zzbjcVar);
/* 205 */           this.zzq = zzbixVar;
/* 222 */           zzbdc zzbdcVar = new zzbdc(zzawdVarZzc, 0, zzbnlVar.zza(), IlIi0I0.I000lI("Channel for '", str, "'"));
/* 225 */           this.zzS = zzbdcVar;
/* 229 */           zzbdb zzbdbVar = new zzbdb(zzbdcVar, zzbnlVar);
/* 232 */           this.zzT = zzbdbVar;
/* 234 */           zzayu zzayuVar = zzbgr.zzg;
/* 236 */           this.zzac = true;
/* 246 */           zzbcu zzbcuVar = new zzbcu(zzaxa.zzb(), zzbjjVar.zzj);
/* 249 */           this.zzo = zzbcuVar;
/* 251 */           this.zzl = uri;
/* 253 */           this.zzm = zzaymVar;
/* 258 */           zzbmp zzbmpVar = new zzbmp(true, 5, 5, zzbcuVar);
/* 269 */           zzbjs zzbjsVar = new zzbjs(zzbjjVar.zzo, zzaxx.zzc());
/* 272 */           this.zzag = zzbjsVar;
/* 274 */           zzayb zzaybVarZzb = zzayd.zzb();
/* 280 */           zzaybVarZzb.zze(443);
/* 283 */           zzaybVarZzb.zzi(zzayuVar);
/* 286 */           zzaybVarZzb.zzl(zzazmVar);
/* 289 */           zzaybVarZzb.zzj(zzbixVar);
/* 292 */           zzaybVarZzb.zzk(zzbmpVar);
/* 295 */           zzaybVarZzb.zzd(zzbdbVar);
/* 298 */           zzaybVarZzb.zzh(zzbihVar);
/* 301 */           zzaybVarZzb.zzf(zzbjsVar);
/* 306 */           zzaybVarZzb.zzg(zzbjjVar.zzf);
/* 309 */           IdentityHashMap identityHashMap = zzbjjVar.zzi;
/* 311 */           if (identityHashMap != null) {
/* 325 */               for (Map.Entry entry : identityHashMap.entrySet()) {
/* 343 */                   zzaybVarZzb.zzc((zzayc) entry.getKey(), entry.getValue());
                        }
                    }
/* 347 */           zzayd zzaydVarZzm = zzaybVarZzb.zzm();
/* 351 */           this.zzn = zzaydVarZzm;
/* 357 */           this.zzC = zzp(uri, null, zzaymVar, zzaydVarZzm);
/* 366 */           this.zzt = new zzbih(zzbjuVar);
/* 374 */           zzbes zzbesVar = new zzbes(this.zzr, this.zzd);
/* 377 */           this.zzK = zzbesVar;
/* 381 */           zzbesVar.zzf(this.zzad);
/* 386 */           this.zzai = zzbfzVar;
/* 389 */           this.zzY = true;
/* 399 */           zzbiw zzbiwVar = new zzbiw(this, this.zzC.zza(), zzbjcVar);
/* 402 */           this.zzV = zzbiwVar;
/* 410 */           this.zzA = zzaui.zza(zzbiwVar, list);
/* 419 */           this.zzB = new ArrayList(zzbjjVar.zzg);
/* 423 */           zzgo.zzc(zzguVar, "stopwatchSupplier");
/* 426 */           this.zzx = zzguVar;
/* 428 */           long j = zzbjjVar.zzm;
/* 434 */           if (j == -1) {
/* 436 */               this.zzy = -1L;
                    } else {
/* 450 */               zzgo.zzi(j >= zzbjj.zzb, "invalid idleTimeoutMillis %s", j);
/* 455 */               this.zzy = zzbjjVar.zzm;
                    }
/* 479 */           this.zzaf = new zzbkz(new zzbij(this, zzbjcVar), this.zzd, this.zzp.zzb(), zzgs.zzb());
/* 481 */           zzavi zzaviVar = zzbjjVar.zzk;
/* 485 */           zzgo.zzc(zzaviVar, "decompressorRegistry");
/* 488 */           this.zzw = zzaviVar;
/* 494 */           zzgo.zzc(zzbjjVar.zzl, "compressorRegistry");
/* 500 */           this.zzab = 16777216L;
/* 505 */           this.zzaa = 1048576L;
/* 509 */           zzbhx zzbhxVar = new zzbhx(this, zzbnlVar);
/* 512 */           this.zzQ = zzbhxVar;
/* 518 */           this.zzR = zzbhxVar.zza();
/* 520 */           zzavv zzavvVar = zzbjjVar.zzn;
/* 522 */           zzavvVar.getClass();
/* 525 */           this.zzU = zzavvVar;
/* 527 */           zzavvVar.zzc(this);
                }

                public static Executor zzM(zzbjd zzbjdVar, zzatz zzatzVar) {
/* 1 */             Executor executorZzn = zzatzVar.zzn();
                    return executorZzn == null ? zzbjdVar.zzr : executorZzn;
                }

                public static void zzT(zzbjd zzbjdVar) {
/* 2 */             zzbjdVar.zzal(true);
/* 5 */             zzbes zzbesVar = zzbjdVar.zzK;
/* 8 */             zzbesVar.zzl(null);
/* 16 */            zzbjdVar.zzT.zza(2, "Entering IDLE state");
/* 23 */            zzbjdVar.zzz.zza(zzauv.IDLE);
/* 38 */            if (zzbjdVar.zze.zzd(zzbjdVar.zzI, zzbesVar)) {
/* 40 */                zzbjdVar.zzZ();
                    }
                }

                public static void zzU(zzbjd zzbjdVar) {
/* 3 */             if (!zzbjdVar.zzO && zzbjdVar.zzM.get() && zzbjdVar.zzG.isEmpty() && zzbjdVar.zzJ.isEmpty()) {
/* 35 */                zzbjdVar.zzT.zza(2, "Terminated");
/* 40 */                zzbjdVar.zzU.zzf(zzbjdVar);
/* 47 */                zzbjdVar.zzs.zzb(zzbjdVar.zzr);
/* 52 */                zzbjdVar.zzt.zzb();
/* 57 */                zzbjdVar.zzu.zzb();
/* 62 */                zzbjdVar.zzp.close();
/* 66 */                zzbjdVar.zzO = true;
/* 70 */                zzbjdVar.zzP.countDown();
                    }
                }

                public static void zzV(zzbjd zzbjdVar) {
/* 3 */             zzbjdVar.zzd.zzd();
/* 8 */             if (zzbjdVar.zzD) {
/* 12 */                zzbjdVar.zzC.zzb();
                    }
                }

                private final void zzak() {
/* 1 */             long j = this.zzy;
/* 7 */             if (j == -1) {
/* 9 */                 return;
                    }
/* 14 */            this.zzaf.zzi(j, TimeUnit.MILLISECONDS);
                }

                private final void zzal(boolean z) {
/* 3 */             this.zzd.zzd();
/* 7 */             if (z) {
/* 13 */                zzgo.zzn(this.zzD, "nameResolver is not started");
/* 25 */                zzgo.zzn(this.zzE != null, "lbHelper is null");
                    }
/* 28 */            zzayl zzaylVar = this.zzC;
/* 31 */            if (zzaylVar != null) {
/* 33 */                zzaylVar.zzc();
/* 36 */                this.zzD = false;
/* 38 */                if (z) {
/* 50 */                    this.zzC = zzp(this.zzl, null, this.zzm, this.zzn);
                        } else {
/* 53 */                    this.zzC = null;
                        }
                    }
/* 55 */            zzbil zzbilVar = this.zzE;
/* 57 */            if (zzbilVar != null) {
/* 61 */                zzbilVar.zza.zzc();
/* 64 */                this.zzE = null;
                    }
                }

                public static zzayl zzp(URI uri, String str, zzaym zzaymVar, zzayd zzaydVar) {
/* 1 */             zzayl zzaylVarZza = zzaymVar.zza(uri, zzaydVar);
/* 5 */             if (zzaylVarZza != null) {
/* 31 */                return new zzbmo(zzaylVarZza, new zzbcw(new zzbfz(), zzaydVar.zzh(), zzaydVar.zze()), zzaydVar.zze());
                    }
/* 45 */            I000II.I000iOII("cannot create a NameResolver for ".concat(String.valueOf(uri)));
/* 48 */            return null;
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 13 */            zzgkVarZzb.zzc("logId", this.zzj.zza());
/* 20 */            zzgkVarZzb.zzd("target", this.zzk);
/* 23 */            return zzgkVarZzb.toString();
                }

                public final zzbjd zzB() {
/* 6 */             this.zzT.zza(1, "shutdown() called");
/* 16 */            if (!this.zzM.compareAndSet(false, true)) {
/* 18 */                return this;
                    }
/* 19 */            zzazm zzazmVar = this.zzd;
/* 26 */            zzazmVar.zzc(new zzbhy(this));
/* 29 */            zzazmVar.zzb();
/* 32 */            zzbiw zzbiwVar = this.zzV;
/* 36 */            zzazm zzazmVar2 = zzbiwVar.zza.zzd;
/* 43 */            zzazmVar2.zzc(new zzbip(zzbiwVar));
/* 46 */            zzazmVar2.zzb();
/* 54 */            zzazmVar.zzc(new zzbhw(this));
/* 57 */            zzazmVar.zzb();
/* 110 */           return this;
                }

                public final void zzZ() {
/* 3 */             this.zzd.zzd();
/* 12 */            if (this.zzM.get() || this.zzF) {
/* 110 */               return;
                    }
/* 25 */            if (this.zze.zze()) {
/* 30 */                this.zzaf.zzh(false);
                    } else {
/* 34 */                zzak();
                    }
/* 39 */            if (this.zzE == null) {
/* 46 */                this.zzT.zza(2, "Exiting idle mode");
/* 52 */                zzbil zzbilVar = new zzbil(this, null);
/* 62 */                zzbilVar.zza = new zzbco(this.zzo, zzbilVar);
/* 64 */                this.zzE = zzbilVar;
/* 70 */                this.zzz.zza(zzauv.CONNECTING);
/* 82 */                this.zzC.zzd(new zzbin(this, zzbilVar, this.zzC));
/* 86 */                this.zzD = true;
                    }
                }

                @Override
                public final zzaue zza(zzaxv zzaxvVar, zzatz zzatzVar) {
/* 3 */             return this.zzA.zza(zzaxvVar, zzatzVar);
                }

                public final void zzaa(Throwable th) {
/* 7 */             if (this.zzF) {
/* 9 */                 return;
                    }
/* 11 */            this.zzF = true;
                    try {
/* 17 */                this.zzaf.zzh(true);
/* 21 */                zzal(false);
                    } finally {
/* 88 */                this.zzK.zzl(new zzawm(zzawp.zza(zzazd.zzi.zze("Panic! This is a bug!").zzd(th))));
/* 93 */                this.zzV.zzg(null);
/* 98 */                this.zzT.zza(4, "PANIC! Entering TRANSIENT_FAILURE");
/* 105 */               this.zzz.zza(zzauv.TRANSIENT_FAILURE);
                    }
                }

                @Override
                public final String zzb() {
/* 3 */             return this.zzA.zzb();
                }

                @Override
                public final zzawd zzc() {
/* 1 */             return this.zzj;
                }

                @Override
                public final zzaxd zzd() {
/* 1 */             zzB();
/* 20 */            return this;
                }
            }
