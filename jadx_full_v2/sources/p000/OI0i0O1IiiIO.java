            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class OI0i0O1IiiIO extends I01O1lIi {
                public OI10I1IoI0Ol I00iiI;
                public ArrayList I00iiO;
                public OI10I1IoI0Ol I00iio;
                public I0IOIlIOIII I00ilI0I1;

                @Override
                public final void I00o0iI0io1(Oil1IOoo1lI oil1IOoo1lI) {
/* 1 */             ArrayList arrayList = this.I00iiO;
/* 5 */             OI0Oo0loOo oI0Oo0loOo = new OI0Oo0loOo();
/* 8 */             oI0Oo0loOo.I00000oIO = oil1IOoo1lI;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            arrayList.add(oI0Oo0loOo);
                }

                @Override
                public final void I00o0l1o1o0() {
                    synchronized (this.I00iOIl) {
                        try {
/* 4 */                     ArrayList arrayList = this.I00iiO;
/* 6 */                     int size = arrayList.size();
/* 11 */                    for (int i = 0; i < size; i++) {
/* 17 */                        OI0i0Il0 oI0i0Il0 = (OI0i0Il0) arrayList.get(i);
/* 21 */                        if (oI0i0Il0 instanceof OI0Olo) {
/* 34 */                            lO0oOIoolo.I00000oIO(this.I00iiI, ((OI0Olo) oI0i0Il0).I00000oIO, ((OI0Olo) oI0i0Il0).I00000oOI);
                                } else {
/* 42 */                            if (!(oI0i0Il0 instanceof OI0Oo0loOo)) {
/* 62 */                                throw new IOiIIo1l(6);
                                    }
/* 50 */                            lO0oOIoolo.I0000O(this.I00iiI, ((OI0Oo0loOo) oI0i0Il0).I00000oIO);
                                }
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
/* 66 */            this.I00iiO.clear();
                }

                @Override
                public final void I00o101lO() {
/* 3 */             this.I00ilI0I1.I000II();
/* 8 */             this.I00iiO.clear();
/* 13 */            this.I00iio.I00000oIO();
                    synchronized (this.I00iOIl) {
/* 21 */                this.I00iiI.I00000oIO();
                    }
                }

                @Override
                public final Function1 I00oo1iO0ll(Oil1IOoo1lI oil1IOoo1lI) {
/* 1 */             OI10I1IoI0Ol oI10I1IoI0Ol = this.I00iio;
/* 7 */             Function1 function1 = (Function1) oI10I1IoI0Ol.I000II(oil1IOoo1lI);
                    Function1 function12 = function1;
/* 9 */             if (function1 == null) {
/* 14 */                O1lIIi o1lIIi = new O1lIIi(7);
/* 17 */                o1lIIi.I00iiI = this;
/* 19 */                o1lIIi.I00iiO = oil1IOoo1lI;
/* 21 */                VarHandle.storeStoreFence();
/* 24 */                int iI0001Ioi1lo = oI10I1IoI0Ol.I0001Ioi1lo(oil1IOoo1lI);
/* 28 */                if (iI0001Ioi1lo < 0) {
/* 30 */                    iI0001Ioi1lo = ~iI0001Ioi1lo;
                        }
/* 31 */                Object[] objArr = oI10I1IoI0Ol.I0000Il00O;
/* 33 */                Object obj = objArr[iI0001Ioi1lo];
/* 37 */                oI10I1IoI0Ol.I00000oOI[iI0001Ioi1lo] = oil1IOoo1lI;
/* 39 */                objArr[iI0001Ioi1lo] = o1lIIi;
                        function12 = o1lIIi;
                    }
/* 77 */            return function12;
                }

                @Override
                public final void I00ooiO1I(IO1010 io1010) {
/* 3 */             this.I00iio.I000iOII(io1010);
/* 6 */             I00o0iI0io1(io1010);
/* 9 */             I00o0l1o1o0();
                }

                public final void I010OIo1l(Oil1IOoo1lI oil1IOoo1lI, Object obj) {
/* 1 */             ArrayList arrayList = this.I00iiO;
/* 5 */             OI0Olo oI0Olo = new OI0Olo();
/* 8 */             oI0Olo.I00000oIO = obj;
/* 10 */            oI0Olo.I00000oOI = oil1IOoo1lI;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            arrayList.add(oI0Olo);
                }
            }
