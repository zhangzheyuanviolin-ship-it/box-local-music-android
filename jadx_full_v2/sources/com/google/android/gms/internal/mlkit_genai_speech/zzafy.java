            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.RandomAccess;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.OIiilo1Ool0o;
            import p000.OooioIOo1;
            
/* 7 */     final class zzafy extends zzaer implements RandomAccess, zzagl {
                private static final float[] zza;
                private static final zzafy zzb;
                private float[] zzc;
                private int zzd;

                static {
/* 2 */             float[] fArr = new float[0];
/* 4 */             zza = fArr;
/* 11 */            zzb = new zzafy(fArr, 0, false);
                }

                public zzafy() {
/* 5 */             this(zza, 0, true);
                }

                public static zzafy zzf() {
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
/* 3 */             float fFloatValue = ((Float) obj).floatValue();
/* 7 */             zza();
/* 10 */            if (i < 0 || i > (i2 = this.zzd)) {
/* 71 */                I000II.I0010o(zzi(i));
/* 106 */               return;
                    }
/* 16 */            int i3 = i + 1;
/* 18 */            float[] fArr = this.zzc;
/* 20 */            int length = fArr.length;
/* 21 */            if (i2 < length) {
/* 24 */                System.arraycopy(fArr, i, fArr, i3, i2 - i);
                    } else {
/* 32 */                float[] fArr2 = new float[zzh(length)];
/* 37 */                System.arraycopy(this.zzc, 0, fArr2, 0, i);
/* 45 */                System.arraycopy(this.zzc, i, fArr2, i3, this.zzd - i);
/* 48 */                this.zzc = fArr2;
                    }
/* 52 */            this.zzc[i] = fFloatValue;
                    this.zzd++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final boolean addAll(Collection collection) {
/* 1 */             zza();
/* 4 */             byte[] bArr = zzagp.zzb;
/* 6 */             collection.getClass();
/* 11 */            if (!(collection instanceof zzafy)) {
/* 13 */                return super.addAll(collection);
                    }
/* 18 */            zzafy zzafyVar = (zzafy) collection;
/* 20 */            int i = zzafyVar.zzd;
/* 23 */            if (i == 0) {
/* 22 */                return false;
                    }
/* 26 */            int i2 = this.zzd;
/* 32 */            if (Integer.MAX_VALUE - i2 < i) {
/* 77 */                throw new OutOfMemoryError();
                    }
/* 34 */            int i3 = i2 + i;
/* 35 */            float[] fArrCopyOf = this.zzc;
/* 38 */            if (i3 > fArrCopyOf.length) {
/* 40 */                fArrCopyOf = Arrays.copyOf(fArrCopyOf, i3);
/* 44 */                this.zzc = fArrCopyOf;
                    }
/* 52 */            System.arraycopy(zzafyVar.zzc, 0, fArrCopyOf, this.zzd, zzafyVar.zzd);
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
/* 7 */             if (!(obj instanceof zzafy)) {
/* 9 */                 return super.equals(obj);
                    }
/* 14 */            zzafy zzafyVar = (zzafy) obj;
/* 21 */            if (this.zzd != zzafyVar.zzd) {
/* 20 */                return false;
                    }
/* 24 */            float[] fArr = zzafyVar.zzc;
/* 29 */            for (int i = 0; i < this.zzd; i++) {
/* 45 */                if (Float.floatToIntBits(this.zzc[i]) != Float.floatToIntBits(fArr[i])) {
/* 20 */                    return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override
                public final Object get(int i) {
/* 1 */             zzj(i);
/* 8 */             return Float.valueOf(this.zzc[i]);
                }

                @Override
                public final int hashCode() {
/* 2 */             int iFloatToIntBits = 1;
/* 5 */             for (int i = 0; i < this.zzd; i++) {
/* 17 */                iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzc[i]);
                    }
/* 55 */            return iFloatToIntBits;
                }

                @Override
                public final int indexOf(Object obj) {
/* 4 */             if (!(obj instanceof Float)) {
/* 3 */                 return -1;
                    }
/* 9 */             float fFloatValue = ((Float) obj).floatValue();
/* 13 */            int i = this.zzd;
/* 16 */            for (int i2 = 0; i2 < i; i2++) {
/* 24 */                if (this.zzc[i2] == fFloatValue) {
/* 26 */                    return i2;
                        }
                    }
/* 3 */             return -1;
                }

                @Override
                public final Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzj(i);
/* 7 */             float[] fArr = this.zzc;
/* 9 */             float f = fArr[i];
/* 15 */            if (i < this.zzd - 1) {
/* 22 */                System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
                    }
                    this.zzd--;
                    ((AbstractList) this).modCount++;
/* 37 */            return Float.valueOf(f);
                }

                @Override
                public final void removeRange(int i, int i2) {
/* 1 */             zza();
/* 4 */             if (i2 < i) {
/* 29 */                I000II.I0010o("toIndex < fromIndex");
/* 37 */                return;
                    }
/* 6 */             float[] fArr = this.zzc;
/* 11 */            System.arraycopy(fArr, i2, fArr, i, this.zzd - i2);
                    this.zzd -= i2 - i;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 3 */             float fFloatValue = ((Float) obj).floatValue();
/* 7 */             zza();
/* 10 */            zzj(i);
/* 13 */            float[] fArr = this.zzc;
/* 15 */            float f = fArr[i];
/* 17 */            fArr[i] = fFloatValue;
/* 19 */            return Float.valueOf(f);
                }

                @Override
                public final int size() {
/* 1 */             return this.zzd;
                }

                @Override
                public final zzago zzd(int i) {
/* 3 */             if (i >= this.zzd) {
/* 21 */                return new zzafy(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
                    }
/* 25 */            OIiilo1Ool0o.I00100o1O0lo();
/* 28 */            return null;
                }

                public final float zze(int i) {
/* 1 */             zzj(i);
/* 6 */             return this.zzc[i];
                }

                public final void zzg(float f) {
/* 1 */             zza();
/* 4 */             int i = this.zzd;
/* 6 */             float[] fArr = this.zzc;
/* 8 */             int length = fArr.length;
/* 9 */             if (i == length) {
/* 15 */                fArr = new float[zzh(length)];
/* 22 */                System.arraycopy(this.zzc, 0, fArr, 0, this.zzd);
/* 25 */                this.zzc = fArr;
                    }
/* 27 */            int i2 = this.zzd;
/* 31 */            this.zzd = i2 + 1;
/* 33 */            fArr[i2] = f;
                }

/* 8 */         private zzafy(float[] fArr, int i, boolean z) {
/* 9 */             super(z);
                    this.zzc = fArr;
                    this.zzd = i;
                }

                @Override
/* 74 */        public final boolean add(Object obj) {
/* 76 */            zzg(((Float) obj).floatValue());
                    return true;
                }
            }
