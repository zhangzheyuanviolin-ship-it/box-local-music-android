            package com.google.android.gms.internal.mlkit_genai_speech;
            
            final class zzafq {
                private final Object zza;
                private final int zzb;

                public zzafq(Object obj, int i) {
/* 4 */             this.zza = obj;
/* 6 */             this.zzb = i;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzafq)) {
/* 3 */                 return false;
                    }
/* 7 */             zzafq zzafqVar = (zzafq) obj;
                    return this.zza == zzafqVar.zza && this.zzb == zzafqVar.zzb;
                }

                public final int hashCode() {
/* 13 */            return (System.identityHashCode(this.zza) * 65535) + this.zzb;
                }
            }
