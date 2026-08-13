            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Collections;
            import java.util.IdentityHashMap;
            import java.util.Set;
            
            public abstract class zzbgt {
                private final Set zza = Collections.newSetFromMap(new IdentityHashMap());

                public abstract void zza();

                public abstract void zzb();

                public final void zzc(Object obj, boolean z) {
/* 1 */             Set set = this.zza;
/* 3 */             int size = set.size();
/* 7 */             if (z) {
/* 9 */                 set.add(obj);
/* 12 */                if (size == 0) {
/* 14 */                    zza();
/* 17 */                    return;
                        }
/* 37 */                return;
                    }
/* 22 */            if (set.remove(obj) && size == 1) {
/* 27 */                zzb();
                    }
                }

                public final boolean zzd(Object... objArr) {
/* 4 */             for (int i = 0; i < 2; i++) {
/* 14 */                if (this.zza.contains(objArr[i])) {
/* 16 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                public final boolean zze() {
                    return !this.zza.isEmpty();
                }
            }
