            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            import java.io.StringReader;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.I000II;
            
            public final class zzbhq {
                private static final Logger zza = Logger.getLogger(zzbhq.class.getName());

                private zzbhq() {
                }

                public static Object zza(String str) {
/* 8 */             zzkr zzkrVar = new zzkr(new StringReader(str));
                    try {
/* 11 */                Object objZzb = zzb(zzkrVar);
                        try {
/* 15 */                    zzkrVar.close();
/* 18 */                    return objZzb;
                        } catch (IOException e) {
/* 31 */                    zza.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e);
/* 34 */                    return objZzb;
                        }
                    } finally {
                    }
                }

                private static Object zzb(zzkr zzkrVar) {
/* 7 */             zzgo.zzn(zzkrVar.zzl(), "unexpected end of JSON");
                    int iZzn = zzkrVar.zzn() - 1;
/* 21 */            if (iZzn == 0) {
/* 141 */               zzkrVar.zzg();
/* 146 */               ArrayList arrayList = new ArrayList();
/* 153 */               while (zzkrVar.zzl()) {
/* 159 */                   arrayList.add(zzb(zzkrVar));
                        }
/* 178 */               zzgo.zzn(zzkrVar.zzn() == 2, "Bad token: ".concat(zzkrVar.zzc()));
/* 181 */               zzkrVar.zzi();
/* 184 */               return Collections.unmodifiableList(arrayList);
                    }
/* 23 */            if (iZzn == 2) {
/* 78 */                zzkrVar.zzh();
/* 83 */                LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 90 */                while (zzkrVar.zzl()) {
/* 92 */                    String strZze = zzkrVar.zze();
/* 103 */                   zzgo.zzj(!linkedHashMap.containsKey(strZze), "Duplicate key found: %s", strZze);
/* 110 */                   linkedHashMap.put(strZze, zzb(zzkrVar));
                        }
/* 130 */               zzgo.zzn(zzkrVar.zzn() == 4, "Bad token: ".concat(zzkrVar.zzc()));
/* 133 */               zzkrVar.zzj();
/* 136 */               return Collections.unmodifiableMap(linkedHashMap);
                    }
/* 26 */            if (iZzn == 5) {
/* 73 */                return zzkrVar.zzf();
                    }
/* 29 */            if (iZzn == 6) {
/* 68 */                return Double.valueOf(zzkrVar.zza());
                    }
/* 32 */            if (iZzn == 7) {
/* 59 */                return Boolean.valueOf(zzkrVar.zzm());
                    }
/* 37 */            if (iZzn == 8) {
/* 39 */                zzkrVar.zzk();
/* 36 */                return null;
                    }
/* 51 */            I000II.I001IO000("Bad token: ".concat(zzkrVar.zzc()));
/* 36 */            return null;
                }
            }
