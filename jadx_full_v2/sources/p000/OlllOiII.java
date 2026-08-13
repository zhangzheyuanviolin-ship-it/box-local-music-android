            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class OlllOiII implements Function1 {
                public ArrayList I00iOIl;
                public Oli1oI111 I00iiI;
                public IlliIl1l11O I00iiO;
                public OOo0ll111 I00iio;
                public IOo0oO11ll1O I00ilI0I1;
                public int I00ilO0;
                public Function3 I00io1l;
                public ArrayList I00ioIO;
                public int I00l0I0l0lO1;

                @Override
                public final Object invoke(Object obj) {
/* 3 */             ArrayList arrayList = this.I00iOIl;
/* 5 */             Oli1oI111 oli1oI111 = this.I00iiI;
/* 7 */             IlliIl1l11O illiIl1l11O = this.I00iiO;
/* 9 */             OOo0ll111 oOo0ll111 = this.I00iio;
/* 11 */            IOo0oO11ll1O iOo0oO11ll1O = this.I00ilI0I1;
/* 13 */            int i = this.I00ilO0;
/* 15 */            Function3 function3 = this.I00io1l;
/* 17 */            ArrayList arrayList2 = this.I00ioIO;
/* 19 */            int i2 = this.I00l0I0l0lO1;
/* 23 */            OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 25 */            int size = arrayList.size();
/* 31 */            for (int i3 = 0; i3 < size; i3++) {
/* 42 */                OO11o0IO.I000iOII(oO11o0IO, (OO1I0001000i) arrayList.get(i3), oOo0ll111.I00iOIl * i3, 0);
                    }
/* 50 */            List listI000o00OoI0I = oli1oI111.I000o00OoI0I(illiIl1l11O, Ollo1l0I.I00iiI);
/* 57 */            int size2 = listI000o00OoI0I.size();
/* 62 */            for (int i4 = 0; i4 < size2; i4++) {
/* 84 */                OO1I0001000i oO1I0001000iI001lllioOl = ((O1iIo0ll) listI000o00OoI0I.get(i4)).I001lllioOl(IOo0oO11ll1O.I0000Il00O(iOo0oO11ll1O.I00000oIO, 0, 0, 0, 0, 11));
/* 92 */                OO11o0IO.I000iOII(oO11o0IO, oO1I0001000iI001lllioOl, 0, i - oO1I0001000iI001lllioOl.I00iiI);
                    }
/* 98 */            Ollo1l0I ollo1l0I = Ollo1l0I.I00iiO;
/* 104 */           O1oiiIIo111o o1oiiIIo111o = new O1oiiIIo111o(27);
/* 107 */           o1oiiIIo111o.I00iiI = function3;
/* 109 */           o1oiiIIo111o.I00iiO = arrayList2;
/* 111 */           VarHandle.storeStoreFence();
/* 123 */           List listI000o00OoI0I2 = oli1oI111.I000o00OoI0I(new IOii1l(1918742627, o1oiiIIo111o, true), ollo1l0I);
/* 130 */           int size3 = listI000o00OoI0I2.size();
/* 135 */           for (int i5 = 0; i5 < size3; i5++) {
/* 141 */               O1iIo0ll o1iIo0ll = (O1iIo0ll) listI000o00OoI0I2.get(i5);
/* 154 */               if (!((i2 >= 0) & (i >= 0))) {
/* 158 */                   Ioliol1Ii.I00000oIO("width and height must be >= 0");
                        }
/* 169 */               OO11o0IO.I000iOII(oO11o0IO, o1iIo0ll.I001lllioOl(IOo0olo.I000O01llI0(i2, i2, i, i)), 0, 0);
                    }
/* 175 */           return OoiIlOl1iI.I00000oIO;
                }
            }
