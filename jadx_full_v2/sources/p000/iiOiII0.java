            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iiOiII0 {
                public static IOOl0ll I00000oIO(IOOl0ll iOOl0ll) {
/* 12 */            if (iiO1i0O.I00000oIO(iOOl0ll.I00000oOI, 12884901888L)) {
/* 15 */                Oi1IOl oi1IOl = (Oi1IOl) iOOl0ll;
/* 17 */                i001lolI1I i001loli1i = oi1IOl.I0000O;
/* 19 */                i001lolI1I i001loli1i2 = iIo1Iiloo.I00000oOI;
/* 25 */                if (!I0000Il00O(i001loli1i, i001loli1i2)) {
/* 67 */                    return new Oi1IOl(oi1IOl.I00000oIO, oi1IOl.I000O01llI0, i001loli1i2, I0001Ioi1lo(I00000oOI(I0IiO0lO.I0000Il00O.I00000oOI, i001loli1i.I00000oIO(), i001loli1i2.I00000oIO()), oi1IOl.I000OOo1O), oi1IOl.I000iOII, oi1IOl.I000o00OoI0I, oi1IOl.I0000oI00, oi1IOl.I0001Ioi1lo, oi1IOl.I000II, -1);
                        }
                    }
/* 77 */            return iOOl0ll;
                }

                public static final float[] I00000oOI(float[] fArr, float[] fArr2, float[] fArr3) {
/* 5 */             I000II(fArr, fArr2);
/* 8 */             I000II(fArr, fArr3);
/* 30 */            float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
/* 38 */            float[] fArrI0000oI00 = I0000oI00(fArr);
/* 42 */            float f = fArr4[0];
/* 46 */            float f2 = fArr[0] * f;
/* 47 */            float f3 = fArr4[1];
/* 51 */            float f4 = fArr[1] * f3;
/* 52 */            float f5 = fArr4[2];
/* 108 */           return I0001Ioi1lo(fArrI0000oI00, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
                }

                public static final boolean I0000Il00O(i001lolI1I i001loli1i, i001lolI1I i001loli1i2) {
/* 2 */             if (i001loli1i == i001loli1i2) {
/* 1 */                 return true;
                    }
                    return Math.abs(i001loli1i.I00000oIO - i001loli1i2.I00000oIO) < 0.001f && Math.abs(i001loli1i.I00000oOI - i001loli1i2.I00000oOI) < 0.001f;
                }

                public static final IOlooIIIi I0000O(IOOl0ll iOOl0ll, IOOl0ll iOOl0ll2) {
                    float[] fArrI0001Ioi1lo;
/* 1 */             if (iOOl0ll == iOOl0ll2) {
/* 6 */                 return new IOlolOoii(iOOl0ll, iOOl0ll, 1);
                    }
/* 21 */            if (!iiO1i0O.I00000oIO(iOOl0ll.I00000oOI, 12884901888L) || !iiO1i0O.I00000oIO(iOOl0ll2.I00000oOI, 12884901888L)) {
/* 136 */               return new IOlooIIIi(iOOl0ll, iOOl0ll2, 0);
                    }
/* 33 */            Oi1IOl oi1IOl = (Oi1IOl) iOOl0ll;
/* 35 */            Oi1IOl oi1IOl2 = (Oi1IOl) iOOl0ll2;
/* 38 */            IOloliIo iOloliIo = new IOloliIo(oi1IOl2, oi1IOl, oi1IOl2, null);
/* 41 */            iOloliIo.I0000oI00 = oi1IOl;
/* 43 */            iOloliIo.I0001Ioi1lo = oi1IOl2;
/* 47 */            float[] fArr = I0IiO0lO.I0000Il00O.I00000oOI;
/* 49 */            i001lolI1I i001loli1i = oi1IOl.I0000O;
/* 51 */            float[] fArrI0001Ioi1lo2 = oi1IOl.I000OOo1O;
/* 53 */            i001lolI1I i001loli1i2 = oi1IOl2.I0000O;
/* 55 */            float[] fArrI0000oI00 = oi1IOl2.I000OiO;
/* 61 */            if (I0000Il00O(i001loli1i, i001loli1i2)) {
/* 63 */                fArrI0001Ioi1lo = I0001Ioi1lo(fArrI0000oI00, fArrI0001Ioi1lo2);
                    } else {
/* 68 */                float[] fArrI00000oIO = i001loli1i.I00000oIO();
/* 72 */                float[] fArrI00000oIO2 = i001loli1i2.I00000oIO();
/* 76 */                i001lolI1I i001loli1i3 = iIo1Iiloo.I00000oOI;
/* 83 */                if (!I0000Il00O(i001loli1i, i001loli1i3)) {
/* 94 */                    fArrI0001Ioi1lo2 = I0001Ioi1lo(I00000oOI(fArr, fArrI00000oIO, new float[]{0.964212f, 1.0f, 0.825188f}), fArrI0001Ioi1lo2);
                        }
/* 102 */               if (!I0000Il00O(i001loli1i2, i001loli1i3)) {
/* 119 */                   fArrI0000oI00 = I0000oI00(I0001Ioi1lo(I00000oOI(fArr, fArrI00000oIO2, new float[]{0.964212f, 1.0f, 0.825188f}), oi1IOl2.I000OOo1O));
                        }
/* 123 */               fArrI0001Ioi1lo = I0001Ioi1lo(fArrI0000oI00, fArrI0001Ioi1lo2);
                    }
/* 127 */           iOloliIo.I000II = fArrI0001Ioi1lo;
/* 129 */           VarHandle.storeStoreFence();
/* 132 */           return iOloliIo;
                }

                public static final float[] I0000oI00(float[] fArr) {
/* 4 */             float f = fArr[0];
/* 7 */             float f2 = fArr[3];
/* 10 */            float f3 = fArr[6];
/* 13 */            float f4 = fArr[1];
/* 16 */            float f5 = fArr[4];
/* 19 */            float f6 = fArr[7];
/* 22 */            float f7 = fArr[2];
/* 25 */            float f8 = fArr[5];
/* 29 */            float f9 = fArr[8];
/* 35 */            float f10 = (f5 * f9) - (f6 * f8);
/* 41 */            float f11 = (f6 * f7) - (f4 * f9);
/* 47 */            float f12 = (f4 * f8) - (f5 * f7);
/* 57 */            float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
/* 60 */            float[] fArr2 = new float[fArr.length];
/* 64 */            fArr2[0] = f10 / f13;
/* 68 */            fArr2[1] = f11 / f13;
/* 72 */            fArr2[2] = f12 / f13;
/* 81 */            fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
/* 91 */            fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
/* 100 */           fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
/* 109 */           fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
/* 116 */           fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
/* 123 */           fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
/* 168 */           return fArr2;
                }

                public static final float[] I0001Ioi1lo(float[] fArr, float[] fArr2) {
/* 7 */             float[] fArr3 = new float[9];
/* 10 */            if (fArr.length < 9 || fArr2.length < 9) {
/* 16 */                return fArr3;
                    }
/* 22 */            float f = fArr[0] * fArr2[0];
/* 24 */            float f2 = fArr[3];
/* 27 */            float f3 = fArr2[1];
/* 33 */            float f4 = fArr[6];
/* 36 */            float f5 = fArr2[2];
/* 41 */            fArr3[0] = (f4 * f5) + (f2 * f3) + f;
/* 43 */            float f6 = fArr[1];
/* 45 */            float f7 = fArr2[0];
/* 49 */            float f8 = fArr[4];
/* 54 */            float f9 = fArr[7];
/* 56 */            float f10 = f9 * f5;
/* 60 */            fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
/* 64 */            float f11 = fArr[2] * f7;
/* 66 */            float f12 = fArr[5];
/* 72 */            float f13 = (fArr2[1] * f12) + f11;
/* 76 */            float f14 = fArr[8];
/* 82 */            fArr3[2] = (f5 * f14) + f13;
/* 84 */            float f15 = fArr[0];
/* 88 */            float f16 = fArr2[3] * f15;
/* 89 */            float f17 = fArr2[4];
/* 93 */            float f18 = (f2 * f17) + f16;
/* 94 */            float f19 = fArr2[5];
/* 100 */           fArr3[3] = (f4 * f19) + f18;
/* 102 */           float f20 = fArr[1];
/* 104 */           float f21 = fArr2[3];
/* 108 */           float f22 = f8 * f17;
/* 116 */           fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
/* 118 */           float f23 = fArr[2];
/* 127 */           float f24 = f19 * f14;
/* 131 */           fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
/* 135 */           float f25 = f15 * fArr2[6];
/* 136 */           float f26 = fArr[3];
/* 138 */           float f27 = fArr2[7];
/* 141 */           float f28 = (f26 * f27) + f25;
/* 142 */           float f29 = fArr2[8];
/* 146 */           fArr3[6] = (f4 * f29) + f28;
/* 148 */           float f30 = fArr2[6];
/* 155 */           float f31 = f9 * f29;
/* 159 */           fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
/* 168 */           float f32 = f14 * f29;
/* 172 */           fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
/* 332 */           return fArr3;
                }

                public static final float[] I000II(float[] fArr, float[] fArr2) {
/* 4 */             if (fArr.length < 9 || fArr2.length < 3) {
/* 11 */                return fArr2;
                    }
/* 13 */            float f = fArr2[0];
/* 16 */            float f2 = fArr2[1];
/* 19 */            float f3 = fArr2[2];
/* 33 */            fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
/* 48 */            fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
/* 64 */            fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
/* 106 */           return fArr2;
                }
            }
