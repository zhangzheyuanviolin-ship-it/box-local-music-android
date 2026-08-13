            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.IdentityHashMap;
            import java.util.Map;
            import java.util.Objects;
            
/* 5 */     public final class zzatu {
                public static final zzatu zza;
                private static final IdentityHashMap zzb;
                private final IdentityHashMap zzc;

                static {
/* 3 */             IdentityHashMap identityHashMap = new IdentityHashMap();
/* 6 */             zzb = identityHashMap;
/* 13 */            zza = new zzatu(identityHashMap);
                }

                private zzatu(IdentityHashMap identityHashMap) {
/* 4 */             this.zzc = identityHashMap;
                }

                public static zzatr zza() {
/* 6 */             return new zzatr(zza, null);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || zzatu.class != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            IdentityHashMap identityHashMap = this.zzc;
/* 21 */            IdentityHashMap identityHashMap2 = ((zzatu) obj).zzc;
/* 31 */            if (identityHashMap.size() != identityHashMap2.size()) {
/* 5 */                 return false;
                    }
/* 46 */            for (Map.Entry entry : identityHashMap.entrySet()) {
/* 62 */                if (!identityHashMap2.containsKey(entry.getKey()) || !Objects.equals(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
/* 5 */                     return false;
                        }
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 11 */            int iHash = 0;
/* 16 */            for (Map.Entry entry : this.zzc.entrySet()) {
/* 40 */                iHash += Objects.hash(entry.getKey(), entry.getValue());
                    }
/* 55 */            return iHash;
                }

                public final String toString() {
/* 3 */             return this.zzc.toString();
                }

                public final zzatr zzb() {
/* 4 */             return new zzatr(this, null);
                }

                public final Object zzc(zzats zzatsVar) {
/* 3 */             return this.zzc.get(zzatsVar);
                }

/* 6 */         public zzatu(IdentityHashMap identityHashMap, zzatt zzattVar) {
                    this.zzc = identityHashMap;
                }
            }
