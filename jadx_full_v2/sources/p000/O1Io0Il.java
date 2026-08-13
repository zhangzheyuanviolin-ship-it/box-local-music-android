            package p000;

            import java.util.ArrayList;
            
            public final class O1Io0Il extends O1IlII1o1O0i {
                public ArrayList I000OOo1O;
                public ArrayList I000OiO;
                public O1IlIoIOOIi I000iOII;

                @Override
                public final void I00000oOI(IIolOo iIolOo) {
/* 1 */             ArrayList arrayList = this.I000OOo1O;
/* 9 */             IIOOoll iIOOoll = new IIOOoll(this.I000iOII.I00000oOI);
                    try {
/* 12 */                iIolOo.I000II();
/* 15 */                IIOl10ol0 iIOl10ol0 = this.I0001Ioi1lo;
/* 24 */                iIolOo.I000o00OoI0I(iIOl10ol0.I00000oIO, iIOl10ol0.I00000oOI - this.I0000oI00);
/* 27 */                I0oiil10Ili i0oiil10IliI00000oIO = lI0ol111l.I00000oIO();
/* 31 */                i0oiil10IliI00000oIO.I00100o1O0lo();
/* 36 */                i0oiil10IliI00000oIO.I0010o(this.I000II);
/* 39 */                int size = arrayList.size();
/* 44 */                for (int i = 0; i < size; i++) {
/* 46 */                    iIolOo.I000II();
/* 62 */                    iIolOo.I000o00OoI0I(0.0f, ((Number) this.I000OiO.get(i)).floatValue());
/* 69 */                    iIolOo.I00000oIO(1.0f, -1.0f);
/* 82 */                    iIOOoll.I00Io1lO(iIolOo, i0oiil10IliI00000oIO, ((Number) arrayList.get(i)).intValue(), 0.0f);
/* 85 */                    iIolOo.I00100l0();
                        }
                    } finally {
/* 97 */                iIolOo.I00100l0();
                    }
                }

                @Override
                public final float I0000Il00O() {
/* 5 */             return this.I00000oIO - this.I0000oI00;
                }

                @Override
                public final float I0000O() {
/* 5 */             return this.I00000oOI + this.I0000oI00;
                }
            }
