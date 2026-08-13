            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class OOi1o101lI {
                public static final OOi1o101lI I0000Il00O;
                public IIOOoll I00000oIO;
                public ConcurrentHashMap I00000oOI;

                static {
                    O1l1iiII1I o1l1iiII1I;
/* 3 */             OOi1o101lI oOi1o101lI = new OOi1o101lI();
/* 11 */            oOi1o101lI.I00000oOI = new ConcurrentHashMap();
/* 17 */            Class cls = I0lI0Ooo.I00000oIO;
                    try {
/* 36 */                o1l1iiII1I = (O1l1iiII1I) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                    } catch (Exception unused) {
/* 39 */                o1l1iiII1I = IIOOoll.I00iiO;
                    }
/* 42 */            O1l1iiII1I[] o1l1iiII1IArr = {IloooO0oI0l1.I00000oOI, o1l1iiII1I};
/* 52 */            O1OIlO0IlI o1OIlO0IlI = new O1OIlO0IlI();
/* 55 */            o1OIlO0IlI.I00000oIO = o1l1iiII1IArr;
/* 57 */            IIOOoll iIOOoll = new IIOOoll(1);
/* 60 */            byte[] bArr = Iool1iioooil.I00000oIO;
/* 62 */            iIOOoll.I00iiI = o1OIlO0IlI;
/* 64 */            VarHandle.storeStoreFence();
/* 67 */            oOi1o101lI.I00000oIO = iIOOoll;
/* 69 */            VarHandle.storeStoreFence();
/* 72 */            I0000Il00O = oOi1o101lI;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final OiOIl0 I00000oIO(Class cls) {
                    Il1o0Io il1o0Io;
                    O1lIoIO o1lIoIOI001i1O0Ol;
/* 1 */             ConcurrentHashMap concurrentHashMap = this.I00000oOI;
/* 3 */             Object obj = concurrentHashMap.get(cls);
/* 7 */             if (obj != null) {
/* 203 */               return (OiOIl0) obj;
                    }
/* 9 */             IIOOoll iIOOoll = this.I00000oIO;
/* 11 */            iIOOoll.getClass();
/* 14 */            Class cls2 = OiOO0oO1Io.I00000oIO;
/* 23 */            if (!Io00Ol1o10O.class.isAssignableFrom(cls)) {
/* 25 */                Class cls3 = I0lI0Ooo.I00000oIO;
/* 27 */                Class cls4 = OiOO0oO1Io.I00000oIO;
/* 29 */                if (cls4 != null && !cls4.isAssignableFrom(cls)) {
/* 40 */                    I000II.I000iOII("Message classes must extend GeneratedMessage or GeneratedMessageLite");
/* 22 */                    return null;
                        }
                    }
/* 48 */            OOlI00I oOlI00II00000oIO = ((O1OIlO0IlI) iIOOoll.I00iiI).I00000oIO(cls);
/* 64 */            if ((oOlI00II00000oIO.I0000O & 2) == 2) {
/* 66 */                Class cls5 = I0lI0Ooo.I00000oIO;
/* 72 */                if (Io00Ol1o10O.class.isAssignableFrom(cls)) {
/* 74 */                    OoiO0oOll0oO ooiO0oOll0oO = OiOO0oO1Io.I0000Il00O;
/* 76 */                    Il1o0Io il1o0Io2 = Il1o11l11iOO.I00000oIO;
/* 78 */                    I01IlIoOI i01IlIoOI = oOlI00II00000oIO.I00000oIO;
/* 82 */                    O1lOIIo00ll o1lOIIo00ll = new O1lOIIo00ll();
/* 85 */                    o1lOIIo00ll.I00000oOI = ooiO0oOll0oO;
/* 87 */                    o1lOIIo00ll.I0000Il00O = il1o0Io2;
/* 89 */                    o1lOIIo00ll.I00000oIO = i01IlIoOI;
/* 91 */                    VarHandle.storeStoreFence();
                            o1lIoIOI001i1O0Ol = o1lOIIo00ll;
                        } else {
/* 95 */                    OoiO0oOll0oO ooiO0oOll0oO2 = OiOO0oO1Io.I00000oOI;
/* 97 */                    Il1o0Io il1o0Io3 = Il1o11l11iOO.I00000oOI;
/* 99 */                    if (il1o0Io3 == null) {
/* 118 */                       I000II.I001IO000("Protobuf runtime is not correctly loaded.");
/* 22 */                        return null;
                            }
/* 101 */                   I01IlIoOI i01IlIoOI2 = oOlI00II00000oIO.I00000oIO;
/* 105 */                   O1lOIIo00ll o1lOIIo00ll2 = new O1lOIIo00ll();
/* 108 */                   o1lOIIo00ll2.I00000oOI = ooiO0oOll0oO2;
/* 110 */                   o1lOIIo00ll2.I0000Il00O = il1o0Io3;
/* 112 */                   o1lOIIo00ll2.I00000oIO = i01IlIoOI2;
/* 114 */                   VarHandle.storeStoreFence();
                            o1lIoIOI001i1O0Ol = o1lOIIo00ll2;
                        }
                    } else {
/* 122 */               Class cls6 = I0lI0Ooo.I00000oIO;
/* 128 */               if (Io00Ol1o10O.class.isAssignableFrom(cls)) {
/* 152 */                   o1lIoIOI001i1O0Ol = O1lIoIO.I001i1O0Ol(oOlI00II00000oIO, OIIiIo1iOlo1.I00000oOI, O10I1OilO1I.I00000oOI, OiOO0oO1Io.I0000Il00O, IIlIOloOOO.I001lIiIIo1O(oOlI00II00000oIO.I00000oIO()) != 1 ? Il1o11l11iOO.I00000oIO : null, O1Oi1iII.I00000oOI);
                        } else {
/* 158 */                   OIIOooO oIIOooO = OIIiIo1iOlo1.I00000oIO;
/* 160 */                   O10I0l0OO o10I0l0OO = O10I1OilO1I.I00000oIO;
/* 162 */                   OoiO0oOll0oO ooiO0oOll0oO3 = OiOO0oO1Io.I00000oOI;
/* 172 */                   if (IIlIOloOOO.I001lIiIIo1O(oOlI00II00000oIO.I00000oIO()) != 1) {
/* 174 */                       Il1o0Io il1o0Io4 = Il1o11l11iOO.I00000oOI;
/* 176 */                       if (il1o0Io4 == null) {
/* 180 */                           I000II.I001IO000("Protobuf runtime is not correctly loaded.");
/* 22 */                            return null;
                                }
/* 178 */                       il1o0Io = il1o0Io4;
                            } else {
/* 184 */                       il1o0Io = null;
                            }
/* 187 */                   o1lIoIOI001i1O0Ol = O1lIoIO.I001i1O0Ol(oOlI00II00000oIO, oIIOooO, o10I0l0OO, ooiO0oOll0oO3, il1o0Io, O1Oi1iII.I00000oIO);
                        }
                    }
/* 191 */           byte[] bArr = Iool1iioooil.I00000oIO;
/* 197 */           OiOIl0 oiOIl0 = (OiOIl0) concurrentHashMap.putIfAbsent(cls, o1lIoIOI001i1O0Ol);
                    return oiOIl0 != null ? oiOIl0 : o1lIoIOI001i1O0Ol;
                }
            }
