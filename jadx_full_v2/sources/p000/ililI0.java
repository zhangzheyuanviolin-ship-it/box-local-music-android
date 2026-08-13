            package p000;

            import java.util.List;
            
            public abstract class ililI0 {
                public static final boolean I00000oIO(Oll11lOlo oll11lOlo) {
/* 5 */             List list = oll11lOlo.I00ilO0.I00oII.I00000oIO;
/* 10 */            int size = list.size();
/* 14 */            boolean z = false;
/* 15 */            int i = 0;
                    while (true) {
/* 17 */                if (i >= size) {
                            break;
                        }
/* 27 */                if (((OO1il00lI) list.get(i)).I0000O) {
/* 29 */                    z = true;
                            break;
                        }
/* 31 */                i++;
                    }
/* 34 */            return !z;
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
                
                    if (I00000oIO(r7) == false) goto L16;
                 */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(Oll11lOlo oll11lOlo, OO1i0l oO1i0l, I1oI1lil i1oI1lil) throws Throwable {
                    IliliIi10o1O ililiIi10o1O;
/* 3 */             if (i1oI1lil instanceof IliliIi10o1O) {
/* 6 */                 ililiIi10o1O = (IliliIi10o1O) i1oI1lil;
/* 8 */                 int i = ililiIi10o1O.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ililiIi10o1O.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ililiIi10o1O = new IliliIi10o1O(i1oI1lil);
                        }
                    }
/* 25 */            Object objI00000oOI = ililiIi10o1O.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ililiIi10o1O.I00iio;
/* 32 */            if (i2 != 0) {
/* 34 */                if (i2 != 1) {
/* 49 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 52 */                    return null;
                        }
/* 36 */                OO1i0l oO1i0l2 = ililiIi10o1O.I00iiI;
/* 38 */                Oll11lOlo oll11lOlo2 = ililiIi10o1O.I00iOIl;
/* 40 */                lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 44 */                oO1i0l = oO1i0l2;
/* 45 */                oll11lOlo = oll11lOlo2;
/* 78 */                List list = ((OO1Oooio101) objI00000oOI).I00000oIO;
/* 83 */                int size = list.size();
/* 87 */                int i3 = 0;
/* 88 */                while (i3 < size) {
/* 98 */                    if (((OO1il00lI) list.get(i3)).I0000O) {
/* 63 */                        ililiIi10o1O.I00iOIl = oll11lOlo;
/* 65 */                        ililiIi10o1O.I00iiI = oO1i0l;
/* 67 */                        ililiIi10o1O.I00iio = 1;
/* 69 */                        objI00000oOI = oll11lOlo.I00000oOI(oO1i0l, ililiIi10o1O);
/* 73 */                        if (objI00000oOI == ii0111o) {
/* 75 */                            return ii0111o;
                                }
/* 78 */                        List list2 = ((OO1Oooio101) objI00000oOI).I00000oIO;
/* 83 */                        int size2 = list2.size();
/* 87 */                        int i32 = 0;
/* 88 */                        while (i32 < size2) {
                                }
                            } else {
/* 101 */                       i32++;
                            }
                        }
/* 104 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 54 */            lIoii1l01l0i.I00000oOI(objI00000oOI);
                }

                public static final Object I0000Il00O(OO1io0l0 oO1io0l0, IlliIl1l11O illiIl1l11O, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            Object objI010l1O = ((Oll1OII0o) oO1io0l0).I010l1O(new Il1ii1000(iOoil1iiIilo.getContext(), illiIl1l11O, null, 1), iOoil1iiIilo);
                    return objI010l1O == Ii0111o.I00iOIl ? objI010l1O : OoiIlOl1iI.I00000oIO;
                }
            }
