            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.IdentityHashMap;
            
            public final class zzatr {
                private zzatu zza;
                private IdentityHashMap zzb;

                public zzatr(zzatu zzatuVar, zzatt zzattVar) {
/* 4 */             this.zza = zzatuVar;
                }

                private final IdentityHashMap zzd(int i) {
/* 3 */             if (this.zzb == null) {
/* 18 */                IdentityHashMap identityHashMap = new IdentityHashMap(this.zza.zzc.size() + i);
/* 21 */                this.zzb = identityHashMap;
/* 29 */                identityHashMap.putAll(this.zza.zzc);
/* 33 */                this.zza = null;
                    }
/* 35 */            return this.zzb;
                }

                public final zzatr zza(zzats zzatsVar) {
/* 1 */             zzatu zzatuVar = this.zza;
/* 3 */             if (zzatuVar == null) {
/* 26 */                this.zzb.remove(zzatsVar);
/* 29 */                return this;
                    }
/* 13 */            if (zzatuVar.zzc.containsKey(zzatsVar)) {
/* 20 */                zzd(0).remove(zzatsVar);
                    }
/* 23 */            return this;
                }

                public final zzatr zzb(zzats zzatsVar, Object obj) {
/* 6 */             zzd(1).put(zzatsVar, obj);
/* 37 */            return this;
                }

                public final zzatu zzc() {
/* 3 */             if (this.zzb != null) {
/* 13 */                this.zza = new zzatu(this.zzb, null);
/* 15 */                this.zzb = null;
                    }
/* 17 */            return this.zza;
                }
            }
