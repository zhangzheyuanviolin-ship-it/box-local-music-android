            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzhw extends zzhk {
                private final transient Object[] zza;
                private final transient int zzb;
                private final transient int zzc;

                public zzhw(Object[] objArr, int i, int i2) {
/* 4 */             this.zza = objArr;
/* 6 */             this.zzb = i;
/* 8 */             this.zzc = i2;
                }

                @Override
                public final Object get(int i) {
/* 5 */             zzgo.zza(i, this.zzc, "index");
/* 14 */            Object obj = this.zza[i + i + this.zzb];
/* 16 */            Objects.requireNonNull(obj);
/* 29 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override
                public final boolean zze() {
/* 20 */            throw null;
                }
            }
