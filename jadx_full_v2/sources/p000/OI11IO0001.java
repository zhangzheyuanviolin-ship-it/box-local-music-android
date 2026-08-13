            package p000;
            
            public final class OI11IO0001 extends Oll0io implements IlliIl1l11O {
                public OI11ol I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public OI11IlOoi I00iio;
                public int I00ilI0I1;
                public Object I00ilO0;
                public final OI110lo I00io1l;
                public final OI11IlOoi I00ioIO;
                public final IlliIl1l11O I00l0I0l0lO1;
                public final Object I00l0OO0IO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OI11IO0001(OI110lo oI110lo, OI11IlOoi oI11IlOoi, IlliIl1l11O illiIl1l11O, Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00io1l = oI110lo;
/* 3 */             this.I00ioIO = oI11IlOoi;
/* 5 */             this.I00l0I0l0lO1 = illiIl1l11O;
/* 7 */             this.I00l0OO0IO = obj;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            OI11IO0001 oi11io0001 = new OI11IO0001(this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, iOoil1iiIilo);
/* 15 */            oi11io0001.I00ilO0 = obj;
/* 37 */            return oi11io0001;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OI11IO0001) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [OI11ol, int] */
                /* JADX WARN: Type inference failed for: r6v2, types: [OI11ol] */
                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OI111O oi111o;
                    OI11IlOoi oI11IlOoi;
                    OI1I0OoOl oI1I0OoOl;
                    IlliIl1l11O illiIl1l11O;
                    Object obj2;
                    OI11IlOoi oI11IlOoi2;
                    Throwable th;
                    OI111O oi111o2;
                    OI11ol oI11ol;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             ?? r1 = this.I00ilI0I1;
                    try {
                        try {
/* 8 */                     if (r1 == 0) {
/* 61 */                        lIoii1l01l0i.I00000oOI(obj);
/* 84 */                        oi111o = new OI111O(this.I00io1l, (O010OIi) ((Ii0110) this.I00ilO0).I00000oIO().I00lli11(Iioi0lilII.I00iio));
/* 87 */                        oI11IlOoi = this.I00ioIO;
/* 89 */                        oI11IlOoi.I00000oIO(oi111o);
/* 92 */                        oI1I0OoOl = oI11IlOoi.I00000oOI;
/* 94 */                        this.I00ilO0 = oi111o;
/* 96 */                        this.I00iOIl = oI1I0OoOl;
/* 98 */                        illiIl1l11O = this.I00l0I0l0lO1;
/* 100 */                       this.I00iiI = illiIl1l11O;
/* 102 */                       Object obj3 = this.I00l0OO0IO;
/* 104 */                       this.I00iiO = obj3;
/* 106 */                       this.I00iio = oI11IlOoi;
/* 108 */                       this.I00ilI0I1 = 1;
/* 114 */                       if (oI1I0OoOl.I00000oIO(this) != ii0111o) {
/* 117 */                           obj2 = obj3;
                                }
/* 136 */                       return ii0111o;
                            }
/* 10 */                    if (r1 != 1) {
/* 12 */                        if (r1 != 2) {
/* 34 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                             return null;
                                }
/* 16 */                        oI11IlOoi2 = (OI11IlOoi) this.I00iiI;
/* 18 */                        oI11ol = this.I00iOIl;
/* 22 */                        oi111o2 = (OI111O) this.I00ilO0;
                                try {
/* 24 */                            lIoii1l01l0i.I00000oOI(obj);
/* 143 */                           oI11IlOoi2.I00000oIO.compareAndSet(oi111o2, null);
/* 146 */                           oI11ol.I00000oOI(null);
/* 149 */                           return obj;
                                } catch (Throwable th2) {
/* 29 */                            th = th2;
/* 159 */                           oI11IlOoi2.I00000oIO.compareAndSet(oi111o2, null);
/* 162 */                           throw th;
                                }
                            }
/* 38 */                    OI11IlOoi oI11IlOoi3 = this.I00iio;
/* 40 */                    obj2 = this.I00iiO;
/* 44 */                    IlliIl1l11O illiIl1l11O2 = (IlliIl1l11O) this.I00iiI;
/* 46 */                    ?? r6 = this.I00iOIl;
/* 50 */                    OI111O oi111o3 = (OI111O) this.I00ilO0;
/* 52 */                    lIoii1l01l0i.I00000oOI(obj);
/* 56 */                    illiIl1l11O = illiIl1l11O2;
/* 57 */                    oI1I0OoOl = r6;
/* 58 */                    oI11IlOoi = oI11IlOoi3;
/* 59 */                    oi111o = oi111o3;
/* 118 */                   this.I00ilO0 = oi111o;
/* 120 */                   this.I00iOIl = oI1I0OoOl;
/* 122 */                   this.I00iiI = oI11IlOoi;
/* 124 */                   this.I00iiO = null;
/* 126 */                   this.I00iio = null;
/* 128 */                   this.I00ilI0I1 = 2;
/* 130 */                   Object objInvoke = illiIl1l11O.invoke(obj2, this);
/* 134 */                   if (objInvoke != ii0111o) {
/* 137 */                       oI11IlOoi2 = oI11IlOoi;
/* 138 */                       obj = objInvoke;
/* 139 */                       oi111o2 = oi111o;
/* 140 */                       oI11ol = oI1I0OoOl;
/* 143 */                       oI11IlOoi2.I00000oIO.compareAndSet(oi111o2, null);
/* 146 */                       oI11ol.I00000oOI(null);
/* 149 */                       return obj;
                            }
/* 136 */                   return ii0111o;
                        } catch (Throwable th3) {
/* 153 */                   oI11IlOoi2 = oI11IlOoi;
/* 154 */                   th = th3;
/* 155 */                   oi111o2 = oi111o;
/* 159 */                   oI11IlOoi2.I00000oIO.compareAndSet(oi111o2, null);
/* 162 */                   throw th;
                        }
                    } catch (Throwable th4) {
/* 163 */               r1.I00000oOI(null);
/* 168 */               throw th4;
                    }
                }
            }
