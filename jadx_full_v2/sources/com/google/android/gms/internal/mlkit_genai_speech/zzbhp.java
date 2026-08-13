            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.SocketAddress;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            
            final class zzbhp implements zzawc, zzbnm {
                private zzbga zzA;
                private final zzawd zza;
                private final String zzb;
                private final zzbhh zzc;
                private final zzbdp zzd;
                private final ScheduledExecutorService zze;
                private final zzavv zzf;
                private final zzbda zzg;
                private final zzauc zzh;
                private final boolean zzi;
                private final List zzj;
                private final zzazm zzk;
                private final zzbhi zzl;
                private volatile List zzm;
                private final zzgs zzn;
                private zzazk zzo;
                private zzazk zzp;
                private zzbjr zzq;
                private zzbdr zzt;
                private volatile zzbjr zzu;
                private zzazd zzw;
                private volatile zzatu zzx;
                private final zzbnk zzy;
                private final String zzz;
                private final Collection zzr = new ArrayList();
                private final zzbgt zzs = new zzbgw(this);
                private volatile zzauw zzv = zzauw.zzb(zzauv.IDLE);

                public zzbhp(zzawk zzawkVar, String str, String str2, zzbfz zzbfzVar, zzbdp zzbdpVar, ScheduledExecutorService scheduledExecutorService, zzgu zzguVar, zzazm zzazmVar, zzbhh zzbhhVar, zzavv zzavvVar, zzbda zzbdaVar, zzbdc zzbdcVar, zzawd zzawdVar, zzauc zzaucVar, List list, String str3, zzaxz zzaxzVar) {
                    List listZzd = zzawkVar.zzd();
/* 4 */             zzgo.zzf(!listZzd.isEmpty(), "addressGroups is empty");
/* 5 */             zzL(listZzd, "addressGroups contains null entry");
/* 7 */             List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listZzd));
                    this.zzm = listUnmodifiableList;
                    this.zzl = new zzbhi(listUnmodifiableList);
                    this.zzb = str;
                    this.zzd = zzbdpVar;
                    this.zze = scheduledExecutorService;
/* 8 */             this.zzn = (zzgs) zzguVar.zza();
                    this.zzk = zzazmVar;
                    this.zzc = zzbhhVar;
                    this.zzf = zzavvVar;
                    this.zzg = zzbdaVar;
/* 9 */             this.zza = zzawdVar;
/* 10 */            this.zzh = zzaucVar;
                    this.zzj = list;
/* 11 */            this.zzi = ((Boolean) zzawkVar.zzc(zzawx.zzc)).booleanValue();
                    this.zzz = str3;
