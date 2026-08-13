            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.PrintWriter;
            import java.io.StringWriter;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Objects;
            import java.util.TreeMap;
            import p000.I000II;
            import p000.IIl001iO0Io;
            
            public final class zzazd {
                public static final zzazd zza;
                public static final zzazd zzb;
                public static final zzazd zzc;
                public static final zzazd zzd;
                public static final zzazd zze;
                public static final zzazd zzf;
                public static final zzazd zzg;
                public static final zzazd zzh;
                public static final zzazd zzi;
                public static final zzazd zzj;
                private static final List zzk;
                private static final zzaxo zzl;
                private final zzayz zzm;
                private final String zzn;
                private final Throwable zzo;

                /* JADX WARN: Multi-variable type inference failed */
                static {
/* 3 */             TreeMap treeMap = new TreeMap();
/* 6 */             zzayz[] zzayzVarArrValues = zzayz.values();
/* 10 */            int length = zzayzVarArrValues.length;
/* 11 */            boolean z = false;
/* 12 */            int i = 0;
                    while (true) {
/* 13 */                zzazc zzazcVar = null;
/* 13 */                Object[] objArr = 0;
/* 13 */                Object[] objArr2 = 0;
/* 14 */                if (i >= length) {
/* 77 */                    zzk = Collections.unmodifiableList(new ArrayList(treeMap.values()));
/* 85 */                    zza = zzayz.OK.zzb();
/* 93 */                    zzb = zzayz.CANCELLED.zzb();
/* 101 */                   zzc = zzayz.UNKNOWN.zzb();
/* 105 */                   zzayz.INVALID_ARGUMENT.zzb();
/* 114 */                   zzd = zzayz.DEADLINE_EXCEEDED.zzb();
/* 118 */                   zzayz.NOT_FOUND.zzb();
/* 123 */                   zzayz.ALREADY_EXISTS.zzb();
/* 132 */                   zze = zzayz.PERMISSION_DENIED.zzb();
/* 136 */                   zzayz.UNAUTHENTICATED.zzb();
/* 145 */                   zzf = zzayz.RESOURCE_EXHAUSTED.zzb();
/* 153 */                   zzg = zzayz.FAILED_PRECONDITION.zzb();
/* 157 */                   zzayz.ABORTED.zzb();
/* 162 */                   zzayz.OUT_OF_RANGE.zzb();
/* 171 */                   zzh = zzayz.UNIMPLEMENTED.zzb();
/* 179 */                   zzi = zzayz.INTERNAL.zzb();
/* 187 */                   zzj = zzayz.UNAVAILABLE.zzb();
/* 191 */                   zzayz.DATA_LOSS.zzb();
/* 196 */                   zzaza zzazaVar = new zzaza(zzazcVar);
/* 199 */                   int i2 = zzaxk.zza;
/* 205 */                   new zzaxn("grpc-status", z, zzazaVar, objArr2 == true ? 1 : 0);
/* 210 */                   zzazb zzazbVar = new zzazb(null);
/* 213 */                   zzl = zzazbVar;
/* 219 */                   new zzaxn("grpc-message", z, zzazbVar, objArr == true ? 1 : 0);
/* 245 */                   return;
                        }
/* 16 */                zzayz zzayzVar = zzayzVarArrValues[i];
/* 35 */                zzazd zzazdVar = (zzazd) treeMap.put(Integer.valueOf(zzayzVar.zza()), new zzazd(zzayzVar, null, null));
/* 37 */                if (zzazdVar != null) {
/* 60 */                    I000II.I001IO000(IIl001iO0Io.I000oI1ioi("Code value duplication between ", zzazdVar.zzm.name(), " & ", zzayzVar.name()));
/* 63 */                    return;
                        }
/* 39 */                i++;
                    }
                }

                private zzazd(zzayz zzayzVar, String str, Throwable th) {
/* 6 */             zzgo.zzc(zzayzVar, "code");
/* 9 */             this.zzm = zzayzVar;
/* 11 */            this.zzn = str;
/* 13 */            this.zzo = th;
                }

                public static zzazd zzb(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 List list = zzk;
/* 9 */                 if (i < list.size()) {
/* 16 */                    return (zzazd) list.get(i);
                        }
                    }
/* 35 */            return zzc.zze("Unknown code " + i);
                }

                public static zzazd zzc(Throwable th) {
/* 3 */             zzgo.zzc(th, "t");
/* 7 */             for (Throwable cause = th; cause != null; cause = cause.getCause()) {
/* 11 */                if (cause instanceof zzaze) {
/* 15 */                    return ((zzaze) cause).zza();
                        }
/* 22 */                if (cause instanceof zzazg) {
/* 26 */                    return ((zzazg) cause).zza();
                        }
                    }
/* 38 */            return zzc.zzd(th);
                }

                public static String zzf(zzazd zzazdVar) {
/* 1 */             String str = zzazdVar.zzn;
/* 3 */             zzayz zzayzVar = zzazdVar.zzm;
/* 5 */             if (str == null) {
/* 7 */                 return zzayzVar.toString();
                    }
/* 32 */            return zzayzVar.toString() + ": " + str;
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 13 */            zzgkVarZzb.zzd("code", this.zzm.name());
/* 20 */            zzgkVarZzb.zzd("description", this.zzn);
/* 23 */            Throwable th = this.zzo;
                    Object string = th;
/* 25 */            if (th != null) {
/* 27 */                int i = zzgv.zza;
/* 31 */                StringWriter stringWriter = new StringWriter();
/* 39 */                th.printStackTrace(new PrintWriter(stringWriter));
/* 42 */                string = stringWriter.toString();
                    }
/* 48 */            zzgkVarZzb.zzd("cause", string);
/* 51 */            return zzgkVarZzb.toString();
                }

                public final zzayz zza() {
/* 1 */             return this.zzm;
                }

                public final zzazd zzd(Throwable th) {
                    return Objects.equals(this.zzo, th) ? this : new zzazd(this.zzm, this.zzn, th);
                }

                public final zzazd zze(String str) {
                    return Objects.equals(this.zzn, str) ? this : new zzazd(this.zzm, str, this.zzo);
                }

                public final String zzg() {
/* 1 */             return this.zzn;
                }

                public final Throwable zzh() {
/* 1 */             return this.zzo;
                }

                public final boolean zzj() {
                    return zzayz.OK == this.zzm;
                }
            }
