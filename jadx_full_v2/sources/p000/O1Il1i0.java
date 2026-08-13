            package p000;
            
/* 12 */    public final class O1Il1i0 extends O1IlII1o1O0i {
                public final int I000OOo1O = 1;
                public Object I000OiO;
                public Object I000iOII;

                public O1Il1i0(IIOl0O0 iIOl0O0, OI1IO0IiiI oI1IO0IiiI, O1IlIoIOOIi o1IlIoIOOIi) {
/* 6 */             super(oI1IO0IiiI, 23);
/* 9 */             this.I000OiO = iIOl0O0;
/* 11 */            this.I000iOII = o1IlIoIOOIi;
                }

                @Override
                public void I00000oIO() {
                    switch (this.I000OOo1O) {
                        case 0:
/* 13 */                    ((O1O00IIOio1l) this.I000iOII).I000O01llI0(this.I000II);
/* 22 */                    ((O1Il1i0) this.I000OiO).I000O01llI0(this.I000II);
                            break;
                    }
                }

                @Override
                public final void I00000oOI(IIolOo iIolOo) {
                    switch (this.I000OOo1O) {
                        case 0:
/* 74 */                    ((O1O00IIOio1l) this.I000iOII).I00000oOI(iIolOo);
                            try {
/* 77 */                        iIolOo.I000II();
/* 80 */                        IIOl10ol0 iIOl10ol0 = this.I0001Ioi1lo;
/* 86 */                        iIolOo.I000o00OoI0I(iIOl10ol0.I00000oIO, iIOl10ol0.I00000oOI);
/* 93 */                        ((O1Il1i0) this.I000OiO).I00000oOI(iIolOo);
/* 99 */                        return;
                            } finally {
                            }
                        default:
/* 6 */                     I0oiil10Ili i0oiil10IliI00000oIO = lI0ol111l.I00000oIO();
/* 10 */                    i0oiil10IliI00000oIO.I00100o1O0lo();
/* 15 */                    i0oiil10IliI00000oIO.I0010o(this.I000II);
/* 26 */                    IIOOoll iIOOoll = new IIOOoll(((O1IlIoIOOIi) this.I000iOII).I00000oOI);
                            try {
/* 29 */                        iIolOo.I000II();
/* 32 */                        IIOl10ol0 iIOl10ol02 = this.I0001Ioi1lo;
/* 41 */                        iIolOo.I000o00OoI0I(iIOl10ol02.I00000oIO, iIOl10ol02.I00000oOI - this.I0000oI00);
/* 48 */                        iIolOo.I00000oIO(1.0f, -1.0f);
/* 58 */                        iIOOoll.I00Io1lO(iIolOo, i0oiil10IliI00000oIO, ((IIOl0O0) this.I000OiO).I00000oIO, 0.0f);
/* 64 */                        return;
                            } finally {
                            }
                    }
                }

                @Override
                public float I0000Il00O() {
                    switch (this.I000OOo1O) {
                        case 1:
/* 15 */                    return this.I00000oIO - this.I0000oI00;
                        default:
/* 6 */                     return super.I0000Il00O();
                    }
                }

                @Override
                public float I0000O() {
                    switch (this.I000OOo1O) {
                        case 1:
/* 15 */                    return this.I00000oOI + this.I0000oI00;
                        default:
/* 6 */                     return super.I0000O();
                    }
                }

                @Override
                public void I0001Ioi1lo() {
                    switch (this.I000OOo1O) {
                        case 0:
/* 9 */                     O1O00IIOio1l o1O00IIOio1l = (O1O00IIOio1l) this.I000iOII;
/* 13 */                    IIOl10ol0 iIOl10ol0 = this.I0001Ioi1lo;
/* 22 */                    o1O00IIOio1l.I000II(new IIOl10ol0(iIOl10ol0.I00000oIO, iIOl10ol0.I00000oOI));
                            break;
                    }
                }

/* 13 */        public O1Il1i0(OI1IO0IiiI oI1IO0IiiI, int i) {
                    super(oI1IO0IiiI, i);
                }
            }
