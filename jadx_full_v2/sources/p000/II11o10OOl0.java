            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class II11o10OOl0 implements Function1 {
                public final int I00iOIl;
                public float I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public II11o10OOl0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 50 */                    OOo0IO oOo0IO = (OOo0IO) this.I00iiO;
/* 54 */                    OIio1O0ll0I oIio1O0ll0I = (OIio1O0ll0I) this.I00iio;
/* 59 */                    III11l1I iII11l1I = (III11l1I) this.I00ilI0I1;
/* 61 */                    float f = this.I00iiI;
/* 65 */                    I0ol0lI i0ol0lI = (I0ol0lI) this.I00ilO0;
/* 69 */                    IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 73 */                    float f2 = -oOo0IO.I00000oIO;
/* 76 */                    float f3 = -oOo0IO.I00000oOI;
/* 85 */                    ((IIOOoll) iilloIOOO0i.I00iiI().I00iiI).I00i0oil(f2, f3);
                            try {
/* 113 */                       IilloIOOO0i.I00OIo(iilloIOOO0i, oIio1O0ll0I.I00000oIO, iII11l1I, 0.0f, new OlOooI0l0011(f * 2.0f, 0.0f, 0, 0, null, 30), null, 52);
/* 141 */                       float fIntBitsToFloat = (Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32));
/* 168 */                       float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L));
/* 169 */                       long jI00lli11 = iilloIOOO0i.I00lli11();
/* 173 */                       IOO000ilo iOO000iloI00iiI = iilloIOOO0i.I00iiI();
/* 177 */                       long jI001iOo1i0O = iOO000iloI00iiI.I001iOo1i0O();
/* 185 */                       iOO000iloI00iiI.I0010o().I000II();
                                try {
/* 192 */                           ((IIOOoll) iOO000iloI00iiI.I00iiI).I00i01iIIliI(fIntBitsToFloat, fIntBitsToFloat2, jI00lli11);
/* 201 */                           IilloIOOO0i.I00OIo(iilloIOOO0i, i0ol0lI, iII11l1I, 0.0f, null, null, 28);
/* 227 */                           return ooiIlOl1iI;
                                } finally {
/* 235 */                           iOO000iloI00iiI.I0010o().I00100l0();
/* 238 */                           iOO000iloI00iiI.I00Io1lO(jI001iOo1i0O);
                                }
                            } finally {
/* 252 */                       ((IIOOoll) iilloIOOO0i.I00iiI().I00iiI).I00i0oil(-f2, -f3);
                            }
                        default:
/* 12 */                    OOo0ooi oOo0ooi = (OOo0ooi) this.I00iiO;
/* 14 */                    float f4 = this.I00iiI;
/* 19 */                    I10ooi i10ooi = (I10ooi) this.I00iio;
/* 24 */                    I110IiI1I1 i110IiI1I1 = (I110IiI1I1) this.I00ilI0I1;
/* 29 */                    Function1 function1 = (Function1) this.I00ilO0;
/* 44 */                    lOiIo0.I000II((I110IIooo) oOo0ooi.I00iOIl, ((Long) obj).longValue(), f4, i10ooi, i110IiI1I1, function1);
/* 47 */                    return ooiIlOl1iI;
                    }
                }
            }
