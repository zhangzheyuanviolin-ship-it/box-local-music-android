            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            import java.nio.charset.Charset;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import p000.I000II;
            
/* 193 */   public final class zzavi {
                static final zzgh zza = zzgh.zza(',');
                private static final zzavi zzb = new zzavi(zzaup.zza, false, new zzavi(new zzauo(), true, new zzavi()));
                private final Map zzc;
                private final byte[] zzd;

                private zzavi(zzavg zzavgVar, boolean z, zzavi zzaviVar) {
/* 4 */             String strZza = zzavgVar.zza();
/* 18 */            zzgo.zzf(!strZza.contains(","), "Comma is currently not allowed in message encoding");
/* 23 */            int size = zzaviVar.zzc.size();
/* 43 */            LinkedHashMap linkedHashMap = new LinkedHashMap(zzaviVar.zzc.containsKey(zzavgVar.zza()) ? size : size + 1);
/* 60 */            for (zzavh zzavhVar : zzaviVar.zzc.values()) {
/* 68 */                zzavg zzavgVar2 = zzavhVar.zza;
/* 70 */                String strZza2 = zzavgVar2.zza();
/* 78 */                if (!strZza2.equals(strZza)) {
/* 87 */                    linkedHashMap.put(strZza2, new zzavh(zzavgVar2, zzavhVar.zzb));
                        }
                    }
/* 96 */            linkedHashMap.put(strZza, new zzavh(zzavgVar, z));
/* 99 */            Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
/* 103 */           this.zzc = mapUnmodifiableMap;
/* 105 */           zzgh zzghVar = zza;
/* 113 */           HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
/* 128 */           for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
/* 144 */               if (((zzavh) entry.getValue()).zzb) {
/* 152 */                   hashSet.add((String) entry.getKey());
                        }
                    }
/* 160 */           Iterator it = Collections.unmodifiableSet(hashSet).iterator();
/* 166 */           StringBuilder sb = new StringBuilder();
                    try {
/* 169 */               zzghVar.zzb(sb, it);
/* 186 */               this.zzd = sb.toString().getBytes(Charset.forName("US-ASCII"));
                    } catch (IOException e) {
/* 190 */               I000II.I000O01llI0(e);
/* 408 */               throw null;
                    }
                }

                public static zzavi zza() {
/* 1 */             return zzb;
                }

                public final byte[] zzb() {
/* 1 */             return this.zzd;
                }

/* 194 */       private zzavi() {
                    this.zzc = new LinkedHashMap(0);
                    this.zzd = new byte[0];
                }
            }
