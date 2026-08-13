            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.IOException;
            import java.lang.reflect.Field;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.IioIoO10iOiI;
            import p000.IlIi0I0;
            import p000.OIiilo1Ool0o;
            import p000.OooioIOo1;
            import sun.misc.Unsafe;
            
            final class zzahq<T> implements zzaia<T> {
                private static final int[] zza = new int[0];
                private static final Unsafe zzb = zzait.zzg();
                private final int[] zzc;
                private final Object[] zzd;
                private final int zze;
                private final int zzf;
                private final zzahn zzg;
                private final boolean zzh;
                private final boolean zzi;
                private final int[] zzj;
                private final int zzk;
                private final int zzl;
                private final zzaim zzm;
                private final zzafs zzn;

                private zzahq(int[] iArr, Object[] objArr, int i, int i2, zzahn zzahnVar, boolean z, int[] iArr2, int i3, int i4, zzaht zzahtVar, zzagz zzagzVar, zzaim zzaimVar, zzafs zzafsVar, zzahi zzahiVar) {
/* 4 */             this.zzc = iArr;
/* 6 */             this.zzd = objArr;
/* 8 */             this.zze = i;
/* 10 */            this.zzf = i2;
/* 14 */            this.zzi = zzahnVar instanceof zzagg;
/* 16 */            boolean z2 = false;
/* 17 */            if (zzafsVar != null && (zzahnVar instanceof zzagd)) {
/* 23 */                z2 = true;
                    }
/* 24 */            this.zzh = z2;
/* 26 */            this.zzj = iArr2;
/* 28 */            this.zzk = i3;
/* 30 */            this.zzl = i4;
/* 32 */            this.zzm = zzaimVar;
/* 34 */            this.zzn = zzafsVar;
/* 36 */            this.zzg = zzahnVar;
                }

                private final void zzA(Object obj, Object obj2, int i) {
/* 1 */             int[] iArr = this.zzc;
/* 3 */             int i2 = iArr[i];
/* 9 */             if (zzM(obj2, i2, i)) {
/* 19 */                int iZzp = zzp(i) & 1048575;
/* 20 */                Unsafe unsafe = zzb;
                        long j = iZzp;
/* 23 */                Object object = unsafe.getObject(obj2, j);
/* 27 */                if (object == null) {
/* 102 */                   I000II.I001IO000(IlIi0I0.I000OiO(iArr[i], "Source subfield ", " is present but null: ", obj2.toString()));
/* 408 */                   return;
                        }
/* 29 */                zzaia zzaiaVarZzs = zzs(i);
/* 37 */                if (!zzM(obj, i2, i)) {
/* 43 */                    if (zzL(object)) {
/* 49 */                        Object objZzc = zzaiaVarZzs.zzc();
/* 53 */                        zzaiaVarZzs.zze(objZzc, object);
/* 56 */                        unsafe.putObject(obj, j, objZzc);
                            } else {
/* 45 */                        unsafe.putObject(obj, j, object);
                            }
/* 59 */                    zzD(obj, i2, i);
/* 62 */                    return;
                        }
/* 63 */                Object object2 = unsafe.getObject(obj, j);
/* 71 */                if (!zzL(object2)) {
/* 73 */                    Object objZzc2 = zzaiaVarZzs.zzc();
/* 77 */                    zzaiaVarZzs.zze(objZzc2, object2);
/* 80 */                    unsafe.putObject(obj, j, objZzc2);
/* 83 */                    object2 = objZzc2;
                        }
/* 84 */                zzaiaVarZzs.zze(object2, object);
                    }
                }

                private final void zzB(Object obj, int i, zzahz zzahzVar) {
/* 8 */             long j = i & 1048575;
/* 10 */            if (zzH(i)) {
/* 16 */                zzait.zzs(obj, j, zzahzVar.zzu());
                    } else if (this.zzi) {
/* 28 */                zzait.zzs(obj, j, zzahzVar.zzt());
                    } else {
/* 36 */                zzait.zzs(obj, j, zzahzVar.zzp());
                    }
                }

                private final void zzC(Object obj, int i) {
/* 1 */             int iZzn = zzn(i);
/* 8 */             long j = 1048575 & iZzn;
/* 15 */            if (j == 1048575) {
/* 17 */                return;
                    }
/* 28 */            zzait.zzq(obj, j, (1 << (iZzn >>> 20)) | zzait.zzc(obj, j));
                }

                private final void zzD(Object obj, int i, int i2) {
/* 10 */            zzait.zzq(obj, zzn(i2) & 1048575, i);
                }

                private final void zzE(Object obj, int i, Object obj2) {
/* 12 */            zzb.putObject(obj, zzp(i) & 1048575, obj2);
/* 15 */            zzC(obj, i);
                }

                private final void zzF(Object obj, int i, int i2, Object obj2) {
/* 12 */            zzb.putObject(obj, zzp(i2) & 1048575, obj2);
/* 15 */            zzD(obj, i, i2);
                }

                private final boolean zzG(Object obj, Object obj2, int i) {
                    return zzI(obj, i) == zzI(obj2, i);
                }

                private static boolean zzH(int i) {
                    return (i & 536870912) != 0;
                }

                private final boolean zzI(Object obj, int i) {
/* 1 */             int iZzn = zzn(i);
/* 8 */             long j = iZzn & 1048575;
/* 18 */            if (j != 1048575) {
                        return ((1 << (iZzn >>> 20)) & zzait.zzc(obj, j)) != 0;
                    }
/* 20 */            int iZzp = zzp(i);
/* 24 */            long j2 = iZzp & 1048575;
                    switch (zzo(iZzp)) {
                        case 0:
                            return Double.doubleToRawLongBits(zzait.zza(obj, j2)) != 0;
                        case 1:
                            return Float.floatToRawIntBits(zzait.zzb(obj, j2)) != 0;
                        case 2:
                            return zzait.zzd(obj, j2) != 0;
                        case 3:
                            return zzait.zzd(obj, j2) != 0;
                        case 4:
                            return zzait.zzc(obj, j2) != 0;
                        case 5:
                            return zzait.zzd(obj, j2) != 0;
                        case 6:
                            return zzait.zzc(obj, j2) != 0;
                        case 7:
/* 158 */                   return zzait.zzw(obj, j2);
                        case 8:
/* 122 */                   Object objZzf = zzait.zzf(obj, j2);
/* 128 */                   if (objZzf instanceof String) {
                                return !((String) objZzf).isEmpty();
                            }
/* 142 */                   if (objZzf instanceof zzafd) {
                                return !zzafd.zza.equals(objZzf);
                            }
/* 154 */                   OIiilo1Ool0o.I00100o1O0lo();
/* 16 */                    return false;
                        case 9:
                            return zzait.zzf(obj, j2) != null;
                        case 10:
                            return !zzafd.zza.equals(zzait.zzf(obj, j2));
                        case 11:
                            return zzait.zzc(obj, j2) != 0;
                        case 12:
                            return zzait.zzc(obj, j2) != 0;
                        case 13:
                            return zzait.zzc(obj, j2) != 0;
                        case 14:
                            return zzait.zzd(obj, j2) != 0;
                        case 15:
                            return zzait.zzc(obj, j2) != 0;
                        case 16:
                            return zzait.zzd(obj, j2) != 0;
                        case 17:
                            return zzait.zzf(obj, j2) != null;
                        default:
/* 36 */                    OIiilo1Ool0o.I00100o1O0lo();
/* 16 */                    return false;
                    }
                }

                private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
                    return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
                }

                private static boolean zzK(Object obj, int i, zzaia zzaiaVar) {
/* 10 */            return zzaiaVar.zzi(zzait.zzf(obj, i & 1048575));
                }

                private static boolean zzL(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return false;
                    }
/* 7 */             if (obj instanceof zzagg) {
/* 11 */                return ((zzagg) obj).zzG();
                    }
