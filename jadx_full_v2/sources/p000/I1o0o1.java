            package p000;

            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.PorterDuff;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.segmentation.subject.SubjectSegmentationResult;
            import com.google.mlkit.vision.segmentation.subject.SubjectSegmenter;
            import java.lang.invoke.VarHandle;
            import java.nio.FloatBuffer;
            
/* 15 */    public final class I1o0o1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 2;
                public int I00iiI;
                public final boolean I00iiO;
                public Object I00iio;
                public final Object I00ilI0I1;
                public final Object I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1o0o1(I10i01 i10i01, boolean z, I110IiI0o1Il i110IiI0o1Il, IllOOo00lI illOOo00lI, IOoil1iiIilo iOoil1iiIilo) {
/* 13 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iio = i10i01;
/* 6 */             this.I00iiO = z;
/* 8 */             this.I00ilI0I1 = i110IiI0o1Il;
/* 10 */            this.I00ilO0 = illOOo00lI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             boolean z = this.I00iiO;
/* 5 */             Object obj2 = this.I00ilO0;
/* 7 */             Object obj3 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 70 */                    return new I1o0o1((I1o1Ii0I) obj2, (Bitmap) obj3, z, iOoil1iiIilo);
                        case 1:
/* 59 */                    return new I1o0o1(this.I00iiO, (O0lOll0I0o00) this.I00iio, (IlIoO1ilo1) obj3, (Io10IOI) obj2, iOoil1iiIilo);
                        case 2:
/* 38 */                    return new I1o0o1((I10i01) this.I00iio, this.I00iiO, (I110IiI0o1Il) obj3, (IllOOo00lI) obj2, iOoil1iiIilo);
                        default:
/* 18 */                    return new I1o0o1((OI10i0Il) obj3, z, (OI0lOIiOIOOo) obj2, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((I1o0o1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
                
                    if (r0 == r10) goto L55;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:96:0x0253, code lost:
                
                    if (r1 == r0) goto L97;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Bitmap bitmapCreateScaledBitmap;
                    Object objI0010I0i;
                    Object objI00000oIO;
                    Object objI00000oIO2;
/* 8 */             int i = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 266 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 268 */                   int i2 = this.I00iiI;
/* 270 */                   if (i2 == 0) {
/* 299 */                       lIoii1l01l0i.I00000oOI(obj);
/* 308 */                       if (!((I1o1Ii0I) this.I00ilO0).I0000oI00) {
/* 608 */                           I000II.I001IO000("Model not ready");
/* 13 */                            return null;
                                }
/* 312 */                       I1o1Ii0I i1o1Ii0I = (I1o1Ii0I) this.I00ilO0;
/* 316 */                       Bitmap bitmap = (Bitmap) this.I00ilI0I1;
/* 318 */                       i1o1Ii0I.getClass();
/* 329 */                       int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
/* 335 */                       if (iMax > 1024) {
/* 340 */                           float f = 1024.0f / iMax;
/* 355 */                           bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * f), true);
                                } else {
/* 360 */                           bitmapCreateScaledBitmap = bitmap;
                                }
/* 377 */                       OloIIoII1oo oloIIoII1ooProcess = ((SubjectSegmenter) ((I1o1Ii0I) this.I00ilO0).I0000O.getValue()).process(InputImage.fromBitmap(bitmapCreateScaledBitmap, 0));
/* 381 */                       this.I00iio = bitmapCreateScaledBitmap;
/* 383 */                       this.I00iiI = 1;
/* 391 */                       IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(this));
/* 394 */                       iIoOoIol0Io0.I00111O();
/* 399 */                       I1o1O0loII0 i1o1O0loII0 = new I1o1O0loII0(i);
/* 402 */                       i1o1O0loII0.I00iiI = iIoOoIol0Io0;
/* 404 */                       VarHandle.storeStoreFence();
/* 418 */                       ((o0IiOl) oloIIoII1ooProcess).I0000oI00(OloIo0oOIO0.I00000oIO, new I0IIiO0iI(i1o1O0loII0, 3));
/* 423 */                       Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 426 */                       oi00IilOloo0.I00iOIl = iIoOoIol0Io0;
/* 428 */                       VarHandle.storeStoreFence();
/* 431 */                       oloIIoII1ooProcess.I0000Il00O(oi00IilOloo0);
/* 434 */                       objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 438 */                       if (objI0010I0i != ii0111o) {
                                }
/* 598 */                       return ii0111o;
                            }
/* 272 */                   if (i2 != 1) {
/* 274 */                       if (i2 != 2) {
/* 283 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 276 */                       lIoii1l01l0i.I00000oOI(obj);
/* 279 */                       objI00000oIO = obj;
/* 601 */                       return (Bitmap) objI00000oIO;
                            }
/* 290 */                   bitmapCreateScaledBitmap = (Bitmap) this.I00iio;
/* 292 */                   lIoii1l01l0i.I00000oOI(obj);
/* 295 */                   objI0010I0i = obj;
/* 442 */                   SubjectSegmentationResult subjectSegmentationResult = (SubjectSegmentationResult) objI0010I0i;
/* 448 */                   ((I1o1Ii0I) this.I00ilO0).getClass();
/* 451 */                   int width = bitmapCreateScaledBitmap.getWidth();
/* 455 */                   int height = bitmapCreateScaledBitmap.getHeight();
/* 461 */                   Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
/* 467 */                   Canvas canvas = new Canvas(bitmapCreateBitmap);
/* 472 */                   canvas.drawColor(0, PorterDuff.Mode.CLEAR);
/* 475 */                   FloatBuffer foregroundConfidenceMask = subjectSegmentationResult.getForegroundConfidenceMask();
/* 479 */                   if (foregroundConfidenceMask != null) {
/* 481 */                       foregroundConfidenceMask.rewind();
/* 484 */                       int i3 = width * height;
/* 486 */                       int[] iArr = new int[i3];
/* 489 */                       for (int i4 = 0; i4 < i3; i4++) {
/* 511 */                           iArr[i4] = foregroundConfidenceMask.get() > 0.5f ? bitmapCreateScaledBitmap.getPixel(i4 % width, i4 / width) : 0;
                                }
/* 520 */                       Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iArr, width, height, Bitmap.Config.ARGB_8888);
/* 529 */                       canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, new Paint(1));
/* 532 */                       bitmapCreateBitmap2.recycle();
                            } else {
/* 536 */                       Bitmap foregroundBitmap = subjectSegmentationResult.getForegroundBitmap();
/* 540 */                       if (foregroundBitmap != null) {
/* 547 */                           canvas.drawBitmap(foregroundBitmap, 0.0f, 0.0f, new Paint(1));
                                }
                            }
