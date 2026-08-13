            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Iterator;
            
            final class zzhv extends zzho {
                private final transient zzhn zza;
                private final transient zzhk zzb;

                public zzhv(zzhn zzhnVar, zzhk zzhkVar) {
/* 4 */             this.zza = zzhnVar;
/* 6 */             this.zzb = zzhkVar;
                }

                @Override
                public final boolean contains(Object obj) {
                    return this.zza.get(obj) != null;
                }

                @Override
                public final Iterator iterator() {
/* 4 */             return this.zzb.listIterator(0);
                }

                @Override
                public final int size() {
/* 3 */             return this.zza.size();
                }

                @Override
                public final int zza(Object[] objArr, int i) {
/* 3 */             return this.zzb.zza(objArr, i);
                }

                @Override
                public final zzib iterator() {
/* 4 */             return this.zzb.listIterator(0);
                }

                @Override
                public final boolean zze() {
/* 1 */             return true;
                }
            }
