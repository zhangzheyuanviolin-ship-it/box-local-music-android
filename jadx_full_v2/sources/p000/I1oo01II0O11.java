            package p000;

            import android.content.Context;
            import androidx.work.impl.background.systemalarm.RescheduleReceiver;
            
/* 11 */    public final class I1oo01II0O11 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public boolean I00iiI;
                public final Object I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1oo01II0O11(IOoil1iiIilo iOoil1iiIilo, Ool1i0ll ool1i0ll, boolean z) {
/* 9 */             super(2, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 3;
/* 4 */             this.I00iiO = ool1i0ll;
/* 6 */             this.I00iiI = z;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 50 */                    I1oo01II0O11 i1oo01II0O11 = new I1oo01II0O11((Oo1o1iil) obj2, iOoil1iiIilo, 0);
/* 59 */                    i1oo01II0O11.I00iiI = ((Boolean) obj).booleanValue();
/* 61 */                    return i1oo01II0O11;
                        case 1:
/* 41 */                    return new I1oo01II0O11((Ol0o1OiOIIIl) obj2, this.I00iiI, iOoil1iiIilo);
                        case 2:
/* 23 */                    I1oo01II0O11 i1oo01II0O112 = new I1oo01II0O11((Context) obj2, iOoil1iiIilo, 2);
/* 32 */                    i1oo01II0O112.I00iiI = ((Boolean) obj).booleanValue();
/* 34 */                    return i1oo01II0O112;
                        default:
/* 14 */                    return new I1oo01II0O11(iOoil1iiIilo, (Ool1i0ll) obj2, this.I00iiI);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 53 */                    Boolean bool = (Boolean) obj;
/* 55 */                    bool.booleanValue();
/* 66 */                    ((I1oo01II0O11) create(bool, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 49 */                    ((I1oo01II0O11) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 2:
/* 22 */                    Boolean bool2 = (Boolean) obj;
/* 24 */                    bool2.booleanValue();
/* 35 */                    ((I1oo01II0O11) create(bool2, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((I1oo01II0O11) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    switch (this.I00iOIl) {
                        case 0:
/* 104 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 106 */                   lIoii1l01l0i.I00000oOI(obj);
/* 111 */                   if (!this.I00iiI) {
/* 117 */                       ((Oo1o1iil) this.I00iiO).I00000oIO();
                            }
/* 120 */                   return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 75 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 77 */                    lIoii1l01l0i.I00000oOI(obj);
/* 84 */                    Ii1liIllli0 ii1liIllli0 = ((Ol0o1OiOIIIl) this.I00iiO).I00000oOI;
/* 86 */                    boolean z = this.I00iiI;
/* 88 */                    ii1liIllli0.getClass();
/* 98 */                    iOi1IOoIO0l.I00000oOI(new Ii1lOoO0o1(ii1liIllli0, z, null, 0));
/* 101 */                   return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 56 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 58 */                    lIoii1l01l0i.I00000oOI(obj);
/* 69 */                    OIo0ol1il0l.I00000oIO((Context) this.I00iiO, RescheduleReceiver.class, this.I00iiI);
/* 72 */                    return OoiIlOl1iI.I00000oIO;
                        default:
/* 6 */                     Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 8 */                     lIoii1l01l0i.I00000oOI(obj);
/* 21 */                    if (((Ool1i0ll) this.I00iiO).I000O01llI0.I00000oOI()) {
/* 26 */                        l11I11lO.I0000O(3, "CXCP");
                            } else {
/* 36 */                        IIll0oO iIll0oOI00000oIO = ((Ool1i0ll) this.I00iiO).I00000oIO.I00000oIO();
/* 40 */                        boolean z2 = this.I00iiI;
/* 42 */                        IIioIlI0 iIioIlI0 = iIll0oOI00000oIO.I00ilI0I1;
                                synchronized (iIioIlI0.I000oI1ioi) {
/* 47 */                            iIioIlI0.I00100l0 = z2;
                                }
                            }
/* 50 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public I1oo01II0O11(Ol0o1OiOIIIl ol0o1OiOIIIl, boolean z, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
                    this.I00iOIl = 1;
/* 13 */            this.I00iiO = ol0o1OiOIIIl;
                    this.I00iiI = z;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public I1oo01II0O11(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 14 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                }
            }
