            package com.google.mlkit.vision.barcode.bundled.internal;

            import android.content.Context;
            import com.google.android.libraries.barhopper.BarhopperV3;
            import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
            import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
            import com.google.android.libraries.barhopper.RecognitionOptions;
            import java.io.IOException;
            import java.io.InputStream;
            import java.nio.ByteBuffer;
            import java.util.List;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import p000.I1o1o0;
            import p000.I1o1o001ilo;
            import p000.IoOOl0iOl1io;
            import p000.IoOlilli0ol;
            import p000.i1OiIIo;
            import p000.i1iil1;
            import p000.iIoliO;
            import p000.iOoIoI01oo1;
            import p000.iOoOoOOI1;
            import p000.ii00i0iiOOOo;
            import p000.ii0IlI0;
            import p000.iiI1OIiO01l0;
            import p000.iiOi1ioO;
            import p000.iil111Io1lii;
            import p000.iilO0il1i;
            import p000.il1oII0OlIo;
            import p000.iliOO0o1lI;
            import p000.io0oll;
            import p000.l0IIlOoO11O;
            import p000.l0o1ll1o01IO;
            import p000.l1oloOiO;
            import p000.lII0I0I000I;
            import p000.lIOll0iI;
            
            final class zza extends iiI1OIiO01l0 {
                private static final int[] zza = {5, 7, 7, 7, 5, 5};
                private static final double[][] zzb = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};
                private final Context zzc;
                private final iOoOoOOI1 zzd;
                private BarhopperV3 zze;

                public zza(Context context, iOoOoOOI1 iooooooi1) {
/* 3 */             super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
/* 6 */             this.zzc = context;
/* 8 */             this.zzd = iooooooi1;
                }

                private final RecognitionOptions zzg() {
/* 3 */             RecognitionOptions recognitionOptions = new RecognitionOptions();
/* 10 */            recognitionOptions.I00000oIO(this.zzd.I00iOIl);
/* 17 */            recognitionOptions.I0001Ioi1lo(this.zzd.I00iiI);
/* 20 */            recognitionOptions.I00000oOI();
/* 23 */            recognitionOptions.I0000Il00O();
/* 29 */            return recognitionOptions;
                }

                private static iIoliO zzh(lIOll0iI lioll0ii, String str, String str2) {
/* 2 */             if (lioll0ii == null || str == null) {
/* 1 */                 return null;
                    }
/* 11 */            Matcher matcher = Pattern.compile(str2).matcher(str);
/* 57 */            return new iIoliO(lioll0ii.I001IIilI0O(), lioll0ii.I0010o(), lioll0ii.I00100l0(), lioll0ii.I00100o1O0lo(), lioll0ii.I0010I0i(), lioll0ii.I00111O(), lioll0ii.I001i1O0Ol(), matcher.find() ? matcher.group(1) : null);
                }

                private final I1o1o0 zzi(ByteBuffer byteBuffer, iilO0il1i iilo0il1i, RecognitionOptions recognitionOptions) {
/* 1 */             BarhopperV3 barhopperV3 = this.zze;
/* 3 */             lII0I0I000I.I000II(barhopperV3);
/* 6 */             lII0I0I000I.I000II(byteBuffer);
/* 13 */            if (byteBuffer.isDirect()) {
/* 19 */                return barhopperV3.I0000Il00O(iilo0il1i.I00iiI, iilo0il1i.I00iiO, byteBuffer, recognitionOptions);
                    }
/* 28 */            if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
/* 44 */                return barhopperV3.I000II(iilo0il1i.I00iiI, iilo0il1i.I00iiO, byteBuffer.array(), recognitionOptions);
                    }
