            package p000;

            import android.view.ViewParent;
            import java.lang.invoke.VarHandle;
            
            public final class Io10OIiiOll implements OIlIooO {
                public Io10IOI I00iOIl;
                public final Io10IIII I00iiI;
                public final I0lio1O01i01 I00iiO;
                public IlliIl1l11O I00iio;
                public IllOOo00lI I00ilI0I1;
                public boolean I00io1l;
                public float[] I00l0I0l0lO1;
                public boolean I00l0OO0IO;
                public int I00lll10;
                public l1lOoiII1l I00o0l1o1o0;
                public boolean I00o101lO;
                public boolean I00oI0i;
                public boolean I00oIiI10;
                public final Iil1olo I00oO101o;
                public long I00ilO0 = 9223372034707292159L;
                public final float[] I00ioIO = O1i010l1l.I00000oOI();
                public IiIooOOOI I00li1OI = il0oI1oIi.I00000oIO(1.0f, 1.0f);
                public O0iOOoiioO I00ll1 = O0iOOoiioO.I00iOIl;
                public final IIolilIo I00lli11 = new IIolilIo();
                public long I00o0iI0io1 = OoI0l01O.I00000oOI;
                public boolean I00oII = true;

                public Io10OIiiOll(Io10IOI io10IOI, Io10IIII io10IIII, I0lio1O01i01 i0lio1O01i01, IlliIl1l11O illiIl1l11O, IllOOo00lI illOOo00lI) {
/* 4 */             this.I00iOIl = io10IOI;
/* 6 */             this.I00iiI = io10IIII;
/* 8 */             this.I00iiO = i0lio1O01i01;
/* 10 */            this.I00iio = illiIl1l11O;
/* 12 */            this.I00ilI0I1 = illOOo00lI;
/* 57 */            Iil1olo iil1olo = new Iil1olo(18);
/* 60 */            iil1olo.I00iiI = this;
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            this.I00oO101o = iil1olo;
                }

                public final float[] I00000oIO() {
/* 1 */             float[] fArrI00000oOI = this.I00l0I0l0lO1;
/* 3 */             if (fArrI00000oOI == null) {
/* 5 */                 fArrI00000oOI = O1i010l1l.I00000oOI();
/* 9 */                 this.I00l0I0l0lO1 = fArrI00000oOI;
                    }
/* 15 */            if (this.I00oI0i) {
/* 26 */                this.I00oI0i = false;
/* 28 */                float[] fArrI00000oOI2 = I00000oOI();
/* 34 */                if (this.I00oII) {
/* 36 */                    return fArrI00000oOI2;
                        }
/* 41 */                if (!l00lO1OO0OI.I00000oIO(fArrI00000oOI2, fArrI00000oOI)) {
/* 46 */                    fArrI00000oOI[0] = Float.NaN;
/* 14 */                    return null;
                        }
                    } else if (Float.isNaN(fArrI00000oOI[0])) {
/* 14 */                return null;
                    }
/* 43 */            return fArrI00000oOI;
                }

                public final float[] I00000oOI() {
/* 3 */             boolean z = this.I00o101lO;
/* 5 */             float[] fArr = this.I00ioIO;
/* 7 */             if (z) {
/* 9 */                 Io10IOI io10IOI = this.I00iOIl;
/* 11 */                long jI00000oIO = io10IOI.I001l0I00;
/* 26 */                if ((9223372034707292159L & jI00000oIO) == 9205357640488583168L) {
/* 34 */                    jI00000oIO = lOIi0i0.I00000oIO(l000O1l.I00000oOI(this.I00ilO0));
                        }
/* 43 */                float fIntBitsToFloat = Float.intBitsToFloat((int) (jI00000oIO >> 32));
/* 54 */                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI00000oIO & 4294967295L));
/* 58 */                Io10OiIIOi0o io10OiIIOi0o = io10IOI.I00000oIO;
/* 60 */                float f = io10OiIIOi0o.I000o00OoI0I;
/* 62 */                float f2 = io10OiIIOi0o.I000oI1ioi;
/* 64 */                float f3 = io10OiIIOi0o.I0010o;
/* 66 */                float f4 = io10OiIIOi0o.I00111O;
/* 68 */                float f5 = io10OiIIOi0o.I001IIilI0O;
/* 70 */                float f6 = io10OiIIOi0o.I000l1;
/* 72 */                float f7 = io10OiIIOi0o.I000lI;
/* 80 */                double d = f3 * 0.017453292519943295d;
/* 86 */                float fSin = (float) Math.sin(d);
/* 91 */                float fCos = (float) Math.cos(d);
/* 92 */                float f8 = -fSin;
/* 98 */                float f9 = (f2 * fCos) - (0.0f * fSin);
/* 103 */               float f10 = (0.0f * fCos) + (f2 * fSin);
/* 109 */               double d2 = f4 * 0.017453292519943295d;
/* 118 */               float fSin2 = (float) Math.sin(d2);
/* 123 */               float fCos2 = (float) Math.cos(d2);
/* 124 */               float f11 = -fSin2;
/* 125 */               float f12 = fSin * fSin2;
/* 127 */               float f13 = fSin * fCos2;
/* 128 */               float f14 = fCos * fSin2;
/* 130 */               float f15 = fCos * fCos2;
/* 136 */               float f16 = (f10 * fSin2) + (f * fCos2);
/* 142 */               float f17 = (f10 * fCos2) + ((-f) * fSin2);
/* 146 */               double d3 = f5 * 0.017453292519943295d;
/* 154 */               float fSin3 = (float) Math.sin(d3);
/* 161 */               float fCos3 = (float) Math.cos(d3);
/* 162 */               float f18 = -fSin3;
/* 167 */               float f19 = (fCos3 * f12) + (f18 * fCos2);
/* 183 */               float f20 = ((f12 * fSin3) + (fCos2 * fCos3)) * f6;
/* 184 */               float f21 = fSin3 * fCos * f6;
/* 185 */               float f22 = ((fSin3 * f13) + (fCos3 * f11)) * f6;
/* 186 */               float f23 = f19 * f7;
/* 188 */               float f24 = fCos * fCos3 * f7;
/* 189 */               float f25 = ((fCos3 * f13) + (f18 * f11)) * f7;
/* 193 */               float f26 = f14 * 1.0f;
/* 195 */               float f27 = f8 * 1.0f;
/* 196 */               float f28 = f15 * 1.0f;
/* 202 */               if (fArr.length >= 16) {
/* 205 */                   fArr[0] = f20;
/* 208 */                   fArr[1] = f21;
/* 211 */                   fArr[2] = f22;
/* 214 */                   fArr[3] = 0.0f;
/* 217 */                   fArr[4] = f23;
/* 220 */                   fArr[5] = f24;
/* 223 */                   fArr[6] = f25;
/* 226 */                   fArr[7] = 0.0f;
/* 230 */                   fArr[8] = f26;
/* 234 */                   fArr[9] = f27;
/* 238 */                   fArr[10] = f28;
/* 242 */                   fArr[11] = 0.0f;
/* 244 */                   float f29 = -fIntBitsToFloat;
/* 254 */                   fArr[12] = ((f20 * f29) - (fIntBitsToFloat2 * f23)) + f16 + fIntBitsToFloat;
/* 264 */                   fArr[13] = ((f21 * f29) - (fIntBitsToFloat2 * f24)) + f9 + fIntBitsToFloat2;
/* 274 */                   fArr[14] = ((f29 * f22) - (fIntBitsToFloat2 * f25)) + f17;
/* 278 */                   fArr[15] = 1.0f;
                        }
/* 280 */               this.I00o101lO = false;
/* 286 */               this.I00oII = l1II0lo.I00000oIO(fArr);
                    }
