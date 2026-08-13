            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class III0Ii {
                public OI110O0 I00000oIO;

                /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0065 -> B:19:0x0068). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(OOo0IO oOo0IO, IOoilo iOoilo) throws Throwable {
                    III01l1l0Ol iII01l1l0Ol;
                    int i;
                    OOo0IO oOo0IO2;
                    int i2;
                    Object[] objArr;
/* 3 */             if (iOoilo instanceof III01l1l0Ol) {
/* 6 */                 iII01l1l0Ol = (III01l1l0Ol) iOoilo;
/* 8 */                 int i3 = iII01l1l0Ol.I00io1l;
/* 14 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 17 */                    iII01l1l0Ol.I00io1l = i3 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iII01l1l0Ol = new III01l1l0Ol(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = iII01l1l0Ol.I00ilI0I1;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i4 = iII01l1l0Ol.I00io1l;
/* 32 */            if (i4 == 0) {
/* 56 */                lIoii1l01l0i.I00000oOI(obj);
/* 59 */                OI110O0 oi110o0 = this.I00000oIO;
/* 61 */                Object[] objArr2 = oi110o0.I00iOIl;
/* 63 */                i = oi110o0.I00iiO;
/* 67 */                oOo0IO2 = oOo0IO;
/* 68 */                i2 = 0;
/* 69 */                objArr = objArr2;
/* 70 */                if (i2 < i) {
                        }
                    } else {
/* 34 */                if (i4 != 1) {
/* 51 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 54 */                    return null;
                        }
/* 36 */                i = iII01l1l0Ol.I00iio;
/* 38 */                i2 = iII01l1l0Ol.I00iiO;
/* 40 */                objArr = iII01l1l0Ol.I00iiI;
/* 42 */                OOo0IO oOo0IO3 = iII01l1l0Ol.I00iOIl;
/* 44 */                lIoii1l01l0i.I00000oOI(obj);
/* 47 */                oOo0IO2 = oOo0IO3;
/* 105 */               i2++;
/* 70 */                if (i2 < i) {
/* 74 */                    III0IoO1OI1o iII0IoO1OI1o = (III0IoO1OI1o) objArr[i2];
/* 80 */                    I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(12);
/* 83 */                    i0OIOO00l0O.I00iiI = oOo0IO2;
/* 85 */                    VarHandle.storeStoreFence();
/* 88 */                    iII01l1l0Ol.I00iOIl = oOo0IO2;
/* 90 */                    iII01l1l0Ol.I00iiI = objArr;
/* 92 */                    iII01l1l0Ol.I00iiO = i2;
/* 94 */                    iII01l1l0Ol.I00iio = i;
/* 96 */                    iII01l1l0Ol.I00io1l = 1;
/* 102 */                   if (iOi10ioilO0.I00000oIO(iII0IoO1OI1o, i0OIOO00l0O, iII01l1l0Ol) == ii0111o) {
/* 104 */                       return ii0111o;
                            }
/* 105 */                   i2++;
/* 70 */                    if (i2 < i) {
/* 107 */                       return OoiIlOl1iI.I00000oIO;
                            }
                        }
                    }
                }
            }
