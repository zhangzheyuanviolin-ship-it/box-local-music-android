            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.OIiilo1Ool0o;
            import p000.OooioIOo1;
            
/* 7 */     final class zzagh extends zzaer implements RandomAccess, zzagm {
                private static final int[] zza;
                private static final zzagh zzb;
                private int[] zzc;
                private int zzd;

                static {
/* 2 */             int[] iArr = new int[0];
/* 4 */             zza = iArr;
/* 11 */            zzb = new zzagh(iArr, 0, false);
                }

                public zzagh() {
/* 5 */             this(zza, 0, true);
                }

                public static zzagh zzf() {
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
/* 3 */             int iIntValue = ((Integer) obj).intValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.zzd)) {
/* 71 */                I000II.I0010o(zzi(i));
/* 106 */               return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            int[] iArr = this.zzc;
/* 20 */            int length = iArr.length;
/* 21 */            if (i2 < length) {
/* 24 */                System.arraycopy(iArr, i, iArr, i3, i2 - i);
                    } else {
/* 32 */                int[] iArr2 = new int[zzh(length)];
/* 37 */                System.arraycopy(this.zzc, 0, iArr2, 0, i);
/* 45 */                System.arraycopy(this.zzc, i, iArr2, i3, this.zzd - i);
/* 48 */                this.zzc = iArr2;
                    }
/* 52 */            this.zzc[i] = iIntValue;
                    this.zzd++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             byte[] bArr = zzagp.zzb;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof zzagh)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            zzagh zzaghVar = (zzagh) collection;
/* 20 */            int i = zzaghVar.zzd;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.zzd;
/* 32 */            if (Integer.MAX_VALUE - i2 < i) {
/* 77 */                throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            int[] iArrCopyOf = this.zzc;
/* 38 */            if (i3 > iArrCopyOf.length) {
/* 40 */                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
/* 44 */                this.zzc = iArrCopyOf;
                    }
/* 52 */            System.arraycopy(zzaghVar.zzc, 0, iArrCopyOf, this.zzd, zzaghVar.zzd);
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
/* 7 */             if (!(obj instanceof zzagh)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzagh zzaghVar = (zzagh) obj;
/* 21 */            if (this.zzd != zzaghVar.zzd) {
/* 20 */                return false;
                    }
/* 24 */            int[] iArr = zzaghVar.zzc;
/* 29 */            for (int i = 0; i < this.zzd; i++) {
/* 37 */                if (this.zzc[i] != iArr[i]) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override
                public final Object get(int i) {
/* 1 */             zzj(i);
/* 8 */             return Integer.valueOf(this.zzc[i]);
                }

                @Override
                public final int hashCode() {
/* 2 */             int i = 1;
/* 5 */             for (int i2 = 0; i2 < this.zzd; i2++) {
/* 13 */                i = (i * 31) + this.zzc[i2];
                    }
/* 20 */            return i;
                }

                @Override
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Integer)) {
/* 3 */                 return -1;
                    }
/* 9 */             int iIntValue = ((Integer) obj).intValue();
/* 13 */            int i = this.zzd;
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 22 */                if (this.zzc[i2] == iIntValue) {
/* 24 */                    return i2;
                        }
                    }
/* 3 */             return -1;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzj(i);
/* 7 */             int[] iArr = this.zzc;
/* 9 */             int i2 = iArr[i];
/* 15 */            if (i < this.zzd - 1) {
/* 22 */                System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
                    }
                    this.zzd--;
                    ((AbstractList) this).modCount++;
/* 37 */            return Integer.valueOf(i2);
                }

                @Override
                public final void removeRange(int i, int i2) {
/* 1 */             zza();
/* 4 */             if (i2 < i) {
/* 29 */                I000II.I0010o("toIndex < fromIndex");
/* 37 */                return;
                    }
/* 6 */             int[] iArr = this.zzc;
/* 11 */            System.arraycopy(iArr, i2, iArr, i, this.zzd - i2);
                    this.zzd -= i2 - i;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 3 */             int iIntValue = ((Integer) obj).intValue();
/* 7 */             zza();
/* 10 */            zzj(i);
/* 13 */            int[] iArr = this.zzc;
/* 15 */            int i2 = iArr[i];
/* 17 */            iArr[i] = iIntValue;
/* 19 */            return Integer.valueOf(i2);
                }

                @Override
                public final int size() {
/* 1 */             return this.zzd;
                }

                @Override
                public final zzago zzd(int i) {
/* 3 */             if (i >= this.zzd) {
/* 21 */                return new zzagh(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
                    }
/* 25 */            OIiilo1Ool0o.I00100o1O0lo();
/* 28 */            return null;
                }

                public final int zze(int i) {
/* 1 */             zzj(i);
/* 6 */             return this.zzc[i];
                }

                public final void zzg(int i) {
/* 1 */             zza();
/* 4 */             int i2 = this.zzd;
/* 6 */             int[] iArr = this.zzc;
/* 8 */             int length = iArr.length;
/* 9 */             if (i2 == length) {
/* 15 */                iArr = new int[zzh(length)];
/* 22 */                System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
/* 25 */                this.zzc = iArr;
                    }
/* 27 */            int i3 = this.zzd;
/* 31 */            this.zzd = i3 + 1;
/* 33 */            iArr[i3] = i;
                }

/* 8 */         private zzagh(int[] iArr, int i, boolean z) {
/* 9 */             super(z);
                    this.zzc = iArr;
                    this.zzd = i;
                }

                @Override
/* 74 */        public final boolean add(Object obj) {
/* 76 */            zzg(((Integer) obj).intValue());
                    return true;
                }
            }
