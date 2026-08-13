            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class OOi1lIO1Oi {
                public static final OOi1lIO1Oi I0000Il00O;
                public Oi1ol0llI I00000oIO;
                public ConcurrentHashMap I00000oOI;

                static {
                    O1l1iIio o1l1iIio;
/* 3 */             OOi1lIO1Oi oOi1lIO1Oi = new OOi1lIO1Oi();
/* 11 */            oOi1lIO1Oi.I00000oOI = new ConcurrentHashMap();
                    try {
/* 34 */                o1l1iIio = (O1l1iIio) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                    } catch (Exception unused) {
/* 37 */                o1l1iIio = Oi1ol0llI.I00ilI0I1;
                    }
/* 40 */            O1l1iIio[] o1l1iIioArr = {IloolOiO0.I00000oOI, o1l1iIio};
/* 50 */            O1OIiO1l o1OIiO1l = new O1OIiO1l();
/* 53 */            o1OIiO1l.I00000oIO = o1l1iIioArr;
/* 55 */            Oi1ol0llI oi1ol0llI = new Oi1ol0llI(1, false);
/* 58 */            Charset charset = Iool1iOO11.I00000oIO;
/* 60 */            oi1ol0llI.I00iiI = o1OIiO1l;
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            oOi1lIO1Oi.I00000oIO = oi1ol0llI;
/* 67 */            VarHandle.storeStoreFence();
/* 70 */            I0000Il00O = oOi1lIO1Oi;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final OiOIiIO0 I00000oIO(Class cls) {
                    O1lIoI o1lIoII001iOo1i0O;
                    Class cls2;
/* 3 */             Iool1iOO11.I00000oIO("messageType", cls);
/* 6 */             ConcurrentHashMap concurrentHashMap = this.I00000oOI;
/* 12 */            OiOIiIO0 oiOIiIO0 = (OiOIiIO0) concurrentHashMap.get(cls);
/* 14 */            if (oiOIiIO0 != null) {
/* 966 */               return oiOIiIO0;
                    }
/* 16 */            Oi1ol0llI oi1ol0llI = this.I00000oIO;
/* 18 */            oi1ol0llI.getClass();
/* 21 */            Class cls3 = OiOO0o1I0.I00000oIO;
/* 30 */            if (!Io00Io0IO11.class.isAssignableFrom(cls) && (cls2 = OiOO0o1I0.I00000oIO) != null && !cls2.isAssignableFrom(cls)) {
/* 45 */                I000II.I000iOII("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
/* 29 */                return null;
                    }
/* 53 */            OOl1oi1OO oOl1oi1OOI00000oIO = ((O1OIiO1l) oi1ol0llI.I00iiI).I00000oIO(cls);
/* 69 */            if ((oOl1oi1OOI00000oIO.I0000O & 2) == 2) {
/* 75 */                if (Io00Io0IO11.class.isAssignableFrom(cls)) {
/* 77 */                    OoiO0li ooiO0li = OiOO0o1I0.I0000O;
/* 79 */                    Il1o000oI0o il1o000oI0o = Il1o0OilI01.I00000oIO;
/* 81 */                    I01Iio10lo i01Iio10lo = oOl1oi1OOI00000oIO.I00000oIO;
/* 85 */                    O1lO1iOO o1lO1iOO = new O1lO1iOO();
/* 88 */                    o1lO1iOO.I00000oOI = ooiO0li;
/* 90 */                    o1lO1iOO.I0000Il00O = il1o000oI0o;
/* 92 */                    o1lO1iOO.I00000oIO = i01Iio10lo;
/* 94 */                    VarHandle.storeStoreFence();
                            o1lIoII001iOo1i0O = o1lO1iOO;
                        } else {
/* 98 */                    OoiO0li ooiO0li2 = OiOO0o1I0.I00000oOI;
/* 100 */                   Il1o000oI0o il1o000oI0o2 = Il1o0OilI01.I00000oOI;
/* 102 */                   if (il1o000oI0o2 == null) {
/* 121 */                       I000II.I001IO000("Protobuf runtime is not correctly loaded.");
/* 29 */                        return null;
                            }
/* 104 */                   I01Iio10lo i01Iio10lo2 = oOl1oi1OOI00000oIO.I00000oIO;
/* 108 */                   O1lO1iOO o1lO1iOO2 = new O1lO1iOO();
/* 111 */                   o1lO1iOO2.I00000oOI = ooiO0li2;
/* 113 */                   o1lO1iOO2.I0000Il00O = il1o000oI0o2;
/* 115 */                   o1lO1iOO2.I00000oIO = i01Iio10lo2;
/* 117 */                   VarHandle.storeStoreFence();
                            o1lIoII001iOo1i0O = o1lO1iOO2;
                        }
                    } else if (Io00Io0IO11.class.isAssignableFrom(cls)) {
/* 160 */               o1lIoII001iOo1i0O = (oOl1oi1OOI00000oIO.I0000O & 1) == 1 ? O1lIoI.I001iOo1i0O(oOl1oi1OOI00000oIO, OIIi1Oio.I00000oOI, O101ol1lilo0.I00000oOI, OiOO0o1I0.I0000O, Il1o0OilI01.I00000oIO, O1Oi1Oii11.I00000oOI) : O1lIoI.I001iOo1i0O(oOl1oi1OOI00000oIO, OIIi1Oio.I00000oOI, O101ol1lilo0.I00000oOI, OiOO0o1I0.I0000O, null, O1Oi1Oii11.I00000oOI);
                    } else if ((oOl1oi1OOI00000oIO.I0000O & 1) == 1) {
/* 170 */               OIIOo1oii oIIOo1oii = OIIi1Oio.I00000oIO;
/* 172 */               O101oi o101oi = O101ol1lilo0.I00000oIO;
/* 174 */               OoiO0li ooiO0li3 = OiOO0o1I0.I00000oOI;
/* 176 */               Il1o000oI0o il1o000oI0o3 = Il1o0OilI01.I00000oOI;
/* 178 */               if (il1o000oI0o3 == null) {
/* 187 */                   I000II.I001IO000("Protobuf runtime is not correctly loaded.");
/* 29 */                    return null;
                        }
/* 182 */               o1lIoII001iOo1i0O = O1lIoI.I001iOo1i0O(oOl1oi1OOI00000oIO, oIIOo1oii, o101oi, ooiO0li3, il1o000oI0o3, O1Oi1Oii11.I00000oIO);
                    } else {
/* 200 */               o1lIoII001iOo1i0O = O1lIoI.I001iOo1i0O(oOl1oi1OOI00000oIO, OIIi1Oio.I00000oIO, O101ol1lilo0.I00000oIO, OiOO0o1I0.I0000Il00O, null, O1Oi1Oii11.I00000oIO);
                    }
/* 208 */           OiOIiIO0 oiOIiIO02 = (OiOIiIO0) concurrentHashMap.putIfAbsent(cls, o1lIoII001iOo1i0O);
                    return oiOIiIO02 != null ? oiOIiIO02 : o1lIoII001iOo1i0O;
                }
            }
