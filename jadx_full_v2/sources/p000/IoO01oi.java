            package p000;

            import java.nio.charset.Charset;
            import java.util.Collection;
            import java.util.List;
            import kotlin.jvm.functions.Function3;
            
/* 15 */    public final class IoO01oi extends Oll0io implements Function3 {
                public final int I00iOIl = 1;
                public Object I00iiI;
                public Object I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IoO01oi(O1o10Iiio o1o10Iiio, I0IlIoI1oi0 i0IlIoI1oi0, O1oIOiI11o0 o1oIOiI11o0, List list, IOoil1iiIilo iOoil1iiIilo) {
/* 13 */            super(3, iOoil1iiIilo);
/* 4 */             this.I00iiI = o1o10Iiio;
/* 6 */             this.I00iiO = i0IlIoI1oi0;
/* 8 */             this.I00iio = o1oIOiI11o0;
/* 10 */            this.I00ilI0I1 = list;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Object obj4 = this.I00ilI0I1;
/* 7 */             Object obj5 = this.I00iio;
                    switch (i) {
                        case 0:
/* 54 */                    IoO01oi ioO01oi = new IoO01oi((String) obj5, (Charset) obj4, (IOoil1iiIilo) obj3);
/* 57 */                    ioO01oi.I00iiI = (IoO10oI0o) obj;
/* 59 */                    ioO01oi.I00iiO = obj2;
/* 61 */                    return ioO01oi.invokeSuspend(ooiIlOl1iI);
                        default:
/* 40 */                    new IoO01oi((O1o10Iiio) this.I00iiI, (I0IlIoI1oi0) this.I00iiO, (O1oIOiI11o0) obj5, (List) obj4, (IOoil1iiIilo) obj3).invokeSuspend(ooiIlOl1iI);
/* 43 */                    return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IOoOloI0iI iOoOloI0iII00000oIO;
                    Charset charsetI00000oIO;
/* 1 */             int i = this.I00iOIl;
/* 4 */             Object obj2 = this.I00ilI0I1;
/* 6 */             Object obj3 = this.I00iio;
                    switch (i) {
                        case 0:
/* 71 */                    IoO10oI0o ioO10oI0o = (IoO10oI0o) this.I00iiI;
/* 73 */                    Object obj4 = this.I00iiO;
/* 75 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 77 */                    lIoii1l01l0i.I00000oOI(obj);
/* 80 */                    String str = (String) obj3;
/* 82 */                    O1I1OOiol o1I1OOiol = IoO0O10O11.I00000oIO;
/* 84 */                    if (str != null && ioO10oI0o.I0000Il00O.I00oII("Accept-Charset") == null) {
/* 97 */                        O1I1OOiol o1I1OOiol2 = IoO0O10O11.I00000oIO;
/* 103 */                       StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Adding Accept-Charset=", str, " to ");
/* 109 */                       sbI001IIilI0O.append(ioO10oI0o.I00000oIO);
/* 116 */                       o1I1OOiol2.I000o00OoI0I(sbI001IIilI0O.toString());
/* 119 */                       Io1O0I1i io1O0I1i = ioO10oI0o.I0000Il00O;
/* 121 */                       io1O0I1i.I010I0(str);
/* 124 */                       List listI00oI0i = io1O0I1i.I00oI0i("Accept-Charset");
/* 128 */                       listI00oI0i.clear();
/* 131 */                       listI00oI0i.add(str);
                            }
/* 136 */                   if (!(obj4 instanceof String)) {
/* 3 */                         return null;
                            }
/* 144 */                   String strI00oII = ioO10oI0o.I0000Il00O.I00oII("Content-Type");
/* 148 */                   if (strI00oII != null) {
/* 150 */                       IOoOloI0iI iOoOloI0iI = IOoOloI0iI.I0000oI00;
/* 152 */                       iOoOloI0iII00000oIO = iioIIll1.I00000oIO(strI00oII);
                            } else {
/* 157 */                       iOoOloI0iII00000oIO = null;
                            }
/* 158 */                   if (iOoOloI0iII00000oIO != null && !O0000Ioio00.I0000O(iOoOloI0iII00000oIO.I0000Il00O, IOoOiii0.I00000oIO.I0000Il00O)) {
/* 3 */                         return null;
                            }
/* 174 */                   Charset charset = (Charset) obj2;
/* 176 */                   String str2 = (String) obj4;
/* 183 */                   IOoOloI0iI iOoOloI0iI2 = iOoOloI0iII00000oIO == null ? IOoOiii0.I00000oIO : iOoOloI0iII00000oIO;
/* 184 */                   if (iOoOloI0iII00000oIO != null && (charsetI00000oIO = IOoi00l.I00000oIO(iOoOloI0iII00000oIO)) != null) {
/* 193 */                       charset = charsetI00000oIO;
                            }
/* 220 */                   IoO0O10O11.I00000oIO.I000o00OoI0I("Sending request body to " + ioO10oI0o.I00000oIO + " as text/plain with charset " + charset);
/* 225 */                   int i2 = IOoi00l.I00000oIO;
/* 227 */                   String strName = charset.name();
/* 231 */                   List list = iOoOloI0iI2.I00000oOI;
/* 233 */                   int size = list.size();
/* 239 */                   if (size == 0) {
/* 336 */                       iOoOloI0iI2 = new IOoOloI0iI(iOoOloI0iI2.I0000Il00O, iOoOloI0iI2.I0000O, iOoOloI0iI2.I00000oIO, IOOi0Ool1i.I00OI1(list, new Io1IilIliiI("charset", strName)));
                            } else if (size != 1) {
/* 245 */                       List<Io1IilIliiI> list2 = list;
/* 249 */                       if (!(list2 instanceof Collection) || !list2.isEmpty()) {
/* 269 */                           for (Io1IilIliiI io1IilIliiI : list2) {
/* 283 */                               if (!OlOolloIIOl0.I000O01llI0(io1IilIliiI.I00000oIO, "charset", true) || !OlOolloIIOl0.I000O01llI0(io1IilIliiI.I00000oOI, strName, true)) {
                                        }
                                    }
/* 336 */                           iOoOloI0iI2 = new IOoOloI0iI(iOoOloI0iI2.I0000Il00O, iOoOloI0iI2.I0000O, iOoOloI0iI2.I00000oIO, IOOi0Ool1i.I00OI1(list, new Io1IilIliiI("charset", strName)));
                                }
                            } else {
/* 298 */                       Io1IilIliiI io1IilIliiI2 = (Io1IilIliiI) list.get(0);
/* 306 */                       if (!OlOolloIIOl0.I000O01llI0(io1IilIliiI2.I00000oIO, "charset", true) || !OlOolloIIOl0.I000O01llI0(io1IilIliiI2.I00000oOI, strName, true)) {
                                }
                            }
/* 340 */                   return new Oloil11oIooi(str2, iOoOloI0iI2);
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    lIoii1l01l0i.I00000oOI(obj);
/* 19 */                    O1o10Iiio o1o10Iiio = (O1o10Iiio) this.I00iiI;
/* 21 */                    o1o10Iiio.I000OOo1O(false);
/* 28 */                    ((I0IlIoI1oi0) this.I00iiO).invoke();
/* 37 */                    OlO0OIIl1 olO0OIIl1 = o1o10Iiio.I0000oI00;
/* 39 */                    Boolean bool = Boolean.TRUE;
/* 41 */                    olO0OIIl1.getClass();
/* 44 */                    olO0OIIl1.I000lI(null, bool);
/* 58 */                    O11il1ilio1o.I000O01llI0(O111ooi11li.I00000oIO, (O1oIOiI11o0) obj3, false, false, O1o0l1li1ii.I00000oIO(), (List) obj2, false, 96);
/* 63 */                    olO0OIIl1.I000lI(null, Boolean.FALSE);
/* 66 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public IoO01oi(String str, Charset charset, IOoil1iiIilo iOoil1iiIilo) {
                    super(3, iOoil1iiIilo);
/* 17 */            this.I00iio = str;
                    this.I00ilI0I1 = charset;
                }
            }
