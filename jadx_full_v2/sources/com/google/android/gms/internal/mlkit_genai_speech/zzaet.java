            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.OIiilo1Ool0o;
            import p000.OooioIOo1;
            
/* 7 */     final class zzaet extends zzaer implements RandomAccess, zzago {
                private static final boolean[] zza;
                private boolean[] zzb;
                private int zzc;

                static {
/* 2 */             boolean[] zArr = new boolean[0];
/* 4 */             zza = zArr;
/* 8 */             new zzaet(zArr, 0, false);
                }

                public zzaet() {
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
/* 3 */             boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.zzc)) {
/* 71 */                I000II.I0010o(zzh(i));
/* 106 */               return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            boolean[] zArr = this.zzb;
/* 20 */            int length = zArr.length;
/* 21 */            if (i2 < length) {
/* 24 */                System.arraycopy(zArr, i, zArr, i3, i2 - i);
                    } else {
/* 32 */                boolean[] zArr2 = new boolean[zzg(length)];
/* 37 */                System.arraycopy(this.zzb, 0, zArr2, 0, i);
/* 45 */                System.arraycopy(this.zzb, i, zArr2, i3, this.zzc - i);
/* 48 */                this.zzb = zArr2;
                    }
/* 52 */            this.zzb[i] = zBooleanValue;
                    this.zzc++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             byte[] bArr = zzagp.zzb;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof zzaet)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            zzaet zzaetVar = (zzaet) collection;
/* 20 */            int i = zzaetVar.zzc;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.zzc;
/* 32 */            if (Integer.MAX_VALUE - i2 < i) {
/* 77 */                throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            boolean[] zArrCopyOf = this.zzb;
/* 38 */            if (i3 > zArrCopyOf.length) {
/* 40 */                zArrCopyOf = Arrays.copyOf(zArrCopyOf, i3);
/* 44 */                this.zzb = zArrCopyOf;
                    }
/* 52 */            System.arraycopy(zzaetVar.zzb, 0, zArrCopyOf, this.zzc, zzaetVar.zzc);
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
/* 7 */             if (!(obj instanceof zzaet)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzaet zzaetVar = (zzaet) obj;
/* 21 */            if (this.zzc != zzaetVar.zzc) {
/* 20 */                return false;
                    }
/* 24 */            boolean[] zArr = zzaetVar.zzb;
/* 29 */            for (int i = 0; i < this.zzc; i++) {
/* 37 */                if (this.zzb[i] != zArr[i]) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override
                public final Object get(int i) {
/* 1 */             zzi(i);
/* 8 */             return Boolean.valueOf(this.zzb[i]);
                }

                @Override
                public final int hashCode() {
/* 2 */             int iZza = 1;
/* 5 */             for (int i = 0; i < this.zzc; i++) {
/* 17 */                iZza = (iZza * 31) + zzagp.zza(this.zzb[i]);
                    }
/* 55 */            return iZza;
                }

                @Override
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Boolean)) {
/* 3 */                 return -1;
                    }
/* 9 */             boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 13 */            int i = this.zzc;
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 22 */                if (this.zzb[i2] == zBooleanValue) {
/* 24 */                    return i2;
                        }
                    }
/* 3 */             return -1;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzi(i);
/* 7 */             boolean[] zArr = this.zzb;
/* 9 */             boolean z = zArr[i];
/* 15 */            if (i < this.zzc - 1) {
/* 22 */                System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
                    }
                    this.zzc--;
                    ((AbstractList) this).modCount++;
/* 37 */            return Boolean.valueOf(z);
                }

                @Override
                public final void removeRange(int i, int i2) {
/* 1 */             zza();
/* 4 */             if (i2 < i) {
/* 29 */                I000II.I0010o("toIndex < fromIndex");
/* 37 */                return;
                    }
/* 6 */             boolean[] zArr = this.zzb;
/* 11 */            System.arraycopy(zArr, i2, zArr, i, this.zzc - i2);
                    this.zzc -= i2 - i;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 3 */             boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 7 */             zza();
/* 10 */            zzi(i);
/* 13 */            boolean[] zArr = this.zzb;
/* 15 */            boolean z = zArr[i];
/* 17 */            zArr[i] = zBooleanValue;
/* 19 */            return Boolean.valueOf(z);
                }

                @Override
                public final int size() {
/* 1 */             return this.zzc;
                }

                @Override
                public final zzago zzd(int i) {
/* 3 */             if (i >= this.zzc) {
/* 21 */                return new zzaet(i == 0 ? zza : Arrays.copyOf(this.zzb, i), this.zzc, true);
                    }
/* 25 */            OIiilo1Ool0o.I00100o1O0lo();
/* 28 */            return null;
                }

                public final void zze(boolean z) {
/* 1 */             zza();
/* 4 */             int i = this.zzc;
/* 6 */             boolean[] zArr = this.zzb;
/* 8 */             int length = zArr.length;
/* 9 */             if (i == length) {
/* 15 */                zArr = new boolean[zzg(length)];
/* 22 */                System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
/* 25 */                this.zzb = zArr;
                    }
/* 27 */            int i2 = this.zzc;
/* 31 */            this.zzc = i2 + 1;
/* 33 */            zArr[i2] = z;
                }

                public final boolean zzf(int i) {
/* 1 */             zzi(i);
/* 6 */             return this.zzb[i];
                }

/* 8 */         private zzaet(boolean[] zArr, int i, boolean z) {
/* 9 */             super(z);
                    this.zzb = zArr;
                    this.zzc = i;
                }

                @Override
/* 74 */        public final boolean add(Object obj) {
/* 76 */            zze(((Boolean) obj).booleanValue());
                    return true;
                }
            }