/* 16 */            return true;
                }

                private final boolean zzM(Object obj, int i, int i2) {
                    return zzait.zzc(obj, (long) (zzn(i2) & 1048575)) == i;
                }

                private static boolean zzN(Object obj, long j) {
/* 7 */             return ((Boolean) zzait.zzf(obj, j)).booleanValue();
                }

                private static final void zzO(int i, Object obj, zzajb zzajbVar) {
/* 3 */             if (obj instanceof String) {
/* 7 */                 zzajbVar.zzH(i, (String) obj);
                    } else {
/* 13 */                zzajbVar.zzd(i, (zzafd) obj);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:187:0x03c3  */
                /* JADX WARN: Removed duplicated region for block: B:193:0x03e2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static zzahq zzj(Class cls, zzahk zzahkVar, zzaht zzahtVar, zzagz zzagzVar, zzaim zzaimVar, zzafs zzafsVar, zzahi zzahiVar) {
                    int i;
                    int iCharAt;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int[] iArr;
                    int i7;
                    int i8;
                    char cCharAt;
                    int i9;
                    char cCharAt2;
                    int i10;
                    char cCharAt3;
                    int i11;
                    char cCharAt4;
                    int i12;
                    char cCharAt5;
                    int i13;
                    char cCharAt6;
                    int i14;
                    char cCharAt7;
                    int i15;
                    char cCharAt8;
                    int i16;
                    zzahy zzahyVar;
                    int i17;
                    Object[] objArr;
                    int i18;
                    int i19;
                    int i20;
                    int iObjectFieldOffset;
                    int iObjectFieldOffset2;
                    int i21;
                    char c;
                    int i22;
                    int i23;
                    int i24;
                    int i25;
                    int i26;
                    int i27;
                    Field fieldZzx;
                    char cCharAt9;
                    int i28;
                    int i29;
                    int i30;
                    int i31;
                    int i32;
                    Field fieldZzx2;
                    Field fieldZzx3;
                    int i33;
                    char cCharAt10;
                    int i34;
                    int i35;
                    char cCharAt11;
                    int i36;
                    char cCharAt12;
                    int i37;
                    char cCharAt13;
/* 5 */             if (!(zzahkVar instanceof zzahy)) {
/* 2665 */              throw null;
                    }
/* 7 */             zzahy zzahyVar2 = (zzahy) zzahkVar;
/* 9 */             String strZzd = zzahyVar2.zzd();
/* 13 */            int length = strZzd.length();
/* 22 */            char c2 = 55296;
/* 25 */            if (strZzd.charAt(0) >= 55296) {
/* 27 */                int i38 = 1;
                        while (true) {
/* 28 */                    i = i38 + 1;
/* 34 */                    if (strZzd.charAt(i38) < 55296) {
                                break;
                            }
/* 36 */                    i38 = i;
                        }
                    } else {
/* 38 */                i = 1;
                    }
/* 39 */            int i39 = i + 1;
/* 41 */            int iCharAt2 = strZzd.charAt(i);
/* 45 */            if (iCharAt2 >= 55296) {
/* 47 */                int i40 = iCharAt2 & 8191;
/* 49 */                int i41 = 13;
                        while (true) {
/* 51 */                    i37 = i39 + 1;
/* 53 */                    cCharAt13 = strZzd.charAt(i39);
/* 57 */                    if (cCharAt13 < 55296) {
                                break;
                            }
/* 62 */                    i40 |= (cCharAt13 & 8191) << i41;
/* 63 */                    i41 += 13;
/* 65 */                    i39 = i37;
                        }
/* 68 */                iCharAt2 = i40 | (cCharAt13 << i41);
/* 69 */                i39 = i37;
                    }
/* 70 */            if (iCharAt2 == 0) {
/* 74 */                i3 = 0;
/* 75 */                i6 = 0;
/* 76 */                iCharAt = 0;
/* 77 */                i2 = 0;
/* 78 */                i4 = 0;
/* 79 */                i5 = 0;
/* 72 */                iArr = zza;
/* 83 */                i7 = 0;
                    } else {
/* 87 */                int i42 = i39 + 1;
/* 89 */                int iCharAt3 = strZzd.charAt(i39);
/* 93 */                if (iCharAt3 >= 55296) {
/* 95 */                    int i43 = iCharAt3 & 8191;
/* 97 */                    int i44 = 13;
                            while (true) {
/* 99 */                        i15 = i42 + 1;
/* 101 */                       cCharAt8 = strZzd.charAt(i42);
/* 105 */                       if (cCharAt8 < 55296) {
                                    break;
                                }
/* 110 */                       i43 |= (cCharAt8 & 8191) << i44;
/* 111 */                       i44 += 13;
/* 113 */                       i42 = i15;
                            }
/* 116 */                   iCharAt3 = i43 | (cCharAt8 << i44);
/* 117 */                   i42 = i15;
                        }
/* 118 */               int i45 = i42 + 1;
/* 120 */               int iCharAt4 = strZzd.charAt(i42);
/* 124 */               if (iCharAt4 >= 55296) {
/* 126 */                   int i46 = iCharAt4 & 8191;
/* 128 */                   int i47 = 13;
                            while (true) {
/* 130 */                       i14 = i45 + 1;
/* 132 */                       cCharAt7 = strZzd.charAt(i45);
/* 136 */                       if (cCharAt7 < 55296) {
                                    break;
                                }
/* 141 */                       i46 |= (cCharAt7 & 8191) << i47;
/* 142 */                       i47 += 13;
/* 144 */                       i45 = i14;
                            }
/* 147 */                   iCharAt4 = i46 | (cCharAt7 << i47);
/* 148 */                   i45 = i14;
                        }
/* 149 */               int i48 = i45 + 1;
/* 151 */               int iCharAt5 = strZzd.charAt(i45);
/* 155 */               if (iCharAt5 >= 55296) {
/* 157 */                   int i49 = iCharAt5 & 8191;
/* 159 */                   int i50 = 13;
                            while (true) {
/* 161 */                       i13 = i48 + 1;
/* 163 */                       cCharAt6 = strZzd.charAt(i48);
/* 167 */                       if (cCharAt6 < 55296) {
                                    break;
                                }
/* 172 */                       i49 |= (cCharAt6 & 8191) << i50;
/* 173 */                       i50 += 13;
/* 175 */                       i48 = i13;
                            }
/* 178 */                   iCharAt5 = i49 | (cCharAt6 << i50);
/* 179 */                   i48 = i13;
                        }
/* 180 */               int i51 = i48 + 1;
/* 182 */               int iCharAt6 = strZzd.charAt(i48);
/* 186 */               if (iCharAt6 >= 55296) {
/* 188 */                   int i52 = iCharAt6 & 8191;
/* 190 */                   int i53 = 13;
                            while (true) {
/* 192 */                       i12 = i51 + 1;
/* 194 */                       cCharAt5 = strZzd.charAt(i51);
/* 198 */                       if (cCharAt5 < 55296) {
                                    break;
                                }
/* 203 */                       i52 |= (cCharAt5 & 8191) << i53;
/* 204 */                       i53 += 13;
/* 206 */                       i51 = i12;
                            }
/* 209 */                   iCharAt6 = i52 | (cCharAt5 << i53);
/* 210 */                   i51 = i12;
                        }
/* 211 */               int i54 = i51 + 1;
/* 213 */               iCharAt = strZzd.charAt(i51);
/* 217 */               if (iCharAt >= 55296) {
/* 219 */                   int i55 = iCharAt & 8191;
/* 221 */                   int i56 = 13;
                            while (true) {
/* 223 */                       i11 = i54 + 1;
/* 225 */                       cCharAt4 = strZzd.charAt(i54);
/* 229 */                       if (cCharAt4 < 55296) {
                                    break;
                                }
/* 234 */                       i55 |= (cCharAt4 & 8191) << i56;
/* 235 */                       i56 += 13;
/* 237 */                       i54 = i11;
                            }
/* 240 */                   iCharAt = i55 | (cCharAt4 << i56);
/* 241 */                   i54 = i11;
                        }
/* 242 */               int i57 = i54 + 1;
/* 244 */               int iCharAt7 = strZzd.charAt(i54);
/* 248 */               if (iCharAt7 >= 55296) {
/* 250 */                   int i58 = iCharAt7 & 8191;
/* 252 */                   int i59 = 13;
                            while (true) {
/* 254 */                       i10 = i57 + 1;
/* 256 */                       cCharAt3 = strZzd.charAt(i57);
/* 260 */                       if (cCharAt3 < 55296) {
                                    break;
                                }
/* 265 */                       i58 |= (cCharAt3 & 8191) << i59;
/* 266 */                       i59 += 13;
/* 268 */                       i57 = i10;
                            }
/* 271 */                   iCharAt7 = i58 | (cCharAt3 << i59);
/* 272 */                   i57 = i10;
                        }
/* 273 */               int i60 = i57 + 1;
/* 275 */               int iCharAt8 = strZzd.charAt(i57);
/* 279 */               if (iCharAt8 >= 55296) {
/* 281 */                   int i61 = iCharAt8 & 8191;
/* 283 */                   int i62 = 13;
                            while (true) {
/* 285 */                       i9 = i60 + 1;
/* 287 */                       cCharAt2 = strZzd.charAt(i60);
/* 291 */                       if (cCharAt2 < 55296) {
                                    break;
                                }
/* 296 */                       i61 |= (cCharAt2 & 8191) << i62;
/* 297 */                       i62 += 13;
/* 299 */                       i60 = i9;
                            }
/* 303 */                   iCharAt8 = i61 | (cCharAt2 << i62);
/* 304 */                   i60 = i9;
                        }
/* 306 */               int i63 = i60 + 1;
/* 308 */               int iCharAt9 = strZzd.charAt(i60);
/* 312 */               if (iCharAt9 >= 55296) {
/* 314 */                   int i64 = iCharAt9 & 8191;
/* 316 */                   int i65 = 13;
                            while (true) {
/* 318 */                       i8 = i63 + 1;
/* 320 */                       cCharAt = strZzd.charAt(i63);
/* 324 */                       if (cCharAt < 55296) {
                                    break;
                                }
/* 330 */                       i64 |= (cCharAt & 8191) << i65;
/* 331 */                       i65 += 13;
/* 333 */                       i63 = i8;
                            }
/* 338 */                   iCharAt9 = i64 | (cCharAt << i65);
/* 339 */                   i63 = i8;
                        }
/* 347 */               int i66 = iCharAt3 + iCharAt3 + iCharAt4;
/* 349 */               int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
/* 351 */               int i67 = iCharAt7;
/* 352 */               i2 = iCharAt5;
/* 353 */               i3 = i67;
/* 354 */               i4 = iCharAt6;
/* 355 */               i5 = iCharAt9;
/* 357 */               i6 = i66;
/* 359 */               iArr = iArr2;
/* 361 */               i7 = iCharAt3;
/* 362 */               i39 = i63;
                    }
/* 363 */           Unsafe unsafe = zzb;
/* 365 */           Object[] objArrZze = zzahyVar2.zze();
/* 373 */           Class<?> cls2 = zzahyVar2.zza().getClass();
/* 377 */           int i68 = i5 + i3;
/* 379 */           int i69 = iCharAt + iCharAt;
/* 383 */           int[] iArr3 = new int[iCharAt * 3];
/* 385 */           Object[] objArr2 = new Object[i69];
/* 387 */           int i70 = i5;
/* 389 */           int i71 = i68;
/* 391 */           int i72 = 0;
/* 392 */           int i73 = 0;
/* 394 */           while (i39 < length) {
/* 396 */               int i74 = i39 + 1;
/* 398 */               int iCharAt10 = strZzd.charAt(i39);
/* 402 */               if (iCharAt10 >= c2) {
/* 404 */                   int i75 = iCharAt10 & 8191;
/* 406 */                   int i76 = i74;
/* 408 */                   int i77 = 13;
                            while (true) {
/* 410 */                       i36 = i76 + 1;
/* 412 */                       cCharAt12 = strZzd.charAt(i76);
/* 416 */                       if (cCharAt12 < c2) {
                                    break;
                                }
/* 422 */                       i75 |= (cCharAt12 & 8191) << i77;
/* 423 */                       i77 += 13;
/* 425 */                       i76 = i36;
                            }
/* 430 */                   iCharAt10 = i75 | (cCharAt12 << i77);
/* 431 */                   i16 = i36;
                        } else {
/* 434 */                   i16 = i74;
                        }
/* 436 */               int i78 = i16 + 1;
/* 438 */               int iCharAt11 = strZzd.charAt(i16);
/* 442 */               if (iCharAt11 >= c2) {
/* 444 */                   int i79 = iCharAt11 & 8191;
/* 446 */                   int i80 = i78;
/* 448 */                   int i81 = 13;
                            while (true) {
/* 450 */                       i35 = i80 + 1;
/* 452 */                       cCharAt11 = strZzd.charAt(i80);
/* 456 */                       zzahyVar = zzahyVar2;
/* 461 */                       if (cCharAt11 < 55296) {
                                    break;
                                }
/* 467 */                       i79 |= (cCharAt11 & 8191) << i81;
/* 468 */                       i81 += 13;
/* 470 */                       i80 = i35;
/* 472 */                       zzahyVar2 = zzahyVar;
                            }
/* 477 */                   iCharAt11 = i79 | (cCharAt11 << i81);
/* 478 */                   i17 = i35;
                        } else {
/* 481 */                   zzahyVar = zzahyVar2;
/* 483 */                   i17 = i78;
                        }
/* 487 */               if ((iCharAt11 & Barcode.FORMAT_UPC_E) != 0) {
/* 491 */                   iArr[i73] = i72;
/* 489 */                   i73++;
                        }
/* 495 */               int i82 = iCharAt11 & 255;
/* 497 */               int i83 = length;
/* 499 */               int i84 = iCharAt11 & Barcode.FORMAT_PDF417;
/* 505 */               if (i82 >= 51) {
/* 507 */                   int i85 = i17 + 1;
/* 509 */                   int iCharAt12 = strZzd.charAt(i17);
/* 518 */                   if (iCharAt12 >= 55296) {
/* 520 */                       int i86 = iCharAt12 & 8191;
/* 522 */                       int i87 = i85;
/* 524 */                       int i88 = 13;
                                while (true) {
/* 526 */                           i33 = i87 + 1;
/* 528 */                           cCharAt10 = strZzd.charAt(i87);
/* 532 */                           i34 = i86;
/* 537 */                           if (cCharAt10 < 55296) {
                                        break;
                                    }
/* 543 */                           i86 = i34 | ((cCharAt10 & 8191) << i88);
/* 545 */                           i88 += 13;
/* 547 */                           i87 = i33;
                                }
/* 552 */                       iCharAt12 = i34 | (cCharAt10 << i88);
/* 554 */                       i31 = i33;
                            } else {
/* 557 */                       i31 = i85;
                            }
/* 559 */                   int i89 = iCharAt12;
                            int i90 = i82 - 51;
/* 563 */                   int i91 = i31;
/* 567 */                   if (i90 == 9 || i90 == 17) {
/* 618 */                       objArr2[OooioIOo1.I001i1lo1io(i72, 3, 1)] = objArrZze[i6];
/* 620 */                       i32 = i84;
/* 610 */                       i6++;
                            } else if (i90 != 12) {
/* 607 */                       i32 = i84;
                            } else if (zzahyVar.zzc() == 1 || i84 != 0) {
/* 603 */                       objArr2[OooioIOo1.I001i1lo1io(i72, 3, 1)] = objArrZze[i6];
/* 592 */                       i6++;
/* 607 */                       i32 = i84;
                            } else {
/* 590 */                       i32 = 0;
                            }
/* 624 */                   int i92 = i89 + i89;
/* 628 */                   Object obj = objArrZze[i92];
/* 630 */                   int i93 = i32;
/* 634 */                   if (obj instanceof Field) {
/* 636 */                       fieldZzx2 = (Field) obj;
                            } else {
/* 644 */                       fieldZzx2 = zzx(cls2, (String) obj);
/* 648 */                       objArrZze[i92] = fieldZzx2;
                            }
/* 638 */                   Object[] objArr3 = objArr2;
/* 639 */                   int i94 = i6;
/* 655 */                   int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzx2);
/* 656 */                   int i95 = i92 + 1;
/* 658 */                   Object obj2 = objArrZze[i95];
/* 664 */                   if (obj2 instanceof Field) {
/* 666 */                       fieldZzx3 = (Field) obj2;
                            } else {
/* 671 */                       fieldZzx3 = zzx(cls2, (String) obj2);
/* 675 */                       objArrZze[i95] = fieldZzx3;
                            }
/* 681 */                   int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzx3);
/* 684 */                   i19 = i7;
/* 686 */                   i26 = i94;
/* 687 */                   i20 = i72;
/* 688 */                   c = 55296;
/* 691 */                   iObjectFieldOffset2 = iObjectFieldOffset4;
/* 692 */                   i25 = iObjectFieldOffset3;
/* 694 */                   i84 = i93;
/* 696 */                   i18 = iCharAt10;
/* 698 */                   i39 = i91;
/* 700 */                   objArr = objArr3;
/* 702 */                   i24 = 0;
                        } else {
/* 705 */                   Object[] objArr4 = objArr2;
/* 706 */                   int i96 = i6 + 1;
/* 710 */                   objArr = objArr4;
/* 716 */                   Field fieldZzx4 = zzx(cls2, (String) objArrZze[i6]);
/* 720 */                   i18 = iCharAt10;
/* 724 */                   if (i82 == 9 || i82 == 17) {
/* 730 */                       i19 = i7;
/* 867 */                       objArr[OooioIOo1.I001i1lo1io(i72, 3, 1)] = fieldZzx4.getType();
                            } else {
/* 738 */                       if (i82 == 27) {
/* 844 */                           i19 = i7;
/* 846 */                           i28 = 3;
/* 847 */                           i29 = 1;
/* 848 */                           i30 = i6 + 2;
                                } else if (i82 == 49) {
/* 744 */                           i30 = i6 + 2;
/* 746 */                           i19 = i7;
/* 748 */                           i28 = 3;
/* 749 */                           i29 = 1;
                                } else {
/* 754 */                           if (i82 == 12 || i82 == 30 || i82 == 44) {
/* 817 */                               i19 = i7;
/* 820 */                               if (zzahyVar.zzc() == 1 || i84 != 0) {
/* 830 */                                   i30 = i6 + 2;
/* 839 */                                   objArr[OooioIOo1.I001i1lo1io(i72, 3, 1)] = objArrZze[i96];
/* 841 */                                   i96 = i30;
                                        } else {
/* 825 */                                   i20 = i72;
/* 827 */                                   i84 = 0;
                                        }
                                    } else if (i82 == 50) {
/* 769 */                               int i97 = i6 + 2;
/* 771 */                               int i98 = i70 + 1;
/* 773 */                               iArr[i70] = i72;
/* 775 */                               int i99 = i72 / 3;
/* 779 */                               int i100 = i99 + i99;
/* 781 */                               objArr[i100] = objArrZze[i96];
/* 783 */                               if (i84 != 0) {
/* 787 */                                   i96 = i6 + 3;
/* 791 */                                   objArr[i100 + 1] = objArrZze[i97];
/* 793 */                                   i20 = i72;
/* 794 */                                   i70 = i98;
                                        } else {
/* 800 */                                   i96 = i97;
/* 801 */                                   i20 = i72;
/* 802 */                                   i70 = i98;
/* 805 */                                   i84 = 0;
                                        }
/* 797 */                               i19 = i7;
                                    } else {
/* 808 */                               i19 = i7;
                                    }
/* 874 */                           iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzx4);
/* 877 */                           iObjectFieldOffset2 = 1048575;
/* 880 */                           if ((iCharAt11 & Barcode.FORMAT_AZTEC) != 0 || i82 > 17) {
/* 964 */                               i21 = i96;
/* 965 */                               c = 55296;
/* 968 */                               i22 = i17;
/* 969 */                               i23 = 0;
                                    } else {
/* 886 */                               int i101 = i17 + 1;
/* 888 */                               int iCharAt13 = strZzd.charAt(i17);
/* 895 */                               if (iCharAt13 >= 55296) {
/* 897 */                                   int i102 = iCharAt13 & 8191;
/* 899 */                                   int i103 = 13;
                                            while (true) {
/* 901 */                                       i27 = i101 + 1;
/* 903 */                                       cCharAt9 = strZzd.charAt(i101);
/* 907 */                                       if (cCharAt9 < 55296) {
                                                    break;
                                                }
/* 913 */                                       i102 |= (cCharAt9 & 8191) << i103;
/* 914 */                                       i103 += 13;
/* 916 */                                       i101 = i27;
                                            }
/* 921 */                                   iCharAt13 = i102 | (cCharAt9 << i103);
                                        } else {
/* 923 */                                   i27 = i101;
                                        }
/* 929 */                               int i104 = (iCharAt13 / 32) + i19 + i19;
/* 931 */                               Object obj3 = objArrZze[i104];
/* 935 */                               if (obj3 instanceof Field) {
/* 937 */                                   fieldZzx = (Field) obj3;
                                        } else {
/* 943 */                                   fieldZzx = zzx(cls2, (String) obj3);
/* 947 */                                   objArrZze[i104] = fieldZzx;
                                        }
/* 939 */                               i21 = i96;
/* 955 */                               i23 = iCharAt13 % 32;
/* 954 */                               iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzx);
/* 958 */                               i22 = i27;
/* 960 */                               c = 55296;
                                    }
/* 972 */                           if (i82 >= 18 || i82 > 49) {
/* 997 */                               i24 = i23;
/* 998 */                               i25 = iObjectFieldOffset;
/* 1000 */                              int i105 = i22;
/* 1002 */                              i26 = i21;
/* 1003 */                              i39 = i105;
                                    } else {
/* 978 */                               int i106 = i71 + 1;
/* 980 */                               iArr[i71] = iObjectFieldOffset;
/* 984 */                               i24 = i23;
/* 985 */                               i25 = iObjectFieldOffset;
/* 987 */                               int i107 = i22;
/* 989 */                               i26 = i21;
/* 990 */                               i39 = i107;
/* 992 */                               i71 = i106;
                                    }
                                }
/* 856 */                       objArr[OooioIOo1.I001i1lo1io(i72, i28, i29)] = objArrZze[i96];
/* 841 */                       i96 = i30;
                            }
/* 842 */                   i20 = i72;
/* 874 */                   iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzx4);
/* 877 */                   iObjectFieldOffset2 = 1048575;
/* 880 */                   if ((iCharAt11 & Barcode.FORMAT_AZTEC) != 0) {
/* 964 */                       i21 = i96;
/* 965 */                       c = 55296;
/* 968 */                       i22 = i17;
/* 969 */                       i23 = 0;
/* 972 */                       if (i82 >= 18) {
/* 997 */                           i24 = i23;
/* 998 */                           i25 = iObjectFieldOffset;
/* 1000 */                          int i1052 = i22;
/* 1002 */                          i26 = i21;
/* 1003 */                          i39 = i1052;
                                }
                            }
                        }
/* 1005 */              int i108 = i20 + 1;
/* 1007 */              iArr3[i20] = i18;
/* 1009 */              int i109 = i20 + 2;
/* 1044 */              iArr3[i108] = ((iCharAt11 & Barcode.FORMAT_UPC_A) != 0 ? 536870912 : 0) | ((iCharAt11 & Barcode.FORMAT_QR_CODE) != 0 ? 268435456 : 0) | (i84 != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | i25;
/* 1051 */              iArr3[i109] = (i24 << 20) | iObjectFieldOffset2;
/* 1046 */              i72 = i20 + 3;
/* 1054 */              i6 = i26;
/* 1055 */              length = i83;
/* 1057 */              c2 = c;
/* 1059 */              zzahyVar2 = zzahyVar;
/* 1061 */              i7 = i19;
/* 1063 */              objArr2 = objArr;
                    }
