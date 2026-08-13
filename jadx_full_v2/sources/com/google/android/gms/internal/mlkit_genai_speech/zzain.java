            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Arrays;
            import p000.IIlIOloOOO;
            import p000.IioIoO10iOiI;
            import p000.OIiilo1Ool0o;
            import p000.OoOil11Ol1o;
            import p000.OooioIOo1;
            
/* 14 */    public final class zzain {
                private static final zzain zza = new zzain(0, new int[0], new Object[0], false);
                private int zzb;
                private int[] zzc;
                private Object[] zzd;
                private int zze;
                private boolean zzf;

                private zzain(int i, int[] iArr, Object[] objArr, boolean z) {
/* 5 */             this.zze = -1;
/* 7 */             this.zzb = i;
/* 9 */             this.zzc = iArr;
/* 11 */            this.zzd = objArr;
/* 13 */            this.zzf = z;
                }

                public static zzain zzc() {
/* 1 */             return zza;
                }

                public static zzain zze(zzain zzainVar, zzain zzainVar2) {
/* 5 */             int i = zzainVar.zzb + zzainVar2.zzb;
/* 8 */             int[] iArrCopyOf = Arrays.copyOf(zzainVar.zzc, i);
/* 19 */            System.arraycopy(zzainVar2.zzc, 0, iArrCopyOf, zzainVar.zzb, zzainVar2.zzb);
/* 24 */            Object[] objArrCopyOf = Arrays.copyOf(zzainVar.zzd, i);
/* 34 */            System.arraycopy(zzainVar2.zzd, 0, objArrCopyOf, zzainVar.zzb, zzainVar2.zzb);
/* 40 */            return new zzain(i, iArrCopyOf, objArrCopyOf, true);
                }

                public static zzain zzf() {
/* 11 */            return new zzain(0, new int[8], new Object[8], true);
                }

                private final void zzm(int i) {
/* 1 */             int[] iArr = this.zzc;
/* 4 */             if (i > iArr.length) {
/* 6 */                 int i2 = this.zzb;
/* 10 */                int i3 = (i2 / 2) + i2;
/* 11 */                if (i3 >= i) {
/* 13 */                    i = i3;
                        }
/* 16 */                if (i < 8) {
/* 18 */                    i = 8;
                        }
/* 23 */                this.zzc = Arrays.copyOf(iArr, i);
/* 31 */                this.zzd = Arrays.copyOf(this.zzd, i);
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || !(obj instanceof zzain)) {
/* 5 */                 return false;
                    }
/* 14 */            zzain zzainVar = (zzain) obj;
/* 16 */            int i = this.zzb;
/* 20 */            if (i == zzainVar.zzb) {
/* 22 */                int[] iArr = this.zzc;
/* 24 */                int[] iArr2 = zzainVar.zzc;
/* 26 */                int i2 = 0;
                        while (true) {
/* 27 */                    if (i2 >= i) {
/* 39 */                        Object[] objArr = this.zzd;
/* 41 */                        Object[] objArr2 = zzainVar.zzd;
/* 43 */                        int i3 = this.zzb;
/* 46 */                        for (int i4 = 0; i4 < i3; i4++) {
/* 56 */                            if (objArr[i4].equals(objArr2[i4])) {
                                    }
                                }
/* 1 */                         return true;
                            }
/* 33 */                    if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
/* 36 */                    i2++;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.zzb;
/* 3 */             int i2 = i + 527;
/* 5 */             int[] iArr = this.zzc;
/* 8 */             int iHashCode = 17;
/* 11 */            int i3 = 17;
/* 12 */            for (int i4 = 0; i4 < i; i4++) {
/* 18 */                i3 = (i3 * 31) + iArr[i4];
                    }
/* 25 */            int i5 = ((i2 * 31) + i3) * 31;
/* 27 */            Object[] objArr = this.zzd;
/* 29 */            int i6 = this.zzb;
/* 31 */            for (int i7 = 0; i7 < i6; i7++) {
/* 41 */                iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
                    }
/* 45 */            return i5 + iHashCode;
                }

                public final int zza() {
                    int iZzy;
                    int iZzz;
                    int iZzy2;
/* 1 */             int i = this.zze;
/* 4 */             if (i != -1) {
/* 245 */               return i;
                    }
/* 7 */             int iI001iOo1i0O = 0;
/* 10 */            for (int i2 = 0; i2 < this.zzb; i2++) {
/* 14 */                int i3 = this.zzc[i2];
/* 16 */                int i4 = i3 >>> 3;
/* 18 */                int i5 = i3 & 7;
/* 20 */                if (i5 != 0) {
/* 23 */                    if (i5 == 1) {
/* 116 */                       ((Long) this.zzd[i2]).getClass();
/* 123 */                       iZzy2 = zzafm.zzy(i4 << 3) + 8;
                            } else if (i5 == 2) {
/* 87 */                        int i6 = i4 << 3;
/* 93 */                        zzafd zzafdVar = (zzafd) this.zzd[i2];
/* 95 */                        int iZzy3 = zzafm.zzy(i6);
/* 99 */                        int iZze = zzafdVar.zze();
/* 103 */                       iI001iOo1i0O = OooioIOo1.I001iOo1i0O(iZze, iZze, iZzy3, iI001iOo1i0O);
                            } else if (i5 == 3) {
/* 68 */                        int iZzy4 = zzafm.zzy(i4 << 3);
/* 72 */                        iZzy = iZzy4 + iZzy4;
/* 79 */                        iZzz = ((zzain) this.zzd[i2]).zza();
                            } else {
/* 32 */                        if (i5 != 5) {
/* 61 */                            OoOil11Ol1o.I000oI1ioi(new zzagq("Protocol message tag had invalid wire type."));
/* 64 */                            return 0;
                                }
/* 42 */                        ((Integer) this.zzd[i2]).getClass();
/* 49 */                        iZzy2 = zzafm.zzy(i4 << 3) + 4;
                            }
/* 51 */                    iI001iOo1i0O = iZzy2 + iI001iOo1i0O;
                        } else {
/* 126 */                   int i7 = i4 << 3;
/* 134 */                   long jLongValue = ((Long) this.zzd[i2]).longValue();
/* 138 */                   iZzy = zzafm.zzy(i7);
/* 142 */                   iZzz = zzafm.zzz(jLongValue);
                        }
/* 84 */                iI001iOo1i0O = iZzz + iZzy + iI001iOo1i0O;
                    }
/* 151 */           this.zze = iI001iOo1i0O;
/* 153 */           return iI001iOo1i0O;
                }

                public final int zzb() {
/* 1 */             int i = this.zze;
/* 4 */             if (i != -1) {
/* 110 */               return i;
                    }
/* 7 */             int iI0000Il00O = 0;
/* 10 */            for (int i2 = 0; i2 < this.zzb; i2++) {
/* 16 */                int i3 = this.zzc[i2] >>> 3;
/* 22 */                zzafd zzafdVar = (zzafd) this.zzd[i2];
/* 26 */                int iZzy = zzafm.zzy(8);
/* 41 */                int iZzy2 = zzafm.zzy(i3) + zzafm.zzy(16);
/* 44 */                int iZzy3 = zzafm.zzy(24);
/* 48 */                int iZze = zzafdVar.zze();
/* 56 */                iI0000Il00O = IIlIOloOOO.I0000Il00O(iZzy + iZzy, iZzy2, OooioIOo1.I001l0I00(iZze, iZze, iZzy3), iI0000Il00O);
                    }
/* 63 */            this.zze = iI0000Il00O;
/* 65 */            return iI0000Il00O;
                }

                public final zzain zzd(zzain zzainVar) {
/* 7 */             if (zzainVar.equals(zza)) {
/* 9 */                 return this;
                    }
/* 10 */            zzg();
/* 17 */            int i = this.zzb + zzainVar.zzb;
/* 18 */            zzm(i);
/* 30 */            System.arraycopy(zzainVar.zzc, 0, this.zzc, this.zzb, zzainVar.zzb);
/* 41 */            System.arraycopy(zzainVar.zzd, 0, this.zzd, this.zzb, zzainVar.zzb);
/* 44 */            this.zzb = i;
/* 77 */            return this;
                }

                public final void zzg() {
/* 3 */             if (this.zzf) {
/* 5 */                 return;
                    }
/* 6 */             OIiilo1Ool0o.I000lI();
                }

                public final void zzh() {
/* 3 */             if (this.zzf) {
/* 6 */                 this.zzf = false;
                    }
                }

                public final void zzi(StringBuilder sb, int i) {
/* 4 */             for (int i2 = 0; i2 < this.zzb; i2++) {
/* 20 */                zzahp.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
                    }
                }

                public final void zzj(int i, Object obj) {
/* 1 */             zzg();
/* 8 */             zzm(this.zzb + 1);
/* 11 */            int[] iArr = this.zzc;
/* 13 */            int i2 = this.zzb;
/* 15 */            iArr[i2] = i;
/* 19 */            this.zzd[i2] = obj;
/* 23 */            this.zzb = i2 + 1;
                }

                public final void zzk(zzajb zzajbVar) {
/* 4 */             for (int i = 0; i < this.zzb; i++) {
/* 16 */                zzajbVar.zzx(this.zzc[i] >>> 3, this.zzd[i]);
                    }
                }

                public final void zzl(zzajb zzajbVar) {
/* 3 */             if (this.zzb != 0) {
/* 8 */                 for (int i = 0; i < this.zzb; i++) {
/* 12 */                    int i2 = this.zzc[i];
/* 16 */                    Object obj = this.zzd[i];
/* 18 */                    int i3 = i2 & 7;
/* 21 */                    int i4 = i2 >>> 3;
/* 22 */                    if (i3 == 0) {
/* 90 */                        zzajbVar.zzt(i4, ((Long) obj).longValue());
                            } else if (i3 == 1) {
/* 80 */                        zzajbVar.zzm(i4, ((Long) obj).longValue());
                            } else if (i3 == 2) {
/* 70 */                        zzajbVar.zzd(i4, (zzafd) obj);
                            } else if (i3 == 3) {
/* 56 */                        zzajbVar.zzG(i4);
/* 61 */                        ((zzain) obj).zzl(zzajbVar);
/* 64 */                        zzajbVar.zzh(i4);
                            } else {
/* 33 */                        if (i3 != 5) {
/* 52 */                            IioIoO10iOiI.I000lI(new zzagq("Protocol message tag had invalid wire type."));
/* 55 */                            return;
                                }
/* 41 */                        zzajbVar.zzk(i4, ((Integer) obj).intValue());
                            }
                        }
                    }
                }

/* 15 */        private zzain() {
/* 16 */            this(0, new int[8], new Object[8], true);
                }
            }
