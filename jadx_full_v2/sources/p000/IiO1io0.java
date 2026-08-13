            package p000;

            import java.lang.reflect.Type;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.List;
            
            public final class IiO1io0 implements IllOOo00lI {
                public final int I00iOIl;
                public IiO1l1i I00iiI;

                public IiO1io0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IiO1l1i iiO1l1i = this.I00iiI;
                    switch (i) {
                        case 0:
/* 264 */                   return Oolli0oi0.I00000oOI(iiO1l1i.I0000O());
                        default:
/* 8 */                     OIoioOli1I oIoioOli1II0000O = iiO1l1i.I0000O();
/* 12 */                    int i2 = iiO1l1i.I00iiI;
/* 14 */                    IiO10i1 iiO10i1 = iiO1l1i.I00iOIl;
/* 18 */                    if (oIoioOli1II0000O instanceof O0ioOi0Oo1ii) {
/* 20 */                        IIiO00o1o iIiO00o1oI001lloI = iiO10i1.I001lloI();
/* 24 */                        Ill0IO ill0IO = Oolli0oi0.I00000oIO;
/* 49 */                        if (O0000Ioio00.I0000O(iIiO00o1oI001lloI.I00OI1() != null ? ((OI000ilOol) iIiO00o1oI001lloI.I000lI()).I00iiI() : null, oIoioOli1II0000O) && iiO10i1.I001lloI().I000oI1ioi() == 2) {
/* 72 */                            Class clsI000O01llI0 = Oolli0oi0.I000O01llI0((OI000ilOol) iiO10i1.I001lloI().I000lI());
/* 76 */                            if (clsI000O01llI0 != null) {
/* 78 */                                return clsI000O01llI0;
                                    }
/* 83 */                            IoOOl0iOl1io.I001IIilI0O("Cannot determine receiver Java type of inherited declaration: ", oIoioOli1II0000O);
/* 30 */                            return null;
                                }
                            }
/* 88 */                    IIiOlII iIiOlIII001l0I00 = iiO10i1.I001l0I00();
/* 95 */                    if (!(iIiOlIII001l0I00 instanceof OoloIllIlii0)) {
/* 216 */                       if (!(iIiOlIII001l0I00 instanceof OoloIiOi0O1l)) {
/* 257 */                           return (Type) iIiOlIII001l0I00.I00000oIO().get(i2);
                                }
/* 234 */                       Class[] clsArr = (Class[]) ((Collection) ((OoloIiOi0O1l) iIiOlIII001l0I00).I0000O.get(i2)).toArray(new Class[0]);
/* 243 */                       return IiO1l1i.I00000oIO((Type[]) Arrays.copyOf(clsArr, clsArr.length));
                            }
/* 97 */                    boolean zI00000oIO = lIll0lII1.I00000oIO(iiO10i1);
/* 101 */                   Collection collectionI00iIi0i1o = Il01100l.I00iOIl;
/* 104 */                   if (zI00000oIO) {
/* 106 */                       OoloIllIlii0 ooloIllIlii0 = (OoloIllIlii0) iIiOlIII001l0I00;
/* 109 */                       IooO11l iooO11lI0000oI00 = ooloIllIlii0.I0000oI00(i2 + 1);
/* 119 */                       int i3 = ooloIllIlii0.I0000oI00(0).I00iiI + 1;
/* 122 */                       List listI00000oIO = ooloIllIlii0.I00000oIO.I00000oIO();
/* 130 */                       int i4 = iooO11lI0000oI00.I00iOIl - i3;
/* 134 */                       IooO11l iooO11l = new IooO11l(i4, iooO11lI0000oI00.I00iiI - i3, 1);
/* 141 */                       if (!iooO11l.isEmpty()) {
/* 153 */                           collectionI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(listI00000oIO.subList(i4, iooO11l.I00iiI + 1));
                                }
                            } else {
/* 158 */                       OoloIllIlii0 ooloIllIlii02 = (OoloIllIlii0) iIiOlIII001l0I00;
/* 160 */                       IooO11l iooO11lI0000oI002 = ooloIllIlii02.I0000oI00(i2);
/* 166 */                       List listI00000oIO2 = ooloIllIlii02.I00000oIO.I00000oIO();
/* 174 */                       if (!iooO11lI0000oI002.isEmpty()) {
/* 188 */                           collectionI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(listI00000oIO2.subList(iooO11lI0000oI002.I00iOIl, iooO11lI0000oI002.I00iiI + 1));
                                }
                            }
/* 200 */                   Type[] typeArr = (Type[]) collectionI00iIi0i1o.toArray(new Type[0]);
/* 209 */                   return IiO1l1i.I00000oIO((Type[]) Arrays.copyOf(typeArr, typeArr.length));
                    }
                }
            }
