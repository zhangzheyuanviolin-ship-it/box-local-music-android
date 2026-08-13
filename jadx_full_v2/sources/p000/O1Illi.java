            package p000;
            
/* 47 */    public final class O1Illi extends O1IlII1o1O0i {
                public O1O00IIOio1l I000OOo1O;
                public O1O00IIOio1l I000OiO;
                public float I000iOII;
                public float I000l1;
                public float I000lI;
                public float I000o00OoI0I;

                @Override
                public final void I00000oIO() {
/* 5 */             this.I000OOo1O.I000O01llI0(this.I000II);
/* 12 */            this.I000OiO.I000O01llI0(this.I000II);
                }

                @Override
                public final void I00000oOI(IIolOo iIolOo) {
/* 3 */             this.I000OOo1O.I00000oOI(iIolOo);
/* 8 */             this.I000OiO.I00000oOI(iIolOo);
/* 16 */            if (this.I000l1 == 0.0f) {
/* 18 */                return;
                    }
/* 19 */            I0oiil10Ili i0oiil10IliI00000oIO = lI0ol111l.I00000oIO();
/* 23 */            i0oiil10IliI00000oIO.I00100o1O0lo();
/* 28 */            i0oiil10IliI00000oIO.I0010o(this.I000II);
/* 33 */            i0oiil10IliI00000oIO.I001l0I00(this.I000l1);
/* 36 */            IIOl10ol0 iIOl10ol0 = this.I0001Ioi1lo;
/* 38 */            float f = iIOl10ol0.I00000oIO;
/* 44 */            float f2 = iIOl10ol0.I00000oOI + this.I000iOII;
/* 64 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
/* 74 */            float fI0000oI00 = I0000oI00() + this.I0001Ioi1lo.I00000oIO;
/* 81 */            float f3 = this.I0001Ioi1lo.I00000oOI + this.I000iOII;
/* 98 */            iIolOo.I000O01llI0(jFloatToRawIntBits, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(fI0000oI00) << 32), i0oiil10IliI00000oIO);
                }

                @Override
                public final float I0000Il00O() {
/* 7 */             return this.I000OOo1O.I00000oIO + this.I000lI;
                }

                @Override
                public final float I0000O() {
/* 7 */             return this.I000OiO.I00000oOI + this.I000o00OoI0I;
                }

                @Override
                public final float I0000oI00() {
/* 9 */             return Math.max(this.I000OOo1O.I0000Il00O, this.I000OiO.I0000Il00O);
                }

                @Override
                public final void I0001Ioi1lo() {
/* 1 */             I000OiO();
/* 4 */             I000iOII();
                }

                public final void I000OiO() {
/* 1 */             O1O00IIOio1l o1O00IIOio1l = this.I000OiO;
/* 30 */            o1O00IIOio1l.I000II(new IIOl10ol0(((I0000oI00() - o1O00IIOio1l.I0000Il00O) / 2.0f) + this.I0001Ioi1lo.I00000oIO, this.I0001Ioi1lo.I00000oOI - this.I000o00OoI0I));
                }

                public final void I000iOII() {
/* 1 */             O1O00IIOio1l o1O00IIOio1l = this.I000OOo1O;
/* 30 */            o1O00IIOio1l.I000II(new IIOl10ol0(((I0000oI00() - o1O00IIOio1l.I0000Il00O) / 2.0f) + this.I0001Ioi1lo.I00000oIO, this.I0001Ioi1lo.I00000oOI + this.I000lI));
                }

                @Override
/* 48 */        public final void I000OOo1O(float f) {
                }
            }
