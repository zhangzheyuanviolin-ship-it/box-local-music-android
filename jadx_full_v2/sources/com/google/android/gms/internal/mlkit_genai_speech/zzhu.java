            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Iterator;
            import java.util.Map;
            
            final class zzhu extends zzho {
                private final transient zzhn zza;
                private final transient Object[] zzb;
                private final transient int zzc;

                public zzhu(zzhn zzhnVar, Object[] objArr, int i, int i2) {
/* 4 */             this.zza = zzhnVar;
/* 6 */             this.zzb = objArr;
/* 8 */             this.zzc = i2;
                }

                @Override
                public final boolean contains(Object obj) {
/* 4 */             if (obj instanceof Map.Entry) {
/* 6 */                 Map.Entry entry = (Map.Entry) obj;
/* 8 */                 Object key = entry.getKey();
/* 12 */                Object value = entry.getValue();
/* 16 */                if (value != null && value.equals(this.zza.get(key))) {
/* 30 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public final Iterator iterator() {
/* 6 */             return zzh().listIterator(0);
                }

                @Override
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override
                public final int zza(Object[] objArr, int i) {
/* 5 */             return zzh().zza(objArr, i);
                }

                @Override
                public final zzib iterator() {
/* 6 */             return zzh().listIterator(0);
                }

                @Override
                public final boolean zze() {
/* 1 */             return true;
                }

                @Override
                public final zzhk zzi() {
/* 3 */             return new zzht(this);
                }
            }
