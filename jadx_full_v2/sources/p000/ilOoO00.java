            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class ilOoO00 {
                /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x006d A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(IlOil1ii ilOil1ii, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    IlOo0l1II0 ilOo0l1II0;
                    OOo0ooi oOo0ooi;
                    I00i0ilIl0i e;
                    IlOloII1 ilOloII1;
                    Object obj;
/* 3 */             if (iOoil1iiIilo instanceof IlOo0l1II0) {
/* 6 */                 ilOo0l1II0 = (IlOo0l1II0) iOoil1iiIilo;
/* 8 */                 int i = ilOo0l1II0.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilOo0l1II0.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilOo0l1II0 = new IlOo0l1II0(iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj2 = ilOo0l1II0.I00iiO;
/* 27 */            Object obj3 = Ii0111o.I00iOIl;
/* 29 */            int i2 = ilOo0l1II0.I00iio;
/* 32 */            I0OooiI1I i0OooiI1I = OIOOIO0o.I00000oIO;
/* 35 */            if (i2 == 0) {
/* 55 */                lIoii1l01l0i.I00000oOI(obj2);
/* 60 */                OOo0ooi oOo0ooi2 = new OOo0ooi();
/* 63 */                oOo0ooi2.I00iOIl = i0OooiI1I;
/* 68 */                IlOloII1 ilOloII12 = new IlOloII1(0);
/* 71 */                ilOloII12.I00iiI = oOo0ooi2;
/* 73 */                VarHandle.storeStoreFence();
                        try {
/* 76 */                    ilOo0l1II0.I00iOIl = oOo0ooi2;
/* 78 */                    ilOo0l1II0.I00iiI = ilOloII12;
/* 80 */                    ilOo0l1II0.I00iio = 1;
/* 86 */                    if (ilOil1ii.I00000oIO(ilOloII12, ilOo0l1II0) == obj3) {
/* 88 */                        return obj3;
                            }
/* 89 */                    oOo0ooi = oOo0ooi2;
                        } catch (I00i0ilIl0i e2) {
/* 92 */                    oOo0ooi = oOo0ooi2;
/* 93 */                    e = e2;
/* 94 */                    ilOloII1 = ilOloII12;
/* 97 */                    if (e.I00iOIl == ilOloII1) {
/* 551 */                       throw e;
                            }
/* 103 */                   l01oO1iOo.I0000O(ilOo0l1II0.getContext());
/* 106 */                   obj = oOo0ooi.I00iOIl;
/* 108 */                   if (obj == i0OooiI1I) {
                            }
                        }
                    } else {
/* 37 */                if (i2 != 1) {
/* 51 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 39 */                ilOloII1 = ilOo0l1II0.I00iiI;
/* 41 */                oOo0ooi = ilOo0l1II0.I00iOIl;
                        try {
/* 43 */                    lIoii1l01l0i.I00000oOI(obj2);
                        } catch (I00i0ilIl0i e3) {
/* 47 */                    e = e3;
/* 97 */                    if (e.I00iOIl == ilOloII1) {
                            }
                        }
                    }
/* 106 */           obj = oOo0ooi.I00iOIl;
/* 108 */           if (obj == i0OooiI1I) {
/* 110 */               return obj;
                    }
/* 113 */           OIiilo1Ool0o.I000II("Expected at least one element");
/* 31 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(IlOil1ii ilOil1ii, IlliIl1l11O illiIl1l11O, IOoil1iiIilo iOoil1iiIilo) {
                    IlOo0oll ilOo0oll;
                    OOo0ooi oOo0ooi;
                    I00i0ilIl0i e;
                    IIilO0 iIilO0;
                    Object obj;
/* 3 */             if (iOoil1iiIilo instanceof IlOo0oll) {
/* 6 */                 ilOo0oll = (IlOo0oll) iOoil1iiIilo;
/* 8 */                 int i = ilOo0oll.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilOo0oll.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilOo0oll = new IlOo0oll(iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj2 = ilOo0oll.I00iiO;
/* 27 */            Object obj3 = Ii0111o.I00iOIl;
/* 29 */            int i2 = ilOo0oll.I00iio;
/* 32 */            I0OooiI1I i0OooiI1I = OIOOIO0o.I00000oIO;
/* 35 */            if (i2 == 0) {
/* 55 */                lIoii1l01l0i.I00000oOI(obj2);
/* 60 */                OOo0ooi oOo0ooi2 = new OOo0ooi();
/* 63 */                oOo0ooi2.I00iOIl = i0OooiI1I;
/* 68 */                IIilO0 iIilO02 = new IIilO0(2);
/* 71 */                iIilO02.I00iiI = illiIl1l11O;
/* 73 */                iIilO02.I00iiO = oOo0ooi2;
/* 75 */                VarHandle.storeStoreFence();
                        try {
/* 78 */                    ilOo0oll.I00iOIl = oOo0ooi2;
/* 80 */                    ilOo0oll.I00iiI = iIilO02;
/* 82 */                    ilOo0oll.I00iio = 1;
/* 88 */                    if (ilOil1ii.I00000oIO(iIilO02, ilOo0oll) == obj3) {
/* 90 */                        return obj3;
                            }
/* 91 */                    oOo0ooi = oOo0ooi2;
                        } catch (I00i0ilIl0i e2) {
/* 94 */                    oOo0ooi = oOo0ooi2;
/* 95 */                    e = e2;
/* 96 */                    iIilO0 = iIilO02;
/* 99 */                    if (e.I00iOIl == iIilO0) {
/* 215 */                       throw e;
                            }
/* 105 */                   l01oO1iOo.I0000O(ilOo0oll.getContext());
/* 108 */                   obj = oOo0ooi.I00iOIl;
/* 110 */                   if (obj == i0OooiI1I) {
                            }
                        }
                    } else {
/* 37 */                if (i2 != 1) {
/* 51 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 39 */                iIilO0 = ilOo0oll.I00iiI;
/* 41 */                oOo0ooi = ilOo0oll.I00iOIl;
                        try {
/* 43 */                    lIoii1l01l0i.I00000oOI(obj2);
                        } catch (I00i0ilIl0i e3) {
/* 47 */                    e = e3;
/* 99 */                    if (e.I00iOIl == iIilO0) {
                            }
                        }
                    }
/* 108 */           obj = oOo0ooi.I00iOIl;
/* 110 */           if (obj == i0OooiI1I) {
/* 112 */               return obj;
                    }
/* 115 */           OIiilo1Ool0o.I000II("Expected at least one element matching the predicate");
/* 31 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000Il00O(IlOil1ii ilOil1ii, IOoilo iOoilo) throws Throwable {
                    IlOo1l ilOo1l;
                    OOo0ooi oOo0ooi;
                    I00i0ilIl0i e;
                    IlOloII1 ilOloII1;
/* 3 */             if (iOoilo instanceof IlOo1l) {
/* 6 */                 ilOo1l = (IlOo1l) iOoilo;
/* 8 */                 int i = ilOo1l.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilOo1l.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilOo1l = new IlOo1l(iOoilo);
                        }
                    }
/* 25 */            Object obj = ilOo1l.I00iiO;
/* 27 */            Object obj2 = Ii0111o.I00iOIl;
/* 29 */            int i2 = ilOo1l.I00iio;
/* 31 */            int i3 = 1;
/* 32 */            if (i2 == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(obj);
/* 58 */                OOo0ooi oOo0ooi2 = new OOo0ooi();
/* 63 */                IlOloII1 ilOloII12 = new IlOloII1(i3);
/* 66 */                ilOloII12.I00iiI = oOo0ooi2;
/* 68 */                VarHandle.storeStoreFence();
                        try {
/* 71 */                    ilOo1l.I00iOIl = oOo0ooi2;
/* 73 */                    ilOo1l.I00iiI = ilOloII12;
/* 75 */                    ilOo1l.I00iio = 1;
/* 81 */                    if (ilOil1ii.I00000oIO(ilOloII12, ilOo1l) == obj2) {
/* 83 */                        return obj2;
                            }
/* 84 */                    oOo0ooi = oOo0ooi2;
                        } catch (I00i0ilIl0i e2) {
/* 87 */                    oOo0ooi = oOo0ooi2;
/* 88 */                    e = e2;
/* 89 */                    ilOloII1 = ilOloII12;
/* 92 */                    if (e.I00iOIl == ilOloII1) {
/* 551 */                       throw e;
                            }
/* 98 */                    l01oO1iOo.I0000O(ilOo1l.getContext());
/* 101 */                   return oOo0ooi.I00iOIl;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                    return null;
                        }
/* 36 */                ilOloII1 = ilOo1l.I00iiI;
/* 38 */                oOo0ooi = ilOo1l.I00iOIl;
                        try {
/* 40 */                    lIoii1l01l0i.I00000oOI(obj);
                        } catch (I00i0ilIl0i e3) {
/* 44 */                    e = e3;
/* 92 */                    if (e.I00iOIl == ilOloII1) {
                            }
                        }
                    }
/* 101 */           return oOo0ooi.I00iOIl;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000O(Ii1Io1loiI ii1Io1loiI, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    IlOo1oIo1 ilOo1oIo1;
                    OOo0ooi oOo0ooi;
/* 3 */             if (iOoil1iiIilo instanceof IlOo1oIo1) {
/* 6 */                 ilOo1oIo1 = (IlOo1oIo1) iOoil1iiIilo;
/* 8 */                 int i = ilOo1oIo1.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilOo1oIo1.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilOo1oIo1 = new IlOo1oIo1(iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj = ilOo1oIo1.I00iiI;
/* 27 */            Object obj2 = Ii0111o.I00iOIl;
/* 29 */            int i2 = ilOo1oIo1.I00iiO;
/* 32 */            I0OooiI1I i0OooiI1I = OIOOIO0o.I00000oIO;
/* 35 */            if (i2 == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(obj);
/* 56 */                OOo0ooi oOo0ooi2 = new OOo0ooi();
/* 59 */                oOo0ooi2.I00iOIl = i0OooiI1I;
/* 64 */                IlOloII1 ilOloII1 = new IlOloII1(2);
/* 67 */                ilOloII1.I00iiI = oOo0ooi2;
/* 69 */                VarHandle.storeStoreFence();
/* 72 */                ilOo1oIo1.I00iOIl = oOo0ooi2;
/* 74 */                ilOo1oIo1.I00iiO = 1;
/* 80 */                if (ii1Io1loiI.I00000oIO(ilOloII1, ilOo1oIo1) == obj2) {
/* 82 */                    return obj2;
                        }
/* 83 */                oOo0ooi = oOo0ooi2;
                    } else {
/* 37 */                if (i2 != 1) {
/* 47 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 39 */                oOo0ooi = ilOo1oIo1.I00iOIl;
/* 41 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 84 */            Object obj3 = oOo0ooi.I00iOIl;
/* 86 */            if (obj3 != i0OooiI1I) {
/* 88 */                return obj3;
                    }
/* 91 */            OIiilo1Ool0o.I000II("Flow is empty");
/* 31 */            return null;
                }
            }
