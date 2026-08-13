            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            
            public abstract class lil10110OI {
                public static iO0iIIoO11 I00000oIO(i1ollIol0I0 i1olliol0i0, OillOo0 oillOo0, ArrayList arrayList, boolean z) {
                    iO0iIIoO11 io0iiioo11I00000oIO;
/* 4 */             ll00I0ii.I00000oOI("reduce", 1, arrayList);
/* 8 */             ll00I0ii.I0000Il00O("reduce", 2, arrayList);
/* 22 */            iO0iIIoO11 io0iiioo11I000OiO = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(0));
/* 29 */            if (!(io0iiioo11I000OiO instanceof iIIoIiOoOoiO)) {
/* 163 */               I000II.I000iOII("Callback should be a method");
/* 28 */                return null;
                    }
/* 35 */            if (arrayList.size() == 2) {
/* 47 */                io0iiioo11I00000oIO = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) arrayList.get(1));
/* 53 */                if (io0iiioo11I00000oIO instanceof iI1II1oO) {
/* 58 */                    I000II.I000iOII("Failed to parse initial value");
/* 28 */                    return null;
                        }
                    } else {
/* 66 */                if (i1olliol0i0.I000lI() == 0) {
/* 157 */                   I000II.I001IO000("Empty array with no initial value error");
/* 28 */                    return null;
                        }
/* 68 */                io0iiioo11I00000oIO = null;
                    }
/* 69 */            iIIoIiOoOoiO iiioiiooooio = (iIIoIiOoOoiO) io0iiioo11I000OiO;
/* 71 */            int iI000lI = i1olliol0i0.I000lI();
/* 79 */            int i = z ? 0 : iI000lI - 1;
/* 86 */            int i2 = z ? iI000lI - 1 : 0;
/* 87 */            int i3 = true == z ? 1 : -1;
/* 91 */            if (io0iiioo11I00000oIO == null) {
/* 93 */                io0iiioo11I00000oIO = i1olliol0i0.I000o00OoI0I(i);
/* 97 */                i += i3;
                    }
/* 101 */           while ((i2 - i) * i3 >= 0) {
/* 107 */               if (i1olliol0i0.I00100o1O0lo(i)) {
/* 139 */                   io0iiioo11I00000oIO = iiioiiooooio.I00000oIO(oillOo0, Arrays.asList(io0iiioo11I00000oIO, i1olliol0i0.I000o00OoI0I(i), new iII01l(Double.valueOf(i)), i1olliol0i0));
/* 145 */                   if (io0iiioo11I00000oIO instanceof iI1II1oO) {
/* 150 */                       I000II.I001IO000("Reduce operation failed");
/* 28 */                        return null;
                            }
/* 97 */                    i += i3;
                        } else {
/* 97 */                    i += i3;
                        }
                    }
/* 154 */           return io0iiioo11I00000oIO;
                }

                public static i1ollIol0I0 I00000oOI(i1ollIol0I0 i1olliol0i0, OillOo0 oillOo0, iIolollI1 iiololli1, Boolean bool, Boolean bool2) {
/* 3 */             i1ollIol0I0 i1olliol0i02 = new i1ollIol0I0();
/* 6 */             Iterator itI000iOII = i1olliol0i0.I000iOII();
/* 14 */            while (itI000iOII.hasNext()) {
/* 22 */                int iIntValue = ((Integer) itI000iOII.next()).intValue();
/* 30 */                if (i1olliol0i0.I00100o1O0lo(iIntValue)) {
/* 62 */                    iO0iIIoO11 io0iiioo11I00000oIO = iiololli1.I00000oIO(oillOo0, Arrays.asList(i1olliol0i0.I000o00OoI0I(iIntValue), new iII01l(Double.valueOf(iIntValue)), i1olliol0i0));
/* 74 */                    if (io0iiioo11I00000oIO.zze().equals(bool)) {
                                break;
                            }
/* 77 */                    if (bool2 == null || io0iiioo11I00000oIO.zze().equals(bool2)) {
/* 89 */                        i1olliol0i02.I000oI1ioi(iIntValue, io0iiioo11I00000oIO);
                            }
                        }
                    }
/* 399 */           return i1olliol0i02;
                }
            }
