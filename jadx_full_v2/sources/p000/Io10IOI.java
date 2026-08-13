            package p000;

            import android.graphics.Canvas;
            import android.graphics.Outline;
            import android.graphics.Path;
            import android.graphics.RecordingCanvas;
            import android.graphics.RectF;
            import android.graphics.RenderNode;
            import android.os.Build;
            import kotlin.jvm.functions.Function1;
            
            public final class Io10IOI {
                public final Io10OiIIOi0o I00000oIO;
                public Outline I0001Ioi1lo;
                public float I000OiO;
                public l1lOoiII1l I000iOII;
                public I0ol0lI I000l1;
                public I0ol0lI I000lI;
                public boolean I000o00OoI0I;
                public IIolilIo I000oI1ioi;
                public I0oiil10Ili I00100l0;
                public int I00100o1O0lo;
                public boolean I0010o;
                public long I00111O;
                public long I001IIilI0O;
                public int I001IO000;
                public int I001i1O0Ol;
                public int I001i1lo1io;
                public int I001iOo1i0O;
                public long I001l0I00;
                public boolean I001lIiIIo1O;
                public RectF I001lllioOl;
                public IiIooOOOI I00000oOI = IilllIIIIIii.I00000oIO;
                public O0iOOoiioO I0000Il00O = O0iOOoiioO.I00iOIl;
                public Function1 I0000O = I10i1IOOol.I00oI0i;
                public final I10iOo0il1 I0000oI00 = new I10iOo0il1(this, 4);
                public boolean I000II = true;
                public long I000O01llI0 = 0;
                public long I000OOo1O = 9205357640488583168L;
                public final IOI0oloi01 I0010I0i = new IOI0oloi01();

                static {
/* 5 */             O0000Ioio00.I0000O(Build.FINGERPRINT, "robolectric");
                }

                public Io10IOI(Io10OiIIOi0o io10OiIIOi0o) {
/* 4 */             this.I00000oIO = io10OiIIOi0o;
/* 48 */            io10OiIIOi0o.I001i1O0Ol = false;
/* 50 */            io10OiIIOi0o.I00000oIO();
/* 53 */            this.I00111O = 0L;
/* 55 */            this.I001IIilI0O = 0L;
/* 57 */            this.I001l0I00 = 9205357640488583168L;
                }

                public final void I00000oIO() {
/* 3 */             Io10OiIIOi0o io10OiIIOi0o = this.I00000oIO;
/* 5 */             RenderNode renderNode = io10OiIIOi0o.I0000Il00O;
/* 10 */            if (this.I000II) {
/* 12 */                boolean z = this.I001lIiIIo1O;
/* 14 */                if (z || io10OiIIOi0o.I00100l0 > 0.0f) {
/* 40 */                    I0ol0lI i0ol0lI = this.I000l1;
/* 43 */                    if (i0ol0lI != null) {
/* 45 */                        RectF rectF = this.I001lllioOl;
/* 47 */                        if (rectF == null) {
/* 51 */                            rectF = new RectF();
/* 54 */                            this.I001lllioOl = rectF;
                                }
/* 56 */                        boolean z2 = i0ol0lI instanceof I0ol0lI;
/* 60 */                        if (!z2) {
/* 157 */                           OoOil11Ol1o.I000OiO("Unable to obtain android.graphics.Path");
/* 160 */                           return;
                                }
/* 62 */                        Path path = i0ol0lI.I00000oIO;
/* 64 */                        path.computeBounds(rectF, false);
/* 67 */                        Outline outline = this.I0001Ioi1lo;
/* 69 */                        if (outline == null) {
/* 73 */                            outline = new Outline();
/* 76 */                            this.I0001Ioi1lo = outline;
                                }
/* 78 */                        if (!z2) {
/* 153 */                           OoOil11Ol1o.I000OiO("Unable to obtain android.graphics.Path");
/* 156 */                           return;
                                }
/* 80 */                        outline.setPath(path);
/* 87 */                        outline.offset(this.I001IO000, this.I001i1O0Ol);
/* 95 */                        this.I000o00OoI0I = !outline.canClip();
/* 97 */                        this.I000l1 = i0ol0lI;
/* 101 */                       outline.setAlpha(io10OiIIOi0o.I000O01llI0);
/* 108 */                       Math.round(rectF.width());
/* 115 */                       Math.round(rectF.height());
/* 118 */                       renderNode.setOutline(outline);
/* 121 */                       io10OiIIOi0o.I000II = true;
/* 123 */                       io10OiIIOi0o.I00000oIO();
/* 128 */                       if (this.I000o00OoI0I && this.I001lIiIIo1O) {
/* 134 */                           io10OiIIOi0o.I001i1O0Ol = false;
/* 136 */                           io10OiIIOi0o.I00000oIO();
/* 139 */                           renderNode.discardDisplayList();
                                } else {
/* 146 */                           io10OiIIOi0o.I001i1O0Ol = this.I001lIiIIo1O;
/* 148 */                           io10OiIIOi0o.I00000oIO();
                                }
                            } else {
/* 161 */                       io10OiIIOi0o.I001i1O0Ol = z;
/* 163 */                       io10OiIIOi0o.I00000oIO();
/* 166 */                       Outline outline2 = this.I0001Ioi1lo;
/* 168 */                       if (outline2 == null) {
/* 172 */                           outline2 = new Outline();
/* 175 */                           this.I0001Ioi1lo = outline2;
                                }
/* 177 */                       Outline outline3 = outline2;
/* 180 */                       long jI00000oOI = l000O1l.I00000oOI(this.I001IIilI0O);
/* 184 */                       long j = this.I000O01llI0;
/* 186 */                       long j2 = this.I000OOo1O;
/* 199 */                       long j3 = j2 == 9205357640488583168L ? jI00000oOI : j2;
/* 204 */                       int i = (int) (j >> 32);
/* 220 */                       int i2 = (int) (j & 4294967295L);
/* 265 */                       outline3.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2)), this.I000OiO);
/* 270 */                       outline3.setAlpha(io10OiIIOi0o.I000O01llI0);
/* 273 */                       l000O1l.I00000oIO(j3);
/* 276 */                       renderNode.setOutline(outline3);
/* 279 */                       io10OiIIOi0o.I000II = true;
/* 281 */                       io10OiIIOi0o.I00000oIO();
                            }
                        } else {
/* 24 */                    io10OiIIOi0o.I001i1O0Ol = false;
/* 26 */                    io10OiIIOi0o.I00000oIO();
/* 30 */                    renderNode.setOutline(null);
/* 33 */                    io10OiIIOi0o.I000II = false;
/* 35 */                    io10OiIIOi0o.I00000oIO();
                        }
                    }
