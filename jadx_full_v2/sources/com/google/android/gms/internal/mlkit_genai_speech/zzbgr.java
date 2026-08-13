            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.Closeable;
            import java.io.IOException;
            import java.io.InputStream;
            import java.nio.charset.Charset;
            import java.util.Collections;
            import java.util.EnumSet;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.ThreadFactory;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public final class zzbgr {
                public static final zzaxk zza;
                public static final zzaxk zzb;
                public static final zzaxk zzc;
                public static final zzaxk zzd;
                public static final zzaxk zze;
                static final zzaxk zzf;
                public static final zzayu zzg;
                public static final zzatx zzh;
                public static final zzbnc zzi;
                public static final zzbnc zzj;
                public static final zzgu zzk;
                private static final Logger zzl = Logger.getLogger(zzbgr.class.getName());
                private static final Set zzm = Collections.unmodifiableSet(EnumSet.of(zzayz.OK, zzayz.INVALID_ARGUMENT, zzayz.NOT_FOUND, zzayz.ALREADY_EXISTS, zzayz.FAILED_PRECONDITION, zzayz.ABORTED, zzayz.OUT_OF_RANGE, zzayz.DATA_LOSS));
                private static final zzaum zzn;

                static {
/* 45 */            Charset.forName("US-ASCII");
/* 59 */            zza = zzaxk.zzc("grpc-timeout", new zzbgp());
/* 61 */            zzaxi zzaxiVar = zzaxq.zza;
/* 69 */            zzb = zzaxk.zzc("grpc-encoding", zzaxiVar);
/* 83 */            zzc = zzawf.zzb("grpc-accept-encoding", new zzbgo(null));
/* 91 */            zzd = zzaxk.zzc("content-encoding", zzaxiVar);
/* 104 */           zze = zzawf.zzb("accept-encoding", new zzbgo(null));
/* 112 */           zzf = zzaxk.zzc("content-length", zzaxiVar);
/* 116 */           zzaxk.zzc("content-type", zzaxiVar);
/* 121 */           zzaxk.zzc("te", zzaxiVar);
/* 126 */           zzaxk.zzc("user-agent", zzaxiVar);
/* 139 */           zzgq.zza(',').zzb(zzgg.zza());
/* 147 */           zzg = new zzbku();
/* 155 */           zzh = zzatx.zza("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
/* 162 */           zzn = new zzbgk();
/* 169 */           zzi = new zzbgl();
/* 176 */           zzj = new zzbgm();
/* 183 */           zzk = new zzbgn();
                }

                private zzbgr() {
                }

                public static zzazd zza(zzazd zzazdVar) {
/* 11 */            if (!zzm.contains(zzazdVar.zza())) {
/* 77 */                return zzazdVar;
                    }
/* 57 */            return zzazd.zzi.zze("Inappropriate status code from control plane: " + zzazdVar.zza().toString() + " " + zzazdVar.zzg()).zzd(zzazdVar.zzh());
                }

                public static zzbdn zzb(zzawp zzawpVar, boolean z) {
/* 1 */             zzawt zzawtVarZze = zzawpVar.zze();
/* 19 */            zzbdn zzbdnVarZzh = zzawtVarZze != null ? ((zzbnm) zzawtVarZze.zza()).zzh() : null;
/* 20 */            if (zzbdnVarZzh != null) {
/* 22 */                return zzbdnVarZzh;
                    }
/* 31 */            if (!zzawpVar.zzf().zzj()) {
/* 37 */                if (zzawpVar.zzh()) {
/* 51 */                    return new zzbgc(zza(zzawpVar.zzf()), zzbdl.DROPPED);
                        }
/* 55 */                if (!z) {
/* 69 */                    return new zzbgc(zza(zzawpVar.zzf()), zzbdl.PROCESSED);
                        }
                    }
/* 5 */             return null;
                }

                public static ThreadFactory zzc(String str, boolean z) {
/* 3 */             zzjp zzjpVar = new zzjp();
/* 7 */             zzjpVar.zza(true);
/* 10 */            zzjpVar.zzb(str);
/* 13 */            return zzjpVar.zzc();
                }

                public static void zzd(zzbni zzbniVar) throws IOException {
                    while (true) {
/* 1 */                 InputStream inputStreamZzf = zzbniVar.zzf();
/* 5 */                 if (inputStreamZzf == null) {
/* 29 */                    return;
                        } else {
/* 7 */                     zze(inputStreamZzf);
                        }
                    }
                }

                public static void zze(Closeable closeable) throws IOException {
                    try {
/* 1 */                 closeable.close();
                    } catch (IOException e) {
/* 17 */                zzl.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e);
                    }
                }

                public static boolean zzf(String str, boolean z) {
/* 1 */             String strTrim = System.getenv(str);
/* 5 */             if (strTrim == null) {
/* 7 */                 strTrim = System.getProperty(str);
                    }
/* 11 */            if (strTrim != null) {
/* 13 */                strTrim = strTrim.trim();
                    }
                    return z ? zzgt.zzc(strTrim) || Boolean.parseBoolean(strTrim) : !zzgt.zzc(strTrim) && Boolean.parseBoolean(strTrim);
                }

                public static zzaum[] zzg(zzatz zzatzVar, zzaxq zzaxqVar, int i, boolean z, boolean z2) {
/* 1 */             List listZzm = zzatzVar.zzm();
/* 5 */             int size = listZzm.size();
/* 11 */            zzaum[] zzaumVarArr = new zzaum[size + 1];
/* 13 */            zzauk zzaukVarZza = zzaul.zza();
/* 17 */            zzaukVarZza.zza(zzatzVar);
/* 20 */            zzaukVarZza.zzd(i);
/* 23 */            zzaukVarZza.zzc(z);
/* 26 */            zzaukVarZza.zzb(z2);
/* 29 */            zzaul zzaulVarZze = zzaukVarZza.zze();
/* 38 */            for (int i2 = 0; i2 < listZzm.size(); i2++) {
/* 50 */                zzaumVarArr[i2] = ((zzauj) listZzm.get(i2)).zza(zzaulVarZze, zzaxqVar);
                    }
/* 57 */            zzaumVarArr[size] = zzn;
/* 399 */           return zzaumVarArr;
                }
            }
