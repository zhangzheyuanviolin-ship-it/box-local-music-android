            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.OIiilo1Ool0o;
            import p000.OooioIOo1;
            
/* 7 */     final class zzahb extends zzaer implements RandomAccess, zzagn {
                private static final long[] zza;
                private static final zzahb zzb;
                private long[] zzc;
                private int zzd;

                static {
/* 2 */             long[] jArr = new long[0];
/* 4 */             zza = jArr;
/* 11 */            zzb = new zzahb(jArr, 0, false);
                }

                public zzahb() {
/* 5 */             this(zza, 0, true);
                }

                public static zzahb zzf() {
/* 1 */             return zzb;
                }

                private static int zzh(int i) {
/* 6 */             return OooioIOo1.I000II(i, 3, 2, 1, 10);
                }

                private final String zzi(int i) {
/* 7 */             return IIl001iO0Io.I000l1(i, this.zzd, "Index:", ", Size:");
                }

                private final void zzj(int i) {
/* 1 */             if (i < 0 || i >= this.zzd) {
/* 12 */                I000II.I0010o(zzi(i));
                    }
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 3 */             long jLongValue = ((Long) obj).longValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.zzd)) {
/* 71 */                I000II.I0010o(zzi(i));
/* 106 */               return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            long[] jArr = this.zzc;
/* 20 */            int length = jArr.length;
/* 21 */            if (i2 < length) {
/* 24 */                System.arraycopy(jArr, i, jArr, i3, i2 - i);
                    } else {
/* 32 */                long[] jArr2 = new long[zzh(length)];
/* 37 */                System.arraycopy(this.zzc, 0, jArr2, 0, i);
/* 45 */                System.arraycopy(this.zzc, i, jArr2, i3, this.zzd - i);
/* 48 */                this.zzc = jArr2;
                    }
/* 52 */            this.zzc[i] = jLongValue;
                    this.zzd++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             byte[] bArr = zzagp.zzb;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof zzahb)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            zzahb zzahbVar = (zzahb) collection;
/* 20 */            int i = zzahbVar.zzd;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.zzd;
/* 32 */            if (Integer.MAX_VALUE - i2 < i) {
/* 77 */                throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            long[] jArrCopyOf = this.zzc;
/* 38 */            if (i3 > jArrCopyOf.length) {
/* 40 */                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
/* 44 */                this.zzc = jArrCopyOf;
                    }
/* 52 */            System.arraycopy(zzahbVar.zzc, 0, jArrCopyOf, this.zzd, zzahbVar.zzd);
/* 55 */            this.zzd = i3;
                    ((AbstractList) this).modCount++;
/* 59 */            return true;
                }

                @Override
                public final boolean contains(Object obj) {
                    return indexOf(obj) != -1;
                }

                @Override
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzahb)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzahb zzahbVar = (zzahb) obj;
/* 21 */            if (this.zzd != zzahbVar.zzd) {
/* 20 */                return false;
                    }
/* 24 */            long[] jArr = zzahbVar.zzc;
/* 29 */            for (int i = 0; i < this.zzd; i++) {
/* 39 */                if (this.zzc[i] != jArr[i]) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override
                public final Object get(int i) {
/* 1 */             zzj(i);
/* 8 */             return Long.valueOf(this.zzc[i]);
                }

                @Override
                public final int hashCode() {
/* 2 */             int i = 1;
/* 5 */             for (int i2 = 0; i2 < this.zzd; i2++) {
/* 11 */                long j = this.zzc[i2];
/* 13 */                byte[] bArr = zzagp.zzb;
/* 21 */                i = (i * 31) + ((int) (j ^ (j >>> 32)));
                    }
/* 55 */            return i;
                }

                @Override
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Long)) {
/* 3 */                 return -1;
                    }
/* 9 */             long jLongValue = ((Long) obj).longValue();
/* 13 */            int i = this.zzd;
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 24 */                if (this.zzc[i2] == jLongValue) {
/* 26 */                    return i2;
                        }
                    }
/* 3 */             return -1;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzj(i);
/* 7 */             long[] jArr = this.zzc;
/* 9 */             long j = jArr[i];
/* 15 */            if (i < this.zzd - 1) {
/* 22 */                System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
                    }
                    this.zzd--;
                    ((AbstractList) this).modCount++;
/* 37 */            return Long.valueOf(j);
                }

                @Override
                public final void removeRange(int i, int i2) {
/* 1 */             zza();
/* 4 */             if (i2 < i) {
/* 29 */                I000II.I0010o("toIndex < fromIndex");
/* 37 */                return;
                    }
/* 6 */             long[] jArr = this.zzc;
/* 11 */            System.arraycopy(jArr, i2, jArr, i, this.zzd - i2);
                    this.zzd -= i2 - i;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 3 */             long jLongValue = ((Long) obj).longValue();
/* 7 */             zza();
/* 10 */            zzj(i);
/* 13 */            long[] jArr = this.zzc;
/* 15 */            long j = jArr[i];
/* 17 */            jArr[i] = jLongValue;
/* 19 */            return Long.valueOf(j);
                }

                @Override
                public final int size() {
/* 1 */             return this.zzd;
                }

                @Override
                public final zzago zzd(int i) {
/* 3 */             if (i >= this.zzd) {
/* 21 */                return new zzahb(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
                    }
/* 25 */            OIiilo1Ool0o.I00100o1O0lo();
/* 28 */            return null;
                }

                public final long zze(int i) {
/* 1 */             zzj(i);
/* 6 */             return this.zzc[i];
                }

                public final void zzg(long j) {
/* 1 */             zza();
/* 4 */             int i = this.zzd;
/* 6 */             long[] jArr = this.zzc;
/* 8 */             int length = jArr.length;
/* 9 */             if (i == length) {
/* 15 */                jArr = new long[zzh(length)];
/* 22 */                System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
/* 25 */                this.zzc = jArr;
                    }
/* 27 */            int i2 = this.zzd;
/* 31 */            this.zzd = i2 + 1;
/* 33 */            jArr[i2] = j;
                }

/* 8 */         private zzahb(long[] jArr, int i, boolean z) {
/* 9 */             super(z);
                    this.zzc = jArr;
                    this.zzd = i;
                }

                @Override
/* 74 */        public final boolean add(Object obj) {
/* 76 */            zzg(((Long) obj).longValue());
                    return true;
                }
            }