/* 552 */                   Bitmap bitmap2 = (Bitmap) this.I00ilI0I1;
/* 554 */                   if (bitmapCreateScaledBitmap != bitmap2) {
/* 568 */                       Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmap2.getWidth(), ((Bitmap) this.I00ilI0I1).getHeight(), true);
/* 572 */                       bitmapCreateBitmap.recycle();
/* 575 */                       bitmapCreateScaledBitmap.recycle();
/* 578 */                       bitmapCreateBitmap = bitmapCreateScaledBitmap2;
                            }
/* 581 */                   if (!this.I00iiO) {
/* 604 */                       return bitmapCreateBitmap;
                            }
/* 585 */                   I1o1Ii0I i1o1Ii0I2 = (I1o1Ii0I) this.I00ilO0;
/* 587 */                   this.I00iio = null;
/* 590 */                   this.I00iiI = 2;
/* 592 */                   objI00000oIO = i1o1Ii0I2.I00000oIO(bitmapCreateBitmap, this);
                            break;
                        case 1:
/* 155 */                   O0lOll0I0o00 o0lOll0I0o00 = (O0lOll0I0o00) this.I00iio;
/* 157 */                   OIooliIO0 oIooliIO0 = o0lOll0I0o00.I000OOo1O;
/* 159 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 161 */                   int i5 = this.I00iiI;
                            try {
/* 163 */                       if (i5 == 0) {
/* 185 */                           lIoii1l01l0i.I00000oOI(obj);
/* 190 */                           if (this.I00iiO) {
/* 192 */                               I10i01 i10i01 = o0lOll0I0o00.I00100o1O0lo;
/* 196 */                               Float f2 = new Float(0.0f);
/* 199 */                               this.I00iiI = 1;
/* 205 */                               if (i10i01.I0001Ioi1lo(this, f2) == ii0111o2) {
                                        }
/* 248 */                               return ii0111o2;
                                    }
                                } else {
/* 165 */                           if (i5 != 1) {
/* 167 */                               if (i5 != 2) {
/* 177 */                                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                    return null;
                                        }
/* 169 */                               lIoii1l01l0i.I00000oOI(obj);
/* 172 */                               objI00000oIO2 = obj;
/* 254 */                               oIooliIO0.setValue(Boolean.FALSE);
/* 257 */                               return OoiIlOl1iI.I00000oIO;
                                    }
/* 181 */                           lIoii1l01l0i.I00000oOI(obj);
                                }
/* 208 */                       I10i01 i10i012 = o0lOll0I0o00.I00100o1O0lo;
/* 212 */                       Float f3 = new Float(1.0f);
/* 217 */                       IlIoO1ilo1 ilIoO1ilo1 = (IlIoO1ilo1) this.I00ilI0I1;
/* 221 */                       Io10IOI io10IOI = (Io10IOI) this.I00ilO0;
/* 226 */                       O0lOli0IIoo o0lOli0IIoo = new O0lOli0IIoo(i);
/* 229 */                       o0lOli0IIoo.I00iiI = io10IOI;
/* 231 */                       o0lOli0IIoo.I00iiO = o0lOll0I0o00;
/* 233 */                       VarHandle.storeStoreFence();
/* 236 */                       this.I00iiI = 2;
/* 242 */                       objI00000oIO2 = I10i01.I00000oIO(i10i012, f3, ilIoO1ilo1, null, o0lOli0IIoo, this, 4);
                                break;
                            } catch (Throwable th) {
/* 262 */                       oIooliIO0.setValue(Boolean.FALSE);
/* 265 */                       throw th;
                            }
                        case 2:
