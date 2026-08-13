            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            
            class zzhe extends zzhf {
                Object[] zza = new Object[4];
                int zzb = 0;
                boolean zzc;

                public zzhe(int i) {
                }

                private final void zze(int i) {
/* 3 */             int length = this.zza.length;
/* 7 */             int iZzd = zzhf.zzd(length, this.zzb + i);
/* 11 */            if (iZzd > length || this.zzc) {
/* 25 */                this.zza = Arrays.copyOf(this.zza, iZzd);
/* 28 */                this.zzc = false;
                    }
                }

                public final zzhe zza(Object obj) {
/* 1 */             obj.getClass();
/* 5 */             zze(1);
/* 8 */             Object[] objArr = this.zza;
/* 10 */            int i = this.zzb;
/* 14 */            this.zzb = i + 1;
/* 16 */            objArr[i] = obj;
/* 29 */            return this;
                }

                @Override
                public zzhf zzb(Object obj) {
/* 29 */            throw null;
                }

                public final zzhf zzc(Iterable iterable) {
/* 2 */             Collection collection = (Collection) iterable;
/* 8 */             zze(collection.size());
/* 13 */            if (collection instanceof zzhg) {
/* 44 */                this.zzb = ((zzhg) collection).zza(this.zza, this.zzb);
/* 77 */                return this;
                    }
/* 15 */            Iterator it = iterable.iterator();
/* 23 */            while (it.hasNext()) {
/* 29 */                zzb(it.next());
                    }
/* 33 */            return this;
                }
            }
