            package p000;

            import android.graphics.Paint;
            import android.graphics.Shader;
            import java.lang.invoke.VarHandle;
            
            public final class IIolilIo implements IilloIOOO0i {
                public final IIolil1 I00iOIl;
                public final IOO000ilo I00iiI;
                public I0oiil10Ili I00iiO;
                public I0oiil10Ili I00iio;

                public IIolilIo() {
/* 6 */             IiIooii iiIooii = IilllIIIIIii.I00000oIO;
/* 8 */             O0iOOoiioO o0iOOoiioO = O0iOOoiioO.I00iOIl;
/* 10 */            IIolil1 iIolil1 = new IIolil1();
/* 13 */            iIolil1.I00000oIO = iiIooii;
/* 15 */            iIolil1.I00000oOI = o0iOOoiioO;
/* 19 */            iIolil1.I0000Il00O = Il00i10O.I00000oIO;
/* 23 */            iIolil1.I0000O = 0L;
/* 25 */            this.I00iOIl = iIolil1;
/* 31 */            IOO000ilo iOO000ilo = new IOO000ilo(9);
/* 34 */            iOO000ilo.I00iio = this;
/* 40 */            IIOOoll iIOOoll = new IIOOoll(8);
/* 43 */            iIOOoll.I00iiI = iOO000ilo;
/* 45 */            VarHandle.storeStoreFence();
/* 48 */            iOO000ilo.I00iiI = iIOOoll;
/* 50 */            VarHandle.storeStoreFence();
/* 53 */            this.I00iiI = iOO000ilo;
                }

                public static I0oiil10Ili I00000oOI(IIolilIo iIolilIo, long j, Iilloo0IOoIo iilloo0IOoIo, float f, int i) {
/* 1 */             I0oiil10Ili i0oiil10IliI0000O = iIolilIo.I0000O(iilloo0IOoIo);
/* 7 */             Paint paint = (Paint) i0oiil10IliI0000O.I00iiO;
/* 13 */            if (f != 1.0f) {
/* 21 */                j = IOOiio0i.I0000Il00O(IOOiio0i.I0000O(j) * f, j);
                    }
/* 27 */            long jI00000oIO = i01l0lil1O0.I00000oIO.I00000oIO(paint);
/* 31 */            int i2 = IOOiio0i.I000oI1ioi;
/* 37 */            if (!Ooi0i1.I00000oOI(jI00000oIO, j)) {
/* 39 */                i0oiil10IliI0000O.I0010o(j);
                    }
/* 47 */            if (((Shader) i0oiil10IliI0000O.I00iio) != null) {
/* 49 */                i0oiil10IliI0000O.I001i1O0Ol(null);
                    }
/* 60 */            if (!O0000Ioio00.I0000O((IOOil0) i0oiil10IliI0000O.I00ilI0I1, null)) {
/* 62 */                i0oiil10IliI0000O.I00111O(null);
                    }
/* 67 */            if (i0oiil10IliI0000O.I00iiI != i) {
/* 70 */                i0oiil10IliI0000O.I0010I0i(i);
                    }
/* 78 */            if (paint.isFilterBitmap()) {
/* 80 */                return i0oiil10IliI0000O;
                    }
/* 81 */            i0oiil10IliI0000O.I001IIilI0O(1);
/* 399 */           return i0oiil10IliI0000O;
                }

                @Override
                public final float I00000oIO() {
/* 5 */             return this.I00iOIl.I00000oIO.I00000oIO();
                }

                public final I0oiil10Ili I0000Il00O(III11l1I iII11l1I, Iilloo0IOoIo iilloo0IOoIo, float f, IOOil0 iOOil0, int i, int i2) {
/* 1 */             I0oiil10Ili i0oiil10IliI0000O = I0000O(iilloo0IOoIo);
/* 7 */             Paint paint = (Paint) i0oiil10IliI0000O.I00iiO;
/* 9 */             if (iII11l1I != null) {
/* 15 */                iII11l1I.I00000oIO(f, I0000oI00(), i0oiil10IliI0000O);
                    } else {
/* 23 */                if (((Shader) i0oiil10IliI0000O.I00iio) != null) {
/* 26 */                    i0oiil10IliI0000O.I001i1O0Ol(null);
                        }
/* 31 */                long jI00000oIO = i01l0lil1O0.I00000oIO.I00000oIO(paint);
/* 35 */                long j = IOOiio0i.I00000oOI;
/* 41 */                if (!Ooi0i1.I00000oOI(jI00000oIO, j)) {
/* 43 */                    i0oiil10IliI0000O.I0010o(j);
                        }
/* 56 */                if (paint.getAlpha() / 255.0f != f) {
/* 59 */                    i0oiil10IliI0000O.I00100l0(f);
                        }
                    }
/* 70 */            if (!O0000Ioio00.I0000O((IOOil0) i0oiil10IliI0000O.I00ilI0I1, iOOil0)) {
/* 72 */                i0oiil10IliI0000O.I00111O(iOOil0);
                    }
/* 77 */            if (i0oiil10IliI0000O.I00iiI != i) {
/* 80 */                i0oiil10IliI0000O.I0010I0i(i);
                    }
/* 87 */            if (paint.isFilterBitmap() == i2) {
/* 89 */                return i0oiil10IliI0000O;
                    }
/* 90 */            i0oiil10IliI0000O.I001IIilI0O(i2);
/* 685 */           return i0oiil10IliI0000O;
                }

                public final I0oiil10Ili I0000O(Iilloo0IOoIo iilloo0IOoIo) {
/* 7 */             if (O0000Ioio00.I0000O(iilloo0IOoIo, IlIl1I110o0I.I00000oIO)) {
/* 9 */                 I0oiil10Ili i0oiil10Ili = this.I00iiO;
/* 11 */                if (i0oiil10Ili != null) {
/* 23 */                    return i0oiil10Ili;
                        }
/* 13 */                I0oiil10Ili i0oiil10IliI00000oIO = iOIlil0Il1i.I00000oIO();
/* 18 */                i0oiil10IliI00000oIO.I001lIiIIo1O(0);
/* 21 */                this.I00iiO = i0oiil10IliI00000oIO;
/* 23 */                return i0oiil10IliI00000oIO;
                    }
/* 26 */            if (!(iilloo0IOoIo instanceof OlOooI0l0011)) {
/* 116 */               I000II.I00000oIO();
/* 119 */               return null;
                    }
/* 28 */            I0oiil10Ili i0oiil10IliI00000oIO2 = this.I00iio;
/* 30 */            if (i0oiil10IliI00000oIO2 == null) {
/* 32 */                i0oiil10IliI00000oIO2 = iOIlil0Il1i.I00000oIO();
/* 37 */                i0oiil10IliI00000oIO2.I001lIiIIo1O(1);
/* 40 */                this.I00iio = i0oiil10IliI00000oIO2;
                    }
/* 44 */            Paint paint = (Paint) i0oiil10IliI00000oIO2.I00iiO;
/* 46 */            float strokeWidth = paint.getStrokeWidth();
/* 50 */            OlOooI0l0011 olOooI0l0011 = (OlOooI0l0011) iilloo0IOoIo;
/* 52 */            I0ol1Ioloo i0ol1Ioloo = olOooI0l0011.I0000oI00;
/* 54 */            float f = olOooI0l0011.I00000oIO;
/* 58 */            if (strokeWidth != f) {
/* 61 */                i0oiil10IliI00000oIO2.I001l0I00(f);
                    }
/* 64 */            int iI000l1 = i0oiil10IliI00000oIO2.I000l1();
/* 68 */            int i = olOooI0l0011.I0000Il00O;
/* 70 */            if (iI000l1 != i) {
/* 73 */                i0oiil10IliI00000oIO2.I001i1lo1io(i);
                    }
/* 76 */            float strokeMiter = paint.getStrokeMiter();
/* 80 */            float f2 = olOooI0l0011.I00000oOI;
/* 84 */            if (strokeMiter != f2) {
/* 87 */                paint.setStrokeMiter(f2);
                    }
/* 90 */            int iI000lI = i0oiil10IliI00000oIO2.I000lI();
/* 94 */            int i2 = olOooI0l0011.I0000O;
/* 96 */            if (iI000lI != i2) {
/* 99 */                i0oiil10IliI00000oIO2.I001iOo1i0O(i2);
                    }
/* 110 */           if (!O0000Ioio00.I0000O((I0ol1Ioloo) i0oiil10IliI00000oIO2.I00ilO0, i0ol1Ioloo)) {
/* 112 */               i0oiil10IliI00000oIO2.I001IO000(i0ol1Ioloo);
                    }
/* 115 */           return i0oiil10IliI00000oIO2;
                }

                @Override
                public final void I0010I0i(long j, long j2, long j3, float f, int i, I0ol1Ioloo i0ol1Ioloo) {
/* 3 */             IIolOo iIolOo = this.I00iOIl.I0000Il00O;
/* 5 */             I0oiil10Ili i0oiil10IliI00000oIO = this.I00iio;
/* 8 */             if (i0oiil10IliI00000oIO == null) {
/* 10 */                i0oiil10IliI00000oIO = iOIlil0Il1i.I00000oIO();
/* 14 */                i0oiil10IliI00000oIO.I001lIiIIo1O(1);
/* 17 */                this.I00iio = i0oiil10IliI00000oIO;
                    }
/* 21 */            Paint paint = (Paint) i0oiil10IliI00000oIO.I00iiO;
/* 25 */            long jI00000oIO = i01l0lil1O0.I00000oIO.I00000oIO(paint);
/* 29 */            int i2 = IOOiio0i.I000oI1ioi;
/* 35 */            if (!Ooi0i1.I00000oOI(jI00000oIO, j)) {
/* 37 */                i0oiil10IliI00000oIO.I0010o(j);
                    }
/* 45 */            if (((Shader) i0oiil10IliI00000oIO.I00iio) != null) {
/* 47 */                i0oiil10IliI00000oIO.I001i1O0Ol(null);
                    }
/* 58 */            if (!O0000Ioio00.I0000O((IOOil0) i0oiil10IliI00000oIO.I00ilI0I1, null)) {
/* 60 */                i0oiil10IliI00000oIO.I00111O(null);
                    }
/* 66 */            if (i0oiil10IliI00000oIO.I00iiI != 3) {
/* 69 */                i0oiil10IliI00000oIO.I0010I0i(3);
                    }
/* 78 */            if (paint.getStrokeWidth() != f) {
/* 81 */                i0oiil10IliI00000oIO.I001l0I00(f);
                    }
/* 92 */            if (paint.getStrokeMiter() != 4.0f) {
/* 95 */                paint.setStrokeMiter(4.0f);
                    }
/* 102 */           if (i0oiil10IliI00000oIO.I000l1() != i) {
/* 105 */               i0oiil10IliI00000oIO.I001i1lo1io(i);
                    }
/* 112 */           if (i0oiil10IliI00000oIO.I000lI() != 0) {
/* 116 */               i0oiil10IliI00000oIO.I001iOo1i0O(0);
                    }
/* 127 */           if (!O0000Ioio00.I0000O((I0ol1Ioloo) i0oiil10IliI00000oIO.I00ilO0, i0ol1Ioloo)) {
/* 129 */               i0oiil10IliI00000oIO.I001IO000(i0ol1Ioloo);
                    }
/* 136 */           if (!paint.isFilterBitmap()) {
/* 143 */               i0oiil10IliI00000oIO.I001IIilI0O(1);
                    }
/* 147 */           iIolOo.I000O01llI0(j2, j3, i0oiil10IliI00000oIO);
                }

                @Override
                public final void I001IO000(I0ol0lI i0ol0lI, III11l1I iII11l1I, float f, Iilloo0IOoIo iilloo0IOoIo, IOOil0 iOOil0, int i) {
/* 16 */            this.I00iOIl.I0000Il00O.I0000O(i0ol0lI, I0000Il00O(iII11l1I, iilloo0IOoIo, f, iOOil0, i, 1));
                }

                @Override
                public final void I001i1O0Ol(long j, long j2, long j3, float f, Iilloo0IOoIo iilloo0IOoIo, int i) {
/* 9 */             int i2 = (int) (j2 >> 32);
/* 20 */            int i3 = (int) (j2 & 4294967295L);
/* 66 */            this.I00iOIl.I0000Il00O.I000OiO(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), I00000oOI(this, j, iilloo0IOoIo, f, i));
                }

                @Override
                public final void I00IlilI0i0i(long j, float f, long j2, Iilloo0IOoIo iilloo0IOoIo) {
/* 15 */            this.I00iOIl.I0000Il00O.I0000Il00O(f, j2, I00000oOI(this, j, iilloo0IOoIo, 1.0f, 3));
                }

                @Override
                public final void I00OOll1(I0oO00o i0oO00o, long j, long j2, long j3, long j4, float f, IOOil0 iOOil0, int i) {
/* 28 */            this.I00iOIl.I0000Il00O.I0000oI00(i0oO00o, j, j2, j3, j4, I0000Il00O(null, IlIl1I110o0I.I00000oIO, f, iOOil0, 3, i));
                }

                @Override
                public final float I00Ol00() {
/* 5 */             return this.I00iOIl.I00000oIO.I00Ol00();
                }

                @Override
                public final void I00i0O(long j, long j2, long j3, long j4, Iilloo0IOoIo iilloo0IOoIo) {
/* 9 */             int i = (int) (j2 >> 32);
/* 21 */            int i2 = (int) (j2 & 4294967295L);
/* 90 */            this.I00iOIl.I0000Il00O.I0001Ioi1lo(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), I00000oOI(this, j, iilloo0IOoIo, 1.0f, 3));
                }

                @Override
                public final void I00i0oil(I0oO00o i0oO00o, long j, float f, IOOil0 iOOil0, int i) {
/* 17 */            this.I00iOIl.I0000Il00O.I000oI1ioi(i0oO00o, j, I0000Il00O(null, IlIl1I110o0I.I00000oIO, f, iOOil0, i, 1));
                }

                @Override
                public final IOO000ilo I00iiI() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final void I00lll10(I0ol0lI i0ol0lI, long j, Iilloo0IOoIo iilloo0IOoIo) {
/* 15 */            this.I00iOIl.I0000Il00O.I0000O(i0ol0lI, I00000oOI(this, j, iilloo0IOoIo, 1.0f, 3));
                }

                @Override
                public final void I00o101lO(III11l1I iII11l1I, long j, long j2, long j3, float f, Iilloo0IOoIo iilloo0IOoIo, IOOil0 iOOil0, int i) {
/* 9 */             int i2 = (int) (j >> 32);
/* 21 */            int i3 = (int) (j & 4294967295L);
/* 95 */            this.I00iOIl.I0000Il00O.I0001Ioi1lo(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), I0000Il00O(iII11l1I, iilloo0IOoIo, f, iOOil0, i, 1));
                }

                @Override
                public final void I00oliIiO01i(III11l1I iII11l1I, long j, long j2, float f, Iilloo0IOoIo iilloo0IOoIo, IOOil0 iOOil0, int i) {
/* 9 */             int i2 = (int) (j >> 32);
/* 20 */            int i3 = (int) (j & 4294967295L);
/* 70 */            this.I00iOIl.I0000Il00O.I000OiO(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), I0000Il00O(iII11l1I, iilloo0IOoIo, f, iOOil0, i, 1));
                }

                @Override
                public final void I00oo1iO0ll(long j, float f, float f2, long j2, long j3, Iilloo0IOoIo iilloo0IOoIo) {
/* 9 */             int i = (int) (j2 >> 32);
/* 21 */            int i2 = (int) (j2 & 4294967295L);
/* 71 */            this.I00iOIl.I0000Il00O.I00111O(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, I00000oOI(this, j, iilloo0IOoIo, 1.0f, 3));
                }

                @Override
                public final O0iOOoiioO getLayoutDirection() {
/* 3 */             return this.I00iOIl.I00000oOI;
                }
            }
