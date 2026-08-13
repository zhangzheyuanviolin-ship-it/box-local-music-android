            package p000;

            import com.google.android.gms.oss.licenses.v2.OssLicensesMenuActivity;
            import java.lang.invoke.VarHandle;
            import java.net.HttpURLConnection;
            import kotlin.jvm.functions.Function1;
            
            public final class iI1I1I implements IlliIl1l11O {
                public final int I00iOIl;
                public Object I00iiI;
                public boolean I00iiO;

                public iI1I1I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             int i = this.I00iOIl;
/* 7 */             int i2 = 0;
/* 8 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 150 */                   int iIntValue = ((Integer) obj2).intValue();
/* 154 */                   int i3 = iIntValue & 3;
/* 156 */                   int i4 = iIntValue & 1;
/* 159 */                   IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 161 */                   int i5 = OssLicensesMenuActivity.I00oo1iO0ll;
/* 172 */                   if (!iloI0lOlll1.I00OIl(i4, i3 != 2)) {
/* 269 */                       iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 182 */                       long j = ((IOOl011) iloI0lOlll1.I000iOII(iOolIooliO.I00000oIO)).I000o00OoI0I;
/* 188 */                       O1ooiI111i o1ooiI111iI00000oIO = iO11ilOI.I00000oIO(Ol0iOOO0.I0000Il00O, "LicenseTheme");
/* 192 */                       boolean zI0001Ioi1lo = iloI0lOlll1.I0001Ioi1lo(j);
/* 196 */                       Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 200 */                       if (!zI0001Ioi1lo) {
                                    Object obj3 = objI00O0i0ii;
/* 204 */                           if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 208 */                               i1oli1 i1oli1Var = new i1oli1();
/* 211 */                               i1oli1Var.I00iOIl = j;
/* 213 */                               VarHandle.storeStoreFence();
/* 216 */                               iloI0lOlll1.I00iio(i1oli1Var);
                                        obj3 = i1oli1Var;
                                    }
/* 219 */                           boolean z = this.I00iiO;
/* 223 */                           String str = (String) this.I00iiI;
/* 227 */                           O1ooiI111i o1ooiI111iI00000oOI = OiioloIlOlIi.I00000oOI(o1ooiI111iI00000oIO, false, (Function1) obj3);
/* 233 */                           iI1I1I ii1i1i = new iI1I1I(z ? 1 : 0);
/* 236 */                           ii1i1i.I00iiI = str;
/* 238 */                           ii1i1i.I00iiO = z;
/* 240 */                           VarHandle.storeStoreFence();
/* 263 */                           OlioioOl0O.I00000oIO(o1ooiI111iI00000oOI, null, j, 0L, 0.0f, 0.0f, null, iiioOl1O.I00000oOI(-382829429, ii1i1i, iloI0lOlll1), iloI0lOlll1, 12582912, 122);
                                    break;
                                }
                            }
                        case 1:
/* 108 */                   int iIntValue2 = ((Integer) obj2).intValue();
/* 112 */                   int i6 = iIntValue2 & 3;
/* 114 */                   int i7 = iIntValue2 & 1;
/* 117 */                   IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj;
/* 119 */                   int i8 = OssLicensesMenuActivity.I00oo1iO0ll;
/* 129 */                   if (!iloI0lOlll12.I00OIl(i7, i6 != 2)) {
/* 142 */                       iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 138 */                       liio0IiIIil.I00000oIO(null, (String) this.I00iiI, this.I00iiO, iloI0lOlll12, 0);
                                break;
                            }
                        case 2:
/* 46 */                    int iIntValue3 = ((Integer) obj2).intValue();
/* 50 */                    int i9 = iIntValue3 & 3;
/* 52 */                    int i10 = iIntValue3 & 1;
/* 55 */                    IloI0lOlll1 iloI0lOlll13 = (IloI0lOlll1) obj;
/* 57 */                    int i11 = OssLicensesMenuActivity.I00oo1iO0ll;
/* 67 */                    if (!iloI0lOlll13.I00OIl(i10, i9 != 2)) {
/* 100 */                       iloI0lOlll13.I00OilO00Il();
                                break;
                            } else {
/* 69 */                        boolean z2 = this.I00iiO;
/* 73 */                        String str2 = (String) this.I00iiI;
/* 77 */                        iI1I1I ii1i1i2 = new iI1I1I(i2);
/* 80 */                        ii1i1i2.I00iiI = str2;
/* 82 */                        ii1i1i2.I00iiO = z2;
/* 84 */                        VarHandle.storeStoreFence();
/* 96 */                        iOolIooliO.I00000oIO(false, false, iiioOl1O.I00000oOI(-1968053328, ii1i1i2, iloI0lOlll13), iloI0lOlll13, 384);
                                break;
                            }
                        default:
/* 15 */                    String str3 = (String) obj;
/* 19 */                    String str4 = (String) obj2;
/* 23 */                    if (!this.I00iiO || !str3.equals("Content-Length")) {
/* 38 */                        ((HttpURLConnection) this.I00iiI).addRequestProperty(str3, str4);
                                break;
                            }
                            break;
                    }
/* 41 */            return ooiIlOl1iI;
                }
            }
