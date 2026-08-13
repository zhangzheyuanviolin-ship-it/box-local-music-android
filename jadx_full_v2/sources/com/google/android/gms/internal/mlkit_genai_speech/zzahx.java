            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.RandomAccess;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.OIiilo1Ool0o;
            import p000.OooioIOo1;
            
/* 7 */     final class zzahx extends zzaer implements RandomAccess {
                private static final Object[] zza;
                private static final zzahx zzb;
                private Object[] zzc;
                private int zzd;

                static {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             zza = objArr;
/* 11 */            zzb = new zzahx(objArr, 0, false);
                }

                public zzahx() {
/* 5 */             this(zza, 0, true);
                }

                public static zzahx zze() {
/* 1 */             return zzb;
                }

                private static int zzf(int i) {
/* 6 */             return OooioIOo1.I000II(i, 3, 2, 1, 10);
                }

                private final String zzg(int i) {
/* 7 */             return IIl001iO0Io.I000l1(i, this.zzd, "Index:", ", Size:");
                }

                private final void zzh(int i) {
/* 1 */             if (i < 0 || i >= this.zzd) {
/* 12 */                I000II.I0010o(zzg(i));
                    }
                }

                @Override
                public final void add(int i, Object obj) {
                    int i2;
/* 1 */             zza();
/* 4 */             if (i < 0 || i > (i2 = this.zzd)) {
/* 65 */                I000II.I0010o(zzg(i));
/* 106 */               return;
                    }
/* 10 */            int i3 = i + 1;
/* 12 */            Object[] objArr = this.zzc;
/* 14 */            int length = objArr.length;
/* 15 */            if (i2 < length) {
/* 18 */                System.arraycopy(objArr, i, objArr, i3, i2 - i);
                    } else {
/* 26 */                Object[] objArr2 = new Object[zzf(length)];
/* 31 */                System.arraycopy(this.zzc, 0, objArr2, 0, i);
/* 39 */                System.arraycopy(this.zzc, i, objArr2, i3, this.zzd - i);
/* 42 */                this.zzc = objArr2;
                    }
/* 46 */            this.zzc[i] = obj;
                    this.zzd++;
                    ((AbstractList) this).modCount++;
                }

                @Override
                public final Object get(int i) {
/* 1 */             zzh(i);
/* 6 */             return this.zzc[i];
                }

                @Override
                public final Object remove(int i) {
/* 1 */             zza();
/* 4 */             zzh(i);
/* 7 */             Object[] objArr = this.zzc;
/* 9 */             Object obj = objArr[i];
/* 15 */            if (i < this.zzd - 1) {
/* 22 */                System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
                    }
                    this.zzd--;
                    ((AbstractList) this).modCount++;
/* 77 */            return obj;
                }

                @Override
                public final Object set(int i, Object obj) {
/* 1 */             zza();
/* 4 */             zzh(i);
/* 7 */             Object[] objArr = this.zzc;
/* 9 */             Object obj2 = objArr[i];
/* 11 */            objArr[i] = obj;
                    ((AbstractList) this).modCount++;
/* 37 */            return obj2;
                }

                @Override
                public final int size() {
/* 1 */             return this.zzd;
                }

                @Override
                public final zzago zzd(int i) {
/* 3 */             if (i >= this.zzd) {
/* 21 */                return new zzahx(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
                    }
/* 25 */            OIiilo1Ool0o.I00100o1O0lo();
/* 28 */            return null;
                }

/* 8 */         private zzahx(Object[] objArr, int i, boolean z) {
/* 9 */             super(z);
                    this.zzc = objArr;
                    this.zzd = i;
                }

                @Override
/* 68 */        public final boolean add(Object obj) {
/* 69 */            zza();
                    int i = this.zzd;
                    Object[] objArrCopyOf = this.zzc;
/* 70 */            int length = objArrCopyOf.length;
                    if (i == length) {
/* 72 */                objArrCopyOf = Arrays.copyOf(this.zzc, zzf(length));
                        this.zzc = objArrCopyOf;
                    }
                    int i2 = this.zzd;
                    this.zzd = i2 + 1;
/* 73 */            objArrCopyOf[i2] = obj;
                    ((AbstractList) this).modCount++;
                    return true;
                }
            }