/* 1091 */          return new zzahq(iArr3, objArr2, i2, i4, zzahyVar2.zza(), false, iArr, i5, i68, zzahtVar, zzagzVar, zzaimVar, zzafsVar, zzahiVar);
                }

                private static double zzk(Object obj, long j) {
/* 7 */             return ((Double) zzait.zzf(obj, j)).doubleValue();
                }

                private static float zzl(Object obj, long j) {
/* 7 */             return ((Float) zzait.zzf(obj, j)).floatValue();
                }

                private static int zzm(Object obj, long j) {
/* 7 */             return ((Integer) zzait.zzf(obj, j)).intValue();
                }

                private final int zzn(int i) {
/* 5 */             return this.zzc[i + 2];
                }

                private static int zzo(int i) {
/* 3 */             return (i >>> 20) & 255;
                }

                private final int zzp(int i) {
/* 5 */             return this.zzc[i + 1];
                }

                private static long zzq(Object obj, long j) {
/* 7 */             return ((Long) zzait.zzf(obj, j)).longValue();
                }

                private final zzagk zzr(int i) {
/* 1 */             int i2 = i / 3;
/* 10 */            return (zzagk) this.zzd[i2 + i2 + 1];
                }

                private final zzaia zzs(int i) {
/* 1 */             Object[] objArr = this.zzd;
/* 3 */             int i2 = i / 3;
/* 5 */             int i3 = i2 + i2;
/* 8 */             zzaia zzaiaVar = (zzaia) objArr[i3];
/* 10 */            if (zzaiaVar != null) {
/* 12 */                return zzaiaVar;
                    }
/* 23 */            zzaia zzaiaVarZzb = zzahw.zza().zzb((Class) objArr[i3 + 1]);
/* 27 */            objArr[i3] = zzaiaVarZzb;
/* 29 */            return zzaiaVarZzb;
                }

                private final Object zzt(Object obj, int i, Object obj2, zzaim zzaimVar, Object obj3) {
                    zzagk zzagkVarZzr;
/* 3 */             int i2 = this.zzc[i];
/* 14 */            Object objZzf = zzait.zzf(obj, zzp(i) & 1048575);
/* 18 */            if (objZzf == null || (zzagkVarZzr = zzr(i)) == null) {
/* 27 */                return obj2;
                    }
/* 36 */            zzahf zzahfVarZzc = ((zzahg) zzu(i)).zzc();
/* 44 */            Iterator it = ((zzahh) objZzf).entrySet().iterator();
/* 52 */            while (it.hasNext()) {
/* 58 */                Map.Entry entry = (Map.Entry) it.next();
/* 74 */                if (!zzagkVarZzr.zza(((Integer) entry.getValue()).intValue())) {
/* 76 */                    if (obj2 == null) {
/* 78 */                        obj2 = zzaimVar.zza(obj3);
                            }
/* 90 */                    int iZzb = zzahg.zzb(zzahfVarZzc, entry.getKey(), entry.getValue());
/* 94 */                    zzafd zzafdVar = zzafd.zza;
/* 96 */                    byte[] bArr = new byte[iZzb];
/* 98 */                    int i3 = zzafm.zzb;
/* 103 */                   zzafj zzafjVar = new zzafj(bArr, 0, iZzb);
                            try {
/* 114 */                       zzahg.zze(zzafjVar, zzahfVarZzc, entry.getKey(), entry.getValue());
/* 121 */                       zzaimVar.zzg(obj2, i2, zzaez.zza(zzafjVar, bArr));
/* 124 */                       it.remove();
                            } catch (IOException e) {
/* 129 */                       IioIoO10iOiI.I000lI(e);
/* 132 */                       return null;
                            }
                        }
                    }
/* 399 */           return obj2;
                }

                private final Object zzu(int i) {
/* 1 */             int i2 = i / 3;
/* 6 */             return this.zzd[i2 + i2];
                }

                private final Object zzv(Object obj, int i) {
/* 1 */             zzaia zzaiaVarZzs = zzs(i);
/* 12 */            int iZzp = zzp(i) & 1048575;
/* 17 */            if (!zzI(obj, i)) {
/* 19 */                return zzaiaVarZzs.zzc();
                    }
/* 27 */            Object object = zzb.getObject(obj, iZzp);
/* 35 */            if (zzL(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZzc = zzaiaVarZzs.zzc();
/* 42 */            if (object != null) {
/* 44 */                zzaiaVarZzs.zze(objZzc, object);
                    }
/* 106 */           return objZzc;
                }

                private final Object zzw(Object obj, int i, int i2) {
/* 1 */             zzaia zzaiaVarZzs = zzs(i2);
/* 9 */             if (!zzM(obj, i, i2)) {
/* 11 */                return zzaiaVarZzs.zzc();
                    }
/* 27 */            Object object = zzb.getObject(obj, zzp(i2) & 1048575);
/* 35 */            if (zzL(object)) {
/* 37 */                return object;
                    }
/* 38 */            Object objZzc = zzaiaVarZzs.zzc();
/* 42 */            if (object != null) {
/* 44 */                zzaiaVarZzs.zze(objZzc, object);
                    }
/* 98 */            return objZzc;
                }

                private static Field zzx(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (NoSuchFieldException e) {
/* 7 */                 Field[] declaredFields = cls.getDeclaredFields();
/* 13 */                for (Field field : declaredFields) {
/* 25 */                    if (str.equals(field.getName())) {
/* 27 */                        return field;
                            }
                        }
/* 33 */                String name = cls.getName();
/* 37 */                String string = Arrays.toString(declaredFields);
/* 47 */                StringBuilder sbI00111O = IIl001iO0Io.I00111O("Field ", str, " for ", name, " not found. Known fields are ");
/* 51 */                sbI00111O.append(string);
/* 106 */               throw new RuntimeException(sbI00111O.toString(), e);
                    }
                }

                private static void zzy(Object obj) {
/* 5 */             if (zzL(obj)) {
/* 7 */                 return;
                    }
/* 18 */            I000II.I000iOII("Mutating immutable message: ".concat(String.valueOf(obj)));
                }

                private final void zzz(Object obj, Object obj2, int i) {
/* 5 */             if (zzI(obj2, i)) {
/* 15 */                int iZzp = zzp(i) & 1048575;
/* 16 */                Unsafe unsafe = zzb;
                        long j = iZzp;
/* 19 */                Object object = unsafe.getObject(obj2, j);
/* 23 */                if (object == null) {
/* 100 */                   I000II.I001IO000(IlIi0I0.I000OiO(this.zzc[i], "Source subfield ", " is present but null: ", obj2.toString()));
/* 408 */                   return;
                        }
/* 25 */                zzaia zzaiaVarZzs = zzs(i);
/* 33 */                if (!zzI(obj, i)) {
/* 39 */                    if (zzL(object)) {
/* 45 */                        Object objZzc = zzaiaVarZzs.zzc();
/* 49 */                        zzaiaVarZzs.zze(objZzc, object);
/* 52 */                        unsafe.putObject(obj, j, objZzc);
                            } else {
/* 41 */                        unsafe.putObject(obj, j, object);
                            }
/* 55 */                    zzC(obj, i);
/* 58 */                    return;
                        }
/* 59 */                Object object2 = unsafe.getObject(obj, j);
/* 67 */                if (!zzL(object2)) {
/* 69 */                    Object objZzc2 = zzaiaVarZzs.zzc();
/* 73 */                    zzaiaVarZzs.zze(objZzc2, object2);
/* 76 */                    unsafe.putObject(obj, j, objZzc2);
/* 79 */                    object2 = objZzc2;
                        }
/* 80 */                zzaiaVarZzs.zze(object2, object);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:194:0x04f1  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01e6  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int zza(Object obj) {
                    int i;
                    int iZzy;
                    int iZzz;
                    int iZzi;
                    int size;
                    int iZzm;
                    int iZzy2;
                    int iZzy3;
                    int iZzy4;
                    int iZzy5;
                    int iZza;
                    int iZzy6;
                    int iZzz2;
/* 1 */             zzahq<T> zzahqVar = this;
/* 3 */             Object obj2 = obj;
/* 5 */             Unsafe unsafe = zzb;
/* 8 */             int i2 = 1048575;
/* 11 */            int i3 = 0;
/* 12 */            int i4 = 0;
/* 13 */            int iI001l0I00 = 0;
/* 14 */            int i5 = 1048575;
                    while (true) {
/* 15 */                int[] iArr = zzahqVar.zzc;
/* 18 */                if (i3 >= iArr.length) {
/* 1812 */                  int iZza2 = ((zzagg) obj).zzc.zza() + iI001l0I00;
/* 1815 */                  if (!zzahqVar.zzh) {
/* 1894 */                      return iZza2;
                            }
/* 1823 */                  zzaii zzaiiVar = ((zzagd) obj).zzb.zza;
/* 1825 */                  int iZzc = zzaiiVar.zzc();
/* 1829 */                  int iZzb = 0;
/* 1830 */                  for (int i6 = 0; i6 < iZzc; i6++) {
/* 1832 */                      Map.Entry entryZzg = zzaiiVar.zzg(i6);
/* 1853 */                      iZzb += zzafw.zzb((zzafv) ((zzaie) entryZzg).zza(), entryZzg.getValue());
                            }
/* 1869 */                  for (Map.Entry entry : zzaiiVar.zzd()) {
/* 1891 */                      iZzb += zzafw.zzb((zzafv) entry.getKey(), entry.getValue());
                            }
/* 1893 */                  return iZza2 + iZzb;
                        }
/* 20 */                int iZzp = zzahqVar.zzp(i3);
/* 24 */                int iZzo = zzo(iZzp);
/* 28 */                int i7 = iArr[i3];
/* 32 */                int i8 = iArr[i3 + 2];
/* 34 */                int i9 = i8 & i2;
/* 39 */                if (iZzo <= 17) {
/* 41 */                    if (i9 != i5) {
/* 48 */                        i4 = i9 == i2 ? 0 : unsafe.getInt(obj2, i9);
/* 53 */                        i5 = i9;
                            }
/* 56 */                    i = 1 << (i8 >>> 20);
                        } else {
/* 59 */                    i = 0;
                        }
/* 60 */                int i10 = iZzp & i2;
/* 67 */                if (iZzo >= zzafx.zzJ.zza()) {
/* 71 */                    zzafx.zzW.zza();
                        }
                        long j = i10;
                        switch (iZzo) {
                            case 0:
/* 1785 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1789 */                          iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 8, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
/* 1771 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1775 */                          iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 4, iI001l0I00);
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 2:
/* 1749 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1753 */                          long j2 = unsafe.getLong(obj2, j);
/* 1757 */                          iZzy = zzafm.zzy(i7 << 3);
/* 1761 */                          iZzz = zzafm.zzz(j2);
/* 1463 */                          iI001l0I00 += iZzz + iZzy;
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 3:
/* 1727 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1731 */                          long j3 = unsafe.getLong(obj2, j);
/* 1735 */                          iZzy = zzafm.zzy(i7 << 3);
/* 1739 */                          iZzz = zzafm.zzz(j3);
/* 1463 */                          iI001l0I00 += iZzz + iZzy;
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 4:
/* 1704 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1708 */                          long j4 = unsafe.getInt(obj2, j);
/* 1713 */                          iZzy = zzafm.zzy(i7 << 3);
/* 1717 */                          iZzz = zzafm.zzz(j4);
/* 1463 */                          iI001l0I00 += iZzz + iZzy;
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 5:
/* 1690 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1694 */                          iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 8, iI001l0I00);
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 6:
/* 1676 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1680 */                          iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 4, iI001l0I00);
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 7:
/* 1662 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1666 */                          iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 1, iI001l0I00);
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 8:
/* 1614 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1616 */                          int i11 = i7 << 3;
/* 1618 */                          Object object = unsafe.getObject(obj2, j);
/* 1624 */                          if (object instanceof zzafd) {
/* 1628 */                              int iZzy7 = zzafm.zzy(i11);
/* 1632 */                              int iZze = ((zzafd) object).zze();
/* 1636 */                              iI001l0I00 = OooioIOo1.I001iOo1i0O(iZze, iZze, iZzy7, iI001l0I00);
                                    } else {
/* 1644 */                              int iZzy8 = zzafm.zzy(i11);
/* 1648 */                              int iZzb2 = zzaiy.zzb((String) object);
/* 1652 */                              iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzb2, iZzb2, iZzy8, iI001l0I00);
                                    }
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 9:
/* 1594 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1604 */                          iZzi = zzaic.zzi(i7, unsafe.getObject(obj2, j), zzahqVar.zzs(i3));
/* 105 */                           iI001l0I00 += iZzi;
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
/* 1567 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1575 */                          zzafd zzafdVar = (zzafd) unsafe.getObject(obj2, j);
/* 1577 */                          int iZzy9 = zzafm.zzy(i7 << 3);
/* 1581 */                          int iZze2 = zzafdVar.zze();
/* 1585 */                          iI001l0I00 = OooioIOo1.I001iOo1i0O(iZze2, iZze2, iZzy9, iI001l0I00);
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 11:
/* 1546 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1558 */                          iI001l0I00 = OooioIOo1.I001l0I00(unsafe.getInt(obj2, j), zzafm.zzy(i7 << 3), iI001l0I00);
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 12:
/* 1524 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1528 */                          long j5 = unsafe.getInt(obj2, j);
/* 1533 */                          iZzy = zzafm.zzy(i7 << 3);
/* 1537 */                          iZzz = zzafm.zzz(j5);
/* 1463 */                          iI001l0I00 += iZzz + iZzy;
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 13:
/* 1511 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1515 */                          iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 4, iI001l0I00);
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 14:
/* 1498 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1502 */                          iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 8, iI001l0I00);
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 15:
/* 1472 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1476 */                          int i12 = unsafe.getInt(obj2, j);
/* 1489 */                          iI001l0I00 = OooioIOo1.I001l0I00((i12 >> 31) ^ (i12 + i12), zzafm.zzy(i7 << 3), iI001l0I00);
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 16:
/* 1441 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1445 */                          long j6 = unsafe.getLong(obj2, j);
/* 1453 */                          iZzy = zzafm.zzy(i7 << 3);
/* 1458 */                          iZzz = zzafm.zzz((j6 >> 63) ^ (j6 + j6));
/* 1463 */                          iI001l0I00 += iZzz + iZzy;
                                }
/* 1464 */                      zzahqVar = this;
                                break;
                            case 17:
