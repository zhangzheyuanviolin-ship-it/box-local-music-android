            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public final class zzayq {
                private static final Logger zza = Logger.getLogger(zzayq.class.getName());
                private static zzayq zzb;
                private String zzc;
                private final LinkedHashSet zzd;
                private zzhn zze;

                public zzayq() {
/* 7 */             new zzayn(this, null);
/* 12 */            this.zzc = "unknown";
/* 19 */            this.zzd = new LinkedHashSet();
/* 25 */            this.zze = zzhn.zzd();
                }

                public static synchronized zzayq zzb() {
/* 6 */             if (zzb == null) {
/* 10 */                ArrayList arrayList = new ArrayList();
                        try {
/* 15 */                    int i = zzbfy.I00000oIO;
/* 17 */                    arrayList.add(zzbfy.class);
                        } catch (ClassNotFoundException e) {
/* 36 */                    zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
                        }
                        try {
/* 41 */                    arrayList.add(zzbbl.class);
                        } catch (ClassNotFoundException e2) {
/* 57 */                    zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find IntentNameResolverProvider", (Throwable) e2);
                        }
/* 76 */                List<zzaym> listZza = zzayy.zza(zzaym.class, Collections.unmodifiableList(arrayList), zzaym.class.getClassLoader(), new zzayo(null));
/* 84 */                if (listZza.isEmpty()) {
/* 96 */                    zza.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                        }
/* 104 */               zzb = new zzayq();
/* 114 */               for (zzaym zzaymVar : listZza) {
/* 140 */                   zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(zzaymVar)));
/* 145 */                   zzb.zzf(zzaymVar);
                        }
/* 151 */               zzb.zzg();
                    }
/* 154 */           return zzb;
                }

                private final synchronized void zzf(zzaym zzaymVar) {
/* 2 */             zzaymVar.zze();
/* 7 */             this.zzd.add(zzaymVar);
                }

                private final synchronized void zzg() {
                    try {
/* 4 */                 HashMap map = new HashMap();
/* 9 */                 Iterator it = this.zzd.iterator();
/* 13 */                String strZzb = "unknown";
/* 15 */                int iZzc = Integer.MIN_VALUE;
/* 21 */                while (it.hasNext()) {
/* 27 */                    zzaym zzaymVar = (zzaym) it.next();
/* 29 */                    String strZzb2 = zzaymVar.zzb();
/* 37 */                    zzaym zzaymVar2 = (zzaym) map.get(strZzb2);
/* 39 */                    if (zzaymVar2 != null) {
/* 49 */                        if (zzaymVar2.zzc() < zzaymVar.zzc()) {
/* 54 */                            map.put(strZzb2, zzaymVar);
                                }
                            } else {
/* 54 */                        map.put(strZzb2, zzaymVar);
                            }
/* 61 */                    if (iZzc < zzaymVar.zzc()) {
/* 63 */                        iZzc = zzaymVar.zzc();
/* 67 */                        strZzb = zzaymVar.zzb();
                            }
                        }
/* 80 */                this.zze = zzhn.zzc(map.entrySet());
/* 82 */                this.zzc = strZzb;
                    } catch (Throwable th) {
/* 110 */               throw th;
                    }
                }

                public final zzaym zza(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return null;
                    }
/* 19 */            return (zzaym) zzd().get(str.toLowerCase(Locale.US));
                }

                public final synchronized String zzc() {
/* 2 */             return this.zzc;
                }

                public final synchronized Map zzd() {
/* 2 */             return this.zze;
                }

                public final synchronized void zze(zzaym zzaymVar) {
/* 2 */             zzf(zzaymVar);
/* 5 */             zzg();
                }
            }
