            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Objects;
            
            final class zzhj extends zzhk {
                final transient int zza;
                final transient int zzb;
                final zzhk zzc;

                public zzhj(zzhk zzhkVar, int i, int i2) {
/* 1 */             Objects.requireNonNull(zzhkVar);
/* 4 */             this.zzc = zzhkVar;
/* 9 */             this.zza = i;
/* 11 */            this.zzb = i2;
                }

                @Override
                public final Object get(int i) {
/* 5 */             zzgo.zza(i, this.zzb, "index");
/* 13 */            return this.zzc.get(i + this.zza);
                }

                @Override
                public final int size() {
/* 1 */             return this.zzb;
                }

                @Override
                public final int zzb() {
/* 12 */            return this.zzc.zzc() + this.zza + this.zzb;
                }

                @Override
                public final int zzc() {
/* 9 */             return this.zzc.zzc() + this.zza;
                }

                @Override
                public final boolean zze() {
/* 20 */            throw null;
                }

                @Override
                public final Object[] zzf() {
/* 3 */             return this.zzc.zzf();
                }

                @Override
                public final zzhk subList(int i, int i2) {
/* 3 */             zzgo.zzl(i, i2, this.zzb);
/* 6 */             int i3 = this.zza;
/* 12 */            return this.zzc.subList(i + i3, i2 + i3);
                }
            }