/* 12 */            this.zzy = new zzbnk(zzaxzVar);
                }

                public static void zzC(zzbhp zzbhpVar) {
/* 3 */             zzbhpVar.zzk.zzd();
/* 6 */             zzazk zzazkVar = zzbhpVar.zzo;
/* 8 */             if (zzazkVar != null) {
/* 10 */                zzazkVar.zza();
/* 14 */                zzbhpVar.zzo = null;
/* 16 */                zzbhpVar.zzA = null;
                    }
                }

                public static void zzD(zzbhp zzbhpVar, zzauv zzauvVar) {
/* 3 */             zzbhpVar.zzk.zzd();
/* 10 */            zzbhpVar.zzM(zzauw.zzb(zzauvVar));
                }

                public static void zzE(zzbhp zzbhpVar) {
/* 3 */             zzbhc zzbhcVar = new zzbhc(zzbhpVar);
/* 6 */             zzazm zzazmVar = zzbhpVar.zzk;
/* 8 */             zzazmVar.zzc(zzbhcVar);
/* 11 */            zzazmVar.zzb();
                }

                public static void zzF(zzbhp zzbhpVar, zzbdr zzbdrVar, boolean z) {
/* 3 */             zzbhd zzbhdVar = new zzbhd(zzbhpVar, zzbdrVar, z);
/* 6 */             zzazm zzazmVar = zzbhpVar.zzk;
/* 8 */             zzazmVar.zzc(zzbhdVar);
/* 11 */            zzazmVar.zzb();
                }

                public static void zzG(zzbhp zzbhpVar, zzazd zzazdVar) {
/* 1 */             zzazm zzazmVar = zzbhpVar.zzk;
/* 3 */             zzazmVar.zzd();
/* 10 */            zzbhpVar.zzM(zzauw.zzc(zzazdVar));
/* 15 */            if (zzbhpVar.zzi) {
/* 17 */                return;
                    }
/* 18 */            zzbga zzbgaVar = zzbhpVar.zzA;
/* 20 */            if (zzbgaVar == null) {
/* 24 */                zzbgaVar = new zzbga();
/* 27 */                zzbhpVar.zzA = zzbgaVar;
                    }
/* 29 */            long jZza = zzbgaVar.zza();
/* 33 */            zzgs zzgsVar = zzbhpVar.zzn;
/* 35 */            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
/* 41 */            long jZza2 = jZza - zzgsVar.zza(timeUnit);
/* 60 */            zzbhpVar.zzh.zzb(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", zzN(zzazdVar), Long.valueOf(jZza2));
/* 72 */            zzgo.zzn(zzbhpVar.zzo == null, "previous reconnectTask is not done");
/* 86 */            zzbhpVar.zzo = zzazmVar.zza(new zzbgx(zzbhpVar), jZza2, timeUnit, zzbhpVar.zze);
                }

                public static void zzH(zzbhp zzbhpVar) {
                    zzavq zzavqVar;
/* 1 */             zzazm zzazmVar = zzbhpVar.zzk;
/* 3 */             zzazmVar.zzd();
/* 15 */            zzgo.zzn(zzbhpVar.zzo == null, "Should have no reconnectTask scheduled");
/* 18 */            zzbhi zzbhiVar = zzbhpVar.zzl;
/* 24 */            if (zzbhiVar.zzf()) {
/* 26 */                zzgs zzgsVar = zzbhpVar.zzn;
/* 28 */                zzgsVar.zzc();
/* 31 */                zzgsVar.zzd();
                    }
/* 34 */            SocketAddress socketAddressZzb = zzbhiVar.zzb();
/* 40 */            zzbho zzbhoVar = null;
/* 41 */            if (socketAddressZzb instanceof zzavq) {
/* 43 */                zzavq zzavqVar2 = (zzavq) socketAddressZzb;
/* 50 */                zzavqVar = zzavqVar2;
/* 45 */                socketAddressZzb = zzavqVar2.zzb();
                    } else {
/* 53 */                zzavqVar = null;
                    }
/* 54 */            zzatu zzatuVarZza = zzbhiVar.zza();
/* 64 */            String str = (String) zzatuVarZza.zzc(zzavj.zza);
/* 68 */            zzbdo zzbdoVar = new zzbdo();
/* 71 */            if (str == null) {
/* 73 */                str = zzbhpVar.zzb;
                    }
/* 75 */            zzbdoVar.zzb(str);
/* 78 */            zzbdoVar.zzc(zzatuVarZza);
/* 81 */            zzbdoVar.zze(null);
/* 84 */            zzbdoVar.zzd(zzavqVar);
/* 89 */            zzbhn zzbhnVar = new zzbhn();
/* 94 */            zzbhnVar.zza = zzbhpVar.zza;
/* 106 */           zzbhg zzbhgVar = new zzbhg(zzbhpVar.zzd.zza(socketAddressZzb, zzbdoVar, zzbhnVar), zzbhpVar.zzg, zzbhoVar);
/* 113 */           zzbhnVar.zza = zzbhgVar.zzc();
/* 117 */           zzbhpVar.zzf.zzb(zzbhgVar);
/* 120 */           zzbhpVar.zzt = zzbhgVar;
/* 124 */           zzbhpVar.zzr.add(zzbhgVar);
/* 136 */           zzazmVar.zzc(zzbhgVar.zzf(new zzbhm(zzbhpVar, zzbhgVar)));
/* 150 */           zzbhpVar.zzh.zzb(2, "Started transport {0}", zzbhnVar.zza);
                }

                private static void zzL(List list, String str) {
/* 1 */             Iterator it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 15 */                zzgo.zzc(it.next(), str);
                    }
                }

                private final void zzM(zzauw zzauwVar) {
/* 3 */             this.zzk.zzd();
/* 16 */            if (this.zzv.zza() != zzauwVar.zza()) {
/* 37 */                zzgo.zzo(this.zzv.zza() != zzauv.SHUTDOWN, "Cannot transition out of SHUTDOWN to %s", zzauwVar.zza());
/* 42 */                if (this.zzi && zzauwVar.zza() == zzauv.TRANSIENT_FAILURE) {
/* 58 */                    this.zzv = zzauw.zzb(zzauv.IDLE);
                        } else {
/* 61 */                    this.zzv = zzauwVar;
                        }
/* 69 */                ((zzbiy) this.zzc).zza.zza(zzauwVar);
                    }
                }

                private static final String zzN(zzazd zzazdVar) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(zzazdVar.zza());
/* 17 */            if (zzazdVar.zzg() != null) {
/* 21 */                sb.append("(");
/* 28 */                sb.append(zzazdVar.zzg());
/* 33 */                sb.append(")");
                    }
/* 40 */            if (zzazdVar.zzh() != null) {
/* 44 */                sb.append("[");
/* 51 */                sb.append(zzazdVar.zzh());
/* 56 */                sb.append("]");
                    }
/* 59 */            return sb.toString();
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 13 */            zzgkVarZzb.zzc("logId", this.zza.zza());
/* 20 */            zzgkVarZzb.zzd("addressGroups", this.zzm);
/* 23 */            return zzgkVarZzb.toString();
                }

                public final void zzI(zzazd zzazdVar) {
/* 3 */             zzbhb zzbhbVar = new zzbhb(this, zzazdVar);
/* 6 */             zzazm zzazmVar = this.zzk;
/* 8 */             zzazmVar.zzc(zzbhbVar);
/* 11 */            zzazmVar.zzb();
                }

                public final void zzJ(List list) {
/* 3 */             zzgo.zzc(list, "newAddressGroups");
/* 8 */             zzL(list, "newAddressGroups contains null entry");
/* 19 */            zzgo.zzf(!list.isEmpty(), "newAddressGroups is empty");
/* 33 */            zzbha zzbhaVar = new zzbha(this, Collections.unmodifiableList(new ArrayList(list)));
/* 36 */            zzazm zzazmVar = this.zzk;
/* 38 */            zzazmVar.zzc(zzbhaVar);
/* 41 */            zzazmVar.zzb();
                }

                @Override
                public final zzawd zzc() {
/* 1 */             return this.zza;
                }

                @Override
                public final zzbdn zzh() {
/* 1 */             zzbjr zzbjrVar = this.zzu;
/* 3 */             if (zzbjrVar != null) {
/* 5 */                 return zzbjrVar;
                    }
/* 6 */             zzazm zzazmVar = this.zzk;
/* 13 */            zzazmVar.zzc(new zzbgy(this));
/* 16 */            zzazmVar.zzb();
/* 19 */            return null;
                }
            }
