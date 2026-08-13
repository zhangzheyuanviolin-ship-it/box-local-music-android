            package p000;
            
            public abstract class OiIOOIOIo {
                public static final O1I1OOiol I00000oIO = O1I1lilOlO0I.I00000oOI("io.ktor.client.plugins.sse.SSE");
                public static final IOO000ilo I00000oOI = il00O1lo1oOi.I00000oIO(OiIO0oll1.I00ioIO, "SSE", new OOii01Ioi1(12));
                public static final I1OoollI1Il1 I0000Il00O;
                public static final I1OoollI1Il1 I0000O;

                static {
                    O0O01O0o o0O01O0oI00000oIO;
/* 30 */            O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(IoIlI1oli.class);
/* 34 */            O0O01O0o o0O01O0oI00000oIO2 = null;
                    try {
/* 35 */                o0O01O0oI00000oIO = OOoOl0i.I00000oIO(IoIlI1oli.class);
                    } catch (Throwable unused) {
/* 40 */                o0O01O0oI00000oIO = null;
                    }
/* 53 */            I0000Il00O = new I1OoollI1Il1("SSEClientForReconnection", new OoOO010(o0IOli0o0I00000oOI, o0O01O0oI00000oIO));
/* 59 */            O0IOli0o0 o0IOli0o0I00000oOI2 = OOoOl0i.I00000oIO.I00000oOI(Boolean.class);
                    try {
/* 65 */                o0O01O0oI00000oIO2 = OOoOl0i.I00000oIO(Boolean.TYPE);
                    } catch (Throwable unused2) {
                    }
/* 81 */            I0000O = new I1OoollI1Il1("SSEReconnectionRequestAttr", new OoOO010(o0IOli0o0I00000oOI2, o0O01O0oI00000oIO2));
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(Ii1olII1lO1 ii1olII1lO1, IOoilo iOoilo) throws Throwable {
                    OiIOO1 oiIOO1;
                    IOoOloI0iI iOoOloI0iI;
                    IoOIoo ioOIoo;
/* 3 */             if (iOoilo instanceof OiIOO1) {
/* 6 */                 oiIOO1 = (OiIOO1) iOoilo;
/* 8 */                 int i = oiIOO1.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oiIOO1.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oiIOO1 = new OiIOO1(iOoilo);
                        }
                    }
/* 25 */            Object objI00000oOI = oiIOO1.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oiIOO1.I00iio;
/* 34 */            if (i2 != 0) {
/* 36 */                if (i2 == 1) {
/* 53 */                    ioOIoo = oiIOO1.I00iOIl;
/* 55 */                    lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 140 */                   IoOIoo ioOIoo2 = IoOIoo.I00iiO;
/* 163 */                   throw new OiIIoOll0Il((Ii1olII1lO1) objI00000oOI, null, "Expected status code 200 but was " + ioOIoo.I00iOIl, 2);
                        }
/* 38 */                if (i2 != 2) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                    return null;
                        }
/* 46 */                iOoOloI0iI = oiIOO1.I00iiI;
/* 48 */                lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 225 */               throw new OiIIoOll0Il((Ii1olII1lO1) objI00000oOI, null, "Expected Content-Type " + IOoOiii0.I00000oOI + " but was " + iOoOloI0iI, 2);
                    }
/* 59 */            lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 62 */            IoOIoo ioOIooI0000O = ii1olII1lO1.I0000O();
/* 66 */            IOoOloI0iI iOoOloI0iII00000oIO = io0Iiol0ol1.I00000oIO(ii1olII1lO1);
/* 72 */            boolean zI0000O = O0000Ioio00.I0000O(ioOIooI0000O, IoOIoo.I00ilI0I1);
/* 76 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 78 */            if (!zI0000O) {
/* 120 */               if (O0000Ioio00.I0000O(ioOIooI0000O, IoOIoo.I00iiO)) {
/* 178 */                   if (!O0000Ioio00.I0000O(iOoOloI0iII00000oIO != null ? iOoOloI0iII00000oIO.I0000Il00O() : null, IOoOiii0.I00000oOI)) {
/* 180 */                       oiIOO1.I00iOIl = null;
/* 182 */                       oiIOO1.I00iiI = iOoOloI0iII00000oIO;
/* 184 */                       oiIOO1.I00iio = 2;
/* 186 */                       objI00000oOI = I00000oOI(ii1olII1lO1, oiIOO1);
/* 190 */                       if (objI00000oOI != ii0111o) {
/* 193 */                           iOoOloI0iI = iOoOloI0iII00000oIO;
/* 225 */                           throw new OiIIoOll0Il((Ii1olII1lO1) objI00000oOI, null, "Expected Content-Type " + IOoOiii0.I00000oOI + " but was " + iOoOloI0iI, 2);
                                }
                            }
                        } else {
/* 122 */                   oiIOO1.I00iOIl = ioOIooI0000O;
/* 124 */                   oiIOO1.I00iiI = null;
/* 126 */                   oiIOO1.I00iio = 1;
/* 128 */                   Object objI00000oOI2 = I00000oOI(ii1olII1lO1, oiIOO1);
/* 132 */                   if (objI00000oOI2 != ii0111o) {
/* 136 */                       objI00000oOI = objI00000oOI2;
/* 137 */                       ioOIoo = ioOIooI0000O;
/* 140 */                       IoOIoo ioOIoo22 = IoOIoo.I00iiO;
/* 163 */                       throw new OiIIoOll0Il((Ii1olII1lO1) objI00000oOI, null, "Expected status code 200 but was " + ioOIoo.I00iOIl, 2);
                            }
                        }
/* 192 */               return ii0111o;
                    }
/* 80 */            O1I1OOiol o1I1OOiol = I00000oIO;
/* 86 */            if (o1I1OOiol.I000II()) {
/* 110 */               o1I1OOiol.I000o00OoI0I("Receive status code NoContent for SSE request to " + io0OoioI0O1.I0000Il00O(ii1olII1lO1).getUrl());
/* 113 */               return ooiIlOl1iI;
                    }
/* 551 */           return ooiIlOl1iI;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(Ii1olII1lO1 ii1olII1lO1, IOoilo iOoilo) {
                    OiIOOI1 oiIOOI1;
/* 3 */             if (iOoilo instanceof OiIOOI1) {
/* 6 */                 oiIOOI1 = (OiIOOI1) iOoilo;
/* 8 */                 int i = oiIOOI1.I00iiI;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oiIOOI1.I00iiI = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oiIOOI1 = new OiIOOI1(iOoilo);
                        }
                    }
/* 25 */            Object objI00000oIO = oiIOOI1.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oiIOOI1.I00iiI;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 50 */                IoIlIolo10o ioIlIolo10oI00iOIl = ii1olII1lO1.I00iOIl();
/* 54 */                oiIOOI1.I00iiI = 1;
/* 56 */                objI00000oIO = lO0OOOl.I00000oIO(ioIlIolo10oI00iOIl, oiIOOI1);
/* 60 */                if (objI00000oIO == ii0111o) {
/* 62 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
                    }
/* 63 */            IoIlIolo10o ioIlIolo10o = (IoIlIolo10o) objI00000oIO;
/* 69 */            IOlOl10 attributes = ioIlIolo10o.I0000O().getAttributes();
/* 79 */            attributes.I0000Il00O().remove(IIIO11i.I00000oIO);
/* 82 */            return ioIlIolo10o.I0000oI00();
                }
            }
