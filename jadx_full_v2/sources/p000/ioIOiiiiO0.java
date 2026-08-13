            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class ioIOiiiiO0 {
                public static final ioIOiiiiO0 I0000Il00O;
                public iiOlilo0IIIl I00000oIO;
                public ConcurrentHashMap I00000oOI;

                static {
                    io0lI0 io0li0;
/* 3 */             ioIOiiiiO0 ioioiiiio0 = new ioIOiiiiO0();
/* 11 */            ioioiiiio0.I00000oOI = new ConcurrentHashMap();
                    try {
/* 34 */                io0li0 = (io0lI0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                    } catch (Exception unused) {
/* 37 */                io0li0 = iiOlilo0IIIl.I00ilI0I1;
                    }
/* 40 */            io0lI0[] io0li0Arr = {ilO11o0Ol.I00000oOI, io0li0};
/* 50 */            iloli1Io iloli1io = new iloli1Io();
/* 53 */            iloli1io.I00000oIO = io0li0Arr;
/* 55 */            VarHandle.storeStoreFence();
/* 58 */            iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 61 */            Charset charset = ililOO0.I00000oIO;
/* 63 */            iiolilo0iiil.I00iOIl = iloli1io;
/* 65 */            VarHandle.storeStoreFence();
/* 68 */            ioioiiiio0.I00000oIO = iiolilo0iiil;
/* 70 */            VarHandle.storeStoreFence();
/* 73 */            I0000Il00O = ioioiiiio0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final ioO0I1oi1lio I00000oIO(Class cls) {
                    io1ii1oO1iO io1ii1oo1ioI001lIiIIo1O;
                    Class cls2;
/* 1 */             Charset charset = ililOO0.I00000oIO;
/* 4 */             if (cls == null) {
/* 217 */               IOOlIIilOl0.I000II("messageType");
/* 3 */                 return null;
                    }
/* 6 */             ConcurrentHashMap concurrentHashMap = this.I00000oOI;
/* 12 */            ioO0I1oi1lio ioo0i1oi1lio = (ioO0I1oi1lio) concurrentHashMap.get(cls);
/* 14 */            if (ioo0i1oi1lio != null) {
/* 214 */               return ioo0i1oi1lio;
                    }
/* 16 */            iiOlilo0IIIl iiolilo0iiil = this.I00000oIO;
/* 18 */            iiolilo0iiil.getClass();
/* 21 */            Class cls3 = ioOi0IO.I00000oIO;
/* 29 */            if (!ilOl10.class.isAssignableFrom(cls) && (cls2 = ioOi0IO.I00000oIO) != null && !cls2.isAssignableFrom(cls)) {
/* 44 */                I000II.I000iOII("Message classes must extend GeneratedMessage or GeneratedMessageLite");
/* 3 */                 return null;
                    }
/* 52 */            ioIloOilIii ioilooiliiiZzb = ((iloli1Io) iiolilo0iiil.I00iOIl).zzb(cls);
/* 68 */            if ((ioilooiliiiZzb.I0000O & 2) == 2) {
/* 74 */                if (ilOl10.class.isAssignableFrom(cls)) {
/* 76 */                    iooO1IiiOoOo iooo1iiioooo = ioOi0IO.I0000Il00O;
/* 78 */                    ilIIl0iIloiI iliil0iiloii = ilIi11Iloi.I00000oIO;
/* 80 */                    iilO1O iilo1o = ioilooiliiiZzb.I00000oIO;
/* 84 */                    io1llo01OI io1llo01oi = new io1llo01OI();
/* 87 */                    io1llo01oi.I00000oOI = iooo1iiioooo;
/* 89 */                    io1llo01oi.I00000oIO = iilo1o;
/* 91 */                    VarHandle.storeStoreFence();
                            io1ii1oo1ioI001lIiIIo1O = io1llo01oi;
                        } else {
/* 95 */                    iooO1IiiOoOo iooo1iiioooo2 = ioOi0IO.I00000oOI;
/* 99 */                    if (ilIi11Iloi.I00000oOI == null) {
/* 117 */                       I000II.I001IO000("Protobuf runtime is not correctly loaded.");
/* 3 */                         return null;
                            }
/* 101 */                   iilO1O iilo1o2 = ioilooiliiiZzb.I00000oIO;
/* 105 */                   io1llo01OI io1llo01oi2 = new io1llo01OI();
/* 108 */                   io1llo01oi2.I00000oOI = iooo1iiioooo2;
/* 110 */                   io1llo01oi2.I00000oIO = iilo1o2;
/* 112 */                   VarHandle.storeStoreFence();
/* 115 */                   io1ii1oo1ioI001lIiIIo1O = io1llo01oi2;
                        }
                    } else if (ilOl10.class.isAssignableFrom(cls)) {
/* 133 */               if (ioilooiliiiZzb.I00000oIO() - 1 != 1) {
/* 135 */                   int i = ioI11O.I00000oIO;
/* 137 */                   ilo1liIi ilo1liii = iloOil0O1.I00000oOI;
/* 139 */                   iooO1IiiOoOo iooo1iiioooo3 = ioOi0IO.I0000Il00O;
/* 141 */                   ilIIl0iIloiI iliil0iiloii2 = ilIi11Iloi.I00000oIO;
/* 143 */                   int i2 = io0O0100o.I00000oIO;
/* 145 */                   io1ii1oo1ioI001lIiIIo1O = io1ii1oO1iO.I001lIiIIo1O(ioilooiliiiZzb, ilo1liii, iooo1iiioooo3, iliil0iiloii2);
                        } else {
/* 150 */                   int i3 = ioI11O.I00000oIO;
/* 152 */                   ilo1liIi ilo1liii2 = iloOil0O1.I00000oOI;
/* 154 */                   iooO1IiiOoOo iooo1iiioooo4 = ioOi0IO.I0000Il00O;
/* 156 */                   int i4 = io0O0100o.I00000oIO;
/* 158 */                   io1ii1oo1ioI001lIiIIo1O = io1ii1oO1iO.I001lIiIIo1O(ioilooiliiiZzb, ilo1liii2, iooo1iiioooo4, null);
                        }
                    } else if (ioilooiliiiZzb.I00000oIO() - 1 != 1) {
/* 171 */               int i5 = ioI11O.I00000oIO;
/* 173 */               ilo011li0I ilo011li0i = iloOil0O1.I00000oIO;
/* 175 */               iooO1IiiOoOo iooo1iiioooo5 = ioOi0IO.I00000oOI;
/* 177 */               ilIIl0iIloiI iliil0iiloii3 = ilIi11Iloi.I00000oOI;
/* 179 */               if (iliil0iiloii3 == null) {
/* 188 */                   I000II.I001IO000("Protobuf runtime is not correctly loaded.");
/* 3 */                     return null;
                        }
/* 181 */               int i6 = io0O0100o.I00000oIO;
/* 183 */               io1ii1oo1ioI001lIiIIo1O = io1ii1oO1iO.I001lIiIIo1O(ioilooiliiiZzb, ilo011li0i, iooo1iiioooo5, iliil0iiloii3);
                    } else {
/* 192 */               int i7 = ioI11O.I00000oIO;
/* 194 */               ilo011li0I ilo011li0i2 = iloOil0O1.I00000oIO;
/* 196 */               iooO1IiiOoOo iooo1iiioooo6 = ioOi0IO.I00000oOI;
/* 198 */               int i8 = io0O0100o.I00000oIO;
/* 200 */               io1ii1oo1ioI001lIiIIo1O = io1ii1oO1iO.I001lIiIIo1O(ioilooiliiiZzb, ilo011li0i2, iooo1iiioooo6, null);
                    }
/* 208 */           ioO0I1oi1lio ioo0i1oi1lio2 = (ioO0I1oi1lio) concurrentHashMap.putIfAbsent(cls, io1ii1oo1ioI001lIiIIo1O);
                    return ioo0i1oi1lio2 == null ? io1ii1oo1ioI001lIiIIo1O : ioo0i1oi1lio2;
                }
            }
