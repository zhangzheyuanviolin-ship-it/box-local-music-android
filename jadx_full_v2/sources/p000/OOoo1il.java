            package p000;

            import android.graphics.Matrix;
            import android.graphics.Path;
            import android.graphics.PointF;
            import android.graphics.RectF;
            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.BitSet;
            import java.util.Iterator;
            import java.util.Set;
            
            public final class OOoo1il {
                public Object I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;
                public Object I0000oI00;
                public Object I0001Ioi1lo;
                public Object I000II;
                public Object I000O01llI0;
                public Object I000OOo1O;
                public Object I000OiO;
                public Object I000iOII;

                public OOoo1il(int i) {
                    switch (i) {
                        case 1:
/* 54 */                    this.I00000oIO = new OioiioI1[4];
/* 58 */                    this.I00000oOI = new Matrix[4];
/* 62 */                    this.I0000Il00O = new Matrix[4];
/* 69 */                    this.I0000O = new PointF();
/* 76 */                    this.I0000oI00 = new Path();
/* 83 */                    this.I0001Ioi1lo = new Path();
/* 90 */                    this.I000II = new OioiioI1();
/* 95 */                    this.I000O01llI0 = new float[2];
/* 99 */                    this.I000OOo1O = new float[2];
/* 106 */                   this.I000OiO = new Path();
/* 113 */                   this.I000iOII = new Path();
/* 116 */                   for (int i2 = 0; i2 < 4; i2++) {
/* 127 */                       ((OioiioI1[]) this.I00000oIO)[i2] = new OioiioI1();
/* 138 */                       ((Matrix[]) this.I00000oOI)[i2] = new Matrix();
/* 149 */                       ((Matrix[]) this.I0000Il00O)[i2] = new Matrix();
                            }
                            break;
                        default:
/* 13 */                    OI110O0 oi110o0 = new OI110O0(new IloI1lO1IiI0[16]);
/* 16 */                    this.I0000Il00O = oi110o0;
/* 18 */                    OI10IIO oi10iio = OiO11lliO.I00000oIO;
/* 25 */                    this.I000II = new OI10IIO();
/* 27 */                    this.I0000O = oi110o0;
/* 36 */                    this.I0000oI00 = new OI110O0(new Object[16]);
/* 45 */                    this.I0001Ioi1lo = new OI110O0(new IllOOo00lI[16]);
                            break;
                    }
                }

                public static final boolean I000II(IloI1lO1IiI0 iloI1lO1IiI0, OI110O0 oi110o0) {
/* 1 */             Object[] objArr = oi110o0.I00iOIl;
/* 3 */             int i = oi110o0.I00iiO;
/* 7 */             for (int i2 = 0; i2 < i; i2++) {
/* 13 */                OOooI0ioo1o oOooI0ioo1o = ((IloI1lO1IiI0) objArr[i2]).I00000oIO;
/* 17 */                if (oOooI0ioo1o instanceof OO0iiO) {
/* 21 */                    OI110O0 oi110o02 = ((OO0iiO) oOooI0ioo1o).I00iiI;
/* 27 */                    if (oi110o02.I000iOII(iloI1lO1IiI0) || I000II(iloI1lO1IiI0, oi110o02)) {
/* 36 */                        return true;
                            }
                        }
                    }
/* 5 */             return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v23, types: [Ii0010O01] */
                /* JADX WARN: Type inference failed for: r14v24, types: [Ii0010O01] */
                /* JADX WARN: Type inference failed for: r14v25, types: [Ii0010O01] */
                /* JADX WARN: Type inference failed for: r14v26, types: [Ii0010O01] */
                /* JADX WARN: Type inference failed for: r16v0 */
                /* JADX WARN: Type inference failed for: r16v1 */
                /* JADX WARN: Type inference failed for: r16v6 */
                public void I00000oIO(OioOlIlii1il oioOlIlii1il, float[] fArr, float f, RectF rectF, Oi00IilOloo0 oi00IilOloo0, Path path) {
                    int i;
                    boolean z;
                    float f2;
                    Oi00IilOloo0 oi00IilOloo02;
                    boolean z2;
                    IOIO0iI iOIO0iI;
/* 7 */             Oi00IilOloo0 oi00IilOloo03 = oi00IilOloo0;
/* 13 */            Matrix[] matrixArr = (Matrix[]) this.I0000Il00O;
/* 17 */            float[] fArr2 = (float[]) this.I000O01llI0;
/* 21 */            OioiioI1[] oioiioI1Arr = (OioiioI1[]) this.I00000oIO;
/* 25 */            Matrix[] matrixArr2 = (Matrix[]) this.I00000oOI;
/* 27 */            path.rewind();
/* 32 */            Path path2 = (Path) this.I0000oI00;
/* 34 */            path2.rewind();
/* 39 */            Path path3 = (Path) this.I0001Ioi1lo;
/* 41 */            path3.rewind();
/* 46 */            path3.addRect(rectF, Path.Direction.CW);
/* 49 */            int i2 = 0;
                    while (true) {
/* 53 */                z = 0;
/* 56 */                if (i2 >= 4) {
                            break;
                        }
/* 60 */                PointF pointF = (PointF) this.I0000O;
/* 62 */                if (fArr == null) {
/* 79 */                    iOIO0iI = i2 != 1 ? i2 != 2 ? i2 != 3 ? oioOlIlii1il.I0001Ioi1lo : oioOlIlii1il.I0000oI00 : oioOlIlii1il.I000O01llI0 : oioOlIlii1il.I000II;
                        } else {
/* 84 */                    float f3 = fArr[i2];
/* 86 */                    IOIO0iI iOIO0iI2 = new IOIO0iI();
/* 89 */                    iOIO0iI2.I00000oIO = f3;
/* 91 */                    VarHandle.storeStoreFence();
                            iOIO0iI = iOIO0iI2;
                        }
/* 111 */               iiol0Oi0 iiol0oi0 = i2 != 1 ? i2 != 2 ? i2 != 3 ? oioOlIlii1il.I00000oOI : oioOlIlii1il.I00000oIO : oioOlIlii1il.I0000O : oioOlIlii1il.I0000Il00O;
/* 113 */               OioiioI1 oioiioI1 = oioiioI1Arr[i2];
/* 115 */               iiol0oi0.getClass();
/* 122 */               Matrix[] matrixArr3 = matrixArr;
/* 126 */               iiol0oi0.I00000oIO(oioiioI1, f, iOIO0iI.I00000oIO(rectF));
/* 129 */               int i3 = i2 + 1;
/* 133 */               float f4 = (i3 % 4) * 90;
/* 138 */               matrixArr2[i2].reset();
/* 142 */               if (i2 == 1) {
/* 178 */                   pointF.set(rectF.right, rectF.bottom);
                        } else if (i2 == 2) {
/* 170 */                   pointF.set(rectF.left, rectF.bottom);
                        } else if (i2 != 3) {
/* 154 */                   pointF.set(rectF.right, rectF.top);
                        } else {
/* 162 */                   pointF.set(rectF.left, rectF.top);
                        }
/* 187 */               matrixArr2[i2].setTranslate(pointF.x, pointF.y);
/* 192 */               matrixArr2[i2].preRotate(f4);
/* 195 */               OioiioI1 oioiioI12 = oioiioI1Arr[i2];
/* 199 */               fArr2[0] = oioiioI12.I00000oOI;
/* 205 */               fArr2[1] = oioiioI12.I0000Il00O;
/* 209 */               matrixArr2[i2].mapPoints(fArr2);
/* 214 */               matrixArr3[i2].reset();
/* 223 */               matrixArr3[i2].setTranslate(fArr2[0], fArr2[1]);
/* 228 */               matrixArr3[i2].preRotate(f4);
/* 231 */               i2 = i3;
/* 232 */               matrixArr = matrixArr3;
                    }
/* 236 */           Matrix[] matrixArr4 = matrixArr;
/* 238 */           int i4 = 0;
/* 240 */           for (i = 4; i4 < i; i = 4) {
/* 242 */               OioiioI1 oioiioI13 = oioiioI1Arr[i4];
/* 244 */               oioiioI13.getClass();
/* 248 */               fArr2[z] = 0.0f;
/* 254 */               fArr2[1] = oioiioI13.I00000oIO;
/* 258 */               matrixArr2[i4].mapPoints(fArr2);
/* 261 */               if (i4 == 0) {
/* 267 */                   path.moveTo(fArr2[z], fArr2[1]);
                        } else {
/* 275 */                   path.lineTo(fArr2[z], fArr2[1]);
                        }
/* 282 */               oioiioI1Arr[i4].I00000oOI(matrixArr2[i4], path);
/* 285 */               if (oi00IilOloo03 != null) {
/* 287 */                   OioiioI1 oioiioI14 = oioiioI1Arr[i4];
/* 289 */                   Matrix matrix = matrixArr2[i4];
/* 293 */                   O1Ooi0 o1Ooi0 = (O1Ooi0) oi00IilOloo03.I00iOIl;
/* 295 */                   BitSet bitSet = o1Ooi0.I00ilI0I1;
/* 297 */                   oioiioI14.getClass();
/* 300 */                   f2 = 0.0f;
/* 304 */                   bitSet.set(i4, z);
/* 307 */                   Oioiio0iO0[] oioiio0iO0Arr = o1Ooi0.I00iiO;
/* 311 */                   oioiioI14.I00000oIO(oioiioI14.I0000oI00);
/* 331 */                   oioiio0iO0Arr[i4] = new Oioi1i1IiO(new ArrayList(oioiioI14.I000II), new Matrix(matrix));
                        } else {
/* 334 */                   f2 = 0.0f;
                        }
/* 338 */               Path path4 = (Path) this.I000OiO;
/* 342 */               OioiioI1 oioiioI15 = (OioiioI1) this.I000II;
/* 344 */               int i5 = i4 + 1;
/* 346 */               int i6 = i5 % 4;
/* 348 */               OioiioI1 oioiioI16 = oioiioI1Arr[i4];
/* 354 */               fArr2[0] = oioiioI16.I00000oOI;
/* 360 */               fArr2[1] = oioiioI16.I0000Il00O;
/* 364 */               matrixArr2[i4].mapPoints(fArr2);
/* 369 */               float[] fArr3 = (float[]) this.I000OOo1O;
/* 371 */               OioiioI1 oioiioI17 = oioiioI1Arr[i6];
/* 373 */               oioiioI17.getClass();
/* 376 */               fArr3[0] = f2;
/* 380 */               fArr3[1] = oioiioI17.I00000oIO;
/* 384 */               matrixArr2[i6].mapPoints(fArr3);
/* 393 */               OioiioI1[] oioiioI1Arr2 = oioiioI1Arr;
/* 395 */               Matrix[] matrixArr5 = matrixArr2;
/* 415 */               float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
/* 419 */               OioiioI1 oioiioI18 = oioiioI1Arr2[i4];
/* 425 */               fArr2[0] = oioiioI18.I00000oOI;
/* 430 */               fArr2[1] = oioiioI18.I0000Il00O;
/* 434 */               matrixArr5[i4].mapPoints(fArr2);
/* 437 */               if (i4 == 1 || i4 == 3) {
/* 462 */                   Math.abs(rectF.centerX() - fArr2[0]);
                        } else {
/* 449 */                   Math.abs(rectF.centerY() - fArr2[1]);
                        }
/* 468 */               oioiioI15.I0000O(0.0f, 270.0f, 0.0f);
/* 494 */               (i4 != 1 ? i4 != 2 ? i4 != 3 ? oioOlIlii1il.I000OiO : oioOlIlii1il.I000OOo1O : oioOlIlii1il.I000l1 : oioOlIlii1il.I000iOII).getClass();
/* 498 */               oioiioI15.I0000Il00O(fMax, 0.0f);
/* 501 */               path4.reset();
/* 506 */               oioiioI15.I00000oOI(matrixArr4[i4], path4);
/* 513 */               if (I000O01llI0(path4, i4) || I000O01llI0(path4, i6)) {
/* 532 */                   path4.op(path4, path3, Path.Op.DIFFERENCE);
/* 538 */                   fArr2[0] = 0.0f;
/* 544 */                   fArr2[1] = oioiioI15.I00000oIO;
/* 548 */                   matrixArr4[i4].mapPoints(fArr2);
/* 555 */                   path2.moveTo(fArr2[0], fArr2[1]);
/* 560 */                   oioiioI15.I00000oOI(matrixArr4[i4], path2);
                        } else {
/* 524 */                   oioiioI15.I00000oOI(matrixArr4[i4], path);
                        }
/* 563 */               if (oi00IilOloo0 != null) {
/* 565 */                   Matrix matrix2 = matrixArr4[i4];
/* 567 */                   oi00IilOloo02 = oi00IilOloo0;
/* 571 */                   O1Ooi0 o1Ooi02 = (O1Ooi0) oi00IilOloo02.I00iOIl;
/* 577 */                   z2 = false;
/* 578 */                   o1Ooi02.I00ilI0I1.set(i4 + 4, false);
/* 581 */                   Oioiio0iO0[] oioiio0iO0Arr2 = o1Ooi02.I00iio;
/* 585 */                   oioiioI15.I00000oIO(oioiioI15.I0000oI00);
/* 605 */                   oioiio0iO0Arr2[i4] = new Oioi1i1IiO(new ArrayList(oioiioI15.I000II), new Matrix(matrix2));
                        } else {
/* 608 */                   oi00IilOloo02 = oi00IilOloo0;
/* 610 */                   z2 = false;
                        }
/* 613 */               z = z2;
/* 615 */               oi00IilOloo03 = oi00IilOloo02;
/* 616 */               i4 = i5;
/* 617 */               oioiioI1Arr = oioiioI1Arr2;
/* 619 */               matrixArr2 = matrixArr5;
                    }
/* 624 */           path.close();
/* 627 */           path2.close();
/* 634 */           if (path2.isEmpty()) {
/* 685 */               return;
                    }
/* 638 */           path.op(path2, Path.Op.UNION);
                }

                public void I00000oOI() {
/* 2 */             this.I00000oIO = null;
/* 4 */             this.I00000oOI = null;
/* 8 */             OI110O0 oi110o0 = (OI110O0) this.I0000Il00O;
/* 10 */            oi110o0.I000II();
/* 17 */            ((OI10IIO) this.I000II).I00000oOI();
/* 20 */            this.I0000O = oi110o0;
/* 26 */            ((OI110O0) this.I0000oI00).I000II();
/* 33 */            ((OI110O0) this.I0001Ioi1lo).I000II();
/* 36 */            this.I000O01llI0 = null;
/* 38 */            this.I000OiO = null;
/* 40 */            this.I000iOII = null;
                }

                public void I0000Il00O() {
/* 3 */             Set set = (Set) this.I00000oIO;
/* 5 */             if (set == null || set.isEmpty()) {
/* 55 */                return;
                    }
/* 19 */            Trace.beginSection("Compose:abandons");
                    try {
/* 22 */                Iterator it = set.iterator();
/* 30 */                while (it.hasNext()) {
/* 36 */                    OOooI0ioo1o oOooI0ioo1o = (OOooI0ioo1o) it.next();
/* 38 */                    it.remove();
/* 41 */                    oOooI0ioo1o.I00000oOI();
                        }
                    } finally {
/* 50 */                Trace.endSection();
                    }
                }

                public void I0000O() {
/* 3 */             OI110O0 oi110o0 = (OI110O0) this.I0000Il00O;
/* 7 */             OI110O0 oi110o02 = (OI110O0) this.I0000oI00;
/* 11 */            Set set = (Set) this.I00000oIO;
/* 13 */            if (set == null) {
/* 245 */               return;
                    }
/* 18 */            this.I000OOo1O = null;
/* 22 */            if (oi110o02.I00iiO != 0) {
/* 26 */                Trace.beginSection("Compose:onForgotten");
                        try {
/* 31 */                    OI10IIO oi10iio = (OI10IIO) this.I000O01llI0;
/* 33 */                    int i = oi110o02.I00iiO;
                            while (true) {
                                i--;
/* 38 */                        if (-1 >= i) {
                                    break;
                                }
/* 42 */                        Object obj = oi110o02.I00iOIl[i];
                                try {
/* 46 */                            if (obj instanceof IloI1lO1IiI0) {
/* 51 */                                OOooI0ioo1o oOooI0ioo1o = ((IloI1lO1IiI0) obj).I00000oIO;
/* 53 */                                set.remove(oOooI0ioo1o);
/* 56 */                                oOooI0ioo1o.I0000O();
                                    }
/* 64 */                            if (obj instanceof IOl01lO1) {
/* 66 */                                if (oi10iio == null || !oi10iio.I0000Il00O(obj)) {
/* 84 */                                    ((IOl01lO1) obj).I0000Il00O();
                                        } else {
/* 77 */                                    ((IOl01lO1) obj).I00000oOI();
                                        }
                                    }
                                } catch (Throwable th) {
/* 92 */                            IOlIO1I0OloO iOlIO1I0OloO = (IOlIO1I0OloO) this.I00000oOI;
/* 94 */                            if (iOlIO1I0OloO != null) {
/* 96 */                                iOlIO1I0OloO.I00000oIO(obj, th);
                                    }
/* 99 */                            throw th;
                                }
                            }
                        } finally {
                        }
                    }
/* 111 */           if (oi110o0.I00iiO != 0) {
/* 115 */               Trace.beginSection("Compose:onRemembered");
                        try {
/* 120 */                   Set set2 = (Set) this.I00000oIO;
/* 122 */                   if (set2 != null) {
/* 125 */                       Object[] objArr = oi110o0.I00iOIl;
/* 127 */                       int i2 = oi110o0.I00iiO;
/* 130 */                       for (int i3 = 0; i3 < i2; i3++) {
/* 134 */                           IloI1lO1IiI0 iloI1lO1IiI0 = (IloI1lO1IiI0) objArr[i3];
/* 136 */                           OOooI0ioo1o oOooI0ioo1o2 = iloI1lO1IiI0.I00000oIO;
/* 138 */                           set2.remove(oOooI0ioo1o2);
                                    try {
/* 141 */                               oOooI0ioo1o2.I0000oI00();
                                    } catch (Throwable th2) {
/* 150 */                               IOlIO1I0OloO iOlIO1I0OloO2 = (IOlIO1I0OloO) this.I00000oOI;
/* 152 */                               if (iOlIO1I0OloO2 != null) {
/* 154 */                                   iOlIO1I0OloO2.I00000oIO(iloI1lO1IiI0, th2);
                                        }
/* 157 */                               throw th2;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }

                public void I0000oI00() {
/* 3 */             OI110O0 oi110o0 = (OI110O0) this.I0001Ioi1lo;
/* 7 */             if (oi110o0.I00iiO != 0) {
/* 11 */                Trace.beginSection("Compose:sideeffects");
                        try {
/* 14 */                    Object[] objArr = oi110o0.I00iOIl;
/* 16 */                    int i = oi110o0.I00iiO;
/* 19 */                    for (int i2 = 0; i2 < i; i2++) {
/* 25 */                        ((IllOOo00lI) objArr[i2]).invoke();
                            }
/* 31 */                    oi110o0.I000II();
                        } finally {
/* 39 */                    Trace.endSection();
                        }
                    }
                }

                public void I0001Ioi1lo(IloI1lO1IiI0 iloI1lO1IiI0) {
/* 3 */             OI110O0 oi110o0 = (OI110O0) this.I0000Il00O;
/* 13 */            if (!((OI10IIO) this.I000II).I0000Il00O(iloI1lO1IiI0)) {
/* 57 */                OI10IIO oi10iio = (OI10IIO) this.I000OOo1O;
/* 59 */                if (oi10iio == null || !oi10iio.I0000Il00O(iloI1lO1IiI0)) {
/* 73 */                    ((OI110O0) this.I0000oI00).I00000oOI(iloI1lO1IiI0);
/* 77 */                    return;
                        }
/* 68 */                return;
                    }
/* 19 */            ((OI10IIO) this.I000II).I000l1(iloI1lO1IiI0);
/* 30 */            if (!((OI110O0) this.I0000O).I000iOII(iloI1lO1IiI0) && !oi110o0.I000iOII(iloI1lO1IiI0)) {
/* 39 */                I000II(iloI1lO1IiI0, oi110o0);
                    }
/* 44 */            Set set = (Set) this.I00000oIO;
/* 46 */            if (set == null) {
/* 68 */                return;
                    }
/* 51 */            set.add(iloI1lO1IiI0.I00000oIO);
                }

                public boolean I000O01llI0(Path path, int i) {
/* 3 */             Path path2 = (Path) this.I000iOII;
/* 5 */             path2.reset();
/* 20 */            ((OioiioI1[]) this.I00000oIO)[i].I00000oOI(((Matrix[]) this.I00000oOI)[i], path2);
/* 25 */            RectF rectF = new RectF();
/* 29 */            path.computeBounds(rectF, true);
/* 32 */            path2.computeBounds(rectF, true);
/* 37 */            path.op(path2, Path.Op.INTERSECT);
/* 40 */            path.computeBounds(rectF, true);
                    return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
                }

                public void I000OOo1O(Set set, IOlIO1I0OloO iOlIO1I0OloO) {
/* 1 */             I00000oOI();
/* 4 */             this.I00000oIO = set;
/* 6 */             this.I00000oOI = iOlIO1I0OloO;
                }

                public iOl1111iO I000OiO() {
/* 3 */             iOl1111iO iol1111io = new iOl1111iO();
/* 10 */            iol1111io.I00000oIO = (String) this.I00000oIO;
/* 16 */            iol1111io.I00000oOI = (String) this.I00000oOI;
/* 22 */            iol1111io.I0000Il00O = (String) this.I0000Il00O;
/* 28 */            iol1111io.I0000O = (String) this.I0000O;
/* 34 */            iol1111io.I0000oI00 = (lIil0l010OO) this.I0000oI00;
/* 40 */            iol1111io.I0001Ioi1lo = (String) this.I0001Ioi1lo;
/* 46 */            iol1111io.I000II = (Boolean) this.I000II;
/* 52 */            iol1111io.I000O01llI0 = (Boolean) this.I000O01llI0;
/* 58 */            iol1111io.I000OOo1O = (Boolean) this.I000OOo1O;
/* 64 */            iol1111io.I000OiO = (Integer) this.I000OiO;
/* 70 */            iol1111io.I000iOII = (Integer) this.I000iOII;
/* 72 */            VarHandle.storeStoreFence();
/* 110 */           return iol1111io;
                }
            }
