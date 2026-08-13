            package p000;

            import androidx.window.extensions.layout.WindowLayoutComponent;
            import java.lang.invoke.VarHandle;
            import java.util.BitSet;
            import java.util.Collections;
            import java.util.Iterator;
            
            public final class OlOiIoII implements IllOOo00lI {
                public final int I00iOIl;

                public OlOiIoII(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() throws ClassNotFoundException {
                    OiIiIIOOiO oiIiIIOOiO;
                    WindowLayoutComponent windowLayoutComponentI00000oIO;
/* 3 */             int i = this.I00iOIl;
/* 7 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 378 */                   return ooiIlOl1iI;
                        case 1:
/* 373 */                   return Iil1010O.I00000oIO(0.0f);
                        case 2:
/* 232 */                   String str = "";
                            try {
/* 236 */                       Class<?> cls = Class.forName("android.os.SystemProperties");
/* 262 */                       str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.backported_fixes.alias_bitset.long_list", "");
                            } catch (Exception unused) {
                            }
/* 265 */                   O101lO1 o101lO1I0000oI00 = IOOi1I.I0000oI00();
/* 280 */                   Iterator it = OlOoOIi0o.I00Io1o110i(str, new char[]{','}).iterator();
/* 288 */                   while (it.hasNext()) {
                                try {
/* 304 */                           o101lO1I0000oI00.add(Long.valueOf(Long.parseLong((String) it.next())));
                                } catch (NumberFormatException unused2) {
                                }
                            }
/* 316 */                   BitSet bitSetValueOf = BitSet.valueOf(IOOi0Ool1i.I00iOIl(IOOi1I.I0000Il00O(o101lO1I0000oI00)));
/* 320 */                   int size = bitSetValueOf.size();
/* 324 */                   if (size == 0) {
/* 326 */                       return Il01llIol0.I00iOIl;
                            }
/* 336 */                   Oilolol11I oilolol11I = new Oilolol11I(new O1OOII(size));
/* 339 */                   for (int iNextSetBit = 0; iNextSetBit >= 0; iNextSetBit = bitSetValueOf.nextSetBit(iNextSetBit + 1)) {
/* 345 */                       if (bitSetValueOf.get(iNextSetBit)) {
/* 351 */                           oilolol11I.add(Integer.valueOf(iNextSetBit));
                                }
/* 357 */                       if (iNextSetBit == Integer.MAX_VALUE) {
/* 367 */                           return Oio0lI.I00000oIO(oilolol11I);
                                }
                            }
/* 367 */                   return Oio0lI.I00000oIO(oilolol11I);
                        case 3:
/* 227 */                   return IOoOoo0.Companion.serializer();
                        case 4:
                        case 5:
/* 10 */                    return null;
                        case 6:
/* 221 */                   return OoOoOiI.I00000oIO;
                        case 7:
/* 216 */                   return IooO0O.I00000oIO(0L);
                        case 8:
/* 211 */                   return IooO0O.I00000oIO(0L);
                        case 9:
/* 208 */                   return IiIII1IOO.I00000oIO;
                        case 10:
/* 143 */                   long j = IOOiio0i.I000lI;
/* 153 */                   O0oo1oi0oil o0oo1oi0oilI000lI = i1O10l1io1iO.I000lI(Collections.singletonList(IOOiio0i.I00000oIO(j)));
/* 165 */                   O0oo1oi0oil o0oo1oi0oilI000lI2 = i1O10l1io1iO.I000lI(Collections.singletonList(IOOiio0i.I00000oIO(j)));
/* 169 */                   Il01100l il01100l = Il01100l.I00iOIl;
/* 204 */                   return new Ii0iOlI(il01100l, j, j, il01100l, il01100l, il01100l, j, il01100l, j, j, j, j, j, j, j, j, j, j, j, j, j, j, o0oo1oi0oilI000lI, o0oo1oi0oilI000lI2);
                        case 11:
/* 137 */                   return new I1Ilill(IoOloI1Ilo.I00000oIO);
                        case 12:
/* 129 */                   return new I1Ilill(OlOlllO.I00000oIO);
                        case 13:
/* 124 */                   return ooiIlOl1iI;
                        case 14:
/* 121 */                   return Boolean.TRUE;
                        case 15:
/* 117 */                   return new OoOo1o00Oi00();
                        case 16:
/* 114 */                   return ooiIlOl1iI;
                        default:
                            try {
/* 16 */                        ClassLoader classLoader = i00Io1IOlo0.class.getClassLoader();
/* 20 */                        if (classLoader != null) {
/* 26 */                            IOoI0IIOlolO iOoI0IIOlolO = new IOoI0IIOlolO(classLoader);
/* 29 */                            oiIiIIOOiO = new OiIiIIOOiO();
/* 32 */                            oiIiIIOOiO.I00000oIO = classLoader;
/* 34 */                            oiIiIIOOiO.I00000oOI = iOoI0IIOlolO;
/* 38 */                            OOoOIoio1i oOoOIoio1i = new OOoOIoio1i();
/* 41 */                            oOoOIoio1i.I00000oIO = classLoader;
/* 43 */                            VarHandle.storeStoreFence();
/* 46 */                            oiIiIIOOiO.I0000Il00O = oOoOIoio1i;
/* 48 */                            VarHandle.storeStoreFence();
                                } else {
/* 52 */                            oiIiIIOOiO = null;
                                }
/* 53 */                        if (oiIiIIOOiO == null || (windowLayoutComponentI00000oIO = oiIiIIOOiO.I00000oIO()) == null) {
/* 10 */                            return null;
                                }
/* 63 */                        IOoI0IIOlolO iOoI0IIOlolO2 = new IOoI0IIOlolO(classLoader);
/* 66 */                        int iI00000oIO = Il1oii1olOoi.I00000oIO();
/* 109 */                       return iI00000oIO >= 9 ? new Il1oi001O1(windowLayoutComponentI00000oIO, iOoI0IIOlolO2) : iI00000oIO >= 6 ? new Il1oOOiIIIO(windowLayoutComponentI00000oIO, iOoI0IIOlolO2) : iI00000oIO >= 2 ? new Il1oO0oii(windowLayoutComponentI00000oIO, iOoI0IIOlolO2) : iI00000oIO == 1 ? new Il1oIo00(windowLayoutComponentI00000oIO, iOoI0IIOlolO2) : new Il1oI1Oo0O();
                            } catch (Throwable unused3) {
/* 10 */                        return null;
                            }
                    }
                }
            }
