            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.List;
            import java.util.Set;
            
            public final class zzaxx {
                private static zzaxx zza;
                private final Object zzb = new Object();
                private final Set zzc = new HashSet();
                private zzaxw[] zzd = new zzaxw[5];
                private int zze;

                public static synchronized zzaxx zzc() {
                    zzaxx zzaxxVar;
/* 4 */             zzaxxVar = zza;
/* 6 */             if (zzaxxVar == null) {
/* 10 */                zzaxxVar = new zzaxx();
/* 13 */                zza = zzaxxVar;
                    }
/* 19 */            return zzaxxVar;
                }

                private final void zze() {
/* 1 */             zzaxw[] zzaxwVarArr = this.zzd;
/* 12 */            this.zzd = (zzaxw[]) Arrays.copyOf(zzaxwVarArr, zzaxwVarArr.length + 5);
                }

                public final zzaxb zza(String str, String str2, String str3, List list, List list2, boolean z) {
                    zzaxb zzaxbVar;
/* 11 */            zzgo.zzf(!zzgt.zzc(str), "missing metric name");
                    synchronized (this.zzb) {
                        try {
/* 17 */                    Set set = this.zzc;
/* 23 */                    if (set.contains(str)) {
/* 89 */                        throw new IllegalStateException("Metric with name " + str + " already exists");
                            }
/* 25 */                    int i = this.zze;
/* 32 */                    if (i + 1 == this.zzd.length) {
/* 34 */                        zze();
                            }
/* 49 */                    zzaxbVar = new zzaxb(i, str, str2, str3, list, list2, false);
/* 54 */                    this.zzd[i] = zzaxbVar;
/* 56 */                    set.add(str);
                            this.zze++;
                        } catch (Throwable th) {
/* 685 */                   throw th;
                        }
                    }
/* 66 */            return zzaxbVar;
                }

                public final zzaxc zzb(String str, String str2, String str3, List list, List list2, boolean z) {
                    zzaxc zzaxcVar;
/* 11 */            zzgo.zzf(!zzgt.zzc("grpc.subchannel.open_connections"), "missing metric name");
                    synchronized (this.zzb) {
                        try {
/* 21 */                    Set set = this.zzc;
/* 27 */                    if (set.contains("grpc.subchannel.open_connections")) {
/* 75 */                        throw new IllegalStateException("Metric with name grpc.subchannel.open_connections already exists");
                            }
/* 29 */                    int i = this.zze;
/* 36 */                    if (i + 1 == this.zzd.length) {
/* 38 */                        zze();
                            }
/* 50 */                    zzaxcVar = new zzaxc(i, "grpc.subchannel.open_connections", "EXPERIMENTAL. Number of open connections.", "{connection}", list, list2, false);
/* 55 */                    this.zzd[i] = zzaxcVar;
/* 57 */                    set.add("grpc.subchannel.open_connections");
                            this.zze++;
                        } catch (Throwable th) {
/* 685 */                   throw th;
                        }
                    }
/* 67 */            return zzaxcVar;
                }

                public final List zzd() {
                    List listUnmodifiableList;
                    synchronized (this.zzb) {
/* 19 */                listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((zzaxw[]) Arrays.copyOfRange(this.zzd, 0, this.zze)));
                    }
/* 24 */            return listUnmodifiableList;
                }
            }
