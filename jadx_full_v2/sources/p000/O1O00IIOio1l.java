            package p000;

            import java.util.Iterator;
            import java.util.List;
            
            public final class O1O00IIOio1l extends O1IlII1o1O0i {
                public final List I000OOo1O;

                public O1O00IIOio1l(List list, OI1IO0IiiI oI1IO0IiiI) {
/* 3 */             super(oI1IO0IiiI, 23);
/* 6 */             O1IoI0O110OO[] o1IoI0O110OOArr = O1IoI0O110OO.I00iOIl;
/* 8 */             this.I000OOo1O = list;
/* 21 */            float f = 0.0f;
/* 22 */            float f2 = 0.0f;
/* 23 */            float f3 = 0.0f;
/* 28 */            for (O1IlII1o1O0i o1IlII1o1O0i : IOOi0Ool1i.I00iIi0i1o(list)) {
/* 45 */                float fMax = Math.max(0.0f, o1IlII1o1O0i.I0000Il00O() + o1IlII1o1O0i.I0001Ioi1lo.I00000oOI);
/* 51 */                f = fMax > f ? fMax : f;
/* 65 */                float fMax2 = Math.max(0.0f, 0.0f - (o1IlII1o1O0i.I0001Ioi1lo.I00000oOI - o1IlII1o1O0i.I0000O()));
/* 71 */                f2 = fMax2 > f2 ? fMax2 : f2;
/* 82 */                float fI0000oI00 = o1IlII1o1O0i.I0000oI00() + o1IlII1o1O0i.I0001Ioi1lo.I00000oIO;
/* 85 */                if (fI0000oI00 > f3) {
/* 87 */                    f3 = fI0000oI00;
                        }
                    }
/* 89 */            this.I00000oIO = f;
/* 91 */            this.I00000oOI = f2;
/* 93 */            this.I0000Il00O = f3;
                }

                @Override
                public final void I00000oIO() {
/* 17 */            for (O1IlII1o1O0i o1IlII1o1O0i : IOOi0Ool1i.I00iIi0i1o(this.I000OOo1O)) {
/* 33 */                if (Ooi0i1.I00000oOI(o1IlII1o1O0i.I000O01llI0, IOOiio0i.I000lI)) {
/* 37 */                    o1IlII1o1O0i.I000O01llI0(this.I000II);
                        } else {
/* 43 */                    o1IlII1o1O0i.I000O01llI0(o1IlII1o1O0i.I000O01llI0);
                        }
                    }
                }

                @Override
                public final void I00000oOI(IIolOo iIolOo) {
                    try {
/* 1 */                 iIolOo.I000II();
/* 4 */                 IIOl10ol0 iIOl10ol0 = this.I0001Ioi1lo;
/* 10 */                iIolOo.I000o00OoI0I(iIOl10ol0.I00000oIO, iIOl10ol0.I00000oOI);
/* 21 */                Iterator it = IOOi0Ool1i.I00iIi0i1o(this.I000OOo1O).iterator();
/* 29 */                while (it.hasNext()) {
/* 37 */                    ((O1IlII1o1O0i) it.next()).I00000oOI(iIolOo);
                        }
                    } finally {
/* 47 */                iIolOo.I00100l0();
                    }
                }
            }