/* 1419 */                      if (zzahqVar.zzJ(obj2, i3, i5, i4, i)) {
/* 1431 */                          iZzi = zzaic.zza(i7, (zzahn) unsafe.getObject(obj2, j), zzahqVar.zzs(i3));
/* 105 */                           iI001l0I00 += iZzi;
                                    break;
                                } else {
                                    break;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 1409 */                      iZzi = zzaic.zze(i7, (List) unsafe.getObject(obj2, j), false);
/* 105 */                       iI001l0I00 += iZzi;
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 1397 */                      iZzi = zzaic.zzc(i7, (List) unsafe.getObject(obj2, j), false);
/* 105 */                       iI001l0I00 += iZzi;
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 1363 */                      List list = (List) unsafe.getObject(obj2, j);
/* 1365 */                      int i13 = zzaic.zza;
/* 1389 */                      iZzy3 = list.size() == 0 ? 0 : (zzafm.zzy(i7 << 3) * list.size()) + zzaic.zzh(list);
/* 1276 */                      iI001l0I00 += iZzy3;
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 1335 */                      List list2 = (List) unsafe.getObject(obj2, j);
/* 1337 */                      int i14 = zzaic.zza;
/* 1339 */                      size = list2.size();
/* 1343 */                      if (size != 0) {
/* 1349 */                          iZzm = zzaic.zzm(list2);
/* 1353 */                          iZzy2 = zzafm.zzy(i7 << 3);
/* 933 */                           iZzy4 = (iZzy2 * size) + iZzm;
/* 524 */                           iI001l0I00 += iZzy4;
                                    break;
                                }
/* 487 */                       iZzy4 = 0;
/* 524 */                       iI001l0I00 += iZzy4;
                            case PoseLandmark.RIGHT_THUMB:
/* 1307 */                      List list3 = (List) unsafe.getObject(obj2, j);
/* 1309 */                      int i15 = zzaic.zza;
/* 1311 */                      size = list3.size();
/* 1315 */                      if (size != 0) {
/* 1321 */                          iZzm = zzaic.zzg(list3);
/* 1325 */                          iZzy2 = zzafm.zzy(i7 << 3);
/* 933 */                           iZzy4 = (iZzy2 * size) + iZzm;
/* 524 */                           iI001l0I00 += iZzy4;
                                    break;
                                }
/* 487 */                       iZzy4 = 0;
/* 524 */                       iI001l0I00 += iZzy4;
                            case PoseLandmark.LEFT_HIP:
/* 1297 */                      iZzi = zzaic.zze(i7, (List) unsafe.getObject(obj2, j), false);
/* 105 */                       iI001l0I00 += iZzi;
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 1285 */                      iZzi = zzaic.zzc(i7, (List) unsafe.getObject(obj2, j), false);
/* 105 */                       iI001l0I00 += iZzi;
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 1256 */                      List list4 = (List) unsafe.getObject(obj2, j);
/* 1258 */                      int i16 = zzaic.zza;
/* 1260 */                      int size2 = list4.size();
/* 1264 */                      if (size2 != 0) {
/* 1275 */                          iZzy3 = (zzafm.zzy(i7 << 3) + 1) * size2;
                                }
/* 1276 */                      iI001l0I00 += iZzy3;
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 1157 */                      List list5 = (List) unsafe.getObject(obj2, j);
/* 1159 */                      int i17 = zzaic.zza;
/* 1161 */                      int size3 = list5.size();
/* 1165 */                      if (size3 == 0) {
/* 487 */                           iZzy4 = 0;
                                } else {
/* 1175 */                          iZzy4 = zzafm.zzy(i7 << 3) * size3;
/* 1178 */                          if (list5 instanceof zzagy) {
/* 1180 */                              zzagy zzagyVar = (zzagy) list5;
/* 1183 */                              for (int i18 = 0; i18 < size3; i18++) {
/* 1185 */                                  Object objZzb = zzagyVar.zzb();
/* 1191 */                                  if (objZzb instanceof zzafd) {
/* 1195 */                                      int iZze3 = ((zzafd) objZzb).zze();
/* 1199 */                                      iZzy4 = OooioIOo1.I001l0I00(iZze3, iZze3, iZzy4);
                                            } else {
/* 1206 */                                      int iZzb3 = zzaiy.zzb((String) objZzb);
/* 1210 */                                      iZzy4 = OooioIOo1.I001l0I00(iZzb3, iZzb3, iZzy4);
                                            }
                                        }
                                    } else {
/* 1218 */                              for (int i19 = 0; i19 < size3; i19++) {
/* 1220 */                                  Object obj3 = list5.get(i19);
/* 1226 */                                  if (obj3 instanceof zzafd) {
/* 1230 */                                      int iZze4 = ((zzafd) obj3).zze();
/* 1234 */                                      iZzy4 = OooioIOo1.I001l0I00(iZze4, iZze4, iZzy4);
                                            } else {
/* 1241 */                                      int iZzb4 = zzaiy.zzb((String) obj3);
/* 1245 */                                      iZzy4 = OooioIOo1.I001l0I00(iZzb4, iZzb4, iZzy4);
                                            }
                                        }
                                    }
                                }
/* 524 */                       iI001l0I00 += iZzy4;
                                break;
                            case 27:
/* 1092 */                      List list6 = (List) unsafe.getObject(obj2, j);
/* 1094 */                      zzaia zzaiaVarZzs = zzahqVar.zzs(i3);
/* 1098 */                      int i20 = zzaic.zza;
/* 1100 */                      int size4 = list6.size();
/* 1104 */                      if (size4 == 0) {
/* 1106 */                          iZzy5 = 0;
                                } else {
/* 1114 */                          iZzy5 = zzafm.zzy(i7 << 3) * size4;
/* 1116 */                          for (int i21 = 0; i21 < size4; i21++) {
/* 1118 */                              Object obj4 = list6.get(i21);
/* 1124 */                              if (obj4 instanceof zzagx) {
/* 1128 */                                  int iZza3 = ((zzagx) obj4).zza();
/* 1132 */                                  iZzy5 = OooioIOo1.I001l0I00(iZza3, iZza3, iZzy5);
                                        } else {
/* 1139 */                                  int iZzj = ((zzaeo) obj4).zzj(zzaiaVarZzs);
/* 1143 */                                  iZzy5 = OooioIOo1.I001l0I00(iZzj, iZzj, iZzy5);
                                        }
                                    }
                                }
/* 1150 */                      iI001l0I00 += iZzy5;
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 1045 */                      List list7 = (List) unsafe.getObject(obj2, j);
/* 1047 */                      int i22 = zzaic.zza;
/* 1049 */                      int size5 = list7.size();
/* 1053 */                      if (size5 != 0) {
/* 1063 */                          iZzy4 = zzafm.zzy(i7 << 3) * size5;
/* 1069 */                          for (int i23 = 0; i23 < list7.size(); i23++) {
/* 1077 */                              int iZze5 = ((zzafd) list7.get(i23)).zze();
/* 1081 */                              iZzy4 = OooioIOo1.I001l0I00(iZze5, iZze5, iZzy4);
                                    }
                                }
/* 524 */                       iI001l0I00 += iZzy4;
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 1018 */                      List list8 = (List) unsafe.getObject(obj2, j);
/* 1020 */                      int i24 = zzaic.zza;
/* 1022 */                      size = list8.size();
/* 1026 */                      if (size != 0) {
/* 1032 */                          iZzm = zzaic.zzl(list8);
/* 1036 */                          iZzy2 = zzafm.zzy(i7 << 3);
/* 933 */                           iZzy4 = (iZzy2 * size) + iZzm;
/* 524 */                           iI001l0I00 += iZzy4;
                                    break;
                                }
/* 487 */                       iZzy4 = 0;
/* 524 */                       iI001l0I00 += iZzy4;
                            case 30:
/* 991 */                       List list9 = (List) unsafe.getObject(obj2, j);
/* 993 */                       int i25 = zzaic.zza;
/* 995 */                       size = list9.size();
/* 999 */                       if (size != 0) {
/* 1005 */                          iZzm = zzaic.zzb(list9);
/* 1009 */                          iZzy2 = zzafm.zzy(i7 << 3);
/* 933 */                           iZzy4 = (iZzy2 * size) + iZzm;
/* 524 */                           iI001l0I00 += iZzy4;
                                    break;
                                }
/* 487 */                       iZzy4 = 0;
/* 524 */                       iI001l0I00 += iZzy4;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 981 */                       iZzi = zzaic.zzc(i7, (List) unsafe.getObject(obj2, j), false);
/* 105 */                       iI001l0I00 += iZzi;
                                break;
                            case 32:
/* 969 */                       iZzi = zzaic.zze(i7, (List) unsafe.getObject(obj2, j), false);
/* 105 */                       iI001l0I00 += iZzi;
                                break;
                            case 33:
/* 940 */                       List list10 = (List) unsafe.getObject(obj2, j);
/* 942 */                       int i26 = zzaic.zza;
/* 944 */                       size = list10.size();
/* 948 */                       if (size != 0) {
/* 954 */                           iZzm = zzaic.zzj(list10);
/* 958 */                           iZzy2 = zzafm.zzy(i7 << 3);
/* 933 */                           iZzy4 = (iZzy2 * size) + iZzm;
/* 524 */                           iI001l0I00 += iZzy4;
                                    break;
                                }
/* 487 */                       iZzy4 = 0;
/* 524 */                       iI001l0I00 += iZzy4;
                            case 34:
/* 910 */                       List list11 = (List) unsafe.getObject(obj2, j);
/* 912 */                       int i27 = zzaic.zza;
/* 914 */                       size = list11.size();
/* 918 */                       if (size != 0) {
/* 924 */                           iZzm = zzaic.zzk(list11);
/* 928 */                           iZzy2 = zzafm.zzy(i7 << 3);
/* 933 */                           iZzy4 = (iZzy2 * size) + iZzm;
/* 524 */                           iI001l0I00 += iZzy4;
                                    break;
                                }
/* 487 */                       iZzy4 = 0;
/* 524 */                       iI001l0I00 += iZzy4;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 888 */                       int iZzf = zzaic.zzf((List) unsafe.getObject(obj2, j));
/* 892 */                       if (iZzf > 0) {
/* 900 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzf, zzafm.zzy(i7 << 3), iZzf, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 36:
/* 864 */                       int iZzd = zzaic.zzd((List) unsafe.getObject(obj2, j));
/* 868 */                       if (iZzd > 0) {
/* 876 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzd, zzafm.zzy(i7 << 3), iZzd, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 37:
/* 840 */                       int iZzh = zzaic.zzh((List) unsafe.getObject(obj2, j));
/* 844 */                       if (iZzh > 0) {
/* 852 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzh, zzafm.zzy(i7 << 3), iZzh, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 38:
/* 816 */                       int iZzm2 = zzaic.zzm((List) unsafe.getObject(obj2, j));
/* 820 */                       if (iZzm2 > 0) {
/* 828 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzm2, zzafm.zzy(i7 << 3), iZzm2, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 39:
/* 792 */                       int iZzg = zzaic.zzg((List) unsafe.getObject(obj2, j));
/* 796 */                       if (iZzg > 0) {
/* 804 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzg, zzafm.zzy(i7 << 3), iZzg, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 40:
/* 768 */                       int iZzf2 = zzaic.zzf((List) unsafe.getObject(obj2, j));
/* 772 */                       if (iZzf2 > 0) {
/* 780 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzf2, zzafm.zzy(i7 << 3), iZzf2, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 41:
/* 744 */                       int iZzd2 = zzaic.zzd((List) unsafe.getObject(obj2, j));
/* 748 */                       if (iZzd2 > 0) {
/* 756 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzd2, zzafm.zzy(i7 << 3), iZzd2, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 42:
/* 716 */                       List list12 = (List) unsafe.getObject(obj2, j);
/* 718 */                       int i28 = zzaic.zza;
/* 720 */                       int size6 = list12.size();
/* 724 */                       if (size6 > 0) {
/* 732 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(size6, zzafm.zzy(i7 << 3), size6, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 43:
/* 694 */                       int iZzl = zzaic.zzl((List) unsafe.getObject(obj2, j));
/* 698 */                       if (iZzl > 0) {
/* 706 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzl, zzafm.zzy(i7 << 3), iZzl, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 44:
/* 670 */                       int iZzb5 = zzaic.zzb((List) unsafe.getObject(obj2, j));
/* 674 */                       if (iZzb5 > 0) {
/* 682 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzb5, zzafm.zzy(i7 << 3), iZzb5, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case BuildConfig.VERSION_CODE:
/* 646 */                       int iZzd3 = zzaic.zzd((List) unsafe.getObject(obj2, j));
/* 650 */                       if (iZzd3 > 0) {
/* 658 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzd3, zzafm.zzy(i7 << 3), iZzd3, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 46:
/* 622 */                       int iZzf3 = zzaic.zzf((List) unsafe.getObject(obj2, j));
/* 626 */                       if (iZzf3 > 0) {
/* 634 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzf3, zzafm.zzy(i7 << 3), iZzf3, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 47:
/* 598 */                       int iZzj2 = zzaic.zzj((List) unsafe.getObject(obj2, j));
/* 602 */                       if (iZzj2 > 0) {
/* 610 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzj2, zzafm.zzy(i7 << 3), iZzj2, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 48:
/* 574 */                       int iZzk = zzaic.zzk((List) unsafe.getObject(obj2, j));
/* 578 */                       if (iZzk > 0) {
/* 586 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzk, zzafm.zzy(i7 << 3), iZzk, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 49:
/* 531 */                       List list13 = (List) unsafe.getObject(obj2, j);
/* 533 */                       zzaia zzaiaVarZzs2 = zzahqVar.zzs(i3);
/* 537 */                       int i29 = zzaic.zza;
/* 539 */                       int size7 = list13.size();
/* 543 */                       if (size7 == 0) {
/* 545 */                           iZza = 0;
                                } else {
/* 548 */                           iZza = 0;
/* 549 */                           for (int i30 = 0; i30 < size7; i30++) {
/* 561 */                               iZza += zzaic.zza(i7, (zzahn) list13.get(i30), zzaiaVarZzs2);
                                    }
                                }
/* 565 */                       iI001l0I00 += iZza;
                                break;
                            case 50:
/* 477 */                       zzahh zzahhVar = (zzahh) unsafe.getObject(obj2, j);
/* 479 */                       zzahg zzahgVar = (zzahg) zzahqVar.zzu(i3);
/* 485 */                       if (!zzahhVar.isEmpty()) {
/* 497 */                           iZzy4 = 0;
/* 502 */                           for (Map.Entry entry2 : zzahhVar.entrySet()) {
/* 522 */                               iZzy4 += zzahgVar.zza(i7, entry2.getKey(), entry2.getValue());
                                    }
                                }
/* 524 */                       iI001l0I00 += iZzy4;
                                break;
                            case 51:
/* 459 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 463 */                           iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 8, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
/* 445 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 449 */                           iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 4, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
/* 423 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 427 */                           long jZzq = zzq(obj2, j);
/* 431 */                           iZzy6 = zzafm.zzy(i7 << 3);
/* 435 */                           iZzz2 = zzafm.zzz(jZzq);
/* 134 */                           iI001l0I00 += iZzz2 + iZzy6;
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
/* 401 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 405 */                           long jZzq2 = zzq(obj2, j);
/* 409 */                           iZzy6 = zzafm.zzy(i7 << 3);
/* 413 */                           iZzz2 = zzafm.zzz(jZzq2);
/* 134 */                           iI001l0I00 += iZzz2 + iZzy6;
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
/* 378 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 382 */                           long jZzm = zzm(obj2, j);
/* 387 */                           iZzy6 = zzafm.zzy(i7 << 3);
/* 391 */                           iZzz2 = zzafm.zzz(jZzm);
/* 134 */                           iI001l0I00 += iZzz2 + iZzy6;
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
/* 364 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 368 */                           iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 8, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
/* 350 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 354 */                           iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 4, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
/* 336 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 340 */                           iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 1, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
/* 288 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 290 */                           int i31 = i7 << 3;
/* 292 */                           Object object2 = unsafe.getObject(obj2, j);
/* 298 */                           if (object2 instanceof zzafd) {
/* 302 */                               int iZzy10 = zzafm.zzy(i31);
/* 306 */                               int iZze6 = ((zzafd) object2).zze();
/* 310 */                               iI001l0I00 = OooioIOo1.I001iOo1i0O(iZze6, iZze6, iZzy10, iI001l0I00);
                                        break;
                                    } else {
/* 318 */                               int iZzy11 = zzafm.zzy(i31);
/* 322 */                               int iZzb6 = zzaiy.zzb((String) object2);
/* 326 */                               iI001l0I00 = OooioIOo1.I001iOo1i0O(iZzb6, iZzb6, iZzy11, iI001l0I00);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            case 60:
/* 268 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 278 */                           iZzi = zzaic.zzi(i7, unsafe.getObject(obj2, j), zzahqVar.zzs(i3));
/* 105 */                           iI001l0I00 += iZzi;
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
/* 240 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 248 */                           zzafd zzafdVar2 = (zzafd) unsafe.getObject(obj2, j);
/* 250 */                           int iZzy12 = zzafm.zzy(i7 << 3);
/* 254 */                           int iZze7 = zzafdVar2.zze();
/* 258 */                           iI001l0I00 = OooioIOo1.I001iOo1i0O(iZze7, iZze7, iZzy12, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
/* 218 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 230 */                           iI001l0I00 = OooioIOo1.I001l0I00(zzm(obj2, j), zzafm.zzy(i7 << 3), iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
/* 196 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 200 */                           long jZzm2 = zzm(obj2, j);
/* 205 */                           iZzy6 = zzafm.zzy(i7 << 3);
/* 209 */                           iZzz2 = zzafm.zzz(jZzm2);
/* 134 */                           iI001l0I00 += iZzz2 + iZzy6;
                                    break;
                                } else {
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 182 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 186 */                           iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 4, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
/* 168 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 172 */                           iI001l0I00 = OooioIOo1.I001l0I00(i7 << 3, 8, iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
/* 141 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 145 */                           int iZzm3 = zzm(obj2, j);
/* 158 */                           iI001l0I00 = OooioIOo1.I001l0I00((iZzm3 >> 31) ^ (iZzm3 + iZzm3), zzafm.zzy(i7 << 3), iI001l0I00);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
/* 112 */                       if (zzahqVar.zzM(obj2, i7, i3)) {
/* 116 */                           long jZzq3 = zzq(obj2, j);
/* 124 */                           iZzy6 = zzafm.zzy(i7 << 3);
/* 129 */                           iZzz2 = zzafm.zzz((jZzq3 >> 63) ^ (jZzq3 + jZzq3));
/* 134 */                           iI001l0I00 += iZzz2 + iZzy6;
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
/* 89 */                        if (zzahqVar.zzM(obj2, i7, i3)) {
/* 101 */                           iZzi = zzaic.zza(i7, (zzahn) unsafe.getObject(obj2, j), zzahqVar.zzs(i3));
/* 105 */                           iI001l0I00 += iZzi;
                                    break;
                                } else {
                                    break;
                                }
                        }
/* 1793 */              i3 += 3;
/* 1795 */              obj2 = obj;
/* 1797 */              i2 = 1048575;
                    }
                }

                @Override
                public final int zzb(Object obj) {
                    int i;
                    long jDoubleToLongBits;
                    int i2;
                    int iFloatToIntBits;
                    int iZzc;
                    int i3;
/* 1 */             int i4 = 0;
/* 2 */             int i5 = 0;
                    while (true) {
/* 3 */                 int[] iArr = this.zzc;
/* 6 */                 if (i4 >= iArr.length) {
/* 555 */                   int iHashCode = ((zzagg) obj).zzc.hashCode() + (i5 * 53);
                            return this.zzh ? (iHashCode * 53) + ((zzagd) obj).zzb.zza.hashCode() : iHashCode;
                        }
/* 8 */                 int iZzp = zzp(i4);
/* 15 */                int i6 = 1048575 & iZzp;
/* 16 */                int iZzo = zzo(iZzp);
/* 20 */                int i7 = iArr[i4];
                        long j = i6;
/* 23 */                int iHashCode2 = 37;
                        switch (iZzo) {
                            case 0:
/* 526 */                       i = i5 * 53;
/* 532 */                       jDoubleToLongBits = Double.doubleToLongBits(zzait.zza(obj, j));
/* 536 */                       byte[] bArr = zzagp.zzb;
/* 69 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 1:
/* 514 */                       i2 = i5 * 53;
/* 520 */                       iFloatToIntBits = Float.floatToIntBits(zzait.zzb(obj, j));
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 2:
/* 504 */                       i = i5 * 53;
/* 506 */                       jDoubleToLongBits = zzait.zzd(obj, j);
/* 510 */                       byte[] bArr2 = zzagp.zzb;
/* 69 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 3:
/* 494 */                       i = i5 * 53;
/* 496 */                       jDoubleToLongBits = zzait.zzd(obj, j);
/* 500 */                       byte[] bArr3 = zzagp.zzb;
/* 69 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 4:
/* 486 */                       i = i5 * 53;
/* 488 */                       iZzc = zzait.zzc(obj, j);
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 5:
/* 476 */                       i = i5 * 53;
/* 478 */                       jDoubleToLongBits = zzait.zzd(obj, j);
/* 482 */                       byte[] bArr4 = zzagp.zzb;
/* 69 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 6:
/* 468 */                       i = i5 * 53;
/* 470 */                       iZzc = zzait.zzc(obj, j);
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 7:
/* 456 */                       i2 = i5 * 53;
/* 462 */                       iFloatToIntBits = zzagp.zza(zzait.zzw(obj, j));
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 8:
/* 442 */                       i2 = i5 * 53;
/* 450 */                       iFloatToIntBits = ((String) zzait.zzf(obj, j)).hashCode();
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 9:
/* 429 */                       i3 = i5 * 53;
/* 431 */                       Object objZzf = zzait.zzf(obj, j);
/* 435 */                       if (objZzf != null) {
/* 437 */                           iHashCode2 = objZzf.hashCode();
                                }
/* 362 */                       i5 = i3 + iHashCode2;
                                break;
                            case 10:
/* 417 */                       i2 = i5 * 53;
/* 423 */                       iFloatToIntBits = zzait.zzf(obj, j).hashCode();
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 11:
/* 409 */                       i = i5 * 53;
/* 411 */                       iZzc = zzait.zzc(obj, j);
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 12:
/* 401 */                       i = i5 * 53;
/* 403 */                       iZzc = zzait.zzc(obj, j);
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 13:
/* 393 */                       i = i5 * 53;
/* 395 */                       iZzc = zzait.zzc(obj, j);
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 14:
/* 383 */                       i = i5 * 53;
/* 385 */                       jDoubleToLongBits = zzait.zzd(obj, j);
/* 389 */                       byte[] bArr5 = zzagp.zzb;
/* 69 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 15:
/* 375 */                       i = i5 * 53;
/* 377 */                       iZzc = zzait.zzc(obj, j);
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 16:
/* 365 */                       i = i5 * 53;
/* 367 */                       jDoubleToLongBits = zzait.zzd(obj, j);
/* 371 */                       byte[] bArr6 = zzagp.zzb;
/* 69 */                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                        i5 = i + iZzc;
                                break;
                            case 17:
/* 350 */                       i3 = i5 * 53;
/* 352 */                       Object objZzf2 = zzait.zzf(obj, j);
/* 356 */                       if (objZzf2 != null) {
/* 358 */                           iHashCode2 = objZzf2.hashCode();
                                }
/* 362 */                       i5 = i3 + iHashCode2;
                                break;
                            case PoseLandmark.RIGHT_PINKY:
                            case PoseLandmark.LEFT_INDEX:
                            case PoseLandmark.RIGHT_INDEX:
                            case PoseLandmark.LEFT_THUMB:
                            case PoseLandmark.RIGHT_THUMB:
                            case PoseLandmark.LEFT_HIP:
                            case PoseLandmark.RIGHT_HIP:
                            case PoseLandmark.LEFT_KNEE:
                            case PoseLandmark.RIGHT_KNEE:
                            case 27:
                            case PoseLandmark.RIGHT_ANKLE:
                            case PoseLandmark.LEFT_HEEL:
                            case 30:
                            case PoseLandmark.LEFT_FOOT_INDEX:
                            case 32:
                            case 33:
                            case 34:
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case BuildConfig.VERSION_CODE:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
/* 338 */                       i2 = i5 * 53;
/* 344 */                       iFloatToIntBits = zzait.zzf(obj, j).hashCode();
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 50:
/* 326 */                       i2 = i5 * 53;
/* 332 */                       iFloatToIntBits = zzait.zzf(obj, j).hashCode();
/* 48 */                        i5 = iFloatToIntBits + i2;
                                break;
                            case 51:
/* 310 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 312 */                           i = i5 * 53;
/* 318 */                           jDoubleToLongBits = Double.doubleToLongBits(zzk(obj, j));
/* 322 */                           byte[] bArr7 = zzagp.zzb;
/* 69 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzc;
                                    break;
                                }
                            case 52:
/* 292 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 294 */                           i2 = i5 * 53;
/* 300 */                           iFloatToIntBits = Float.floatToIntBits(zzl(obj, j));
/* 48 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 53:
/* 276 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 278 */                           i = i5 * 53;
/* 280 */                           jDoubleToLongBits = zzq(obj, j);
/* 284 */                           byte[] bArr8 = zzagp.zzb;
/* 69 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzc;
                                    break;
                                }
                            case 54:
/* 260 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 262 */                           i = i5 * 53;
/* 264 */                           jDoubleToLongBits = zzq(obj, j);
/* 268 */                           byte[] bArr9 = zzagp.zzb;
/* 69 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzc;
                                    break;
                                }
                            case 55:
/* 246 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 248 */                           i = i5 * 53;
/* 250 */                           iZzc = zzm(obj, j);
/* 70 */                            i5 = i + iZzc;
                                    break;
                                }
                            case 56:
/* 230 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 232 */                           i = i5 * 53;
/* 234 */                           jDoubleToLongBits = zzq(obj, j);
/* 238 */                           byte[] bArr10 = zzagp.zzb;
/* 69 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzc;
                                    break;
                                }
                            case 57:
/* 216 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 218 */                           i = i5 * 53;
/* 220 */                           iZzc = zzm(obj, j);
/* 70 */                            i5 = i + iZzc;
                                    break;
                                }
                            case 58:
/* 198 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 200 */                           i2 = i5 * 53;
/* 206 */                           iFloatToIntBits = zzagp.zza(zzN(obj, j));
/* 48 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 59:
/* 178 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 180 */                           i2 = i5 * 53;
/* 188 */                           iFloatToIntBits = ((String) zzait.zzf(obj, j)).hashCode();
/* 48 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 60:
/* 161 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 163 */                           i2 = i5 * 53;
/* 169 */                           iFloatToIntBits = zzait.zzf(obj, j).hashCode();
/* 48 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 61:
/* 144 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 146 */                           i2 = i5 * 53;
/* 152 */                           iFloatToIntBits = zzait.zzf(obj, j).hashCode();
/* 48 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                }
                            case 62:
/* 131 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 133 */                           i = i5 * 53;
/* 135 */                           iZzc = zzm(obj, j);
/* 70 */                            i5 = i + iZzc;
                                    break;
                                }
                            case 63:
/* 118 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 120 */                           i = i5 * 53;
/* 122 */                           iZzc = zzm(obj, j);
/* 70 */                            i5 = i + iZzc;
                                    break;
                                }
                            case Barcode.FORMAT_EAN_8:
/* 105 */                       if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 107 */                           i = i5 * 53;
/* 109 */                           iZzc = zzm(obj, j);
/* 70 */                            i5 = i + iZzc;
                                    break;
                                }
                            case 65:
/* 90 */                        if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 92 */                            i = i5 * 53;
/* 94 */                            jDoubleToLongBits = zzq(obj, j);
/* 98 */                            byte[] bArr11 = zzagp.zzb;
/* 69 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzc;
                                    break;
                                }
                            case 66:
/* 77 */                        if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 79 */                            i = i5 * 53;
/* 81 */                            iZzc = zzm(obj, j);
/* 70 */                            i5 = i + iZzc;
                                    break;
                                }
                            case 67:
/* 56 */                        if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 58 */                            i = i5 * 53;
/* 60 */                            jDoubleToLongBits = zzq(obj, j);
/* 64 */                            byte[] bArr12 = zzagp.zzb;
/* 69 */                            iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
/* 70 */                            i5 = i + iZzc;
                                    break;
                                }
                            case 68:
/* 36 */                        if (!zzM(obj, i7, i4)) {
                                    break;
                                } else {
/* 38 */                            i2 = i5 * 53;
/* 44 */                            iFloatToIntBits = zzait.zzf(obj, j).hashCode();
/* 48 */                            i5 = iFloatToIntBits + i2;
                                    break;
                                }
                        }
/* 540 */               i4 += 3;
                    }
                }

                @Override
                public final Object zzc() {
/* 5 */             return ((zzagg) this.zzg).zzt();
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void zzd(Object obj) {
/* 5 */             if (zzL(obj)) {
/* 12 */                if (obj instanceof zzagg) {
/* 15 */                    zzagg zzaggVar = (zzagg) obj;
/* 20 */                    zzaggVar.zzE(Integer.MAX_VALUE);
/* 23 */                    zzaggVar.zza = 0;
/* 25 */                    zzaggVar.zzC();
                        }
/* 28 */                int[] iArr = this.zzc;
/* 31 */                for (int i = 0; i < iArr.length; i += 3) {
/* 33 */                    int iZzp = zzp(i);
/* 40 */                    int i2 = 1048575 & iZzp;
/* 41 */                    int iZzo = zzo(iZzp);
                            long j = i2;
/* 48 */                    if (iZzo != 9) {
/* 52 */                        if (iZzo != 60 && iZzo != 68) {
                                    switch (iZzo) {
                                        case PoseLandmark.RIGHT_PINKY:
                                        case PoseLandmark.LEFT_INDEX:
                                        case PoseLandmark.RIGHT_INDEX:
                                        case PoseLandmark.LEFT_THUMB:
                                        case PoseLandmark.RIGHT_THUMB:
                                        case PoseLandmark.LEFT_HIP:
                                        case PoseLandmark.RIGHT_HIP:
                                        case PoseLandmark.LEFT_KNEE:
                                        case PoseLandmark.RIGHT_KNEE:
                                        case 27:
                                        case PoseLandmark.RIGHT_ANKLE:
                                        case PoseLandmark.LEFT_HEEL:
                                        case 30:
                                        case PoseLandmark.LEFT_FOOT_INDEX:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case InputImage.IMAGE_FORMAT_YUV_420_888:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case BuildConfig.VERSION_CODE:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
/* 86 */                                    ((zzago) zzait.zzf(obj, j)).zzb();
                                            break;
                                        case 50:
/* 62 */                                    Unsafe unsafe = zzb;
/* 64 */                                    Object object = unsafe.getObject(obj, j);
/* 68 */                                    if (object != null) {
/* 73 */                                        ((zzahh) object).zzc();
/* 76 */                                        unsafe.putObject(obj, j, object);
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                } else if (zzM(obj, iArr[i], i)) {
/* 108 */                           zzs(i).zzd(zzb.getObject(obj, j));
                                }
                            } else if (zzI(obj, i)) {
/* 128 */                       zzs(i).zzd(zzb.getObject(obj, j));
                            }
                        }
/* 136 */               this.zzm.zzi(obj);
/* 141 */               if (this.zzh) {
/* 145 */                   this.zzn.zzb(obj);
                        }
                    }
                }

                @Override
                public final void zze(Object obj, Object obj2) {
/* 1 */             zzy(obj);
/* 4 */             obj2.getClass();
/* 7 */             int i = 0;
                    while (true) {
/* 8 */                 int[] iArr = this.zzc;
/* 11 */                if (i >= iArr.length) {
/* 441 */                   zzaic.zzr(this.zzm, obj, obj2);
/* 446 */                   if (this.zzh) {
/* 450 */                       zzaic.zzq(this.zzn, obj, obj2);
/* 453 */                       return;
                            }
/* 453 */                   return;
                        }
/* 13 */                int iZzp = zzp(i);
/* 20 */                int i2 = 1048575 & iZzp;
/* 21 */                int iZzo = zzo(iZzp);
/* 25 */                int i3 = iArr[i];
                        long j = i2;
                        switch (iZzo) {
                            case 0:
/* 423 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 429 */                           zzait.zzo(obj, j, zzait.zza(obj2, j));
/* 432 */                           zzC(obj, i);
                                    break;
                                }
                            case 1:
/* 406 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 412 */                           zzait.zzp(obj, j, zzait.zzb(obj2, j));
/* 415 */                           zzC(obj, i);
                                    break;
                                }
                            case 2:
/* 389 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 395 */                           zzait.zzr(obj, j, zzait.zzd(obj2, j));
/* 398 */                           zzC(obj, i);
                                    break;
                                }
                            case 3:
/* 372 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 378 */                           zzait.zzr(obj, j, zzait.zzd(obj2, j));
/* 381 */                           zzC(obj, i);
                                    break;
                                }
                            case 4:
/* 355 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 361 */                           zzait.zzq(obj, j, zzait.zzc(obj2, j));
/* 364 */                           zzC(obj, i);
                                    break;
                                }
                            case 5:
/* 338 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 344 */                           zzait.zzr(obj, j, zzait.zzd(obj2, j));
/* 347 */                           zzC(obj, i);
                                    break;
                                }
                            case 6:
/* 321 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 327 */                           zzait.zzq(obj, j, zzait.zzc(obj2, j));
/* 330 */                           zzC(obj, i);
                                    break;
                                }
                            case 7:
/* 303 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 309 */                           zzait.zzm(obj, j, zzait.zzw(obj2, j));
/* 312 */                           zzC(obj, i);
                                    break;
                                }
                            case 8:
/* 285 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 291 */                           zzait.zzs(obj, j, zzait.zzf(obj2, j));
/* 294 */                           zzC(obj, i);
                                    break;
                                }
                            case 9:
/* 276 */                       zzz(obj, obj2, i);
                                break;
                            case 10:
/* 262 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 268 */                           zzait.zzs(obj, j, zzait.zzf(obj2, j));
/* 271 */                           zzC(obj, i);
                                    break;
                                }
                            case 11:
/* 244 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 250 */                           zzait.zzq(obj, j, zzait.zzc(obj2, j));
/* 253 */                           zzC(obj, i);
                                    break;
                                }
                            case 12:
/* 226 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 232 */                           zzait.zzq(obj, j, zzait.zzc(obj2, j));
/* 235 */                           zzC(obj, i);
                                    break;
                                }
                            case 13:
/* 208 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 214 */                           zzait.zzq(obj, j, zzait.zzc(obj2, j));
/* 217 */                           zzC(obj, i);
                                    break;
                                }
                            case 14:
/* 190 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 196 */                           zzait.zzr(obj, j, zzait.zzd(obj2, j));
/* 199 */                           zzC(obj, i);
                                    break;
                                }
                            case 15:
/* 172 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 178 */                           zzait.zzq(obj, j, zzait.zzc(obj2, j));
/* 181 */                           zzC(obj, i);
                                    break;
                                }
                            case 16:
/* 154 */                       if (!zzI(obj2, i)) {
                                    break;
                                } else {
/* 160 */                           zzait.zzr(obj, j, zzait.zzd(obj2, j));
/* 163 */                           zzC(obj, i);
                                    break;
                                }
                            case 17:
/* 145 */                       zzz(obj, obj2, i);
                                break;
                            case PoseLandmark.RIGHT_PINKY:
                            case PoseLandmark.LEFT_INDEX:
                            case PoseLandmark.RIGHT_INDEX:
                            case PoseLandmark.LEFT_THUMB:
                            case PoseLandmark.RIGHT_THUMB:
                            case PoseLandmark.LEFT_HIP:
                            case PoseLandmark.RIGHT_HIP:
                            case PoseLandmark.LEFT_KNEE:
                            case PoseLandmark.RIGHT_KNEE:
                            case 27:
                            case PoseLandmark.RIGHT_ANKLE:
                            case PoseLandmark.LEFT_HEEL:
                            case 30:
                            case PoseLandmark.LEFT_FOOT_INDEX:
                            case 32:
                            case 33:
                            case 34:
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case BuildConfig.VERSION_CODE:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
/* 102 */                       zzago zzagoVarZzd = (zzago) zzait.zzf(obj, j);
/* 108 */                       zzago zzagoVar = (zzago) zzait.zzf(obj2, j);
/* 110 */                       int size = zzagoVarZzd.size();
/* 114 */                       int size2 = zzagoVar.size();
/* 118 */                       if (size > 0 && size2 > 0) {
/* 126 */                           if (!zzagoVarZzd.zzc()) {
/* 129 */                               zzagoVarZzd = zzagoVarZzd.zzd(size2 + size);
                                    }
/* 133 */                           zzagoVarZzd.addAll(zzagoVar);
                                }
/* 136 */                       if (size > 0) {
/* 139 */                           zzagoVar = zzagoVarZzd;
                                }
/* 140 */                       zzait.zzs(obj, j, zzagoVar);
                                break;
                            case 50:
/* 79 */                        int i4 = zzaic.zza;
/* 93 */                        zzait.zzs(obj, j, zzahi.zza(zzait.zzf(obj, j), zzait.zzf(obj2, j)));
                                break;
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
/* 65 */                        if (!zzM(obj2, i3, i)) {
                                    break;
                                } else {
/* 71 */                            zzait.zzs(obj, j, zzait.zzf(obj2, j));
/* 74 */                            zzD(obj, i3, i);
                                    break;
                                }
                            case 60:
/* 56 */                        zzA(obj, obj2, i);
                                break;
                            case 61:
                            case 62:
                            case 63:
                            case Barcode.FORMAT_EAN_8:
                            case 65:
                            case 66:
                            case 67:
/* 42 */                        if (!zzM(obj2, i3, i)) {
                                    break;
                                } else {
/* 48 */                            zzait.zzs(obj, j, zzait.zzf(obj2, j));
/* 51 */                            zzD(obj, i3, i);
                                    break;
                                }
                            case 68:
/* 33 */                        zzA(obj, obj2, i);
                                break;
                        }
