            package com.google.android.gms.internal.mlkit_genai_speech;
            
            final class zzjv implements zzka {
                private final int zza;
                private final zzjz zzb;

                public zzjv(int i, zzjz zzjzVar) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = zzjzVar;
                }

                @Override
                public final Class annotationType() {
/* 1 */             return zzka.class;
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzka)) {
/* 7 */                 return false;
                    }
/* 11 */            zzka zzkaVar = (zzka) obj;
                    return this.zza == zzkaVar.zza() && this.zzb.equals(zzkaVar.zzb());
                }

                @Override
                public final int hashCode() {
/* 17 */            return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
                }

                @Override
                public final String toString() {
/* 28 */            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
                }

                @Override
                public final int zza() {
/* 1 */             return this.zza;
                }

                @Override
                public final zzjz zzb() {
/* 1 */             return this.zzb;
                }
            }
