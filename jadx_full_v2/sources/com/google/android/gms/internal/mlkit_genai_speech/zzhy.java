            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Iterator;
            
            final class zzhy extends zzho {
                static final zzhy zza;
                private static final Object[] zzd;
                final transient Object[] zzb;
                final transient Object[] zzc;
                private final transient int zze;
                private final transient int zzf;
                private final transient int zzg;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             zzd = objArr;
/* 15 */            zza = new zzhy(objArr, 0, objArr, 0, 0);
                }

                public zzhy(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
/* 4 */             this.zzb = objArr;
/* 6 */             this.zze = i;
/* 8 */             this.zzc = objArr2;
/* 10 */            this.zzf = i2;
/* 12 */            this.zzg = i3;
                }

                @Override
                public final boolean contains(Object obj) {
/* 2 */             if (obj != null) {
/* 4 */                 Object[] objArr = this.zzc;
/* 7 */                 if (objArr.length != 0) {
/* 13 */                    int iZza = zzhd.zza(obj.hashCode());
                            while (true) {
/* 19 */                        int i = iZza & this.zzf;
/* 20 */                        Object obj2 = objArr[i];
/* 22 */                        if (obj2 == null) {
/* 1 */                             return false;
                                }
/* 29 */                        if (obj2.equals(obj)) {
/* 31 */                            return true;
                                }
/* 33 */                        iZza = i + 1;
                            }
                        }
                    }
/* 1 */             return false;
                }

                @Override
                public final int hashCode() {
/* 1 */             return this.zze;
                }

                @Override
                public final Iterator iterator() {
/* 6 */             return zzh().listIterator(0);
                }

                @Override
                public final int size() {
/* 1 */             return this.zzg;
                }

                @Override
                public final int zza(Object[] objArr, int i) {
/* 1 */             Object[] objArr2 = this.zzb;
/* 3 */             int i2 = this.zzg;
/* 6 */             System.arraycopy(objArr2, 0, objArr, i, i2);
/* 9 */             return i + i2;
                }

                @Override
                public final int zzb() {
/* 1 */             return this.zzg;
                }

                @Override
                public final int zzc() {
/* 1 */             return 0;
                }

                @Override
                public final zzib iterator() {
/* 6 */             return zzh().listIterator(0);
                }

                @Override
                public final boolean zze() {
/* 1 */             return false;
                }

                @Override
                public final Object[] zzf() {
/* 1 */             return this.zzb;
                }

                @Override
                public final zzhk zzi() {
/* 5 */             return zzhk.zzh(this.zzb, this.zzg);
                }

                @Override
                public final boolean zzl() {
/* 1 */             return true;
                }
            }