/* 91 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 93 */                    int i6 = this.I00iiI;
/* 95 */                    if (i6 == 0) {
/* 107 */                       lIoii1l01l0i.I00000oOI(obj);
/* 112 */                       I10i01 i10i013 = (I10i01) this.I00iio;
/* 122 */                       Float f4 = new Float(this.I00iiO ? 1.0f : 0.0f);
/* 127 */                       I110IiI0o1Il i110IiI0o1Il = (I110IiI0o1Il) this.I00ilI0I1;
/* 129 */                       this.I00iiI = 1;
/* 139 */                       if (I10i01.I00000oIO(i10i013, f4, i110IiI0o1Il, null, null, this, 12) == ii0111o3) {
/* 141 */                           return ii0111o3;
                                }
                            } else {
/* 97 */                        if (i6 != 1) {
/* 103 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 99 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 147 */                   ((IllOOo00lI) this.I00ilO0).invoke();
/* 150 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 19 */                    OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilI0I1;
/* 21 */                    Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 23 */                    int i7 = this.I00iiI;
/* 25 */                    if (i7 == 0) {
/* 41 */                        lIoii1l01l0i.I00000oOI(obj);
/* 48 */                        OOIII1oOoolO oOIII1oOoolO = (OOIII1oOoolO) oI10i0Il.getValue();
/* 50 */                        if (oOIII1oOoolO != null) {
/* 52 */                            boolean z = this.I00iiO;
/* 56 */                            OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) this.I00ilO0;
/* 68 */                            IooiIloo0i oOIIIiOOili = z ? new OOIIIiOOili(oOIII1oOoolO) : new OOIII1l(oOIII1oOoolO);
/* 71 */                            if (oI0lOIiOIOOo != null) {
/* 73 */                                this.I00iio = oI10i0Il;
/* 75 */                                this.I00iiI = 1;
/* 81 */                                if (oI0lOIiOIOOo.I00000oIO(oOIIIiOOili, this) == ii0111o4) {
/* 83 */                                    return ii0111o4;
                                        }
                                    }
                                }
/* 88 */                        return OoiIlOl1iI.I00000oIO;
                            }
/* 27 */                    if (i7 != 1) {
/* 37 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 31 */                    oI10i0Il = (OI10i0Il) this.I00iio;
/* 33 */                    lIoii1l01l0i.I00000oOI(obj);
/* 85 */                    oI10i0Il.setValue(null);
/* 88 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public I1o0o1(I1o1Ii0I i1o1Ii0I, Bitmap bitmap, boolean z, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 17 */            this.I00ilO0 = i1o1Ii0I;
                    this.I00ilI0I1 = bitmap;
                    this.I00iiO = z;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public I1o0o1(OI10i0Il oI10i0Il, boolean z, OI0lOIiOIOOo oI0lOIiOIOOo, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 18 */            this.I00ilI0I1 = oI10i0Il;
                    this.I00iiO = z;
                    this.I00ilO0 = oI0lOIiOIOOo;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public I1o0o1(boolean z, O0lOll0I0o00 o0lOll0I0o00, IlIoO1ilo1 ilIoO1ilo1, Io10IOI io10IOI, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 19 */            this.I00iiO = z;
                    this.I00iio = o0lOll0I0o00;
                    this.I00ilI0I1 = ilIoO1ilo1;
                    this.I00ilO0 = io10IOI;
                }
            }
