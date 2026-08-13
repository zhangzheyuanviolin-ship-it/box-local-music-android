            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class Ii1IiO extends Oll0io implements Function1 {
                public Object I00iOIl;
                public Serializable I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Iterator I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;
                public final Ii1OIIlOi I00ioIO;
                public final o01l1ioOo0 I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1IiO(Ii1OIIlOi ii1OIIlOi, o01l1ioOo0 o01l1iooo0, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(1, iOoil1iiIilo);
/* 1 */             this.I00ioIO = ii1OIIlOi;
/* 3 */             this.I00l0I0l0lO1 = o01l1iooo0;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             return new Ii1IiO(this.I00ioIO, this.I00l0I0l0lO1, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj) {
/* 11 */            return ((Ii1IiO) create((IOoil1iiIilo) obj)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OI11ol oI1I0OoOl;
                    OOo0l0ii10l oOo0l0ii10l;
                    OOo0ooi oOo0ooi;
                    OOo0ooi oOo0ooi2;
                    OI11ol oI11ol;
                    Iterator it;
                    OI11ol oI11ol2;
                    OOo0l0ii10l oOo0l0ii10l2;
                    OOo0ooi oOo0ooi3;
                    Ii1Ii1l0OI ii1Ii1l0OI;
                    OOo0ooi oOo0ooi4;
                    OOo0l0ii10l oOo0l0ii10l3;
                    Integer numI00000oIO;
                    Object obj2;
                    int i;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i2 = this.I00io1l;
/* 5 */             o01l1ioOo0 o01l1iooo0 = this.I00l0I0l0lO1;
/* 10 */            Ii1OIIlOi ii1OIIlOi = this.I00ioIO;
/* 14 */            if (i2 == 0) {
/* 98 */                lIoii1l01l0i.I00000oOI(obj);
/* 103 */               oI1I0OoOl = new OI1I0OoOl();
/* 108 */               oOo0l0ii10l = new OOo0l0ii10l();
/* 113 */               oOo0ooi = new OOo0ooi();
/* 116 */               this.I00iOIl = oI1I0OoOl;
/* 118 */               this.I00iiI = oOo0l0ii10l;
/* 120 */               this.I00iiO = oOo0ooi;
/* 122 */               this.I00iio = oOo0ooi;
/* 124 */               this.I00io1l = 1;
/* 126 */               obj = ii1OIIlOi.I000O01llI0(true, this);
/* 130 */               if (obj != ii0111o) {
/* 134 */                   oOo0ooi2 = oOo0ooi;
                        }
/* 267 */               return ii0111o;
                    }
/* 16 */            if (i2 != 1) {
/* 18 */                if (i2 != 2) {
/* 20 */                    if (i2 != 3) {
/* 22 */                        if (i2 != 4) {
/* 35 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 24 */                        i = this.I00ilO0;
/* 26 */                        obj2 = this.I00iOIl;
/* 28 */                        lIoii1l01l0i.I00000oOI(obj);
/* 280 */                       return new Ii11I1iOiIo(obj2, i, ((Number) obj).intValue());
                            }
/* 41 */                    oI11ol = (OI11ol) this.I00iiO;
/* 45 */                    oOo0ooi4 = (OOo0ooi) this.I00iiI;
/* 49 */                    oOo0l0ii10l3 = (OOo0l0ii10l) this.I00iOIl;
/* 51 */                    lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 232 */                       oOo0l0ii10l3.I00iOIl = true;
/* 234 */                       oI11ol.I00000oOI(null);
/* 237 */                       Object obj3 = oOo0ooi4.I00iOIl;
/* 246 */                       int iHashCode = obj3 == null ? obj3.hashCode() : 0;
/* 247 */                       Ol0Oiooo ol0OioooI0000Il00O = ii1OIIlOi.I0000Il00O();
/* 251 */                       this.I00iOIl = obj3;
/* 253 */                       this.I00iiI = null;
/* 255 */                       this.I00iiO = null;
/* 257 */                       this.I00ilO0 = iHashCode;
/* 259 */                       this.I00io1l = 4;
/* 261 */                       numI00000oIO = ol0OioooI0000Il00O.I00000oIO();
/* 265 */                       if (numI00000oIO != ii0111o) {
/* 269 */                           obj = numI00000oIO;
/* 270 */                           obj2 = obj3;
/* 271 */                           i = iHashCode;
/* 280 */                           return new Ii11I1iOiIo(obj2, i, ((Number) obj).intValue());
                                }
/* 267 */                       return ii0111o;
                            } catch (Throwable th) {
/* 285 */                       oI11ol.I00000oOI(null);
/* 437 */                       throw th;
                            }
                        }
/* 56 */                it = this.I00ilI0I1;
/* 60 */                ii1Ii1l0OI = (Ii1Ii1l0OI) this.I00iio;
/* 64 */                oOo0ooi3 = (OOo0ooi) this.I00iiO;
/* 68 */                oOo0l0ii10l2 = (OOo0l0ii10l) this.I00iiI;
/* 72 */                oI11ol2 = (OI11ol) this.I00iOIl;
/* 74 */                lIoii1l01l0i.I00000oOI(obj);
/* 177 */               while (it.hasNext()) {
/* 183 */                   IlliIl1l11O illiIl1l11O = (IlliIl1l11O) it.next();
/* 185 */                   this.I00iOIl = oI11ol2;
/* 187 */                   this.I00iiI = oOo0l0ii10l2;
/* 189 */                   this.I00iiO = oOo0ooi3;
/* 191 */                   this.I00iio = ii1Ii1l0OI;
/* 193 */                   this.I00ilI0I1 = it;
/* 195 */                   this.I00io1l = 2;
/* 201 */                   if (illiIl1l11O.invoke(ii1Ii1l0OI, this) == ii0111o) {
                                break;
                            }
                        }
/* 204 */               oOo0ooi2 = oOo0ooi3;
/* 205 */               oOo0l0ii10l = oOo0l0ii10l2;
/* 206 */               oI11ol = oI11ol2;
/* 209 */               o01l1iooo0.I00iiO = null;
/* 211 */               this.I00iOIl = oOo0l0ii10l;
/* 213 */               this.I00iiI = oOo0ooi2;
/* 215 */               this.I00iiO = oI11ol;
/* 217 */               this.I00iio = null;
/* 219 */               this.I00ilI0I1 = null;
/* 221 */               this.I00io1l = 3;
/* 227 */               if (oI11ol.I00000oIO(this) != ii0111o) {
/* 230 */                   oOo0ooi4 = oOo0ooi2;
/* 231 */                   oOo0l0ii10l3 = oOo0l0ii10l;
/* 232 */                   oOo0l0ii10l3.I00iOIl = true;
/* 234 */                   oI11ol.I00000oOI(null);
/* 237 */                   Object obj32 = oOo0ooi4.I00iOIl;
/* 246 */                   if (obj32 == null) {
                            }
/* 247 */                   Ol0Oiooo ol0OioooI0000Il00O2 = ii1OIIlOi.I0000Il00O();
/* 251 */                   this.I00iOIl = obj32;
/* 253 */                   this.I00iiI = null;
/* 255 */                   this.I00iiO = null;
/* 257 */                   this.I00ilO0 = iHashCode;
/* 259 */                   this.I00io1l = 4;
/* 261 */                   numI00000oIO = ol0OioooI0000Il00O2.I00000oIO();
/* 265 */                   if (numI00000oIO != ii0111o) {
                            }
                        }
/* 267 */               return ii0111o;
                    }
/* 80 */            oOo0ooi = (OOo0ooi) this.I00iio;
/* 84 */            oOo0ooi2 = (OOo0ooi) this.I00iiO;
/* 88 */            oOo0l0ii10l = (OOo0l0ii10l) this.I00iiI;
/* 92 */            oI1I0OoOl = (OI11ol) this.I00iOIl;
/* 94 */            lIoii1l01l0i.I00000oOI(obj);
/* 139 */           oOo0ooi.I00iOIl = ((Ii11I1iOiIo) obj).I00000oOI;
/* 143 */           Ii1Ii1l0OI ii1Ii1l0OI2 = new Ii1Ii1l0OI();
/* 146 */           ii1Ii1l0OI2.I00000oIO = oI1I0OoOl;
/* 148 */           ii1Ii1l0OI2.I00000oOI = oOo0l0ii10l;
/* 150 */           ii1Ii1l0OI2.I0000Il00O = oOo0ooi2;
/* 152 */           ii1Ii1l0OI2.I0000O = ii1OIIlOi;
/* 154 */           VarHandle.storeStoreFence();
/* 159 */           List list = (List) o01l1iooo0.I00iiO;
/* 161 */           if (list == null) {
/* 208 */               oI11ol = oI1I0OoOl;
/* 209 */               o01l1iooo0.I00iiO = null;
/* 211 */               this.I00iOIl = oOo0l0ii10l;
/* 213 */               this.I00iiI = oOo0ooi2;
/* 215 */               this.I00iiO = oI11ol;
/* 217 */               this.I00iio = null;
/* 219 */               this.I00ilI0I1 = null;
/* 221 */               this.I00io1l = 3;
/* 227 */               if (oI11ol.I00000oIO(this) != ii0111o) {
                        }
/* 267 */               return ii0111o;
                    }
/* 165 */           it = list.iterator();
/* 169 */           oI11ol2 = oI1I0OoOl;
/* 170 */           oOo0l0ii10l2 = oOo0l0ii10l;
/* 171 */           oOo0ooi3 = oOo0ooi2;
/* 172 */           ii1Ii1l0OI = ii1Ii1l0OI2;
/* 177 */           while (it.hasNext()) {
                    }
/* 204 */           oOo0ooi2 = oOo0ooi3;
/* 205 */           oOo0l0ii10l = oOo0l0ii10l2;
/* 206 */           oI11ol = oI11ol2;
/* 209 */           o01l1iooo0.I00iiO = null;
/* 211 */           this.I00iOIl = oOo0l0ii10l;
/* 213 */           this.I00iiI = oOo0ooi2;
/* 215 */           this.I00iiO = oI11ol;
/* 217 */           this.I00iio = null;
/* 219 */           this.I00ilI0I1 = null;
/* 221 */           this.I00io1l = 3;
/* 227 */           if (oI11ol.I00000oIO(this) != ii0111o) {
                    }
/* 267 */           return ii0111o;
                }
            }
