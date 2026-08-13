            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class lO0OOOl {
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(IoIlIolo10o ioIlIolo10o, IOoilo iOoilo) {
                    OiIl1ilolI01 oiIl1ilolI01;
                    IoO0ii1I ioO0ii1I;
                    Ilo0Ooi ilo0Ooi;
                    Ilo0Ooi ilo0Ooi2;
/* 3 */             if (iOoilo instanceof OiIl1ilolI01) {
/* 6 */                 oiIl1ilolI01 = (OiIl1ilolI01) iOoilo;
/* 8 */                 int i = oiIl1ilolI01.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oiIl1ilolI01.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oiIl1ilolI01 = new OiIl1ilolI01(iOoilo);
                        }
                    }
/* 25 */            Object objI000l1 = oiIl1ilolI01.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oiIl1ilolI01.I00iiO;
/* 33 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objI000l1);
/* 54 */                if (ioIlIolo10o instanceof OiIl1oI) {
/* 56 */                    return ioIlIolo10o;
                        }
/* 61 */                IIIoloiiI1 iIIoloiiI1I0000Il00O = ioIlIolo10o.I0000oI00().I0000Il00O();
/* 65 */                oiIl1ilolI01.I00iOIl = ioIlIolo10o;
/* 67 */                oiIl1ilolI01.I00iiO = 1;
/* 69 */                objI000l1 = iOiOOIlI1o01.I000l1(iIIoloiiI1I0000Il00O, oiIl1ilolI01);
/* 73 */                if (objI000l1 == ii0111o) {
/* 75 */                    return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 45 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                ioIlIolo10o = oiIl1ilolI01.I00iOIl;
/* 39 */                lIoii1l01l0i.I00000oOI(objI000l1);
                    }
/* 79 */            byte[] bArrI0000Il00O = lOO1Ill.I0000Il00O((OlI1iil1l0) objI000l1, -1);
/* 85 */            IoIlI1oli ioIlI1oli = ioIlIolo10o.I00iOIl;
/* 87 */            IoO10Iooo0 ioO10Iooo0I0000O = ioIlIolo10o.I0000O();
/* 91 */            Ii1olII1lO1 ii1olII1lO1I0000oI00 = ioIlIolo10o.I0000oI00();
/* 95 */            OiIl1oI oiIl1oI = new OiIl1oI(ioIlI1oli);
/* 100 */           OiIlOiOlol oiIlOiOlol = new OiIlOiOlol();
/* 103 */           oiIlOiOlol.I00iOIl = ioO10Iooo0I0000O;
/* 105 */           oiIlOiOlol.I00iiI = oiIl1oI;
/* 107 */           VarHandle.storeStoreFence();
/* 110 */           oiIl1oI.I00iiI = oiIlOiOlol;
/* 114 */           Ii1olII1lO1 ii1olII1lO1 = new Ii1olII1lO1(1);
/* 117 */           ii1olII1lO1.I00io1l = oiIl1oI;
/* 119 */           ii1olII1lO1.I00ioIO = bArrI0000Il00O;
/* 125 */           ii1olII1lO1.I00iiI = ii1olII1lO1I0000oI00.I0000O();
                    switch (ii1olII1lO1I0000oI00.I00iOIl) {
                        case 0:
/* 135 */                   ioO0ii1I = ii1olII1lO1I0000oI00.I00iiO;
                            break;
                        default:
/* 132 */                   ioO0ii1I = ii1olII1lO1I0000oI00.I00iiO;
                            break;
                    }
/* 137 */           ii1olII1lO1.I00iiO = ioO0ii1I;
                    switch (ii1olII1lO1I0000oI00.I00iOIl) {
                        case 0:
/* 147 */                   ilo0Ooi = ii1olII1lO1I0000oI00.I00iio;
                            break;
                        default:
/* 144 */                   ilo0Ooi = ii1olII1lO1I0000oI00.I00iio;
                            break;
                    }
/* 149 */           ii1olII1lO1.I00iio = ilo0Ooi;
                    switch (ii1olII1lO1I0000oI00.I00iOIl) {
                        case 0:
/* 159 */                   ilo0Ooi2 = ii1olII1lO1I0000oI00.I00ilI0I1;
                            break;
                        default:
/* 156 */                   ilo0Ooi2 = ii1olII1lO1I0000oI00.I00ilI0I1;
                            break;
                    }
/* 161 */           ii1olII1lO1.I00ilI0I1 = ilo0Ooi2;
/* 167 */           ii1olII1lO1.I00l0I0l0lO1 = ii1olII1lO1I0000oI00.I00000oOI();
/* 173 */           ii1olII1lO1.I00ilO0 = ii1olII1lO1I0000oI00.I00000oIO();
/* 175 */           VarHandle.storeStoreFence();
/* 178 */           oiIl1oI.I00iiO = ii1olII1lO1;
/* 186 */           String strI000iOII = ii1olII1lO1I0000oI00.I00000oOI().I000iOII("Content-Length");
/* 202 */           li111oiil1.I00000oIO(strI000iOII != null ? OlOolloIIOl0.I000o00OoI0I(strI000iOII) : null, bArrI0000Il00O.length, ioO10Iooo0I0000O.getMethod());
/* 205 */           oiIl1oI.I00io1l = true;
/* 207 */           VarHandle.storeStoreFence();
/* 210 */           return oiIl1oI;
                }
            }
