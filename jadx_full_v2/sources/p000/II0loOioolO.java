            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
            public final class II0loOioolO {
                public IoiOloi I00000oIO;
                public OIil0IlIIol I00000oOI;
                public Oil0oOll1 I0000Il00O;
                public Il1O00 I0000O;

                /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
                
                    r6.I000OiO(r7, r11.I00000oOI);
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoilo iOoilo) {
                    II0lo1l1 iI0lo1l1;
                    Oil0oOll1 oil0oOll1;
                    int andDecrement;
                    Throwable th;
                    Oil0oOll1 oil0oOll12;
/* 3 */             if (iOoilo instanceof II0lo1l1) {
/* 6 */                 iI0lo1l1 = (II0lo1l1) iOoilo;
/* 8 */                 int i = iI0lo1l1.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iI0lo1l1.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iI0lo1l1 = new II0lo1l1(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = iI0lo1l1.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iI0lo1l1.I00ilI0I1;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 32 */            int i3 = 2;
                    try {
/* 34 */                if (i2 == 0) {
/* 70 */                    lIoii1l01l0i.I00000oOI(obj);
/* 73 */                    oil0oOll1 = this.I0000Il00O;
/* 75 */                    iI0lo1l1.I00iOIl = this;
/* 77 */                    iI0lo1l1.I00iiI = oil0oOll1;
/* 79 */                    iI0lo1l1.I00ilI0I1 = 1;
/* 81 */                    int i4 = oil0oOll1.I00000oIO;
/* 83 */                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Oil0ll.I0000oI00;
/* 89 */                    do {
/* 85 */                        andDecrement = atomicIntegerFieldUpdater.getAndDecrement(oil0oOll1);
/* 89 */                    } while (andDecrement > i4);
/* 91 */                    Object obj2 = OoiIlOl1iI.I00000oIO;
/* 93 */                    if (andDecrement <= 0) {
/* 100 */                       IIoOoIol0Io0 iIoOoIol0Io0I00000oOI = iOl0iOoIl.I00000oOI(l00iIoI.I0000Il00O(iI0lo1l1));
                                try {
/* 108 */                           if (!oil0oOll1.I0000O(iIoOoIol0Io0I00000oOI)) {
                                        while (true) {
/* 110 */                                   int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(oil0oOll1);
/* 114 */                                   if (andDecrement2 <= i4) {
/* 116 */                                       if (andDecrement2 > 0) {
                                                    break;
                                                }
/* 128 */                                       if (oil0oOll1.I0000O(iIoOoIol0Io0I00000oOI)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
/* 130 */                           Object objI0010I0i = iIoOoIol0Io0I00000oOI.I0010I0i();
/* 134 */                           Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 136 */                           if (objI0010I0i != ii0111o2) {
/* 139 */                               objI0010I0i = obj2;
                                    }
/* 140 */                           if (objI0010I0i == ii0111o2) {
/* 142 */                               obj2 = objI0010I0i;
                                    }
                                } catch (Throwable th2) {
/* 193 */                           iIoOoIol0Io0I00000oOI.I001lIiIIo1O();
/* 437 */                           throw th2;
                                }
                            }
/* 143 */                   if (obj2 != ii0111o) {
                            }
/* 172 */                   return ii0111o;
                        }
/* 36 */                if (i2 != 1) {
/* 38 */                    if (i2 != 2) {
/* 54 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 42 */                    oil0oOll12 = (Oil0oOll1) iI0lo1l1.I00iOIl;
                            try {
/* 44 */                        lIoii1l01l0i.I00000oOI(obj);
/* 176 */                       Ii1iIolil1 ii1iIolil1 = (Ii1iIolil1) obj;
/* 178 */                       oil0oOll12.I0000oI00();
/* 181 */                       return ii1iIolil1;
                            } catch (Throwable th3) {
/* 49 */                        th = th3;
/* 188 */                       oil0oOll12.I0000oI00();
/* 191 */                       throw th;
                            }
                        }
/* 58 */                Oil0oOll1 oil0oOll13 = iI0lo1l1.I00iiI;
/* 62 */                II0loOioolO iI0loOioolO = (II0loOioolO) iI0lo1l1.I00iOIl;
/* 64 */                lIoii1l01l0i.I00000oOI(obj);
/* 67 */                oil0oOll1 = oil0oOll13;
/* 68 */                this = iI0loOioolO;
/* 148 */               I10oIiiliil i10oIiiliil = new I10oIiiliil(this, i3);
/* 151 */               iI0lo1l1.I00iOIl = oil0oOll1;
/* 153 */               iI0lo1l1.I00iiI = null;
/* 155 */               iI0lo1l1.I00ilI0I1 = 2;
/* 166 */               Object objI0000oI00 = iOi1II01i0.I0000oI00(Il00o11.I00iOIl, new I1iIil1I(i10oIiiliil, iOoil1iiIilo, 29), iI0lo1l1);
/* 170 */               if (objI0000oI00 != ii0111o) {
/* 173 */                   Oil0oOll1 oil0oOll14 = oil0oOll1;
/* 174 */                   obj = objI0000oI00;
/* 175 */                   oil0oOll12 = oil0oOll14;
/* 176 */                   Ii1iIolil1 ii1iIolil12 = (Ii1iIolil1) obj;
/* 178 */                   oil0oOll12.I0000oI00();
/* 181 */                   return ii1iIolil12;
                        }
/* 172 */               return ii0111o;
                    } catch (Throwable th4) {
/* 182 */               Oil0oOll1 oil0oOll15 = oil0oOll1;
/* 183 */               th = th4;
/* 184 */               oil0oOll12 = oil0oOll15;
/* 188 */               oil0oOll12.I0000oI00();
/* 191 */               throw th;
                    }
                }
            }
