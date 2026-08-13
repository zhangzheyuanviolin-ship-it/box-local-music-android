            package p000;

            import java.util.Iterator;
            import java.util.List;
            
            public abstract class IoIiolOl00 {
                public static final O1I1OOiol I00000oIO = O1I1lilOlO0I.I00000oOI("io.ktor.client.plugins.HttpCallValidator");
                public static final IOO000ilo I00000oOI = il00O1lo1oOi.I00000oIO(IoIiO1O.I00ioIO, "HttpResponseValidator", new IoI0IiI0(3));
                public static final I1OoollI1Il1 I0000Il00O;

                static {
                    O0O01O0o o0O01O0oI00000oIO;
/* 29 */            O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(Boolean.class);
                    try {
/* 35 */                o0O01O0oI00000oIO = OOoOl0i.I00000oIO(Boolean.TYPE);
                    } catch (Throwable unused) {
/* 40 */                o0O01O0oI00000oIO = null;
                    }
/* 53 */            I0000Il00O = new I1OoollI1Il1("ExpectSuccessAttributeKey", new OoOO010(o0IOli0o0I00000oOI, o0O01O0oI00000oIO));
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(List list, Throwable th, IoO10Iooo0 ioO10Iooo0, IOoilo iOoilo) {
                    IoIiioiolOI ioIiioiolOI;
                    Iterator it;
/* 3 */             if (iOoilo instanceof IoIiioiolOI) {
/* 6 */                 ioIiioiolOI = (IoIiioiolOI) iOoilo;
/* 8 */                 int i = ioIiioiolOI.I00iiI;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioIiioiolOI.I00iiI = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioIiioiolOI = new IoIiioiolOI(iOoilo);
                        }
                    }
/* 25 */            Object obj = ioIiioiolOI.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ioIiioiolOI.I00iiI;
/* 31 */            if (i2 == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(obj);
/* 82 */                I00000oIO.I000o00OoI0I("Processing exception " + th + " for request " + ioO10Iooo0.getUrl());
/* 87 */                it = list.iterator();
                    } else if (i2 != 1 && i2 != 2) {
/* 45 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 48 */                return;
                    } else {
/* 39 */                lIoii1l01l0i.I00000oOI(obj);
/* 49 */                it = null;
                    }
/* 95 */            if (it.hasNext()) {
/* 102 */               if (it.next() == null) {
/* 104 */                   I000II.I00000oIO();
                        } else {
/* 108 */                   OIiilo1Ool0o.I00000oIO();
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(List list, Ii1olII1lO1 ii1olII1lO1, IOoilo iOoilo) throws Throwable {
                    IoIilIIiOiO ioIilIIiOiO;
                    Iterator it;
                    int i;
                    Ii1olII1lO1 ii1olII1lO12;
/* 3 */             if (iOoilo instanceof IoIilIIiOiO) {
/* 6 */                 ioIilIIiOiO = (IoIilIIiOiO) iOoilo;
/* 8 */                 int i2 = ioIilIIiOiO.I00ilI0I1;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    ioIilIIiOiO.I00ilI0I1 = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ioIilIIiOiO = new IoIilIIiOiO(iOoilo);
                        }
                    }
/* 25 */            Object obj = ioIilIIiOiO.I00iio;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = ioIilIIiOiO.I00ilI0I1;
/* 32 */            if (i3 == 0) {
/* 54 */                lIoii1l01l0i.I00000oOI(obj);
/* 85 */                I00000oIO.I000o00OoI0I("Validating response for request " + ii1olII1lO1.I00iOIl().I0000O().getUrl());
/* 90 */                it = list.iterator();
/* 97 */                i = 0;
/* 98 */                ii1olII1lO12 = ii1olII1lO1;
                    } else {
/* 34 */                if (i3 != 1) {
/* 49 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 52 */                    return null;
                        }
/* 36 */                i = ioIilIIiOiO.I00iiO;
/* 38 */                it = ioIilIIiOiO.I00iiI;
/* 40 */                Ii1olII1lO1 ii1olII1lO13 = ioIilIIiOiO.I00iOIl;
/* 42 */                lIoii1l01l0i.I00000oOI(obj);
/* 45 */                ii1olII1lO12 = ii1olII1lO13;
                    }
/* 103 */           while (it.hasNext()) {
/* 109 */               IlliIl1l11O illiIl1l11O = (IlliIl1l11O) it.next();
/* 111 */               ioIilIIiOiO.I00iOIl = ii1olII1lO12;
/* 113 */               ioIilIIiOiO.I00iiI = it;
/* 115 */               ioIilIIiOiO.I00iiO = i;
/* 117 */               ioIilIIiOiO.I00ilI0I1 = 1;
/* 123 */               if (illiIl1l11O.invoke(ii1olII1lO12, ioIilIIiOiO) == ii0111o) {
/* 125 */                   return ii0111o;
                        }
                    }
/* 126 */           return OoiIlOl1iI.I00000oIO;
                }
            }
