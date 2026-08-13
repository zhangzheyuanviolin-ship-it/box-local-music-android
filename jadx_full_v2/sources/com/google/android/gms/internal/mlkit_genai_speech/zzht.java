            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            final class zzht extends zzhk {
                final zzhu zza;

                public zzht(zzhu zzhuVar) {
/* 1 */             Objects.requireNonNull(zzhuVar);
/* 4 */             this.zza = zzhuVar;
                }

                @Override
                public final Object get(int i) {
/* 1 */             zzhu zzhuVar = this.zza;
/* 9 */             zzgo.zza(i, zzhuVar.zzc, "index");
/* 16 */            int i2 = i + i;
/* 17 */            Object obj = zzhuVar.zzb[i2];
/* 19 */            Objects.requireNonNull(obj);
/* 28 */            Object obj2 = zzhuVar.zzb[i2 + 1];
/* 30 */            Objects.requireNonNull(obj2);
/* 35 */            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override
                public final int size() {
/* 1 */             return this.zza.zzc;
                }

                @Override
                public final boolean zze() {
/* 20 */            throw null;
                }
            }
