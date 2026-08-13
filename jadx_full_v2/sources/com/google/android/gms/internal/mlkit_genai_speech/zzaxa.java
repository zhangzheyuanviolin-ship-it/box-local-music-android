            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            public final class zzaxa {
                private static final Logger zza = Logger.getLogger(zzaxa.class.getName());
                private static zzaxa zzb;
                private static final Iterable zzc;
                private final LinkedHashSet zzd = new LinkedHashSet();
                private final LinkedHashMap zze = new LinkedHashMap();

                static {
/* 15 */            ArrayList arrayList = new ArrayList();
                    try {
/* 20 */                int i = zzbkq.zzb;
/* 22 */                arrayList.add(zzbkq.class);
                    } catch (ClassNotFoundException e) {
/* 38 */                zza.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
                    }
                    try {
/* 47 */                arrayList.add(Class.forName("io.grpc.util.SecretRoundRobinLoadBalancerProvider$Provider"));
                    } catch (ClassNotFoundException e2) {
/* 63 */                zza.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
                    }
/* 70 */            zzc = Collections.unmodifiableList(arrayList);
                }

                public static synchronized zzaxa zzb() {
                    try {
/* 6 */                 if (zzb == null) {
/* 21 */                    List<zzawy> listZza = zzayy.zza(zzawy.class, zzc, zzawy.class.getClassLoader(), new zzawz());
/* 30 */                    zzb = new zzaxa();
/* 40 */                    for (zzawy zzawyVar : listZza) {
/* 66 */                        zza.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(zzawyVar)));
/* 71 */                        zzb.zzc(zzawyVar);
                            }
/* 79 */                    zzb.zzd();
                        }
                    } catch (Throwable th) {
/* 110 */               throw th;
                    }
/* 82 */            return zzb;
                }

                private final synchronized void zzc(zzawy zzawyVar) {
/* 2 */             zzawyVar.zze();
/* 7 */             this.zzd.add(zzawyVar);
                }

                private final synchronized void zzd() {
                    try {
/* 2 */                 LinkedHashMap linkedHashMap = this.zze;
/* 4 */                 linkedHashMap.clear();
/* 9 */                 Iterator it = this.zzd.iterator();
/* 17 */                while (it.hasNext()) {
/* 23 */                    zzawy zzawyVar = (zzawy) it.next();
/* 25 */                    String strZzd = zzawyVar.zzd();
/* 35 */                    if (((zzawy) linkedHashMap.get(strZzd)) != null) {
/* 37 */                        zzawyVar.zzb();
                            } else {
/* 43 */                        linkedHashMap.put(strZzd, zzawyVar);
                            }
                        }
                    } catch (Throwable th) {
/* 55 */                throw th;
                    }
                }

                public final synchronized zzawy zza(String str) {
/* 8 */             return (zzawy) this.zze.get(str);
                }
            }
