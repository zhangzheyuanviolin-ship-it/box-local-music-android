            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Ol0OoiI1ioO extends I01O1lIi {
                public Object I00iiI;
                public Object I00iiO;
                public OI10IIO I00iio;
                public OI10IIO I00ilI0I1;
                public Oil1IOoo1lI I00ilO0;
                public OIoO1Ol I00io1l;
                public I0IOIlIOIII I00ioIO;

                @Override
                public final void I00o0iI0io1(Oil1IOoo1lI oil1IOoo1lI) {
/* 2 */             this.I00iiO = null;
/* 4 */             this.I00ilI0I1 = null;
                }

                @Override
                public final void I00o0l1o1o0() {
                    synchronized (this.I00iOIl) {
                        try {
/* 6 */                     this.I00iiI = this.I00iiO;
/* 10 */                    if (this.I00ilI0I1 == null) {
/* 13 */                        this.I00iio = null;
                            } else {
/* 18 */                        OI10IIO oi10iio = this.I00iio;
/* 20 */                        if (oi10iio == null) {
/* 22 */                            OI10IIO oi10iio2 = OiO11lliO.I00000oIO;
/* 26 */                            oi10iio = new OI10IIO();
/* 29 */                            this.I00iio = oi10iio;
                                }
/* 33 */                        this.I00iio = this.I00ilI0I1;
/* 35 */                        this.I00ilI0I1 = oi10iio;
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                @Override
                public final void I00o101lO() {
/* 3 */             this.I00ioIO.I000II();
/* 7 */             this.I00iiO = null;
/* 9 */             this.I00ilI0I1 = null;
                    synchronized (this.I00iOIl) {
/* 14 */                this.I00ilO0 = null;
/* 16 */                this.I00iiI = null;
/* 18 */                this.I00iio = null;
                    }
                }

                @Override
                public final Function1 I00oo1iO0ll(Oil1IOoo1lI oil1IOoo1lI) {
/* 1 */             Oil1IOoo1lI oil1IOoo1lI2 = this.I00ilO0;
/* 3 */             if (oil1IOoo1lI2 != null && !oil1IOoo1lI2.equals(oil1IOoo1lI)) {
/* 14 */                OO1oio00IO.I00000oOI("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                    }
/* 17 */            this.I00ilO0 = oil1IOoo1lI;
/* 19 */            return this.I00io1l;
                }

                @Override
                public final void I00ooiO1I(IO1010 io1010) {
/* 2 */             this.I00ilO0 = null;
/* 4 */             this.I00iiO = null;
/* 6 */             this.I00ilI0I1 = null;
/* 8 */             I00o0l1o1o0();
                }
            }
