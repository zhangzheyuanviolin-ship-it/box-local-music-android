            package p000;

            import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
            import java.util.Iterator;
            import java.util.List;
            
            public final class IO01oI0l101o implements IIooIO0II {
                public static final boolean I0001Ioi1lo;
                public OOiO01IO I00000oIO;
                public OolOi0i I00000oOI;
                public OoI00O0l I0000Il00O;
                public OllO00oiil I0000O;
                public OllO00oiil I0000oI00;

                static {
/* 12 */            I0001Ioi1lo = IiOoli.I00000oIO(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                }

                @Override
                public final IO0011o I00000oIO(int i, int i2, IIlO0II00o iIlO0II00o) {
/* 9 */             return ((IO01o11o0lI0) this.I0000oI00.getValue()).I00000oIO(i, i2, iIlO0II00o);
                }

                @Override
                public final void I00000oOI(int i) {
/* 9 */             ((IO01o11o0lI0) this.I0000oI00.getValue()).I000l1 = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:45:0x00a8 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(List list, int i, IOlOo1ll1l1 iOlOo1ll1l1, int i2, int i3, int i4, IOoilo iOoilo) throws Throwable {
                    IO01o1i1O iO01o1i1O;
                    boolean z;
                    Object objI0000Il00O;
                    boolean z2;
/* 5 */             if (iOoilo instanceof IO01o1i1O) {
/* 8 */                 iO01o1i1O = (IO01o1i1O) iOoilo;
/* 10 */                int i5 = iO01o1i1O.I00iio;
/* 16 */                if ((i5 & Integer.MIN_VALUE) != 0) {
/* 19 */                    iO01o1i1O.I00iio = i5 - Integer.MIN_VALUE;
                        } else {
/* 25 */                    iO01o1i1O = new IO01o1i1O(this, iOoilo);
                        }
                    }
/* 21 */            IO01o1i1O iO01o1i1O2 = iO01o1i1O;
/* 29 */            Object obj = iO01o1i1O2.I00iiI;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i6 = iO01o1i1O2.I00iio;
/* 36 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 38 */            if (i6 == 0) {
/* 55 */                lIoii1l01l0i.I00000oOI(obj);
/* 58 */                if (list == null || !list.isEmpty()) {
/* 67 */                    Iterator it = list.iterator();
                            while (true) {
/* 75 */                        if (!it.hasNext()) {
                                    break;
                                }
/* 81 */                        IIoo00iOol0 iIoo00iOol0 = (IIoo00iOol0) it.next();
/* 91 */                        boolean zBooleanValue = ((Boolean) this.I0000O.getValue()).booleanValue();
/* 95 */                        int i7 = iIoo00iOol0.I0000Il00O;
/* 113 */                       int i8 = (i != 3 || zBooleanValue) ? (i7 == -1 || i7 == 5) ? 2 : -1 : 4;
/* 114 */                       if (i8 != -1) {
/* 116 */                           i7 = i8;
                                }
/* 117 */                       if (i7 == 2) {
/* 127 */                           Integer num = (Integer) this.I0000Il00O.I0000oI00.I0000O();
/* 129 */                           z = num != null && num.intValue() == 1;
                                }
                            }
/* 147 */                   IO01o11o0lI0 iO01o11o0lI0 = (IO01o11o0lI0) this.I0000oI00.getValue();
/* 149 */                   iO01o1i1O2.I00iOIl = z;
/* 151 */                   iO01o1i1O2.I00iio = 1;
/* 163 */                   objI0000Il00O = iO01o11o0lI0.I0000Il00O(list, i, iOlOo1ll1l1, i2, i3, i4, iO01o1i1O2);
/* 167 */                   if (objI0000Il00O != ii0111o) {
/* 169 */                       return ii0111o;
                            }
/* 170 */                   boolean z3 = z;
/* 171 */                   obj = objI0000Il00O;
/* 172 */                   z2 = z3;
                        } else {
/* 147 */                   IO01o11o0lI0 iO01o11o0lI02 = (IO01o11o0lI0) this.I0000oI00.getValue();
/* 149 */                   iO01o1i1O2.I00iOIl = z;
/* 151 */                   iO01o1i1O2.I00iio = 1;
/* 163 */                   objI0000Il00O = iO01o11o0lI02.I0000Il00O(list, i, iOlOo1ll1l1, i2, i3, i4, iO01o1i1O2);
/* 167 */                   if (objI0000Il00O != ii0111o) {
                            }
                        }
                    } else {
/* 40 */                if (i6 != 1) {
/* 51 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 36 */                    return null;
                        }
/* 42 */                z2 = iO01o1i1O2.I00iOIl;
/* 44 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 173 */           List list2 = (List) obj;
/* 175 */           if (z2) {
/* 188 */               iOi1II01i0.I0000O(this.I00000oOI.I0000oI00, null, null, new I00oI0i(list2, this, iOoil1iiIilo, 19), 3);
                    }
/* 965 */           return list2;
                }
            }
