            package p000;
            
            public final class O1Io1iOoiO1 extends O1IlII1o1O0i {
                public final O1O00IIOio1l I000OOo1O;
                public float I000OiO;
                public float I000iOII;

                public O1Io1iOoiO1(O1O00IIOio1l o1O00IIOio1l, OI1IO0IiiI oI1IO0IiiI) {
/* 3 */             super(oI1IO0IiiI, 23);
/* 6 */             this.I000OOo1O = o1O00IIOio1l;
                }

                @Override
                public final void I00000oIO() {
/* 5 */             this.I000OOo1O.I000O01llI0(this.I000II);
                }

                @Override
                public final void I00000oOI(IIolOo iIolOo) {
/* 3 */             this.I000OOo1O.I00000oOI(iIolOo);
/* 11 */            if (this.I000iOII == 0.0f) {
/* 13 */                return;
                    }
/* 14 */            I0oiil10Ili i0oiil10IliI00000oIO = lI0ol111l.I00000oIO();
/* 18 */            i0oiil10IliI00000oIO.I00100o1O0lo();
/* 23 */            i0oiil10IliI00000oIO.I0010o(this.I000II);
/* 28 */            i0oiil10IliI00000oIO.I001l0I00(this.I000iOII);
/* 31 */            IIOl10ol0 iIOl10ol0 = this.I0001Ioi1lo;
/* 33 */            float f = iIOl10ol0.I00000oIO;
/* 39 */            float f2 = iIOl10ol0.I00000oOI + this.I000OiO;
/* 59 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
/* 61 */            IIOl10ol0 iIOl10ol02 = this.I0001Ioi1lo;
/* 67 */            float f3 = iIOl10ol02.I00000oIO + this.I0000Il00O;
/* 72 */            float f4 = iIOl10ol02.I00000oOI + this.I000OiO;
/* 89 */            iIolOo.I000O01llI0(jFloatToRawIntBits, (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), i0oiil10IliI00000oIO);
                }

                @Override
                public final void I0001Ioi1lo() {
/* 3 */             IIOl10ol0 iIOl10ol0 = this.I0001Ioi1lo;
/* 14 */            this.I000OOo1O.I000II(new IIOl10ol0(iIOl10ol0.I00000oIO, iIOl10ol0.I00000oOI));
                }
            }
