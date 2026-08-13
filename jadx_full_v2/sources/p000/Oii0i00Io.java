            package p000;

            import java.util.Arrays;
            import kotlin.jvm.functions.Function1;
            
            public final class Oii0i00Io implements Function1 {
                public final int I00iOIl;
                public Oii110oOoO I00iiI;

                public Oii0i00Io(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Oii110oOoO oii110oOoO = this.I00iiI;
/* 9 */             long jLongValue = ((Long) obj).longValue();
                    switch (i) {
                        case 0:
/* 143 */                   oii110oOoO.I00lli11 = jLongValue;
                            break;
                        default:
/* 18 */                    long j = jLongValue - oii110oOoO.I00lli11;
/* 20 */                    oii110oOoO.I00lli11 = jLongValue;
/* 27 */                    long jI000O01llI0 = O1OooO0IlOo.I000O01llI0(j / oii110oOoO.I00o101lO);
/* 31 */                    OI0oiiIO0 oI0oiiIO0 = oii110oOoO.I00lll10;
/* 38 */                    if (oI0oiiIO0.I000OiO()) {
/* 40 */                        Object[] objArr = oI0oiiIO0.I00000oIO;
/* 42 */                        int i2 = oI0oiiIO0.I00000oOI;
/* 44 */                        int i3 = 0;
/* 46 */                        for (int i4 = 0; i4 < i2; i4++) {
/* 50 */                            Oii0iO0iOI oii0iO0iOI = (Oii0iO0iOI) objArr[i4];
/* 52 */                            Oii110oOoO.I010l10O(oii0iO0iOI, jI000O01llI0);
/* 56 */                            oii0iO0iOI.I0000Il00O = true;
                                }
/* 61 */                        OoI1Oi0l1I0o ooI1Oi0l1I0o = oii110oOoO.I00ilI0I1;
/* 63 */                        if (ooI1Oi0l1I0o != null) {
/* 65 */                            ooI1Oi0l1I0o.I0010I0i();
                                }
/* 68 */                        int i5 = oI0oiiIO0.I00000oOI;
/* 70 */                        Object[] objArr2 = oI0oiiIO0.I00000oIO;
/* 72 */                        IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(0, i5);
/* 76 */                        int i6 = iooO11lI000O01llI0.I00iOIl;
/* 78 */                        int i7 = iooO11lI000O01llI0.I00iiI;
/* 80 */                        if (i6 <= i7) {
                                    while (true) {
/* 86 */                                objArr2[i6 - i3] = objArr2[i6];
/* 94 */                                if (((Oii0iO0iOI) objArr2[i6]).I0000Il00O) {
/* 96 */                                    i3++;
                                        }
/* 98 */                                if (i6 != i7) {
/* 100 */                                   i6++;
                                        }
                                    }
                                }
/* 105 */                       Arrays.fill(objArr2, i5 - i3, i5, (Object) null);
                                oI0oiiIO0.I00000oOI -= i3;
                            }
/* 113 */                   Oii0iO0iOI oii0iO0iOI2 = oii110oOoO.I00o0iI0io1;
/* 115 */                   if (oii0iO0iOI2 != null) {
/* 119 */                       oii0iO0iOI2.I000II = oii110oOoO.I00ilO0;
/* 121 */                       Oii110oOoO.I010l10O(oii0iO0iOI2, jI000O01llI0);
/* 126 */                       oii110oOoO.I010o0o0oO(oii0iO0iOI2.I0000O);
/* 135 */                       if (oii0iO0iOI2.I0000O == 1.0f) {
/* 137 */                           oii110oOoO.I00o0iI0io1 = null;
                                }
/* 139 */                       oii110oOoO.I010lI0oi();
                                break;
                            }
                            break;
                    }
/* 142 */           return ooiIlOl1iI;
                }
            }
