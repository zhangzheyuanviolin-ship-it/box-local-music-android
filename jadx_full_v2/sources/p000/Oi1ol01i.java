            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            
            public final class Oi1ol01i extends O0iiOOl {
                public static final Oi1ol01i I0000Il00O = new Oi1ol01i("Undefined intrinsics block and it is required", 0);
                public final int I00000oOI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oi1ol01i(String str, int i) {
/* 3 */             super(str);
/* 1 */             this.I00000oOI = i;
                }

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
                    switch (this.I00000oOI) {
                        case 0:
/* 14 */                    int size = list.size();
/* 18 */                    Map map = Il011I1OiO0I.I00iOIl;
/* 20 */                    if (size == 0) {
/* 152 */                       return o1iOIoOiO0.I001i1lo1io(IOo0oO11ll1O.I000l1(j), IOo0oO11ll1O.I000iOII(j), map, new OOii01Ioi1(11));
                            }
/* 24 */                    if (size == 1) {
/* 104 */                       OO1I0001000i oO1I0001000iI001lllioOl = ((O1iIo0ll) list.get(0)).I001lllioOl(j);
/* 110 */                       int iI000II = IOo0olo.I000II(oO1I0001000iI001lllioOl.I00iOIl, j);
/* 116 */                       int iI0001Ioi1lo = IOo0olo.I0001Ioi1lo(oO1I0001000iI001lllioOl.I00iiI, j);
/* 124 */                       I0li0o i0li0o = new I0li0o(10);
/* 127 */                       i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 129 */                       VarHandle.storeStoreFence();
/* 132 */                       return o1iOIoOiO0.I001i1lo1io(iI000II, iI0001Ioi1lo, map, i0li0o);
                            }
/* 32 */                    ArrayList arrayList = new ArrayList(list.size());
/* 38 */                    int size2 = list.size();
/* 42 */                    int iMax = 0;
/* 43 */                    int iMax2 = 0;
/* 44 */                    for (int i = 0; i < size2; i++) {
/* 52 */                        OO1I0001000i oO1I0001000iI001lllioOl2 = ((O1iIo0ll) list.get(i)).I001lllioOl(j);
/* 58 */                        iMax = Math.max(oO1I0001000iI001lllioOl2.I00iOIl, iMax);
/* 64 */                        iMax2 = Math.max(oO1I0001000iI001lllioOl2.I00iiI, iMax2);
/* 68 */                        arrayList.add(oO1I0001000iI001lllioOl2);
                            }
/* 74 */                    int iI000II2 = IOo0olo.I000II(iMax, j);
/* 78 */                    int iI0001Ioi1lo2 = IOo0olo.I0001Ioi1lo(iMax2, j);
/* 85 */                    I0o0oO111 i0o0oO111 = new I0o0oO111(4);
/* 88 */                    i0o0oO111.I00iiI = arrayList;
/* 90 */                    VarHandle.storeStoreFence();
/* 93 */                    return o1iOIoOiO0.I001i1lo1io(iI000II2, iI0001Ioi1lo2, map, i0o0oO111);
                        default:
/* 13 */                    throw new IllegalStateException("Undefined measure and it is required");
                    }
                }
            }
