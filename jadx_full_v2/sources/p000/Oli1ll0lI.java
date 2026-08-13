            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oli1ll0lI implements IlliIl1l11O {
                public final int I00iOIl;
                public Oli1o0i I00iiI;

                public Oli1ll0lI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Oli1o0i oli1o0i = this.I00iiI;
                    switch (i) {
                        case 0:
/* 40 */                    OliI0OiOi1O oliI0OiOi1O = oli1o0i.I00000oIO;
/* 42 */                    O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) obj;
/* 46 */                    O0io0olo o0io0olo = o0iiOioolIi.I010II;
/* 49 */                    if (o0io0olo == null) {
/* 53 */                        o0io0olo = new O0io0olo();
/* 56 */                        o0io0olo.I00iOIl = o0iiOioolIi;
/* 58 */                        o0io0olo.I00iiO = oliI0OiOi1O;
/* 60 */                        long[] jArr = OiO10oio.I00000oIO;
/* 67 */                        o0io0olo.I00ilO0 = new OI10I1IoI0Ol();
/* 74 */                        o0io0olo.I00io1l = new OI10I1IoI0Ol();
/* 78 */                        O0ilio1l0 o0ilio1l0 = new O0ilio1l0();
/* 81 */                        o0ilio1l0.I00iio = o0io0olo;
/* 85 */                        o0ilio1l0.I00iOIl = O0iOOoiioO.I00iiI;
/* 87 */                        VarHandle.storeStoreFence();
/* 90 */                        o0io0olo.I00ioIO = o0ilio1l0;
/* 94 */                        O0il0iO o0il0iO = new O0il0iO();
/* 97 */                        o0il0iO.I00iiI = o0io0olo;
/* 99 */                        o0il0iO.I00iOIl = o0ilio1l0;
/* 101 */                       VarHandle.storeStoreFence();
/* 104 */                       o0io0olo.I00l0I0l0lO1 = o0il0iO;
/* 111 */                       o0io0olo.I00l0OO0IO = new OI10I1IoI0Ol();
/* 115 */                       int i2 = OIil1i0l.I00000oIO;
/* 120 */                       OI0olI1Oii0I oI0olI1Oii0I = new OI0olI1Oii0I(6);
/* 123 */                       Oli1ooI0oi oli1ooI0oi = new Oli1ooI0oi(0);
/* 126 */                       oli1ooI0oi.I00iiI = oI0olI1Oii0I;
/* 128 */                       VarHandle.storeStoreFence();
/* 131 */                       o0io0olo.I00li1OI = oli1ooI0oi;
/* 138 */                       o0io0olo.I00ll1 = new OI10I1IoI0Ol();
/* 149 */                       o0io0olo.I00lli11 = new OI110O0(new Object[16]);
/* 153 */                       o0io0olo.I00o0l1o1o0 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
/* 155 */                       VarHandle.storeStoreFence();
/* 158 */                       o0iiOioolIi.I010II = o0io0olo;
                            }
/* 160 */                   oli1o0i.I00000oOI = o0io0olo;
/* 166 */                   oli1o0i.I00000oIO().I000O01llI0();
/* 169 */                   O0io0olo o0io0oloI00000oIO = oli1o0i.I00000oIO();
/* 175 */                   if (o0io0oloI00000oIO.I00iiO != oliI0OiOi1O) {
/* 177 */                       o0io0oloI00000oIO.I00iiO = oliI0OiOi1O;
/* 179 */                       o0io0oloI00000oIO.I000OOo1O(false);
/* 185 */                       O0iiOioolIi.I00Ol00(o0io0oloI00000oIO.I00iOIl, false, 7);
                                break;
                            }
                            break;
                        case 1:
/* 37 */                    oli1o0i.I00000oIO().I00iiI = (IOl1ool0) obj2;
                            break;
                        default:
/* 14 */                    O0io0olo o0io0oloI00000oIO2 = oli1o0i.I00000oIO();
/* 25 */                    ((O0iiOioolIi) obj).I00i0oil(new O0iloo1OiI1(o0io0oloI00000oIO2, (IlliIl1l11O) obj2, o0io0oloI00000oIO2.I00o0l1o1o0));
                            break;
                    }
/* 28 */            return ooiIlOl1iI;
                }
            }
