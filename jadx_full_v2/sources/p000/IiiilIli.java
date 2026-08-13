            package p000;
            
            public final class IiiilIli implements IlOil1iooOO0 {
                public final int I00iOIl;
                public IlOil1iooOO0 I00iiI;
                public OOo0ooi I00iiO;

                public IiiilIli(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
                /* JADX WARN: Type inference failed for: r9v9 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    IiiiIiI iiiiIiI;
                    IlOlO00oioOO ilOlO00oioOO;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 77 */                    OOo0ooi oOo0ooi = this.I00iiO;
/* 81 */                    if (iOoil1iiIilo instanceof IiiiIiI) {
/* 84 */                        iiiiIiI = (IiiiIiI) iOoil1iiIilo;
/* 86 */                        int i2 = iiiiIiI.I00iiO;
/* 90 */                        if ((i2 & Integer.MIN_VALUE) != 0) {
/* 93 */                            iiiiIiI.I00iiO = i2 - Integer.MIN_VALUE;
                                } else {
/* 98 */                            iiiiIiI = new IiiiIiI(this, iOoil1iiIilo);
                                }
                            }
/* 101 */                   Object obj3 = iiiiIiI.I00iOIl;
/* 103 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 105 */                   int i3 = iiiiIiI.I00iiO;
/* 107 */                   if (i3 != 0) {
/* 109 */                       if (i3 == 1) {
/* 111 */                           lIoii1l01l0i.I00000oOI(obj3);
/* 148 */                           return obj2;
                                }
/* 115 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 120 */                   lIoii1l01l0i.I00000oOI(obj3);
/* 123 */                   Object obj4 = oOo0ooi.I00iOIl;
/* 127 */                   if (obj4 != OIOOIO0o.I00000oIO && O0000Ioio00.I0000O(obj4, obj)) {
/* 148 */                       return obj2;
                            }
/* 135 */                   oOo0ooi.I00iOIl = obj;
/* 137 */                   IlOil1iooOO0 ilOil1iooOO0 = this.I00iiI;
/* 139 */                   iiiiIiI.I00iiO = 1;
                            return ilOil1iooOO0.emit(obj, iiiiIiI) == ii0111o ? ii0111o : obj2;
                        default:
/* 16 */                    if (iOoil1iiIilo instanceof IlOlO00oioOO) {
/* 19 */                        ilOlO00oioOO = (IlOlO00oioOO) iOoil1iiIilo;
/* 21 */                        int i4 = ilOlO00oioOO.I00iiO;
/* 25 */                        if ((i4 & Integer.MIN_VALUE) != 0) {
/* 28 */                            ilOlO00oioOO.I00iiO = i4 - Integer.MIN_VALUE;
                                } else {
/* 33 */                            ilOlO00oioOO = new IlOlO00oioOO(this, iOoil1iiIilo);
                                }
                            }
/* 36 */                    Object obj5 = ilOlO00oioOO.I00iOIl;
/* 38 */                    Object obj6 = Ii0111o.I00iOIl;
/* 40 */                    int i5 = ilOlO00oioOO.I00iiO;
                            try {
/* 42 */                        if (i5 == 0) {
/* 57 */                            lIoii1l01l0i.I00000oOI(obj5);
/* 60 */                            IlOil1iooOO0 ilOil1iooOO02 = this.I00iiI;
/* 62 */                            ilOlO00oioOO.I00iiO = 1;
/* 64 */                            Object objEmit = ilOil1iooOO02.emit(obj, ilOlO00oioOO);
                                    this = objEmit;
/* 68 */                            if (objEmit == obj6) {
/* 70 */                                obj2 = obj6;
                                        this = objEmit;
                                    }
                                } else {
/* 44 */                            if (i5 != 1) {
/* 52 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                                 return null;
                                    }
/* 46 */                            lIoii1l01l0i.I00000oOI(obj5);
                                    this = this;
                                }
/* 71 */                        return obj2;
                            } catch (Throwable th) {
/* 74 */                        this.I00iiO.I00iOIl = th;
/* 76 */                        throw th;
                            }
                    }
                }
            }
