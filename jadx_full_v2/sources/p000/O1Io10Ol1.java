            package p000;
            
            public final class O1Io10Ol1 extends O1IlII1o1O0i {
                public final int I000OOo1O;
                public O1O00IIOio1l I000OiO;
                public O1IlII1o1O0i I000iOII;
                public float I000l1;
                public O1O00IIOio1l I000lI;
                public float I000o00OoI0I;
                public float I000oI1ioi;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1Io10Ol1(OI1IO0IiiI oI1IO0IiiI, int i, int i2) {
/* 3 */             super(oI1IO0IiiI, i);
/* 1 */             this.I000OOo1O = i2;
                }

                @Override
                public final void I00000oIO() {
                    switch (this.I000OOo1O) {
                        case 0:
/* 34 */                    this.I000iOII.I000O01llI0(this.I000II);
/* 37 */                    O1O00IIOio1l o1O00IIOio1l = this.I000OiO;
/* 39 */                    if (o1O00IIOio1l != null) {
/* 43 */                        o1O00IIOio1l.I000O01llI0(this.I000II);
                            }
/* 46 */                    O1O00IIOio1l o1O00IIOio1l2 = this.I000lI;
/* 48 */                    if (o1O00IIOio1l2 != null) {
/* 52 */                        o1O00IIOio1l2.I000O01llI0(this.I000II);
                                break;
                            }
                            break;
                        default:
/* 10 */                    this.I000OiO.I000O01llI0(this.I000II);
/* 17 */                    this.I000iOII.I000O01llI0(this.I000II);
/* 20 */                    O1O00IIOio1l o1O00IIOio1l3 = this.I000lI;
/* 22 */                    if (o1O00IIOio1l3 != null) {
/* 26 */                        o1O00IIOio1l3.I000O01llI0(this.I000II);
                                break;
                            }
                            break;
                    }
                }

                @Override
                public final void I00000oOI(IIolOo iIolOo) throws Throwable {
                    IIolOo iIolOo2;
                    switch (this.I000OOo1O) {
                        case 0:
/* 130 */                   O1O00IIOio1l o1O00IIOio1l = this.I000OiO;
/* 132 */                   if (o1O00IIOio1l != null) {
/* 134 */                       o1O00IIOio1l.I00000oOI(iIolOo);
                            }
/* 137 */                   O1O00IIOio1l o1O00IIOio1l2 = this.I000lI;
/* 139 */                   if (o1O00IIOio1l2 != null) {
/* 141 */                       o1O00IIOio1l2.I00000oOI(iIolOo);
                            }
/* 146 */                   this.I000iOII.I00000oOI(iIolOo);
/* 149 */                   return;
                        default:
/* 6 */                     O1IlII1o1O0i o1IlII1o1O0i = this.I000iOII;
/* 10 */                    this.I000OiO.I00000oOI(iIolOo);
/* 13 */                    O1O00IIOio1l o1O00IIOio1l3 = this.I000lI;
/* 15 */                    if (o1O00IIOio1l3 != null) {
/* 17 */                        o1O00IIOio1l3.I00000oOI(iIolOo);
                            }
                            try {
/* 20 */                        iIolOo.I000II();
/* 23 */                        IIOl10ol0 iIOl10ol0 = this.I0001Ioi1lo;
/* 32 */                        iIolOo.I000o00OoI0I(iIOl10ol0.I00000oIO + this.I000l1, iIOl10ol0.I00000oOI);
/* 35 */                        o1IlII1o1O0i.I00000oOI(iIolOo);
/* 38 */                        float f = this.I000o00OoI0I;
/* 40 */                        I0oiil10Ili i0oiil10IliI00000oIO = lI0ol111l.I00000oIO();
/* 44 */                        i0oiil10IliI00000oIO.I00100o1O0lo();
/* 49 */                        i0oiil10IliI00000oIO.I0010o(this.I000II);
/* 54 */                        i0oiil10IliI00000oIO.I001l0I00(this.I000oI1ioi);
/* 58 */                        i0oiil10IliI00000oIO.I001i1lo1io(1);
/* 61 */                        float fI0000oI00 = o1IlII1o1O0i.I0000oI00();
/* 73 */                        float f2 = (this.I00000oIO - f) - (this.I000oI1ioi / 2.0f);
/* 93 */                        long jFloatToRawIntBits = (Float.floatToRawIntBits(fI0000oI00) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
/* 109 */                       long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fI0000oI00 + r1.I0000Il00O) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
/* 111 */                       iIolOo2 = iIolOo;
                                try {
/* 112 */                           iIolOo2.I000O01llI0(jFloatToRawIntBits, jFloatToRawIntBits2, i0oiil10IliI00000oIO);
/* 115 */                           iIolOo2.I00100l0();
/* 118 */                           return;
                                } catch (Throwable th) {
/* 119 */                           th = th;
/* 120 */                           Throwable th2 = th;
/* 125 */                           iIolOo2.I00100l0();
/* 128 */                           throw th2;
                                }
                            } catch (Throwable th3) {
/* 122 */                       th = th3;
/* 123 */                       iIolOo2 = iIolOo;
                            }
                    }
                }

                @Override
                public float I0000Il00O() {
                    switch (this.I000OOo1O) {
                        case 0:
/* 11 */                    O1O00IIOio1l o1O00IIOio1l = this.I000OiO;
/* 13 */                    O1IlII1o1O0i o1IlII1o1O0i = this.I000iOII;
                            return o1O00IIOio1l != null ? o1IlII1o1O0i.I0000Il00O() + 0.0f + o1O00IIOio1l.I00000oIO + this.I000oI1ioi + o1O00IIOio1l.I00000oOI : o1IlII1o1O0i.I0000Il00O();
                        default:
/* 6 */                     return super.I0000Il00O();
                    }
                }

                @Override
                public float I0000O() {
                    switch (this.I000OOo1O) {
                        case 0:
/* 11 */                    O1O00IIOio1l o1O00IIOio1l = this.I000lI;
/* 13 */                    O1IlII1o1O0i o1IlII1o1O0i = this.I000iOII;
                            return o1O00IIOio1l != null ? o1IlII1o1O0i.I0000O() + 0.0f + this.I000o00OoI0I + o1O00IIOio1l.I00000oOI + o1O00IIOio1l.I00000oIO : o1IlII1o1O0i.I0000O();
                        default:
/* 6 */                     return super.I0000O();
                    }
                }

                @Override
                public final void I0001Ioi1lo() {
                    switch (this.I000OOo1O) {
                        case 0:
/* 10 */                    I000OiO();
/* 13 */                    I000l1();
/* 16 */                    O1IlII1o1O0i o1IlII1o1O0i = this.I000iOII;
/* 42 */                    o1IlII1o1O0i.I000II(new IIOl10ol0(((this.I0000Il00O - o1IlII1o1O0i.I0000oI00()) / 2.0f) + this.I0001Ioi1lo.I00000oIO, this.I0001Ioi1lo.I00000oOI));
                            break;
                        default:
/* 6 */                     I000iOII();
                            break;
                    }
                }

                public void I000OiO() {
/* 1 */             O1O00IIOio1l o1O00IIOio1l = this.I000lI;
/* 3 */             if (o1O00IIOio1l != null) {
/* 7 */                 IIOl10ol0 iIOl10ol0 = this.I0001Ioi1lo;
/* 41 */                o1O00IIOio1l.I000II(new IIOl10ol0(((this.I0000Il00O - o1O00IIOio1l.I0000Il00O) / 2.0f) + (iIOl10ol0.I00000oIO - this.I000l1), ((iIOl10ol0.I00000oOI - this.I000iOII.I0000O()) - this.I000o00OoI0I) - o1O00IIOio1l.I00000oIO));
                    }
                }

                public void I000iOII() {
/* 26 */            this.I000OiO.I000II(new IIOl10ol0(this.I000iOII.I0000oI00() + this.I0001Ioi1lo.I00000oIO + this.I000l1, this.I0001Ioi1lo.I00000oOI));
                }

                public void I000l1() {
/* 1 */             O1O00IIOio1l o1O00IIOio1l = this.I000OiO;
/* 3 */             if (o1O00IIOio1l != null) {
/* 7 */                 IIOl10ol0 iIOl10ol0 = this.I0001Ioi1lo;
/* 41 */                o1O00IIOio1l.I000II(new IIOl10ol0(((this.I0000Il00O - o1O00IIOio1l.I0000Il00O) / 2.0f) + iIOl10ol0.I00000oIO + this.I000l1, this.I000iOII.I0000Il00O() + iIOl10ol0.I00000oOI + this.I000oI1ioi + o1O00IIOio1l.I00000oOI));
                    }
                }
            }
