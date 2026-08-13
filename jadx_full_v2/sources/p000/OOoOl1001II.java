            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
/* 47 */    public class OOoOl1001II {
                public O0IOli0o0 I00000oOI(Class cls) {
/* 3 */             IOIi01OO iOIi01OO = new IOIi01OO();
/* 6 */             iOIi01OO.I00iOIl = cls;
/* 8 */             VarHandle.storeStoreFence();
/* 49 */            return iOIi01OO;
                }

                public O0IiO0OiI I0000Il00O(Class cls) {
/* 3 */             OIo101O oIo101O = new OIo101O();
/* 6 */             oIo101O.I00iOIl = cls;
/* 8 */             VarHandle.storeStoreFence();
/* 49 */            return oIo101O;
                }

                public O0O01O0o I0000O(O0O01O0o o0O01O0o) {
/* 2 */             OoOiIIi01o ooOiIIi01o = (OoOiIIi01o) o0O01O0o;
/* 6 */             O0IiIl0il o0IiIl0ilI001IIilI0O = o0O01O0o.I001IIilI0O();
/* 10 */            List listI00111O = o0O01O0o.I00111O();
/* 14 */            ooOiIIi01o.getClass();
/* 21 */            return new OoOiIIi01o(o0IiIl0ilI001IIilI0O, listI00111O, ooOiIIi01o.I00iiO | 2);
                }

                public String I000OiO(Illl0OO0l illl0OO0l) {
/* 12 */            String string = illl0OO0l.getClass().getGenericInterfaces()[0].toString();
                    return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
                }

                public String I000iOII(O0iO10011II o0iO10011II) {
/* 1 */             return I000OiO(o0iO10011II);
                }

                public void I000l1(O0O0OIOO o0o0oioo, List list) {
/* 1 */             OoOOlOlI ooOOlOlI = (OoOOlOlI) o0o0oioo;
/* 5 */             if (ooOOlOlI.I00ilI0I1 == null) {
/* 7 */                 ooOOlOlI.I00ilI0I1 = list;
                    } else {
/* 14 */                OIiilo1Ool0o.I0000oI00(ooOOlOlI, "Upper bounds of type parameter '", "' have already been initialized.");
                    }
                }

                public O0O01O0o I000lI(O0IiIl0il o0IiIl0il, List list, boolean z) {
/* 3 */             return new OoOiIIi01o(o0IiIl0il, list, z ? 1 : 0);
                }

                public O0O0OIOO I000o00OoI0I(O0IOli0o0 o0IOli0o0) {
/* 1 */             O0O10O o0o10o = O0O10O.I00iOIl;
/* 5 */             OoOOlOlI ooOOlOlI = new OoOOlOlI();
/* 8 */             ooOOlOlI.I00iOIl = o0IOli0o0;
/* 10 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 15 */            IlIi0Il ilIi0Il = new IlIi0Il(7);
/* 18 */            ilIi0Il.I00iiI = ooOOlOlI;
/* 20 */            VarHandle.storeStoreFence();
/* 27 */            ooOOlOlI.I00iiI = l0oi0lOi11i.I00000oIO(o0oI01I0oo, ilIi0Il);
/* 31 */            ooOOlOlI.I00iiO = "PluginConfigT";
/* 33 */            ooOOlOlI.I00iio = o0o10o;
/* 35 */            VarHandle.storeStoreFence();
/* 49 */            return ooOOlOlI;
                }

/* 48 */        public O0Iill I00000oIO(IlllollI illlollI) {
/* 49 */            return illlollI;
                }

/* 48 */        public O0Io01100Ilo I0000oI00(Oo0100oi oo0100oi) {
/* 49 */            return oo0100oi;
                }

/* 48 */        public O0Io0Io I0001Ioi1lo(OI100OO1 oi100oo1) {
/* 49 */            return oi100oo1;
                }

/* 48 */        public O0Iooi01 I000II(O0l0IOol0 o0l0IOol0) {
/* 49 */            return o0l0IOol0;
                }

/* 48 */        public O0Iooi0Io11I I000O01llI0(OOOOIO0i oOOOIO0i) {
/* 49 */            return oOOOIO0i;
                }

/* 48 */        public O0O000oI I000OOo1O(OOOOIOiI0 oOOOIOiI0) {
/* 49 */            return oOOOIOiI0;
                }
            }