/* 284 */           this.I000II = false;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI() {
/* 3 */             if (this.I0010o && this.I00100o1O0lo == 0) {
/* 9 */                 IOI0oloi01 iOI0oloi01 = this.I0010I0i;
/* 13 */                Io10IOI io10IOI = (Io10IOI) iOI0oloi01.I00000oOI;
/* 15 */                if (io10IOI != null) {
                            io10IOI.I00100o1O0lo--;
/* 23 */                    io10IOI.I00000oOI();
/* 27 */                    iOI0oloi01.I00000oOI = null;
                        }
/* 31 */                OI10IIO oi10iio = (OI10IIO) iOI0oloi01.I0000O;
/* 33 */                if (oi10iio != null) {
/* 35 */                    Object[] objArr = oi10iio.I00000oOI;
/* 37 */                    long[] jArr = oi10iio.I00000oIO;
                            int length = jArr.length - 2;
/* 42 */                    if (length >= 0) {
/* 45 */                        int i = 0;
                                while (true) {
/* 46 */                            long j = jArr[i];
/* 60 */                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 69 */                                int i2 = 8 - ((~(i - length)) >>> 31);
/* 72 */                                for (int i3 = 0; i3 < i2; i3++) {
/* 81 */                                    if ((255 & j) < 128) {
                                                r11.I00100o1O0lo--;
/* 96 */                                        ((Io10IOI) objArr[(i << 3) + i3]).I00000oOI();
                                            }
/* 99 */                                    j >>= 8;
                                        }
/* 103 */                               if (i2 != 8) {
                                            break;
                                        } else if (i == length) {
                                            break;
                                        } else {
/* 107 */                                   i++;
                                        }
                                    }
                                }
                            }
/* 110 */                   oi10iio.I00000oOI();
                        }
/* 117 */               this.I00000oIO.I0000Il00O.discardDisplayList();
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O(IilloIOOO0i iilloIOOO0i) {
/* 1 */             IOI0oloi01 iOI0oloi01 = this.I0010I0i;
/* 7 */             iOI0oloi01.I0000Il00O = (Io10IOI) iOI0oloi01.I00000oOI;
/* 11 */            OI10IIO oi10iio = (OI10IIO) iOI0oloi01.I0000O;
/* 13 */            if (oi10iio != null && oi10iio.I000O01llI0()) {
/* 23 */                OI10IIO oi10iio2 = (OI10IIO) iOI0oloi01.I0000oI00;
/* 25 */                if (oi10iio2 == null) {
/* 27 */                    OI10IIO oi10iio3 = OiO11lliO.I00000oIO;
/* 31 */                    oi10iio2 = new OI10IIO();
/* 34 */                    iOI0oloi01.I0000oI00 = oi10iio2;
                        }
/* 36 */                oi10iio2.I000OiO(oi10iio);
/* 39 */                oi10iio.I00000oOI();
                    }
/* 43 */            iOI0oloi01.I00000oIO = true;
/* 47 */            this.I0000O.invoke(iilloIOOO0i);
/* 51 */            iOI0oloi01.I00000oIO = false;
/* 55 */            Io10IOI io10IOI = (Io10IOI) iOI0oloi01.I0000Il00O;
/* 57 */            if (io10IOI != null) {
                        io10IOI.I00100o1O0lo--;
/* 65 */                io10IOI.I00000oOI();
                    }
/* 70 */            OI10IIO oi10iio4 = (OI10IIO) iOI0oloi01.I0000oI00;
/* 72 */            if (oi10iio4 == null || !oi10iio4.I000O01llI0()) {
/* 168 */               return;
                    }
/* 80 */            Object[] objArr = oi10iio4.I00000oOI;
/* 82 */            long[] jArr = oi10iio4.I00000oIO;
                    int length = jArr.length - 2;
/* 87 */            if (length >= 0) {
/* 89 */                int i = 0;
                        while (true) {
/* 90 */                    long j = jArr[i];
/* 104 */                   if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 113 */                       int i2 = 8 - ((~(i - length)) >>> 31);
/* 116 */                       for (int i3 = 0; i3 < i2; i3++) {
/* 125 */                           if ((255 & j) < 128) {
                                        r9.I00100o1O0lo--;
/* 140 */                               ((Io10IOI) objArr[(i << 3) + i3]).I00000oOI();
                                    }
/* 143 */                           j >>= 8;
                                }
/* 147 */                       if (i2 != 8) {
                                    break;
                                } else if (i == length) {
                                    break;
                                } else {
/* 151 */                           i++;
                                }
                            }
                        }
                    }
/* 154 */           oi10iio4.I00000oOI();
                }

                public final l1lOoiII1l I0000O() {
                    l1lOoiII1l oIioiIl;
/* 1 */             l1lOoiII1l l1looiii1l = this.I000iOII;
/* 3 */             I0ol0lI i0ol0lI = this.I000l1;
/* 5 */             if (l1looiii1l != null) {
/* 7 */                 return l1looiii1l;
                    }
/* 8 */             if (i0ol0lI != null) {
/* 12 */                OIio1O0ll0I oIio1O0ll0I = new OIio1O0ll0I(i0ol0lI);
/* 15 */                this.I000iOII = oIio1O0ll0I;
/* 17 */                return oIio1O0ll0I;
                    }
/* 20 */            long jI00000oOI = l000O1l.I00000oOI(this.I001IIilI0O);
/* 24 */            long j = this.I000O01llI0;
/* 26 */            long j2 = this.I000OOo1O;
/* 35 */            if (j2 != 9205357640488583168L) {
/* 38 */                jI00000oOI = j2;
                    }
/* 44 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 55 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
/* 66 */            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jI00000oOI >> 32)) + fIntBitsToFloat;
/* 73 */            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jI00000oOI & 4294967295L)) + fIntBitsToFloat2;
/* 80 */            if (this.I000OiO > 0.0f) {
/* 105 */               oIioiIl = new OIiolOlo1iI(lIooiiO1i.I00000oOI(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
                    } else {
/* 118 */               oIioiIl = new OIioiIl(new OOo0IO(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
                    }
/* 121 */           this.I000iOII = oIioiIl;
/* 245 */           return oIioiIl;
                }

                public final void I0000oI00(IiIooOOOI iiIooOOOI, O0iOOoiioO o0iOOoiioO, long j, Function1 function1) {
/* 7 */             if (!IooOl0ol01.I0000Il00O(this.I001IIilI0O, j)) {
/* 9 */                 this.I001IIilI0O = j;
/* 13 */                I000OiO(this.I00111O, j);
/* 25 */                if (this.I000OOo1O == 9205357640488583168L) {
/* 28 */                    this.I000II = true;
/* 30 */                    I00000oIO();
                        }
                    }
/* 33 */            this.I00000oOI = iiIooOOOI;
/* 35 */            this.I0000Il00O = o0iOOoiioO;
/* 37 */            this.I0000O = function1;
/* 39 */            I0001Ioi1lo();
                }

                public final void I0001Ioi1lo() {
/* 1 */             IiIooOOOI iiIooOOOI = this.I00000oOI;
/* 3 */             O0iOOoiioO o0iOOoiioO = this.I0000Il00O;
/* 5 */             Io10OiIIOi0o io10OiIIOi0o = this.I00000oIO;
/* 7 */             IIolilIo iIolilIo = io10OiIIOi0o.I00000oOI;
/* 9 */             RenderNode renderNode = io10OiIIOi0o.I0000Il00O;
/* 11 */            RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
/* 15 */            float f = io10OiIIOi0o.I001i1lo1io;
/* 18 */            float f2 = io10OiIIOi0o.I001iOo1i0O;
/* 40 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
                    try {
/* 41 */                IIoll1I0 iIoll1I0 = io10OiIIOi0o.I00000oIO;
/* 43 */                I0lIooIo1 i0lIooIo1 = iIoll1I0.I00000oIO;
/* 45 */                Canvas canvas = i0lIooIo1.I00000oIO;
/* 47 */                i0lIooIo1.I00000oIO = recordingCanvasBeginRecording;
/* 49 */                IOO000ilo iOO000ilo = iIolilIo.I00iiI;
/* 51 */                iOO000ilo.I00IioO0OiOi(iiIooOOOI);
/* 54 */                iOO000ilo.I00IlilI0i0i(o0iOOoiioO);
/* 57 */                iOO000ilo.I00iiO = this;
/* 61 */                iOO000ilo.I00Io1lO(io10OiIIOi0o.I0000O);
/* 64 */                iOO000ilo.I00IOO(i0lIooIo1);
/* 67 */                float f3 = io10OiIIOi0o.I001i1lo1io;
/* 73 */                I10iOo0il1 i10iOo0il1 = this.I0000oI00;
/* 75 */                if (f3 > 0.0f || io10OiIIOi0o.I001iOo1i0O > 0.0f) {
/* 93 */                    int i = (int) (jFloatToRawIntBits >> 32);
/* 100 */                   int i2 = (int) (jFloatToRawIntBits & 4294967295L);
/* 105 */                   i0lIooIo1.I000o00OoI0I(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
/* 108 */                   i10iOo0il1.invoke(iIolilIo);
/* 121 */                   i0lIooIo1.I000o00OoI0I(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                        } else {
/* 85 */                    i10iOo0il1.invoke(iIolilIo);
                        }
/* 126 */               iIoll1I0.I00000oIO.I00000oIO = canvas;
/* 128 */               renderNode.endRecording();
                    } catch (Throwable th) {
/* 132 */               renderNode.endRecording();
/* 245 */               throw th;
                    }
                }

                public final void I000II(float f) {
/* 1 */             Io10OiIIOi0o io10OiIIOi0o = this.I00000oIO;
/* 7 */             if (io10OiIIOi0o.I000O01llI0 == f) {
/* 9 */                 return;
                    }
/* 10 */            io10OiIIOi0o.I000O01llI0 = f;
/* 14 */            io10OiIIOi0o.I0000Il00O.setAlpha(f);
                }

                public final void I000O01llI0(int i) {
/* 1 */             Io10OiIIOi0o io10OiIIOi0o = this.I00000oIO;
/* 5 */             if (io10OiIIOi0o.I00IO1 == i) {
/* 7 */                 return;
                    }
/* 8 */             io10OiIIOi0o.I00IO1 = i;
/* 10 */            io10OiIIOi0o.I0000Il00O();
                }

                public final void I000OOo1O(long j) {
/* 7 */             if (OIOlIiiioi.I0000O(this.I001l0I00, j)) {
/* 29 */                return;
                    }
/* 9 */             this.I001l0I00 = j;
/* 11 */            Io10OiIIOi0o io10OiIIOi0o = this.I00000oIO;
/* 13 */            io10OiIIOi0o.I000iOII = j;
/* 15 */            io10OiIIOi0o.I0000O();
                }

                public final void I000OiO(long j, long j2) {
/* 13 */            Io10OiIIOi0o io10OiIIOi0o = this.I00000oIO;
/* 15 */            RenderNode renderNode = io10OiIIOi0o.I0000Il00O;
/* 17 */            io10OiIIOi0o.I00II0Ol1O0l = (int) (j >> 32);
/* 19 */            io10OiIIOi0o.I00II0oii1o = (int) (j & 4294967295L);
/* 27 */            boolean zI00000oOI = Ol0i1I.I00000oOI(io10OiIIOi0o.I0000O, l000O1l.I00000oOI(j2));
/* 35 */            io10OiIIOi0o.I0000O = l000O1l.I00000oOI(j2);
/* 37 */            io10OiIIOi0o.I0000oI00();
/* 40 */            if (zI00000oOI || !OIOlIiiioi.I0000O(io10OiIIOi0o.I000iOII, 9205357640488583168L)) {
/* 106 */               return;
                    }
/* 66 */            renderNode.setPivotX((((int) (j2 >> 32)) / 2.0f) + io10OiIIOi0o.I001i1lo1io);
/* 77 */            renderNode.setPivotY((((int) (j2 & 4294967295L)) / 2.0f) + io10OiIIOi0o.I001iOo1i0O);
                }

                public final void I000iOII(float f, long j, long j2) {
/* 1 */             float f2 = this.I001IO000;
/* 4 */             float f3 = this.I001i1O0Ol;
/* 27 */            long jI000II = OIOlIiiioi.I000II(j, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
/* 37 */            if (OIOlIiiioi.I0000O(this.I000O01llI0, jI000II) && Ol0i1I.I00000oOI(this.I000OOo1O, j2) && this.I000OiO == f && this.I000l1 == null) {
/* 58 */                return;
                    }
/* 60 */            this.I000iOII = null;
/* 62 */            this.I000l1 = null;
/* 65 */            this.I000II = true;
/* 68 */            this.I000o00OoI0I = false;
/* 70 */            this.I000O01llI0 = jI000II;
/* 72 */            this.I000OOo1O = j2;
/* 74 */            this.I000OiO = f;
/* 76 */            I00000oIO();
                }
            }
