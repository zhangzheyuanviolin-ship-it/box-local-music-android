            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.IlIi0I0;
            
            public final class zzbcu {
                private final zzaxa zza;
                private final String zzb;

                public zzbcu(zzaxa zzaxaVar, String str) {
/* 6 */             zzgo.zzc(zzaxaVar, "registry");
/* 9 */             this.zza = zzaxaVar;
/* 13 */            this.zzb = "pick_first";
                }

                public static zzawy zza(zzbcu zzbcuVar, String str, String str2) throws zzbcs {
/* 3 */             zzawy zzawyVarZza = zzbcuVar.zza.zza(str);
/* 7 */             if (zzawyVarZza != null) {
/* 9 */                 return zzawyVarZza;
                    }
/* 98 */            throw new zzbcs(IlIi0I0.I000lI("Trying to load '", str, "' because using default policy, but it's unavailable"), null);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final zzaye zzc(Map map) {
                    List<zzbmw> listUnmodifiableList;
                    String strZze;
/* 2 */             if (map != null) {
                        try {
/* 6 */                     ArrayList arrayList = new ArrayList();
/* 15 */                    if (map.containsKey("loadBalancingConfig")) {
/* 21 */                        arrayList.addAll(zzbhr.zzh(map, "loadBalancingConfig"));
                            }
/* 28 */                    if (arrayList.isEmpty() && (strZze = zzbhr.zze(map, "loadBalancingPolicy")) != null) {
/* 50 */                        arrayList.add(Collections.singletonMap(strZze.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
                            }
/* 53 */                    List<Map> listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
/* 57 */                    if (listUnmodifiableList2 == null) {
/* 59 */                        listUnmodifiableList = null;
                            } else {
/* 63 */                        ArrayList arrayList2 = new ArrayList();
/* 74 */                        for (Map map2 : listUnmodifiableList2) {
/* 87 */                            if (map2.size() != 1) {
/* 160 */                               throw new RuntimeException("There are " + map2.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + String.valueOf(map2));
                                    }
/* 107 */                           String str = (String) ((Map.Entry) map2.entrySet().iterator().next()).getKey();
/* 118 */                           arrayList2.add(new zzbmw(str, zzbhr.zzj(map2, str)));
                                }
/* 161 */                       listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                            }
                        } catch (RuntimeException e) {
/* 317 */                   return zzaye.zzb(zzazd.zzc.zze("can't parse load balancer configuration").zzd(e));
                        }
                    }
/* 165 */           if (listUnmodifiableList == null || listUnmodifiableList.isEmpty()) {
/* 1 */                 return null;
                    }
/* 173 */           zzaxa zzaxaVar = this.zza;
/* 177 */           ArrayList arrayList3 = new ArrayList();
/* 188 */           for (zzbmw zzbmwVar : listUnmodifiableList) {
/* 197 */               String strZza = zzbmwVar.zza();
/* 201 */               zzawy zzawyVarZza = zzaxaVar.zza(strZza);
/* 205 */               if (zzawyVarZza != null) {
/* 215 */                   if (!arrayList3.isEmpty()) {
/* 235 */                       Logger.getLogger(zzbmy.class.getName()).logp(Level.FINEST, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", arrayList3);
                            }
/* 242 */                   zzaye zzayeVarZzc = zzawyVarZza.zzc(zzbmwVar.zzb());
                            return zzayeVarZzc.zzc() == null ? zzaye.zza(new zzbmx(zzawyVarZza, zzayeVarZzc.zzd())) : zzayeVarZzc;
                        }
/* 207 */               arrayList3.add(strZza);
                    }
/* 298 */           return zzaye.zzb(zzazd.zzc.zze("None of " + arrayList3.toString() + " specified by Service Config are available."));
                }
            }