/* 743 */           return fArr;
                }

                public final void I0000Il00O() {
/* 3 */             if (this.I00l0OO0IO || this.I00io1l) {
/* 20 */                return;
                    }
/* 11 */            this.I00iiO.invalidate();
/* 15 */            I0001Ioi1lo(true);
                }

                public final void I0000O(long j) {
/* 1 */             boolean zI000l1 = I0lio1O01i01.I000l1();
/* 5 */             I0lio1O01i01 i0lio1O01i01 = this.I00iiO;
/* 7 */             if (zI000l1) {
/* 11 */                i0lio1O01i01.I00Io1lO(-4.0f);
                    }
/* 14 */            Io10IOI io10IOI = this.I00iOIl;
/* 22 */            if (!IooO0O.I0000Il00O(io10IOI.I00111O, j)) {
/* 24 */                io10IOI.I00111O = j;
/* 28 */                io10IOI.I000OiO(j, io10IOI.I001IIilI0O);
                    }
/* 31 */            ViewParent parent = i0lio1O01i01.getParent();
/* 35 */            if (parent != null) {
/* 37 */                parent.onDescendantInvalidated(i0lio1O01i01, i0lio1O01i01);
                    }
                }

                public final void I0000oI00(long j) {
/* 7 */             if (IooOl0ol01.I0000Il00O(j, this.I00ilO0)) {
/* 29 */                return;
                    }
/* 13 */            if (I0lio1O01i01.I000l1()) {
/* 19 */                this.I00iiO.I00Io1lO(-4.0f);
                    }
/* 22 */            this.I00ilO0 = j;
/* 24 */            I0000Il00O();
                }

                public final void I0001Ioi1lo(boolean z) {
/* 3 */             if (z != this.I00l0OO0IO) {
/* 5 */                 this.I00l0OO0IO = z;
/* 7 */                 I0lio1O01i01 i0lio1O01i01 = this.I00iiO;
/* 9 */                 OI0oiiIO0 oI0oiiIO0 = i0lio1O01i01.I00oo1iO0ll;
/* 11 */                boolean z2 = i0lio1O01i01.I00ooiO1I;
/* 13 */                if (!z) {
/* 15 */                    if (z2) {
/* 77 */                        return;
                            }
/* 17 */                    oI0oiiIO0.I000iOII(this);
/* 20 */                    OI0oiiIO0 oI0oiiIO02 = i0lio1O01i01.I00ooIo0;
/* 22 */                    if (oI0oiiIO02 != null) {
/* 24 */                        oI0oiiIO02.I000iOII(this);
/* 27 */                        return;
                            }
/* 77 */                    return;
                        }
/* 28 */                if (!z2) {
/* 30 */                    oI0oiiIO0.I00000oOI(this);
/* 33 */                    return;
                        }
/* 34 */                OI0oiiIO0 oI0oiiIO03 = i0lio1O01i01.I00ooIo0;
/* 36 */                if (oI0oiiIO03 == null) {
/* 40 */                    oI0oiiIO03 = new OI0oiiIO0();
/* 43 */                    i0lio1O01i01.I00ooIo0 = oI0oiiIO03;
                        }
/* 45 */                oI0oiiIO03.I00000oOI(this);
                    }
                }

                public final void I000II() {
/* 1 */             I0lio1O01i01.I000l1();
/* 6 */             if (this.I00l0OO0IO) {
/* 16 */                if (!OoI0l01O.I00000oOI(this.I00o0iI0io1, OoI0l01O.I00000oOI) && !IooOl0ol01.I0000Il00O(this.I00iOIl.I001IIilI0O, this.I00ilO0)) {
/* 30 */                    Io10IOI io10IOI = this.I00iOIl;
/* 45 */                    float fI0000Il00O = OoI0l01O.I0000Il00O(this.I00o0iI0io1) * ((int) (this.I00ilO0 >> 32));
/* 62 */                    float fI0000O = OoI0l01O.I0000O(this.I00o0iI0io1) * ((int) (this.I00ilO0 & 4294967295L));
/* 77 */                    io10IOI.I000OOo1O((Float.floatToRawIntBits(fI0000O) & 4294967295L) | (Float.floatToRawIntBits(fI0000Il00O) << 32));
                        }
/* 90 */                this.I00iOIl.I0000oI00(this.I00li1OI, this.I00ll1, this.I00ilO0, this.I00oO101o);
/* 94 */                I0001Ioi1lo(false);
                    }
                }
            }
