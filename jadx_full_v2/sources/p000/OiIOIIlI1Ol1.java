            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import kotlin.jvm.functions.Function3;
            
            public final class OiIOIIlI1Ol1 extends Oll0io implements Function3 {
                public IoO10oI0o I00iOIl;
                public OIio0oloI1I I00iiI;
                public final IOIooi0ol1i I00iiO;
                public final long I00iio;
                public final OiIIlI00l I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OiIOIIlI1Ol1(IOIooi0ol1i iOIooi0ol1i, long j, OiIIlI00l oiIIlI00l, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00iiO = iOIooi0ol1i;
/* 3 */             this.I00iio = j;
/* 5 */             this.I00ilI0I1 = oiIIlI00l;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 10 */            long j = this.I00iio;
/* 12 */            OiIIlI00l oiIIlI00l = this.I00ilI0I1;
/* 16 */            OiIOIIlI1Ol1 oiIOIIlI1Ol1 = new OiIOIIlI1Ol1(this.I00iiO, j, oiIIlI00l, (IOoil1iiIilo) obj3);
/* 19 */            oiIOIIlI1Ol1.I00iOIl = (IoO10oI0o) obj;
/* 21 */            oiIOIIlI1Ol1.I00iiI = (OIio0oloI1I) obj2;
/* 25 */            return oiIOIIlI1Ol1.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             IoO10oI0o ioO10oI0o = this.I00iOIl;
/* 3 */             OIio0oloI1I oIio0oloI1I = this.I00iiI;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             lIoii1l01l0i.I00000oOI(obj);
/* 10 */            I1OoollI1Il1 i1OoollI1Il1 = IIIO11i.I00000oIO;
/* 12 */            O1I1OOiol o1I1OOiol = OiIOOIOIo.I00000oIO;
/* 14 */            IOlOl10 iOlOl10 = ioO10oI0o.I0001Ioi1lo;
/* 26 */            if (!O0000Ioio00.I0000O(iOlOl10.I0000O(i1OoollI1Il1), Boolean.TRUE)) {
/* 28 */                return oIio0oloI1I;
                    }
/* 29 */            O1I1OOiol o1I1OOiol2 = OiIOOIOIo.I00000oIO;
/* 35 */            if (o1I1OOiol2.I000II()) {
/* 53 */                o1I1OOiol2.I000o00OoI0I("Sending SSE request to " + ioO10oI0o.I00000oIO);
                    }
/* 77 */            ((Map) ioO10oI0o.I0001Ioi1lo.I00000oIO(IoIloO1OOO.I00000oIO, new Iloi111(9))).put(OiIIlIl00I.I00000oIO, OoiIlOl1iI.I00000oIO);
/* 86 */            Iio1OlIo0 iio1OlIo0 = (Iio1OlIo0) iOlOl10.I0000O(IIIO11i.I00000oOI);
/* 94 */            Boolean bool = (Boolean) iOlOl10.I0000O(IIIO11i.I0000Il00O);
/* 102 */           Boolean bool2 = (Boolean) iOlOl10.I0000O(IIIO11i.I0000O);
/* 110 */           OiIIlI00l oiIIlI00l = (OiIIlI00l) iOlOl10.I0000O(IIIO11i.I0001Ioi1lo);
/* 119 */           iOlOl10.I0000oI00(IoO110.I00000oIO, new OiIO00I());
/* 128 */           iOlOl10.I0000oI00(OiIOOIOIo.I0000Il00O, this.I00iiO.I00000oIO);
/* 131 */           IOoOloI0iI iOoOloI0iII00000oOI = oIio0oloI1I.I00000oOI();
/* 135 */           if (iOoOloI0iII00000oOI != null) {
/* 137 */               Io1O0I1i io1O0I1i = ioO10oI0o.I0000Il00O;
/* 139 */               String string = iOoOloI0iII00000oOI.toString();
/* 143 */               io1O0I1i.I010I0(string);
/* 148 */               List listI00oI0i = io1O0I1i.I00oI0i("Content-Type");
/* 152 */               listI00oI0i.clear();
/* 155 */               listI00oI0i.add(string);
                    }
/* 165 */           long j = iio1OlIo0 != null ? iio1OlIo0.I00iOIl : this.I00iio;
/* 175 */           boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
/* 183 */           boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
/* 184 */           if (oiIIlI00l == null) {
/* 186 */               oiIIlI00l = this.I00ilI0I1;
                    }
/* 188 */           Ii00l101O context = getContext();
/* 192 */           OiIIoIIIii oiIIoIIIii = new OiIIoIIIii();
/* 195 */           oiIIoIIIii.I00000oIO = oIio0oloI1I;
/* 197 */           oiIIoIIIii.I00000oOI = j;
/* 199 */           oiIIoIIIii.I0000Il00O = zBooleanValue;
/* 201 */           oiIIoIIIii.I0000O = zBooleanValue2;
/* 203 */           oiIIoIIIii.I0000oI00 = oiIIlI00l;
/* 205 */           oiIIoIIIii.I0001Ioi1lo = context;
/* 207 */           oiIIoIIIii.I000II = ioO10oI0o;
/* 211 */           Io1O0I1i io1O0I1i2 = new Io1O0I1i(0);
/* 218 */           io1O0I1i2.I00lli11(oIio0oloI1I.I0000Il00O());
/* 221 */           IOoOloI0iI iOoOloI0iI = IOoOiii0.I00000oOI;
/* 223 */           Set set = Io1IlIO0.I00000oIO;
/* 231 */           io1O0I1i2.I00ll1("Accept", iOoOloI0iI.toString());
/* 238 */           io1O0I1i2.I00ll1("Cache-Control", "no-store");
/* 251 */           oiIIoIIIii.I000O01llI0 = new Io1OIO1((Map) io1O0I1i2.I00iOIl, true);
/* 253 */           VarHandle.storeStoreFence();
/* 966 */           return oiIIoIIIii;
                }
            }
