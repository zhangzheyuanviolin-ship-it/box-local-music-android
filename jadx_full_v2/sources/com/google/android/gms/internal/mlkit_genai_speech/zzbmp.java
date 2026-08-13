            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            
            public final class zzbmp extends zzayj {
                private final boolean zza;
                private final zzbcu zzb;

                public zzbmp(boolean z, int i, int i2, zzbcu zzbcuVar) {
/* 4 */             this.zza = z;
/* 8 */             zzgo.zzc(zzbcuVar, "autoLoadBalancerFactory");
/* 11 */            this.zzb = zzbcuVar;
                }

                @Override
                public final zzaye zza(Map map) {
                    Object objZzd;
                    zzbmi zzbmiVar;
                    zzbjp zzbjpVar;
                    Map mapZzj;
                    try {
/* 3 */                 zzaye zzayeVarZzc = this.zzb.zzc(map);
/* 7 */                 zzbjm zzbjmVar = null;
/* 8 */                 if (zzayeVarZzc == null) {
/* 10 */                    objZzd = null;
                        } else {
/* 16 */                    if (zzayeVarZzc.zzc() != null) {
/* 22 */                        return zzaye.zzb(zzayeVarZzc.zzc());
                            }
/* 27 */                    objZzd = zzayeVarZzc.zzd();
                        }
/* 32 */                boolean z = this.zza;
/* 36 */                if (!z || map == null || (mapZzj = zzbhr.zzj(map, "retryThrottling")) == null) {
/* 40 */                    zzbmiVar = null;
                        } else {
/* 57 */                    float fFloatValue = zzbhr.zzb(mapZzj, "maxTokens").floatValue();
/* 67 */                    float fFloatValue2 = zzbhr.zzb(mapZzj, "tokenRatio").floatValue();
/* 81 */                    zzgo.zzn(fFloatValue > 0.0f, "maxToken should be greater than zero");
/* 93 */                    zzgo.zzn(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
/* 98 */                    zzbmiVar = new zzbmi(fFloatValue, fFloatValue2);
                        }
/* 104 */               HashMap map2 = new HashMap();
/* 109 */               HashMap map3 = new HashMap();
/* 118 */               Map mapZzj2 = map == null ? null : zzbhr.zzj(map, "healthCheckConfig");
/* 125 */               List<Map> listZzh = zzbhr.zzh(map, "methodConfig");
/* 129 */               if (listZzh == null) {
/* 134 */                   zzbjpVar = new zzbjp(null, map2, map3, zzbmiVar, objZzd, mapZzj2);
                        } else {
/* 147 */                   for (Map map4 : listZzh) {
/* 158 */                       zzbjm zzbjmVar2 = new zzbjm(map4, z, 5, 5);
/* 163 */                       List<Map> listZzh2 = zzbhr.zzh(map4, "name");
/* 167 */                       if (listZzh2 != null && !listZzh2.isEmpty()) {
/* 183 */                           for (Map map5 : listZzh2) {
/* 193 */                               String strZze = zzbhr.zze(map5, "service");
/* 199 */                               String strZze2 = zzbhr.zze(map5, "method");
/* 207 */                               if (zzgt.zzc(strZze)) {
/* 215 */                                   zzgo.zzj(zzgt.zzc(strZze2), "missing service name for method %s", strZze2);
/* 225 */                                   zzgo.zzj(zzbjmVar == null, "Duplicate default method config in service config %s", map);
/* 228 */                                   zzbjmVar = zzbjmVar2;
                                        } else if (zzgt.zzc(strZze2)) {
/* 243 */                                   zzgo.zzj(!map3.containsKey(strZze), "Duplicate service %s", strZze);
/* 246 */                                   map3.put(strZze, zzbjmVar2);
                                        } else {
/* 250 */                                   String strZze3 = zzaxv.zze(strZze, strZze2);
/* 261 */                                   zzgo.zzj(!map2.containsKey(strZze3), "Duplicate method name %s", strZze3);
/* 264 */                                   map2.put(strZze3, zzbjmVar2);
                                        }
                                    }
                                }
                            }
/* 271 */                   zzbjpVar = new zzbjp(zzbjmVar, map2, map3, zzbmiVar, objZzd, mapZzj2);
                        }
/* 274 */               return zzaye.zza(zzbjpVar);
                    } catch (RuntimeException e) {
/* 293 */               return zzaye.zzb(zzazd.zzc.zze("failed to parse service config").zzd(e));
                    }
                }
            }
