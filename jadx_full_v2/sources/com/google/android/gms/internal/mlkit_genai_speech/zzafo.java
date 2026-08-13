            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.OIiilo1Ool0o;
            import p000.OooioIOo1;
            
/* 7 */     final class zzafo extends zzaer implements RandomAccess, zzago {
                private static final double[] zza;
                private double[] zzb;
                private int zzc;

                static {
/* 2 */             double[] dArr = new double[0];
/* 4 */             zza = dArr;
/* 8 */             new zzafo(dArr, 0, false);
                }

                public zzafo() {
/* 5 */             this(zza, 0, true);
                }

                private static int zzg(int i) {
/* 6 */             return OooioIOo1.I000II(i, 3, 2, 1, 10);
                }

                private final String zzh(int i) {
/* 7 */             return IIl001iO0Io.I000l1(i, this.zzc, "Index:", ", Size:");
                }

                private final void zzi(int i) {
/* 1 */             if (i < 0 || i >= this.zzc) {
/* 12 */                I000II.I0010o(zzh(i));
                    }
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 3 */             double dDoubleValue = ((Double) obj).doubleValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.zzc)) {
/* 71 */                I000II.I0010o(zzh(i));
/* 106 */               return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            double[] dArr = this.zzb;
/* 20 */            int length = dArr.length;
/* 21 */            if (i2 < length) {
/* 24 */                System.arraycopy(dArr, i, dArr, i3, i2 - i);
                    } else {
/* 32 */                double[] dArr2 = new double[zzg(length)];
/* 37 */                System.arraycopy(this.zzb, 0, dArr2, 0, i);
/* 45 */                System.arraycopy(this.zzb, i, dArr2, i3, this.zzc - i);
/* 48 */                this.zzb = dArr2;
                    }
/* 52 */            this.zzb[i] = dDoubleValue;
                    this.zzc++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             byte[] bArr = zzagp.zzb;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof zzafo)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            zzafo zzafoVar = (zzafo) collection;
/* 20 */            int i = zzafoVar.zzc;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.zzc;
/* 32 */            if (Integer.MAX_VALUE - i2 < i) {
/* 77 */                throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            double[] dArrCopyOf = this.zzb;
/* 38 */            if (i3 > dArrCopyOf.length) {
/* 40 */                dArrCopyOf = Arrays.copyOf(dArrCopyOf, i3);
/* 44 */                this.zzb = dArrCopyOf;
                    }
/* 52 */            System.arraycopy(zzafoVar.zzb, 0, dArrCopyOf, this.zzc, zzafoVar.zzc);
/* 55 */            this.zzc = i3;
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
/* 7 */             if (!(obj instanceof zzafo)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzafo zzafoVar = (zzafo) obj;
/* 21 */            if (this.zzc != zzafoVar.zzc) {
/* 20 */                return false;
                    }
/* 24 */            double[] dArr = zzafoVar.zzb;
/* 29 */            for (int i = 0; i < this.zzc; i++) {
/* 47 */                if (Double.doubleToLongBits(this.zzb[i]) != Double.doubleToLongBits(dArr[i])) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override
                public final Object get(int i) {
/* 1 */             zzi(i);
/* 8 */             return Double.valueOf(this.zzb[i]);
                }

                @Override
                public final int hashCode() {
/* 2 */             int i = 1;
/* 5 */             for (int i2 = 0; i2 < this.zzc; i2++) {
/* 11 */                long jDoubleToLongBits = Double.doubleToLongBits(this.zzb[i2]);
/* 17 */                byte[] bArr = zzagp.zzb;
/* 25 */                i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
/* 55 */            return i;
                }

                @Override
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Double)) {
/* 3 */                 return -1;
                    }
/* 9 */             double dDoubleValue = ((Double) obj).doubleValue();
/* 13 */            int i = this.zzc;
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 24 */                if (this.zzb[i2] == dDoubleValue) {
/* 26 */                    return i2;
                        }
                    }
/* 3 */             return -1;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzi(i);
/* 7 */             double[] dArr = this.zzb;
/* 9 */             double d = dArr[i];
/* 15 */            if (i < this.zzc - 1) {
/* 22 */                System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
                    }
                    this.zzc--;
                    ((AbstractList) this).modCount++;
/* 37 */            return Double.valueOf(d);
                }

                @Override
                public final void removeRange(int i, int i2) {
/* 1 */             zza();
/* 4 */             if (i2 < i) {
/* 29 */                I000II.I0010o("toIndex < fromIndex");
/* 37 */                return;
                    }
/* 6 */             double[] dArr = this.zzb;
/* 11 */            System.arraycopy(dArr, i2, dArr, i, this.zzc - i2);
                    this.zzc -= i2 - i;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 3 */             double dDoubleValue = ((Double) obj).doubleValue();
/* 7 */             zza();
/* 10 */            zzi(i);
/* 13 */            double[] dArr = this.zzb;
/* 15 */            double d = dArr[i];
/* 17 */            dArr[i] = dDoubleValue;
/* 19 */            return Double.valueOf(d);
                }

                @Override
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override
                public final zzago zzd(int i) {
/* 3 */             if (i >= this.zzc) {
/* 21 */                return new zzafo(i == 0 ? zza : Arrays.copyOf(this.zzb, i), this.zzc, true);
                    }
/* 25 */            OIiilo1Ool0o.I00100o1O0lo();
/* 28 */            return null;
                }

                public final double zze(int i) {
/* 1 */             zzi(i);
/* 6 */             return this.zzb[i];
                }

                public final void zzf(double d) {
/* 1 */             zza();
/* 4 */             int i = this.zzc;
/* 6 */             double[] dArr = this.zzb;
/* 8 */             int length = dArr.length;
/* 9 */             if (i == length) {
/* 15 */                dArr = new double[zzg(length)];
/* 22 */                System.arraycopy(this.zzb, 0, dArr, 0, this.zzc);
/* 25 */                this.zzb = dArr;
                    }
/* 27 */            int i2 = this.zzc;
/* 31 */            this.zzc = i2 + 1;
/* 33 */            dArr[i2] = d;
                }

/* 8 */         private zzafo(double[] dArr, int i, boolean z) {
/* 9 */             super(z);
                    this.zzb = dArr;
                    this.zzc = i;
                }

                @Override
/* 74 */        public final boolean add(Object obj) {
/* 76 */            zzf(((Double) obj).doubleValue());
                    return true;
                }
            }