/* 435 */               i += 3;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:90:0x01e8, code lost:
                
                    r2 = r3;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:236:0x07fd  */
                /* JADX WARN: Removed duplicated region for block: B:241:0x0809 A[LOOP:2: B:239:0x0805->B:241:0x0809, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:244:0x081d  */
                /* JADX WARN: Removed duplicated region for block: B:262:0x07d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:265:0x01ef A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:294:0x0049 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:366:0x07e4 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:383:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0199  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x019e A[Catch: all -> 0x01eb, TryCatch #9 {all -> 0x01eb, blocks: (B:28:0x006d, B:34:0x007d, B:35:0x0082, B:37:0x008a, B:38:0x008e, B:71:0x0191, B:79:0x01b6, B:76:0x019e, B:78:0x01a4, B:40:0x0094, B:41:0x009e, B:42:0x00a8, B:43:0x00b2, B:44:0x00bc, B:45:0x00c3, B:46:0x00c4, B:47:0x00ce, B:48:0x00d4, B:50:0x00dc, B:52:0x00f1, B:53:0x00fc, B:54:0x0101, B:55:0x010d, B:57:0x0115, B:59:0x012a, B:60:0x0135, B:61:0x013a, B:62:0x0145, B:63:0x014a, B:64:0x0153, B:65:0x015c, B:66:0x0165, B:67:0x016e, B:68:0x0177, B:69:0x0180, B:70:0x0189, B:80:0x01bb, B:81:0x01be, B:83:0x01c1, B:84:0x01c6, B:31:0x0073, B:94:0x01f1, B:99:0x0201), top: B:264:0x006d }] */
                /* JADX WARN: Type inference failed for: r9v0 */
                /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r9v2 */
                /* JADX WARN: Type inference failed for: r9v3 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void zzf(Object obj, zzahz zzahzVar, zzafr zzafrVar) throws Throwable {
                    Object obj2;
                    int i;
                    Object objZzt;
                    int i2;
                    Object objZzt2;
                    Object obj3;
                    Object objZzs;
                    int iOrdinal;
                    Object objZzf;
                    zzahq<T> zzahqVar;
                    zzafw zzafwVar;
                    Object obj4;
                    Object obj5;
/* 1 */             zzahq<T> zzahqVar2 = this;
/* 7 */             zzafrVar.getClass();
/* 10 */            zzy(obj);
/* 13 */            zzaim zzaimVar = zzahqVar2.zzm;
/* 15 */            zzafs zzafsVar = zzahqVar2.zzn;
/* 17 */            ?? r9 = 0;
/* 18 */            zzaim zzaimVar2 = zzaimVar;
/* 19 */            Object objZza = null;
/* 20 */            zzafw zzafwVarZza = null;
                    while (true) {
                        try {
/* 21 */                    int iZzc = zzahzVar.zzc();
/* 30 */                    if (iZzc < zzahqVar2.zze || iZzc > zzahqVar2.zzf) {
/* 71 */                        i2 = -1;
/* 72 */                        if (i2 >= 0) {
/* 496 */                           obj3 = obj;
/* 498 */                           int iZzp = zzahqVar2.zzp(i2);
                                    try {
                                        try {
                                        } catch (zzagq unused) {
/* 568 */                                   zzahqVar = zzahqVar2;
/* 569 */                                   obj2 = obj3;
                                        }
                                        switch (zzo(iZzp)) {
                                            case 0:
/* 1981 */                                      zzahqVar = zzahqVar2;
/* 1983 */                                      zzafwVar = zzafwVarZza;
/* 1992 */                                      zzait.zzo(obj3, iZzp & 1048575, zzahzVar.zza());
/* 1995 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 1:
/* 1962 */                                      zzahqVar = zzahqVar2;
/* 1964 */                                      zzafwVar = zzafwVarZza;
/* 1973 */                                      zzait.zzp(obj3, iZzp & 1048575, zzahzVar.zzb());
/* 1976 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 2:
/* 1943 */                                      zzahqVar = zzahqVar2;
/* 1945 */                                      zzafwVar = zzafwVarZza;
/* 1954 */                                      zzait.zzr(obj3, iZzp & 1048575, zzahzVar.zzl());
/* 1957 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 3:
/* 1924 */                                      zzahqVar = zzahqVar2;
/* 1926 */                                      zzafwVar = zzafwVarZza;
/* 1935 */                                      zzait.zzr(obj3, iZzp & 1048575, zzahzVar.zzo());
/* 1938 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 4:
/* 1905 */                                      zzahqVar = zzahqVar2;
/* 1907 */                                      zzafwVar = zzafwVarZza;
/* 1916 */                                      zzait.zzq(obj3, iZzp & 1048575, zzahzVar.zzg());
/* 1919 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 5:
/* 1886 */                                      zzahqVar = zzahqVar2;
/* 1888 */                                      zzafwVar = zzafwVarZza;
/* 1897 */                                      zzait.zzr(obj3, iZzp & 1048575, zzahzVar.zzk());
/* 1900 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 6:
/* 1867 */                                      zzahqVar = zzahqVar2;
/* 1869 */                                      zzafwVar = zzafwVarZza;
/* 1878 */                                      zzait.zzq(obj3, iZzp & 1048575, zzahzVar.zzf());
/* 1881 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 7:
/* 1848 */                                      zzahqVar = zzahqVar2;
/* 1850 */                                      zzafwVar = zzafwVarZza;
/* 1859 */                                      zzait.zzm(obj3, iZzp & 1048575, zzahzVar.zzQ());
/* 1862 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 8:
/* 1836 */                                      zzahqVar = zzahqVar2;
/* 1838 */                                      zzafwVar = zzafwVarZza;
/* 1840 */                                      zzahqVar.zzB(obj3, iZzp, zzahzVar);
/* 1843 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 9:
/* 1814 */                                      zzahqVar = zzahqVar2;
/* 1816 */                                      zzafwVar = zzafwVarZza;
/* 1822 */                                      zzahn zzahnVar = (zzahn) zzahqVar.zzv(obj3, i2);
/* 1828 */                                      zzahzVar.zzw(zzahnVar, zzahqVar.zzs(i2), zzafrVar);
/* 1831 */                                      zzahqVar.zzE(obj3, i2, zzahnVar);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 10:
/* 1795 */                                      zzahqVar = zzahqVar2;
/* 1797 */                                      zzafwVar = zzafwVarZza;
/* 1806 */                                      zzait.zzs(obj3, iZzp & 1048575, zzahzVar.zzp());
/* 1809 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 11:
/* 1776 */                                      zzahqVar = zzahqVar2;
/* 1778 */                                      zzafwVar = zzafwVarZza;
/* 1787 */                                      zzait.zzq(obj3, iZzp & 1048575, zzahzVar.zzj());
/* 1790 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 12:
/* 1737 */                                      zzahqVar = zzahqVar2;
/* 1740 */                                      zzafwVar = zzafwVarZza;
/* 1742 */                                      int iZze = zzahzVar.zze();
/* 1746 */                                      zzagk zzagkVarZzr = zzahqVar.zzr(i2);
/* 1750 */                                      if (zzagkVarZzr == null || zzagkVarZzr.zza(iZze)) {
/* 1768 */                                          zzait.zzq(obj3, iZzp & 1048575, iZze);
/* 1771 */                                          zzahqVar.zzC(obj3, i2);
                                                } else {
/* 1759 */                                          objZza = zzaic.zzp(obj3, iZzc, iZze, objZza, zzaimVar2);
                                                }
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                                break;
                                            case 13:
/* 1718 */                                      zzahqVar = zzahqVar2;
/* 1720 */                                      zzafwVar = zzafwVarZza;
/* 1729 */                                      zzait.zzq(obj3, iZzp & 1048575, zzahzVar.zzh());
/* 1732 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 14:
/* 1699 */                                      zzahqVar = zzahqVar2;
/* 1701 */                                      zzafwVar = zzafwVarZza;
/* 1710 */                                      zzait.zzr(obj3, iZzp & 1048575, zzahzVar.zzm());
/* 1713 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 15:
/* 1680 */                                      zzahqVar = zzahqVar2;
/* 1682 */                                      zzafwVar = zzafwVarZza;
/* 1691 */                                      zzait.zzq(obj3, iZzp & 1048575, zzahzVar.zzi());
/* 1694 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 16:
/* 1661 */                                      zzahqVar = zzahqVar2;
/* 1663 */                                      zzafwVar = zzafwVarZza;
/* 1672 */                                      zzait.zzr(obj3, iZzp & 1048575, zzahzVar.zzn());
/* 1675 */                                      zzahqVar.zzC(obj3, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 17:
/* 1639 */                                      zzahqVar = zzahqVar2;
/* 1641 */                                      zzafwVar = zzafwVarZza;
/* 1647 */                                      zzahn zzahnVar2 = (zzahn) zzahqVar.zzv(obj3, i2);
/* 1653 */                                      zzahzVar.zzv(zzahnVar2, zzahqVar.zzs(i2), zzafrVar);
/* 1656 */                                      zzahqVar.zzE(obj3, i2, zzahnVar2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case PoseLandmark.RIGHT_PINKY:
/* 1623 */                                      zzahqVar = zzahqVar2;
/* 1625 */                                      zzafwVar = zzafwVarZza;
/* 1634 */                                      zzahzVar.zzz(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case PoseLandmark.LEFT_INDEX:
/* 1607 */                                      zzahqVar = zzahqVar2;
/* 1609 */                                      zzafwVar = zzafwVarZza;
/* 1618 */                                      zzahzVar.zzD(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case PoseLandmark.RIGHT_INDEX:
/* 1591 */                                      zzahqVar = zzahqVar2;
/* 1593 */                                      zzafwVar = zzafwVarZza;
/* 1602 */                                      zzahzVar.zzG(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case PoseLandmark.LEFT_THUMB:
/* 1575 */                                      zzahqVar = zzahqVar2;
/* 1577 */                                      zzafwVar = zzafwVarZza;
/* 1586 */                                      zzahzVar.zzP(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case PoseLandmark.RIGHT_THUMB:
/* 1559 */                                      zzahqVar = zzahqVar2;
/* 1561 */                                      zzafwVar = zzafwVarZza;
/* 1570 */                                      zzahzVar.zzF(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case PoseLandmark.LEFT_HIP:
/* 1543 */                                      zzahqVar = zzahqVar2;
/* 1545 */                                      zzafwVar = zzafwVarZza;
/* 1554 */                                      zzahzVar.zzC(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case PoseLandmark.RIGHT_HIP:
/* 1527 */                                      zzahqVar = zzahqVar2;
/* 1529 */                                      zzafwVar = zzafwVarZza;
/* 1538 */                                      zzahzVar.zzB(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case PoseLandmark.LEFT_KNEE:
/* 1511 */                                      zzahqVar = zzahqVar2;
/* 1513 */                                      zzafwVar = zzafwVarZza;
/* 1522 */                                      zzahzVar.zzx(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case PoseLandmark.RIGHT_KNEE:
/* 1471 */                                      zzahqVar = zzahqVar2;
/* 1473 */                                      zzafwVar = zzafwVarZza;
/* 1479 */                                      if (zzH(iZzp)) {
/* 1491 */                                          ((zzafi) zzahzVar).zzN(zzagz.zza(obj3, iZzp & 1048575), true);
                                                } else {
/* 1506 */                                          ((zzafi) zzahzVar).zzN(zzagz.zza(obj3, iZzp & 1048575), false);
                                                }
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 27:
/* 1451 */                                      zzahqVar = zzahqVar2;
/* 1453 */                                      zzafwVar = zzafwVarZza;
/* 1466 */                                      zzahzVar.zzI(zzagz.zza(obj3, iZzp & 1048575), zzahqVar.zzs(i2), zzafrVar);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case PoseLandmark.RIGHT_ANKLE:
/* 1435 */                                      zzahqVar = zzahqVar2;
/* 1437 */                                      zzafwVar = zzafwVarZza;
/* 1446 */                                      zzahzVar.zzy(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case PoseLandmark.LEFT_HEEL:
/* 1419 */                                      zzahqVar = zzahqVar2;
/* 1421 */                                      zzafwVar = zzafwVarZza;
/* 1430 */                                      zzahzVar.zzO(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 30:
/* 1388 */                                      zzahqVar = zzahqVar2;
/* 1391 */                                      zzafwVar = zzafwVarZza;
/* 1396 */                                      List listZza = zzagz.zza(obj3, iZzp & 1048575);
/* 1400 */                                      zzahzVar.zzA(listZza);
/* 1412 */                                      objZza = zzaic.zzo(obj3, iZzc, listZza, zzahqVar.zzr(i2), objZza, zzaimVar2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 1372 */                                      zzahqVar = zzahqVar2;
/* 1374 */                                      zzafwVar = zzafwVarZza;
/* 1383 */                                      zzahzVar.zzJ(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 32:
/* 1356 */                                      zzahqVar = zzahqVar2;
/* 1358 */                                      zzafwVar = zzafwVarZza;
/* 1367 */                                      zzahzVar.zzK(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 33:
/* 1340 */                                      zzahqVar = zzahqVar2;
/* 1342 */                                      zzafwVar = zzafwVarZza;
/* 1351 */                                      zzahzVar.zzL(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 34:
/* 1324 */                                      zzahqVar = zzahqVar2;
/* 1326 */                                      zzafwVar = zzafwVarZza;
/* 1335 */                                      zzahzVar.zzM(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 1308 */                                      zzahqVar = zzahqVar2;
/* 1310 */                                      zzafwVar = zzafwVarZza;
/* 1319 */                                      zzahzVar.zzz(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 36:
/* 1292 */                                      zzahqVar = zzahqVar2;
/* 1294 */                                      zzafwVar = zzafwVarZza;
/* 1303 */                                      zzahzVar.zzD(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 37:
/* 1276 */                                      zzahqVar = zzahqVar2;
/* 1278 */                                      zzafwVar = zzafwVarZza;
/* 1287 */                                      zzahzVar.zzG(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 38:
/* 1260 */                                      zzahqVar = zzahqVar2;
/* 1262 */                                      zzafwVar = zzafwVarZza;
/* 1271 */                                      zzahzVar.zzP(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 39:
/* 1244 */                                      zzahqVar = zzahqVar2;
/* 1246 */                                      zzafwVar = zzafwVarZza;
/* 1255 */                                      zzahzVar.zzF(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 40:
/* 1228 */                                      zzahqVar = zzahqVar2;
/* 1230 */                                      zzafwVar = zzafwVarZza;
/* 1239 */                                      zzahzVar.zzC(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 41:
/* 1212 */                                      zzahqVar = zzahqVar2;
/* 1214 */                                      zzafwVar = zzafwVarZza;
/* 1223 */                                      zzahzVar.zzB(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 42:
/* 1196 */                                      zzahqVar = zzahqVar2;
/* 1198 */                                      zzafwVar = zzafwVarZza;
/* 1207 */                                      zzahzVar.zzx(zzagz.zza(obj3, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 43:
/* 1180 */                                      zzahqVar = zzahqVar2;
/* 1181 */                                      obj2 = obj3;
/* 1182 */                                      zzafwVar = zzafwVarZza;
                                                try {
/* 1191 */                                          zzahzVar.zzO(zzagz.zza(obj2, iZzp & 1048575));
                                                } catch (zzagq unused2) {
/* 2004 */                                          if (objZza == null) {
                                                    }
/* 2019 */                                          if (!zzaimVar2.zzk(objZza, zzahzVar, 0)) {
                                                    }
/* 722 */                                           zzahqVar2 = zzahqVar;
/* 723 */                                           zzafwVarZza = zzafwVar;
/* 725 */                                           r9 = 0;
                                                }
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                                break;
                                            case 44:
/* 1155 */                                      zzahqVar = zzahqVar2;
/* 1157 */                                      zzafwVar = zzafwVarZza;
/* 1162 */                                      List listZza2 = zzagz.zza(obj3, iZzp & 1048575);
/* 1166 */                                      zzahzVar.zzA(listZza2);
/* 1173 */                                      objZza = zzaic.zzo(obj3, iZzc, listZza2, zzahqVar.zzr(i2), objZza, zzaimVar2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case BuildConfig.VERSION_CODE:
/* 1139 */                                      zzahqVar = zzahqVar2;
/* 1140 */                                      obj5 = obj3;
/* 1141 */                                      zzafwVar = zzafwVarZza;
/* 1150 */                                      zzahzVar.zzJ(zzagz.zza(obj5, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 46:
/* 1123 */                                      zzahqVar = zzahqVar2;
/* 1124 */                                      obj5 = obj3;
/* 1125 */                                      zzafwVar = zzafwVarZza;
/* 1134 */                                      zzahzVar.zzK(zzagz.zza(obj5, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 47:
/* 1107 */                                      zzahqVar = zzahqVar2;
/* 1108 */                                      obj5 = obj3;
/* 1109 */                                      zzafwVar = zzafwVarZza;
/* 1118 */                                      zzahzVar.zzL(zzagz.zza(obj5, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 48:
/* 1091 */                                      zzahqVar = zzahqVar2;
/* 1092 */                                      obj5 = obj3;
/* 1093 */                                      zzafwVar = zzafwVarZza;
/* 1102 */                                      zzahzVar.zzM(zzagz.zza(obj5, iZzp & 1048575));
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 49:
/* 1071 */                                      zzahqVar = zzahqVar2;
/* 1072 */                                      obj5 = obj3;
/* 1073 */                                      zzafwVar = zzafwVarZza;
/* 1086 */                                      zzahzVar.zzE(zzagz.zza(obj5, iZzp & 1048575), zzahqVar.zzs(i2), zzafrVar);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 50:
/* 1002 */                                      zzahqVar = zzahqVar2;
/* 1003 */                                      obj5 = obj3;
/* 1004 */                                      zzafwVar = zzafwVarZza;
/* 1006 */                                      Object objZzu = zzahqVar.zzu(i2);
/* 1014 */                                      long jZzp = zzahqVar.zzp(i2) & 1048575;
/* 1016 */                                      Object objZzf2 = zzait.zzf(obj5, jZzp);
/* 1020 */                                      if (objZzf2 == null) {
/* 1026 */                                          objZzf2 = zzahh.zza().zzb();
/* 1030 */                                          zzait.zzs(obj5, jZzp, objZzf2);
                                                } else if (!((zzahh) objZzf2).zze()) {
/* 1047 */                                          Object objZzb = zzahh.zza().zzb();
/* 1051 */                                          zzahi.zza(objZzb, objZzf2);
/* 1054 */                                          zzait.zzs(obj5, jZzp, objZzb);
/* 1057 */                                          objZzf2 = objZzb;
                                                }
/* 1066 */                                      zzahzVar.zzH((zzahh) objZzf2, ((zzahg) objZzu).zzc(), zzafrVar);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 51:
/* 979 */                                       zzahqVar = zzahqVar2;
/* 980 */                                       obj5 = obj3;
/* 981 */                                       zzafwVar = zzafwVarZza;
/* 994 */                                       zzait.zzs(obj5, iZzp & 1048575, Double.valueOf(zzahzVar.zza()));
/* 997 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 52:
/* 956 */                                       zzahqVar = zzahqVar2;
/* 957 */                                       obj5 = obj3;
/* 958 */                                       zzafwVar = zzafwVarZza;
/* 971 */                                       zzait.zzs(obj5, iZzp & 1048575, Float.valueOf(zzahzVar.zzb()));
/* 974 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 53:
/* 933 */                                       zzahqVar = zzahqVar2;
/* 934 */                                       obj5 = obj3;
/* 935 */                                       zzafwVar = zzafwVarZza;
/* 948 */                                       zzait.zzs(obj5, iZzp & 1048575, Long.valueOf(zzahzVar.zzl()));
/* 951 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 54:
/* 910 */                                       zzahqVar = zzahqVar2;
/* 911 */                                       obj5 = obj3;
/* 912 */                                       zzafwVar = zzafwVarZza;
/* 925 */                                       zzait.zzs(obj5, iZzp & 1048575, Long.valueOf(zzahzVar.zzo()));
/* 928 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 55:
/* 887 */                                       zzahqVar = zzahqVar2;
/* 888 */                                       obj5 = obj3;
/* 889 */                                       zzafwVar = zzafwVarZza;
/* 902 */                                       zzait.zzs(obj5, iZzp & 1048575, Integer.valueOf(zzahzVar.zzg()));
/* 905 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 56:
/* 864 */                                       zzahqVar = zzahqVar2;
/* 865 */                                       obj5 = obj3;
/* 866 */                                       zzafwVar = zzafwVarZza;
/* 879 */                                       zzait.zzs(obj5, iZzp & 1048575, Long.valueOf(zzahzVar.zzk()));
/* 882 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 57:
/* 841 */                                       zzahqVar = zzahqVar2;
/* 842 */                                       obj5 = obj3;
/* 843 */                                       zzafwVar = zzafwVarZza;
/* 856 */                                       zzait.zzs(obj5, iZzp & 1048575, Integer.valueOf(zzahzVar.zzf()));
/* 859 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 58:
/* 818 */                                       zzahqVar = zzahqVar2;
/* 819 */                                       obj5 = obj3;
/* 820 */                                       zzafwVar = zzafwVarZza;
/* 833 */                                       zzait.zzs(obj5, iZzp & 1048575, Boolean.valueOf(zzahzVar.zzQ()));
/* 836 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 59:
/* 806 */                                       zzahqVar = zzahqVar2;
/* 807 */                                       obj5 = obj3;
/* 808 */                                       zzafwVar = zzafwVarZza;
/* 810 */                                       zzahqVar.zzB(obj5, iZzp, zzahzVar);
/* 813 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 60:
/* 784 */                                       zzahqVar = zzahqVar2;
/* 785 */                                       obj5 = obj3;
/* 786 */                                       zzafwVar = zzafwVarZza;
/* 792 */                                       zzahn zzahnVar3 = (zzahn) zzahqVar.zzw(obj5, iZzc, i2);
/* 798 */                                       zzahzVar.zzw(zzahnVar3, zzahqVar.zzs(i2), zzafrVar);
/* 801 */                                       zzahqVar.zzF(obj5, iZzc, i2, zzahnVar3);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 61:
/* 765 */                                       zzahqVar = zzahqVar2;
/* 766 */                                       obj5 = obj3;
/* 767 */                                       zzafwVar = zzafwVarZza;
/* 776 */                                       zzait.zzs(obj5, iZzp & 1048575, zzahzVar.zzp());
/* 779 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 62:
/* 742 */                                       zzahqVar = zzahqVar2;
/* 743 */                                       obj5 = obj3;
/* 744 */                                       zzafwVar = zzafwVarZza;
/* 757 */                                       zzait.zzs(obj5, iZzp & 1048575, Integer.valueOf(zzahzVar.zzj()));
/* 760 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 63:
/* 697 */                                       zzahqVar = zzahqVar2;
/* 698 */                                       obj5 = obj3;
/* 699 */                                       zzafwVar = zzafwVarZza;
/* 701 */                                       int iZze2 = zzahzVar.zze();
/* 705 */                                       zzagk zzagkVarZzr2 = zzahqVar.zzr(i2);
/* 709 */                                       if (zzagkVarZzr2 != null && !zzagkVarZzr2.zza(iZze2)) {
/* 718 */                                           objZza = zzaic.zzp(obj5, iZzc, iZze2, objZza, zzaimVar2);
/* 722 */                                           zzahqVar2 = zzahqVar;
/* 723 */                                           zzafwVarZza = zzafwVar;
/* 725 */                                           r9 = 0;
                                                }
/* 735 */                                       zzait.zzs(obj5, iZzp & 1048575, Integer.valueOf(iZze2));
/* 738 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                                break;
                                            case Barcode.FORMAT_EAN_8:
/* 675 */                                       zzahqVar = zzahqVar2;
/* 676 */                                       obj5 = obj3;
/* 677 */                                       zzafwVar = zzafwVarZza;
/* 690 */                                       zzait.zzs(obj5, iZzp & 1048575, Integer.valueOf(zzahzVar.zzh()));
/* 693 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 65:
/* 653 */                                       zzahqVar = zzahqVar2;
/* 654 */                                       obj5 = obj3;
/* 655 */                                       zzafwVar = zzafwVarZza;
/* 668 */                                       zzait.zzs(obj5, iZzp & 1048575, Long.valueOf(zzahzVar.zzm()));
/* 671 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 66:
/* 631 */                                       zzahqVar = zzahqVar2;
/* 632 */                                       obj5 = obj3;
/* 633 */                                       zzafwVar = zzafwVarZza;
/* 646 */                                       zzait.zzs(obj5, iZzp & 1048575, Integer.valueOf(zzahzVar.zzi()));
/* 649 */                                       zzahqVar.zzD(obj5, iZzc, i2);
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                            case 67:
/* 601 */                                       zzahqVar = zzahqVar2;
/* 602 */                                       obj5 = obj3;
                                                try {
/* 613 */                                           zzafwVar = zzafwVarZza;
                                                    try {
/* 616 */                                               zzait.zzs(obj5, iZzp & 1048575, Long.valueOf(zzahzVar.zzn()));
/* 619 */                                               zzahqVar.zzD(obj5, iZzc, i2);
                                                    } catch (zzagq unused3) {
/* 625 */                                               obj2 = obj5;
/* 2004 */                                              if (objZza == null) {
                                                            try {
/* 2006 */                                                      objZza = zzaimVar2.zza(obj2);
                                                            } catch (Throwable th) {
/* 2012 */                                                      th = th;
/* 565 */                                                       zzahqVar2 = zzahqVar;
/* 2050 */                                                      i = zzahqVar2.zzk;
/* 2053 */                                                      objZzt = objZza;
/* 2056 */                                                      while (i < zzahqVar2.zzl) {
                                                                }
/* 2075 */                                                      zzaim zzaimVar3 = zzaimVar2;
/* 2076 */                                                      if (objZzt != null) {
                                                                }
/* 2081 */                                                      throw th;
                                                            }
                                                        }
/* 2019 */                                              if (!zzaimVar2.zzk(objZza, zzahzVar, 0)) {
/* 2023 */                                                  objZzt2 = objZza;
/* 2026 */                                                  for (int i3 = zzahqVar.zzk; i3 < zzahqVar.zzl; i3++) {
/* 2032 */                                                      zzaim zzaimVar4 = zzaimVar2;
/* 2036 */                                                      objZzt2 = zzahqVar.zzt(obj2, zzahqVar.zzj[i3], objZzt2, zzaimVar4, obj);
/* 2040 */                                                      zzaimVar2 = zzaimVar4;
                                                            }
/* 2044 */                                                  if (objZzt2 == null) {
                                                            }
                                                        }
/* 722 */                                               zzahqVar2 = zzahqVar;
/* 723 */                                               zzafwVarZza = zzafwVar;
/* 725 */                                               r9 = 0;
                                                    }
                                                } catch (zzagq unused4) {
/* 628 */                                           zzafwVar = zzafwVarZza;
                                                }
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                                break;
                                            case 68:
/* 574 */                                       zzahqVar = zzahqVar2;
/* 575 */                                       obj4 = obj3;
                                                try {
                                                    try {
/* 580 */                                               zzahn zzahnVar4 = (zzahn) zzahqVar.zzw(obj4, iZzc, i2);
/* 586 */                                               zzahzVar.zzv(zzahnVar4, zzahqVar.zzs(i2), zzafrVar);
/* 589 */                                               zzahqVar.zzF(obj4, iZzc, i2, zzahnVar4);
/* 593 */                                               zzafwVar = zzafwVarZza;
                                                    } catch (Throwable th2) {
/* 597 */                                               th = th2;
/* 564 */                                               obj2 = obj4;
/* 565 */                                               zzahqVar2 = zzahqVar;
/* 2050 */                                              i = zzahqVar2.zzk;
/* 2053 */                                              objZzt = objZza;
/* 2056 */                                              while (i < zzahqVar2.zzl) {
                                                        }
/* 2075 */                                              zzaim zzaimVar32 = zzaimVar2;
/* 2076 */                                              if (objZzt != null) {
                                                        }
/* 2081 */                                              throw th;
                                                    }
                                                } catch (zzagq unused5) {
/* 599 */                                           obj2 = obj4;
/* 570 */                                           zzafwVar = zzafwVarZza;
/* 2004 */                                          if (objZza == null) {
                                                    }
/* 2019 */                                          if (!zzaimVar2.zzk(objZza, zzahzVar, 0)) {
                                                    }
/* 722 */                                           zzahqVar2 = zzahqVar;
/* 723 */                                           zzafwVarZza = zzafwVar;
/* 725 */                                           r9 = 0;
                                                }
/* 722 */                                       zzahqVar2 = zzahqVar;
/* 723 */                                       zzafwVarZza = zzafwVar;
/* 725 */                                       r9 = 0;
                                                break;
                                            default:
/* 512 */                                       if (objZza == null) {
/* 514 */                                           objZza = zzaimVar2.zza(obj3);
                                                }
                                                try {
/* 523 */                                           if (!zzaimVar2.zzk(objZza, zzahzVar, 0)) {
/* 525 */                                               int i4 = zzahqVar2.zzk;
/* 527 */                                               objZzt2 = objZza;
/* 530 */                                               while (i4 < zzahqVar2.zzl) {
/* 536 */                                                   zzaim zzaimVar5 = zzaimVar2;
/* 539 */                                                   Object obj6 = obj3;
/* 544 */                                                   objZzt2 = zzahqVar2.zzt(obj6, zzahqVar2.zzj[i4], objZzt2, zzaimVar5, obj);
/* 550 */                                                   zzaimVar2 = zzaimVar5;
/* 551 */                                                   i4++;
/* 553 */                                                   obj3 = obj6;
/* 554 */                                                   zzahqVar2 = zzahqVar2;
                                                        }
                                                        break;
                                                    } else {
/* 558 */                                               zzahqVar2 = zzahqVar2;
                                                    }
                                                } catch (Throwable th3) {
/* 561 */                                           th = th3;
/* 562 */                                           zzahqVar = zzahqVar2;
/* 563 */                                           obj4 = obj3;
/* 564 */                                           obj2 = obj4;
/* 565 */                                           zzahqVar2 = zzahqVar;
/* 2050 */                                          i = zzahqVar2.zzk;
/* 2053 */                                          objZzt = objZza;
/* 2056 */                                          while (i < zzahqVar2.zzl) {
                                                    }
/* 2075 */                                          zzaim zzaimVar322 = zzaimVar2;
/* 2076 */                                          if (objZzt != null) {
                                                    }
/* 2081 */                                          throw th;
                                                }
                                                break;
                                        }
                                    } catch (Throwable th4) {
/* 2000 */                              th = th4;
/* 493 */                               obj2 = obj3;
/* 2050 */                              i = zzahqVar2.zzk;
/* 2053 */                              objZzt = objZza;
/* 2056 */                              while (i < zzahqVar2.zzl) {
                                        }
/* 2075 */                              zzaim zzaimVar3222 = zzaimVar2;
/* 2076 */                              if (objZzt != null) {
                                        }
/* 2081 */                              throw th;
                                    }
                                } else if (iZzc == Integer.MAX_VALUE) {
/* 81 */                            objZzt2 = objZza;
/* 84 */                            for (int i5 = zzahqVar2.zzk; i5 < zzahqVar2.zzl; i5++) {
/* 90 */                                zzaim zzaimVar6 = zzaimVar2;
/* 95 */                                objZzt2 = zzahqVar2.zzt(obj, zzahqVar2.zzj[i5], objZzt2, zzaimVar6, obj);
/* 100 */                               zzaimVar2 = zzaimVar6;
                                    }
/* 104 */                           obj2 = obj;
                                } else {
/* 108 */                           obj3 = obj;
                                    try {
/* 118 */                               zzagf zzagfVarZzb = !zzahqVar2.zzh ? r9 : zzafrVar.zzb(zzahqVar2.zzg, iZzc);
/* 122 */                               if (zzagfVarZzb != null) {
/* 124 */                                   if (zzafwVarZza == null) {
/* 126 */                                       zzafwVarZza = zzafsVar.zza(obj3);
                                            }
/* 131 */                                   zzage zzageVar = zzagfVarZzb.zzb;
/* 133 */                                   zzaiz zzaizVar = zzaiz.zzn;
/* 135 */                                   zzaiz zzaizVar2 = zzageVar.zzb;
/* 137 */                                   if (zzaizVar2 == zzaizVar) {
/* 444 */                                       zzahzVar.zzg();
/* 447 */                                       throw r9;
                                            }
                                            switch (zzaizVar2.ordinal()) {
                                                case 0:
/* 398 */                                           objZzs = Double.valueOf(zzahzVar.zza());
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if ((iOrdinal != 9 || iOrdinal == 10) && (objZzf = zzafwVarZza.zzf(zzageVar)) != null) {
/* 421 */                                               byte[] bArr = zzagp.zzb;
/* 435 */                                               objZzs = ((zzahn) objZzf).zzI().zzh((zzahn) objZzs).zzo();
                                                    }
/* 439 */                                           zzafwVarZza.zzj(zzageVar, objZzs);
                                                    break;
                                                case 1:
/* 389 */                                           objZzs = Float.valueOf(zzahzVar.zzb());
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
/* 421 */                                               byte[] bArr2 = zzagp.zzb;
/* 435 */                                               objZzs = ((zzahn) objZzf).zzI().zzh((zzahn) objZzs).zzo();
/* 439 */                                               zzafwVarZza.zzj(zzageVar, objZzs);
                                                        break;
                                                    } else {
/* 421 */                                               byte[] bArr22 = zzagp.zzb;
/* 435 */                                               objZzs = ((zzahn) objZzf).zzI().zzh((zzahn) objZzs).zzo();
/* 439 */                                               zzafwVarZza.zzj(zzageVar, objZzs);
                                                    }
                                                case 2:
/* 380 */                                           objZzs = Long.valueOf(zzahzVar.zzl());
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                                case 3:
/* 371 */                                           objZzs = Long.valueOf(zzahzVar.zzo());
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                                case 4:
/* 362 */                                           objZzs = Integer.valueOf(zzahzVar.zzg());
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                                case 5:
/* 353 */                                           objZzs = Long.valueOf(zzahzVar.zzk());
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                                case 6:
/* 344 */                                           objZzs = Integer.valueOf(zzahzVar.zzf());
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                                case 7:
/* 335 */                                           objZzs = Boolean.valueOf(zzahzVar.zzQ());
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                                case 8:
/* 326 */                                           objZzs = zzahzVar.zzt();
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                                case 9:
/* 270 */                                           Object objZzf3 = zzafwVarZza.zzf(zzageVar);
/* 276 */                                           if (objZzf3 instanceof zzagg) {
/* 286 */                                               zzaia zzaiaVarZzb = zzahw.zza().zzb(objZzf3.getClass());
/* 297 */                                               if (!((zzagg) objZzf3).zzG()) {
/* 299 */                                                   Object objZzc = zzaiaVarZzb.zzc();
/* 303 */                                                   zzaiaVarZzb.zze(objZzc, objZzf3);
/* 306 */                                                   zzafwVarZza.zzj(zzageVar, objZzc);
/* 309 */                                                   objZzf3 = objZzc;
                                                        }
/* 310 */                                               zzahzVar.zzv(objZzf3, zzaiaVarZzb, zzafrVar);
                                                        break;
                                                    } else {
/* 321 */                                               objZzs = zzahzVar.zzr(zzagfVarZzb.zza.getClass(), zzafrVar);
/* 402 */                                               iOrdinal = zzaizVar2.ordinal();
/* 408 */                                               if (iOrdinal != 9) {
                                                        }
                                                    }
                                                    break;
                                                case 10:
/* 213 */                                           Object objZzf4 = zzafwVarZza.zzf(zzageVar);
/* 219 */                                           if (objZzf4 instanceof zzagg) {
/* 229 */                                               zzaia zzaiaVarZzb2 = zzahw.zza().zzb(objZzf4.getClass());
/* 240 */                                               if (!((zzagg) objZzf4).zzG()) {
/* 242 */                                                   Object objZzc2 = zzaiaVarZzb2.zzc();
/* 246 */                                                   zzaiaVarZzb2.zze(objZzc2, objZzf4);
/* 249 */                                                   zzafwVarZza.zzj(zzageVar, objZzc2);
/* 252 */                                                   objZzf4 = objZzc2;
                                                        }
/* 253 */                                               zzahzVar.zzw(objZzf4, zzaiaVarZzb2, zzafrVar);
                                                        break;
                                                    } else {
/* 264 */                                               objZzs = zzahzVar.zzs(zzagfVarZzb.zza.getClass(), zzafrVar);
/* 402 */                                               iOrdinal = zzaizVar2.ordinal();
/* 408 */                                               if (iOrdinal != 9) {
                                                        }
                                                    }
                                                    break;
                                                case 11:
/* 207 */                                           objZzs = zzahzVar.zzp();
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                                case 12:
/* 201 */                                           objZzs = Integer.valueOf(zzahzVar.zzj());
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                                case 13:
/* 196 */                                           throw new IllegalStateException("Shouldn't reach here.");
                                                case 14:
/* 183 */                                           objZzs = Integer.valueOf(zzahzVar.zzh());
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                                case 15:
/* 173 */                                           objZzs = Long.valueOf(zzahzVar.zzm());
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                                case 16:
/* 163 */                                           objZzs = Integer.valueOf(zzahzVar.zzi());
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                                case 17:
/* 153 */                                           objZzs = Long.valueOf(zzahzVar.zzn());
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                                default:
/* 146 */                                           objZzs = r9;
/* 402 */                                           iOrdinal = zzaizVar2.ordinal();
/* 408 */                                           if (iOrdinal != 9) {
                                                    }
                                                    break;
                                            }
                                        } else {
/* 448 */                                   if (objZza == null) {
/* 450 */                                       objZza = zzaimVar2.zza(obj3);
                                            }
/* 459 */                                   if (!zzaimVar2.zzk(objZza, zzahzVar, 0)) {
/* 463 */                                       objZzt2 = objZza;
/* 466 */                                       for (int i6 = zzahqVar2.zzk; i6 < zzahqVar2.zzl; i6++) {
/* 472 */                                           zzaim zzaimVar7 = zzaimVar2;
/* 475 */                                           Object obj7 = obj3;
/* 480 */                                           objZzt2 = zzahqVar2.zzt(obj7, zzahqVar2.zzj[i6], objZzt2, zzaimVar7, obj);
/* 484 */                                           obj3 = obj7;
/* 485 */                                           zzaimVar2 = zzaimVar7;
                                                }
                                            }
                                        }
                                    } catch (Throwable th5) {
/* 492 */                               th = th5;
/* 493 */                               obj2 = obj3;
/* 2050 */                              i = zzahqVar2.zzk;
/* 2053 */                              objZzt = objZza;
/* 2056 */                              while (i < zzahqVar2.zzl) {
                                        }
/* 2075 */                              zzaim zzaimVar32222 = zzaimVar2;
/* 2076 */                              if (objZzt != null) {
                                        }
/* 2081 */                              throw th;
                                    }
                                }
                            } else {
/* 36 */                        int[] iArr = zzahqVar2.zzc;
                                int length = (iArr.length / 3) - 1;
/* 42 */                        int i7 = 0;
/* 43 */                        while (i7 <= length) {
/* 47 */                            int i8 = (length + i7) >>> 1;
/* 48 */                            int i9 = i8 * 3;
/* 50 */                            int i10 = iArr[i9];
/* 52 */                            if (iZzc == i10) {
/* 54 */                                i2 = i9;
/* 72 */                                if (i2 >= 0) {
                                        }
                                    } else if (iZzc < i10) {
                                        length = i8 - 1;
                                    } else {
/* 63 */                                i7 = i8 + 1;
                                    }
                                }
/* 71 */                        i2 = -1;
/* 72 */                        if (i2 >= 0) {
                                }
                            }
                        } catch (Throwable th6) {
/* 66 */                    th = th6;
/* 67 */                    obj2 = obj;
                        }
/* 2050 */              i = zzahqVar2.zzk;
/* 2053 */              objZzt = objZza;
/* 2056 */              while (i < zzahqVar2.zzl) {
/* 2062 */                  zzaim zzaimVar8 = zzaimVar2;
/* 2065 */                  objZzt = zzahqVar2.zzt(obj2, zzahqVar2.zzj[i], objZzt, zzaimVar8, obj);
/* 2069 */                  i++;
/* 2071 */                  zzahqVar2 = this;
/* 2073 */                  zzaimVar2 = zzaimVar8;
                        }
/* 2075 */              zzaim zzaimVar322222 = zzaimVar2;
/* 2076 */              if (objZzt != null) {
/* 2078 */                  zzaimVar322222.zzj(obj2, objZzt);
                        }
/* 2081 */              throw th;
                    }
/* 2044 */          if (objZzt2 == null) {
/* 2046 */              zzaimVar2.zzj(obj2, objZzt2);
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void zzg(Object obj, zzajb zzajbVar) {
                    Map.Entry entry;
                    Iterator it;
                    boolean z;
                    Map.Entry entry2;
                    int i;
                    int i2;
                    int i3;
                    int i4;
/* 1 */             zzahq<T> zzahqVar = this;
/* 9 */             if (zzahqVar.zzh) {
/* 14 */                zzafw zzafwVar = ((zzagd) obj).zzb;
/* 22 */                if (zzafwVar.zza.isEmpty()) {
/* 36 */                    entry = null;
/* 37 */                    it = null;
                        } else {
/* 24 */                    Iterator itZzg = zzafwVar.zzg();
/* 32 */                    entry = (Map.Entry) itZzg.next();
/* 34 */                    it = itZzg;
                        }
                    }
/* 38 */            int[] iArr = zzahqVar.zzc;
/* 40 */            Unsafe unsafe = zzb;
/* 42 */            int i5 = 1048575;
/* 45 */            int i6 = 1048575;
/* 46 */            int i7 = 0;
/* 47 */            int i8 = 0;
/* 49 */            while (i7 < iArr.length) {
/* 51 */                int iZzp = zzahqVar.zzp(i7);
/* 55 */                int iZzo = zzo(iZzp);
/* 59 */                int i9 = iArr[i7];
/* 63 */                if (iZzo <= 17) {
/* 67 */                    int i10 = iArr[i7 + 2];
/* 69 */                    z = true;
/* 71 */                    int i11 = i10 & i5;
/* 73 */                    if (i11 != i6) {
/* 80 */                        i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
/* 85 */                        i6 = i11;
                            }
/* 88 */                    int i12 = 1 << (i10 >>> 20);
/* 92 */                    entry2 = entry;
/* 93 */                    i = i6;
/* 94 */                    i2 = i8;
/* 95 */                    i3 = i12;
                        } else {
/* 98 */                    z = true;
/* 100 */                   entry2 = entry;
/* 101 */                   i = i6;
/* 102 */                   i2 = i8;
/* 103 */                   i3 = 0;
                        }
                        while (true) {
/* 104 */                   if (entry2 != null) {
/* 106 */                       zzafs zzafsVar = zzahqVar.zzn;
/* 112 */                       i4 = i5;
/* 120 */                       if (((zzage) entry2.getKey()).zza <= i9) {
/* 122 */                           zzafsVar.zzd(zzajbVar, entry2);
/* 129 */                           if (it.hasNext()) {
/* 135 */                               entry2 = (Map.Entry) it.next();
/* 137 */                               i5 = i4;
                                    } else {
/* 140 */                               i5 = i4;
/* 142 */                               entry2 = null;
                                    }
                                }
                            } else {
/* 144 */                       i4 = i5;
                            }
                        }
/* 146 */               long j = iZzp & i4;
                        switch (iZzo) {
                            case 0:
/* 1269 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1275 */                          zzajbVar.zzf(i9, zzait.zza(obj, j));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
/* 1253 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1259 */                          zzajbVar.zzo(i9, zzait.zzb(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 2:
/* 1237 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1243 */                          zzajbVar.zzt(i9, unsafe.getLong(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 3:
/* 1221 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1227 */                          zzajbVar.zzL(i9, unsafe.getLong(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 4:
/* 1205 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1211 */                          zzajbVar.zzr(i9, unsafe.getInt(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 5:
/* 1189 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1195 */                          zzajbVar.zzm(i9, unsafe.getLong(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 6:
/* 1173 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1179 */                          zzajbVar.zzk(i9, unsafe.getInt(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 7:
/* 1157 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1163 */                          zzajbVar.zzb(i9, zzait.zzw(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 8:
/* 1141 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1147 */                          zzO(i9, unsafe.getObject(obj, j), zzajbVar);
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 9:
/* 1121 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1131 */                          zzajbVar.zzw(i9, unsafe.getObject(obj, j), zzahqVar.zzs(i7));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
/* 1104 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1112 */                          zzajbVar.zzd(i9, (zzafd) unsafe.getObject(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 11:
/* 1089 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1095 */                          zzajbVar.zzJ(i9, unsafe.getInt(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 12:
/* 1074 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1080 */                          zzajbVar.zzi(i9, unsafe.getInt(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 13:
/* 1059 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1065 */                          zzajbVar.zzy(i9, unsafe.getInt(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 14:
/* 1044 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1050 */                          zzajbVar.zzA(i9, unsafe.getLong(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 15:
/* 1029 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1035 */                          zzajbVar.zzC(i9, unsafe.getInt(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 16:
/* 1011 */                      if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1017 */                          zzajbVar.zzE(i9, unsafe.getLong(obj, j));
                                }
/* 1020 */                      zzahqVar = this;
                                break;
                            case 17:
/* 991 */                       if (zzahqVar.zzJ(obj, i7, i, i2, i3)) {
/* 1001 */                          zzajbVar.zzq(i9, unsafe.getObject(obj, j), zzahqVar.zzs(i7));
                                    break;
                                } else {
                                    break;
                                }
                            case PoseLandmark.RIGHT_PINKY:
/* 981 */                       zzaic.zzt(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case PoseLandmark.LEFT_INDEX:
/* 967 */                       zzaic.zzx(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case PoseLandmark.RIGHT_INDEX:
/* 953 */                       zzaic.zzz(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case PoseLandmark.LEFT_THUMB:
/* 939 */                       zzaic.zzF(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case PoseLandmark.RIGHT_THUMB:
/* 925 */                       zzaic.zzy(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case PoseLandmark.LEFT_HIP:
/* 911 */                       zzaic.zzw(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case PoseLandmark.RIGHT_HIP:
/* 897 */                       zzaic.zzv(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case PoseLandmark.LEFT_KNEE:
/* 883 */                       zzaic.zzs(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case PoseLandmark.RIGHT_KNEE:
/* 851 */                       int i13 = iArr[i7];
/* 857 */                       List list = (List) unsafe.getObject(obj, j);
/* 859 */                       int i14 = zzaic.zza;
/* 861 */                       if (list != null && !list.isEmpty()) {
/* 869 */                           zzajbVar.zzI(i13, list);
                                }
                                break;
                            case 27:
/* 809 */                       int i15 = iArr[i7];
/* 815 */                       List list2 = (List) unsafe.getObject(obj, j);
/* 817 */                       zzaia zzaiaVarZzs = zzahqVar.zzs(i7);
/* 821 */                       int i16 = zzaic.zza;
/* 823 */                       if (list2 != null && !list2.isEmpty()) {
/* 836 */                           for (int i17 = 0; i17 < list2.size(); i17++) {
/* 845 */                               ((zzafn) zzajbVar).zzw(i15, list2.get(i17), zzaiaVarZzs);
                                    }
                                }
                                break;
                            case PoseLandmark.RIGHT_ANKLE:
/* 786 */                       int i18 = iArr[i7];
/* 792 */                       List list3 = (List) unsafe.getObject(obj, j);
/* 794 */                       int i19 = zzaic.zza;
/* 796 */                       if (list3 != null && !list3.isEmpty()) {
/* 804 */                           zzajbVar.zze(i18, list3);
                                }
                                break;
                            case PoseLandmark.LEFT_HEEL:
/* 781 */                       zzaic.zzE(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case 30:
/* 767 */                       zzaic.zzu(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case PoseLandmark.LEFT_FOOT_INDEX:
/* 753 */                       zzaic.zzA(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case 32:
/* 739 */                       zzaic.zzB(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case 33:
/* 725 */                       zzaic.zzC(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case 34:
/* 711 */                       zzaic.zzD(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, false);
                                break;
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 697 */                       zzaic.zzt(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case 36:
/* 682 */                       zzaic.zzx(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case 37:
/* 667 */                       zzaic.zzz(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case 38:
/* 652 */                       zzaic.zzF(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case 39:
/* 637 */                       zzaic.zzy(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case 40:
/* 622 */                       zzaic.zzw(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case 41:
/* 607 */                       zzaic.zzv(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case 42:
/* 592 */                       zzaic.zzs(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case 43:
/* 577 */                       zzaic.zzE(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case 44:
/* 562 */                       zzaic.zzu(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case BuildConfig.VERSION_CODE:
/* 547 */                       zzaic.zzA(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case 46:
/* 532 */                       zzaic.zzB(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case 47:
/* 517 */                       zzaic.zzC(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case 48:
/* 502 */                       zzaic.zzD(iArr[i7], (List) unsafe.getObject(obj, j), zzajbVar, z);
                                break;
                            case 49:
/* 450 */                       int i20 = iArr[i7];
/* 456 */                       List list4 = (List) unsafe.getObject(obj, j);
/* 458 */                       zzaia zzaiaVarZzs2 = zzahqVar.zzs(i7);
/* 462 */                       int i21 = zzaic.zza;
/* 464 */                       if (list4 != null && !list4.isEmpty()) {
/* 477 */                           for (int i22 = 0; i22 < list4.size(); i22++) {
/* 486 */                               ((zzafn) zzajbVar).zzq(i20, list4.get(i22), zzaiaVarZzs2);
                                    }
                                }
                                break;
                            case 50:
/* 427 */                       Object object = unsafe.getObject(obj, j);
/* 431 */                       if (object != null) {
/* 445 */                           zzajbVar.zzv(i9, ((zzahg) zzahqVar.zzu(i7)).zzc(), (zzahh) object);
                                }
                                break;
                            case 51:
/* 416 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 422 */                           zzajbVar.zzf(i9, zzk(obj, j));
                                }
                                break;
                            case 52:
/* 401 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 407 */                           zzajbVar.zzo(i9, zzl(obj, j));
                                }
                                break;
                            case 53:
/* 386 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 392 */                           zzajbVar.zzt(i9, zzq(obj, j));
                                }
                                break;
                            case 54:
/* 371 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 377 */                           zzajbVar.zzL(i9, zzq(obj, j));
                                }
                                break;
                            case 55:
/* 356 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 362 */                           zzajbVar.zzr(i9, zzm(obj, j));
                                }
                                break;
                            case 56:
/* 341 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 347 */                           zzajbVar.zzm(i9, zzq(obj, j));
                                }
                                break;
                            case 57:
/* 326 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 332 */                           zzajbVar.zzk(i9, zzm(obj, j));
                                }
                                break;
                            case 58:
/* 311 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 317 */                           zzajbVar.zzb(i9, zzN(obj, j));
                                }
                                break;
                            case 59:
/* 296 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 302 */                           zzO(i9, unsafe.getObject(obj, j), zzajbVar);
                                }
                                break;
                            case 60:
/* 277 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 287 */                           zzajbVar.zzw(i9, unsafe.getObject(obj, j), zzahqVar.zzs(i7));
                                }
                                break;
                            case 61:
/* 261 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 269 */                           zzajbVar.zzd(i9, (zzafd) unsafe.getObject(obj, j));
                                }
                                break;
                            case 62:
/* 247 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 253 */                           zzajbVar.zzJ(i9, zzm(obj, j));
                                }
                                break;
                            case 63:
/* 233 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 239 */                           zzajbVar.zzi(i9, zzm(obj, j));
                                }
                                break;
                            case Barcode.FORMAT_EAN_8:
/* 219 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 225 */                           zzajbVar.zzy(i9, zzm(obj, j));
                                }
                                break;
                            case 65:
/* 205 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 211 */                           zzajbVar.zzA(i9, zzq(obj, j));
                                }
                                break;
                            case 66:
/* 191 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 197 */                           zzajbVar.zzC(i9, zzm(obj, j));
                                }
                                break;
                            case 67:
/* 177 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 183 */                           zzajbVar.zzE(i9, zzq(obj, j));
                                }
                                break;
                            case 68:
/* 159 */                       if (zzahqVar.zzM(obj, i9, i7)) {
/* 169 */                           zzajbVar.zzq(i9, unsafe.getObject(obj, j), zzahqVar.zzs(i7));
                                }
                                break;
                        }
/* 1278 */              i7 += 3;
/* 1280 */              i8 = i2;
/* 1281 */              i5 = i4;
/* 1283 */              i6 = i;
/* 1284 */              entry = entry2;
                    }
/* 1287 */          while (entry != null) {
/* 1291 */              zzahqVar.zzn.zzd(zzajbVar, entry);
/* 1308 */              entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
/* 1315 */          ((zzagg) obj).zzc.zzl(zzajbVar);
                }

                @Override
                public final boolean zzh(Object obj, Object obj2) {
                    boolean zZzG;
/* 6 */             for (int i = 0; i < this.zzc.length; i += 3) {
/* 8 */                 int iZzp = zzp(i);
/* 15 */                long j = iZzp & 1048575;
                        switch (zzo(iZzp)) {
                            case 0:
/* 427 */                       if (!zzG(obj, obj2, i) || Double.doubleToLongBits(zzait.zza(obj, j)) != Double.doubleToLongBits(zzait.zza(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 1:
/* 402 */                       if (!zzG(obj, obj2, i) || Float.floatToIntBits(zzait.zzb(obj, j)) != Float.floatToIntBits(zzait.zzb(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 2:
/* 383 */                       if (!zzG(obj, obj2, i) || zzait.zzd(obj, j) != zzait.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 3:
/* 364 */                       if (!zzG(obj, obj2, i) || zzait.zzd(obj, j) != zzait.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 4:
/* 347 */                       if (!zzG(obj, obj2, i) || zzait.zzc(obj, j) != zzait.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 5:
/* 328 */                       if (!zzG(obj, obj2, i) || zzait.zzd(obj, j) != zzait.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 6:
/* 310 */                       if (!zzG(obj, obj2, i) || zzait.zzc(obj, j) != zzait.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 7:
/* 292 */                       if (!zzG(obj, obj2, i) || zzait.zzw(obj, j) != zzait.zzw(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 8:
/* 270 */                       if (!zzG(obj, obj2, i) || !zzaic.zzG(zzait.zzf(obj, j), zzait.zzf(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 9:
/* 248 */                       if (!zzG(obj, obj2, i) || !zzaic.zzG(zzait.zzf(obj, j), zzait.zzf(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 10:
/* 226 */                       if (!zzG(obj, obj2, i) || !zzaic.zzG(zzait.zzf(obj, j), zzait.zzf(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 11:
/* 208 */                       if (!zzG(obj, obj2, i) || zzait.zzc(obj, j) != zzait.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 12:
/* 190 */                       if (!zzG(obj, obj2, i) || zzait.zzc(obj, j) != zzait.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 13:
/* 172 */                       if (!zzG(obj, obj2, i) || zzait.zzc(obj, j) != zzait.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 14:
/* 152 */                       if (!zzG(obj, obj2, i) || zzait.zzd(obj, j) != zzait.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 15:
/* 134 */                       if (!zzG(obj, obj2, i) || zzait.zzc(obj, j) != zzait.zzc(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 16:
/* 114 */                       if (!zzG(obj, obj2, i) || zzait.zzd(obj, j) != zzait.zzd(obj2, j)) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case 17:
/* 92 */                        if (!zzG(obj, obj2, i) || !zzaic.zzG(zzait.zzf(obj, j), zzait.zzf(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            case PoseLandmark.RIGHT_PINKY:
                            case PoseLandmark.LEFT_INDEX:
                            case PoseLandmark.RIGHT_INDEX:
                            case PoseLandmark.LEFT_THUMB:
                            case PoseLandmark.RIGHT_THUMB:
                            case PoseLandmark.LEFT_HIP:
                            case PoseLandmark.RIGHT_HIP:
                            case PoseLandmark.LEFT_KNEE:
                            case PoseLandmark.RIGHT_KNEE:
                            case 27:
                            case PoseLandmark.RIGHT_ANKLE:
                            case PoseLandmark.LEFT_HEEL:
                            case 30:
                            case PoseLandmark.LEFT_FOOT_INDEX:
                            case 32:
                            case 33:
                            case 34:
                            case InputImage.IMAGE_FORMAT_YUV_420_888:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case BuildConfig.VERSION_CODE:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
/* 80 */                        zZzG = zzaic.zzG(zzait.zzf(obj, j), zzait.zzf(obj2, j));
                                break;
                            case 50:
/* 67 */                        zZzG = zzaic.zzG(zzait.zzf(obj, j), zzait.zzf(obj2, j));
                                break;
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case Barcode.FORMAT_EAN_8:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
/* 31 */                        long jZzn = zzn(i) & 1048575;
/* 41 */                        if (zzait.zzc(obj, jZzn) != zzait.zzc(obj2, jZzn) || !zzaic.zzG(zzait.zzf(obj, j), zzait.zzf(obj2, j))) {
/* 1 */                             return false;
                                }
                                continue;
                                break;
                            default:
                        }
/* 84 */                if (!zZzG) {
/* 1 */                     return false;
                        }
                    }
/* 468 */           if (!((zzagg) obj).zzc.equals(((zzagg) obj2).zzc)) {
/* 1 */                 return false;
                    }
/* 473 */           if (this.zzh) {
/* 483 */               return ((zzagd) obj).zzb.equals(((zzagd) obj2).zzb);
                    }
/* 488 */           return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean zzi(Object obj) {
                    int i;
                    int i2;
                    int i3;
/* 5 */             int i4 = 0;
/* 6 */             int i5 = 0;
/* 7 */             int i6 = 1048575;
/* 11 */            while (i5 < this.zzk) {
/* 13 */                int[] iArr = this.zzj;
/* 15 */                int[] iArr2 = this.zzc;
/* 17 */                int i7 = iArr[i5];
/* 19 */                int i8 = iArr2[i7];
/* 21 */                int iZzp = zzp(i7);
/* 27 */                int i9 = iArr2[i7 + 2];
/* 29 */                int i10 = i9 & 1048575;
/* 33 */                int i11 = 1 << (i9 >>> 20);
/* 34 */                if (i10 != i6) {
/* 36 */                    if (i10 != 1048575) {
/* 41 */                        i4 = zzb.getInt(obj, i10);
                            }
/* 45 */                    i2 = i7;
/* 46 */                    i3 = i4;
/* 47 */                    i = i10;
                        } else {
/* 49 */                    int i12 = i4;
/* 50 */                    i = i6;
/* 51 */                    i2 = i7;
/* 52 */                    i3 = i12;
                        }
/* 56 */                if ((268435456 & iZzp) != 0 && !zzJ(obj, i2, i, i3, i11)) {
/* 1 */                     return false;
                        }
/* 67 */                int iZzo = zzo(iZzp);
/* 73 */                if (iZzo == 9 || iZzo == 17) {
/* 239 */                   if (zzJ(obj, i2, i, i3, i11) && !zzK(obj, iZzp, zzs(i2))) {
/* 1 */                         return false;
                            }
                        } else if (iZzo == 27) {
/* 200 */                   List list = (List) zzait.zzf(obj, iZzp & 1048575);
/* 206 */                   if (list.isEmpty()) {
                                continue;
                            } else {
/* 208 */                       zzaia zzaiaVarZzs = zzs(i2);
/* 217 */                       for (int i13 = 0; i13 < list.size(); i13++) {
/* 227 */                           if (!zzaiaVarZzs.zzi(list.get(i13))) {
/* 1 */                                 return false;
                                    }
                                }
                            }
                        } else if (iZzo == 60 || iZzo == 68) {
/* 180 */                   if (zzM(obj, i8, i2) && !zzK(obj, iZzp, zzs(i2))) {
/* 1 */                         return false;
                            }
                        } else if (iZzo != 49) {
/* 97 */                    if (iZzo != 50) {
                                continue;
                            } else {
/* 108 */                       zzahh zzahhVar = (zzahh) zzait.zzf(obj, iZzp & 1048575);
/* 114 */                       if (!zzahhVar.isEmpty() && ((zzahg) zzu(i2)).zzc().zzc.zzb() == zzaja.MESSAGE) {
/* 144 */                           zzaia zzaiaVarZzb = null;
/* 149 */                           for (Object obj2 : zzahhVar.values()) {
/* 155 */                               if (zzaiaVarZzb == null) {
/* 165 */                                   zzaiaVarZzb = zzahw.zza().zzb(obj2.getClass());
                                        }
/* 173 */                               if (!zzaiaVarZzb.zzi(obj2)) {
/* 1 */                                     return false;
                                        }
                                    }
                                }
                            }
                        }
/* 252 */               i5++;
/* 254 */               i6 = i;
/* 255 */               i4 = i3;
                    }
                    return !this.zzh || ((zzagd) obj).zzb.zzl();
                }
            }
