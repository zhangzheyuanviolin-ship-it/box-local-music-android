            package p000;

            import android.graphics.Canvas;
            import android.graphics.Color;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.PathMeasure;
            import android.graphics.PorterDuff;
            import android.graphics.Shader;
            import java.util.ArrayList;
            
            public final class Ooo111OO {
                public static final Matrix I00100l0 = new Matrix();
                public Paint I0000O;
                public Paint I0000oI00;
                public PathMeasure I0001Ioi1lo;
                public Matrix I0000Il00O = new Matrix();
                public float I000O01llI0 = 0.0f;
                public float I000OOo1O = 0.0f;
                public float I000OiO = 0.0f;
                public float I000iOII = 0.0f;
                public int I000l1 = 255;
                public String I000lI = null;
                public Boolean I000o00OoI0I = null;
                public I1Io0i0II I000oI1ioi = new I1Io0i0II(0);
                public Ooo0oOIl0I0 I000II = new Ooo0oOIl0I0();
                public Path I00000oIO = new Path();
                public Path I00000oOI = new Path();

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r46v1 */
                /* JADX WARN: Type inference failed for: r46v2 */
                /* JADX WARN: Type inference failed for: r46v6 */
                /* JADX WARN: Type inference failed for: r46v8 */
                /* JADX WARN: Type inference failed for: r7v0 */
                /* JADX WARN: Type inference failed for: r7v1 */
                /* JADX WARN: Type inference failed for: r7v59 */
                public final void I00000oIO(Ooo0oOIl0I0 ooo0oOIl0I0, Matrix matrix, Canvas canvas, int i, int i2) {
                    int i3;
                    Matrix matrix2;
                    ArrayList arrayList;
                    boolean z;
                    float f;
                    float f2;
                    Path path;
                    int i4;
                    float f3;
                    int i5;
                    char c;
                    float[] fArr;
                    OO0iO1ll00[] oO0iO1ll00Arr;
                    Matrix matrix3;
                    int i6;
                    OO0iO1ll00 oO0iO1ll00;
                    Path path2;
                    float[] fArr2;
                    float f4;
                    float f5;
                    float f6;
                    float f7;
                    float f8;
                    boolean z2;
                    float f9;
                    float f10;
                    boolean z3;
                    float f11;
                    float f12;
                    float f13;
                    float f14;
                    float f15;
                    float f16;
                    float f17;
                    float f18;
                    float f19;
                    float f20;
/* 3 */             Matrix matrix4 = ooo0oOIl0I0.I00000oIO;
/* 5 */             ArrayList arrayList2 = ooo0oOIl0I0.I00000oOI;
/* 9 */             matrix4.set(matrix);
/* 12 */            Matrix matrix5 = ooo0oOIl0I0.I00000oIO;
/* 16 */            matrix5.preConcat(ooo0oOIl0I0.I000OiO);
/* 19 */            canvas.save();
/* 22 */            ?? r7 = 0;
/* 23 */            int i7 = 0;
/* 28 */            while (i7 < arrayList2.size()) {
/* 34 */                Ooo0oOOIl ooo0oOOIl = (Ooo0oOOIl) arrayList2.get(i7);
/* 38 */                if (ooo0oOOIl instanceof Ooo0oOIl0I0) {
/* 51 */                    I00000oIO((Ooo0oOIl0I0) ooo0oOOIl, matrix5, canvas, i, i2);
                        } else {
/* 70 */                    if (ooo0oOOIl instanceof Ooo0olli) {
/* 72 */                        Ooo0olli ooo0olli = (Ooo0olli) ooo0oOOIl;
/* 74 */                        Path path3 = this.I00000oIO;
/* 76 */                        Path path4 = this.I00000oOI;
/* 83 */                        float f21 = i / this.I000OiO;
/* 89 */                        float f22 = i2 / this.I000iOII;
/* 90 */                        float fMin = Math.min(f21, f22);
/* 94 */                        Matrix matrix6 = this.I0000Il00O;
/* 96 */                        matrix6.set(matrix5);
/* 99 */                        matrix6.postScale(f21, f22);
/* 103 */                       float[] fArr3 = {0.0f, 1.0f, 1.0f, 0.0f};
/* 108 */                       matrix5.mapVectors(fArr3);
/* 114 */                       ?? r46 = r7;
/* 117 */                       int i8 = 4;
/* 123 */                       i3 = i7;
/* 130 */                       float fHypot = (float) Math.hypot(fArr3[r7], fArr3[1]);
/* 141 */                       Path path5 = path3;
/* 148 */                       float fHypot2 = (float) Math.hypot(fArr3[2], fArr3[3]);
/* 159 */                       float f23 = (fArr3[r46 == true ? 1 : 0] * fArr3[3]) - (fArr3[1] * fArr3[2]);
/* 160 */                       float fMax = Math.max(fHypot, fHypot2);
/* 176 */                       float fAbs = fMax > 0.0f ? Math.abs(f23) / fMax : 0.0f;
/* 179 */                       if (fAbs == 0.0f) {
/* 181 */                           matrix2 = matrix5;
/* 183 */                           arrayList = arrayList2;
                                } else {
/* 189 */                           path5.reset();
/* 192 */                           OO0iO1ll00[] oO0iO1ll00Arr2 = ooo0olli.I00000oIO;
/* 194 */                           if (oO0iO1ll00Arr2 != null) {
/* 197 */                               float[] fArr4 = new float[6];
/* 199 */                               int length = oO0iO1ll00Arr2.length;
/* 200 */                               int i9 = r46 == true ? 1 : 0;
/* 202 */                               char c2 = 'm';
/* 204 */                               while (i9 < length) {
/* 206 */                                   OO0iO1ll00 oO0iO1ll002 = oO0iO1ll00Arr2[i9];
/* 208 */                                   Matrix matrix7 = matrix5;
/* 210 */                                   char c3 = oO0iO1ll002.I00000oIO;
/* 212 */                                   float[] fArr5 = oO0iO1ll002.I00000oOI;
/* 214 */                                   float f24 = fArr4[r46 == true ? 1 : 0];
/* 216 */                                   float f25 = fArr4[1];
/* 218 */                                   float f26 = fArr4[2];
/* 220 */                                   float f27 = fArr4[3];
/* 222 */                                   float f28 = fArr4[i8];
/* 226 */                                   ArrayList arrayList3 = arrayList2;
/* 228 */                                   float f29 = fArr4[5];
                                            switch (c3) {
                                                case 'A':
                                                case 'a':
/* 288 */                                           f2 = fAbs;
/* 290 */                                           path = path5;
/* 296 */                                           i4 = 7;
/* 298 */                                           f3 = f24;
                                                    break;
                                                case 'C':
                                                case 'c':
/* 279 */                                           f2 = fAbs;
/* 281 */                                           path = path5;
/* 283 */                                           f3 = f24;
/* 285 */                                           i4 = 6;
                                                    break;
                                                case 'H':
                                                case 'V':
                                                case 'h':
                                                case 'v':
/* 270 */                                           f2 = fAbs;
/* 272 */                                           path = path5;
/* 274 */                                           f3 = f24;
/* 276 */                                           i4 = 1;
                                                    break;
                                                case 'Q':
                                                case 'S':
                                                case 'q':
                                                case 's':
/* 261 */                                           f2 = fAbs;
/* 263 */                                           path = path5;
/* 265 */                                           f3 = f24;
/* 267 */                                           i4 = i8;
                                                    break;
                                                case 'Z':
                                                case 'z':
/* 242 */                                           path5.close();
/* 245 */                                           f2 = fAbs;
/* 247 */                                           path = path5;
/* 249 */                                           path.moveTo(f28, f29);
/* 252 */                                           f25 = f29;
/* 254 */                                           f27 = f25;
/* 256 */                                           f3 = f28;
/* 258 */                                           f26 = f3;
/* 239 */                                           i4 = 2;
                                                    break;
                                                default:
/* 233 */                                           f2 = fAbs;
/* 235 */                                           path = path5;
/* 237 */                                           f3 = f24;
/* 239 */                                           i4 = 2;
                                                    break;
                                            }
/* 300 */                                   float f30 = f25;
/* 302 */                                   float f31 = f28;
/* 304 */                                   char c4 = c2;
/* 306 */                                   float f32 = f30;
/* 308 */                                   float f33 = f29;
/* 310 */                                   int i10 = i9;
/* 312 */                                   int i11 = r46 == true ? 1 : 0;
/* 315 */                                   while (i11 < fArr5.length) {
/* 319 */                                       if (c3 != 'A') {
/* 323 */                                           if (c3 == 'C') {
/* 1246 */                                              i5 = i8;
/* 1248 */                                              c = c3;
/* 1250 */                                              fArr = fArr5;
/* 1252 */                                              oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 1254 */                                              matrix3 = matrix6;
/* 1255 */                                              i6 = length;
/* 1257 */                                              oO0iO1ll00 = oO0iO1ll002;
/* 1262 */                                              path2 = path;
/* 1263 */                                              fArr2 = fArr4;
/* 1270 */                                              int i12 = i11 + 2;
/* 1274 */                                              int i13 = i11 + 3;
/* 1278 */                                              int i14 = i11 + 4;
/* 1282 */                                              int i15 = i11 + 5;
/* 1286 */                                              path2.cubicTo(fArr[i11], fArr[i11 + 1], fArr[i12], fArr[i13], fArr[i14], fArr[i15]);
/* 1289 */                                              float f34 = fArr[i14];
/* 1291 */                                              float f35 = fArr[i15];
/* 1293 */                                              float f36 = fArr[i12];
/* 1295 */                                              float f37 = fArr[i13];
/* 1297 */                                              f26 = f36;
/* 1299 */                                              f3 = f34;
/* 1301 */                                              f32 = f35;
/* 1303 */                                              f27 = f37;
                                                    } else if (c3 != 'H') {
/* 331 */                                               if (c3 == 'Q') {
/* 1170 */                                                  i5 = i8;
/* 1172 */                                                  c = c3;
/* 1174 */                                                  fArr = fArr5;
/* 1176 */                                                  oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 1178 */                                                  matrix3 = matrix6;
/* 1179 */                                                  i6 = length;
/* 1181 */                                                  oO0iO1ll00 = oO0iO1ll002;
/* 1186 */                                                  path2 = path;
/* 1187 */                                                  fArr2 = fArr4;
/* 1190 */                                                  int i16 = i11 + 1;
/* 1194 */                                                  int i17 = i11 + 2;
/* 1198 */                                                  int i18 = i11 + 3;
/* 1202 */                                                  path2.quadTo(fArr[i11], fArr[i16], fArr[i17], fArr[i18]);
/* 1205 */                                                  f4 = fArr[i11];
/* 1207 */                                                  f5 = fArr[i16];
/* 1209 */                                                  f6 = fArr[i17];
/* 1211 */                                                  f7 = fArr[i18];
                                                        } else if (c3 == 'V') {
/* 1139 */                                                  i5 = i8;
/* 1141 */                                                  c = c3;
/* 1143 */                                                  fArr = fArr5;
/* 1145 */                                                  oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 1147 */                                                  matrix3 = matrix6;
/* 1148 */                                                  i6 = length;
/* 1150 */                                                  oO0iO1ll00 = oO0iO1ll002;
/* 1157 */                                                  path2 = path;
/* 1158 */                                                  fArr2 = fArr4;
/* 1161 */                                                  path2.lineTo(f3, fArr[i11]);
/* 1164 */                                                  f32 = fArr[i11];
                                                        } else if (c3 != 'a') {
/* 343 */                                                   if (c3 == 'c') {
/* 980 */                                                       i5 = i8;
/* 982 */                                                       c = c3;
/* 984 */                                                       fArr = fArr5;
/* 986 */                                                       oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 988 */                                                       matrix3 = matrix6;
/* 989 */                                                       i6 = length;
/* 991 */                                                       oO0iO1ll00 = oO0iO1ll002;
/* 996 */                                                       path2 = path;
/* 997 */                                                       fArr2 = fArr4;
/* 1004 */                                                      int i19 = i11 + 2;
/* 1008 */                                                      int i20 = i11 + 3;
/* 1012 */                                                      int i21 = i11 + 4;
/* 1016 */                                                      int i22 = i11 + 5;
/* 1020 */                                                      path2.rCubicTo(fArr[i11], fArr[i11 + 1], fArr[i19], fArr[i20], fArr[i21], fArr[i22]);
/* 1025 */                                                      f11 = f3 + fArr[i19];
/* 1029 */                                                      f12 = f32 + fArr[i20];
/* 1033 */                                                      f3 += fArr[i21];
/* 1035 */                                                      f13 = fArr[i22];
                                                            } else if (c3 == 'h') {
/* 950 */                                                       i5 = i8;
/* 952 */                                                       c = c3;
/* 954 */                                                       fArr = fArr5;
/* 956 */                                                       oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 958 */                                                       matrix3 = matrix6;
/* 959 */                                                       i6 = length;
/* 961 */                                                       oO0iO1ll00 = oO0iO1ll002;
/* 966 */                                                       path2 = path;
/* 967 */                                                       fArr2 = fArr4;
/* 971 */                                                       path2.rLineTo(fArr[i11], 0.0f);
/* 976 */                                                       f3 += fArr[i11];
                                                            } else if (c3 != 'q') {
/* 355 */                                                       if (c3 != 'v') {
/* 359 */                                                           if (c3 != 'L') {
/* 363 */                                                               if (c3 == 'M') {
/* 787 */                                                                   i5 = i8;
/* 789 */                                                                   c = c3;
/* 791 */                                                                   fArr = fArr5;
/* 793 */                                                                   oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 795 */                                                                   matrix3 = matrix6;
/* 796 */                                                                   i6 = length;
/* 798 */                                                                   oO0iO1ll00 = oO0iO1ll002;
/* 803 */                                                                   path2 = path;
/* 804 */                                                                   fArr2 = fArr4;
/* 805 */                                                                   f15 = fArr[i11];
/* 809 */                                                                   f16 = fArr[i11 + 1];
/* 811 */                                                                   if (i11 > 0) {
/* 813 */                                                                       path2.lineTo(f15, f16);
                                                                            } else {
/* 822 */                                                                       path2.moveTo(f15, f16);
/* 825 */                                                                       f3 = f15;
/* 827 */                                                                       f31 = f3;
/* 829 */                                                                       f32 = f16;
                                                                            }
                                                                        } else if (c3 == 'S') {
/* 708 */                                                                   i5 = i8;
/* 710 */                                                                   c = c3;
/* 712 */                                                                   fArr = fArr5;
/* 714 */                                                                   oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 716 */                                                                   matrix3 = matrix6;
/* 717 */                                                                   i6 = length;
/* 719 */                                                                   oO0iO1ll00 = oO0iO1ll002;
/* 726 */                                                                   path2 = path;
/* 727 */                                                                   fArr2 = fArr4;
/* 728 */                                                                   if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
/* 750 */                                                                       f3 = (f3 * 2.0f) - f26;
/* 754 */                                                                       f32 = (f32 * 2.0f) - f27;
                                                                            }
/* 743 */                                                                   float f38 = f3;
/* 745 */                                                                   float f39 = f32;
/* 759 */                                                                   int i23 = i11 + 1;
/* 763 */                                                                   int i24 = i11 + 2;
/* 767 */                                                                   int i25 = i11 + 3;
/* 771 */                                                                   path2.cubicTo(f38, f39, fArr[i11], fArr[i23], fArr[i24], fArr[i25]);
/* 774 */                                                                   float f40 = fArr[i11];
/* 776 */                                                                   float f41 = fArr[i23];
/* 778 */                                                                   f6 = fArr[i24];
/* 780 */                                                                   f7 = fArr[i25];
/* 782 */                                                                   f27 = f41;
/* 784 */                                                                   f26 = f40;
/* 702 */                                                                   f3 = f6;
/* 704 */                                                                   f32 = f7;
                                                                        } else if (c3 == 'T') {
/* 636 */                                                                   i5 = i8;
/* 638 */                                                                   c = c3;
/* 640 */                                                                   fArr = fArr5;
/* 642 */                                                                   oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 644 */                                                                   matrix3 = matrix6;
/* 645 */                                                                   i6 = length;
/* 647 */                                                                   oO0iO1ll00 = oO0iO1ll002;
/* 654 */                                                                   path2 = path;
/* 655 */                                                                   fArr2 = fArr4;
/* 656 */                                                                   if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
/* 678 */                                                                       f3 = (f3 * 2.0f) - f26;
/* 682 */                                                                       f32 = (f32 * 2.0f) - f27;
                                                                            }
/* 671 */                                                                   f4 = f3;
/* 673 */                                                                   f5 = f32;
/* 687 */                                                                   int i26 = i11 + 1;
/* 691 */                                                                   path2.quadTo(f4, f5, fArr[i11], fArr[i26]);
/* 694 */                                                                   f6 = fArr[i11];
/* 696 */                                                                   f7 = fArr[i26];
                                                                        } else if (c3 == 'l') {
/* 599 */                                                                   i5 = i8;
/* 601 */                                                                   c = c3;
/* 603 */                                                                   fArr = fArr5;
/* 605 */                                                                   oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 607 */                                                                   matrix3 = matrix6;
/* 608 */                                                                   i6 = length;
/* 610 */                                                                   oO0iO1ll00 = oO0iO1ll002;
/* 615 */                                                                   path2 = path;
/* 616 */                                                                   fArr2 = fArr4;
/* 619 */                                                                   int i27 = i11 + 1;
/* 623 */                                                                   path2.rLineTo(fArr[i11], fArr[i27]);
/* 628 */                                                                   f3 += fArr[i11];
/* 630 */                                                                   f14 = fArr[i27];
                                                                        } else if (c3 == 'm') {
/* 555 */                                                                   i5 = i8;
/* 557 */                                                                   c = c3;
/* 559 */                                                                   fArr = fArr5;
/* 563 */                                                                   oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 565 */                                                                   matrix3 = matrix6;
/* 566 */                                                                   i6 = length;
/* 568 */                                                                   oO0iO1ll00 = oO0iO1ll002;
/* 571 */                                                                   path2 = path;
/* 572 */                                                                   fArr2 = fArr4;
/* 573 */                                                                   float f42 = fArr[i11];
/* 575 */                                                                   f3 += f42;
/* 579 */                                                                   float f43 = fArr[i11 + 1];
/* 581 */                                                                   f32 += f43;
/* 583 */                                                                   if (i11 > 0) {
/* 585 */                                                                       path2.rLineTo(f42, f43);
                                                                            } else {
/* 590 */                                                                       path2.rMoveTo(f42, f43);
/* 593 */                                                                       f31 = f3;
                                                                            }
                                                                        } else if (c3 != 's') {
/* 389 */                                                                   if (c3 != 't') {
/* 391 */                                                                       i5 = i8;
/* 393 */                                                                       c = c3;
/* 395 */                                                                       fArr = fArr5;
                                                                            } else {
/* 411 */                                                                       c = c3;
/* 415 */                                                                       if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
/* 431 */                                                                           f19 = f3 - f26;
/* 433 */                                                                           f20 = f32 - f27;
                                                                                } else {
/* 428 */                                                                           f19 = 0.0f;
/* 429 */                                                                           f20 = 0.0f;
                                                                                }
/* 437 */                                                                       int i28 = i11 + 1;
/* 439 */                                                                       fArr = fArr5;
/* 443 */                                                                       path.rQuadTo(f19, f20, fArr5[i11], fArr[i28]);
/* 446 */                                                                       float f44 = f3 + f19;
/* 448 */                                                                       float f45 = f32 + f20;
/* 452 */                                                                       f3 += fArr[i11];
/* 456 */                                                                       f32 += fArr[i28];
/* 458 */                                                                       i5 = i8;
/* 460 */                                                                       f26 = f44;
/* 462 */                                                                       f27 = f45;
                                                                            }
/* 397 */                                                                   oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 399 */                                                                   matrix3 = matrix6;
/* 400 */                                                                   i6 = length;
/* 402 */                                                                   oO0iO1ll00 = oO0iO1ll002;
/* 407 */                                                                   path2 = path;
/* 408 */                                                                   fArr2 = fArr4;
                                                                        } else {
/* 465 */                                                                   c = c3;
/* 467 */                                                                   fArr = fArr5;
/* 471 */                                                                   if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
/* 490 */                                                                       f17 = f3 - f26;
/* 492 */                                                                       f18 = f32 - f27;
                                                                            } else {
/* 486 */                                                                       f17 = 0.0f;
/* 487 */                                                                       f18 = 0.0f;
                                                                            }
/* 499 */                                                                   int i29 = i11 + 1;
/* 501 */                                                                   matrix3 = matrix6;
/* 504 */                                                                   int i30 = i11 + 2;
/* 510 */                                                                   int i31 = i11 + 3;
/* 516 */                                                                   i5 = i8;
/* 518 */                                                                   oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 520 */                                                                   i6 = length;
/* 526 */                                                                   path2 = path;
/* 527 */                                                                   fArr2 = fArr4;
/* 528 */                                                                   oO0iO1ll00 = oO0iO1ll002;
/* 530 */                                                                   path2.rCubicTo(f17, f18, fArr[i11], fArr[i29], fArr[i30], fArr[i31]);
/* 535 */                                                                   float f46 = f3 + fArr[i11];
/* 539 */                                                                   float f47 = f32 + fArr[i29];
/* 543 */                                                                   f3 += fArr[i30];
/* 547 */                                                                   f32 += fArr[i31];
/* 549 */                                                                   f27 = f47;
/* 551 */                                                                   f26 = f46;
                                                                        }
/* 595 */                                                               f33 = f32;
                                                                    } else {
/* 833 */                                                               i5 = i8;
/* 835 */                                                               c = c3;
/* 837 */                                                               fArr = fArr5;
/* 839 */                                                               oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 841 */                                                               matrix3 = matrix6;
/* 842 */                                                               i6 = length;
/* 844 */                                                               oO0iO1ll00 = oO0iO1ll002;
/* 849 */                                                               path2 = path;
/* 850 */                                                               fArr2 = fArr4;
/* 853 */                                                               int i32 = i11 + 1;
/* 857 */                                                               path2.lineTo(fArr[i11], fArr[i32]);
/* 860 */                                                               f15 = fArr[i11];
/* 862 */                                                               f16 = fArr[i32];
                                                                    }
/* 816 */                                                           f3 = f15;
/* 818 */                                                           f32 = f16;
                                                                } else {
/* 865 */                                                           i5 = i8;
/* 867 */                                                           c = c3;
/* 869 */                                                           fArr = fArr5;
/* 871 */                                                           oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 873 */                                                           matrix3 = matrix6;
/* 874 */                                                           i6 = length;
/* 876 */                                                           oO0iO1ll00 = oO0iO1ll002;
/* 881 */                                                           path2 = path;
/* 882 */                                                           fArr2 = fArr4;
/* 886 */                                                           path2.rLineTo(0.0f, fArr[i11]);
/* 889 */                                                           f14 = fArr[i11];
                                                                }
/* 632 */                                                       f32 += f14;
                                                            } else {
/* 893 */                                                       i5 = i8;
/* 895 */                                                       c = c3;
/* 897 */                                                       fArr = fArr5;
/* 899 */                                                       oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 901 */                                                       matrix3 = matrix6;
/* 902 */                                                       i6 = length;
/* 904 */                                                       oO0iO1ll00 = oO0iO1ll002;
/* 909 */                                                       path2 = path;
/* 910 */                                                       fArr2 = fArr4;
/* 913 */                                                       int i33 = i11 + 1;
/* 917 */                                                       int i34 = i11 + 2;
/* 921 */                                                       int i35 = i11 + 3;
/* 925 */                                                       path2.rQuadTo(fArr[i11], fArr[i33], fArr[i34], fArr[i35]);
/* 930 */                                                       f11 = f3 + fArr[i11];
/* 934 */                                                       f12 = f32 + fArr[i33];
/* 938 */                                                       f3 += fArr[i34];
/* 940 */                                                       f13 = fArr[i35];
                                                            }
/* 942 */                                                   f32 += f13;
/* 944 */                                                   f26 = f11;
/* 946 */                                                   f27 = f12;
                                                        } else {
/* 1038 */                                                  i5 = i8;
/* 1040 */                                                  c = c3;
/* 1042 */                                                  fArr = fArr5;
/* 1044 */                                                  oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 1046 */                                                  matrix3 = matrix6;
/* 1047 */                                                  i6 = length;
/* 1049 */                                                  oO0iO1ll00 = oO0iO1ll002;
/* 1054 */                                                  path2 = path;
/* 1055 */                                                  fArr2 = fArr4;
/* 1056 */                                                  int i36 = i11 + 5;
/* 1060 */                                                  float f48 = fArr[i36] + f3;
/* 1062 */                                                  int i37 = i11 + 6;
/* 1066 */                                                  float f49 = fArr[i37] + f32;
/* 1068 */                                                  float f50 = fArr[i11];
/* 1072 */                                                  float f51 = fArr[i11 + 1];
/* 1076 */                                                  float f52 = fArr[i11 + 2];
/* 1086 */                                                  if (fArr[i11 + 3] != 0.0f) {
/* 1088 */                                                      f8 = f32;
/* 1090 */                                                      z2 = true;
                                                            } else {
/* 1093 */                                                      f8 = f32;
/* 1095 */                                                      z2 = r46 == true ? 1 : 0;
                                                            }
/* 1103 */                                                  if (fArr[i11 + 4] != 0.0f) {
/* 1105 */                                                      float f53 = f3;
/* 1107 */                                                      f9 = f52;
/* 1109 */                                                      f10 = f53;
/* 1111 */                                                      z3 = true;
                                                            } else {
/* 1114 */                                                      float f54 = f3;
/* 1116 */                                                      f9 = f52;
/* 1118 */                                                      f10 = f54;
/* 1120 */                                                      z3 = r46 == true ? 1 : 0;
                                                            }
/* 1122 */                                                  OO0iO1ll00.I00000oIO(path2, f10, f8, f48, f49, f50, f51, f9, z2, z3);
/* 1127 */                                                  f3 = f10 + fArr[i36];
/* 1131 */                                                  f32 = f8 + fArr[i37];
/* 1133 */                                                  f26 = f3;
                                                        }
/* 698 */                                               f26 = f4;
/* 700 */                                               f27 = f5;
/* 702 */                                               f3 = f6;
/* 704 */                                               f32 = f7;
                                                    } else {
/* 1215 */                                              i5 = i8;
/* 1217 */                                              c = c3;
/* 1219 */                                              fArr = fArr5;
/* 1221 */                                              oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 1223 */                                              matrix3 = matrix6;
/* 1224 */                                              i6 = length;
/* 1226 */                                              oO0iO1ll00 = oO0iO1ll002;
/* 1233 */                                              path2 = path;
/* 1234 */                                              fArr2 = fArr4;
/* 1237 */                                              path2.lineTo(fArr[i11], f32);
/* 1240 */                                              f3 = fArr[i11];
                                                    }
/* 1389 */                                          i11 += i4;
/* 1393 */                                          oO0iO1ll002 = oO0iO1ll00;
/* 1394 */                                          fArr4 = fArr2;
/* 1395 */                                          matrix6 = matrix3;
/* 1396 */                                          path = path2;
/* 1397 */                                          length = i6;
/* 1399 */                                          c3 = c;
/* 1401 */                                          c4 = c3;
/* 1402 */                                          fArr5 = fArr;
/* 1404 */                                          oO0iO1ll00Arr2 = oO0iO1ll00Arr;
/* 1406 */                                          i8 = i5;
                                                } else {
/* 1306 */                                          i5 = i8;
/* 1308 */                                          c = c3;
/* 1310 */                                          fArr = fArr5;
/* 1312 */                                          oO0iO1ll00Arr = oO0iO1ll00Arr2;
/* 1314 */                                          matrix3 = matrix6;
/* 1315 */                                          i6 = length;
/* 1317 */                                          oO0iO1ll00 = oO0iO1ll002;
/* 1326 */                                          path2 = path;
/* 1327 */                                          fArr2 = fArr4;
/* 1328 */                                          int i38 = i11 + 5;
/* 1332 */                                          int i39 = i11 + 6;
/* 1374 */                                          OO0iO1ll00.I00000oIO(path2, f3, f32, fArr[i38], fArr[i39], fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3] != 0.0f ? true : r46 == true ? 1 : 0, fArr[i11 + 4] != 0.0f ? true : r46 == true ? 1 : 0);
/* 1377 */                                          float f55 = fArr[i38];
/* 1379 */                                          float f56 = fArr[i39];
/* 1381 */                                          f3 = f55;
/* 1383 */                                          f26 = f3;
/* 1385 */                                          f32 = f56;
                                                }
/* 1135 */                                      f27 = f32;
/* 1389 */                                      i11 += i4;
/* 1393 */                                      oO0iO1ll002 = oO0iO1ll00;
/* 1394 */                                      fArr4 = fArr2;
/* 1395 */                                      matrix6 = matrix3;
/* 1396 */                                      path = path2;
/* 1397 */                                      length = i6;
/* 1399 */                                      c3 = c;
/* 1401 */                                      c4 = c3;
/* 1402 */                                      fArr5 = fArr;
/* 1404 */                                      oO0iO1ll00Arr2 = oO0iO1ll00Arr;
/* 1406 */                                      i8 = i5;
                                            }
/* 1410 */                                  int i40 = i8;
/* 1412 */                                  OO0iO1ll00[] oO0iO1ll00Arr3 = oO0iO1ll00Arr2;
/* 1426 */                                  Path path6 = path;
/* 1427 */                                  float[] fArr6 = fArr4;
/* 1428 */                                  fArr6[r46 == true ? 1 : 0] = f3;
/* 1430 */                                  fArr6[1] = f32;
/* 1432 */                                  fArr6[2] = f26;
/* 1434 */                                  fArr6[3] = f27;
/* 1436 */                                  fArr6[i40] = f31;
/* 1438 */                                  fArr6[5] = f33;
/* 1440 */                                  c2 = oO0iO1ll002.I00000oIO;
/* 1448 */                                  path5 = path6;
/* 1450 */                                  matrix5 = matrix7;
/* 1452 */                                  arrayList2 = arrayList3;
/* 1454 */                                  fAbs = f2;
/* 1458 */                                  oO0iO1ll00Arr2 = oO0iO1ll00Arr3;
/* 1442 */                                  i9 = i10 + 1;
/* 1461 */                                  i8 = i40;
                                        }
                                    }
/* 1467 */                          matrix2 = matrix5;
/* 1469 */                          arrayList = arrayList2;
/* 1471 */                          float f57 = fAbs;
/* 1473 */                          Matrix matrix8 = matrix6;
/* 1474 */                          Path path7 = path5;
/* 1476 */                          path4.reset();
/* 1481 */                          if (ooo0olli instanceof Ooo0lOI) {
/* 1492 */                              path4.setFillType(ooo0olli.I0000Il00O == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
/* 1495 */                              path4.addPath(path7, matrix8);
/* 1498 */                              canvas.clipPath(path4);
                                    } else {
/* 1503 */                              Ooo0lOl0O1l0 ooo0lOl0O1l0 = (Ooo0lOl0O1l0) ooo0olli;
/* 1505 */                              float f58 = ooo0lOl0O1l0.I000OOo1O;
/* 1513 */                              if (f58 == 0.0f && ooo0lOl0O1l0.I000OiO == 1.0f) {
/* 1522 */                                  z = r46 == true ? 1 : 0;
                                        } else {
/* 1525 */                                  float f59 = ooo0lOl0O1l0.I000iOII;
/* 1528 */                                  float f60 = (f58 + f59) % 1.0f;
/* 1532 */                                  float f61 = (ooo0lOl0O1l0.I000OiO + f59) % 1.0f;
/* 1533 */                                  PathMeasure pathMeasure = this.I0001Ioi1lo;
/* 1535 */                                  if (pathMeasure == null) {
/* 1539 */                                      pathMeasure = new PathMeasure();
/* 1542 */                                      this.I0001Ioi1lo = pathMeasure;
                                            }
/* 1544 */                                  z = r46 == true ? 1 : 0;
/* 1546 */                                  pathMeasure.setPath(path7, z);
/* 1551 */                                  float length2 = this.I0001Ioi1lo.getLength();
/* 1555 */                                  float f62 = f60 * length2;
/* 1556 */                                  float f63 = f61 * length2;
/* 1557 */                                  path7.reset();
/* 1562 */                                  PathMeasure pathMeasure2 = this.I0001Ioi1lo;
/* 1564 */                                  if (f62 > f63) {
/* 1568 */                                      pathMeasure2.getSegment(f62, length2, path7, true);
/* 1573 */                                      f = 0.0f;
/* 1574 */                                      this.I0001Ioi1lo.getSegment(0.0f, f63, path7, true);
                                            } else {
/* 1580 */                                      f = 0.0f;
/* 1581 */                                      pathMeasure2.getSegment(f62, f63, path7, true);
                                            }
/* 1584 */                                  path7.rLineTo(f, f);
                                        }
/* 1587 */                              path4.addPath(path7, matrix8);
/* 1590 */                              I00Ol00 i00Ol00 = ooo0lOl0O1l0.I0001Ioi1lo;
/* 1604 */                              if (((Shader) i00Ol00.I0000Il00O) != null || i00Ol00.I00000oOI != 0) {
/* 1613 */                                  if (this.I0000oI00 == null) {
/* 1618 */                                      Paint paint = new Paint(1);
/* 1621 */                                      this.I0000oI00 = paint;
/* 1625 */                                      paint.setStyle(Paint.Style.FILL);
                                            }
/* 1628 */                                  Paint paint2 = this.I0000oI00;
/* 1632 */                                  Shader shader = (Shader) i00Ol00.I0000Il00O;
/* 1634 */                                  if (shader != null) {
/* 1636 */                                      shader.setLocalMatrix(matrix8);
/* 1639 */                                      paint2.setShader(shader);
/* 1649 */                                      paint2.setAlpha(Math.round(ooo0lOl0O1l0.I000O01llI0 * 255.0f));
                                            } else {
/* 1653 */                                      paint2.setShader(null);
/* 1656 */                                      paint2.setAlpha(255);
/* 1659 */                                      int i41 = i00Ol00.I00000oOI;
/* 1661 */                                      float f64 = ooo0lOl0O1l0.I000O01llI0;
/* 1663 */                                      PorterDuff.Mode mode = Ooo1IlOO.I00l0OO0IO;
/* 1676 */                                      paint2.setColor((i41 & 16777215) | (((int) (Color.alpha(i41) * f64)) << 24));
                                            }
/* 1679 */                                  paint2.setColorFilter(null);
/* 1691 */                                  path4.setFillType(ooo0lOl0O1l0.I0000Il00O == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
/* 1694 */                                  canvas.drawPath(path4, paint2);
                                        }
/* 1697 */                              I00Ol00 i00Ol002 = ooo0lOl0O1l0.I0000O;
/* 1703 */                              if (((Shader) i00Ol002.I0000Il00O) != null || i00Ol002.I00000oOI != 0) {
/* 1712 */                                  if (this.I0000O == null) {
/* 1717 */                                      Paint paint3 = new Paint(1);
/* 1720 */                                      this.I0000O = paint3;
/* 1724 */                                      paint3.setStyle(Paint.Style.STROKE);
                                            }
/* 1727 */                                  Paint paint4 = this.I0000O;
/* 1729 */                                  Paint.Join join = ooo0lOl0O1l0.I000lI;
/* 1731 */                                  if (join != null) {
/* 1733 */                                      paint4.setStrokeJoin(join);
                                            }
/* 1736 */                                  Paint.Cap cap = ooo0lOl0O1l0.I000l1;
/* 1738 */                                  if (cap != null) {
/* 1740 */                                      paint4.setStrokeCap(cap);
                                            }
/* 1745 */                                  paint4.setStrokeMiter(ooo0lOl0O1l0.I000o00OoI0I);
/* 1750 */                                  Shader shader2 = (Shader) i00Ol002.I0000Il00O;
/* 1752 */                                  if (shader2 != null) {
/* 1754 */                                      shader2.setLocalMatrix(matrix8);
/* 1757 */                                      paint4.setShader(shader2);
/* 1767 */                                      paint4.setAlpha(Math.round(ooo0lOl0O1l0.I000II * 255.0f));
                                            } else {
/* 1771 */                                      paint4.setShader(null);
/* 1774 */                                      paint4.setAlpha(255);
/* 1777 */                                      int i42 = i00Ol002.I00000oOI;
/* 1779 */                                      float f65 = ooo0lOl0O1l0.I000II;
/* 1781 */                                      PorterDuff.Mode mode2 = Ooo1IlOO.I00l0OO0IO;
/* 1794 */                                      paint4.setColor((i42 & 16777215) | (((int) (Color.alpha(i42) * f65)) << 24));
                                            }
/* 1797 */                                  paint4.setColorFilter(null);
/* 1806 */                                  paint4.setStrokeWidth(ooo0lOl0O1l0.I0000oI00 * fMin * f57);
/* 1809 */                                  canvas.drawPath(path4, paint4);
                                        }
                                    }
                                }
/* 185 */                       z = r46 == true ? 1 : 0;
                            }
/* 1812 */                  i7 = i3 + 1;
/* 1814 */                  r7 = z;
/* 1815 */                  matrix5 = matrix2;
/* 1817 */                  arrayList2 = arrayList;
                        }
/* 55 */                matrix2 = matrix5;
/* 57 */                arrayList = arrayList2;
/* 59 */                z = r7;
/* 60 */                i3 = i7;
/* 1812 */              i7 = i3 + 1;
/* 1814 */              r7 = z;
/* 1815 */              matrix5 = matrix2;
/* 1817 */              arrayList2 = arrayList;
                    }
/* 1823 */          canvas.restore();
                }

                public float getAlpha() {
/* 8 */             return getRootAlpha() / 255.0f;
                }

                public int getRootAlpha() {
/* 1 */             return this.I000l1;
                }

                public void setAlpha(float f) {
/* 5 */             setRootAlpha((int) (f * 255.0f));
                }

                public void setRootAlpha(int i) {
/* 1 */             this.I000l1 = i;
                }
            }
