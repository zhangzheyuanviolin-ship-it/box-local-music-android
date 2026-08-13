            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class Oiii0i1Oil1 implements Function1 {
                public final int I00iOIl;
                public Oiill0lI1il1 I00iiI;

                public Oiii0i1Oil1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    OiiOOli oiiOOli;
                    OiiOOli oiiOOli2;
                    OiiOlI0I oiiOlI0II000OOo1O;
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 28;
/* 6 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             Oiill0lI1il1 oiill0lI1il1 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 362 */                   I0IOIo0 i0IOIo0 = new I0IOIo0(i2);
/* 365 */                   i0IOIo0.I00000oOI = oiill0lI1il1;
/* 367 */                   VarHandle.storeStoreFence();
                            break;
                        case 1:
/* 349 */                   if (oiill0lI1il1.I00iOIl.I00000oIO().I00000oOI(((Long) obj).longValue())) {
/* 351 */                       oiill0lI1il1.I000l1();
/* 354 */                       oiill0lI1il1.I000oI1ioi(null);
                                break;
                            }
                            break;
                        case 2:
/* 258 */                   long jLongValue = ((Long) obj).longValue();
/* 262 */                   OiiOlI0I oiiOlI0II000OOo1O2 = oiill0lI1il1.I000OOo1O();
/* 266 */                   if (oiiOlI0II000OOo1O2 != null && (oiiOOli2 = oiiOlI0II000OOo1O2.I00000oIO) != null && jLongValue == oiiOOli2.I0000Il00O) {
/* 280 */                       oiill0lI1il1.I00lll10.setValue(null);
                            }
/* 283 */                   OiiOlI0I oiiOlI0II000OOo1O3 = oiill0lI1il1.I000OOo1O();
/* 287 */                   if (oiiOlI0II000OOo1O3 != null && (oiiOOli = oiiOlI0II000OOo1O3.I00000oOI) != null && jLongValue == oiiOOli.I0000Il00O) {
/* 301 */                       oiill0lI1il1.I00o0iI0io1.setValue(null);
                            }
/* 314 */                   if (oiill0lI1il1.I00iOIl.I00000oIO().I00000oOI(jLongValue)) {
/* 316 */                       oiill0lI1il1.I00111O();
                            }
/* 325 */                   O0ll1IIi o0ll1IIi = (O0ll1IIi) oiill0lI1il1.I00oOio10iI1.I000II(jLongValue);
/* 327 */                   if (o0ll1IIi != null) {
/* 329 */                       o0ll1IIi.I00000oOI();
                                break;
                            }
                            break;
                        case 3:
/* 225 */                   O0iOOo0Ii o0iOOo0Ii = (O0iOOo0Ii) obj;
/* 233 */                   OOo0IO oOo0IO = (OOo0IO) oiill0lI1il1.I00l0OO0IO.getValue();
/* 235 */                   if (oOo0IO != null) {
/* 238 */                       O0iOOo0Ii o0iOOo0Ii2 = oiill0lI1il1.I00ll1;
/* 240 */                       if (o0iOOo0Ii2 == null) {
/* 249 */                           Ioll0IliO1l.I0000O("Required value was null.");
/* 252 */                           IOOlIIilOl0.I0000Il00O();
                                    break;
                                } else {
                                    break;
                                }
                            }
                            break;
                        case 4:
/* 96 */                    O0iOOo0Ii o0iOOo0Ii3 = (O0iOOo0Ii) obj;
/* 98 */                    Oiio1oll000 oiio1oll000 = oiill0lI1il1.I00iOIl;
/* 100 */                   oiill0lI1il1.I00ll1 = o0iOOo0Ii3;
/* 102 */                   if (o0iOOo0Ii3 != null && o0iOOo0Ii3.I0010o() && (oiiOlI0II000OOo1O = oiill0lI1il1.I000OOo1O()) != null && oiio1oll000.I00000oIO().I0000oI00 == 0) {
/* 128 */                       ArrayList arrayListI0000oI00 = oiio1oll000.I0000oI00(oiill0lI1il1.I000lI());
/* 136 */                       if (!arrayListI0000oI00.isEmpty()) {
/* 141 */                           OiIoloo oiIoloo = new OiIoloo(i2);
/* 148 */                           OiO01i oiO01i = new OiO01i(8);
/* 154 */                           OI0OlOl oI0OlOl = new OI0OlOl(1);
/* 157 */                           oI0OlOl.I00iiI = oiiOlI0II000OOo1O;
/* 159 */                           VarHandle.storeStoreFence();
/* 168 */                           oiio1oll000.I000iOII.setValue(lO1OIiO0i.I00000oIO(oiiOlI0II000OOo1O, arrayListI0000oI00, oiIoloo, oiO01i, oI0OlOl));
                                }
/* 173 */                       Ili1lII.I00000oIO(oiill0lI1il1.I00ioIO);
                            }
/* 188 */                   if (((Boolean) oiill0lI1il1.I00l0I0l0lO1.getValue()).booleanValue() && oiill0lI1il1.I000OOo1O() != null) {
/* 204 */                       OIOlIiiioi oIOlIiiioiI00000oIO = o0iOOo0Ii3 != null ? OIOlIiiioi.I00000oIO(o0iOOo0Ii3.I0000O(0L)) : null;
/* 214 */                       if (!O0000Ioio00.I0000O(oiill0lI1il1.I00li1OI, oIOlIiiioiI00000oIO)) {
/* 216 */                           oiill0lI1il1.I00li1OI = oIOlIiiioiI00000oIO;
/* 218 */                           oiill0lI1il1.I0010I0i();
/* 221 */                           oiill0lI1il1.I00111O();
                                    break;
                                }
                            }
                            break;
                        case 5:
/* 59 */                    OIooliIO0 oIooliIO0 = oiill0lI1il1.I00l0I0l0lO1;
/* 61 */                    IliI0101O0Oi iliI0101O0Oi = (IliI0101O0Oi) obj;
/* 67 */                    if (!iliI0101O0Oi.I00000oIO() && ((Boolean) oIooliIO0.getValue()).booleanValue()) {
/* 81 */                        oiill0lI1il1.I000l1();
                            }
/* 92 */                    oIooliIO0.setValue(Boolean.valueOf(iliI0101O0Oi.I00000oIO()));
                            break;
                        case 6:
/* 55 */                    oiill0lI1il1.I000o00OoI0I(((Boolean) obj).booleanValue());
                            break;
                        case 7:
/* 45 */                    oiill0lI1il1.I000oI1ioi((OiiOlI0I) obj);
                            break;
                        default:
/* 29 */                    if (oiill0lI1il1.I00iOIl.I00000oIO().I00000oOI(((Long) obj).longValue())) {
/* 33 */                        oiill0lI1il1.I00lli11.setValue(ooiIlOl1iI);
/* 36 */                        oiill0lI1il1.I0010I0i();
/* 39 */                        oiill0lI1il1.I00111O();
                                break;
                            }
                            break;
                    }
/* 42 */            return ooiIlOl1iI;
                }
            }
