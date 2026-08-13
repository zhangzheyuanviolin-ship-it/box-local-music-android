            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Arrays;
            import java.util.Objects;
            
            final class zzhx extends zzhn {
                static final zzhn zza = new zzhx(null, new Object[0], 0);
                final transient Object[] zzb;
                private final transient Object zzc;
                private final transient int zzd;

                private zzhx(Object obj, Object[] objArr, int i) {
/* 4 */             this.zzc = obj;
/* 6 */             this.zzb = objArr;
/* 8 */             this.zzd = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:74:0x01b1  */
                /* JADX WARN: Type inference failed for: r16v11 */
                /* JADX WARN: Type inference failed for: r16v12 */
                /* JADX WARN: Type inference failed for: r16v13 */
                /* JADX WARN: Type inference failed for: r16v4 */
                /* JADX WARN: Type inference failed for: r4v6 */
                /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static zzhx zzi(int i, Object[] objArr, zzhm zzhmVar) {
                    boolean z;
                    int i2;
                    char c;
                    Object obj;
                    char c2;
                    short[] sArr;
                    boolean z2;
                    int i3;
                    ?? r16;
                    boolean z3;
                    boolean z4;
/* 1 */             int i4 = i;
/* 3 */             Object[] objArrCopyOf = objArr;
/* 7 */             if (i4 == 0) {
/* 11 */                return (zzhx) zza;
                    }
/* 14 */            Object obj2 = null;
/* 15 */            boolean z5 = false;
/* 16 */            int i5 = 1;
/* 17 */            if (i4 == 1) {
/* 19 */                Object obj3 = objArrCopyOf[0];
/* 21 */                Objects.requireNonNull(obj3);
/* 24 */                Object obj4 = objArrCopyOf[1];
/* 26 */                Objects.requireNonNull(obj4);
/* 29 */                zzhc.zza(obj3, obj4);
/* 34 */                return new zzhx(null, objArrCopyOf, 1);
                    }
/* 42 */            zzgo.zzb(i4, objArrCopyOf.length >> 1, "index");
/* 45 */            int iZzg = zzho.zzg(i4);
/* 49 */            char c3 = 2;
/* 50 */            if (i4 != 1) {
                        int i6 = iZzg - 1;
/* 80 */                if (iZzg <= 128) {
/* 82 */                    byte[] bArr = new byte[iZzg];
/* 84 */                    Arrays.fill(bArr, (byte) -1);
/* 87 */                    int i7 = 0;
/* 88 */                    int i8 = 0;
/* 89 */                    while (i7 < i4) {
/* 91 */                        int i9 = i8 + i8;
/* 93 */                        int i10 = i7 + i7;
/* 95 */                        Object obj5 = objArrCopyOf[i10];
/* 97 */                        Objects.requireNonNull(obj5);
/* 101 */                       Object obj6 = objArrCopyOf[i10 ^ i5];
/* 103 */                       Objects.requireNonNull(obj6);
/* 106 */                       zzhc.zza(obj5, obj6);
/* 113 */                       int iZza = zzhd.zza(obj5.hashCode());
                                while (true) {
/* 117 */                           int i11 = iZza & i6;
/* 118 */                           z2 = z5;
/* 122 */                           i3 = i5;
/* 126 */                           int i12 = bArr[i11] & 255;
/* 127 */                           if (i12 == 255) {
/* 130 */                               bArr[i11] = (byte) i9;
/* 132 */                               if (i8 < i7) {
/* 134 */                                   objArrCopyOf[i9] = obj5;
/* 138 */                                   objArrCopyOf[i9 ^ 1] = obj6;
                                        }
/* 140 */                               i8++;
                                    } else {
/* 149 */                               if (obj5.equals(objArrCopyOf[i12])) {
/* 151 */                                   int i13 = i12 ^ 1;
/* 155 */                                   Object obj7 = objArrCopyOf[i13];
/* 157 */                                   Objects.requireNonNull(obj7);
/* 160 */                                   zzhl zzhlVar = new zzhl(obj5, obj6, obj7);
/* 163 */                                   objArrCopyOf[i13] = obj6;
/* 165 */                                   obj2 = zzhlVar;
                                            break;
                                        }
/* 173 */                               iZza = i11 + 1;
/* 175 */                               z5 = z2;
/* 177 */                               i5 = i3;
                                    }
                                }
/* 166 */                       i7++;
/* 168 */                       z5 = z2;
/* 170 */                       i5 = i3;
                            }
/* 180 */                   z = z5;
/* 182 */                   i2 = i5;
/* 184 */                   if (i8 == i4) {
/* 186 */                       obj2 = bArr;
                                z4 = z;
                            } else {
/* 188 */                       sArr = new Object[3];
/* 190 */                       sArr[z ? 1 : 0] = bArr;
/* 196 */                       sArr[i2] = Integer.valueOf(i8);
/* 198 */                       sArr[2] = obj2;
/* 200 */                       obj2 = sArr;
                                z4 = z;
                            }
                        } else {
/* 203 */                   z = false;
/* 205 */                   i2 = 1;
/* 210 */                   if (iZzg <= 32768) {
/* 212 */                       sArr = new short[iZzg];
/* 214 */                       Arrays.fill(sArr, (short) -1);
/* 219 */                       int i14 = 0;
/* 220 */                       for (int i15 = 0; i15 < i4; i15++) {
/* 222 */                           int i16 = i14 + i14;
/* 224 */                           int i17 = i15 + i15;
/* 226 */                           Object obj8 = objArrCopyOf[i17];
/* 228 */                           Objects.requireNonNull(obj8);
/* 233 */                           Object obj9 = objArrCopyOf[i17 ^ 1];
/* 235 */                           Objects.requireNonNull(obj9);
/* 238 */                           zzhc.zza(obj8, obj9);
/* 245 */                           int iZza2 = zzhd.zza(obj8.hashCode());
                                    while (true) {
/* 249 */                               int i18 = iZza2 & i6;
/* 252 */                               char c4 = (char) sArr[i18];
/* 256 */                               if (c4 == 65535) {
/* 259 */                                   sArr[i18] = (short) i16;
/* 261 */                                   if (i14 < i15) {
/* 263 */                                       objArrCopyOf[i16] = obj8;
/* 267 */                                       objArrCopyOf[i16 ^ 1] = obj9;
                                            }
/* 269 */                                   i14++;
                                        } else {
/* 278 */                                   if (obj8.equals(objArrCopyOf[c4])) {
/* 280 */                                       int i19 = c4 ^ 1;
/* 284 */                                       Object obj10 = objArrCopyOf[i19];
/* 286 */                                       Objects.requireNonNull(obj10);
/* 289 */                                       zzhl zzhlVar2 = new zzhl(obj8, obj9, obj10);
/* 292 */                                       objArrCopyOf[i19] = obj9;
/* 294 */                                       obj2 = zzhlVar2;
                                                break;
                                            }
/* 298 */                                   iZza2 = i18 + 1;
                                        }
                                    }
                                }
/* 301 */                       if (i14 == i4) {
/* 200 */                           obj2 = sArr;
                                    z4 = z;
                                } else {
/* 304 */                           obj2 = new Object[]{sArr, Integer.valueOf(i14), obj2};
                                    z4 = z;
                                }
                            } else {
/* 319 */                       int[] iArr = new int[iZzg];
/* 321 */                       Arrays.fill(iArr, -1);
/* 324 */                       int i20 = 0;
/* 326 */                       int i21 = 0;
/* 327 */                       while (i20 < i4) {
/* 329 */                           int i22 = i21 + i21;
/* 331 */                           int i23 = i20 + i20;
/* 333 */                           Object obj11 = objArrCopyOf[i23];
/* 335 */                           Objects.requireNonNull(obj11);
/* 340 */                           Object obj12 = objArrCopyOf[i23 ^ 1];
/* 342 */                           Objects.requireNonNull(obj12);
/* 345 */                           zzhc.zza(obj11, obj12);
/* 352 */                           int iZza3 = zzhd.zza(obj11.hashCode());
                                    while (true) {
/* 356 */                               int i24 = iZza3 & i6;
/* 357 */                               int i25 = iArr[i24];
/* 359 */                               if (i25 == -1) {
/* 361 */                                   iArr[i24] = i22;
/* 363 */                                   if (i21 < i20) {
/* 365 */                                       objArrCopyOf[i22] = obj11;
/* 369 */                                       objArrCopyOf[i22 ^ 1] = obj12;
                                            }
/* 371 */                                   i21++;
/* 373 */                                   c2 = c3;
                                        } else {
/* 376 */                                   c2 = c3;
/* 384 */                                   if (obj11.equals(objArrCopyOf[i25])) {
/* 386 */                                       int i26 = i25 ^ 1;
/* 390 */                                       Object obj13 = objArrCopyOf[i26];
/* 392 */                                       Objects.requireNonNull(obj13);
/* 395 */                                       zzhl zzhlVar3 = new zzhl(obj11, obj12, obj13);
/* 398 */                                       objArrCopyOf[i26] = obj12;
/* 400 */                                       obj2 = zzhlVar3;
                                                break;
                                            }
/* 406 */                                   iZza3 = i24 + 1;
/* 408 */                                   c3 = c2;
                                        }
                                    }
/* 401 */                           i20++;
/* 403 */                           c3 = c2;
                                }
/* 411 */                       c = c3;
/* 413 */                       if (i21 == i4) {
/* 415 */                           obj = iArr;
                                    r16 = z;
                                } else {
/* 417 */                           Object[] objArr2 = new Object[3];
/* 419 */                           objArr2[0] = iArr;
/* 425 */                           objArr2[1] = Integer.valueOf(i21);
/* 427 */                           objArr2[c] = obj2;
/* 429 */                           obj = objArr2;
                                    r16 = z;
                                }
                            }
                        }
/* 430 */               z3 = obj instanceof Object[];
                        Object obj14 = obj;
/* 432 */               if (z3) {
/* 434 */                   Object[] objArr3 = (Object[]) obj;
/* 438 */                   zzhl zzhlVar4 = (zzhl) objArr3[c];
/* 440 */                   if (zzhmVar == null) {
/* 467 */                       throw zzhlVar4.zza();
                            }
/* 442 */                   zzhmVar.zzc = zzhlVar4;
/* 444 */                   Object obj15 = objArr3[r16];
/* 450 */                   int iIntValue = ((Integer) objArr3[i2]).intValue();
/* 456 */                   objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
/* 460 */                   obj14 = obj15;
/* 461 */                   i4 = iIntValue;
                        }
/* 470 */               return new zzhx(obj14, objArrCopyOf, i4);
                    }
/* 52 */            Object obj16 = objArrCopyOf[0];
/* 54 */            Objects.requireNonNull(obj16);
/* 57 */            Object obj17 = objArrCopyOf[1];
/* 59 */            Objects.requireNonNull(obj17);
/* 62 */            zzhc.zza(obj16, obj17);
/* 65 */            z4 = false;
/* 67 */            i4 = 1;
/* 68 */            i2 = 1;
/* 70 */            c = 2;
                    obj = obj2;
                    r16 = z4;
/* 430 */           z3 = obj instanceof Object[];
                    Object obj142 = obj;
/* 432 */           if (z3) {
                    }
/* 470 */           return new zzhx(obj142, objArrCopyOf, i4);
                }

                /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
                /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object get(Object obj) {
                    Object obj2;
/* 2 */             if (obj == null) {
/* 4 */                 obj2 = null;
                    } else {
/* 7 */                 int i = this.zzd;
/* 9 */                 Object[] objArr = this.zzb;
/* 12 */                if (i == 1) {
/* 15 */                    Object obj3 = objArr[0];
/* 17 */                    Objects.requireNonNull(obj3);
/* 24 */                    if (obj3.equals(obj)) {
/* 26 */                        obj2 = objArr[1];
/* 28 */                        Objects.requireNonNull(obj2);
                            }
                        } else {
/* 33 */                    Object obj4 = this.zzc;
/* 35 */                    if (obj4 != null) {
/* 41 */                        if (obj4 instanceof byte[]) {
/* 44 */                            byte[] bArr = (byte[]) obj4;
                                    int length = bArr.length - 1;
/* 53 */                            int iZza = zzhd.zza(obj.hashCode());
                                    while (true) {
/* 57 */                                int i2 = iZza & length;
/* 62 */                                int i3 = bArr[i2] & 255;
/* 63 */                                if (i3 == 255) {
                                            break;
                                        }
/* 72 */                                if (obj.equals(objArr[i3])) {
/* 76 */                                    obj2 = objArr[i3 ^ 1];
                                            break;
                                        }
/* 79 */                                iZza = i2 + 1;
                                    }
                                } else if (obj4 instanceof short[]) {
/* 87 */                            short[] sArr = (short[]) obj4;
                                    int length2 = sArr.length - 1;
/* 96 */                            int iZza2 = zzhd.zza(obj.hashCode());
                                    while (true) {
/* 100 */                               int i4 = iZza2 & length2;
/* 103 */                               char c = (char) sArr[i4];
/* 107 */                               if (c == 65535) {
                                            break;
                                        }
/* 116 */                               if (obj.equals(objArr[c])) {
/* 120 */                                   obj2 = objArr[c ^ 1];
                                            break;
                                        }
/* 123 */                               iZza2 = i4 + 1;
                                    }
                                } else {
/* 126 */                           int[] iArr = (int[]) obj4;
                                    int length3 = iArr.length - 1;
/* 134 */                           int iZza3 = zzhd.zza(obj.hashCode());
                                    while (true) {
/* 138 */                               int i5 = iZza3 & length3;
/* 139 */                               int i6 = iArr[i5];
/* 141 */                               if (i6 == -1) {
                                            break;
                                        }
/* 151 */                               if (obj.equals(objArr[i6])) {
/* 155 */                                   obj2 = objArr[i6 ^ 1];
                                            break;
                                        }
/* 161 */                               iZza3 = i5 + 1;
                                    }
                                }
                            }
                        }
                    }
/* 157 */           if (obj2 == null) {
/* 1 */                 return null;
                    }
/* 160 */           return obj2;
                }

                @Override
                public final int size() {
/* 1 */             return this.zzd;
                }

                @Override
                public final zzhg zza() {
/* 8 */             return new zzhw(this.zzb, 1, this.zzd);
                }

                @Override
                public final zzho zzf() {
/* 8 */             return new zzhu(this, this.zzb, 0, this.zzd);
                }

                @Override
                public final zzho zzg() {
/* 13 */            return new zzhv(this, new zzhw(this.zzb, 0, this.zzd));
                }
            }
