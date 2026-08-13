            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Map;
            
            public final class IollI1O implements O1iOIl0o10 {
                public long I00000oIO;
                public OI10i0Il I00000oOI;

                @Override
                public final O1iOIo0o0 I00000oOI(O1iOIoOiO0 o1iOIoOiO0, List list, long j) {
                    IooOl0ol01 iooOl0ol01;
/* 1 */             OI10i0Il oI10i0Il = this.I00000oOI;
/* 7 */             O1iIo0ll o1iIo0ll = (O1iIo0ll) IOOi0Ool1i.I00Ol00(list);
/* 9 */             Map map = Il011I1OiO0I.I00iOIl;
/* 11 */            if (o1iIo0ll == null) {
/* 103 */               return o1iOIoOiO0.I001i1lo1io(0, 0, map, new IoI0IiI0(14));
                    }
/* 15 */            OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(this.I00000oIO);
/* 23 */            IooOl0ol01 iooOl0ol012 = (IooOl0ol01) oI10i0Il.getValue();
/* 32 */            if (iooOl0ol012 == null || oO1I0001000iI001lllioOl.I00iOIl != ((int) (iooOl0ol012.I00000oIO >> 32)) || (iooOl0ol01 = (IooOl0ol01) oI10i0Il.getValue()) == null || oO1I0001000iI001lllioOl.I00iiI != ((int) (iooOl0ol01.I00000oIO & 4294967295L))) {
/* 72 */                oI10i0Il.setValue(IooOl0ol01.I00000oIO((4294967295L & oO1I0001000iI001lllioOl.I00iiI) | (oO1I0001000iI001lllioOl.I00iOIl << 32)));
                    }
/* 75 */            int i = oO1I0001000iI001lllioOl.I00iOIl;
/* 77 */            int i2 = oO1I0001000iI001lllioOl.I00iiI;
/* 82 */            I0li0o i0li0o = new I0li0o(6);
/* 85 */            i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 87 */            VarHandle.storeStoreFence();
/* 90 */            return o1iOIoOiO0.I001i1lo1io(i, i2, map, i0li0o);
                }
            }