/* 53 */            byte[] bArr = new byte[byteBuffer.remaining()];
/* 55 */            byteBuffer.get(bArr);
/* 62 */            return barhopperV3.I000II(iilo0il1i.I00iiI, iilo0il1i.I00iiO, bArr, recognitionOptions);
                }

                /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
                    java.lang.NullPointerException
                    */
                private final java.util.List zzj(p000.IoOlilli0ol r49, p000.iilO0il1i r50, com.google.android.libraries.barhopper.RecognitionOptions r51) {
/* 7 */             r3 = r50.I00iOIl;
/* 9 */             r4 = r50.I00iio;
/* 12 */            r6 = null;
/* 13 */            r7 = -1;
/* 14 */            if (r3 == -1) {
/* 75 */                r0 = r48.zze;
/* 77 */                p000.lII0I0I000I.I000II(r0);
/* 86 */                r0 = r0.I000O01llI0((android.graphics.Bitmap) p000.OIOiOlIO01.I00O0o1oo(r49), r51);
                    } else if (r3 == 17) {
/* 70 */                r0 = zzi((java.nio.ByteBuffer) p000.OIOiOlIO01.I00O0o1oo(r49), r50, r51);
                    } else if (r3 != 35) {
/* 27 */                if (r3 != 842094169) {
/* 36 */                    p000.I000II.I000iOII(p000.Oi010OO0.I000oI1ioi(r3, "Unsupported image format: "));
/* 12 */                    return null;
                        }
/* 70 */                r0 = zzi((java.nio.ByteBuffer) p000.OIOiOlIO01.I00O0o1oo(r49), r50, r51);
                    } else {
/* 44 */                r3 = (android.media.Image) p000.OIOiOlIO01.I00O0o1oo(r49);
/* 46 */                p000.lII0I0I000I.I000II(r3);
/* 59 */                r0 = zzi(r3.getPlanes()[0].getBuffer(), r50, r51);
                    }
/* 92 */            r2 = new java.util.ArrayList();
/* 103 */           r1 = com.google.mlkit.vision.common.internal.ImageUtils.getInstance().getUprightRotationMatrix(r50.I00iiI, r50.I00iiO, r4);
/* 119 */           for (p000.iil1I00o10 r3 : r0.I00100o1O0lo()) {
/* 131 */               r9 = 5;
/* 135 */               if (r3.I00100o1O0lo() > 0 && r1 != null) {
/* 139 */                   r8 = new float[8];
/* 141 */                   r12 = r3.I001lloI();
/* 145 */                   r13 = r3.I00100o1O0lo();
/* 150 */                   for (r14 = 0; r14 < r13; r14 = r14 + 1) {
/* 163 */                       r16 = r14 + r14;
/* 165 */                       r8[r16] = ((p000.iI0ilolI1oo1) r12.get(r14)).I00100l0();
/* 180 */                       r8[r16 + 1] = ((p000.iI0ilolI1oo1) r12.get(r14)).I00100o1O0lo();
                            }
/* 185 */                   r1.mapPoints(r8);
/* 188 */                   r12 = 0;
/* 189 */                   while (r12 < r13) {
/* 195 */                       r14 = (p000.ililOli1l) r3.I000oI1ioi(r9, r6);
/* 203 */                       if (r14.I00iOIl.equals(r3)) {
/* 234 */                           r17 = r7;
                                } else {
/* 211 */                           if (!r14.I00iiI.I000lI()) {
/* 213 */                               r14.I0001Ioi1lo();
                                    }
/* 216 */                           r15 = r14.I00iiI;
/* 220 */                           r17 = r7;
/* 230 */                           p000.ioiO0iOooii.I0000Il00O.I00000oIO(r15.getClass()).I00000oOI(r15, r3);
                                }
/* 236 */                       r14 = (p000.iOoIoo1oI0) r14;
/* 241 */                       r6 = r12 + r12;
/* 243 */                       r7 = p000.iI0ilolI1oo1.I0010I0i();
/* 249 */                       r15 = (int) r8[r6];
/* 250 */                       r7.I0000oI00();
/* 257 */                       p000.iI0ilolI1oo1.I0010o((p000.iI0ilolI1oo1) r7.I00iiI, r15);
/* 263 */                       r6 = (int) r8[r6 + 1];
/* 264 */                       r7.I0000oI00();
/* 271 */                       p000.iI0ilolI1oo1.I00111O((p000.iI0ilolI1oo1) r7.I00iiI, r6);
/* 278 */                       r6 = (p000.iI0ilolI1oo1) r7.I00000oOI();
/* 280 */                       r14.I0000oI00();
/* 287 */                       p000.iil1I00o10.I00II0Ol1O0l((p000.iil1I00o10) r14.I00iiI, (r12 + r4) % r13, r6);
/* 294 */                       r3 = (p000.iil1I00o10) r14.I00000oOI();
/* 296 */                       r12 = r12 + 1;
/* 298 */                       r7 = r17;
/* 300 */                       r6 = null;
/* 301 */                       r9 = 5;
                            }
                        }
/* 303 */               r17 = r7;
/* 309 */               if (r3.I00IOO()) {
/* 311 */                   r6 = r3.I001IO000();
/* 335 */                   r25 = new p000.iOIIo0i(r6.I00111O() - 1, r6.I00100o1O0lo(), r6.I0010o(), r6.I0010I0i());
                        } else {
/* 341 */                   r25 = null;
                        }
/* 377 */               if (r3.I00Io1lO()) {
/* 379 */                   r6 = r3.I001i1lo1io();
/* 393 */                   r27 = new p000.iOioOI0o00(r6.I00100o1O0lo(), r6.I0010I0i());
                        } else {
/* 399 */                   r27 = null;
                        }
/* 405 */               if (r3.I00IoIO0lI()) {
/* 407 */                   r6 = r3.I001l0I00();
/* 427 */                   r28 = new p000.iOli1io(r6.I0010I0i(), r6.I00100o1O0lo(), r6.I0010o() - 1);
                        } else {
/* 433 */                   r28 = null;
                        }
/* 439 */               if (r3.I00Io1o110i()) {
/* 441 */                   r6 = r3.I001iOo1i0O();
/* 455 */                   r29 = new p000.iOlI0l0l1oi0(r6.I00100o1O0lo(), r6.I0010I0i());
                        } else {
/* 461 */                   r29 = null;
                        }
/* 467 */               if (r3.I00IioO0OiOi()) {
/* 469 */                   r6 = r3.I001i1O0Ol();
/* 483 */                   r30 = new p000.iOIoiol1O(r6.I00100l0(), r6.I00100o1O0lo());
                        } else {
/* 489 */                   r30 = null;
                        }
/* 497 */               if (r3.I00II0oii1o()) {
/* 499 */                   r6 = r3.I0010o();
/* 505 */                   r32 = r6.I001i1O0Ol();
/* 509 */                   r33 = r6.I0010o();
/* 513 */                   r34 = r6.I00111O();
/* 517 */                   r35 = r6.I001IIilI0O();
/* 521 */                   r36 = r6.I001IO000();
/* 525 */                   r8 = r6.I00100o1O0lo();
/* 537 */                   if (r3.I001lIiIIo1O().I0010o()) {
/* 539 */                       r9 = r3.I001lIiIIo1O();
/* 543 */                       r9.getClass();
/* 556 */                       r9 = r9.I0001Ioi1lo() == 0 ? "" : r9.I00100o1O0lo(p000.iloi1OI100li.I00000oIO);
                            } else {
/* 561 */                       r9 = null;
                            }
/* 564 */                   r37 = zzh(r8, r9, "DTSTART:([0-9TZ]*)");
/* 568 */                   r6 = r6.I00100l0();
/* 580 */                   if (r3.I001lIiIIo1O().I0010o()) {
/* 582 */                       r8 = r3.I001lIiIIo1O();
/* 586 */                       r8.getClass();
/* 599 */                       r8 = r8.I0001Ioi1lo() == 0 ? "" : r8.I00100o1O0lo(p000.iloi1OI100li.I00000oIO);
                            } else {
/* 604 */                       r8 = null;
                            }
/* 611 */                   r31 = new p000.iO0i0ooI(r32, r33, r34, r35, r36, r37, zzh(r6, r8, "DTEND:([0-9TZ]*)"));
                        } else {
/* 615 */                   r31 = null;
                        }
/* 621 */               if (r3.I00IO1()) {
/* 623 */                   r6 = r3.I00111O();
/* 629 */                   r8 = r6.I00100l0();
/* 669 */                   r33 = r8 != null ? new p000.iOOioi1O0I1i(r8.I0010I0i(), r8.I001IO000(), r8.I001IIilI0O(), r8.I00100o1O0lo(), r8.I00111O(), r8.I0010o(), r8.I001i1O0Ol()) : null;
/* 671 */                   r34 = r6.I0010I0i();
/* 675 */                   r35 = r6.I0010o();
/* 679 */                   r8 = r6.I001IO000();
/* 687 */                   if (r8.isEmpty()) {
/* 689 */                       r36 = null;
                            } else {
/* 696 */                       r9 = new p000.iOiIOl1lOlI[r8.size()];
/* 703 */                       for (r12 = 0; r12 < r8.size(); r12 = r12 + 1) {
/* 732 */                           r9[r12] = new p000.iOiIOl1lOlI(((p000.iioliloo) r8.get(r12)).I0010I0i() - 1, ((p000.iioliloo) r8.get(r12)).I00100o1O0lo());
                                }
/* 737 */                       r36 = r9;
                            }
/* 739 */                   r8 = r6.I001IIilI0O();
/* 747 */                   if (r8.isEmpty()) {
/* 749 */                       r37 = null;
                            } else {
/* 756 */                       r9 = new p000.iOIIo0i[r8.size()];
/* 763 */                       for (r12 = 0; r12 < r8.size(); r12 = r12 + 1) {
/* 812 */                           r9[r12] = new p000.iOIIo0i(((p000.o00iIOl0o011) r8.get(r12)).I00111O() - 1, ((p000.o00iIOl0o011) r8.get(r12)).I00100o1O0lo(), ((p000.o00iIOl0o011) r8.get(r12)).I0010o(), ((p000.o00iIOl0o011) r8.get(r12)).I0010I0i());
                                }
/* 820 */                       r37 = r9;
                            }
/* 834 */                   r38 = (java.lang.String[]) r6.I001i1O0Ol().toArray(new java.lang.String[0]);
/* 836 */                   r6 = r6.I00111O();
/* 844 */                   if (r6.isEmpty()) {
/* 846 */                       r39 = null;
                            } else {
/* 853 */                       r8 = new p000.iIo00l0loI0l[r6.size()];
/* 860 */                       for (r9 = 0; r9 < r6.size(); r9 = r9 + 1) {
/* 897 */                           r8[r9] = new p000.iIo00l0loI0l(((p000.iio1O1oi1o0I) r6.get(r9)).I00100o1O0lo() - 1, (java.lang.String[]) ((p000.iio1O1oi1o0I) r6.get(r9)).I00100l0().toArray(new java.lang.String[0]));
                                }
/* 902 */                       r39 = r8;
                            }
/* 904 */                   r32 = new p000.iO111II(r33, r34, r35, r36, r37, r38, r39);
                        } else {
/* 908 */                   r32 = null;
                        }
/* 914 */               if (r3.I00IO1oi11O()) {
/* 916 */                   r6 = r3.I001IIilI0O();
/* 978 */                   r33 = new p000.iO1iIl01Il0l(r6.I001IO000(), r6.I001i1lo1io(), r6.I00II0Ol1O0l(), r6.I001lllioOl(), r6.I001iOo1i0O(), r6.I0010o(), r6.I00100o1O0lo(), r6.I0010I0i(), r6.I00111O(), r6.I001lloI(), r6.I001l0I00(), r6.I001i1O0Ol(), r6.I001IIilI0O(), r6.I001lIiIIo1O());
                        } else {
/* 982 */                   r33 = null;
                        }
/* 993 */               r9 = 4;
                        switch (r3.I00IoO0() - 1) {
                            case 0:
/* 1041 */                      r19 = 0;
                                break;
                            case 1:
/* 1038 */                      r19 = 1;
                                break;
                            case 2:
/* 1035 */                      r19 = 2;
                                break;
                            case 3:
/* 1032 */                      r19 = 4;
                                break;
                            case 4:
/* 1029 */                      r19 = 8;
                                break;
                            case 5:
/* 1026 */                      r6 = 16;
/* 1002 */                      r19 = r6;
                                break;
                            case 6:
/* 1023 */                      r6 = 32;
/* 1002 */                      r19 = r6;
                                break;
                            case 7:
/* 1020 */                      r6 = 64;
/* 1002 */                      r19 = r6;
                                break;
                            case 8:
/* 1017 */                      r6 = com.google.mlkit.vision.barcode.common.Barcode.FORMAT_ITF;
/* 1002 */                      r19 = r6;
                                break;
                            case 9:
/* 1014 */                      r6 = com.google.mlkit.vision.barcode.common.Barcode.FORMAT_QR_CODE;
/* 1002 */                      r19 = r6;
                                break;
                            case 10:
/* 1011 */                      r6 = com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_A;
/* 1002 */                      r19 = r6;
                                break;
                            case 11:
/* 1008 */                      r6 = com.google.mlkit.vision.barcode.common.Barcode.FORMAT_UPC_E;
/* 1002 */                      r19 = r6;
                                break;
                            case 12:
/* 1005 */                      r6 = com.google.mlkit.vision.barcode.common.Barcode.FORMAT_PDF417;
/* 1002 */                      r19 = r6;
                                break;
                            case 13:
/* 1000 */                      r6 = com.google.mlkit.vision.barcode.common.Barcode.FORMAT_AZTEC;
/* 1002 */                      r19 = r6;
                                break;
                            default:
/* 997 */                       r19 = r17;
                                break;
                        }
/* 1043 */              r20 = r3.I001lllioOl();
/* 1055 */              if (r3.I001lIiIIo1O().I0010o()) {
/* 1057 */                  r6 = r3.I001lIiIIo1O();
/* 1061 */                  r6.getClass();
/* 1073 */                  r21 = r6.I0001Ioi1lo() != 0 ? r6.I00100o1O0lo(p000.iloi1OI100li.I00000oIO) : "";
                        } else {
/* 1080 */                  r21 = null;
                        }
/* 1082 */              r6 = r3.I001lIiIIo1O();
/* 1086 */              r7 = r6.I0001Ioi1lo();
/* 1090 */              if (r7 == 0) {
/* 1092 */                  r22 = p000.iloi1OI100li.I00000oOI;
                        } else {
/* 1097 */                  r10 = new byte[r7];
/* 1099 */                  r6.I000OOo1O(0, r10, 0, r7);
/* 1102 */                  r22 = r10;
                        }
/* 1104 */              r6 = r3.I001lloI();
/* 1112 */              if (r6.isEmpty()) {
/* 1114 */                  r23 = null;
                        } else {
/* 1121 */                  r7 = new android.graphics.Point[r6.size()];
/* 1128 */                  for (r10 = 0; r10 < r6.size(); r10 = r10 + 1) {
/* 1155 */                      r7[r10] = new android.graphics.Point(((p000.iI0ilolI1oo1) r6.get(r10)).I00100l0(), ((p000.iI0ilolI1oo1) r6.get(r10)).I00100o1O0lo());
                            }
/* 1160 */                  r23 = r7;
                        }
                        switch (r3.I00100l0() - 1) {
                            case 1:
/* 1203 */                      r24 = 1;
                                continue;
/* 1210 */                      r2.add(new p000.iOlo0iOI1i(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33));
/* 1213 */                      r7 = r17;
/* 1215 */                      r6 = null;
                            case 2:
/* 1200 */                      r24 = 2;
                                continue;
/* 1210 */                      r2.add(new p000.iOlo0iOI1i(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33));
/* 1213 */                      r7 = r17;
/* 1215 */                      r6 = null;
                            case 3:
/* 1198 */                      r9 = 3;
                                break;
                            case 4:
                                break;
                            case 5:
/* 1195 */                      r24 = 5;
                                continue;
/* 1210 */                      r2.add(new p000.iOlo0iOI1i(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33));
/* 1213 */                      r7 = r17;
/* 1215 */                      r6 = null;
                            case 6:
/* 1193 */                      r9 = 6;
                                break;
                            case 7:
/* 1191 */                      r9 = 7;
                                break;
                            case 8:
/* 1188 */                      r24 = 8;
                                continue;
/* 1210 */                      r2.add(new p000.iOlo0iOI1i(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33));
/* 1213 */                      r7 = r17;
/* 1215 */                      r6 = null;
                            case 9:
/* 1185 */                      r9 = 9;
                                break;
                            case 10:
/* 1182 */                      r9 = 10;
                                break;
                            case 11:
/* 1179 */                      r9 = 11;
                                break;
                            case 12:
/* 1174 */                      r9 = 12;
                                break;
                            default:
/* 1171 */                      r24 = 0;
                                continue;
/* 1210 */                      r2.add(new p000.iOlo0iOI1i(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33));
/* 1213 */                      r7 = r17;
/* 1215 */                      r6 = null;
                        }
/* 1176 */              r24 = r9;
/* 1210 */              r2.add(new p000.iOlo0iOI1i(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33));
/* 1213 */              r7 = r17;
/* 1215 */              r6 = null;
                    }
/* 1218 */          return r2;
                }

                @Override
                public final List zzb(IoOlilli0ol ioOlilli0ol, iilO0il1i iilo0il1i) {
/* 5 */             return zzj(ioOlilli0ol, iilo0il1i, zzg());
                }

                @Override
                public final List zzc(IoOlilli0ol ioOlilli0ol, iilO0il1i iilo0il1i, ii00i0iiOOOo ii00i0iioooo) {
/* 1 */             RecognitionOptions recognitionOptionsZzg = zzg();
/* 7 */             MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
/* 14 */            multiScaleDecodingOptions.I00000oIO(ii00i0iioooo.I00iOIl.I00iOIl);
/* 17 */            iiOi1ioO iioi1ioo = ii00i0iioooo.I00iOIl;
/* 21 */            multiScaleDecodingOptions.I00000oOI(iioi1ioo.I00iiI);
/* 26 */            multiScaleDecodingOptions.I0000Il00O(iioi1ioo.I00iiO);
/* 29 */            recognitionOptionsZzg.I0000O(multiScaleDecodingOptions);
/* 34 */            MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
/* 39 */            multiScaleDetectionOptions.I00000oIO(iioi1ioo.I00iOIl);
/* 42 */            recognitionOptionsZzg.I0000oI00(multiScaleDetectionOptions);
/* 47 */            recognitionOptionsZzg.I000II(ii00i0iioooo.I00iiO);
/* 50 */            return zzj(ioOlilli0ol, iilo0il1i, recognitionOptionsZzg);
                }

                @Override
                public final void zzd() throws IOException {
/* 3 */             if (this.zze != null) {
/* 301 */               return;
                    }
/* 9 */             BarhopperV3 barhopperV3 = new BarhopperV3();
/* 14 */            System.loadLibrary("barhopper_v3");
/* 17 */            this.zze = barhopperV3;
/* 19 */            l0IIlOoO11O l0iilooo11oI00100l0 = l0o1ll1o01IO.I00100l0();
/* 23 */            iliOO0o1lI ilioo0o1liI00100l0 = io0oll.I00100l0();
/* 28 */            int i = 16;
/* 31 */            int i2 = 0;
/* 33 */            for (int i3 = 0; i3 < 6; i3++) {
/* 35 */                iOoIoI01oo1 iooioi01oo1I00100l0 = iil111Io1lii.I00100l0();
/* 39 */                iooioi01oo1I00100l0.I0000oI00();
/* 46 */                iil111Io1lii.I00111O((iil111Io1lii) iooioi01oo1I00100l0.I00iiI, i);
/* 49 */                iooioi01oo1I00100l0.I0000oI00();
/* 56 */                iil111Io1lii.I00100o1O0lo((iil111Io1lii) iooioi01oo1I00100l0.I00iiI, i);
/* 64 */                for (int i4 = 0; i4 < zza[i3]; i4++) {
/* 68 */                    double[] dArr = zzb[i2];
/* 74 */                    double d = dArr[0] * 320.0d;
/* 82 */                    float fSqrt = (float) Math.sqrt(dArr[1]);
/* 83 */                    float f = (float) d;
/* 86 */                    iooioi01oo1I00100l0.I0000oI00();
/* 93 */                    iil111Io1lii.I0010I0i((iil111Io1lii) iooioi01oo1I00100l0.I00iiI, f / fSqrt);
/* 97 */                    iooioi01oo1I00100l0.I0000oI00();
/* 104 */                   iil111Io1lii.I0010o((iil111Io1lii) iooioi01oo1I00100l0.I00iiI, f * fSqrt);
/* 107 */                   i2++;
                        }
/* 112 */               i += i;
/* 113 */               ilioo0o1liI00100l0.I0000oI00();
/* 126 */               io0oll.I00100o1O0lo((io0oll) ilioo0o1liI00100l0.I00iiI, (iil111Io1lii) iooioi01oo1I00100l0.I00000oOI());
                    }
/* 132 */           l0iilooo11oI00100l0.I0000oI00();
/* 145 */           l0o1ll1o01IO.I00100o1O0lo((l0o1ll1o01IO) l0iilooo11oI00100l0.I00iiI, (io0oll) ilioo0o1liI00100l0.I00000oOI());
                    try {
/* 156 */               InputStream inputStreamOpen = this.zzc.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
                        try {
/* 168 */                   InputStream inputStreamOpen2 = this.zzc.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                            try {
/* 180 */                       InputStream inputStreamOpen3 = this.zzc.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                                try {
/* 184 */                           BarhopperV3 barhopperV32 = this.zze;
/* 186 */                           lII0I0I000I.I000II(barhopperV32);
/* 189 */                           l1oloOiO l1olooioI00100l0 = I1o1o001ilo.I00100l0();
/* 193 */                           il1oII0OlIo il1oii0olioI001i1O0Ol = il1oII0OlIo.I001i1O0Ol(inputStreamOpen);
/* 197 */                           l0iilooo11oI00100l0.I0000oI00();
/* 204 */                           l0o1ll1o01IO.I0010I0i((l0o1ll1o01IO) l0iilooo11oI00100l0.I00iiI, il1oii0olioI001i1O0Ol);
/* 207 */                           l1olooioI00100l0.I0000oI00();
/* 220 */                           I1o1o001ilo.I00100o1O0lo((I1o1o001ilo) l1olooioI00100l0.I00iiI, (l0o1ll1o01IO) l0iilooo11oI00100l0.I00000oOI());
/* 223 */                           i1OiIIo i1oiiioI00100l0 = i1iil1.I00100l0();
/* 227 */                           il1oII0OlIo il1oii0olioI001i1O0Ol2 = il1oII0OlIo.I001i1O0Ol(inputStreamOpen2);
/* 231 */                           i1oiiioI00100l0.I0000oI00();
/* 238 */                           i1iil1.I0010I0i((i1iil1) i1oiiioI00100l0.I00iiI, il1oii0olioI001i1O0Ol2);
/* 241 */                           il1oII0OlIo il1oii0olioI001i1O0Ol3 = il1oII0OlIo.I001i1O0Ol(inputStreamOpen3);
/* 245 */                           i1oiiioI00100l0.I0000oI00();
/* 252 */                           i1iil1.I00100o1O0lo((i1iil1) i1oiiioI00100l0.I00iiI, il1oii0olioI001i1O0Ol3);
/* 255 */                           l1olooioI00100l0.I0000oI00();
/* 268 */                           I1o1o001ilo.I0010I0i((I1o1o001ilo) l1olooioI00100l0.I00iiI, (i1iil1) i1oiiioI00100l0.I00000oOI());
/* 277 */                           barhopperV32.I00000oIO((I1o1o001ilo) l1olooioI00100l0.I00000oOI());
/* 280 */                           if (inputStreamOpen3 != null) {
/* 282 */                               inputStreamOpen3.close();
                                    }
/* 288 */                           if (inputStreamOpen2 != null) {
/* 290 */                               inputStreamOpen2.close();
                                    }
/* 296 */                           if (inputStreamOpen != null) {
/* 298 */                               inputStreamOpen.close();
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } catch (IOException e) {
/* 339 */               IoOOl0iOl1io.I000l1("Failed to open Barcode models", e);
                    }
                }

                @Override
                public final void zze(ii0IlI0 ii0ili0) throws IOException {
/* 1 */             zzd();
                }

                @Override
                public final void zzf() {
/* 1 */             BarhopperV3 barhopperV3 = this.zze;
/* 3 */             if (barhopperV3 != null) {
/* 5 */                 barhopperV3.close();
/* 9 */                 this.zze = null;
                    }
                }
            }
