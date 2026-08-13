            package p000;

            import java.util.ArrayList;
            import java.util.Set;
            
            public final class OoIl01i0Oo implements IlOil1iooOO0 {
                public OOo0ooi I00iOIl;
                public boolean I00iiI;
                public IlOil1iooOO0 I00iiO;
                public String[] I00iio;
                public int[] I00ilI0I1;

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
                
                    if (r1.emit(r13, r3) == r4) goto L37;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
                
                    if (r1.emit(r13, r3) == r4) goto L37;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
                
                    return r4;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(int[] iArr, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    OoIioo0OI011 ooIioo0OI011;
/* 1 */             String[] strArr = this.I00iio;
/* 3 */             IlOil1iooOO0 ilOil1iooOO0 = this.I00iiO;
/* 5 */             OOo0ooi oOo0ooi = this.I00iOIl;
/* 9 */             if (iOoil1iiIilo instanceof OoIioo0OI011) {
/* 12 */                ooIioo0OI011 = (OoIioo0OI011) iOoil1iiIilo;
/* 14 */                int i = ooIioo0OI011.I00iio;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    ooIioo0OI011.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    ooIioo0OI011 = new OoIioo0OI011(this, iOoil1iiIilo);
                        }
                    }
/* 31 */            Object obj = ooIioo0OI011.I00iiI;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i2 = ooIioo0OI011.I00iio;
/* 40 */            if (i2 == 0) {
/* 59 */                lIoii1l01l0i.I00000oOI(obj);
/* 64 */                if (oOo0ooi.I00iOIl != null) {
/* 85 */                    int[] iArr2 = this.I00ilI0I1;
/* 89 */                    ArrayList arrayList = new ArrayList();
/* 92 */                    int length = strArr.length;
/* 93 */                    int i3 = 0;
/* 94 */                    int i4 = 0;
/* 95 */                    while (i3 < length) {
/* 97 */                        String str = strArr[i3];
/* 99 */                        int i5 = i4 + 1;
/* 101 */                       Object obj2 = oOo0ooi.I00iOIl;
/* 103 */                       if (obj2 == null) {
/* 124 */                           I000II.I001IO000("Required value was null.");
/* 37 */                            return null;
                                }
/* 107 */                       int i6 = iArr2[i4];
/* 113 */                       if (((int[]) obj2)[i6] != iArr[i6]) {
/* 115 */                           arrayList.add(str);
                                }
/* 118 */                       i3++;
/* 120 */                       i4 = i5;
                            }
/* 132 */                   if (!arrayList.isEmpty()) {
/* 134 */                       Set setI00iio = IOOi0Ool1i.I00iio(arrayList);
/* 138 */                       ooIioo0OI011.I00iOIl = iArr;
/* 140 */                       ooIioo0OI011.I00iio = 2;
                            }
                        } else if (this.I00iiI) {
/* 70 */                    Set setI00IlilI0i0i = I1IoiO1l.I00IlilI0i0i(strArr);
/* 74 */                    ooIioo0OI011.I00iOIl = iArr;
/* 76 */                    ooIioo0OI011.I00iio = 1;
                        }
                    } else {
/* 42 */                if (i2 != 1 && i2 != 2) {
/* 49 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                    return null;
                        }
/* 53 */                iArr = ooIioo0OI011.I00iOIl;
/* 55 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 149 */           oOo0ooi.I00iOIl = iArr;
/* 151 */           return OoiIlOl1iI.I00000oIO;
                }
            }
