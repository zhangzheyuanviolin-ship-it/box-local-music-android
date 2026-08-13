            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            
/* 11 */    public final class zzhm {
                Object[] zza;
                int zzb;
                zzhl zzc;

                public zzhm(int i) {
/* 7 */             this.zza = new Object[i + i];
/* 10 */            this.zzb = 0;
                }

                private final void zzb(int i) {
/* 1 */             Object[] objArr = this.zza;
/* 3 */             int length = objArr.length;
/* 4 */             int i2 = i + i;
/* 5 */             if (i2 > length) {
/* 15 */                this.zza = Arrays.copyOf(objArr, zzhf.zzd(length, i2));
                    }
                }

                public final zzhm zza(Iterable iterable) {
/* 3 */             if (iterable instanceof Collection) {
/* 15 */                zzb(((Collection) iterable).size() + this.zzb);
                    }
/* 18 */            Iterator it = iterable.iterator();
/* 26 */            while (it.hasNext()) {
/* 32 */                Map.Entry entry = (Map.Entry) it.next();
/* 34 */                Object key = entry.getKey();
/* 38 */                Object value = entry.getValue();
/* 46 */                zzb(this.zzb + 1);
/* 49 */                zzhc.zza(key, value);
/* 52 */                Object[] objArr = this.zza;
/* 54 */                int i = this.zzb;
/* 56 */                int i2 = i + i;
/* 58 */                objArr[i2] = key;
/* 62 */                objArr[i2 + 1] = value;
/* 66 */                this.zzb = i + 1;
                    }
/* 77 */            return this;
                }

/* 12 */        public zzhm() {
/* 13 */            this(4);
                }
            }
