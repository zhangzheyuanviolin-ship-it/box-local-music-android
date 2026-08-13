            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzhs extends zzhk {
                static final zzhk zza = new zzhs(new Object[0], 0);
                final transient Object[] zzb;
                private final transient int zzc;

                public zzhs(Object[] objArr, int i) {
/* 4 */             this.zzb = objArr;
/* 6 */             this.zzc = i;
                }

                @Override
                public final Object get(int i) {
/* 5 */             zzgo.zza(i, this.zzc, "index");
/* 10 */            Object obj = this.zzb[i];
/* 12 */            Objects.requireNonNull(obj);
/* 29 */            return obj;
                }

                @Override
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override
                public final int zza(Object[] objArr, int i) {
/* 1 */             Object[] objArr2 = this.zzb;
/* 3 */             int i2 = this.zzc;
/* 6 */             System.arraycopy(objArr2, 0, objArr, i, i2);
/* 9 */             return i + i2;
                }

                @Override
                public final int zzb() {
/* 1 */             return this.zzc;
                }

                @Override
                public final int zzc() {
/* 1 */             return 0;
                }

                @Override
                public final boolean zze() {
/* 20 */            throw null;
                }

                @Override
                public final Object[] zzf() {
/* 1 */             return this.zzb;
                }
            }
