            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class OOi1oI {
                public static final OOi1oI I0000Il00O;
                public O1OIll00i I00000oIO;
                public ConcurrentHashMap I00000oOI;

                static {
                    O1l1liOO o1l1liOO;
/* 3 */             OOi1oI oOi1oI = new OOi1oI();
/* 11 */            oOi1oI.I00000oOI = new ConcurrentHashMap();
                    try {
/* 34 */                o1l1liOO = (O1l1liOO) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                    } catch (Exception unused) {
/* 37 */                o1l1liOO = O1OIll00i.I00iiO;
                    }
/* 40 */            O1l1liOO[] o1l1liOOArr = {IloooOIO.I00000oOI, o1l1liOO};
/* 50 */            O1OIlOol0O0 o1OIlOol0O0 = new O1OIlOol0O0();
/* 53 */            o1OIlOol0O0.I00000oIO = o1l1liOOArr;
/* 55 */            O1OIll00i o1OIll00i = new O1OIll00i(0);
/* 58 */            Charset charset = IoolIIolo1lI.I00000oIO;
/* 60 */            o1OIll00i.I00iiI = o1OIlOol0O0;
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            oOi1oI.I00000oIO = o1OIll00i;
/* 67 */            VarHandle.storeStoreFence();
/* 70 */            I0000Il00O = oOi1oI;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final OiOIlIo I00000oIO(Class cls) {
                    Il1o0O il1o0O;
                    O1lIoOI o1lIoOII001i1O0Ol;
                    Class cls2;
/* 3 */             IoolIIolo1lI.I00000oIO("messageType", cls);
/* 6 */             ConcurrentHashMap concurrentHashMap = this.I00000oOI;
/* 12 */            OiOIlIo oiOIlIo = (OiOIlIo) concurrentHashMap.get(cls);
/* 14 */            if (oiOIlIo != null) {
/* 437 */               return oiOIlIo;
                    }
/* 16 */            O1OIll00i o1OIll00i = this.I00000oIO;
/* 18 */            o1OIll00i.getClass();
/* 21 */            Class cls3 = OiOO1Ioo.I00000oIO;
/* 30 */            if (!Io00l0.class.isAssignableFrom(cls) && (cls2 = OiOO1Ioo.I00000oIO) != null && !cls2.isAssignableFrom(cls)) {
/* 45 */                I000II.I000iOII("Message classes must extend GeneratedMessage or GeneratedMessageLite");
/* 29 */                return null;
                    }
/* 53 */            OOlI0Ol oOlI0OlI00000oIO = ((O1OIlOol0O0) o1OIll00i.I00iiI).I00000oIO(cls);
/* 69 */            if ((oOlI0OlI00000oIO.I0000O & 2) == 2) {
/* 75 */                if (Io00l0.class.isAssignableFrom(cls)) {
/* 77 */                    OoiO0oloIiI ooiO0oloIiI = OiOO1Ioo.I0000Il00O;
/* 79 */                    Il1o0O il1o0O2 = Il1o1I0.I00000oIO;
/* 81 */                    I01Ilo0i i01Ilo0i = oOlI0OlI00000oIO.I00000oIO;
/* 85 */                    O1lOIooO0 o1lOIooO0 = new O1lOIooO0();
/* 88 */                    o1lOIooO0.I00000oOI = ooiO0oloIiI;
/* 90 */                    o1lOIooO0.I0000Il00O = il1o0O2;
/* 92 */                    o1lOIooO0.I00000oIO = i01Ilo0i;
/* 94 */                    VarHandle.storeStoreFence();
                            o1lIoOII001i1O0Ol = o1lOIooO0;
                        } else {
/* 98 */                    OoiO0oloIiI ooiO0oloIiI2 = OiOO1Ioo.I00000oOI;
/* 100 */                   Il1o0O il1o0O3 = Il1o1I0.I00000oOI;
/* 102 */                   if (il1o0O3 == null) {
/* 121 */                       I000II.I001IO000("Protobuf runtime is not correctly loaded.");
/* 29 */                        return null;
                            }
/* 104 */                   I01Ilo0i i01Ilo0i2 = oOlI0OlI00000oIO.I00000oIO;
/* 108 */                   O1lOIooO0 o1lOIooO02 = new O1lOIooO0();
/* 111 */                   o1lOIooO02.I00000oOI = ooiO0oloIiI2;
/* 113 */                   o1lOIooO02.I0000Il00O = il1o0O3;
/* 115 */                   o1lOIooO02.I00000oIO = i01Ilo0i2;
/* 117 */                   VarHandle.storeStoreFence();
                            o1lIoOII001i1O0Ol = o1lOIooO02;
                        }
                    } else if (Io00l0.class.isAssignableFrom(cls)) {
/* 153 */               o1lIoOII001i1O0Ol = O1lIoOI.I001i1O0Ol(oOlI0OlI00000oIO, OIIiOIl0O.I00000oOI, O10II10OillI.I00000oOI, OiOO1Ioo.I0000Il00O, IIlIOloOOO.I001lIiIIo1O(oOlI0OlI00000oIO.I00000oIO()) != 1 ? Il1o1I0.I00000oIO : null, O1Oi1oIi0.I00000oOI);
                    } else {
/* 159 */               OIIi0ol oIIi0ol = OIIiOIl0O.I00000oIO;
/* 161 */               O10I0o o10I0o = O10II10OillI.I00000oIO;
/* 163 */               OoiO0oloIiI ooiO0oloIiI3 = OiOO1Ioo.I00000oOI;
/* 173 */               if (IIlIOloOOO.I001lIiIIo1O(oOlI0OlI00000oIO.I00000oIO()) != 1) {
/* 175 */                   Il1o0O il1o0O4 = Il1o1I0.I00000oOI;
/* 177 */                   if (il1o0O4 == null) {
/* 181 */                       I000II.I001IO000("Protobuf runtime is not correctly loaded.");
/* 29 */                        return null;
                            }
/* 179 */                   il1o0O = il1o0O4;
                        } else {
/* 185 */                   il1o0O = null;
                        }
/* 188 */               o1lIoOII001i1O0Ol = O1lIoOI.I001i1O0Ol(oOlI0OlI00000oIO, oIIi0ol, o10I0o, ooiO0oloIiI3, il1o0O, O1Oi1oIi0.I00000oIO);
                    }
/* 196 */           OiOIlIo oiOIlIo2 = (OiOIlIo) concurrentHashMap.putIfAbsent(cls, o1lIoOII001i1O0Ol);
                    return oiOIlIo2 != null ? oiOIlIo2 : o1lIoOII001i1O0Ol;
                }
            }
